/**
 */
package frameweb.impl;

import frameweb.DomainAttribute;
import frameweb.DomainClass;
import frameweb.DomainOperation;
import frameweb.FramewebPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.internal.impl.ClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DomainClassImpl#getDomainClassAttribute <em>Domain Class Attribute</em>}</li>
 *   <li>{@link frameweb.impl.DomainClassImpl#getDomainClassOperation <em>Domain Class Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DomainClassImpl extends ClassImpl implements DomainClass {
	/**
	 * The cached value of the '{@link #getDomainClassAttribute() <em>Domain Class Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainClassAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainAttribute> domainClassAttribute;

	/**
	 * The cached value of the '{@link #getDomainClassOperation() <em>Domain Class Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainClassOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainOperation> domainClassOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DOMAIN_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainAttribute> getDomainClassAttribute() {
		if (domainClassAttribute == null) {
			domainClassAttribute = new EObjectContainmentEList<DomainAttribute>(DomainAttribute.class, this, FramewebPackage.DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE);
		}
		return domainClassAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainOperation> getDomainClassOperation() {
		if (domainClassOperation == null) {
			domainClassOperation = new EObjectContainmentEList<DomainOperation>(DomainOperation.class, this, FramewebPackage.DOMAIN_CLASS__DOMAIN_CLASS_OPERATION);
		}
		return domainClassOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE:
				return ((InternalEList<?>)getDomainClassAttribute()).basicRemove(otherEnd, msgs);
			case FramewebPackage.DOMAIN_CLASS__DOMAIN_CLASS_OPERATION:
				return ((InternalEList<?>)getDomainClassOperation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE:
				return getDomainClassAttribute();
			case FramewebPackage.DOMAIN_CLASS__DOMAIN_CLASS_OPERATION:
				return getDomainClassOperation();
		}
		return super.eGet(featureID, resolve, coreType);
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
			case FramewebPackage.DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE:
				getDomainClassAttribute().clear();
				getDomainClassAttribute().addAll((Collection<? extends DomainAttribute>)newValue);
				return;
			case FramewebPackage.DOMAIN_CLASS__DOMAIN_CLASS_OPERATION:
				getDomainClassOperation().clear();
				getDomainClassOperation().addAll((Collection<? extends DomainOperation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FramewebPackage.DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE:
				getDomainClassAttribute().clear();
				return;
			case FramewebPackage.DOMAIN_CLASS__DOMAIN_CLASS_OPERATION:
				getDomainClassOperation().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FramewebPackage.DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE:
				return domainClassAttribute != null && !domainClassAttribute.isEmpty();
			case FramewebPackage.DOMAIN_CLASS__DOMAIN_CLASS_OPERATION:
				return domainClassOperation != null && !domainClassOperation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainClassImpl