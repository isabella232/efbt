/**
 */
package model_registry.impl;

import attribute_lineage.Attribute_lineagePackage;

import base_column_structured_data.Base_column_structured_dataPackage;

import bird_model.Bird_modelPackage;

import cell_transformation_logic.Cell_transformation_logicPackage;

import column_transformation_logic.Column_transformation_logicPackage;

import core.CorePackage;

import column_structured_data.Cube_dataPackage;

import cube_schema.Cube_schemaPackage;

import cube_transformation_logic.Cube_transformation_logicPackage;

import cubes.CubesPackage;

import data_definition.Data_definitionPackage;

import data_lineage.Data_lineagePackage;

import efbt_data_definition.Efbt_data_definitionPackage;

import efbt_mapping.Efbt_mappingPackage;

import efbt_vtl_transformation.Efbt_vtl_transformationPackage;

import functions.FunctionsPackage;

import mapping.MappingPackage;

import model_registry.AttributeLineageModelList;
import model_registry.BirdArtefactandAttributeLineageModelPairList;
import model_registry.BirdArtefactsAndAttributeLineagePair;
import model_registry.BirdArtefactsList;
import model_registry.DataLineageAndInputDataAndAttributeLineageTriple;
import model_registry.DataLineageAndInputDataAndAttributeLineageTripleList;
import model_registry.FullSpreadsheetLineageModelList;
import model_registry.InputLayerOnlyDataLineageList;
import model_registry.ModelRegistry;
import model_registry.Model_registryFactory;
import model_registry.Model_registryPackage;
import model_registry.ReleaseAndAttributeLineageModelPair;
import model_registry.ReleaseAndAttributeLineageModelPairList;
import model_registry.ReleaseList;

import module_management.Module_managementPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rendering.RenderingPackage;

import reports.ReportsPackage;

import row_transformation_logic.Row_transformation_logicPackage;

import transformation.TransformationPackage;

import trl_report_cell_views.Trl_report_cell_viewsPackage;

import trl_sql_views.Trl_sql_viewsPackage;

import vtl_transformation.Vtl_transformationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Model_registryPackageImpl extends EPackageImpl implements Model_registryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass birdArtefactsListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass birdArtefactsAndAttributeLineagePairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeLineageModelListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass birdArtefactandAttributeLineageModelPairListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fullSpreadsheetLineageModelListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputLayerOnlyDataLineageListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataLineageAndInputDataAndAttributeLineageTripleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataLineageAndInputDataAndAttributeLineageTripleListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseAndAttributeLineageModelPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseAndAttributeLineageModelPairListEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see model_registry.Model_registryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Model_registryPackageImpl() {
		super(eNS_URI, Model_registryFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Model_registryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Model_registryPackage init() {
		if (isInited) return (Model_registryPackage)EPackage.Registry.INSTANCE.getEPackage(Model_registryPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModel_registryPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Model_registryPackageImpl theModel_registryPackage = registeredModel_registryPackage instanceof Model_registryPackageImpl ? (Model_registryPackageImpl)registeredModel_registryPackage : new Model_registryPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		Attribute_lineagePackage.eINSTANCE.eClass();
		Cube_transformation_logicPackage.eINSTANCE.eClass();
		Row_transformation_logicPackage.eINSTANCE.eClass();
		Bird_modelPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		Data_definitionPackage.eINSTANCE.eClass();
		Efbt_data_definitionPackage.eINSTANCE.eClass();
		Efbt_mappingPackage.eINSTANCE.eClass();
		Efbt_vtl_transformationPackage.eINSTANCE.eClass();
		MappingPackage.eINSTANCE.eClass();
		RenderingPackage.eINSTANCE.eClass();
		Vtl_transformationPackage.eINSTANCE.eClass();
		Base_column_structured_dataPackage.eINSTANCE.eClass();
		Cube_dataPackage.eINSTANCE.eClass();
		Cube_schemaPackage.eINSTANCE.eClass();
		CubesPackage.eINSTANCE.eClass();
		Cell_transformation_logicPackage.eINSTANCE.eClass();
		Data_lineagePackage.eINSTANCE.eClass();
		Column_transformation_logicPackage.eINSTANCE.eClass();
		FunctionsPackage.eINSTANCE.eClass();
		Module_managementPackage.eINSTANCE.eClass();
		ReportsPackage.eINSTANCE.eClass();
		TransformationPackage.eINSTANCE.eClass();
		Trl_report_cell_viewsPackage.eINSTANCE.eClass();
		Trl_sql_viewsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModel_registryPackage.createPackageContents();

		// Initialize created meta-data
		theModel_registryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModel_registryPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Model_registryPackage.eNS_URI, theModel_registryPackage);
		return theModel_registryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelRegistry() {
		return modelRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelRegistry_BirdArtefactList() {
		return (EReference)modelRegistryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelRegistry_AttributeLineageModelList() {
		return (EReference)modelRegistryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelRegistry_BirdandALMList() {
		return (EReference)modelRegistryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelRegistry_FullSpreadsheetLineageModelList() {
		return (EReference)modelRegistryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelRegistry_InputLayerOnlyDLMList() {
		return (EReference)modelRegistryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelRegistry_TripleList() {
		return (EReference)modelRegistryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelRegistry_ReleaseList() {
		return (EReference)modelRegistryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelRegistry_ReleaseAndALMPairList() {
		return (EReference)modelRegistryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBirdArtefactsList() {
		return birdArtefactsListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBirdArtefactsList_BirdModels() {
		return (EReference)birdArtefactsListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBirdArtefactsAndAttributeLineagePair() {
		return birdArtefactsAndAttributeLineagePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBirdArtefactsAndAttributeLineagePair_Bird_model() {
		return (EReference)birdArtefactsAndAttributeLineagePairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBirdArtefactsAndAttributeLineagePair_Attribute_lineage_model() {
		return (EReference)birdArtefactsAndAttributeLineagePairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeLineageModelList() {
		return attributeLineageModelListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttributeLineageModelList_AttributeLineageModels() {
		return (EReference)attributeLineageModelListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBirdArtefactandAttributeLineageModelPairList() {
		return birdArtefactandAttributeLineageModelPairListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBirdArtefactandAttributeLineageModelPairList_List() {
		return (EReference)birdArtefactandAttributeLineageModelPairListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFullSpreadsheetLineageModelList() {
		return fullSpreadsheetLineageModelListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFullSpreadsheetLineageModelList_List() {
		return (EReference)fullSpreadsheetLineageModelListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputLayerOnlyDataLineageList() {
		return inputLayerOnlyDataLineageListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputLayerOnlyDataLineageList_List() {
		return (EReference)inputLayerOnlyDataLineageListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataLineageAndInputDataAndAttributeLineageTriple() {
		return dataLineageAndInputDataAndAttributeLineageTripleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataLineageAndInputDataAndAttributeLineageTriple_InputData() {
		return (EReference)dataLineageAndInputDataAndAttributeLineageTripleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataLineageAndInputDataAndAttributeLineageTriple_ResultsData() {
		return (EReference)dataLineageAndInputDataAndAttributeLineageTripleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataLineageAndInputDataAndAttributeLineageTriple_AttributeLineageModel() {
		return (EReference)dataLineageAndInputDataAndAttributeLineageTripleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataLineageAndInputDataAndAttributeLineageTripleList() {
		return dataLineageAndInputDataAndAttributeLineageTripleListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataLineageAndInputDataAndAttributeLineageTripleList_List() {
		return (EReference)dataLineageAndInputDataAndAttributeLineageTripleListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReleaseList() {
		return releaseListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReleaseList_Releases() {
		return (EReference)releaseListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReleaseAndAttributeLineageModelPair() {
		return releaseAndAttributeLineageModelPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReleaseAndAttributeLineageModelPair_Release() {
		return (EReference)releaseAndAttributeLineageModelPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReleaseAndAttributeLineageModelPair_AttributeLineageModel() {
		return (EReference)releaseAndAttributeLineageModelPairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReleaseAndAttributeLineageModelPairList() {
		return releaseAndAttributeLineageModelPairListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReleaseAndAttributeLineageModelPairList_List() {
		return (EReference)releaseAndAttributeLineageModelPairListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model_registryFactory getModel_registryFactory() {
		return (Model_registryFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelRegistryEClass = createEClass(MODEL_REGISTRY);
		createEReference(modelRegistryEClass, MODEL_REGISTRY__BIRD_ARTEFACT_LIST);
		createEReference(modelRegistryEClass, MODEL_REGISTRY__ATTRIBUTE_LINEAGE_MODEL_LIST);
		createEReference(modelRegistryEClass, MODEL_REGISTRY__BIRDAND_ALM_LIST);
		createEReference(modelRegistryEClass, MODEL_REGISTRY__FULL_DATA_LINEAGE_MODEL_LIST);
		createEReference(modelRegistryEClass, MODEL_REGISTRY__INPUT_LAYER_ONLY_DLM_LIST);
		createEReference(modelRegistryEClass, MODEL_REGISTRY__TRIPLE_LIST);
		createEReference(modelRegistryEClass, MODEL_REGISTRY__RELEASE_LIST);
		createEReference(modelRegistryEClass, MODEL_REGISTRY__RELEASE_AND_ALM_PAIR_LIST);

		birdArtefactsListEClass = createEClass(BIRD_ARTEFACTS_LIST);
		createEReference(birdArtefactsListEClass, BIRD_ARTEFACTS_LIST__BIRD_MODELS);

		birdArtefactsAndAttributeLineagePairEClass = createEClass(BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR);
		createEReference(birdArtefactsAndAttributeLineagePairEClass, BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR__BIRD_MODEL);
		createEReference(birdArtefactsAndAttributeLineagePairEClass, BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR__ATTRIBUTE_LINEAGE_MODEL);

		attributeLineageModelListEClass = createEClass(ATTRIBUTE_LINEAGE_MODEL_LIST);
		createEReference(attributeLineageModelListEClass, ATTRIBUTE_LINEAGE_MODEL_LIST__ATTRIBUTE_LINEAGE_MODELS);

		birdArtefactandAttributeLineageModelPairListEClass = createEClass(BIRD_ARTEFACTAND_ATTRIBUTE_LINEAGE_MODEL_PAIR_LIST);
		createEReference(birdArtefactandAttributeLineageModelPairListEClass, BIRD_ARTEFACTAND_ATTRIBUTE_LINEAGE_MODEL_PAIR_LIST__LIST);

		fullSpreadsheetLineageModelListEClass = createEClass(FULL_DATA_LINEAGE_MODEL_LIST);
		createEReference(fullSpreadsheetLineageModelListEClass, FULL_DATA_LINEAGE_MODEL_LIST__LIST);

		inputLayerOnlyDataLineageListEClass = createEClass(INPUT_LAYER_ONLY_DATA_LINEAGE_LIST);
		createEReference(inputLayerOnlyDataLineageListEClass, INPUT_LAYER_ONLY_DATA_LINEAGE_LIST__LIST);

		dataLineageAndInputDataAndAttributeLineageTripleEClass = createEClass(DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE);
		createEReference(dataLineageAndInputDataAndAttributeLineageTripleEClass, DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__INPUT_DATA);
		createEReference(dataLineageAndInputDataAndAttributeLineageTripleEClass, DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__RESULTS_DATA);
		createEReference(dataLineageAndInputDataAndAttributeLineageTripleEClass, DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE__ATTRIBUTE_LINEAGE_MODEL);

		dataLineageAndInputDataAndAttributeLineageTripleListEClass = createEClass(DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE_LIST);
		createEReference(dataLineageAndInputDataAndAttributeLineageTripleListEClass, DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE_LIST__LIST);

		releaseListEClass = createEClass(RELEASE_LIST);
		createEReference(releaseListEClass, RELEASE_LIST__RELEASES);

		releaseAndAttributeLineageModelPairEClass = createEClass(RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR);
		createEReference(releaseAndAttributeLineageModelPairEClass, RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR__RELEASE);
		createEReference(releaseAndAttributeLineageModelPairEClass, RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR__ATTRIBUTE_LINEAGE_MODEL);

		releaseAndAttributeLineageModelPairListEClass = createEClass(RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR_LIST);
		createEReference(releaseAndAttributeLineageModelPairListEClass, RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR_LIST__LIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Bird_modelPackage theBird_modelPackage = (Bird_modelPackage)EPackage.Registry.INSTANCE.getEPackage(Bird_modelPackage.eNS_URI);
		Attribute_lineagePackage theAttribute_lineagePackage = (Attribute_lineagePackage)EPackage.Registry.INSTANCE.getEPackage(Attribute_lineagePackage.eNS_URI);
		Data_lineagePackage theData_lineagePackage = (Data_lineagePackage)EPackage.Registry.INSTANCE.getEPackage(Data_lineagePackage.eNS_URI);
		TransformationPackage theTransformationPackage = (TransformationPackage)EPackage.Registry.INSTANCE.getEPackage(TransformationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(modelRegistryEClass, ModelRegistry.class, "ModelRegistry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelRegistry_BirdArtefactList(), this.getBirdArtefactsList(), null, "birdArtefactList", null, 0, 1, ModelRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelRegistry_AttributeLineageModelList(), this.getAttributeLineageModelList(), null, "attributeLineageModelList", null, 0, 1, ModelRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModelRegistry_BirdandALMList(), this.getBirdArtefactandAttributeLineageModelPairList(), null, "birdandALMList", null, 0, 1, ModelRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelRegistry_FullSpreadsheetLineageModelList(), this.getFullSpreadsheetLineageModelList(), null, "fullSpreadsheetLineageModelList", null, 0, 1, ModelRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelRegistry_InputLayerOnlyDLMList(), this.getInputLayerOnlyDataLineageList(), null, "inputLayerOnlyDLMList", null, 0, 1, ModelRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelRegistry_TripleList(), this.getDataLineageAndInputDataAndAttributeLineageTripleList(), null, "tripleList", null, 0, 1, ModelRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelRegistry_ReleaseList(), this.getReleaseList(), null, "releaseList", null, 0, 1, ModelRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelRegistry_ReleaseAndALMPairList(), this.getReleaseAndAttributeLineageModelPairList(), null, "releaseAndALMPairList", null, 0, 1, ModelRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(birdArtefactsListEClass, BirdArtefactsList.class, "BirdArtefactsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBirdArtefactsList_BirdModels(), theBird_modelPackage.getBIRDModel(), null, "birdModels", null, 0, -1, BirdArtefactsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(birdArtefactsAndAttributeLineagePairEClass, BirdArtefactsAndAttributeLineagePair.class, "BirdArtefactsAndAttributeLineagePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBirdArtefactsAndAttributeLineagePair_Bird_model(), theBird_modelPackage.getBIRDModel(), null, "bird_model", null, 0, 1, BirdArtefactsAndAttributeLineagePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBirdArtefactsAndAttributeLineagePair_Attribute_lineage_model(), theAttribute_lineagePackage.getAttributeLineageModel(), null, "attribute_lineage_model", null, 0, 1, BirdArtefactsAndAttributeLineagePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeLineageModelListEClass, AttributeLineageModelList.class, "AttributeLineageModelList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeLineageModelList_AttributeLineageModels(), theAttribute_lineagePackage.getAttributeLineageModel(), null, "attributeLineageModels", null, 0, -1, AttributeLineageModelList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(birdArtefactandAttributeLineageModelPairListEClass, BirdArtefactandAttributeLineageModelPairList.class, "BirdArtefactandAttributeLineageModelPairList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBirdArtefactandAttributeLineageModelPairList_List(), this.getBirdArtefactandAttributeLineageModelPairList(), null, "list", null, 0, -1, BirdArtefactandAttributeLineageModelPairList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fullSpreadsheetLineageModelListEClass, FullSpreadsheetLineageModelList.class, "FullSpreadsheetLineageModelList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFullSpreadsheetLineageModelList_List(), theData_lineagePackage.getSpreadsheetLineageModel(), null, "list", null, 0, -1, FullSpreadsheetLineageModelList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputLayerOnlyDataLineageListEClass, InputLayerOnlyDataLineageList.class, "InputLayerOnlyDataLineageList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputLayerOnlyDataLineageList_List(), theData_lineagePackage.getSpreadsheetLineageModel(), null, "list", null, 0, -1, InputLayerOnlyDataLineageList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataLineageAndInputDataAndAttributeLineageTripleEClass, DataLineageAndInputDataAndAttributeLineageTriple.class, "DataLineageAndInputDataAndAttributeLineageTriple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataLineageAndInputDataAndAttributeLineageTriple_InputData(), theData_lineagePackage.getSpreadsheetLineageModel(), null, "inputData", null, 0, 1, DataLineageAndInputDataAndAttributeLineageTriple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataLineageAndInputDataAndAttributeLineageTriple_ResultsData(), theData_lineagePackage.getSpreadsheetLineageModel(), null, "resultsData", null, 0, 1, DataLineageAndInputDataAndAttributeLineageTriple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataLineageAndInputDataAndAttributeLineageTriple_AttributeLineageModel(), theAttribute_lineagePackage.getAttributeLineageModel(), null, "attributeLineageModel", null, 0, 1, DataLineageAndInputDataAndAttributeLineageTriple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataLineageAndInputDataAndAttributeLineageTripleListEClass, DataLineageAndInputDataAndAttributeLineageTripleList.class, "DataLineageAndInputDataAndAttributeLineageTripleList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataLineageAndInputDataAndAttributeLineageTripleList_List(), this.getDataLineageAndInputDataAndAttributeLineageTriple(), null, "list", null, 0, -1, DataLineageAndInputDataAndAttributeLineageTripleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(releaseListEClass, ReleaseList.class, "ReleaseList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReleaseList_Releases(), theTransformationPackage.getRelease(), null, "releases", null, 0, -1, ReleaseList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(releaseAndAttributeLineageModelPairEClass, ReleaseAndAttributeLineageModelPair.class, "ReleaseAndAttributeLineageModelPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReleaseAndAttributeLineageModelPair_Release(), theTransformationPackage.getVersionedComponentsSet(), null, "release", null, 0, 1, ReleaseAndAttributeLineageModelPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReleaseAndAttributeLineageModelPair_AttributeLineageModel(), theAttribute_lineagePackage.getAttributeLineageModel(), null, "attributeLineageModel", null, 0, 1, ReleaseAndAttributeLineageModelPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(releaseAndAttributeLineageModelPairListEClass, ReleaseAndAttributeLineageModelPairList.class, "ReleaseAndAttributeLineageModelPairList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReleaseAndAttributeLineageModelPairList_List(), this.getReleaseAndAttributeLineageModelPair(), null, "list", null, 0, -1, ReleaseAndAttributeLineageModelPairList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Model_registryPackageImpl
