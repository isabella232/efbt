/**
 */
package model_registry.impl;

import attribute_lineage.AttributeLineageModel;

import model_registry.Model_registryPackage;
import model_registry.ReleaseAndAttributeLineageModelPair;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import transformation.VersionedComponentsSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Release And Attribute Lineage Model Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model_registry.impl.ReleaseAndAttributeLineageModelPairImpl#getRelease <em>Release</em>}</li>
 *   <li>{@link model_registry.impl.ReleaseAndAttributeLineageModelPairImpl#getAttributeLineageModel <em>Attribute Lineage Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReleaseAndAttributeLineageModelPairImpl extends MinimalEObjectImpl.Container implements ReleaseAndAttributeLineageModelPair {
	/**
	 * The cached value of the '{@link #getRelease() <em>Release</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelease()
	 * @generated
	 * @ordered
	 */
	protected VersionedComponentsSet release;

	/**
	 * The cached value of the '{@link #getAttributeLineageModel() <em>Attribute Lineage Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeLineageModel()
	 * @generated
	 * @ordered
	 */
	protected AttributeLineageModel attributeLineageModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReleaseAndAttributeLineageModelPairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model_registryPackage.Literals.RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionedComponentsSet getRelease() {
		if (release != null && release.eIsProxy()) {
			InternalEObject oldRelease = (InternalEObject)release;
			release = (VersionedComponentsSet)eResolveProxy(oldRelease);
			if (release != oldRelease) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model_registryPackage.RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR__RELEASE, oldRelease, release));
			}
		}
		return release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedComponentsSet basicGetRelease() {
		return release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelease(VersionedComponentsSet newRelease) {
		VersionedComponentsSet oldRelease = release;
		release = newRelease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model_registryPackage.RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR__RELEASE, oldRelease, release));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeLineageModel getAttributeLineageModel() {
		if (attributeLineageModel != null && attributeLineageModel.eIsProxy()) {
			InternalEObject oldAttributeLineageModel = (InternalEObject)attributeLineageModel;
			attributeLineageModel = (AttributeLineageModel)eResolveProxy(oldAttributeLineageModel);
			if (attributeLineageModel != oldAttributeLineageModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model_registryPackage.RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR__ATTRIBUTE_LINEAGE_MODEL, oldAttributeLineageModel, attributeLineageModel));
			}
		}
		return attributeLineageModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeLineageModel basicGetAttributeLineageModel() {
		return attributeLineageModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributeLineageModel(AttributeLineageModel newAttributeLineageModel) {
		AttributeLineageModel oldAttributeLineageModel = attributeLineageModel;
		attributeLineageModel = newAttributeLineageModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model_registryPackage.RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR__ATTRIBUTE_LINEAGE_MODEL, oldAttributeLineageModel, attributeLineageModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Model_registryPackage.RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR__RELEASE:
				if (resolve) return getRelease();
				return basicGetRelease();
			case Model_registryPackage.RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR__ATTRIBUTE_LINEAGE_MODEL:
				if (resolve) return getAttributeLineageModel();
				return basicGetAttributeLineageModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Model_registryPackage.RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR__RELEASE:
				setRelease((VersionedComponentsSet)newValue);
				return;
			case Model_registryPackage.RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR__ATTRIBUTE_LINEAGE_MODEL:
				setAttributeLineageModel((AttributeLineageModel)newValue);
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
			case Model_registryPackage.RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR__RELEASE:
				setRelease((VersionedComponentsSet)null);
				return;
			case Model_registryPackage.RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR__ATTRIBUTE_LINEAGE_MODEL:
				setAttributeLineageModel((AttributeLineageModel)null);
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
			case Model_registryPackage.RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR__RELEASE:
				return release != null;
			case Model_registryPackage.RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR__ATTRIBUTE_LINEAGE_MODEL:
				return attributeLineageModel != null;
		}
		return super.eIsSet(featureID);
	}

} //ReleaseAndAttributeLineageModelPairImpl
