package ttc2021.iworkflows

import java.io.BufferedReader
import java.io.FileInputStream
import java.io.InputStreamReader
import java.util.List
import java.util.Map
import jobCollection.IncubateJob
import jobCollection.Job
import jobCollection.JobCollection
import jobCollection.JobCollectionPackage
import jobCollection.LiquidTransferJob
import jobCollection.Microplate
import jobCollection.TipLiquidTransfer
import jobCollection.Trough
import jobCollection.TubeRunner
import jobCollection.WashJob
import laboratoryAutomation.AddReagent
import laboratoryAutomation.DistributeSample
import laboratoryAutomation.Incubate
import laboratoryAutomation.JobRequest
import laboratoryAutomation.LaboratoryAutomationFactory
import laboratoryAutomation.LaboratoryAutomationPackage
import laboratoryAutomation.ProtocolStep
import laboratoryAutomation.Reagent
import laboratoryAutomation.Sample
import laboratoryAutomation.SampleState
import laboratoryAutomation.Wash
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtend.lib.annotations.Accessors
import yamtl.core.YAMTLModule
import yamtl.incremental.ChangeDescriptionAnalysisUtil.YAMTLChangeType

import static yamtl.dsl.Rule.*
import static yamtl.dsl.Helper.*

class Solution_iWorkflows extends YAMTLModule  {
	@Accessors
	val LAB = LaboratoryAutomationPackage.eINSTANCE 
	val LAB_factory = LaboratoryAutomationFactory.eINSTANCE 
	@Accessors
	val JOB = JobCollectionPackage.eINSTANCE
	
	val TUBE_RUNNER_CAPACITY = 16
	val MICROPLATE_CAPACITY = 96
	
	new() {
		header().in('lab',LAB).out('job', JOB)
		ruleStore(#[
										
rule('jobRequest_->_jobCollection')
	.in('in_jobRequest', LAB.jobRequest)
	.out('out_jobCollection', JOB.jobCollection),

rule('jobRequest_->_tubeRunner').priority(0).toMany
	.in('jobRequest', LAB.jobRequest).filter [
		val jobRequest = 'jobRequest'.fetch() as JobRequest
		val count = 'matchCount'.fetch() as Integer
		
		count <= jobRequest.samples.size / TUBE_RUNNER_CAPACITY
	]
	.out('tubeRunner', JOB.tubeRunner)[
		val in_jobRequest = 'jobRequest'.fetch() as JobRequest
		val out_tubeRunner = 'tubeRunner'.fetch() as TubeRunner
		val out_jobCollection = in_jobRequest.fetch('out_jobCollection', 'jobRequest_->_jobCollection') as JobCollection
		
		var tubeRunner_list = out_jobCollection.labware.filter[ it instanceof TubeRunner ]
		out_tubeRunner.name = String.format('''TubeRunner%02d''', tubeRunner_list.size)
		out_jobCollection.labware.add(out_tubeRunner)
	],
	

rule('jobRequest_->_microplate').priority(0).toMany
	.in('jobRequest', LAB.jobRequest).filter [
		val jobRequest = 'jobRequest'.fetch() as JobRequest
		val count = 'matchCount'.fetch() as Integer
		
		count <= jobRequest.samples.size / MICROPLATE_CAPACITY
	]
	.out('microplate', JOB.microplate)[
		val in_jobRequest = 'jobRequest'.fetch() as JobRequest
		val out_microplate = 'microplate'.fetch() as Microplate
		val out_jobCollection = in_jobRequest.fetch('out_jobCollection', 'jobRequest_->_jobCollection') as JobCollection
		
		var microplate_list = out_jobCollection.labware.filter[ it instanceof Microplate]
		out_microplate.name = String.format('''Plate%02d''', microplate_list.size+1)
		out_jobCollection.labware.add(out_microplate)
	],
	

rule('sample_->_allocation').priority(0).transient
	.in('in_sample', LAB.sample).filter [
		val in_sample = 'in_sample'.fetch as Sample
		in_sample.state == SampleState.WAITING
	]
	.out('out_aux', JOB.jobCollection)[
				
		val in_sample = 'in_sample'.fetch as Sample
		val in_jobRequest = in_sample.eContainer as JobRequest
		
		val tubeRunnerNumber = getTubeRunner_number(in_jobRequest, in_sample)
		val tubeRunner = in_jobRequest.fetch('tubeRunner', 'jobRequest_->_tubeRunner', tubeRunnerNumber) as TubeRunner
		tubeRunner.barcodes += in_sample.sampleID
		
		val microplateNumber = getMicroplate_number(in_jobRequest, in_sample) 
		val microplateCavity = getMicroplate_cavity(in_jobRequest, in_sample)
		val microplate = in_jobRequest.fetch('microplate', 'jobRequest_->_microplate', microplateNumber) as Microplate
		
		// to facilitate backward propagation, which is external to YAMTL
		// track how to retrieve sample from its cavity on a microplate
		backward_insert(microplate.name, microplateCavity, in_sample)
		
	].undo[
		val in_sample = 'in_sample'.fetch as Sample
		val in_jobRequest = in_sample.eContainer as JobRequest
		val microplateNumber = getMicroplate_number(in_jobRequest, in_sample)
		val microplateCavity = getMicroplate_cavity(in_jobRequest, in_sample)
		val microplate = in_jobRequest.fetch('microplate', 'jobRequest_->_microplate', microplateNumber) as Microplate
		backward_microplate_cavity_to_sample.get(microplate.name).remove(microplateCavity)
	],

rule('reagent_->_trough')
	.in('in_reagent', LAB.reagent)
	.out('out_trough', JOB.trough) [
		val in_reagent = 'in_reagent'.fetch as Reagent
		val out_trough = 'out_trough'.fetch as Trough
		
		val in_jobRequest = in_reagent.eContainer.eContainer as JobRequest
		val out_jobCollection = in_jobRequest.fetch('out_jobCollection', 'jobRequest_->_jobCollection') as JobCollection
		
		out_trough.name = in_reagent.name
		out_jobCollection.labware.add(out_trough)
	],




rule('tipCreation')
	.in('in_sample', LAB.sample).filter[
		val in_sample = 'in_sample'.fetch() as Sample
		in_sample.state != SampleState.ERROR 
	]
	.in('in_step', LAB.protocolStep).filter[
		val in_step = 'in_step'.fetch() as ProtocolStep
		(in_step instanceof DistributeSample || in_step instanceof AddReagent)
	]
	.out('out_tip', JOB.tipLiquidTransfer) [
		val in_sample = 'in_sample'.fetch() as Sample
			
		val in_step = 'in_step'.fetch() as ProtocolStep
		val out_tip = 'out_tip'.fetch() as TipLiquidTransfer
		
		val in_jobRequest = in_step.eContainer.eContainer as JobRequest
		val matchCount = getLiquidTransferJobMatchCount(in_step, in_sample)
		val out_job = in_step.fetch('out_job', 'job', matchCount) as LiquidTransferJob

		switch(in_step) {
			DistributeSample: {
				out_tip.volume = in_step.volume
				// SOURCE
				out_job.source = in_jobRequest.getTubeRunner(in_sample)
				out_tip.sourceCavityIndex = in_jobRequest.getTubeRunner_cavity(in_sample)
			}
			AddReagent: {
				out_tip.volume = in_step.volume
				// SOURCE
				out_tip.sourceCavityIndex = 0
				val reagent = in_step.reagent
				val trough = reagent.fetch() as Trough
				out_job.source = trough
			}
		} 
		// TARGET
		out_job.target = in_jobRequest.getMicroplate(in_sample)
		out_tip.targetCavityIndex = in_jobRequest.getMicroplate_cavity(in_sample)
		
		// SET CONTAINER
		out_job.tips.add(out_tip)

	].undo[
		val in_sample = 'in_sample'.fetch() as Sample
		val in_step = 'in_step'.fetch() as ProtocolStep
		val out_tip = 'out_tip'.fetch() as TipLiquidTransfer
		
		// SET CONTAINER
		val occurrence = getLiquidTransferJobMatchCount(in_step, in_sample)
		val out_job = in_step.fetch('out_job', 'job', occurrence) as LiquidTransferJob
		
		out_job.tips.remove(out_tip)
	],			






rule('job').isAbstract.toMany
	.in('in_step', LAB.protocolStep)
	.out('out_job', JOB.job) [
		val in_step = 'in_step'.fetch() as ProtocolStep
		var out_job = 'out_job'.fetch() as Job

		out_job.protocolStepName = in_step.id
		// set container	
		val in_jobRequest = in_step.eContainer.eContainer as JobRequest
		val out_jobCollection = in_jobRequest.fetch('out_jobCollection', 'jobRequest_->_jobCollection') as JobCollection
		out_jobCollection.jobs.add(out_job)
		
		val prev_step = in_step.previous
		if (in_step.previous !== null) {
			val maybe_list = prev_step.fetch()
		
			if (maybe_list!==null) {
				if (maybe_list instanceof List) {
					out_job.previous.add(maybe_list.head)	
				} else {
					out_job.previous.add(maybe_list as Job)	
				}
			}
			
		}
	],


rule('tipContainer').isAbstract.toMany
	.inheritsFrom(#['job'])
	.in('in_step', LAB.protocolStep).filter[
		val in_step = 'in_step'.fetch() as ProtocolStep
		val count = 'matchCount'.fetch() as Integer
		
		val sampleCount = 'sampleCount'.fetch() as Integer
		val matches = (in_step instanceof DistributeSample || in_step instanceof AddReagent)
		&& 
		{
			count <= (
				if (sampleCount % MICROPLATE_CAPACITY == 0)
					(sampleCount / MICROPLATE_CAPACITY) - 1
				else
					(sampleCount / MICROPLATE_CAPACITY) 
			)
		}		
		matches
	]
	.out('out_job', JOB.job),
	
	
rule('distributeSample').toMany
	.inheritsFrom(#['tipContainer'])
	.in('in_step', LAB.distributeSample)
	.out('out_job', JOB.liquidTransferJob),			
	
rule('addReagent').toMany
	.inheritsFrom(#['tipContainer'])
	.in('in_step', LAB.addReagent)
	.out('out_job', JOB.liquidTransferJob),		
	
	
	
	
	
rule('plateJobs').isAbstract.toMany
	.inheritsFrom(#['job'])
	.in('in_step', LAB.protocolStep).filter[
		var in_step = 'in_step'.fetch() as ProtocolStep
		
		val count = 'matchCount'.fetch() as Integer
		
		(in_step instanceof Wash || in_step instanceof Incubate)
		&& {
			val sampleCount = 'sampleCount'.fetch() as Integer
			count <= sampleCount / MICROPLATE_CAPACITY
		}
	]
	.out('out_job', JOB.job),	
	
rule('wash').toMany
	.inheritsFrom(#['plateJobs'])
	.in('in_step', LAB.wash)
	.out('out_job', JOB.washJob) [
		val in_step = 'in_step'.fetch() as Wash
		var out_job = 'out_job'.fetch() as WashJob

		val matchCount = 'matchCount'.fetch() as Integer
		val microplate = getMicroplateFromMatchCount(in_step, matchCount)
		out_job.microplate = microplate
		
		val sampleCount = 'sampleCount'.fetch() as Integer
		val start = MICROPLATE_CAPACITY * matchCount
		val end = sampleCount - 1
		for (i: start..end) {
			out_job.cavities += i % MICROPLATE_CAPACITY
		}
	],
	
rule('incubate').toMany
	.inheritsFrom(#['plateJobs'])
	.in('in_step', LAB.incubate)
	.out('out_job', JOB.incubateJob) [
		val in_step = 'in_step'.fetch() as Incubate
		var out_job = 'out_job'.fetch() as IncubateJob

		// incubate
		out_job.temperature = in_step.temperature
		out_job.duration = in_step.duration

		val matchCount = 'matchCount'.fetch() as Integer
		val microplate = getMicroplateFromMatchCount(in_step, matchCount)
		out_job.microplate = microplate
	]
	
	
		])
		
		
		helperStore(#[
			staticAttribute('sampleCount') [
				val rootJobRequest = this.getModelResource('lab').contents.head as JobRequest
				return rootJobRequest.samples.size
			]
		])
		
	}
	
	
	def getLiquidTransferJobMatchCount(ProtocolStep in_step, Sample in_sample) {
		val in_jobRequest = in_step.eContainer.eContainer as JobRequest
		val sample_index = in_jobRequest.samples.indexOf(in_sample)
		val result = (sample_index / MICROPLATE_CAPACITY)
		result 
	}

	def getMicroplateFromMatchCount(ProtocolStep in_step, int matchCount) {
		val in_jobRequest = in_step.eContainer.eContainer as JobRequest
		val out_jobCollection = in_jobRequest.fetch('out_jobCollection', 'jobRequest_->_jobCollection') as JobCollection
		val microplateList =  out_jobCollection.labware.filter[it instanceof Microplate].toList
		microplateList.get(matchCount) as Microplate
	}
	
	def getMicroplate(JobRequest in_jobRequest, Sample in_sample) {
		val microplateNumber = getMicroplate_number(in_jobRequest, in_sample)	
		val microplate = in_jobRequest.fetch('microplate', 'jobRequest_->_microplate', microplateNumber) as Microplate 
		return microplate
	}
	
	def getMicroplate_number(JobRequest in_jobRequest, Sample in_sample) {
		val sample_index = in_jobRequest.samples.indexOf(in_sample)
		return (sample_index / MICROPLATE_CAPACITY) 
	}
	def getMicroplate_cavity(JobRequest in_jobRequest, Sample in_sample) {
		val sample_index = in_jobRequest.samples.indexOf(in_sample)
		return (sample_index % MICROPLATE_CAPACITY) 
	}
	
	def getTubeRunner(JobRequest in_jobRequest, Sample in_sample) {
		val tubeRunnerNumber = getTubeRunner_number(in_jobRequest, in_sample)
		val tubeRunner = in_jobRequest.fetch('tubeRunner', 'jobRequest_->_tubeRunner', tubeRunnerNumber) as TubeRunner
		return tubeRunner
	}
	
	def getTubeRunner_number(JobRequest in_jobRequest, Sample in_sample) {
		val sample_index = in_jobRequest.samples.indexOf(in_sample)
		return (sample_index / TUBE_RUNNER_CAPACITY)
	}
	def getTubeRunner_cavity(JobRequest in_jobRequest, Sample in_sample) {
		val sample_index = in_jobRequest.samples.indexOf(in_sample)
		return (sample_index % TUBE_RUNNER_CAPACITY)
	}
	
	@Accessors
	val Map<String,Map<Integer,Sample>> backward_microplate_cavity_to_sample = newHashMap
	def backward_insert(String microplate_name, Integer cavity, Sample sample) {
		val map = backward_microplate_cavity_to_sample.get(microplate_name)
		if (map===null) {
			backward_microplate_cavity_to_sample.put(microplate_name, newHashMap(cavity -> sample))
		} else {
			map.put(cavity,sample)
		}
	} 
	def get_sample_from_microplate(String microplate_name, Integer cavity) {
		return backward_microplate_cavity_to_sample.get(microplate_name).get(cavity)
	}
	
	/*
	 * CHANGES
	 */
	def applyChange(String changePath, Resource inputModelRes, Resource outputModelRes) {
		
		val in_jobRequest = inputModelRes.contents.head as JobRequest
		val out_jobCollection = outputModelRes.contents.head as JobCollection
		
		val BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(changePath), "UTF-8"));
 	   	var currentLine = reader.readLine()
		while (currentLine !== null) {
			val changeItemList = currentLine.split('_')
			
			switch (changeItemList.size) {
				case 2: { 
					// adding new sample in input model

					val taskName = changeItemList.get(0)
					if (taskName == 'NewSample') {
						val sampleName = changeItemList.get(1)
						
						val existing_sample = in_jobRequest.samples.findFirst[sampleID==sampleName]
						
						if (existing_sample === null) {
							val newSample = LAB_factory.createSample
							newSample.sampleID = sampleName
							in_jobRequest.samples.add(newSample)
						} else {
//							System.err.println('''SKIPPING ADD sample: «sampleName» already exists''')
						}
					}
				}
				case 3: {
					// backpropagation of sample status to input model
					
					val jobName = changeItemList.get(0)
					val microplateName = changeItemList.get(1)
					val sampleStatusString = changeItemList.get(2)
					
					
					val job = out_jobCollection.jobs.findFirst[it.protocolStepName == jobName]
					switch (job) {
						LiquidTransferJob: {
							// the status of samples may vary from cavity to cavity
							val sampleStatusArray = sampleStatusString.toCharArray
							for (i: 1..sampleStatusArray.size) {
								val char status = sampleStatusArray.get(i-1)
								val cavity_to_sample = backward_microplate_cavity_to_sample.get(microplateName)
								if (cavity_to_sample !==null) {
									val sample = cavity_to_sample.get(i)
									if (sample === null) {
										// new sample added in backpropagation
									} else {
										if (status.equals(Character.valueOf('S'))) {
//											sample.state = SampleState.FINISHED
//											println('''	«i» -> changing state of «sample» to «sample.state»''')
										} else if (status.equals(Character.valueOf('F'))) {
											sample.state = SampleState.ERROR										
										}
									}
									
								}
							}
						}
						IncubateJob: {
							// TODO these changes make sense if the benchmark contained job status F
							
							
//							// all samples allocated to a microplate are marked as either FINISHED or ERROR
//							val cavityToSamples = backward_microplate_cavity_to_sample.get(microplateName)
//							if (cavityToSamples===null) {
//								println('''SKIPPING change: «microplateName» not used''')
//							} else{
//								val sampleList = cavityToSamples.values
//								if (sampleStatusString == 'S') {
//									sampleList.forEach[it.state=SampleState.FINISHED]
////									System.err.println('''	marking as FINISHED: «jobName» - «microplateName»''')
//								} else if (sampleStatusString == 'F') {
//									sampleList.forEach[it.state=SampleState.ERROR]
//									// at the moment this case never happens
//									throw new Exception('''	This should be marked as ERROR: «jobName» - «microplateName» (exception to detect when this happens)''')
//								}
//							}
						} 
						WashJob: {
							// TODO these changes make sense if the benchmark contained job status F

//							// all samples allocated to a microplate are marked as either FINISHED or ERROR
//							val cavityToSamples = backward_microplate_cavity_to_sample.get(microplateName)
//							if (cavityToSamples===null) {
//								System.err.println('''SKIPPING change: «microplateName» not used''')
//							} else{
//								val sampleList = cavityToSamples.values
//								if (sampleStatusString == 'S') {
//									sampleList.forEach[it.state=SampleState.FINISHED]
////									println('''	marking as FINISHED: «jobName» - «microplateName»''')
//								} else if (sampleStatusString == 'F') {
//									sampleList.forEach[it.state=SampleState.ERROR]
//									// at the moment this case never happens
//									throw new Exception('''	This should be marked as ERROR: «jobName» - «microplateName» (exception to detect when this happens)''')
//								}
//							}
						} 
					}
				}
			}  
			
			currentLine = reader.readLine()
		}
	}
}