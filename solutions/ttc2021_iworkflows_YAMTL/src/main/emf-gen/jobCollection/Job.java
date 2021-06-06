/**
 */
package jobCollection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jobCollection.Job#getState <em>State</em>}</li>
 *   <li>{@link jobCollection.Job#getProtocolStepName <em>Protocol Step Name</em>}</li>
 *   <li>{@link jobCollection.Job#getPrevious <em>Previous</em>}</li>
 *   <li>{@link jobCollection.Job#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see jobCollection.JobCollectionPackage#getJob()
 * @model abstract="true"
 * @generated
 */
public interface Job extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link jobCollection.JobStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see jobCollection.JobStatus
	 * @see #setState(JobStatus)
	 * @see jobCollection.JobCollectionPackage#getJob_State()
	 * @model required="true"
	 * @generated
	 */
	JobStatus getState();

	/**
	 * Sets the value of the '{@link jobCollection.Job#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see jobCollection.JobStatus
	 * @see #getState()
	 * @generated
	 */
	void setState(JobStatus value);

	/**
	 * Returns the value of the '<em><b>Protocol Step Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol Step Name</em>' attribute.
	 * @see #setProtocolStepName(String)
	 * @see jobCollection.JobCollectionPackage#getJob_ProtocolStepName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getProtocolStepName();

	/**
	 * Sets the value of the '{@link jobCollection.Job#getProtocolStepName <em>Protocol Step Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Step Name</em>' attribute.
	 * @see #getProtocolStepName()
	 * @generated
	 */
	void setProtocolStepName(String value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference list.
	 * The list contents are of type {@link jobCollection.Job}.
	 * It is bidirectional and its opposite is '{@link jobCollection.Job#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference list.
	 * @see jobCollection.JobCollectionPackage#getJob_Previous()
	 * @see jobCollection.Job#getNext
	 * @model opposite="next"
	 * @generated
	 */
	EList<Job> getPrevious();

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link jobCollection.Job}.
	 * It is bidirectional and its opposite is '{@link jobCollection.Job#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see jobCollection.JobCollectionPackage#getJob_Next()
	 * @see jobCollection.Job#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	EList<Job> getNext();

} // Job
