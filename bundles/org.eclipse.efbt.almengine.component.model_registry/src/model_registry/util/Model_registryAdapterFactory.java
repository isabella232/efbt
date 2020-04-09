/**
 */
package model_registry.util;

import model_registry.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see model_registry.Model_registryPackage
 * @generated
 */
public class Model_registryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Model_registryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model_registryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Model_registryPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Model_registrySwitch<Adapter> modelSwitch =
		new Model_registrySwitch<Adapter>() {
			@Override
			public Adapter caseModelRegistry(ModelRegistry object) {
				return createModelRegistryAdapter();
			}
			@Override
			public Adapter caseBirdArtefactsList(BirdArtefactsList object) {
				return createBirdArtefactsListAdapter();
			}
			@Override
			public Adapter caseBirdArtefactsAndAttributeLineagePair(BirdArtefactsAndAttributeLineagePair object) {
				return createBirdArtefactsAndAttributeLineagePairAdapter();
			}
			@Override
			public Adapter caseAttributeLineageModelList(AttributeLineageModelList object) {
				return createAttributeLineageModelListAdapter();
			}
			@Override
			public Adapter caseBirdArtefactandAttributeLineageModelPairList(BirdArtefactandAttributeLineageModelPairList object) {
				return createBirdArtefactandAttributeLineageModelPairListAdapter();
			}
			@Override
			public Adapter caseFullSpreadsheetLineageModelList(FullSpreadsheetLineageModelList object) {
				return createFullSpreadsheetLineageModelListAdapter();
			}
			@Override
			public Adapter caseInputLayerOnlyDataLineageList(InputLayerOnlyDataLineageList object) {
				return createInputLayerOnlyDataLineageListAdapter();
			}
			@Override
			public Adapter caseDataLineageAndInputDataAndAttributeLineageTriple(DataLineageAndInputDataAndAttributeLineageTriple object) {
				return createDataLineageAndInputDataAndAttributeLineageTripleAdapter();
			}
			@Override
			public Adapter caseDataLineageAndInputDataAndAttributeLineageTripleList(DataLineageAndInputDataAndAttributeLineageTripleList object) {
				return createDataLineageAndInputDataAndAttributeLineageTripleListAdapter();
			}
			@Override
			public Adapter caseReleaseList(ReleaseList object) {
				return createReleaseListAdapter();
			}
			@Override
			public Adapter caseReleaseAndAttributeLineageModelPair(ReleaseAndAttributeLineageModelPair object) {
				return createReleaseAndAttributeLineageModelPairAdapter();
			}
			@Override
			public Adapter caseReleaseAndAttributeLineageModelPairList(ReleaseAndAttributeLineageModelPairList object) {
				return createReleaseAndAttributeLineageModelPairListAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link model_registry.ModelRegistry <em>Model Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model_registry.ModelRegistry
	 * @generated
	 */
	public Adapter createModelRegistryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model_registry.BirdArtefactsList <em>Bird Artefacts List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model_registry.BirdArtefactsList
	 * @generated
	 */
	public Adapter createBirdArtefactsListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model_registry.BirdArtefactsAndAttributeLineagePair <em>Bird Artefacts And Attribute Lineage Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model_registry.BirdArtefactsAndAttributeLineagePair
	 * @generated
	 */
	public Adapter createBirdArtefactsAndAttributeLineagePairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model_registry.AttributeLineageModelList <em>Attribute Lineage Model List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model_registry.AttributeLineageModelList
	 * @generated
	 */
	public Adapter createAttributeLineageModelListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model_registry.BirdArtefactandAttributeLineageModelPairList <em>Bird Artefactand Attribute Lineage Model Pair List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model_registry.BirdArtefactandAttributeLineageModelPairList
	 * @generated
	 */
	public Adapter createBirdArtefactandAttributeLineageModelPairListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model_registry.FullSpreadsheetLineageModelList <em>Full Data Lineage Model List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model_registry.FullSpreadsheetLineageModelList
	 * @generated
	 */
	public Adapter createFullSpreadsheetLineageModelListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model_registry.InputLayerOnlyDataLineageList <em>Input Layer Only Data Lineage List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model_registry.InputLayerOnlyDataLineageList
	 * @generated
	 */
	public Adapter createInputLayerOnlyDataLineageListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model_registry.DataLineageAndInputDataAndAttributeLineageTriple <em>Data Lineage And Input Data And Attribute Lineage Triple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model_registry.DataLineageAndInputDataAndAttributeLineageTriple
	 * @generated
	 */
	public Adapter createDataLineageAndInputDataAndAttributeLineageTripleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model_registry.DataLineageAndInputDataAndAttributeLineageTripleList <em>Data Lineage And Input Data And Attribute Lineage Triple List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model_registry.DataLineageAndInputDataAndAttributeLineageTripleList
	 * @generated
	 */
	public Adapter createDataLineageAndInputDataAndAttributeLineageTripleListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model_registry.ReleaseList <em>Release List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model_registry.ReleaseList
	 * @generated
	 */
	public Adapter createReleaseListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model_registry.ReleaseAndAttributeLineageModelPair <em>Release And Attribute Lineage Model Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model_registry.ReleaseAndAttributeLineageModelPair
	 * @generated
	 */
	public Adapter createReleaseAndAttributeLineageModelPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model_registry.ReleaseAndAttributeLineageModelPairList <em>Release And Attribute Lineage Model Pair List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model_registry.ReleaseAndAttributeLineageModelPairList
	 * @generated
	 */
	public Adapter createReleaseAndAttributeLineageModelPairListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Model_registryAdapterFactory
