/**
 */
package model_registry.impl;

import attribute_lineage.AttributeLineageModel;

import data_lineage.SpreadsheetLineageModel;

import model_registry.DataLineageAndInputDataAndAttributeLineageTriple;
import model_registry.Model_registryPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Lineage And Input Data And Attribute Lineage Triple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model_registry.impl.DataLineageAndInputDataAndAttributeLineageTripleImpl#getInputData <em>Input Data</em>}</li>
 *   <li>{@link model_registry.impl.DataLineageAndInputDataAndAttributeLineageTripleImpl#getResultsData <em>Results Data</em>}</li>
 *   <li>{@link model_registry.impl.DataLineageAndInputDataAndAttributeLineageTripleImpl#getAttributeLineageModel <em>Attribute Lineage Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataLineageAndInputDataAndAttributeLineageTripleImpl extends MinimalEObjectImpl.Container implements DataLineageAndInputDataAndAttributeLineageTriple {
	/**
	 * The cached value of the '{@link #getInputData() <em>Input Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputData()
	 * @generated
	 * @ordered
	 */
	protected SpreadsheetLineageModel inputData;

	/**
	 * The cached value of the '{@link #getResultsData() <em>Results Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsData()
	 * @generated
	 * @ordered
	 */
	protected SpreadsheetLineageModel resultsData;

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
	protected DataLineageAndInputDataAndAttributeLineageTripleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model_registryPackage.Literals.DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpreadsheetLineageModel getInputData() {
		if (inputData != null && inputData.eIsProxy()) {
			InternalEObject oldInputData = (InternalEObject)inputData;
			inputData = (SpreadsheetLineageModel)eResolveProxy(oldInputData);
			if (inputData != oldInputData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model_registryPackage.DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__INPUT_DATA, oldInputData, inputData));
			}
		}
		return inputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetLineageModel basicGetInputData() {
		return inputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputData(SpreadsheetLineageModel newInputData) {
		SpreadsheetLineageModel oldInputData = inputData;
		inputData = newInputData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model_registryPackage.DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__INPUT_DATA, oldInputData, inputData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpreadsheetLineageModel getResultsData() {
		if (resultsData != null && resultsData.eIsProxy()) {
			InternalEObject oldResultsData = (InternalEObject)resultsData;
			resultsData = (SpreadsheetLineageModel)eResolveProxy(oldResultsData);
			if (resultsData != oldResultsData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model_registryPackage.DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__RESULTS_DATA, oldResultsData, resultsData));
			}
		}
		return resultsData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetLineageModel basicGetResultsData() {
		return resultsData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultsData(SpreadsheetLineageModel newResultsData) {
		SpreadsheetLineageModel oldResultsData = resultsData;
		resultsData = newResultsData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model_registryPackage.DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__RESULTS_DATA, oldResultsData, resultsData));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model_registryPackage.DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__ATTRIBUTE_LINEAGE_MODEL, oldAttributeLineageModel, attributeLineageModel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Model_registryPackage.DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__ATTRIBUTE_LINEAGE_MODEL, oldAttributeLineageModel, attributeLineageModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Model_registryPackage.DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__INPUT_DATA:
				if (resolve) return getInputData();
				return basicGetInputData();
			case Model_registryPackage.DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__RESULTS_DATA:
				if (resolve) return getResultsData();
				return basicGetResultsData();
			case Model_registryPackage.DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__ATTRIBUTE_LINEAGE_MODEL:
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
			case Model_registryPackage.DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__INPUT_DATA:
				setInputData((SpreadsheetLineageModel)newValue);
				return;
			case Model_registryPackage.DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__RESULTS_DATA:
				setResultsData((SpreadsheetLineageModel)newValue);
				return;
			case Model_registryPackage.DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__ATTRIBUTE_LINEAGE_MODEL:
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
			case Model_registryPackage.DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__INPUT_DATA:
				setInputData((SpreadsheetLineageModel)null);
				return;
			case Model_registryPackage.DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__RESULTS_DATA:
				setResultsData((SpreadsheetLineageModel)null);
				return;
			case Model_registryPackage.DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__ATTRIBUTE_LINEAGE_MODEL:
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
			case Model_registryPackage.DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__INPUT_DATA:
				return inputData != null;
			case Model_registryPackage.DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__RESULTS_DATA:
				return resultsData != null;
			case Model_registryPackage.DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__ATTRIBUTE_LINEAGE_MODEL:
				return attributeLineageModel != null;
		}
		return super.eIsSet(featureID);
	}

} //DataLineageAndInputDataAndAttributeLineageTripleImpl
