/**
 */
package laboratoryAutomation.impl;

import laboratoryAutomation.AddReagent;
import laboratoryAutomation.LaboratoryAutomationPackage;
import laboratoryAutomation.ProtocolStep;
import laboratoryAutomation.Reagent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Reagent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link laboratoryAutomation.impl.AddReagentImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link laboratoryAutomation.impl.AddReagentImpl#getReagent <em>Reagent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddReagentImpl extends ProtocolStepImpl implements AddReagent {
	/**
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLUME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected double volume = VOLUME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReagent() <em>Reagent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReagent()
	 * @generated
	 * @ordered
	 */
	protected Reagent reagent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddReagentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaboratoryAutomationPackage.Literals.ADD_REAGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(double newVolume) {
		double oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaboratoryAutomationPackage.ADD_REAGENT__VOLUME, oldVolume, volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reagent getReagent() {
		if (reagent != null && reagent.eIsProxy()) {
			InternalEObject oldReagent = (InternalEObject)reagent;
			reagent = (Reagent)eResolveProxy(oldReagent);
			if (reagent != oldReagent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LaboratoryAutomationPackage.ADD_REAGENT__REAGENT, oldReagent, reagent));
			}
		}
		return reagent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reagent basicGetReagent() {
		return reagent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReagent(Reagent newReagent) {
		Reagent oldReagent = reagent;
		reagent = newReagent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaboratoryAutomationPackage.ADD_REAGENT__REAGENT, oldReagent, reagent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LaboratoryAutomationPackage.ADD_REAGENT__ID:
				return getId();
			case LaboratoryAutomationPackage.ADD_REAGENT__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case LaboratoryAutomationPackage.ADD_REAGENT__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case LaboratoryAutomationPackage.ADD_REAGENT__VOLUME:
				return getVolume();
			case LaboratoryAutomationPackage.ADD_REAGENT__REAGENT:
				if (resolve) return getReagent();
				return basicGetReagent();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LaboratoryAutomationPackage.ADD_REAGENT__ID:
				setId((String)newValue);
				return;
			case LaboratoryAutomationPackage.ADD_REAGENT__NEXT:
				setNext((ProtocolStep)newValue);
				return;
			case LaboratoryAutomationPackage.ADD_REAGENT__PREVIOUS:
				setPrevious((ProtocolStep)newValue);
				return;
			case LaboratoryAutomationPackage.ADD_REAGENT__VOLUME:
				setVolume((Double)newValue);
				return;
			case LaboratoryAutomationPackage.ADD_REAGENT__REAGENT:
				setReagent((Reagent)newValue);
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
			case LaboratoryAutomationPackage.ADD_REAGENT__ID:
				setId(ID_EDEFAULT);
				return;
			case LaboratoryAutomationPackage.ADD_REAGENT__NEXT:
				setNext((ProtocolStep)null);
				return;
			case LaboratoryAutomationPackage.ADD_REAGENT__PREVIOUS:
				setPrevious((ProtocolStep)null);
				return;
			case LaboratoryAutomationPackage.ADD_REAGENT__VOLUME:
				setVolume(VOLUME_EDEFAULT);
				return;
			case LaboratoryAutomationPackage.ADD_REAGENT__REAGENT:
				setReagent((Reagent)null);
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
			case LaboratoryAutomationPackage.ADD_REAGENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case LaboratoryAutomationPackage.ADD_REAGENT__NEXT:
				return next != null;
			case LaboratoryAutomationPackage.ADD_REAGENT__PREVIOUS:
				return previous != null;
			case LaboratoryAutomationPackage.ADD_REAGENT__VOLUME:
				return volume != VOLUME_EDEFAULT;
			case LaboratoryAutomationPackage.ADD_REAGENT__REAGENT:
				return reagent != null;
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
		result.append(" (volume: ");
		result.append(volume);
		result.append(')');
		return result.toString();
	}

} //AddReagentImpl
