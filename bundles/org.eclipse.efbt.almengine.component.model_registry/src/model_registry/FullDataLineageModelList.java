/**
 */
package model_registry;

import data_lineage.SpreadsheetLineageModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Full Data Lineage Model List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model_registry.FullSpreadsheetLineageModelList#getList <em>List</em>}</li>
 * </ul>
 *
 * @see model_registry.Model_registryPackage#getFullSpreadsheetLineageModelList()
 * @model
 * @generated
 */
public interface FullSpreadsheetLineageModelList extends EObject {
	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference list.
	 * The list contents are of type {@link data_lineage.SpreadsheetLineageModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference list.
	 * @see model_registry.Model_registryPackage#getFullSpreadsheetLineageModelList_List()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpreadsheetLineageModel> getList();

} // FullSpreadsheetLineageModelList
