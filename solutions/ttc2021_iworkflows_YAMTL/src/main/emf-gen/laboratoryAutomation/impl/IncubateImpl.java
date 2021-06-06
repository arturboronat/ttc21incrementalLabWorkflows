/**
 */
package laboratoryAutomation.impl;

import laboratoryAutomation.Incubate;
import laboratoryAutomation.LaboratoryAutomationPackage;
import laboratoryAutomation.ProtocolStep;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incubate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link laboratoryAutomation.impl.IncubateImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link laboratoryAutomation.impl.IncubateImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncubateImpl extends ProtocolStepImpl implements Incubate {
	/**
	 * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final double TEMPERATURE_EDEFAULT = 293.15;

	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected double temperature = TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncubateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaboratoryAutomationPackage.Literals.INCUBATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperature(double newTemperature) {
		double oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaboratoryAutomationPackage.INCUBATE__TEMPERATURE, oldTemperature, temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaboratoryAutomationPackage.INCUBATE__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LaboratoryAutomationPackage.INCUBATE__ID:
				return getId();
			case LaboratoryAutomationPackage.INCUBATE__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case LaboratoryAutomationPackage.INCUBATE__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case LaboratoryAutomationPackage.INCUBATE__TEMPERATURE:
				return getTemperature();
			case LaboratoryAutomationPackage.INCUBATE__DURATION:
				return getDuration();
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
			case LaboratoryAutomationPackage.INCUBATE__ID:
				setId((String)newValue);
				return;
			case LaboratoryAutomationPackage.INCUBATE__NEXT:
				setNext((ProtocolStep)newValue);
				return;
			case LaboratoryAutomationPackage.INCUBATE__PREVIOUS:
				setPrevious((ProtocolStep)newValue);
				return;
			case LaboratoryAutomationPackage.INCUBATE__TEMPERATURE:
				setTemperature((Double)newValue);
				return;
			case LaboratoryAutomationPackage.INCUBATE__DURATION:
				setDuration((Integer)newValue);
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
			case LaboratoryAutomationPackage.INCUBATE__ID:
				setId(ID_EDEFAULT);
				return;
			case LaboratoryAutomationPackage.INCUBATE__NEXT:
				setNext((ProtocolStep)null);
				return;
			case LaboratoryAutomationPackage.INCUBATE__PREVIOUS:
				setPrevious((ProtocolStep)null);
				return;
			case LaboratoryAutomationPackage.INCUBATE__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
				return;
			case LaboratoryAutomationPackage.INCUBATE__DURATION:
				setDuration(DURATION_EDEFAULT);
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
			case LaboratoryAutomationPackage.INCUBATE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case LaboratoryAutomationPackage.INCUBATE__NEXT:
				return next != null;
			case LaboratoryAutomationPackage.INCUBATE__PREVIOUS:
				return previous != null;
			case LaboratoryAutomationPackage.INCUBATE__TEMPERATURE:
				return temperature != TEMPERATURE_EDEFAULT;
			case LaboratoryAutomationPackage.INCUBATE__DURATION:
				return duration != DURATION_EDEFAULT;
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
		result.append(" (temperature: ");
		result.append(temperature);
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //IncubateImpl
