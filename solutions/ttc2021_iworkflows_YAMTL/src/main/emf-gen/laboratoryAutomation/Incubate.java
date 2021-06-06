/**
 */
package laboratoryAutomation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incubate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link laboratoryAutomation.Incubate#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link laboratoryAutomation.Incubate#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see laboratoryAutomation.LaboratoryAutomationPackage#getIncubate()
 * @model
 * @generated
 */
public interface Incubate extends ProtocolStep {
	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * The default value is <code>"293.15"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(double)
	 * @see laboratoryAutomation.LaboratoryAutomationPackage#getIncubate_Temperature()
	 * @model default="293.15" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getTemperature();

	/**
	 * Sets the value of the '{@link laboratoryAutomation.Incubate#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(double value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see laboratoryAutomation.LaboratoryAutomationPackage#getIncubate_Duration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link laboratoryAutomation.Incubate#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

} // Incubate
