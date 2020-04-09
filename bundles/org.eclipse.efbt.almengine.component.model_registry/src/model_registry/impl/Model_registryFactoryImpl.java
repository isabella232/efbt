/**
 */
package model_registry.impl;

import model_registry.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Model_registryFactoryImpl extends EFactoryImpl implements Model_registryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Model_registryFactory init() {
		try {
			Model_registryFactory theModel_registryFactory = (Model_registryFactory)EPackage.Registry.INSTANCE.getEFactory(Model_registryPackage.eNS_URI);
			if (theModel_registryFactory != null) {
				return theModel_registryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Model_registryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model_registryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Model_registryPackage.MODEL_REGISTRY: return createModelRegistry();
			case Model_registryPackage.BIRD_ARTEFACTS_LIST: return createBirdArtefactsList();
			case Model_registryPackage.BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR: return createBirdArtefactsAndAttributeLineagePair();
			case Model_registryPackage.ATTRIBUTE_LINEAGE_MODEL_LIST: return createAttributeLineageModelList();
			case Model_registryPackage.BIRD_ARTEFACTAND_ATTRIBUTE_LINEAGE_MODEL_PAIR_LIST: return createBirdArtefactandAttributeLineageModelPairList();
			case Model_registryPackage.FULL_DATA_LINEAGE_MODEL_LIST: return createFullSpreadsheetLineageModelList();
			case Model_registryPackage.INPUT_LAYER_ONLY_DATA_LINEAGE_LIST: return createInputLayerOnlyDataLineageList();
			case Model_registryPackage.DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE: return createDataLineageAndInputDataAndAttributeLineageTriple();
			case Model_registryPackage.DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE_LIST: return createDataLineageAndInputDataAndAttributeLineageTripleList();
			case Model_registryPackage.RELEASE_LIST: return createReleaseList();
			case Model_registryPackage.RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR: return createReleaseAndAttributeLineageModelPair();
			case Model_registryPackage.RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR_LIST: return createReleaseAndAttributeLineageModelPairList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelRegistry createModelRegistry() {
		ModelRegistryImpl modelRegistry = new ModelRegistryImpl();
		return modelRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BirdArtefactsList createBirdArtefactsList() {
		BirdArtefactsListImpl birdArtefactsList = new BirdArtefactsListImpl();
		return birdArtefactsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BirdArtefactsAndAttributeLineagePair createBirdArtefactsAndAttributeLineagePair() {
		BirdArtefactsAndAttributeLineagePairImpl birdArtefactsAndAttributeLineagePair = new BirdArtefactsAndAttributeLineagePairImpl();
		return birdArtefactsAndAttributeLineagePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeLineageModelList createAttributeLineageModelList() {
		AttributeLineageModelListImpl attributeLineageModelList = new AttributeLineageModelListImpl();
		return attributeLineageModelList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BirdArtefactandAttributeLineageModelPairList createBirdArtefactandAttributeLineageModelPairList() {
		BirdArtefactandAttributeLineageModelPairListImpl birdArtefactandAttributeLineageModelPairList = new BirdArtefactandAttributeLineageModelPairListImpl();
		return birdArtefactandAttributeLineageModelPairList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FullSpreadsheetLineageModelList createFullSpreadsheetLineageModelList() {
		FullSpreadsheetLineageModelListImpl fullSpreadsheetLineageModelList = new FullSpreadsheetLineageModelListImpl();
		return fullSpreadsheetLineageModelList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputLayerOnlyDataLineageList createInputLayerOnlyDataLineageList() {
		InputLayerOnlyDataLineageListImpl inputLayerOnlyDataLineageList = new InputLayerOnlyDataLineageListImpl();
		return inputLayerOnlyDataLineageList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataLineageAndInputDataAndAttributeLineageTriple createDataLineageAndInputDataAndAttributeLineageTriple() {
		DataLineageAndInputDataAndAttributeLineageTripleImpl dataLineageAndInputDataAndAttributeLineageTriple = new DataLineageAndInputDataAndAttributeLineageTripleImpl();
		return dataLineageAndInputDataAndAttributeLineageTriple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataLineageAndInputDataAndAttributeLineageTripleList createDataLineageAndInputDataAndAttributeLineageTripleList() {
		DataLineageAndInputDataAndAttributeLineageTripleListImpl dataLineageAndInputDataAndAttributeLineageTripleList = new DataLineageAndInputDataAndAttributeLineageTripleListImpl();
		return dataLineageAndInputDataAndAttributeLineageTripleList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReleaseList createReleaseList() {
		ReleaseListImpl releaseList = new ReleaseListImpl();
		return releaseList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReleaseAndAttributeLineageModelPair createReleaseAndAttributeLineageModelPair() {
		ReleaseAndAttributeLineageModelPairImpl releaseAndAttributeLineageModelPair = new ReleaseAndAttributeLineageModelPairImpl();
		return releaseAndAttributeLineageModelPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReleaseAndAttributeLineageModelPairList createReleaseAndAttributeLineageModelPairList() {
		ReleaseAndAttributeLineageModelPairListImpl releaseAndAttributeLineageModelPairList = new ReleaseAndAttributeLineageModelPairListImpl();
		return releaseAndAttributeLineageModelPairList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model_registryPackage getModel_registryPackage() {
		return (Model_registryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Model_registryPackage getPackage() {
		return Model_registryPackage.eINSTANCE;
	}

} //Model_registryFactoryImpl
