/**
 */
package model_registry.impl;

import model_registry.AttributeLineageModelList;
import model_registry.BirdArtefactandAttributeLineageModelPairList;
import model_registry.BirdArtefactsList;
import model_registry.DataLineageAndInputDataAndAttributeLineageTripleList;
import model_registry.FullSpreadsheetLineageModelList;
import model_registry.InputLayerOnlyDataLineageList;
import model_registry.ModelRegistry;
import model_registry.Model_registryPackage;
import model_registry.ReleaseAndAttributeLineageModelPairList;
import model_registry.ReleaseList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model_registry.impl.ModelRegistryImpl#getBirdArtefactList <em>Bird Artefact List</em>}</li>
 *   <li>{@link model_registry.impl.ModelRegistryImpl#getAttributeLineageModelList <em>Attribute Lineage Model List</em>}</li>
 *   <li>{@link model_registry.impl.ModelRegistryImpl#getBirdandALMList <em>Birdand ALM List</em>}</li>
 *   <li>{@link model_registry.impl.ModelRegistryImpl#getFullSpreadsheetLineageModelList <em>Full Data Lineage Model List</em>}</li>
 *   <li>{@link model_registry.impl.ModelRegistryImpl#getInputLayerOnlyDLMList <em>Input Layer Only DLM List</em>}</li>
 *   <li>{@link model_registry.impl.ModelRegistryImpl#getTripleList <em>Triple List</em>}</li>
 *   <li>{@link model_registry.impl.ModelRegistryImpl#getReleaseList <em>Release List</em>}</li>
 *   <li>{@link model_registry.impl.ModelRegistryImpl#getReleaseAndALMPairList <em>Release And ALM Pair List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelRegistryImpl extends MinimalEObjectImpl.Container implements ModelRegistry {
	/**
	 * The cached value of the '{@link #getBirdArtefactList() <em>Bird Artefact List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirdArtefactList()
	 * @generated
	 * @ordered
	 */
	protected BirdArtefactsList birdArtefactList;

	/**
	 * The cached value of the '{@link #getAttributeLineageModelList() <em>Attribute Lineage Model List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeLineageModelList()
	 * @generated
	 * @ordered
	 */
	protected AttributeLineageModelList attributeLineageModelList;

	/**
	 * The cached value of the '{@link #getBirdandALMList() <em>Birdand ALM List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirdandALMList()
	 * @generated
	 * @ordered
	 */
	protected BirdArtefactandAttributeLineageModelPairList birdandALMList;

	/**
	 * The cached value of the '{@link #getFullSpreadsheetLineageModelList() <em>Full Data Lineage Model List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullSpreadsheetLineageModelList()
	 * @generated
	 * @ordered
	 */
	protected FullSpreadsheetLineageModelList fullSpreadsheetLineageModelList;

	/**
	 * The cached value of the '{@link #getInputLayerOnlyDLMList() <em>Input Layer Only DLM List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputLayerOnlyDLMList()
	 * @generated
	 * @ordered
	 */
	protected InputLayerOnlyDataLineageList inputLayerOnlyDLMList;

	/**
	 * The cached value of the '{@link #getTripleList() <em>Triple List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripleList()
	 * @generated
	 * @ordered
	 */
	protected DataLineageAndInputDataAndAttributeLineageTripleList tripleList;

	/**
	 * The cached value of the '{@link #getReleaseList() <em>Release List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseList()
	 * @generated
	 * @ordered
	 */
	protected ReleaseList releaseList;

	/**
	 * The cached value of the '{@link #getReleaseAndALMPairList() <em>Release And ALM Pair List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseAndALMPairList()
	 * @generated
	 * @ordered
	 */
	protected ReleaseAndAttributeLineageModelPairList releaseAndALMPairList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelRegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model_registryPackage.Literals.MODEL_REGISTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BirdArtefactsList getBirdArtefactList() {
		return birdArtefactList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBirdArtefactList(BirdArtefactsList newBirdArtefactList, NotificationChain msgs) {
		BirdArtefactsList oldBirdArtefactList = birdArtefactList;
		birdArtefactList = newBirdArtefactList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Model_registryPackage.MODEL_REGISTRY__BIRD_ARTEFACT_LIST, oldBirdArtefactList, newBirdArtefactList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBirdArtefactList(BirdArtefactsList newBirdArtefactList) {
		if (newBirdArtefactList != birdArtefactList) {
			NotificationChain msgs = null;
			if (birdArtefactList != null)
				msgs = ((InternalEObject)birdArtefactList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Model_registryPackage.MODEL_REGISTRY__BIRD_ARTEFACT_LIST, null, msgs);
			if (newBirdArtefactList != null)
				msgs = ((InternalEObject)newBirdArtefactList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Model_registryPackage.MODEL_REGISTRY__BIRD_ARTEFACT_LIST, null, msgs);
			msgs = basicSetBirdArtefactList(newBirdArtefactList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model_registryPackage.MODEL_REGISTRY__BIRD_ARTEFACT_LIST, newBirdArtefactList, newBirdArtefactList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeLineageModelList getAttributeLineageModelList() {
		return attributeLineageModelList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeLineageModelList(AttributeLineageModelList newAttributeLineageModelList, NotificationChain msgs) {
		AttributeLineageModelList oldAttributeLineageModelList = attributeLineageModelList;
		attributeLineageModelList = newAttributeLineageModelList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Model_registryPackage.MODEL_REGISTRY__ATTRIBUTE_LINEAGE_MODEL_LIST, oldAttributeLineageModelList, newAttributeLineageModelList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributeLineageModelList(AttributeLineageModelList newAttributeLineageModelList) {
		if (newAttributeLineageModelList != attributeLineageModelList) {
			NotificationChain msgs = null;
			if (attributeLineageModelList != null)
				msgs = ((InternalEObject)attributeLineageModelList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Model_registryPackage.MODEL_REGISTRY__ATTRIBUTE_LINEAGE_MODEL_LIST, null, msgs);
			if (newAttributeLineageModelList != null)
				msgs = ((InternalEObject)newAttributeLineageModelList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Model_registryPackage.MODEL_REGISTRY__ATTRIBUTE_LINEAGE_MODEL_LIST, null, msgs);
			msgs = basicSetAttributeLineageModelList(newAttributeLineageModelList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model_registryPackage.MODEL_REGISTRY__ATTRIBUTE_LINEAGE_MODEL_LIST, newAttributeLineageModelList, newAttributeLineageModelList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BirdArtefactandAttributeLineageModelPairList getBirdandALMList() {
		return birdandALMList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBirdandALMList(BirdArtefactandAttributeLineageModelPairList newBirdandALMList, NotificationChain msgs) {
		BirdArtefactandAttributeLineageModelPairList oldBirdandALMList = birdandALMList;
		birdandALMList = newBirdandALMList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Model_registryPackage.MODEL_REGISTRY__BIRDAND_ALM_LIST, oldBirdandALMList, newBirdandALMList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBirdandALMList(BirdArtefactandAttributeLineageModelPairList newBirdandALMList) {
		if (newBirdandALMList != birdandALMList) {
			NotificationChain msgs = null;
			if (birdandALMList != null)
				msgs = ((InternalEObject)birdandALMList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Model_registryPackage.MODEL_REGISTRY__BIRDAND_ALM_LIST, null, msgs);
			if (newBirdandALMList != null)
				msgs = ((InternalEObject)newBirdandALMList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Model_registryPackage.MODEL_REGISTRY__BIRDAND_ALM_LIST, null, msgs);
			msgs = basicSetBirdandALMList(newBirdandALMList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model_registryPackage.MODEL_REGISTRY__BIRDAND_ALM_LIST, newBirdandALMList, newBirdandALMList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FullSpreadsheetLineageModelList getFullSpreadsheetLineageModelList() {
		return fullSpreadsheetLineageModelList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFullSpreadsheetLineageModelList(FullSpreadsheetLineageModelList newFullSpreadsheetLineageModelList, NotificationChain msgs) {
		FullSpreadsheetLineageModelList oldFullSpreadsheetLineageModelList = fullSpreadsheetLineageModelList;
		fullSpreadsheetLineageModelList = newFullSpreadsheetLineageModelList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Model_registryPackage.MODEL_REGISTRY__FULL_DATA_LINEAGE_MODEL_LIST, oldFullSpreadsheetLineageModelList, newFullSpreadsheetLineageModelList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFullSpreadsheetLineageModelList(FullSpreadsheetLineageModelList newFullSpreadsheetLineageModelList) {
		if (newFullSpreadsheetLineageModelList != fullSpreadsheetLineageModelList) {
			NotificationChain msgs = null;
			if (fullSpreadsheetLineageModelList != null)
				msgs = ((InternalEObject)fullSpreadsheetLineageModelList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Model_registryPackage.MODEL_REGISTRY__FULL_DATA_LINEAGE_MODEL_LIST, null, msgs);
			if (newFullSpreadsheetLineageModelList != null)
				msgs = ((InternalEObject)newFullSpreadsheetLineageModelList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Model_registryPackage.MODEL_REGISTRY__FULL_DATA_LINEAGE_MODEL_LIST, null, msgs);
			msgs = basicSetFullSpreadsheetLineageModelList(newFullSpreadsheetLineageModelList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model_registryPackage.MODEL_REGISTRY__FULL_DATA_LINEAGE_MODEL_LIST, newFullSpreadsheetLineageModelList, newFullSpreadsheetLineageModelList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputLayerOnlyDataLineageList getInputLayerOnlyDLMList() {
		return inputLayerOnlyDLMList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputLayerOnlyDLMList(InputLayerOnlyDataLineageList newInputLayerOnlyDLMList, NotificationChain msgs) {
		InputLayerOnlyDataLineageList oldInputLayerOnlyDLMList = inputLayerOnlyDLMList;
		inputLayerOnlyDLMList = newInputLayerOnlyDLMList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Model_registryPackage.MODEL_REGISTRY__INPUT_LAYER_ONLY_DLM_LIST, oldInputLayerOnlyDLMList, newInputLayerOnlyDLMList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputLayerOnlyDLMList(InputLayerOnlyDataLineageList newInputLayerOnlyDLMList) {
		if (newInputLayerOnlyDLMList != inputLayerOnlyDLMList) {
			NotificationChain msgs = null;
			if (inputLayerOnlyDLMList != null)
				msgs = ((InternalEObject)inputLayerOnlyDLMList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Model_registryPackage.MODEL_REGISTRY__INPUT_LAYER_ONLY_DLM_LIST, null, msgs);
			if (newInputLayerOnlyDLMList != null)
				msgs = ((InternalEObject)newInputLayerOnlyDLMList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Model_registryPackage.MODEL_REGISTRY__INPUT_LAYER_ONLY_DLM_LIST, null, msgs);
			msgs = basicSetInputLayerOnlyDLMList(newInputLayerOnlyDLMList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model_registryPackage.MODEL_REGISTRY__INPUT_LAYER_ONLY_DLM_LIST, newInputLayerOnlyDLMList, newInputLayerOnlyDLMList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataLineageAndInputDataAndAttributeLineageTripleList getTripleList() {
		return tripleList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTripleList(DataLineageAndInputDataAndAttributeLineageTripleList newTripleList, NotificationChain msgs) {
		DataLineageAndInputDataAndAttributeLineageTripleList oldTripleList = tripleList;
		tripleList = newTripleList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Model_registryPackage.MODEL_REGISTRY__TRIPLE_LIST, oldTripleList, newTripleList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTripleList(DataLineageAndInputDataAndAttributeLineageTripleList newTripleList) {
		if (newTripleList != tripleList) {
			NotificationChain msgs = null;
			if (tripleList != null)
				msgs = ((InternalEObject)tripleList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Model_registryPackage.MODEL_REGISTRY__TRIPLE_LIST, null, msgs);
			if (newTripleList != null)
				msgs = ((InternalEObject)newTripleList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Model_registryPackage.MODEL_REGISTRY__TRIPLE_LIST, null, msgs);
			msgs = basicSetTripleList(newTripleList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model_registryPackage.MODEL_REGISTRY__TRIPLE_LIST, newTripleList, newTripleList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReleaseList getReleaseList() {
		return releaseList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReleaseList(ReleaseList newReleaseList, NotificationChain msgs) {
		ReleaseList oldReleaseList = releaseList;
		releaseList = newReleaseList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Model_registryPackage.MODEL_REGISTRY__RELEASE_LIST, oldReleaseList, newReleaseList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReleaseList(ReleaseList newReleaseList) {
		if (newReleaseList != releaseList) {
			NotificationChain msgs = null;
			if (releaseList != null)
				msgs = ((InternalEObject)releaseList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Model_registryPackage.MODEL_REGISTRY__RELEASE_LIST, null, msgs);
			if (newReleaseList != null)
				msgs = ((InternalEObject)newReleaseList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Model_registryPackage.MODEL_REGISTRY__RELEASE_LIST, null, msgs);
			msgs = basicSetReleaseList(newReleaseList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model_registryPackage.MODEL_REGISTRY__RELEASE_LIST, newReleaseList, newReleaseList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReleaseAndAttributeLineageModelPairList getReleaseAndALMPairList() {
		return releaseAndALMPairList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReleaseAndALMPairList(ReleaseAndAttributeLineageModelPairList newReleaseAndALMPairList, NotificationChain msgs) {
		ReleaseAndAttributeLineageModelPairList oldReleaseAndALMPairList = releaseAndALMPairList;
		releaseAndALMPairList = newReleaseAndALMPairList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Model_registryPackage.MODEL_REGISTRY__RELEASE_AND_ALM_PAIR_LIST, oldReleaseAndALMPairList, newReleaseAndALMPairList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReleaseAndALMPairList(ReleaseAndAttributeLineageModelPairList newReleaseAndALMPairList) {
		if (newReleaseAndALMPairList != releaseAndALMPairList) {
			NotificationChain msgs = null;
			if (releaseAndALMPairList != null)
				msgs = ((InternalEObject)releaseAndALMPairList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Model_registryPackage.MODEL_REGISTRY__RELEASE_AND_ALM_PAIR_LIST, null, msgs);
			if (newReleaseAndALMPairList != null)
				msgs = ((InternalEObject)newReleaseAndALMPairList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Model_registryPackage.MODEL_REGISTRY__RELEASE_AND_ALM_PAIR_LIST, null, msgs);
			msgs = basicSetReleaseAndALMPairList(newReleaseAndALMPairList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model_registryPackage.MODEL_REGISTRY__RELEASE_AND_ALM_PAIR_LIST, newReleaseAndALMPairList, newReleaseAndALMPairList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Model_registryPackage.MODEL_REGISTRY__BIRD_ARTEFACT_LIST:
				return basicSetBirdArtefactList(null, msgs);
			case Model_registryPackage.MODEL_REGISTRY__ATTRIBUTE_LINEAGE_MODEL_LIST:
				return basicSetAttributeLineageModelList(null, msgs);
			case Model_registryPackage.MODEL_REGISTRY__BIRDAND_ALM_LIST:
				return basicSetBirdandALMList(null, msgs);
			case Model_registryPackage.MODEL_REGISTRY__FULL_DATA_LINEAGE_MODEL_LIST:
				return basicSetFullSpreadsheetLineageModelList(null, msgs);
			case Model_registryPackage.MODEL_REGISTRY__INPUT_LAYER_ONLY_DLM_LIST:
				return basicSetInputLayerOnlyDLMList(null, msgs);
			case Model_registryPackage.MODEL_REGISTRY__TRIPLE_LIST:
				return basicSetTripleList(null, msgs);
			case Model_registryPackage.MODEL_REGISTRY__RELEASE_LIST:
				return basicSetReleaseList(null, msgs);
			case Model_registryPackage.MODEL_REGISTRY__RELEASE_AND_ALM_PAIR_LIST:
				return basicSetReleaseAndALMPairList(null, msgs);
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
			case Model_registryPackage.MODEL_REGISTRY__BIRD_ARTEFACT_LIST:
				return getBirdArtefactList();
			case Model_registryPackage.MODEL_REGISTRY__ATTRIBUTE_LINEAGE_MODEL_LIST:
				return getAttributeLineageModelList();
			case Model_registryPackage.MODEL_REGISTRY__BIRDAND_ALM_LIST:
				return getBirdandALMList();
			case Model_registryPackage.MODEL_REGISTRY__FULL_DATA_LINEAGE_MODEL_LIST:
				return getFullSpreadsheetLineageModelList();
			case Model_registryPackage.MODEL_REGISTRY__INPUT_LAYER_ONLY_DLM_LIST:
				return getInputLayerOnlyDLMList();
			case Model_registryPackage.MODEL_REGISTRY__TRIPLE_LIST:
				return getTripleList();
			case Model_registryPackage.MODEL_REGISTRY__RELEASE_LIST:
				return getReleaseList();
			case Model_registryPackage.MODEL_REGISTRY__RELEASE_AND_ALM_PAIR_LIST:
				return getReleaseAndALMPairList();
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
			case Model_registryPackage.MODEL_REGISTRY__BIRD_ARTEFACT_LIST:
				setBirdArtefactList((BirdArtefactsList)newValue);
				return;
			case Model_registryPackage.MODEL_REGISTRY__ATTRIBUTE_LINEAGE_MODEL_LIST:
				setAttributeLineageModelList((AttributeLineageModelList)newValue);
				return;
			case Model_registryPackage.MODEL_REGISTRY__BIRDAND_ALM_LIST:
				setBirdandALMList((BirdArtefactandAttributeLineageModelPairList)newValue);
				return;
			case Model_registryPackage.MODEL_REGISTRY__FULL_DATA_LINEAGE_MODEL_LIST:
				setFullSpreadsheetLineageModelList((FullSpreadsheetLineageModelList)newValue);
				return;
			case Model_registryPackage.MODEL_REGISTRY__INPUT_LAYER_ONLY_DLM_LIST:
				setInputLayerOnlyDLMList((InputLayerOnlyDataLineageList)newValue);
				return;
			case Model_registryPackage.MODEL_REGISTRY__TRIPLE_LIST:
				setTripleList((DataLineageAndInputDataAndAttributeLineageTripleList)newValue);
				return;
			case Model_registryPackage.MODEL_REGISTRY__RELEASE_LIST:
				setReleaseList((ReleaseList)newValue);
				return;
			case Model_registryPackage.MODEL_REGISTRY__RELEASE_AND_ALM_PAIR_LIST:
				setReleaseAndALMPairList((ReleaseAndAttributeLineageModelPairList)newValue);
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
			case Model_registryPackage.MODEL_REGISTRY__BIRD_ARTEFACT_LIST:
				setBirdArtefactList((BirdArtefactsList)null);
				return;
			case Model_registryPackage.MODEL_REGISTRY__ATTRIBUTE_LINEAGE_MODEL_LIST:
				setAttributeLineageModelList((AttributeLineageModelList)null);
				return;
			case Model_registryPackage.MODEL_REGISTRY__BIRDAND_ALM_LIST:
				setBirdandALMList((BirdArtefactandAttributeLineageModelPairList)null);
				return;
			case Model_registryPackage.MODEL_REGISTRY__FULL_DATA_LINEAGE_MODEL_LIST:
				setFullSpreadsheetLineageModelList((FullSpreadsheetLineageModelList)null);
				return;
			case Model_registryPackage.MODEL_REGISTRY__INPUT_LAYER_ONLY_DLM_LIST:
				setInputLayerOnlyDLMList((InputLayerOnlyDataLineageList)null);
				return;
			case Model_registryPackage.MODEL_REGISTRY__TRIPLE_LIST:
				setTripleList((DataLineageAndInputDataAndAttributeLineageTripleList)null);
				return;
			case Model_registryPackage.MODEL_REGISTRY__RELEASE_LIST:
				setReleaseList((ReleaseList)null);
				return;
			case Model_registryPackage.MODEL_REGISTRY__RELEASE_AND_ALM_PAIR_LIST:
				setReleaseAndALMPairList((ReleaseAndAttributeLineageModelPairList)null);
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
			case Model_registryPackage.MODEL_REGISTRY__BIRD_ARTEFACT_LIST:
				return birdArtefactList != null;
			case Model_registryPackage.MODEL_REGISTRY__ATTRIBUTE_LINEAGE_MODEL_LIST:
				return attributeLineageModelList != null;
			case Model_registryPackage.MODEL_REGISTRY__BIRDAND_ALM_LIST:
				return birdandALMList != null;
			case Model_registryPackage.MODEL_REGISTRY__FULL_DATA_LINEAGE_MODEL_LIST:
				return fullSpreadsheetLineageModelList != null;
			case Model_registryPackage.MODEL_REGISTRY__INPUT_LAYER_ONLY_DLM_LIST:
				return inputLayerOnlyDLMList != null;
			case Model_registryPackage.MODEL_REGISTRY__TRIPLE_LIST:
				return tripleList != null;
			case Model_registryPackage.MODEL_REGISTRY__RELEASE_LIST:
				return releaseList != null;
			case Model_registryPackage.MODEL_REGISTRY__RELEASE_AND_ALM_PAIR_LIST:
				return releaseAndALMPairList != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelRegistryImpl
