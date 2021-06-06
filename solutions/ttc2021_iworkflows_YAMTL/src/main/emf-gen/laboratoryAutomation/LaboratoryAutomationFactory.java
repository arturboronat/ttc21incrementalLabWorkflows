/**
 */
package laboratoryAutomation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see laboratoryAutomation.LaboratoryAutomationPackage
 * @generated
 */
public interface LaboratoryAutomationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LaboratoryAutomationFactory eINSTANCE = laboratoryAutomation.impl.LaboratoryAutomationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Assay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assay</em>'.
	 * @generated
	 */
	Assay createAssay();

	/**
	 * Returns a new object of class '<em>Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sample</em>'.
	 * @generated
	 */
	Sample createSample();

	/**
	 * Returns a new object of class '<em>Job Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Request</em>'.
	 * @generated
	 */
	JobRequest createJobRequest();

	/**
	 * Returns a new object of class '<em>Add Reagent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Reagent</em>'.
	 * @generated
	 */
	AddReagent createAddReagent();

	/**
	 * Returns a new object of class '<em>Distribute Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distribute Sample</em>'.
	 * @generated
	 */
	DistributeSample createDistributeSample();

	/**
	 * Returns a new object of class '<em>Reagent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reagent</em>'.
	 * @generated
	 */
	Reagent createReagent();

	/**
	 * Returns a new object of class '<em>Incubate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Incubate</em>'.
	 * @generated
	 */
	Incubate createIncubate();

	/**
	 * Returns a new object of class '<em>Wash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wash</em>'.
	 * @generated
	 */
	Wash createWash();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LaboratoryAutomationPackage getLaboratoryAutomationPackage();

} //LaboratoryAutomationFactory
