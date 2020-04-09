/**
 */
package model_registry;

import attribute_lineage.AttributeLineageModel;

import data_lineage.SpreadsheetLineageModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Lineage And Input Data And Attribute Lineage Triple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model_registry.DataLineageAndInputDataAndAttributeLineageTriple#getInputData <em>Input Data</em>}</li>
 *   <li>{@link model_registry.DataLineageAndInputDataAndAttributeLineageTriple#getResultsData <em>Results Data</em>}</li>
 *   <li>{@link model_registry.DataLineageAndInputDataAndAttributeLineageTriple#getAttributeLineageModel <em>Attribute Lineage Model</em>}</li>
 * </ul>
 *
 * @see model_registry.Model_registryPackage#getDataLineageAndInputDataAndAttributeLineageTriple()
 * @model
 * @generated
 */
public interface DataLineageAndInputDataAndAttributeLineageTriple extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Data</em>' reference.
	 * @see #setInputData(SpreadsheetLineageModel)
	 * @see model_registry.Model_registryPackage#getDataLineageAndInputDataAndAttributeLineageTriple_InputData()
	 * @model
	 * @generated
	 */
	SpreadsheetLineageModel getInputData();

	/**
	 * Sets the value of the '{@link model_registry.DataLineageAndInputDataAndAttributeLineageTriple#getInputData <em>Input Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Data</em>' reference.
	 * @see #getInputData()
	 * @generated
	 */
	void setInputData(SpreadsheetLineageModel value);

	/**
	 * Returns the value of the '<em><b>Results Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results Data</em>' reference.
	 * @see #setResultsData(SpreadsheetLineageModel)
	 * @see model_registry.Model_registryPackage#getDataLineageAndInputDataAndAttributeLineageTriple_ResultsData()
	 * @model
	 * @generated
	 */
	SpreadsheetLineageModel getResultsData();

	/**
	 * Sets the value of the '{@link model_registry.DataLineageAndInputDataAndAttributeLineageTriple#getResultsData <em>Results Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Results Data</em>' reference.
	 * @see #getResultsData()
	 * @generated
	 */
	void setResultsData(SpreadsheetLineageModel value);

	/**
	 * Returns the value of the '<em><b>Attribute Lineage Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Lineage Model</em>' reference.
	 * @see #setAttributeLineageModel(AttributeLineageModel)
	 * @see model_registry.Model_registryPackage#getDataLineageAndInputDataAndAttributeLineageTriple_AttributeLineageModel()
	 * @model
	 * @generated
	 */
	AttributeLineageModel getAttributeLineageModel();

	/**
	 * Sets the value of the '{@link model_registry.DataLineageAndInputDataAndAttributeLineageTriple#getAttributeLineageModel <em>Attribute Lineage Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Lineage Model</em>' reference.
	 * @see #getAttributeLineageModel()
	 * @generated
	 */
	void setAttributeLineageModel(AttributeLineageModel value);

} // DataLineageAndInputDataAndAttributeLineageTriple
