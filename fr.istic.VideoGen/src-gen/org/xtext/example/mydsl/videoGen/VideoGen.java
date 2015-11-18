/**
 */
package org.xtext.example.mydsl.videoGen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.videoGen.VideoGen#getVideos <em>Videos</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.videoGen.VideoGenPackage#getVideoGen()
 * @model
 * @generated
 */
public interface VideoGen extends EObject
{
  /**
   * Returns the value of the '<em><b>Videos</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.videoGen.Video}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Videos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Videos</em>' containment reference list.
   * @see org.xtext.example.mydsl.videoGen.VideoGenPackage#getVideoGen_Videos()
   * @model containment="true"
   * @generated
   */
  EList<Video> getVideos();

} // VideoGen
