/**
 */
package cubes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base View Cube</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cubes.BaseViewCube#getUltimateBaseCube <em>Ultimate Base Cube</em>}</li>
 * </ul>
 *
 * @see cubes.CubesPackage#getBaseViewCube()
 * @model
 * @generated
 */
public interface BaseViewCube extends DerivedCube
{
	/**
	 * Returns the value of the '<em><b>Ultimate Base Cube</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ultimate Base Cube</em>' reference.
	 * @see #setUltimateBaseCube(FreeBirdToolsCube)
	 * @see cubes.CubesPackage#getBaseViewCube_UltimateBaseCube()
	 * @model
	 * @generated
	 */
	FreeBirdToolsCube getUltimateBaseCube();

	/**
	 * Sets the value of the '{@link cubes.BaseViewCube#getUltimateBaseCube <em>Ultimate Base Cube</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ultimate Base Cube</em>' reference.
	 * @see #getUltimateBaseCube()
	 * @generated
	 */
	void setUltimateBaseCube(FreeBirdToolsCube value);

} // BaseViewCube