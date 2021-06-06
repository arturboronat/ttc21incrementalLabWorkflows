/**
 */
package laboratoryAutomation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link laboratoryAutomation.Assay#getSteps <em>Steps</em>}</li>
 *   <li>{@link laboratoryAutomation.Assay#getReagents <em>Reagents</em>}</li>
 *   <li>{@link laboratoryAutomation.Assay#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see laboratoryAutomation.LaboratoryAutomationPackage#getAssay()
 * @model
 * @generated
 */
public interface Assay extends EObject {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link laboratoryAutomation.ProtocolStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see laboratoryAutomation.LaboratoryAutomationPackage#getAssay_Steps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProtocolStep> getSteps();

	/**
	 * Returns the value of the '<em><b>Reagents</b></em>' containment reference list.
	 * The list contents are of type {@link laboratoryAutomation.Reagent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reagents</em>' containment reference list.
	 * @see laboratoryAutomation.LaboratoryAutomationPackage#getAssay_Reagents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reagent> getReagents();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see laboratoryAutomation.LaboratoryAutomationPackage#getAssay_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link laboratoryAutomation.Assay#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Assay
