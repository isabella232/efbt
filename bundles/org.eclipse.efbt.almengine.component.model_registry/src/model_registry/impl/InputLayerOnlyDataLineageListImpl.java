/**
 */
package model_registry.impl;

import data_lineage.SpreadsheetLineageModel;

import java.util.Collection;

import model_registry.InputLayerOnlyDataLineageList;
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
 * An implementation of the model object '<em><b>Input Layer Only Data Lineage List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model_registry.impl.InputLayerOnlyDataLineageListImpl#getList <em>List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputLayerOnlyDataLineageListImpl extends MinimalEObjectImpl.Container implements InputLayerOnlyDataLineageList {
	/**
	 * The cached value of the '{@link #getList() <em>List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList()
	 * @generated
	 * @ordered
	 */
	protected EList<SpreadsheetLineageModel> list;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputLayerOnlyDataLineageListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model_registryPackage.Literals.INPUT_LAYER_ONLY_DATA_LINEAGE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpreadsheetLineageModel> getList() {
		if (list == null) {
			list = new EObjectContainmentEList<SpreadsheetLineageModel>(SpreadsheetLineageModel.class, this, Model_registryPackage.INPUT_LAYER_ONLY_DATA_LINEAGE_LIST__LIST);
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Model_registryPackage.INPUT_LAYER_ONLY_DATA_LINEAGE_LIST__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
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
			case Model_registryPackage.INPUT_LAYER_ONLY_DATA_LINEAGE_LIST__LIST:
				return getList();
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
			case Model_registryPackage.INPUT_LAYER_ONLY_DATA_LINEAGE_LIST__LIST:
				getList().clear();
				getList().addAll((Collection<? extends SpreadsheetLineageModel>)newValue);
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
			case Model_registryPackage.INPUT_LAYER_ONLY_DATA_LINEAGE_LIST__LIST:
				getList().clear();
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
			case Model_registryPackage.INPUT_LAYER_ONLY_DATA_LINEAGE_LIST__LIST:
				return list != null && !list.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InputLayerOnlyDataLineageListImpl
