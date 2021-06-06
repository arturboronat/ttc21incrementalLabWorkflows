/**
 */
package laboratoryAutomation.impl;

import laboratoryAutomation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LaboratoryAutomationFactoryImpl extends EFactoryImpl implements LaboratoryAutomationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LaboratoryAutomationFactory init() {
		try {
			LaboratoryAutomationFactory theLaboratoryAutomationFactory = (LaboratoryAutomationFactory)EPackage.Registry.INSTANCE.getEFactory(LaboratoryAutomationPackage.eNS_URI);
			if (theLaboratoryAutomationFactory != null) {
				return theLaboratoryAutomationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LaboratoryAutomationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaboratoryAutomationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LaboratoryAutomationPackage.ASSAY: return createAssay();
			case LaboratoryAutomationPackage.SAMPLE: return createSample();
			case LaboratoryAutomationPackage.JOB_REQUEST: return createJobRequest();
			case LaboratoryAutomationPackage.ADD_REAGENT: return createAddReagent();
			case LaboratoryAutomationPackage.DISTRIBUTE_SAMPLE: return createDistributeSample();
			case LaboratoryAutomationPackage.REAGENT: return createReagent();
			case LaboratoryAutomationPackage.INCUBATE: return createIncubate();
			case LaboratoryAutomationPackage.WASH: return createWash();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LaboratoryAutomationPackage.SAMPLE_STATE:
				return createSampleStateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LaboratoryAutomationPackage.SAMPLE_STATE:
				return convertSampleStateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assay createAssay() {
		AssayImpl assay = new AssayImpl();
		return assay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sample createSample() {
		SampleImpl sample = new SampleImpl();
		return sample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobRequest createJobRequest() {
		JobRequestImpl jobRequest = new JobRequestImpl();
		return jobRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddReagent createAddReagent() {
		AddReagentImpl addReagent = new AddReagentImpl();
		return addReagent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributeSample createDistributeSample() {
		DistributeSampleImpl distributeSample = new DistributeSampleImpl();
		return distributeSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reagent createReagent() {
		ReagentImpl reagent = new ReagentImpl();
		return reagent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Incubate createIncubate() {
		IncubateImpl incubate = new IncubateImpl();
		return incubate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wash createWash() {
		WashImpl wash = new WashImpl();
		return wash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleState createSampleStateFromString(EDataType eDataType, String initialValue) {
		SampleState result = SampleState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSampleStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaboratoryAutomationPackage getLaboratoryAutomationPackage() {
		return (LaboratoryAutomationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LaboratoryAutomationPackage getPackage() {
		return LaboratoryAutomationPackage.eINSTANCE;
	}

} //LaboratoryAutomationFactoryImpl
