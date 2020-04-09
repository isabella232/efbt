/**
 */
package model_registry.impl;

import attribute_lineage.AttributeLineageModel;

import bird_model.BIRDModel;

import model_registry.BirdArtefactsAndAttributeLineagePair;
import model_registry.Model_registryPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bird Artefacts And Attribute Lineage Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model_registry.impl.BirdArtefactsAndAttributeLineagePairImpl#getBird_model <em>Bird model</em>}</li>
 *   <li>{@link model_registry.impl.BirdArtefactsAndAttributeLineagePairImpl#getAttribute_lineage_model <em>Attribute lineage model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BirdArtefactsAndAttributeLineagePairImpl extends MinimalEObjectImpl.Container implements BirdArtefactsAndAttributeLineagePair {
	/**
	 * The cached value of the '{@link #getBird_model() <em>Bird model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBird_model()
	 * @generated
	 * @ordered
	 */
	protected BIRDModel bird_model;

	/**
	 * The cached value of the '{@link #getAttribute_lineage_model() <em>Attribute lineage model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute_lineage_model()
	 * @generated
	 * @ordered
	 */
	protected AttributeLineageModel attribute_lineage_model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BirdArtefactsAndAttributeLineagePairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model_registryPackage.Literals.BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BIRDModel getBird_model() {
		if (bird_model != null && bird_model.eIsProxy()) {
			InternalEObject oldBird_model = (InternalEObject)bird_model;
			bird_model = (BIRDModel)eResolveProxy(oldBird_model);
			if (bird_model != oldBird_model) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model_registryPackage.BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR__BIRD_MODEL, oldBird_model, bird_model));
			}
		}
		return bird_model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BIRDModel basicGetBird_model() {
		return bird_model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBird_model(BIRDModel newBird_model) {
		BIRDModel oldBird_model = bird_model;
		bird_model = newBird_model;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model_registryPackage.BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR__BIRD_MODEL, oldBird_model, bird_model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeLineageModel getAttribute_lineage_model() {
		if (attribute_lineage_model != null && attribute_lineage_model.eIsProxy()) {
			InternalEObject oldAttribute_lineage_model = (InternalEObject)attribute_lineage_model;
			attribute_lineage_model = (AttributeLineageModel)eResolveProxy(oldAttribute_lineage_model);
			if (attribute_lineage_model != oldAttribute_lineage_model) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model_registryPackage.BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR__ATTRIBUTE_LINEAGE_MODEL, oldAttribute_lineage_model, attribute_lineage_model));
			}
		}
		return attribute_lineage_model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeLineageModel basicGetAttribute_lineage_model() {
		return attribute_lineage_model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttribute_lineage_model(AttributeLineageModel newAttribute_lineage_model) {
		AttributeLineageModel oldAttribute_lineage_model = attribute_lineage_model;
		attribute_lineage_model = newAttribute_lineage_model;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model_registryPackage.BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR__ATTRIBUTE_LINEAGE_MODEL, oldAttribute_lineage_model, attribute_lineage_model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Model_registryPackage.BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR__BIRD_MODEL:
				if (resolve) return getBird_model();
				return basicGetBird_model();
			case Model_registryPackage.BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR__ATTRIBUTE_LINEAGE_MODEL:
				if (resolve) return getAttribute_lineage_model();
				return basicGetAttribute_lineage_model();
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
			case Model_registryPackage.BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR__BIRD_MODEL:
				setBird_model((BIRDModel)newValue);
				return;
			case Model_registryPackage.BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR__ATTRIBUTE_LINEAGE_MODEL:
				setAttribute_lineage_model((AttributeLineageModel)newValue);
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
			case Model_registryPackage.BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR__BIRD_MODEL:
				setBird_model((BIRDModel)null);
				return;
			case Model_registryPackage.BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR__ATTRIBUTE_LINEAGE_MODEL:
				setAttribute_lineage_model((AttributeLineageModel)null);
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
			case Model_registryPackage.BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR__BIRD_MODEL:
				return bird_model != null;
			case Model_registryPackage.BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR__ATTRIBUTE_LINEAGE_MODEL:
				return attribute_lineage_model != null;
		}
		return super.eIsSet(featureID);
	}

} //BirdArtefactsAndAttributeLineagePairImpl
