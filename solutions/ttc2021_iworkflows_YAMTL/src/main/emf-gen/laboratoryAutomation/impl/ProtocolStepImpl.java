/**
 */
package laboratoryAutomation.impl;

import laboratoryAutomation.LaboratoryAutomationPackage;
import laboratoryAutomation.ProtocolStep;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link laboratoryAutomation.impl.ProtocolStepImpl#getId <em>Id</em>}</li>
 *   <li>{@link laboratoryAutomation.impl.ProtocolStepImpl#getNext <em>Next</em>}</li>
 *   <li>{@link laboratoryAutomation.impl.ProtocolStepImpl#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProtocolStepImpl extends MinimalEObjectImpl.Container implements ProtocolStep {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected ProtocolStep next;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected ProtocolStep previous;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaboratoryAutomationPackage.Literals.PROTOCOL_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaboratoryAutomationPackage.PROTOCOL_STEP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStep getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (ProtocolStep)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LaboratoryAutomationPackage.PROTOCOL_STEP__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStep basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(ProtocolStep newNext, NotificationChain msgs) {
		ProtocolStep oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LaboratoryAutomationPackage.PROTOCOL_STEP__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(ProtocolStep newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, LaboratoryAutomationPackage.PROTOCOL_STEP__PREVIOUS, ProtocolStep.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, LaboratoryAutomationPackage.PROTOCOL_STEP__PREVIOUS, ProtocolStep.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaboratoryAutomationPackage.PROTOCOL_STEP__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStep getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject)previous;
			previous = (ProtocolStep)eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LaboratoryAutomationPackage.PROTOCOL_STEP__PREVIOUS, oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStep basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(ProtocolStep newPrevious, NotificationChain msgs) {
		ProtocolStep oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LaboratoryAutomationPackage.PROTOCOL_STEP__PREVIOUS, oldPrevious, newPrevious);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(ProtocolStep newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject)previous).eInverseRemove(this, LaboratoryAutomationPackage.PROTOCOL_STEP__NEXT, ProtocolStep.class, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, LaboratoryAutomationPackage.PROTOCOL_STEP__NEXT, ProtocolStep.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaboratoryAutomationPackage.PROTOCOL_STEP__PREVIOUS, newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LaboratoryAutomationPackage.PROTOCOL_STEP__NEXT:
				if (next != null)
					msgs = ((InternalEObject)next).eInverseRemove(this, LaboratoryAutomationPackage.PROTOCOL_STEP__PREVIOUS, ProtocolStep.class, msgs);
				return basicSetNext((ProtocolStep)otherEnd, msgs);
			case LaboratoryAutomationPackage.PROTOCOL_STEP__PREVIOUS:
				if (previous != null)
					msgs = ((InternalEObject)previous).eInverseRemove(this, LaboratoryAutomationPackage.PROTOCOL_STEP__NEXT, ProtocolStep.class, msgs);
				return basicSetPrevious((ProtocolStep)otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LaboratoryAutomationPackage.PROTOCOL_STEP__NEXT:
				return basicSetNext(null, msgs);
			case LaboratoryAutomationPackage.PROTOCOL_STEP__PREVIOUS:
				return basicSetPrevious(null, msgs);
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
			case LaboratoryAutomationPackage.PROTOCOL_STEP__ID:
				return getId();
			case LaboratoryAutomationPackage.PROTOCOL_STEP__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case LaboratoryAutomationPackage.PROTOCOL_STEP__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
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
			case LaboratoryAutomationPackage.PROTOCOL_STEP__ID:
				setId((String)newValue);
				return;
			case LaboratoryAutomationPackage.PROTOCOL_STEP__NEXT:
				setNext((ProtocolStep)newValue);
				return;
			case LaboratoryAutomationPackage.PROTOCOL_STEP__PREVIOUS:
				setPrevious((ProtocolStep)newValue);
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
			case LaboratoryAutomationPackage.PROTOCOL_STEP__ID:
				setId(ID_EDEFAULT);
				return;
			case LaboratoryAutomationPackage.PROTOCOL_STEP__NEXT:
				setNext((ProtocolStep)null);
				return;
			case LaboratoryAutomationPackage.PROTOCOL_STEP__PREVIOUS:
				setPrevious((ProtocolStep)null);
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
			case LaboratoryAutomationPackage.PROTOCOL_STEP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case LaboratoryAutomationPackage.PROTOCOL_STEP__NEXT:
				return next != null;
			case LaboratoryAutomationPackage.PROTOCOL_STEP__PREVIOUS:
				return previous != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ProtocolStepImpl
