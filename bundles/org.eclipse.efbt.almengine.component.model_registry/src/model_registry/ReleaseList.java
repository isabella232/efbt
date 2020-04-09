/**
 */
package model_registry;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import transformation.Release;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model_registry.ReleaseList#getReleases <em>Releases</em>}</li>
 * </ul>
 *
 * @see model_registry.Model_registryPackage#getReleaseList()
 * @model
 * @generated
 */
public interface ReleaseList extends EObject {
	/**
	 * Returns the value of the '<em><b>Releases</b></em>' containment reference list.
	 * The list contents are of type {@link transformation.Release}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Releases</em>' containment reference list.
	 * @see model_registry.Model_registryPackage#getReleaseList_Releases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Release> getReleases();

} // ReleaseList
