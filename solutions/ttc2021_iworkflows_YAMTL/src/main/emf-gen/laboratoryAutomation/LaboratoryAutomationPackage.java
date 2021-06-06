/**
 */
package laboratoryAutomation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see laboratoryAutomation.LaboratoryAutomationFactory
 * @model kind="package"
 * @generated
 */
public interface LaboratoryAutomationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "laboratoryAutomation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.transformation-tool-contest.eu/ttc21/laboratoryAutomation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lab";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LaboratoryAutomationPackage eINSTANCE = laboratoryAutomation.impl.LaboratoryAutomationPackageImpl.init();

	/**
	 * The meta object id for the '{@link laboratoryAutomation.impl.AssayImpl <em>Assay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laboratoryAutomation.impl.AssayImpl
	 * @see laboratoryAutomation.impl.LaboratoryAutomationPackageImpl#getAssay()
	 * @generated
	 */
	int ASSAY = 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSAY__STEPS = 0;

	/**
	 * The feature id for the '<em><b>Reagents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSAY__REAGENTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSAY__NAME = 2;

	/**
	 * The number of structural features of the '<em>Assay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSAY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link laboratoryAutomation.impl.SampleImpl <em>Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laboratoryAutomation.impl.SampleImpl
	 * @see laboratoryAutomation.impl.LaboratoryAutomationPackageImpl#getSample()
	 * @generated
	 */
	int SAMPLE = 1;

	/**
	 * The feature id for the '<em><b>Sample ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__SAMPLE_ID = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__STATE = 1;

	/**
	 * The number of structural features of the '<em>Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link laboratoryAutomation.impl.JobRequestImpl <em>Job Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laboratoryAutomation.impl.JobRequestImpl
	 * @see laboratoryAutomation.impl.LaboratoryAutomationPackageImpl#getJobRequest()
	 * @generated
	 */
	int JOB_REQUEST = 2;

	/**
	 * The feature id for the '<em><b>Assay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REQUEST__ASSAY = 0;

	/**
	 * The feature id for the '<em><b>Samples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REQUEST__SAMPLES = 1;

	/**
	 * The number of structural features of the '<em>Job Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REQUEST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link laboratoryAutomation.impl.ProtocolStepImpl <em>Protocol Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laboratoryAutomation.impl.ProtocolStepImpl
	 * @see laboratoryAutomation.impl.LaboratoryAutomationPackageImpl#getProtocolStep()
	 * @generated
	 */
	int PROTOCOL_STEP = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STEP__ID = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STEP__NEXT = 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STEP__PREVIOUS = 2;

	/**
	 * The number of structural features of the '<em>Protocol Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STEP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link laboratoryAutomation.impl.AddReagentImpl <em>Add Reagent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laboratoryAutomation.impl.AddReagentImpl
	 * @see laboratoryAutomation.impl.LaboratoryAutomationPackageImpl#getAddReagent()
	 * @generated
	 */
	int ADD_REAGENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REAGENT__ID = PROTOCOL_STEP__ID;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REAGENT__NEXT = PROTOCOL_STEP__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REAGENT__PREVIOUS = PROTOCOL_STEP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REAGENT__VOLUME = PROTOCOL_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reagent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REAGENT__REAGENT = PROTOCOL_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Reagent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REAGENT_FEATURE_COUNT = PROTOCOL_STEP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link laboratoryAutomation.impl.DistributeSampleImpl <em>Distribute Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laboratoryAutomation.impl.DistributeSampleImpl
	 * @see laboratoryAutomation.impl.LaboratoryAutomationPackageImpl#getDistributeSample()
	 * @generated
	 */
	int DISTRIBUTE_SAMPLE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTE_SAMPLE__ID = PROTOCOL_STEP__ID;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTE_SAMPLE__NEXT = PROTOCOL_STEP__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTE_SAMPLE__PREVIOUS = PROTOCOL_STEP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTE_SAMPLE__VOLUME = PROTOCOL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Distribute Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTE_SAMPLE_FEATURE_COUNT = PROTOCOL_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link laboratoryAutomation.impl.ReagentImpl <em>Reagent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laboratoryAutomation.impl.ReagentImpl
	 * @see laboratoryAutomation.impl.LaboratoryAutomationPackageImpl#getReagent()
	 * @generated
	 */
	int REAGENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAGENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAGENT__SOURCE = 1;

	/**
	 * The number of structural features of the '<em>Reagent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAGENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link laboratoryAutomation.impl.IncubateImpl <em>Incubate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laboratoryAutomation.impl.IncubateImpl
	 * @see laboratoryAutomation.impl.LaboratoryAutomationPackageImpl#getIncubate()
	 * @generated
	 */
	int INCUBATE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCUBATE__ID = PROTOCOL_STEP__ID;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCUBATE__NEXT = PROTOCOL_STEP__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCUBATE__PREVIOUS = PROTOCOL_STEP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCUBATE__TEMPERATURE = PROTOCOL_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCUBATE__DURATION = PROTOCOL_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Incubate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCUBATE_FEATURE_COUNT = PROTOCOL_STEP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link laboratoryAutomation.impl.WashImpl <em>Wash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laboratoryAutomation.impl.WashImpl
	 * @see laboratoryAutomation.impl.LaboratoryAutomationPackageImpl#getWash()
	 * @generated
	 */
	int WASH = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASH__ID = PROTOCOL_STEP__ID;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASH__NEXT = PROTOCOL_STEP__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASH__PREVIOUS = PROTOCOL_STEP__PREVIOUS;

	/**
	 * The number of structural features of the '<em>Wash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASH_FEATURE_COUNT = PROTOCOL_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link laboratoryAutomation.SampleState <em>Sample State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laboratoryAutomation.SampleState
	 * @see laboratoryAutomation.impl.LaboratoryAutomationPackageImpl#getSampleState()
	 * @generated
	 */
	int SAMPLE_STATE = 9;


	/**
	 * Returns the meta object for class '{@link laboratoryAutomation.Assay <em>Assay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assay</em>'.
	 * @see laboratoryAutomation.Assay
	 * @generated
	 */
	EClass getAssay();

	/**
	 * Returns the meta object for the containment reference list '{@link laboratoryAutomation.Assay#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see laboratoryAutomation.Assay#getSteps()
	 * @see #getAssay()
	 * @generated
	 */
	EReference getAssay_Steps();

	/**
	 * Returns the meta object for the containment reference list '{@link laboratoryAutomation.Assay#getReagents <em>Reagents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reagents</em>'.
	 * @see laboratoryAutomation.Assay#getReagents()
	 * @see #getAssay()
	 * @generated
	 */
	EReference getAssay_Reagents();

	/**
	 * Returns the meta object for the attribute '{@link laboratoryAutomation.Assay#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see laboratoryAutomation.Assay#getName()
	 * @see #getAssay()
	 * @generated
	 */
	EAttribute getAssay_Name();

	/**
	 * Returns the meta object for class '{@link laboratoryAutomation.Sample <em>Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sample</em>'.
	 * @see laboratoryAutomation.Sample
	 * @generated
	 */
	EClass getSample();

	/**
	 * Returns the meta object for the attribute '{@link laboratoryAutomation.Sample#getSampleID <em>Sample ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample ID</em>'.
	 * @see laboratoryAutomation.Sample#getSampleID()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_SampleID();

	/**
	 * Returns the meta object for the attribute '{@link laboratoryAutomation.Sample#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see laboratoryAutomation.Sample#getState()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_State();

	/**
	 * Returns the meta object for class '{@link laboratoryAutomation.JobRequest <em>Job Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Request</em>'.
	 * @see laboratoryAutomation.JobRequest
	 * @generated
	 */
	EClass getJobRequest();

	/**
	 * Returns the meta object for the containment reference '{@link laboratoryAutomation.JobRequest#getAssay <em>Assay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assay</em>'.
	 * @see laboratoryAutomation.JobRequest#getAssay()
	 * @see #getJobRequest()
	 * @generated
	 */
	EReference getJobRequest_Assay();

	/**
	 * Returns the meta object for the containment reference list '{@link laboratoryAutomation.JobRequest#getSamples <em>Samples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samples</em>'.
	 * @see laboratoryAutomation.JobRequest#getSamples()
	 * @see #getJobRequest()
	 * @generated
	 */
	EReference getJobRequest_Samples();

	/**
	 * Returns the meta object for class '{@link laboratoryAutomation.ProtocolStep <em>Protocol Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Step</em>'.
	 * @see laboratoryAutomation.ProtocolStep
	 * @generated
	 */
	EClass getProtocolStep();

	/**
	 * Returns the meta object for the attribute '{@link laboratoryAutomation.ProtocolStep#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see laboratoryAutomation.ProtocolStep#getId()
	 * @see #getProtocolStep()
	 * @generated
	 */
	EAttribute getProtocolStep_Id();

	/**
	 * Returns the meta object for the reference '{@link laboratoryAutomation.ProtocolStep#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see laboratoryAutomation.ProtocolStep#getNext()
	 * @see #getProtocolStep()
	 * @generated
	 */
	EReference getProtocolStep_Next();

	/**
	 * Returns the meta object for the reference '{@link laboratoryAutomation.ProtocolStep#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see laboratoryAutomation.ProtocolStep#getPrevious()
	 * @see #getProtocolStep()
	 * @generated
	 */
	EReference getProtocolStep_Previous();

	/**
	 * Returns the meta object for class '{@link laboratoryAutomation.AddReagent <em>Add Reagent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Reagent</em>'.
	 * @see laboratoryAutomation.AddReagent
	 * @generated
	 */
	EClass getAddReagent();

	/**
	 * Returns the meta object for the attribute '{@link laboratoryAutomation.AddReagent#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see laboratoryAutomation.AddReagent#getVolume()
	 * @see #getAddReagent()
	 * @generated
	 */
	EAttribute getAddReagent_Volume();

	/**
	 * Returns the meta object for the reference '{@link laboratoryAutomation.AddReagent#getReagent <em>Reagent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reagent</em>'.
	 * @see laboratoryAutomation.AddReagent#getReagent()
	 * @see #getAddReagent()
	 * @generated
	 */
	EReference getAddReagent_Reagent();

	/**
	 * Returns the meta object for class '{@link laboratoryAutomation.DistributeSample <em>Distribute Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribute Sample</em>'.
	 * @see laboratoryAutomation.DistributeSample
	 * @generated
	 */
	EClass getDistributeSample();

	/**
	 * Returns the meta object for the attribute '{@link laboratoryAutomation.DistributeSample#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see laboratoryAutomation.DistributeSample#getVolume()
	 * @see #getDistributeSample()
	 * @generated
	 */
	EAttribute getDistributeSample_Volume();

	/**
	 * Returns the meta object for class '{@link laboratoryAutomation.Reagent <em>Reagent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reagent</em>'.
	 * @see laboratoryAutomation.Reagent
	 * @generated
	 */
	EClass getReagent();

	/**
	 * Returns the meta object for the attribute '{@link laboratoryAutomation.Reagent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see laboratoryAutomation.Reagent#getName()
	 * @see #getReagent()
	 * @generated
	 */
	EAttribute getReagent_Name();

	/**
	 * Returns the meta object for the attribute '{@link laboratoryAutomation.Reagent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see laboratoryAutomation.Reagent#getSource()
	 * @see #getReagent()
	 * @generated
	 */
	EAttribute getReagent_Source();

	/**
	 * Returns the meta object for class '{@link laboratoryAutomation.Incubate <em>Incubate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incubate</em>'.
	 * @see laboratoryAutomation.Incubate
	 * @generated
	 */
	EClass getIncubate();

	/**
	 * Returns the meta object for the attribute '{@link laboratoryAutomation.Incubate#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see laboratoryAutomation.Incubate#getTemperature()
	 * @see #getIncubate()
	 * @generated
	 */
	EAttribute getIncubate_Temperature();

	/**
	 * Returns the meta object for the attribute '{@link laboratoryAutomation.Incubate#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see laboratoryAutomation.Incubate#getDuration()
	 * @see #getIncubate()
	 * @generated
	 */
	EAttribute getIncubate_Duration();

	/**
	 * Returns the meta object for class '{@link laboratoryAutomation.Wash <em>Wash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wash</em>'.
	 * @see laboratoryAutomation.Wash
	 * @generated
	 */
	EClass getWash();

	/**
	 * Returns the meta object for enum '{@link laboratoryAutomation.SampleState <em>Sample State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sample State</em>'.
	 * @see laboratoryAutomation.SampleState
	 * @generated
	 */
	EEnum getSampleState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LaboratoryAutomationFactory getLaboratoryAutomationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link laboratoryAutomation.impl.AssayImpl <em>Assay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laboratoryAutomation.impl.AssayImpl
		 * @see laboratoryAutomation.impl.LaboratoryAutomationPackageImpl#getAssay()
		 * @generated
		 */
		EClass ASSAY = eINSTANCE.getAssay();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSAY__STEPS = eINSTANCE.getAssay_Steps();

		/**
		 * The meta object literal for the '<em><b>Reagents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSAY__REAGENTS = eINSTANCE.getAssay_Reagents();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSAY__NAME = eINSTANCE.getAssay_Name();

		/**
		 * The meta object literal for the '{@link laboratoryAutomation.impl.SampleImpl <em>Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laboratoryAutomation.impl.SampleImpl
		 * @see laboratoryAutomation.impl.LaboratoryAutomationPackageImpl#getSample()
		 * @generated
		 */
		EClass SAMPLE = eINSTANCE.getSample();

		/**
		 * The meta object literal for the '<em><b>Sample ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__SAMPLE_ID = eINSTANCE.getSample_SampleID();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__STATE = eINSTANCE.getSample_State();

		/**
		 * The meta object literal for the '{@link laboratoryAutomation.impl.JobRequestImpl <em>Job Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laboratoryAutomation.impl.JobRequestImpl
		 * @see laboratoryAutomation.impl.LaboratoryAutomationPackageImpl#getJobRequest()
		 * @generated
		 */
		EClass JOB_REQUEST = eINSTANCE.getJobRequest();

		/**
		 * The meta object literal for the '<em><b>Assay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_REQUEST__ASSAY = eINSTANCE.getJobRequest_Assay();

		/**
		 * The meta object literal for the '<em><b>Samples</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_REQUEST__SAMPLES = eINSTANCE.getJobRequest_Samples();

		/**
		 * The meta object literal for the '{@link laboratoryAutomation.impl.ProtocolStepImpl <em>Protocol Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laboratoryAutomation.impl.ProtocolStepImpl
		 * @see laboratoryAutomation.impl.LaboratoryAutomationPackageImpl#getProtocolStep()
		 * @generated
		 */
		EClass PROTOCOL_STEP = eINSTANCE.getProtocolStep();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL_STEP__ID = eINSTANCE.getProtocolStep_Id();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_STEP__NEXT = eINSTANCE.getProtocolStep_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_STEP__PREVIOUS = eINSTANCE.getProtocolStep_Previous();

		/**
		 * The meta object literal for the '{@link laboratoryAutomation.impl.AddReagentImpl <em>Add Reagent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laboratoryAutomation.impl.AddReagentImpl
		 * @see laboratoryAutomation.impl.LaboratoryAutomationPackageImpl#getAddReagent()
		 * @generated
		 */
		EClass ADD_REAGENT = eINSTANCE.getAddReagent();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_REAGENT__VOLUME = eINSTANCE.getAddReagent_Volume();

		/**
		 * The meta object literal for the '<em><b>Reagent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_REAGENT__REAGENT = eINSTANCE.getAddReagent_Reagent();

		/**
		 * The meta object literal for the '{@link laboratoryAutomation.impl.DistributeSampleImpl <em>Distribute Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laboratoryAutomation.impl.DistributeSampleImpl
		 * @see laboratoryAutomation.impl.LaboratoryAutomationPackageImpl#getDistributeSample()
		 * @generated
		 */
		EClass DISTRIBUTE_SAMPLE = eINSTANCE.getDistributeSample();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTE_SAMPLE__VOLUME = eINSTANCE.getDistributeSample_Volume();

		/**
		 * The meta object literal for the '{@link laboratoryAutomation.impl.ReagentImpl <em>Reagent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laboratoryAutomation.impl.ReagentImpl
		 * @see laboratoryAutomation.impl.LaboratoryAutomationPackageImpl#getReagent()
		 * @generated
		 */
		EClass REAGENT = eINSTANCE.getReagent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAGENT__NAME = eINSTANCE.getReagent_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAGENT__SOURCE = eINSTANCE.getReagent_Source();

		/**
		 * The meta object literal for the '{@link laboratoryAutomation.impl.IncubateImpl <em>Incubate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laboratoryAutomation.impl.IncubateImpl
		 * @see laboratoryAutomation.impl.LaboratoryAutomationPackageImpl#getIncubate()
		 * @generated
		 */
		EClass INCUBATE = eINSTANCE.getIncubate();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCUBATE__TEMPERATURE = eINSTANCE.getIncubate_Temperature();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCUBATE__DURATION = eINSTANCE.getIncubate_Duration();

		/**
		 * The meta object literal for the '{@link laboratoryAutomation.impl.WashImpl <em>Wash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laboratoryAutomation.impl.WashImpl
		 * @see laboratoryAutomation.impl.LaboratoryAutomationPackageImpl#getWash()
		 * @generated
		 */
		EClass WASH = eINSTANCE.getWash();

		/**
		 * The meta object literal for the '{@link laboratoryAutomation.SampleState <em>Sample State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laboratoryAutomation.SampleState
		 * @see laboratoryAutomation.impl.LaboratoryAutomationPackageImpl#getSampleState()
		 * @generated
		 */
		EEnum SAMPLE_STATE = eINSTANCE.getSampleState();

	}

} //LaboratoryAutomationPackage
