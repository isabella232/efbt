/**
 */
package model_registry;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model_registry.ModelRegistry#getBirdArtefactList <em>Bird Artefact List</em>}</li>
 *   <li>{@link model_registry.ModelRegistry#getAttributeLineageModelList <em>Attribute Lineage Model List</em>}</li>
 *   <li>{@link model_registry.ModelRegistry#getBirdandALMList <em>Birdand ALM List</em>}</li>
 *   <li>{@link model_registry.ModelRegistry#getFullSpreadsheetLineageModelList <em>Full Data Lineage Model List</em>}</li>
 *   <li>{@link model_registry.ModelRegistry#getInputLayerOnlyDLMList <em>Input Layer Only DLM List</em>}</li>
 *   <li>{@link model_registry.ModelRegistry#getTripleList <em>Triple List</em>}</li>
 *   <li>{@link model_registry.ModelRegistry#getReleaseList <em>Release List</em>}</li>
 *   <li>{@link model_registry.ModelRegistry#getReleaseAndALMPairList <em>Release And ALM Pair List</em>}</li>
 * </ul>
 *
 * @see model_registry.Model_registryPackage#getModelRegistry()
 * @model
 * @generated
 */
public interface ModelRegistry extends EObject {
	/**
	 * Returns the value of the '<em><b>Bird Artefact List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bird Artefact List</em>' containment reference.
	 * @see #setBirdArtefactList(BirdArtefactsList)
	 * @see model_registry.Model_registryPackage#getModelRegistry_BirdArtefactList()
	 * @model containment="true"
	 * @generated
	 */
	BirdArtefactsList getBirdArtefactList();

	/**
	 * Sets the value of the '{@link model_registry.ModelRegistry#getBirdArtefactList <em>Bird Artefact List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bird Artefact List</em>' containment reference.
	 * @see #getBirdArtefactList()
	 * @generated
	 */
	void setBirdArtefactList(BirdArtefactsList value);

	/**
	 * Returns the value of the '<em><b>Attribute Lineage Model List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Lineage Model List</em>' containment reference.
	 * @see #setAttributeLineageModelList(AttributeLineageModelList)
	 * @see model_registry.Model_registryPackage#getModelRegistry_AttributeLineageModelList()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	AttributeLineageModelList getAttributeLineageModelList();

	/**
	 * Sets the value of the '{@link model_registry.ModelRegistry#getAttributeLineageModelList <em>Attribute Lineage Model List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Lineage Model List</em>' containment reference.
	 * @see #getAttributeLineageModelList()
	 * @generated
	 */
	void setAttributeLineageModelList(AttributeLineageModelList value);

	/**
	 * Returns the value of the '<em><b>Birdand ALM List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birdand ALM List</em>' containment reference.
	 * @see #setBirdandALMList(BirdArtefactandAttributeLineageModelPairList)
	 * @see model_registry.Model_registryPackage#getModelRegistry_BirdandALMList()
	 * @model containment="true"
	 * @generated
	 */
	BirdArtefactandAttributeLineageModelPairList getBirdandALMList();

	/**
	 * Sets the value of the '{@link model_registry.ModelRegistry#getBirdandALMList <em>Birdand ALM List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birdand ALM List</em>' containment reference.
	 * @see #getBirdandALMList()
	 * @generated
	 */
	void setBirdandALMList(BirdArtefactandAttributeLineageModelPairList value);

	/**
	 * Returns the value of the '<em><b>Full Data Lineage Model List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Data Lineage Model List</em>' containment reference.
	 * @see #setFullSpreadsheetLineageModelList(FullSpreadsheetLineageModelList)
	 * @see model_registry.Model_registryPackage#getModelRegistry_FullSpreadsheetLineageModelList()
	 * @model containment="true"
	 * @generated
	 */
	FullSpreadsheetLineageModelList getFullSpreadsheetLineageModelList();

	/**
	 * Sets the value of the '{@link model_registry.ModelRegistry#getFullSpreadsheetLineageModelList <em>Full Data Lineage Model List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Data Lineage Model List</em>' containment reference.
	 * @see #getFullSpreadsheetLineageModelList()
	 * @generated
	 */
	void setFullSpreadsheetLineageModelList(FullSpreadsheetLineageModelList value);

	/**
	 * Returns the value of the '<em><b>Input Layer Only DLM List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Layer Only DLM List</em>' containment reference.
	 * @see #setInputLayerOnlyDLMList(InputLayerOnlyDataLineageList)
	 * @see model_registry.Model_registryPackage#getModelRegistry_InputLayerOnlyDLMList()
	 * @model containment="true"
	 * @generated
	 */
	InputLayerOnlyDataLineageList getInputLayerOnlyDLMList();

	/**
	 * Sets the value of the '{@link model_registry.ModelRegistry#getInputLayerOnlyDLMList <em>Input Layer Only DLM List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Layer Only DLM List</em>' containment reference.
	 * @see #getInputLayerOnlyDLMList()
	 * @generated
	 */
	void setInputLayerOnlyDLMList(InputLayerOnlyDataLineageList value);

	/**
	 * Returns the value of the '<em><b>Triple List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triple List</em>' containment reference.
	 * @see #setTripleList(DataLineageAndInputDataAndAttributeLineageTripleList)
	 * @see model_registry.Model_registryPackage#getModelRegistry_TripleList()
	 * @model containment="true"
	 * @generated
	 */
	DataLineageAndInputDataAndAttributeLineageTripleList getTripleList();

	/**
	 * Sets the value of the '{@link model_registry.ModelRegistry#getTripleList <em>Triple List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triple List</em>' containment reference.
	 * @see #getTripleList()
	 * @generated
	 */
	void setTripleList(DataLineageAndInputDataAndAttributeLineageTripleList value);

	/**
	 * Returns the value of the '<em><b>Release List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release List</em>' containment reference.
	 * @see #setReleaseList(ReleaseList)
	 * @see model_registry.Model_registryPackage#getModelRegistry_ReleaseList()
	 * @model containment="true"
	 * @generated
	 */
	ReleaseList getReleaseList();

	/**
	 * Sets the value of the '{@link model_registry.ModelRegistry#getReleaseList <em>Release List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release List</em>' containment reference.
	 * @see #getReleaseList()
	 * @generated
	 */
	void setReleaseList(ReleaseList value);

	/**
	 * Returns the value of the '<em><b>Release And ALM Pair List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release And ALM Pair List</em>' containment reference.
	 * @see #setReleaseAndALMPairList(ReleaseAndAttributeLineageModelPairList)
	 * @see model_registry.Model_registryPackage#getModelRegistry_ReleaseAndALMPairList()
	 * @model containment="true"
	 * @generated
	 */
	ReleaseAndAttributeLineageModelPairList getReleaseAndALMPairList();

	/**
	 * Sets the value of the '{@link model_registry.ModelRegistry#getReleaseAndALMPairList <em>Release And ALM Pair List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release And ALM Pair List</em>' containment reference.
	 * @see #getReleaseAndALMPairList()
	 * @generated
	 */
	void setReleaseAndALMPairList(ReleaseAndAttributeLineageModelPairList value);

} // ModelRegistry
