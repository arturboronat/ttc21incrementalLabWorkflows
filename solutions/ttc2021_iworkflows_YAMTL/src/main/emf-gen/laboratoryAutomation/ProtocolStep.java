/**
 */
package laboratoryAutomation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link laboratoryAutomation.ProtocolStep#getId <em>Id</em>}</li>
 *   <li>{@link laboratoryAutomation.ProtocolStep#getNext <em>Next</em>}</li>
 *   <li>{@link laboratoryAutomation.ProtocolStep#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @see laboratoryAutomation.LaboratoryAutomationPackage#getProtocolStep()
 * @model abstract="true"
 * @generated
 */
public interface ProtocolStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see laboratoryAutomation.LaboratoryAutomationPackage#getProtocolStep_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link laboratoryAutomation.ProtocolStep#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link laboratoryAutomation.ProtocolStep#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(ProtocolStep)
	 * @see laboratoryAutomation.LaboratoryAutomationPackage#getProtocolStep_Next()
	 * @see laboratoryAutomation.ProtocolStep#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	ProtocolStep getNext();

	/**
	 * Sets the value of the '{@link laboratoryAutomation.ProtocolStep#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(ProtocolStep value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link laboratoryAutomation.ProtocolStep#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(ProtocolStep)
	 * @see laboratoryAutomation.LaboratoryAutomationPackage#getProtocolStep_Previous()
	 * @see laboratoryAutomation.ProtocolStep#getNext
	 * @model opposite="next"
	 * @generated
	 */
	ProtocolStep getPrevious();

	/**
	 * Sets the value of the '{@link laboratoryAutomation.ProtocolStep#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(ProtocolStep value);

} // ProtocolStep
