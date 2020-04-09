/**
 */
package model_registry.util;

import model_registry.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see model_registry.Model_registryPackage
 * @generated
 */
public class Model_registrySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Model_registryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model_registrySwitch() {
		if (modelPackage == null) {
			modelPackage = Model_registryPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Model_registryPackage.MODEL_REGISTRY: {
				ModelRegistry modelRegistry = (ModelRegistry)theEObject;
				T result = caseModelRegistry(modelRegistry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model_registryPackage.BIRD_ARTEFACTS_LIST: {
				BirdArtefactsList birdArtefactsList = (BirdArtefactsList)theEObject;
				T result = caseBirdArtefactsList(birdArtefactsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model_registryPackage.BIRD_ARTEFACTS_AND_ATTRIBUTE_LINEAGE_PAIR: {
				BirdArtefactsAndAttributeLineagePair birdArtefactsAndAttributeLineagePair = (BirdArtefactsAndAttributeLineagePair)theEObject;
				T result = caseBirdArtefactsAndAttributeLineagePair(birdArtefactsAndAttributeLineagePair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model_registryPackage.ATTRIBUTE_LINEAGE_MODEL_LIST: {
				AttributeLineageModelList attributeLineageModelList = (AttributeLineageModelList)theEObject;
				T result = caseAttributeLineageModelList(attributeLineageModelList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model_registryPackage.BIRD_ARTEFACTAND_ATTRIBUTE_LINEAGE_MODEL_PAIR_LIST: {
				BirdArtefactandAttributeLineageModelPairList birdArtefactandAttributeLineageModelPairList = (BirdArtefactandAttributeLineageModelPairList)theEObject;
				T result = caseBirdArtefactandAttributeLineageModelPairList(birdArtefactandAttributeLineageModelPairList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model_registryPackage.FULL_DATA_LINEAGE_MODEL_LIST: {
				FullSpreadsheetLineageModelList fullSpreadsheetLineageModelList = (FullSpreadsheetLineageModelList)theEObject;
				T result = caseFullSpreadsheetLineageModelList(fullSpreadsheetLineageModelList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model_registryPackage.INPUT_LAYER_ONLY_DATA_LINEAGE_LIST: {
				InputLayerOnlyDataLineageList inputLayerOnlyDataLineageList = (InputLayerOnlyDataLineageList)theEObject;
				T result = caseInputLayerOnlyDataLineageList(inputLayerOnlyDataLineageList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model_registryPackage.DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE: {
				DataLineageAndInputDataAndAttributeLineageTriple dataLineageAndInputDataAndAttributeLineageTriple = (DataLineageAndInputDataAndAttributeLineageTriple)theEObject;
				T result = caseDataLineageAndInputDataAndAttributeLineageTriple(dataLineageAndInputDataAndAttributeLineageTriple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model_registryPackage.DATA_LINEAGE_AND_INPUT_DATA_AND_ATTRIBUTE_LINEAGE_TRIPLE_LIST: {
				DataLineageAndInputDataAndAttributeLineageTripleList dataLineageAndInputDataAndAttributeLineageTripleList = (DataLineageAndInputDataAndAttributeLineageTripleList)theEObject;
				T result = caseDataLineageAndInputDataAndAttributeLineageTripleList(dataLineageAndInputDataAndAttributeLineageTripleList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model_registryPackage.RELEASE_LIST: {
				ReleaseList releaseList = (ReleaseList)theEObject;
				T result = caseReleaseList(releaseList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model_registryPackage.RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR: {
				ReleaseAndAttributeLineageModelPair releaseAndAttributeLineageModelPair = (ReleaseAndAttributeLineageModelPair)theEObject;
				T result = caseReleaseAndAttributeLineageModelPair(releaseAndAttributeLineageModelPair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model_registryPackage.RELEASE_AND_ATTRIBUTE_LINEAGE_MODEL_PAIR_LIST: {
				ReleaseAndAttributeLineageModelPairList releaseAndAttributeLineageModelPairList = (ReleaseAndAttributeLineageModelPairList)theEObject;
				T result = caseReleaseAndAttributeLineageModelPairList(releaseAndAttributeLineageModelPairList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Registry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Registry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelRegistry(ModelRegistry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bird Artefacts List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bird Artefacts List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBirdArtefactsList(BirdArtefactsList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bird Artefacts And Attribute Lineage Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bird Artefacts And Attribute Lineage Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBirdArtefactsAndAttributeLineagePair(BirdArtefactsAndAttributeLineagePair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Lineage Model List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Lineage Model List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeLineageModelList(AttributeLineageModelList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bird Artefactand Attribute Lineage Model Pair List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bird Artefactand Attribute Lineage Model Pair List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBirdArtefactandAttributeLineageModelPairList(BirdArtefactandAttributeLineageModelPairList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Full Data Lineage Model List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Full Data Lineage Model List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFullSpreadsheetLineageModelList(FullSpreadsheetLineageModelList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Layer Only Data Lineage List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Layer Only Data Lineage List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputLayerOnlyDataLineageList(InputLayerOnlyDataLineageList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Lineage And Input Data And Attribute Lineage Triple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Lineage And Input Data And Attribute Lineage Triple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataLineageAndInputDataAndAttributeLineageTriple(DataLineageAndInputDataAndAttributeLineageTriple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Lineage And Input Data And Attribute Lineage Triple List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Lineage And Input Data And Attribute Lineage Triple List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataLineageAndInputDataAndAttributeLineageTripleList(DataLineageAndInputDataAndAttributeLineageTripleList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReleaseList(ReleaseList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release And Attribute Lineage Model Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release And Attribute Lineage Model Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReleaseAndAttributeLineageModelPair(ReleaseAndAttributeLineageModelPair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release And Attribute Lineage Model Pair List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release And Attribute Lineage Model Pair List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReleaseAndAttributeLineageModelPairList(ReleaseAndAttributeLineageModelPairList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Model_registrySwitch
