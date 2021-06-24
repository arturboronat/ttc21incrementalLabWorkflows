package ttc2021.iworkflows

import java.io.BufferedReader
import java.io.FileInputStream
import java.io.InputStreamReader
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
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtend.lib.annotations.Accessors
import yamtl.core.YAMTLModule

import static yamtl.dsl.Rule.*

class Solution_iWorkflows extends YAMTLModule  {
	@Accessors
	val LAB = LaboratoryAutomationPackage.eINSTANCE 
	val LAB_factory = LaboratoryAutomationFactory.eINSTANCE 
	@Accessors
	val JOB = JobCollectionPackage.eINSTANCE
	
	val TUBE_RUNNER_CAPACITY = 16
	val TIP_CAVITIES = 8
	val MICROPLATE_CAPACITY = 96
	
	new() {
		header().in('lab',LAB).out('job', JOB)
		ruleStore(#[
										
rule('jobRequest_->_jobCollection')
	.in('in_jobRequest', LAB.jobRequest)
	.out('out_jobCollection', JOB.jobCollection),

rule('jobRequest_->_tubeRunner').toMany
	.in('jobRequest', LAB.jobRequest)
	.toManyCap[
		max_count(jobRequest.samples.size, TUBE_RUNNER_CAPACITY)
	]
	.out('tubeRunner', JOB.tubeRunner)[
		val out_jobCollection = jobRequest.fetch('out_jobCollection', 'jobRequest_->_jobCollection') as JobCollection
		
		var tubeRunner_list = out_jobCollection.labware.filter[ it instanceof TubeRunner ]
		tubeRunner.name = String.format('''TubeRunner%02d''', tubeRunner_list.size + 1)
		out_jobCollection.labware.add(tubeRunner)
	],
	

rule('jobRequest_->_microplate').toMany
	.in('jobRequest', LAB.jobRequest)
	.toManyCap[max_count(jobRequest.samples.size, MICROPLATE_CAPACITY)]
	.out('microplate', JOB.microplate)[
		val out_jobCollection = jobRequest.fetch('out_jobCollection', 'jobRequest_->_jobCollection') as JobCollection
		var microplate_list = out_jobCollection.labware.filter[ it instanceof Microplate]
		microplate.name = String.format('''Plate%02d''', microplate_list.size+1)
		out_jobCollection.labware.add(microplate)
	],
	

rule('sample_->_allocation').transient
	.in('in_sample', LAB.sample).filter [
		in_sample.state == SampleState.WAITING
	]
	.out('out_aux', JOB.jobCollection)[
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
		
		val in_jobRequest = in_sample.eContainer as JobRequest
		val microplateNumber = getMicroplate_number(in_jobRequest, in_sample)
		val microplateCavity = getMicroplate_cavity(in_jobRequest, in_sample)
		val microplate = in_jobRequest.fetch('microplate', 'jobRequest_->_microplate', microplateNumber) as Microplate
		microplate_cavity_to_sample.get(microplate.name).remove(microplateCavity)
	],

rule('reagent_->_trough')
	.in('in_reagent', LAB.reagent)
	.out('out_trough', JOB.trough) [
		val in_jobRequest = in_reagent.eContainer.eContainer as JobRequest
		val out_jobCollection = in_jobRequest.fetch('out_jobCollection', 'jobRequest_->_jobCollection') as JobCollection
		out_trough.name = in_reagent.name
		out_jobCollection.labware.add(out_trough)
	],


rule('tipCreation')
	.in('in_sample', LAB.sample).filter[
		in_sample.state != SampleState.ERROR 
	]
	.in('in_step', LAB.protocolStep).filter[
		(in_step instanceof DistributeSample || in_step instanceof AddReagent)
	]
	.out('out_tip', JOB.tipLiquidTransfer) [
		val step = in_step 
		val tip = out_tip
		
		val in_jobRequest = step.eContainer.eContainer as JobRequest
		val occurrence = getTipContainerIndex(in_jobRequest, in_sample)
		val out_job = step.fetch(occurrence) as LiquidTransferJob

		switch(step) {
			DistributeSample: {
				tip.volume = step.volume
				// SOURCE
				out_job.source = in_jobRequest.getTubeRunner(in_sample)
				tip.sourceCavityIndex = in_jobRequest.getTubeRunner_cavity(in_sample)
			}
			AddReagent: {
				tip.volume = step.volume
				// SOURCE
				tip.sourceCavityIndex = 0
				val reagent = step.reagent
				val trough = reagent.fetch() as Trough
				out_job.source = trough
			}
		} 
		// TARGET
		out_job.target = in_jobRequest.getMicroplate(in_sample)
		tip.targetCavityIndex = in_jobRequest.getMicroplate_cavity(in_sample)
		// SET CONTAINER
		out_job.tips.add(tip)
	].undo[
		// SET CONTAINER
		val in_jobRequest = in_step.eContainer.eContainer as JobRequest
		val occurrence = getTipContainerIndex(in_jobRequest, in_sample)
		val out_job = in_step.fetch(occurrence) as LiquidTransferJob
		out_job.tips.remove(out_tip)
	],			






rule('job').isAbstract.toMany
	.in('in_step', LAB.protocolStep)
	.out('out_job', JOB.job) [
		out_job.protocolStepName = in_step.id
		// set container	
		val in_jobRequest = in_step.eContainer.eContainer as JobRequest
		val out_jobCollection = in_jobRequest.fetch('out_jobCollection', 'jobRequest_->_jobCollection') as JobCollection
		out_jobCollection.jobs.add(out_job)
		
		if (in_step.previous !== null)
			out_job.previous.add(in_step.previous.fetch() as Job)	
	],



rule('tipContainer').isAbstract.toMany
	.inheritsFrom(#['job'])
	.in('in_step', LAB.protocolStep).filter[
		(in_step instanceof DistributeSample || 
		in_step instanceof AddReagent)
	]
	.out('out_job', JOB.job),
	
	
rule('distributeSample').toMany
	.inheritsFrom(#['tipContainer'])
	.in('in_step', LAB.distributeSample)
	.toManyCap[max_count(sampleCount,TIP_CAVITIES)]
	.out('out_job', JOB.liquidTransferJob),			
	
rule('addReagent').toMany
	.inheritsFrom(#['tipContainer'])
	.in('in_step', LAB.addReagent)
	.toManyCap[max_count(sampleCount,TIP_CAVITIES)]
	.out('out_job', JOB.liquidTransferJob),		
	
	
	
	
	
rule('plateJobs').isAbstract.toMany
	.inheritsFrom(#['job'])
	.in('in_step', LAB.protocolStep).filter[
		(in_step instanceof Wash || 
		in_step instanceof Incubate)
	]
	.out('out_job', JOB.job),	
	
rule('wash').toMany
	.inheritsFrom(#['plateJobs'])
	.in('in_step', LAB.wash)
	.toManyCap[max_count(sampleCount, MICROPLATE_CAPACITY)]
	.out('out_job', JOB.washJob) [
		val out_job = out_job_WashJob // set to vble to avoid fetching several times
		
		val microplate = getMicroplateFromMatchCount(in_step, matchCount)
		out_job.microplate = microplate
		
		val start = MICROPLATE_CAPACITY * matchCount
		val end = sampleCount - 1
		for (i: start..end) 
			out_job.cavities += i % MICROPLATE_CAPACITY
		
	],
	
rule('incubate').toMany
	.inheritsFrom(#['plateJobs'])
	.in('in_step', LAB.incubate)
	.toManyCap[max_count(sampleCount, MICROPLATE_CAPACITY)]
	.out('out_job', JOB.incubateJob) [
		val in_step = in_step_Incubate
		val out_job = out_job_IncubateJob

		// incubate
		out_job.temperature = in_step.temperature
		out_job.duration = in_step.duration

		val microplate = getMicroplateFromMatchCount(in_step, matchCount)
		out_job.microplate = microplate
	]
	
	
		])
		
	}
	
	
	def sampleCount() {
		val rootJobRequest = this.getModelResource('lab').contents.head as JobRequest
		return rootJobRequest.samples.size
	}
	
	def max_count(int divident, int divisor) {
		if (divident % divisor == 0)
			(divident / divisor)
		else
			(divident / divisor) + 1 
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
	
	def getTipContainerIndex(JobRequest in_jobRequest, Sample in_sample) {
		val sample_index = in_jobRequest.samples.indexOf(in_sample)
		return (sample_index / TIP_CAVITIES)
	}
	def getTipIndex(JobRequest in_jobRequest, Sample in_sample) {
		val sample_index = in_jobRequest.samples.indexOf(in_sample)
		return ((sample_index % MICROPLATE_CAPACITY) % TIP_CAVITIES)
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
	val Map<String,Map<Integer,Sample>> microplate_cavity_to_sample = newHashMap
	def backward_insert(String microplate_name, Integer cavity, Sample sample) {
		val map = microplate_cavity_to_sample.get(microplate_name)
		if (map===null) {
			microplate_cavity_to_sample.put(microplate_name, newHashMap(cavity -> sample))
		} else {
			map.put(cavity,sample)
		}
	} 
	def get_sample_from_microplate(String microplate_name, Integer cavity) {
		return microplate_cavity_to_sample.get(microplate_name).get(cavity)
	}
	
	
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
//							println('ADDED sample: ' + sampleName)
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
					
//					println('''applyChange::processing «jobName» - «microplateName» - «sampleStatusString»''')
					val job = out_jobCollection.jobs.findFirst[it.protocolStepName == jobName]
//					println('''applyChange::processing «jobName» - «microplateName» - «sampleStatusString» --> job: «job.toString»''')
					switch (job) {
						LiquidTransferJob: {
//							println('''BACKWARD PROPAGATION: «jobName» - «microplateName»:''')
							// the status of samples may vary from cavity to cavity
							val sampleStatusArray = sampleStatusString.toCharArray
							for (i: 1..sampleStatusArray.size) {
								val char status = sampleStatusArray.get(i-1)
								val cavity_to_sample = getMicroplate_cavity_to_sample.get(microplateName)
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
//											println('''	«microplateName»[«i»] -> changing state of «sample.sampleID» to «sample.state»''')
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
	
	
	
	
	/*
	 * SYNTACTIC HELPERS
	 */
	def matchCount() {
		return 'matchCount'.fetch() as Integer
	}
	def in_jobRequest() {
	  'in_jobRequest'.fetch() as JobRequest
	}
	def out_jobCollection() {
	  'out_jobCollection'.fetch() as JobCollection
	}
	def jobRequest() {
	  'jobRequest'.fetch() as JobRequest
	}
	def tubeRunner() {
	  'tubeRunner'.fetch() as TubeRunner
	}
	def microplate() {
	  'microplate'.fetch() as Microplate
	}
	def in_sample() {
	  'in_sample'.fetch() as Sample
	}
	def out_aux() {
	  'out_aux'.fetch() as JobCollection
	}
	def in_reagent() {
	  'in_reagent'.fetch() as Reagent
	}
	def out_trough() {
	  'out_trough'.fetch() as Trough
	}
	def in_step() {
	  'in_step'.fetch() as ProtocolStep
	}
	def out_tip() {
	  'out_tip'.fetch() as TipLiquidTransfer
	}
	def out_job() {
	  'out_job'.fetch() as Job
	}
	def in_step_ProtocolStep() {
	  'in_step'.fetch() as ProtocolStep
	}
	def out_job_Job() {
	  'out_job'.fetch() as Job
	}
	def in_step_DistributeSample() {
	  'in_step'.fetch() as DistributeSample
	}
	def out_job_LiquidTransferJob() {
	  'out_job'.fetch() as LiquidTransferJob
	}
	def in_step_AddReagent() {
	  'in_step'.fetch() as AddReagent
	}
	def in_step_Wash() {
	  'in_step'.fetch() as Wash
	}
	def out_job_WashJob() {
	  'out_job'.fetch() as WashJob
	}
	def in_step_Incubate() {
	  'in_step'.fetch() as Incubate
	}
	def out_job_IncubateJob() {
	  'out_job'.fetch() as IncubateJob
	} 
}