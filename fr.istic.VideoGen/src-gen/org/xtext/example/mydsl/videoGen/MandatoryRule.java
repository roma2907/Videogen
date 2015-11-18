/**
 */
package org.xtext.example.mydsl.videoGen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mandatory Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.videoGen.MandatoryRule#getSeq <em>Seq</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.videoGen.VideoGenPackage#getMandatoryRule()
 * @model
 * @generated
 */
public interface MandatoryRule extends Video
{
  /**
   * Returns the value of the '<em><b>Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Seq</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Seq</em>' containment reference.
   * @see #setSeq(VideoSeqMandatory)
   * @see org.xtext.example.mydsl.videoGen.VideoGenPackage#getMandatoryRule_Seq()
   * @model containment="true"
   * @generated
   */
  VideoSeqMandatory getSeq();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.videoGen.MandatoryRule#getSeq <em>Seq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Seq</em>' containment reference.
   * @see #getSeq()
   * @generated
   */
  void setSeq(VideoSeqMandatory value);

} // MandatoryRule
