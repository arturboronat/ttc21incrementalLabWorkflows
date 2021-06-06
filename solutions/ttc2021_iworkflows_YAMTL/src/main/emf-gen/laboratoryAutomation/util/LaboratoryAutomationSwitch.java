/**
 */
package laboratoryAutomation.util;

import laboratoryAutomation.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see laboratoryAutomation.LaboratoryAutomationPackage
 * @generated
 */
public class LaboratoryAutomationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LaboratoryAutomationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaboratoryAutomationSwitch() {
		if (modelPackage == null) {
			modelPackage = LaboratoryAutomationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LaboratoryAutomationPackage.ASSAY: {
				Assay assay = (Assay)theEObject;
				T result = caseAssay(assay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LaboratoryAutomationPackage.SAMPLE: {
				Sample sample = (Sample)theEObject;
				T result = caseSample(sample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LaboratoryAutomationPackage.JOB_REQUEST: {
				JobRequest jobRequest = (JobRequest)theEObject;
				T result = caseJobRequest(jobRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LaboratoryAutomationPackage.PROTOCOL_STEP: {
				ProtocolStep protocolStep = (ProtocolStep)theEObject;
				T result = caseProtocolStep(protocolStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LaboratoryAutomationPackage.ADD_REAGENT: {
				AddReagent addReagent = (AddReagent)theEObject;
				T result = caseAddReagent(addReagent);
				if (result == null) result = caseProtocolStep(addReagent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LaboratoryAutomationPackage.DISTRIBUTE_SAMPLE: {
				DistributeSample distributeSample = (DistributeSample)theEObject;
				T result = caseDistributeSample(distributeSample);
				if (result == null) result = caseProtocolStep(distributeSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LaboratoryAutomationPackage.REAGENT: {
				Reagent reagent = (Reagent)theEObject;
				T result = caseReagent(reagent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LaboratoryAutomationPackage.INCUBATE: {
				Incubate incubate = (Incubate)theEObject;
				T result = caseIncubate(incubate);
				if (result == null) result = caseProtocolStep(incubate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LaboratoryAutomationPackage.WASH: {
				Wash wash = (Wash)theEObject;
				T result = caseWash(wash);
				if (result == null) result = caseProtocolStep(wash);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssay(Assay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSample(Sample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Job Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Job Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJobRequest(JobRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolStep(ProtocolStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Reagent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Reagent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddReagent(AddReagent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distribute Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distribute Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistributeSample(DistributeSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reagent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reagent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReagent(Reagent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incubate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incubate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncubate(Incubate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wash</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wash</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWash(Wash object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LaboratoryAutomationSwitch
