/**
 */
package jobCollection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jobCollection.JobCollection#getLabware <em>Labware</em>}</li>
 *   <li>{@link jobCollection.JobCollection#getJobs <em>Jobs</em>}</li>
 * </ul>
 *
 * @see jobCollection.JobCollectionPackage#getJobCollection()
 * @model
 * @generated
 */
public interface JobCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Labware</b></em>' containment reference list.
	 * The list contents are of type {@link jobCollection.Labware}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labware</em>' containment reference list.
	 * @see jobCollection.JobCollectionPackage#getJobCollection_Labware()
	 * @model containment="true"
	 * @generated
	 */
	EList<Labware> getLabware();

	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link jobCollection.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see jobCollection.JobCollectionPackage#getJobCollection_Jobs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Job> getJobs();

} // JobCollection
