/**
 */
package angularIonic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iteration Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link angularIonic.IterationComponent#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see angularIonic.AngularIonicPackage#getIterationComponent()
 * @model
 * @generated
 */
public interface IterationComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link angularIonic.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see angularIonic.AngularIonicPackage#getIterationComponent_Filter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Filter> getFilter();

} // IterationComponent
