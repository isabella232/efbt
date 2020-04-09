/**
 */
package model_registry;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model_registry.Model_registryFactory
 * @model kind="package"
 * @generated
 */
public interface Model_registryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model_registry";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/model_registry";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model_registry";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Model_registryPackage eINSTANCE = model_registry.impl.Model_registryPackageImpl.init();

	/**
	 * The meta object id for the '{@link model_registry.impl.ModelRegistryImpl <em>Model Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model_registry.impl.ModelRegistryImpl
	 * @see model_registry.impl.Model_registryPackageImpl#getModelRegistry()
	 * @generated
	 */
	int MODEL_REGISTRY = 0;

	/**
	 * The feature id for the '<em><b>Bird Artefact List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REGISTRY__BIRD_ARTEFACT_LIST = 0;

	/**
	 * The feature id for the '<em><b>Attribute Lineage Model List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REGISTRY__ATTRIBUTE_LINEAGE_MODEL_LIST = 1;

	/**
	 * The feature id for the '<em><b>Birdand ALM List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REGISTRY__BIRDAND_ALM_LIST = 2;

	/**
	 * The feature id for the '<em><b>Full Data Lineage Model List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REGISTRY__FULL_DATA_LINEAGE_MODEL_LIST = 3;

	/**
	 * The feature id for the '<em><b>Input Layer Only DLM List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REGISTRY__INPUT_LAYER_ONLY_DLM_LIST = 4;

	/**
	 * The feature id for the '<em><b>Triple List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REGISTRY__TRIPLE_LIST = 5;

	/**
	 * The feature id for the '<em><b>Release List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REGISTRY__RELEASE_LIST = 6;

	/**
	 * The feature id for the '<em><b>Release And ALM Pair List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REGISTRY__RELEASE_AND_ALM_PAIR_LIST = 7;

	/**
	 * The number of structural features of the '<em>Model Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REGISTRY_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Model Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REGISTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model_registry.impl.BirdArtefactsListImpl <em>Bird Artefacts List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model_registry.impl.BirdArtefactsListImpl
	 * @see model_registry.impl.Model_registryPackageImpl#getBirdArtefactsList()
	 * @generated
	 */
	int BIRD_ARTEFACTS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Bird Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRD_ARTEFACTS_LIST__BIRD_MODELS = 0;

	/**
	 * The number of structural features of the '<em>Bird Artefacts List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRD_ARTEFACTS_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bird Artefacts List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRD_ARTEFACTS_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model_registry.impl.BirdArtefactsAndAttributeLineagePairImpl <em>Bird Artefacts And Attribute Lineage Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model_registry.impl.BirdArtefactsAndAttributeLineagePairImpl
	 * @see model_registry.impl.Model_registryPackageImpl#getBirdArtefactsAndAttributeLineagePair()
	 * @generated
	 */
	int BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR = 2;

	/**
	 * The feature id for the '<em><b>Bird model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR__BIRD_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Attribute lineage model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR__ATTRIBUTE_LINEAGE_MODEL = 1;

	/**
	 * The number of structural features of the '<em>Bird Artefacts And Attribute Lineage Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bird Artefacts And Attribute Lineage Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model_registry.impl.AttributeLineageModelListImpl <em>Attribute Lineage Model List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model_registry.impl.AttributeLineageModelListImpl
	 * @see model_registry.impl.Model_registryPackageImpl#getAttributeLineageModelList()
	 * @generated
	 */
	int ATTRIBUTE_LINEAGE_MODEL_LIST = 3;

	/**
	 * The feature id for the '<em><b>Attribute Lineage Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LINEAGE_MODEL_LIST__ATTRIBUTE_LINEAGE_MODELS = 0;

	/**
	 * The number of structural features of the '<em>Attribute Lineage Model List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LINEAGE_MODEL_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attribute Lineage Model List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LINEAGE_MODEL_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model_registry.impl.BirdArtefactandAttributeLineageModelPairListImpl <em>Bird Artefactand Attribute Lineage Model Pair List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model_registry.impl.BirdArtefactandAttributeLineageModelPairListImpl
	 * @see model_registry.impl.Model_registryPackageImpl#getBirdArtefactandAttributeLineageModelPairList()
	 * @generated
	 */
	int BIRD_ARTEFACTAND_ATTRIBUTE_LINEAGE_MODEL_PAIR_LIST = 4;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRD_ARTEFACTAND_ATTRIBUTE_LINEAGE_MODEL_PAIR_LIST__LIST = 0;

	/**
	 * The number of structural features of the '<em>Bird Artefactand Attribute Lineage Model Pair List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRD_ARTEFACTAND_ATTRIBUTE_LINEAGE_MODEL_PAIR_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bird Artefactand Attribute Lineage Model Pair List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRD_ARTEFACTAND_ATTRIBUTE_LINEAGE_MODEL_PAIR_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model_registry.impl.FullSpreadsheetLineageModelListImpl <em>Full Data Lineage Model List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model_registry.impl.FullSpreadsheetLineageModelListImpl
	 * @see model_registry.impl.Model_registryPackageImpl#getFullSpreadsheetLineageModelList()
	 * @generated
	 */
	int FULL_DATA_LINEAGE_MODEL_LIST = 5;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_DATA_LINEAGE_MODEL_LIST__LIST = 0;

	/**
	 * The number of structural features of the '<em>Full Data Lineage Model List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_DATA_LINEAGE_MODEL_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Full Data Lineage Model List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_DATA_LINEAGE_MODEL_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model_registry.impl.InputLayerOnlyDataLineageListImpl <em>Input Layer Only Data Lineage List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model_registry.impl.InputLayerOnlyDataLineageListImpl
	 * @see model_registry.impl.Model_registryPackageImpl#getInputLayerOnlyDataLineageList()
	 * @generated
	 */
	int INPUT_LAYER_ONLY_DATA_LINEAGE_LIST = 6;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_LAYER_ONLY_DATA_LINEAGE_LIST__LIST = 0;

	/**
	 * The number of structural features of the '<em>Input Layer Only Data Lineage List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_LAYER_ONLY_DATA_LINEAGE_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Input Layer Only Data Lineage List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_LAYER_ONLY_DATA_LINEAGE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model_registry.impl.DataLineageAndInputDataAndAttributeLineageTripleImpl <em>Data Lineage And Input Data And Attribute Lineage Triple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model_registry.impl.DataLineageAndInputDataAndAttributeLineageTripleImpl
	 * @see model_registry.impl.Model_registryPackageImpl#getDataLineageAndInputDataAndAttributeLineageTriple()
	 * @generated
	 */
	int DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE = 7;

	/**
	 * The feature id for the '<em><b>Input Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__INPUT_DATA = 0;

	/**
	 * The feature id for the '<em><b>Results Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__RESULTS_DATA = 1;

	/**
	 * The feature id for the '<em><b>Attribute Lineage Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__ATTRIBUTE_LINEAGE_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Data Lineage And Input Data And Attribute Lineage Triple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Lineage And Input Data And Attribute Lineage Triple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model_registry.impl.DataLineageAndInputDataAndAttributeLineageTripleListImpl <em>Data Lineage And Input Data And Attribute Lineage Triple List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model_registry.impl.DataLineageAndInputDataAndAttributeLineageTripleListImpl
	 * @see model_registry.impl.Model_registryPackageImpl#getDataLineageAndInputDataAndAttributeLineageTripleList()
	 * @generated
	 */
	int DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE_LIST = 8;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE_LIST__LIST = 0;

	/**
	 * The number of structural features of the '<em>Data Lineage And Input Data And Attribute Lineage Triple List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Lineage And Input Data And Attribute Lineage Triple List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model_registry.impl.ReleaseListImpl <em>Release List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model_registry.impl.ReleaseListImpl
	 * @see model_registry.impl.Model_registryPackageImpl#getReleaseList()
	 * @generated
	 */
	int RELEASE_LIST = 9;

	/**
	 * The feature id for the '<em><b>Releases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_LIST__RELEASES = 0;

	/**
	 * The number of structural features of the '<em>Release List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Release List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model_registry.impl.ReleaseAndAttributeLineageModelPairImpl <em>Release And Attribute Lineage Model Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model_registry.impl.ReleaseAndAttributeLineageModelPairImpl
	 * @see model_registry.impl.Model_registryPackageImpl#getReleaseAndAttributeLineageModelPair()
	 * @generated
	 */
	int RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR = 10;

	/**
	 * The feature id for the '<em><b>Release</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR__RELEASE = 0;

	/**
	 * The feature id for the '<em><b>Attribute Lineage Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR__ATTRIBUTE_LINEAGE_MODEL = 1;

	/**
	 * The number of structural features of the '<em>Release And Attribute Lineage Model Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Release And Attribute Lineage Model Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model_registry.impl.ReleaseAndAttributeLineageModelPairListImpl <em>Release And Attribute Lineage Model Pair List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model_registry.impl.ReleaseAndAttributeLineageModelPairListImpl
	 * @see model_registry.impl.Model_registryPackageImpl#getReleaseAndAttributeLineageModelPairList()
	 * @generated
	 */
	int RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR_LIST = 11;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR_LIST__LIST = 0;

	/**
	 * The number of structural features of the '<em>Release And Attribute Lineage Model Pair List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Release And Attribute Lineage Model Pair List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR_LIST_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link model_registry.ModelRegistry <em>Model Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Registry</em>'.
	 * @see model_registry.ModelRegistry
	 * @generated
	 */
	EClass getModelRegistry();

	/**
	 * Returns the meta object for the containment reference '{@link model_registry.ModelRegistry#getBirdArtefactList <em>Bird Artefact List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bird Artefact List</em>'.
	 * @see model_registry.ModelRegistry#getBirdArtefactList()
	 * @see #getModelRegistry()
	 * @generated
	 */
	EReference getModelRegistry_BirdArtefactList();

	/**
	 * Returns the meta object for the containment reference '{@link model_registry.ModelRegistry#getAttributeLineageModelList <em>Attribute Lineage Model List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Lineage Model List</em>'.
	 * @see model_registry.ModelRegistry#getAttributeLineageModelList()
	 * @see #getModelRegistry()
	 * @generated
	 */
	EReference getModelRegistry_AttributeLineageModelList();

	/**
	 * Returns the meta object for the containment reference '{@link model_registry.ModelRegistry#getBirdandALMList <em>Birdand ALM List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Birdand ALM List</em>'.
	 * @see model_registry.ModelRegistry#getBirdandALMList()
	 * @see #getModelRegistry()
	 * @generated
	 */
	EReference getModelRegistry_BirdandALMList();

	/**
	 * Returns the meta object for the containment reference '{@link model_registry.ModelRegistry#getFullSpreadsheetLineageModelList <em>Full Data Lineage Model List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Full Data Lineage Model List</em>'.
	 * @see model_registry.ModelRegistry#getFullSpreadsheetLineageModelList()
	 * @see #getModelRegistry()
	 * @generated
	 */
	EReference getModelRegistry_FullSpreadsheetLineageModelList();

	/**
	 * Returns the meta object for the containment reference '{@link model_registry.ModelRegistry#getInputLayerOnlyDLMList <em>Input Layer Only DLM List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Layer Only DLM List</em>'.
	 * @see model_registry.ModelRegistry#getInputLayerOnlyDLMList()
	 * @see #getModelRegistry()
	 * @generated
	 */
	EReference getModelRegistry_InputLayerOnlyDLMList();

	/**
	 * Returns the meta object for the containment reference '{@link model_registry.ModelRegistry#getTripleList <em>Triple List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Triple List</em>'.
	 * @see model_registry.ModelRegistry#getTripleList()
	 * @see #getModelRegistry()
	 * @generated
	 */
	EReference getModelRegistry_TripleList();

	/**
	 * Returns the meta object for the containment reference '{@link model_registry.ModelRegistry#getReleaseList <em>Release List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Release List</em>'.
	 * @see model_registry.ModelRegistry#getReleaseList()
	 * @see #getModelRegistry()
	 * @generated
	 */
	EReference getModelRegistry_ReleaseList();

	/**
	 * Returns the meta object for the containment reference '{@link model_registry.ModelRegistry#getReleaseAndALMPairList <em>Release And ALM Pair List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Release And ALM Pair List</em>'.
	 * @see model_registry.ModelRegistry#getReleaseAndALMPairList()
	 * @see #getModelRegistry()
	 * @generated
	 */
	EReference getModelRegistry_ReleaseAndALMPairList();

	/**
	 * Returns the meta object for class '{@link model_registry.BirdArtefactsList <em>Bird Artefacts List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bird Artefacts List</em>'.
	 * @see model_registry.BirdArtefactsList
	 * @generated
	 */
	EClass getBirdArtefactsList();

	/**
	 * Returns the meta object for the containment reference list '{@link model_registry.BirdArtefactsList#getBirdModels <em>Bird Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bird Models</em>'.
	 * @see model_registry.BirdArtefactsList#getBirdModels()
	 * @see #getBirdArtefactsList()
	 * @generated
	 */
	EReference getBirdArtefactsList_BirdModels();

	/**
	 * Returns the meta object for class '{@link model_registry.BirdArtefactsAndAttributeLineagePair <em>Bird Artefacts And Attribute Lineage Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bird Artefacts And Attribute Lineage Pair</em>'.
	 * @see model_registry.BirdArtefactsAndAttributeLineagePair
	 * @generated
	 */
	EClass getBirdArtefactsAndAttributeLineagePair();

	/**
	 * Returns the meta object for the reference '{@link model_registry.BirdArtefactsAndAttributeLineagePair#getBird_model <em>Bird model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bird model</em>'.
	 * @see model_registry.BirdArtefactsAndAttributeLineagePair#getBird_model()
	 * @see #getBirdArtefactsAndAttributeLineagePair()
	 * @generated
	 */
	EReference getBirdArtefactsAndAttributeLineagePair_Bird_model();

	/**
	 * Returns the meta object for the reference '{@link model_registry.BirdArtefactsAndAttributeLineagePair#getAttribute_lineage_model <em>Attribute lineage model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute lineage model</em>'.
	 * @see model_registry.BirdArtefactsAndAttributeLineagePair#getAttribute_lineage_model()
	 * @see #getBirdArtefactsAndAttributeLineagePair()
	 * @generated
	 */
	EReference getBirdArtefactsAndAttributeLineagePair_Attribute_lineage_model();

	/**
	 * Returns the meta object for class '{@link model_registry.AttributeLineageModelList <em>Attribute Lineage Model List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Lineage Model List</em>'.
	 * @see model_registry.AttributeLineageModelList
	 * @generated
	 */
	EClass getAttributeLineageModelList();

	/**
	 * Returns the meta object for the containment reference list '{@link model_registry.AttributeLineageModelList#getAttributeLineageModels <em>Attribute Lineage Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Lineage Models</em>'.
	 * @see model_registry.AttributeLineageModelList#getAttributeLineageModels()
	 * @see #getAttributeLineageModelList()
	 * @generated
	 */
	EReference getAttributeLineageModelList_AttributeLineageModels();

	/**
	 * Returns the meta object for class '{@link model_registry.BirdArtefactandAttributeLineageModelPairList <em>Bird Artefactand Attribute Lineage Model Pair List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bird Artefactand Attribute Lineage Model Pair List</em>'.
	 * @see model_registry.BirdArtefactandAttributeLineageModelPairList
	 * @generated
	 */
	EClass getBirdArtefactandAttributeLineageModelPairList();

	/**
	 * Returns the meta object for the containment reference list '{@link model_registry.BirdArtefactandAttributeLineageModelPairList#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see model_registry.BirdArtefactandAttributeLineageModelPairList#getList()
	 * @see #getBirdArtefactandAttributeLineageModelPairList()
	 * @generated
	 */
	EReference getBirdArtefactandAttributeLineageModelPairList_List();

	/**
	 * Returns the meta object for class '{@link model_registry.FullSpreadsheetLineageModelList <em>Full Data Lineage Model List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Full Data Lineage Model List</em>'.
	 * @see model_registry.FullSpreadsheetLineageModelList
	 * @generated
	 */
	EClass getFullSpreadsheetLineageModelList();

	/**
	 * Returns the meta object for the containment reference list '{@link model_registry.FullSpreadsheetLineageModelList#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see model_registry.FullSpreadsheetLineageModelList#getList()
	 * @see #getFullSpreadsheetLineageModelList()
	 * @generated
	 */
	EReference getFullSpreadsheetLineageModelList_List();

	/**
	 * Returns the meta object for class '{@link model_registry.InputLayerOnlyDataLineageList <em>Input Layer Only Data Lineage List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Layer Only Data Lineage List</em>'.
	 * @see model_registry.InputLayerOnlyDataLineageList
	 * @generated
	 */
	EClass getInputLayerOnlyDataLineageList();

	/**
	 * Returns the meta object for the containment reference list '{@link model_registry.InputLayerOnlyDataLineageList#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see model_registry.InputLayerOnlyDataLineageList#getList()
	 * @see #getInputLayerOnlyDataLineageList()
	 * @generated
	 */
	EReference getInputLayerOnlyDataLineageList_List();

	/**
	 * Returns the meta object for class '{@link model_registry.DataLineageAndInputDataAndAttributeLineageTriple <em>Data Lineage And Input Data And Attribute Lineage Triple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Lineage And Input Data And Attribute Lineage Triple</em>'.
	 * @see model_registry.DataLineageAndInputDataAndAttributeLineageTriple
	 * @generated
	 */
	EClass getDataLineageAndInputDataAndAttributeLineageTriple();

	/**
	 * Returns the meta object for the reference '{@link model_registry.DataLineageAndInputDataAndAttributeLineageTriple#getInputData <em>Input Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Data</em>'.
	 * @see model_registry.DataLineageAndInputDataAndAttributeLineageTriple#getInputData()
	 * @see #getDataLineageAndInputDataAndAttributeLineageTriple()
	 * @generated
	 */
	EReference getDataLineageAndInputDataAndAttributeLineageTriple_InputData();

	/**
	 * Returns the meta object for the reference '{@link model_registry.DataLineageAndInputDataAndAttributeLineageTriple#getResultsData <em>Results Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Results Data</em>'.
	 * @see model_registry.DataLineageAndInputDataAndAttributeLineageTriple#getResultsData()
	 * @see #getDataLineageAndInputDataAndAttributeLineageTriple()
	 * @generated
	 */
	EReference getDataLineageAndInputDataAndAttributeLineageTriple_ResultsData();

	/**
	 * Returns the meta object for the reference '{@link model_registry.DataLineageAndInputDataAndAttributeLineageTriple#getAttributeLineageModel <em>Attribute Lineage Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Lineage Model</em>'.
	 * @see model_registry.DataLineageAndInputDataAndAttributeLineageTriple#getAttributeLineageModel()
	 * @see #getDataLineageAndInputDataAndAttributeLineageTriple()
	 * @generated
	 */
	EReference getDataLineageAndInputDataAndAttributeLineageTriple_AttributeLineageModel();

	/**
	 * Returns the meta object for class '{@link model_registry.DataLineageAndInputDataAndAttributeLineageTripleList <em>Data Lineage And Input Data And Attribute Lineage Triple List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Lineage And Input Data And Attribute Lineage Triple List</em>'.
	 * @see model_registry.DataLineageAndInputDataAndAttributeLineageTripleList
	 * @generated
	 */
	EClass getDataLineageAndInputDataAndAttributeLineageTripleList();

	/**
	 * Returns the meta object for the containment reference list '{@link model_registry.DataLineageAndInputDataAndAttributeLineageTripleList#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see model_registry.DataLineageAndInputDataAndAttributeLineageTripleList#getList()
	 * @see #getDataLineageAndInputDataAndAttributeLineageTripleList()
	 * @generated
	 */
	EReference getDataLineageAndInputDataAndAttributeLineageTripleList_List();

	/**
	 * Returns the meta object for class '{@link model_registry.ReleaseList <em>Release List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release List</em>'.
	 * @see model_registry.ReleaseList
	 * @generated
	 */
	EClass getReleaseList();

	/**
	 * Returns the meta object for the containment reference list '{@link model_registry.ReleaseList#getReleases <em>Releases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Releases</em>'.
	 * @see model_registry.ReleaseList#getReleases()
	 * @see #getReleaseList()
	 * @generated
	 */
	EReference getReleaseList_Releases();

	/**
	 * Returns the meta object for class '{@link model_registry.ReleaseAndAttributeLineageModelPair <em>Release And Attribute Lineage Model Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release And Attribute Lineage Model Pair</em>'.
	 * @see model_registry.ReleaseAndAttributeLineageModelPair
	 * @generated
	 */
	EClass getReleaseAndAttributeLineageModelPair();

	/**
	 * Returns the meta object for the reference '{@link model_registry.ReleaseAndAttributeLineageModelPair#getRelease <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Release</em>'.
	 * @see model_registry.ReleaseAndAttributeLineageModelPair#getRelease()
	 * @see #getReleaseAndAttributeLineageModelPair()
	 * @generated
	 */
	EReference getReleaseAndAttributeLineageModelPair_Release();

	/**
	 * Returns the meta object for the reference '{@link model_registry.ReleaseAndAttributeLineageModelPair#getAttributeLineageModel <em>Attribute Lineage Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Lineage Model</em>'.
	 * @see model_registry.ReleaseAndAttributeLineageModelPair#getAttributeLineageModel()
	 * @see #getReleaseAndAttributeLineageModelPair()
	 * @generated
	 */
	EReference getReleaseAndAttributeLineageModelPair_AttributeLineageModel();

	/**
	 * Returns the meta object for class '{@link model_registry.ReleaseAndAttributeLineageModelPairList <em>Release And Attribute Lineage Model Pair List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release And Attribute Lineage Model Pair List</em>'.
	 * @see model_registry.ReleaseAndAttributeLineageModelPairList
	 * @generated
	 */
	EClass getReleaseAndAttributeLineageModelPairList();

	/**
	 * Returns the meta object for the containment reference list '{@link model_registry.ReleaseAndAttributeLineageModelPairList#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see model_registry.ReleaseAndAttributeLineageModelPairList#getList()
	 * @see #getReleaseAndAttributeLineageModelPairList()
	 * @generated
	 */
	EReference getReleaseAndAttributeLineageModelPairList_List();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Model_registryFactory getModel_registryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model_registry.impl.ModelRegistryImpl <em>Model Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model_registry.impl.ModelRegistryImpl
		 * @see model_registry.impl.Model_registryPackageImpl#getModelRegistry()
		 * @generated
		 */
		EClass MODEL_REGISTRY = eINSTANCE.getModelRegistry();

		/**
		 * The meta object literal for the '<em><b>Bird Artefact List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_REGISTRY__BIRD_ARTEFACT_LIST = eINSTANCE.getModelRegistry_BirdArtefactList();

		/**
		 * The meta object literal for the '<em><b>Attribute Lineage Model List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_REGISTRY__ATTRIBUTE_LINEAGE_MODEL_LIST = eINSTANCE.getModelRegistry_AttributeLineageModelList();

		/**
		 * The meta object literal for the '<em><b>Birdand ALM List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_REGISTRY__BIRDAND_ALM_LIST = eINSTANCE.getModelRegistry_BirdandALMList();

		/**
		 * The meta object literal for the '<em><b>Full Data Lineage Model List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_REGISTRY__FULL_DATA_LINEAGE_MODEL_LIST = eINSTANCE.getModelRegistry_FullSpreadsheetLineageModelList();

		/**
		 * The meta object literal for the '<em><b>Input Layer Only DLM List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_REGISTRY__INPUT_LAYER_ONLY_DLM_LIST = eINSTANCE.getModelRegistry_InputLayerOnlyDLMList();

		/**
		 * The meta object literal for the '<em><b>Triple List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_REGISTRY__TRIPLE_LIST = eINSTANCE.getModelRegistry_TripleList();

		/**
		 * The meta object literal for the '<em><b>Release List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_REGISTRY__RELEASE_LIST = eINSTANCE.getModelRegistry_ReleaseList();

		/**
		 * The meta object literal for the '<em><b>Release And ALM Pair List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_REGISTRY__RELEASE_AND_ALM_PAIR_LIST = eINSTANCE.getModelRegistry_ReleaseAndALMPairList();

		/**
		 * The meta object literal for the '{@link model_registry.impl.BirdArtefactsListImpl <em>Bird Artefacts List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model_registry.impl.BirdArtefactsListImpl
		 * @see model_registry.impl.Model_registryPackageImpl#getBirdArtefactsList()
		 * @generated
		 */
		EClass BIRD_ARTEFACTS_LIST = eINSTANCE.getBirdArtefactsList();

		/**
		 * The meta object literal for the '<em><b>Bird Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIRD_ARTEFACTS_LIST__BIRD_MODELS = eINSTANCE.getBirdArtefactsList_BirdModels();

		/**
		 * The meta object literal for the '{@link model_registry.impl.BirdArtefactsAndAttributeLineagePairImpl <em>Bird Artefacts And Attribute Lineage Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model_registry.impl.BirdArtefactsAndAttributeLineagePairImpl
		 * @see model_registry.impl.Model_registryPackageImpl#getBirdArtefactsAndAttributeLineagePair()
		 * @generated
		 */
		EClass BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR = eINSTANCE.getBirdArtefactsAndAttributeLineagePair();

		/**
		 * The meta object literal for the '<em><b>Bird model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR__BIRD_MODEL = eINSTANCE.getBirdArtefactsAndAttributeLineagePair_Bird_model();

		/**
		 * The meta object literal for the '<em><b>Attribute lineage model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR__ATTRIBUTE_LINEAGE_MODEL = eINSTANCE.getBirdArtefactsAndAttributeLineagePair_Attribute_lineage_model();

		/**
		 * The meta object literal for the '{@link model_registry.impl.AttributeLineageModelListImpl <em>Attribute Lineage Model List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model_registry.impl.AttributeLineageModelListImpl
		 * @see model_registry.impl.Model_registryPackageImpl#getAttributeLineageModelList()
		 * @generated
		 */
		EClass ATTRIBUTE_LINEAGE_MODEL_LIST = eINSTANCE.getAttributeLineageModelList();

		/**
		 * The meta object literal for the '<em><b>Attribute Lineage Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_LINEAGE_MODEL_LIST__ATTRIBUTE_LINEAGE_MODELS = eINSTANCE.getAttributeLineageModelList_AttributeLineageModels();

		/**
		 * The meta object literal for the '{@link model_registry.impl.BirdArtefactandAttributeLineageModelPairListImpl <em>Bird Artefactand Attribute Lineage Model Pair List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model_registry.impl.BirdArtefactandAttributeLineageModelPairListImpl
		 * @see model_registry.impl.Model_registryPackageImpl#getBirdArtefactandAttributeLineageModelPairList()
		 * @generated
		 */
		EClass BIRD_ARTEFACTAND_ATTRIBUTE_LINEAGE_MODEL_PAIR_LIST = eINSTANCE.getBirdArtefactandAttributeLineageModelPairList();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIRD_ARTEFACTAND_ATTRIBUTE_LINEAGE_MODEL_PAIR_LIST__LIST = eINSTANCE.getBirdArtefactandAttributeLineageModelPairList_List();

		/**
		 * The meta object literal for the '{@link model_registry.impl.FullSpreadsheetLineageModelListImpl <em>Full Data Lineage Model List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model_registry.impl.FullSpreadsheetLineageModelListImpl
		 * @see model_registry.impl.Model_registryPackageImpl#getFullSpreadsheetLineageModelList()
		 * @generated
		 */
		EClass FULL_DATA_LINEAGE_MODEL_LIST = eINSTANCE.getFullSpreadsheetLineageModelList();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FULL_DATA_LINEAGE_MODEL_LIST__LIST = eINSTANCE.getFullSpreadsheetLineageModelList_List();

		/**
		 * The meta object literal for the '{@link model_registry.impl.InputLayerOnlyDataLineageListImpl <em>Input Layer Only Data Lineage List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model_registry.impl.InputLayerOnlyDataLineageListImpl
		 * @see model_registry.impl.Model_registryPackageImpl#getInputLayerOnlyDataLineageList()
		 * @generated
		 */
		EClass INPUT_LAYER_ONLY_DATA_LINEAGE_LIST = eINSTANCE.getInputLayerOnlyDataLineageList();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_LAYER_ONLY_DATA_LINEAGE_LIST__LIST = eINSTANCE.getInputLayerOnlyDataLineageList_List();

		/**
		 * The meta object literal for the '{@link model_registry.impl.DataLineageAndInputDataAndAttributeLineageTripleImpl <em>Data Lineage And Input Data And Attribute Lineage Triple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model_registry.impl.DataLineageAndInputDataAndAttributeLineageTripleImpl
		 * @see model_registry.impl.Model_registryPackageImpl#getDataLineageAndInputDataAndAttributeLineageTriple()
		 * @generated
		 */
		EClass DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE = eINSTANCE.getDataLineageAndInputDataAndAttributeLineageTriple();

		/**
		 * The meta object literal for the '<em><b>Input Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__INPUT_DATA = eINSTANCE.getDataLineageAndInputDataAndAttributeLineageTriple_InputData();

		/**
		 * The meta object literal for the '<em><b>Results Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__RESULTS_DATA = eINSTANCE.getDataLineageAndInputDataAndAttributeLineageTriple_ResultsData();

		/**
		 * The meta object literal for the '<em><b>Attribute Lineage Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__ATTRIBUTE_LINEAGE_MODEL = eINSTANCE.getDataLineageAndInputDataAndAttributeLineageTriple_AttributeLineageModel();

		/**
		 * The meta object literal for the '{@link model_registry.impl.DataLineageAndInputDataAndAttributeLineageTripleListImpl <em>Data Lineage And Input Data And Attribute Lineage Triple List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model_registry.impl.DataLineageAndInputDataAndAttributeLineageTripleListImpl
		 * @see model_registry.impl.Model_registryPackageImpl#getDataLineageAndInputDataAndAttributeLineageTripleList()
		 * @generated
		 */
		EClass DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE_LIST = eINSTANCE.getDataLineageAndInputDataAndAttributeLineageTripleList();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE_LIST__LIST = eINSTANCE.getDataLineageAndInputDataAndAttributeLineageTripleList_List();

		/**
		 * The meta object literal for the '{@link model_registry.impl.ReleaseListImpl <em>Release List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model_registry.impl.ReleaseListImpl
		 * @see model_registry.impl.Model_registryPackageImpl#getReleaseList()
		 * @generated
		 */
		EClass RELEASE_LIST = eINSTANCE.getReleaseList();

		/**
		 * The meta object literal for the '<em><b>Releases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE_LIST__RELEASES = eINSTANCE.getReleaseList_Releases();

		/**
		 * The meta object literal for the '{@link model_registry.impl.ReleaseAndAttributeLineageModelPairImpl <em>Release And Attribute Lineage Model Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model_registry.impl.ReleaseAndAttributeLineageModelPairImpl
		 * @see model_registry.impl.Model_registryPackageImpl#getReleaseAndAttributeLineageModelPair()
		 * @generated
		 */
		EClass RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR = eINSTANCE.getReleaseAndAttributeLineageModelPair();

		/**
		 * The meta object literal for the '<em><b>Release</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR__RELEASE = eINSTANCE.getReleaseAndAttributeLineageModelPair_Release();

		/**
		 * The meta object literal for the '<em><b>Attribute Lineage Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR__ATTRIBUTE_LINEAGE_MODEL = eINSTANCE.getReleaseAndAttributeLineageModelPair_AttributeLineageModel();

		/**
		 * The meta object literal for the '{@link model_registry.impl.ReleaseAndAttributeLineageModelPairListImpl <em>Release And Attribute Lineage Model Pair List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model_registry.impl.ReleaseAndAttributeLineageModelPairListImpl
		 * @see model_registry.impl.Model_registryPackageImpl#getReleaseAndAttributeLineageModelPairList()
		 * @generated
		 */
		EClass RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR_LIST = eINSTANCE.getReleaseAndAttributeLineageModelPairList();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR_LIST__LIST = eINSTANCE.getReleaseAndAttributeLineageModelPairList_List();

	}

} //Model_registryPackage
