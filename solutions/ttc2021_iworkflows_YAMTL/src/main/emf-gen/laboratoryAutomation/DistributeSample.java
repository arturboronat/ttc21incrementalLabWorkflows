/**
 */
package laboratoryAutomation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distribute Sample</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link laboratoryAutomation.DistributeSample#getVolume <em>Volume</em>}</li>
 * </ul>
 *
 * @see laboratoryAutomation.LaboratoryAutomationPackage#getDistributeSample()
 * @model
 * @generated
 */
public interface DistributeSample extends ProtocolStep {
	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(double)
	 * @see laboratoryAutomation.LaboratoryAutomationPackage#getDistributeSample_Volume()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getVolume();

	/**
	 * Sets the value of the '{@link laboratoryAutomation.DistributeSample#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(double value);

} // DistributeSample
