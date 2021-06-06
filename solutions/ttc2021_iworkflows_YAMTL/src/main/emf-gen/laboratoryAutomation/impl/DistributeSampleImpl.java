/**
 */
package laboratoryAutomation.impl;

import laboratoryAutomation.DistributeSample;
import laboratoryAutomation.LaboratoryAutomationPackage;
import laboratoryAutomation.ProtocolStep;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distribute Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link laboratoryAutomation.impl.DistributeSampleImpl#getVolume <em>Volume</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistributeSampleImpl extends ProtocolStepImpl implements DistributeSample {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistributeSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaboratoryAutomationPackage.Literals.DISTRIBUTE_SAMPLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LaboratoryAutomationPackage.DISTRIBUTE_SAMPLE__VOLUME, oldVolume, volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LaboratoryAutomationPackage.DISTRIBUTE_SAMPLE__ID:
				return getId();
			case LaboratoryAutomationPackage.DISTRIBUTE_SAMPLE__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case LaboratoryAutomationPackage.DISTRIBUTE_SAMPLE__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case LaboratoryAutomationPackage.DISTRIBUTE_SAMPLE__VOLUME:
				return getVolume();
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
			case LaboratoryAutomationPackage.DISTRIBUTE_SAMPLE__ID:
				setId((String)newValue);
				return;
			case LaboratoryAutomationPackage.DISTRIBUTE_SAMPLE__NEXT:
				setNext((ProtocolStep)newValue);
				return;
			case LaboratoryAutomationPackage.DISTRIBUTE_SAMPLE__PREVIOUS:
				setPrevious((ProtocolStep)newValue);
				return;
			case LaboratoryAutomationPackage.DISTRIBUTE_SAMPLE__VOLUME:
				setVolume((Double)newValue);
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
			case LaboratoryAutomationPackage.DISTRIBUTE_SAMPLE__ID:
				setId(ID_EDEFAULT);
				return;
			case LaboratoryAutomationPackage.DISTRIBUTE_SAMPLE__NEXT:
				setNext((ProtocolStep)null);
				return;
			case LaboratoryAutomationPackage.DISTRIBUTE_SAMPLE__PREVIOUS:
				setPrevious((ProtocolStep)null);
				return;
			case LaboratoryAutomationPackage.DISTRIBUTE_SAMPLE__VOLUME:
				setVolume(VOLUME_EDEFAULT);
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
			case LaboratoryAutomationPackage.DISTRIBUTE_SAMPLE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case LaboratoryAutomationPackage.DISTRIBUTE_SAMPLE__NEXT:
				return next != null;
			case LaboratoryAutomationPackage.DISTRIBUTE_SAMPLE__PREVIOUS:
				return previous != null;
			case LaboratoryAutomationPackage.DISTRIBUTE_SAMPLE__VOLUME:
				return volume != VOLUME_EDEFAULT;
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

} //DistributeSampleImpl
