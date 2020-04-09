/**
 */
package model_registry;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Lineage And Input Data And Attribute Lineage Triple List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model_registry.DataLineageAndInputDataAndAttributeLineageTripleList#getList <em>List</em>}</li>
 * </ul>
 *
 * @see model_registry.Model_registryPackage#getDataLineageAndInputDataAndAttributeLineageTripleList()
 * @model
 * @generated
 */
public interface DataLineageAndInputDataAndAttributeLineageTripleList extends EObject {
	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference list.
	 * The list contents are of type {@link model_registry.DataLineageAndInputDataAndAttributeLineageTriple}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference list.
	 * @see model_registry.Model_registryPackage#getDataLineageAndInputDataAndAttributeLineageTripleList_List()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataLineageAndInputDataAndAttributeLineageTriple> getList();

} // DataLineageAndInputDataAndAttributeLineageTripleList
