/**
 */
package model_registry;

import attribute_lineage.AttributeLineageModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Lineage Model List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model_registry.AttributeLineageModelList#getAttributeLineageModels <em>Attribute Lineage Models</em>}</li>
 * </ul>
 *
 * @see model_registry.Model_registryPackage#getAttributeLineageModelList()
 * @model
 * @generated
 */
public interface AttributeLineageModelList extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute Lineage Models</b></em>' containment reference list.
	 * The list contents are of type {@link attribute_lineage.AttributeLineageModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Lineage Models</em>' containment reference list.
	 * @see model_registry.Model_registryPackage#getAttributeLineageModelList_AttributeLineageModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeLineageModel> getAttributeLineageModels();

} // AttributeLineageModelList
