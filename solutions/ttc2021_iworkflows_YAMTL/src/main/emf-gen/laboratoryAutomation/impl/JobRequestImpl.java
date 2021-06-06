/**
 */
package laboratoryAutomation.impl;

import java.util.Collection;

import laboratoryAutomation.Assay;
import laboratoryAutomation.JobRequest;
import laboratoryAutomation.LaboratoryAutomationPackage;
import laboratoryAutomation.Sample;

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
 * An implementation of the model object '<em><b>Job Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link laboratoryAutomation.impl.JobRequestImpl#getAssay <em>Assay</em>}</li>
 *   <li>{@link laboratoryAutomation.impl.JobRequestImpl#getSamples <em>Samples</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobRequestImpl extends MinimalEObjectImpl.Container implements JobRequest {
	/**
	 * The cached value of the '{@link #getAssay() <em>Assay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssay()
	 * @generated
	 * @ordered
	 */
	protected Assay assay;

	/**
	 * The cached value of the '{@link #getSamples() <em>Samples</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamples()
	 * @generated
	 * @ordered
	 */
	protected EList<Sample> samples;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaboratoryAutomationPackage.Literals.JOB_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assay getAssay() {
		return assay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssay(Assay newAssay, NotificationChain msgs) {
		Assay oldAssay = assay;
		assay = newAssay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LaboratoryAutomationPackage.JOB_REQUEST__ASSAY, oldAssay, newAssay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssay(Assay newAssay) {
		if (newAssay != assay) {
			NotificationChain msgs = null;
			if (assay != null)
				msgs = ((InternalEObject)assay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LaboratoryAutomationPackage.JOB_REQUEST__ASSAY, null, msgs);
			if (newAssay != null)
				msgs = ((InternalEObject)newAssay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LaboratoryAutomationPackage.JOB_REQUEST__ASSAY, null, msgs);
			msgs = basicSetAssay(newAssay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaboratoryAutomationPackage.JOB_REQUEST__ASSAY, newAssay, newAssay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sample> getSamples() {
		if (samples == null) {
			samples = new EObjectContainmentEList<Sample>(Sample.class, this, LaboratoryAutomationPackage.JOB_REQUEST__SAMPLES);
		}
		return samples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LaboratoryAutomationPackage.JOB_REQUEST__ASSAY:
				return basicSetAssay(null, msgs);
			case LaboratoryAutomationPackage.JOB_REQUEST__SAMPLES:
				return ((InternalEList<?>)getSamples()).basicRemove(otherEnd, msgs);
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
			case LaboratoryAutomationPackage.JOB_REQUEST__ASSAY:
				return getAssay();
			case LaboratoryAutomationPackage.JOB_REQUEST__SAMPLES:
				return getSamples();
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
			case LaboratoryAutomationPackage.JOB_REQUEST__ASSAY:
				setAssay((Assay)newValue);
				return;
			case LaboratoryAutomationPackage.JOB_REQUEST__SAMPLES:
				getSamples().clear();
				getSamples().addAll((Collection<? extends Sample>)newValue);
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
			case LaboratoryAutomationPackage.JOB_REQUEST__ASSAY:
				setAssay((Assay)null);
				return;
			case LaboratoryAutomationPackage.JOB_REQUEST__SAMPLES:
				getSamples().clear();
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
			case LaboratoryAutomationPackage.JOB_REQUEST__ASSAY:
				return assay != null;
			case LaboratoryAutomationPackage.JOB_REQUEST__SAMPLES:
				return samples != null && !samples.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //JobRequestImpl
