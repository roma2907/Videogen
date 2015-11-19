/**
 */
package playlist;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Play List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link playlist.PlayList#getVideos <em>Videos</em>}</li>
 * </ul>
 *
 * @see playlist.PlayListPackage#getPlayList()
 * @model
 * @generated
 */
public interface PlayList extends EObject {
	/**
	 * Returns the value of the '<em><b>Videos</b></em>' reference list.
	 * The list contents are of type {@link playlist.Video}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Videos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Videos</em>' reference list.
	 * @see playlist.PlayListPackage#getPlayList_Videos()
	 * @model
	 * @generated
	 */
	EList<Video> getVideos();

} // PlayList
