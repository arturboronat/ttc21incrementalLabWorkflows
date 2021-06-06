/**
 */
package jobCollection;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tube Runner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jobCollection.TubeRunner#getBarcodes <em>Barcodes</em>}</li>
 * </ul>
 *
 * @see jobCollection.JobCollectionPackage#getTubeRunner()
 * @model
 * @generated
 */
public interface TubeRunner extends Labware {
	/**
	 * Returns the value of the '<em><b>Barcodes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Barcodes</em>' attribute list.
	 * @see jobCollection.JobCollectionPackage#getTubeRunner_Barcodes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" upper="16"
	 * @generated
	 */
	EList<String> getBarcodes();

} // TubeRunner
