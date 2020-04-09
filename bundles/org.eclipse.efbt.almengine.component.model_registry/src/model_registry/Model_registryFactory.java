/**
 */
package model_registry;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model_registry.Model_registryPackage
 * @generated
 */
public interface Model_registryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Model_registryFactory eINSTANCE = model_registry.impl.Model_registryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Registry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Registry</em>'.
	 * @generated
	 */
	ModelRegistry createModelRegistry();

	/**
	 * Returns a new object of class '<em>Bird Artefacts List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bird Artefacts List</em>'.
	 * @generated
	 */
	BirdArtefactsList createBirdArtefactsList();

	/**
	 * Returns a new object of class '<em>Bird Artefacts And Attribute Lineage Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bird Artefacts And Attribute Lineage Pair</em>'.
	 * @generated
	 */
	BirdArtefactsAndAttributeLineagePair createBirdArtefactsAndAttributeLineagePair();

	/**
	 * Returns a new object of class '<em>Attribute Lineage Model List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Lineage Model List</em>'.
	 * @generated
	 */
	AttributeLineageModelList createAttributeLineageModelList();

	/**
	 * Returns a new object of class '<em>Bird Artefactand Attribute Lineage Model Pair List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bird Artefactand Attribute Lineage Model Pair List</em>'.
	 * @generated
	 */
	BirdArtefactandAttributeLineageModelPairList createBirdArtefactandAttributeLineageModelPairList();

	/**
	 * Returns a new object of class '<em>Full Data Lineage Model List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Full Data Lineage Model List</em>'.
	 * @generated
	 */
	FullSpreadsheetLineageModelList createFullSpreadsheetLineageModelList();

	/**
	 * Returns a new object of class '<em>Input Layer Only Data Lineage List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Layer Only Data Lineage List</em>'.
	 * @generated
	 */
	InputLayerOnlyDataLineageList createInputLayerOnlyDataLineageList();

	/**
	 * Returns a new object of class '<em>Data Lineage And Input Data And Attribute Lineage Triple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Lineage And Input Data And Attribute Lineage Triple</em>'.
	 * @generated
	 */
	DataLineageAndInputDataAndAttributeLineageTriple createDataLineageAndInputDataAndAttributeLineageTriple();

	/**
	 * Returns a new object of class '<em>Data Lineage And Input Data And Attribute Lineage Triple List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Lineage And Input Data And Attribute Lineage Triple List</em>'.
	 * @generated
	 */
	DataLineageAndInputDataAndAttributeLineageTripleList createDataLineageAndInputDataAndAttributeLineageTripleList();

	/**
	 * Returns a new object of class '<em>Release List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Release List</em>'.
	 * @generated
	 */
	ReleaseList createReleaseList();

	/**
	 * Returns a new object of class '<em>Release And Attribute Lineage Model Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Release And Attribute Lineage Model Pair</em>'.
	 * @generated
	 */
	ReleaseAndAttributeLineageModelPair createReleaseAndAttributeLineageModelPair();

	/**
	 * Returns a new object of class '<em>Release And Attribute Lineage Model Pair List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Release And Attribute Lineage Model Pair List</em>'.
	 * @generated
	 */
	ReleaseAndAttributeLineageModelPairList createReleaseAndAttributeLineageModelPairList();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Model_registryPackage getModel_registryPackage();

} //Model_registryFactory
