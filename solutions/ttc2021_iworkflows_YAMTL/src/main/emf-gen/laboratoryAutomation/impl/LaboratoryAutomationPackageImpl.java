/**
 */
package laboratoryAutomation.impl;

import laboratoryAutomation.AddReagent;
import laboratoryAutomation.Assay;
import laboratoryAutomation.DistributeSample;
import laboratoryAutomation.Incubate;
import laboratoryAutomation.JobRequest;
import laboratoryAutomation.LaboratoryAutomationFactory;
import laboratoryAutomation.LaboratoryAutomationPackage;
import laboratoryAutomation.ProtocolStep;
import laboratoryAutomation.Reagent;
import laboratoryAutomation.Sample;
import laboratoryAutomation.SampleState;
import laboratoryAutomation.Wash;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LaboratoryAutomationPackageImpl extends EPackageImpl implements LaboratoryAutomationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addReagentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distributeSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reagentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incubateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass washEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sampleStateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see laboratoryAutomation.LaboratoryAutomationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LaboratoryAutomationPackageImpl() {
		super(eNS_URI, LaboratoryAutomationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link LaboratoryAutomationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LaboratoryAutomationPackage init() {
		if (isInited) return (LaboratoryAutomationPackage)EPackage.Registry.INSTANCE.getEPackage(LaboratoryAutomationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLaboratoryAutomationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LaboratoryAutomationPackageImpl theLaboratoryAutomationPackage = registeredLaboratoryAutomationPackage instanceof LaboratoryAutomationPackageImpl ? (LaboratoryAutomationPackageImpl)registeredLaboratoryAutomationPackage : new LaboratoryAutomationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLaboratoryAutomationPackage.createPackageContents();

		// Initialize created meta-data
		theLaboratoryAutomationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLaboratoryAutomationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LaboratoryAutomationPackage.eNS_URI, theLaboratoryAutomationPackage);
		return theLaboratoryAutomationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssay() {
		return assayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssay_Steps() {
		return (EReference)assayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssay_Reagents() {
		return (EReference)assayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssay_Name() {
		return (EAttribute)assayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSample() {
		return sampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_SampleID() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_State() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobRequest() {
		return jobRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobRequest_Assay() {
		return (EReference)jobRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobRequest_Samples() {
		return (EReference)jobRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolStep() {
		return protocolStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolStep_Id() {
		return (EAttribute)protocolStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolStep_Next() {
		return (EReference)protocolStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolStep_Previous() {
		return (EReference)protocolStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddReagent() {
		return addReagentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddReagent_Volume() {
		return (EAttribute)addReagentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddReagent_Reagent() {
		return (EReference)addReagentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistributeSample() {
		return distributeSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistributeSample_Volume() {
		return (EAttribute)distributeSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReagent() {
		return reagentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReagent_Name() {
		return (EAttribute)reagentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReagent_Source() {
		return (EAttribute)reagentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncubate() {
		return incubateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncubate_Temperature() {
		return (EAttribute)incubateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncubate_Duration() {
		return (EAttribute)incubateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWash() {
		return washEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSampleState() {
		return sampleStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaboratoryAutomationFactory getLaboratoryAutomationFactory() {
		return (LaboratoryAutomationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		assayEClass = createEClass(ASSAY);
		createEReference(assayEClass, ASSAY__STEPS);
		createEReference(assayEClass, ASSAY__REAGENTS);
		createEAttribute(assayEClass, ASSAY__NAME);

		sampleEClass = createEClass(SAMPLE);
		createEAttribute(sampleEClass, SAMPLE__SAMPLE_ID);
		createEAttribute(sampleEClass, SAMPLE__STATE);

		jobRequestEClass = createEClass(JOB_REQUEST);
		createEReference(jobRequestEClass, JOB_REQUEST__ASSAY);
		createEReference(jobRequestEClass, JOB_REQUEST__SAMPLES);

		protocolStepEClass = createEClass(PROTOCOL_STEP);
		createEAttribute(protocolStepEClass, PROTOCOL_STEP__ID);
		createEReference(protocolStepEClass, PROTOCOL_STEP__NEXT);
		createEReference(protocolStepEClass, PROTOCOL_STEP__PREVIOUS);

		addReagentEClass = createEClass(ADD_REAGENT);
		createEAttribute(addReagentEClass, ADD_REAGENT__VOLUME);
		createEReference(addReagentEClass, ADD_REAGENT__REAGENT);

		distributeSampleEClass = createEClass(DISTRIBUTE_SAMPLE);
		createEAttribute(distributeSampleEClass, DISTRIBUTE_SAMPLE__VOLUME);

		reagentEClass = createEClass(REAGENT);
		createEAttribute(reagentEClass, REAGENT__NAME);
		createEAttribute(reagentEClass, REAGENT__SOURCE);

		incubateEClass = createEClass(INCUBATE);
		createEAttribute(incubateEClass, INCUBATE__TEMPERATURE);
		createEAttribute(incubateEClass, INCUBATE__DURATION);

		washEClass = createEClass(WASH);

		// Create enums
		sampleStateEEnum = createEEnum(SAMPLE_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		addReagentEClass.getESuperTypes().add(this.getProtocolStep());
		distributeSampleEClass.getESuperTypes().add(this.getProtocolStep());
		incubateEClass.getESuperTypes().add(this.getProtocolStep());
		washEClass.getESuperTypes().add(this.getProtocolStep());

		// Initialize classes and features; add operations and parameters
		initEClass(assayEClass, Assay.class, "Assay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssay_Steps(), this.getProtocolStep(), null, "steps", null, 1, -1, Assay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssay_Reagents(), this.getReagent(), null, "reagents", null, 0, -1, Assay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssay_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Assay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sampleEClass, Sample.class, "Sample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSample_SampleID(), theXMLTypePackage.getString(), "sampleID", null, 1, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_State(), this.getSampleState(), "state", null, 1, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobRequestEClass, JobRequest.class, "JobRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJobRequest_Assay(), this.getAssay(), null, "assay", null, 1, 1, JobRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobRequest_Samples(), this.getSample(), null, "samples", null, 1, -1, JobRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protocolStepEClass, ProtocolStep.class, "ProtocolStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProtocolStep_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, ProtocolStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtocolStep_Next(), this.getProtocolStep(), this.getProtocolStep_Previous(), "next", null, 0, 1, ProtocolStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtocolStep_Previous(), this.getProtocolStep(), this.getProtocolStep_Next(), "previous", null, 0, 1, ProtocolStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addReagentEClass, AddReagent.class, "AddReagent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddReagent_Volume(), theXMLTypePackage.getDouble(), "volume", null, 1, 1, AddReagent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddReagent_Reagent(), this.getReagent(), null, "reagent", null, 1, 1, AddReagent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distributeSampleEClass, DistributeSample.class, "DistributeSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistributeSample_Volume(), theXMLTypePackage.getDouble(), "volume", null, 1, 1, DistributeSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reagentEClass, Reagent.class, "Reagent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReagent_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Reagent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReagent_Source(), theXMLTypePackage.getString(), "source", null, 1, 1, Reagent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(incubateEClass, Incubate.class, "Incubate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncubate_Temperature(), theXMLTypePackage.getDouble(), "temperature", "293.15", 1, 1, Incubate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncubate_Duration(), theXMLTypePackage.getInt(), "duration", null, 1, 1, Incubate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(washEClass, Wash.class, "Wash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(sampleStateEEnum, SampleState.class, "SampleState");
		addEEnumLiteral(sampleStateEEnum, SampleState.WAITING);
		addEEnumLiteral(sampleStateEEnum, SampleState.PROCESSING);
		addEEnumLiteral(sampleStateEEnum, SampleState.FINISHED);
		addEEnumLiteral(sampleStateEEnum, SampleState.ERROR);

		// Create resource
		createResource(eNS_URI);
	}

} //LaboratoryAutomationPackageImpl
