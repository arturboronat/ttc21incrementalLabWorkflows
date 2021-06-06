/**
 */
package laboratoryAutomation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sample</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link laboratoryAutomation.Sample#getSampleID <em>Sample ID</em>}</li>
 *   <li>{@link laboratoryAutomation.Sample#getState <em>State</em>}</li>
 * </ul>
 *
 * @see laboratoryAutomation.LaboratoryAutomationPackage#getSample()
 * @model
 * @generated
 */
public interface Sample extends EObject {
	/**
	 * Returns the value of the '<em><b>Sample ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample ID</em>' attribute.
	 * @see #setSampleID(String)
	 * @see laboratoryAutomation.LaboratoryAutomationPackage#getSample_SampleID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getSampleID();

	/**
	 * Sets the value of the '{@link laboratoryAutomation.Sample#getSampleID <em>Sample ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample ID</em>' attribute.
	 * @see #getSampleID()
	 * @generated
	 */
	void setSampleID(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link laboratoryAutomation.SampleState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see laboratoryAutomation.SampleState
	 * @see #setState(SampleState)
	 * @see laboratoryAutomation.LaboratoryAutomationPackage#getSample_State()
	 * @model required="true"
	 * @generated
	 */
	SampleState getState();

	/**
	 * Sets the value of the '{@link laboratoryAutomation.Sample#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see laboratoryAutomation.SampleState
	 * @see #getState()
	 * @generated
	 */
	void setState(SampleState value);

} // Sample
