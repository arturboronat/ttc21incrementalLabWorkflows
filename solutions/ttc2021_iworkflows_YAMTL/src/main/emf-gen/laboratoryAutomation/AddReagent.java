/**
 */
package laboratoryAutomation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Reagent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link laboratoryAutomation.AddReagent#getVolume <em>Volume</em>}</li>
 *   <li>{@link laboratoryAutomation.AddReagent#getReagent <em>Reagent</em>}</li>
 * </ul>
 *
 * @see laboratoryAutomation.LaboratoryAutomationPackage#getAddReagent()
 * @model
 * @generated
 */
public interface AddReagent extends ProtocolStep {
	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(double)
	 * @see laboratoryAutomation.LaboratoryAutomationPackage#getAddReagent_Volume()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getVolume();

	/**
	 * Sets the value of the '{@link laboratoryAutomation.AddReagent#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(double value);

	/**
	 * Returns the value of the '<em><b>Reagent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reagent</em>' reference.
	 * @see #setReagent(Reagent)
	 * @see laboratoryAutomation.LaboratoryAutomationPackage#getAddReagent_Reagent()
	 * @model required="true"
	 * @generated
	 */
	Reagent getReagent();

	/**
	 * Sets the value of the '{@link laboratoryAutomation.AddReagent#getReagent <em>Reagent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reagent</em>' reference.
	 * @see #getReagent()
	 * @generated
	 */
	void setReagent(Reagent value);

} // AddReagent
