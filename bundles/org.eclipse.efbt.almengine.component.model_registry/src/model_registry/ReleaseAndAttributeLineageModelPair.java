/**
 */
package model_registry;

import attribute_lineage.AttributeLineageModel;

import org.eclipse.emf.ecore.EObject;
import transformation.VersionedComponentsSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release And Attribute Lineage Model Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model_registry.ReleaseAndAttributeLineageModelPair#getRelease <em>Release</em>}</li>
 *   <li>{@link model_registry.ReleaseAndAttributeLineageModelPair#getAttributeLineageModel <em>Attribute Lineage Model</em>}</li>
 * </ul>
 *
 * @see model_registry.Model_registryPackage#getReleaseAndAttributeLineageModelPair()
 * @model
 * @generated
 */
public interface ReleaseAndAttributeLineageModelPair extends EObject {
	/**
	 * Returns the value of the '<em><b>Release</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release</em>' reference.
	 * @see #setRelease(VersionedComponentsSet)
	 * @see model_registry.Model_registryPackage#getReleaseAndAttributeLineageModelPair_Release()
	 * @model
	 * @generated
	 */
	VersionedComponentsSet getRelease();

	/**
	 * Sets the value of the '{@link model_registry.ReleaseAndAttributeLineageModelPair#getRelease <em>Release</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' reference.
	 * @see #getRelease()
	 * @generated
	 */
	void setRelease(VersionedComponentsSet value);

	/**
	 * Returns the value of the '<em><b>Attribute Lineage Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Lineage Model</em>' reference.
	 * @see #setAttributeLineageModel(AttributeLineageModel)
	 * @see model_registry.Model_registryPackage#getReleaseAndAttributeLineageModelPair_AttributeLineageModel()
	 * @model
	 * @generated
	 */
	AttributeLineageModel getAttributeLineageModel();

	/**
	 * Sets the value of the '{@link model_registry.ReleaseAndAttributeLineageModelPair#getAttributeLineageModel <em>Attribute Lineage Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Lineage Model</em>' reference.
	 * @see #getAttributeLineageModel()
	 * @generated
	 */
	void setAttributeLineageModel(AttributeLineageModel value);

} // ReleaseAndAttributeLineageModelPair
