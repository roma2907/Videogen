/**
 */
package org.xtext.example.mydsl.videoGen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.videoGen.VideoGenPackage
 * @generated
 */
public interface VideoGenFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VideoGenFactory eINSTANCE = org.xtext.example.mydsl.videoGen.impl.VideoGenFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Video Gen</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Video Gen</em>'.
   * @generated
   */
  VideoGen createVideoGen();

  /**
   * Returns a new object of class '<em>Video</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Video</em>'.
   * @generated
   */
  Video createVideo();

  /**
   * Returns a new object of class '<em>Mandatory Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mandatory Rule</em>'.
   * @generated
   */
  MandatoryRule createMandatoryRule();

  /**
   * Returns a new object of class '<em>Optionnal Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Optionnal Rule</em>'.
   * @generated
   */
  OptionnalRule createOptionnalRule();

  /**
   * Returns a new object of class '<em>Alternative Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alternative Rule</em>'.
   * @generated
   */
  AlternativeRule createAlternativeRule();

  /**
   * Returns a new object of class '<em>Video Seq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Video Seq</em>'.
   * @generated
   */
  VideoSeq createVideoSeq();

  /**
   * Returns a new object of class '<em>Video Seq Mandatory</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Video Seq Mandatory</em>'.
   * @generated
   */
  VideoSeqMandatory createVideoSeqMandatory();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  VideoGenPackage getVideoGenPackage();

} //VideoGenFactory
