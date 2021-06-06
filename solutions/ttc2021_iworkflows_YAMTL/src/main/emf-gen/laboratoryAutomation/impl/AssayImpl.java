/**
 */
package laboratoryAutomation.impl;

import java.util.Collection;

import laboratoryAutomation.Assay;
import laboratoryAutomation.LaboratoryAutomationPackage;
import laboratoryAutomation.ProtocolStep;
import laboratoryAutomation.Reagent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link laboratoryAutomation.impl.AssayImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link laboratoryAutomation.impl.AssayImpl#getReagents <em>Reagents</em>}</li>
 *   <li>{@link laboratoryAutomation.impl.AssayImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssayImpl extends MinimalEObjectImpl.Container implements Assay {
	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtocolStep> steps;

	/**
	 * The cached value of the '{@link #getReagents() <em>Reagents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReagents()
	 * @generated
	 * @ordered
	 */
	protected EList<Reagent> reagents;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaboratoryAutomationPackage.Literals.ASSAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolStep> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<ProtocolStep>(ProtocolStep.class, this, LaboratoryAutomationPackage.ASSAY__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reagent> getReagents() {
		if (reagents == null) {
			reagents = new EObjectContainmentEList<Reagent>(Reagent.class, this, LaboratoryAutomationPackage.ASSAY__REAGENTS);
		}
		return reagents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaboratoryAutomationPackage.ASSAY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LaboratoryAutomationPackage.ASSAY__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
			case LaboratoryAutomationPackage.ASSAY__REAGENTS:
				return ((InternalEList<?>)getReagents()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LaboratoryAutomationPackage.ASSAY__STEPS:
				return getSteps();
			case LaboratoryAutomationPackage.ASSAY__REAGENTS:
				return getReagents();
			case LaboratoryAutomationPackage.ASSAY__NAME:
				return getName();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LaboratoryAutomationPackage.ASSAY__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends ProtocolStep>)newValue);
				return;
			case LaboratoryAutomationPackage.ASSAY__REAGENTS:
				getReagents().clear();
				getReagents().addAll((Collection<? extends Reagent>)newValue);
				return;
			case LaboratoryAutomationPackage.ASSAY__NAME:
				setName((String)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LaboratoryAutomationPackage.ASSAY__STEPS:
				getSteps().clear();
				return;
			case LaboratoryAutomationPackage.ASSAY__REAGENTS:
				getReagents().clear();
				return;
			case LaboratoryAutomationPackage.ASSAY__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LaboratoryAutomationPackage.ASSAY__STEPS:
				return steps != null && !steps.isEmpty();
			case LaboratoryAutomationPackage.ASSAY__REAGENTS:
				return reagents != null && !reagents.isEmpty();
			case LaboratoryAutomationPackage.ASSAY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AssayImpl
