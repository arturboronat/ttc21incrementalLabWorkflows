/**
 */
package laboratoryAutomation.util;

import laboratoryAutomation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see laboratoryAutomation.LaboratoryAutomationPackage
 * @generated
 */
public class LaboratoryAutomationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LaboratoryAutomationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaboratoryAutomationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LaboratoryAutomationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaboratoryAutomationSwitch<Adapter> modelSwitch =
		new LaboratoryAutomationSwitch<Adapter>() {
			@Override
			public Adapter caseAssay(Assay object) {
				return createAssayAdapter();
			}
			@Override
			public Adapter caseSample(Sample object) {
				return createSampleAdapter();
			}
			@Override
			public Adapter caseJobRequest(JobRequest object) {
				return createJobRequestAdapter();
			}
			@Override
			public Adapter caseProtocolStep(ProtocolStep object) {
				return createProtocolStepAdapter();
			}
			@Override
			public Adapter caseAddReagent(AddReagent object) {
				return createAddReagentAdapter();
			}
			@Override
			public Adapter caseDistributeSample(DistributeSample object) {
				return createDistributeSampleAdapter();
			}
			@Override
			public Adapter caseReagent(Reagent object) {
				return createReagentAdapter();
			}
			@Override
			public Adapter caseIncubate(Incubate object) {
				return createIncubateAdapter();
			}
			@Override
			public Adapter caseWash(Wash object) {
				return createWashAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link laboratoryAutomation.Assay <em>Assay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see laboratoryAutomation.Assay
	 * @generated
	 */
	public Adapter createAssayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link laboratoryAutomation.Sample <em>Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see laboratoryAutomation.Sample
	 * @generated
	 */
	public Adapter createSampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link laboratoryAutomation.JobRequest <em>Job Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see laboratoryAutomation.JobRequest
	 * @generated
	 */
	public Adapter createJobRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link laboratoryAutomation.ProtocolStep <em>Protocol Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see laboratoryAutomation.ProtocolStep
	 * @generated
	 */
	public Adapter createProtocolStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link laboratoryAutomation.AddReagent <em>Add Reagent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see laboratoryAutomation.AddReagent
	 * @generated
	 */
	public Adapter createAddReagentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link laboratoryAutomation.DistributeSample <em>Distribute Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see laboratoryAutomation.DistributeSample
	 * @generated
	 */
	public Adapter createDistributeSampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link laboratoryAutomation.Reagent <em>Reagent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see laboratoryAutomation.Reagent
	 * @generated
	 */
	public Adapter createReagentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link laboratoryAutomation.Incubate <em>Incubate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see laboratoryAutomation.Incubate
	 * @generated
	 */
	public Adapter createIncubateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link laboratoryAutomation.Wash <em>Wash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see laboratoryAutomation.Wash
	 * @generated
	 */
	public Adapter createWashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LaboratoryAutomationAdapterFactory
