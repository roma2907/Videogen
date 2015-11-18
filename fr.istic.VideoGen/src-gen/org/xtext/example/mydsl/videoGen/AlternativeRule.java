/**
 */
package org.xtext.example.mydsl.videoGen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.videoGen.AlternativeRule#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.videoGen.AlternativeRule#getAlternatves <em>Alternatves</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.videoGen.VideoGenPackage#getAlternativeRule()
 * @model
 * @generated
 */
public interface AlternativeRule extends Video
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.xtext.example.mydsl.videoGen.VideoGenPackage#getAlternativeRule_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.videoGen.AlternativeRule#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Alternatves</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.videoGen.VideoSeq}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alternatves</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alternatves</em>' containment reference list.
   * @see org.xtext.example.mydsl.videoGen.VideoGenPackage#getAlternativeRule_Alternatves()
   * @model containment="true"
   * @generated
   */
  EList<VideoSeq> getAlternatves();

} // AlternativeRule
