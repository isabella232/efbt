/**
 */
package model_registry;

import attribute_lineage.AttributeLineageModel;

import bird_model.BIRDModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bird Artefacts And Attribute Lineage Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model_registry.BirdArtefactsAndAttributeLineagePair#getBird_model <em>Bird model</em>}</li>
 *   <li>{@link model_registry.BirdArtefactsAndAttributeLineagePair#getAttribute_lineage_model <em>Attribute lineage model</em>}</li>
 * </ul>
 *
 * @see model_registry.Model_registryPackage#getBirdArtefactsAndAttributeLineagePair()
 * @model
 * @generated
 */
public interface BirdArtefactsAndAttributeLineagePair extends EObject {
	/**
	 * Returns the value of the '<em><b>Bird model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bird model</em>' reference.
	 * @see #setBird_model(BIRDModel)
	 * @see model_registry.Model_registryPackage#getBirdArtefactsAndAttributeLineagePair_Bird_model()
	 * @model
	 * @generated
	 */
	BIRDModel getBird_model();

	/**
	 * Sets the value of the '{@link model_registry.BirdArtefactsAndAttributeLineagePair#getBird_model <em>Bird model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bird model</em>' reference.
	 * @see #getBird_model()
	 * @generated
	 */
	void setBird_model(BIRDModel value);

	/**
	 * Returns the value of the '<em><b>Attribute lineage model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute lineage model</em>' reference.
	 * @see #setAttribute_lineage_model(AttributeLineageModel)
	 * @see model_registry.Model_registryPackage#getBirdArtefactsAndAttributeLineagePair_Attribute_lineage_model()
	 * @model
	 * @generated
	 */
	AttributeLineageModel getAttribute_lineage_model();

	/**
	 * Sets the value of the '{@link model_registry.BirdArtefactsAndAttributeLineagePair#getAttribute_lineage_model <em>Attribute lineage model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute lineage model</em>' reference.
	 * @see #getAttribute_lineage_model()
	 * @generated
	 */
	void setAttribute_lineage_model(AttributeLineageModel value);

} // BirdArtefactsAndAttributeLineagePair
