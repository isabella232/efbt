/**
 */
package model_registry;

import bird_model.BIRDModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bird Artefacts List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model_registry.BirdArtefactsList#getBirdModels <em>Bird Models</em>}</li>
 * </ul>
 *
 * @see model_registry.Model_registryPackage#getBirdArtefactsList()
 * @model
 * @generated
 */
public interface BirdArtefactsList extends EObject {
	/**
	 * Returns the value of the '<em><b>Bird Models</b></em>' containment reference list.
	 * The list contents are of type {@link bird_model.BIRDModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bird Models</em>' containment reference list.
	 * @see model_registry.Model_registryPackage#getBirdArtefactsList_BirdModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<BIRDModel> getBirdModels();

} // BirdArtefactsList
