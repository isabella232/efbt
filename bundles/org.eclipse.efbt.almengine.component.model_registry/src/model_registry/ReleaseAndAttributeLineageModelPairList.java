/**
 */
package model_registry;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release And Attribute Lineage Model Pair List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model_registry.ReleaseAndAttributeLineageModelPairList#getList <em>List</em>}</li>
 * </ul>
 *
 * @see model_registry.Model_registryPackage#getReleaseAndAttributeLineageModelPairList()
 * @model
 * @generated
 */
public interface ReleaseAndAttributeLineageModelPairList extends EObject {
	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference list.
	 * The list contents are of type {@link model_registry.ReleaseAndAttributeLineageModelPair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference list.
	 * @see model_registry.Model_registryPackage#getReleaseAndAttributeLineageModelPairList_List()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReleaseAndAttributeLineageModelPair> getList();

} // ReleaseAndAttributeLineageModelPairList
