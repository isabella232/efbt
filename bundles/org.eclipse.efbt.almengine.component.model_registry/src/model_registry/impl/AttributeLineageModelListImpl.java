/**
 */
package model_registry.impl;

import attribute_lineage.AttributeLineageModel;

import java.util.Collection;

import model_registry.AttributeLineageModelList;
import model_registry.Model_registryPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Lineage Model List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model_registry.impl.AttributeLineageModelListImpl#getAttributeLineageModels <em>Attribute Lineage Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeLineageModelListImpl extends MinimalEObjectImpl.Container implements AttributeLineageModelList {
	/**
	 * The cached value of the '{@link #getAttributeLineageModels() <em>Attribute Lineage Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeLineageModels()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeLineageModel> attributeLineageModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeLineageModelListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model_registryPackage.Literals.ATTRIBUTE_LINEAGE_MODEL_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttributeLineageModel> getAttributeLineageModels() {
		if (attributeLineageModels == null) {
			attributeLineageModels = new EObjectContainmentEList<AttributeLineageModel>(AttributeLineageModel.class, this, Model_registryPackage.ATTRIBUTE_LINEAGE_MODEL_LIST__ATTRIBUTE_LINEAGE_MODELS);
		}
		return attributeLineageModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Model_registryPackage.ATTRIBUTE_LINEAGE_MODEL_LIST__ATTRIBUTE_LINEAGE_MODELS:
				return ((InternalEList<?>)getAttributeLineageModels()).basicRemove(otherEnd, msgs);
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
			case Model_registryPackage.ATTRIBUTE_LINEAGE_MODEL_LIST__ATTRIBUTE_LINEAGE_MODELS:
				return getAttributeLineageModels();
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
			case Model_registryPackage.ATTRIBUTE_LINEAGE_MODEL_LIST__ATTRIBUTE_LINEAGE_MODELS:
				getAttributeLineageModels().clear();
				getAttributeLineageModels().addAll((Collection<? extends AttributeLineageModel>)newValue);
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
			case Model_registryPackage.ATTRIBUTE_LINEAGE_MODEL_LIST__ATTRIBUTE_LINEAGE_MODELS:
				getAttributeLineageModels().clear();
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
			case Model_registryPackage.ATTRIBUTE_LINEAGE_MODEL_LIST__ATTRIBUTE_LINEAGE_MODELS:
				return attributeLineageModels != null && !attributeLineageModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AttributeLineageModelListImpl
