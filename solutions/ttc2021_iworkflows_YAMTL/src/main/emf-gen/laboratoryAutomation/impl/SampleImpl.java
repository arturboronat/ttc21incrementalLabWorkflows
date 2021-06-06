/**
 */
package laboratoryAutomation.impl;

import laboratoryAutomation.LaboratoryAutomationPackage;
import laboratoryAutomation.Sample;
import laboratoryAutomation.SampleState;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link laboratoryAutomation.impl.SampleImpl#getSampleID <em>Sample ID</em>}</li>
 *   <li>{@link laboratoryAutomation.impl.SampleImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SampleImpl extends MinimalEObjectImpl.Container implements Sample {
	/**
	 * The default value of the '{@link #getSampleID() <em>Sample ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleID()
	 * @generated
	 * @ordered
	 */
	protected static final String SAMPLE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSampleID() <em>Sample ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleID()
	 * @generated
	 * @ordered
	 */
	protected String sampleID = SAMPLE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final SampleState STATE_EDEFAULT = SampleState.WAITING;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected SampleState state = STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaboratoryAutomationPackage.Literals.SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSampleID() {
		return sampleID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleID(String newSampleID) {
		String oldSampleID = sampleID;
		sampleID = newSampleID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaboratoryAutomationPackage.SAMPLE__SAMPLE_ID, oldSampleID, sampleID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(SampleState newState) {
		SampleState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaboratoryAutomationPackage.SAMPLE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LaboratoryAutomationPackage.SAMPLE__SAMPLE_ID:
				return getSampleID();
			case LaboratoryAutomationPackage.SAMPLE__STATE:
				return getState();
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
			case LaboratoryAutomationPackage.SAMPLE__SAMPLE_ID:
				setSampleID((String)newValue);
				return;
			case LaboratoryAutomationPackage.SAMPLE__STATE:
				setState((SampleState)newValue);
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
			case LaboratoryAutomationPackage.SAMPLE__SAMPLE_ID:
				setSampleID(SAMPLE_ID_EDEFAULT);
				return;
			case LaboratoryAutomationPackage.SAMPLE__STATE:
				setState(STATE_EDEFAULT);
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
			case LaboratoryAutomationPackage.SAMPLE__SAMPLE_ID:
				return SAMPLE_ID_EDEFAULT == null ? sampleID != null : !SAMPLE_ID_EDEFAULT.equals(sampleID);
			case LaboratoryAutomationPackage.SAMPLE__STATE:
				return state != STATE_EDEFAULT;
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
		result.append(" (sampleID: ");
		result.append(sampleID);
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //SampleImpl
