/**
 */
package laboratoryAutomation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link laboratoryAutomation.JobRequest#getAssay <em>Assay</em>}</li>
 *   <li>{@link laboratoryAutomation.JobRequest#getSamples <em>Samples</em>}</li>
 * </ul>
 *
 * @see laboratoryAutomation.LaboratoryAutomationPackage#getJobRequest()
 * @model
 * @generated
 */
public interface JobRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Assay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assay</em>' containment reference.
	 * @see #setAssay(Assay)
	 * @see laboratoryAutomation.LaboratoryAutomationPackage#getJobRequest_Assay()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Assay getAssay();

	/**
	 * Sets the value of the '{@link laboratoryAutomation.JobRequest#getAssay <em>Assay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assay</em>' containment reference.
	 * @see #getAssay()
	 * @generated
	 */
	void setAssay(Assay value);

	/**
	 * Returns the value of the '<em><b>Samples</b></em>' containment reference list.
	 * The list contents are of type {@link laboratoryAutomation.Sample}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Samples</em>' containment reference list.
	 * @see laboratoryAutomation.LaboratoryAutomationPackage#getJobRequest_Samples()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Sample> getSamples();

} // JobRequest
