/**
 */
package model_registry.impl;

import bird_model.BIRDModel;

import java.util.Collection;

import model_registry.BirdArtefactsList;
import model_registry.Model_registryPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bird Artefacts List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model_registry.impl.BirdArtefactsListImpl#getBirdModels <em>Bird Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BirdArtefactsListImpl extends MinimalEObjectImpl.Container implements BirdArtefactsList {
	/**
	 * The cached value of the '{@link #getBirdModels() <em>Bird Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirdModels()
	 * @generated
	 * @ordered
	 */
	protected EList<BIRDModel> birdModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BirdArtefactsListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model_registryPackage.Literals.BIRD_ARTEFACTS_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BIRDModel> getBirdModels() {
		if (birdModels == null) {
			birdModels = new EObjectContainmentEList<BIRDModel>(BIRDModel.class, this, Model_registryPackage.BIRD_ARTEFACTS_LIST__BIRD_MODELS);
		}
		return birdModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Model_registryPackage.BIRD_ARTEFACTS_LIST__BIRD_MODELS:
				return ((InternalEList<?>)getBirdModels()).basicRemove(otherEnd, msgs);
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
			case Model_registryPackage.BIRD_ARTEFACTS_LIST__BIRD_MODELS:
				return getBirdModels();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Model_registryPackage.BIRD_ARTEFACTS_LIST__BIRD_MODELS:
				getBirdModels().clear();
				getBirdModels().addAll((Collection<? extends BIRDModel>)newValue);
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
			case Model_registryPackage.BIRD_ARTEFACTS_LIST__BIRD_MODELS:
				getBirdModels().clear();
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
			case Model_registryPackage.BIRD_ARTEFACTS_LIST__BIRD_MODELS:
				return birdModels != null && !birdModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BirdArtefactsListImpl
