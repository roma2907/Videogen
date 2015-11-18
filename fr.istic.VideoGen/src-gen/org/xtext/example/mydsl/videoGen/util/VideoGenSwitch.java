/**
 */
package org.xtext.example.mydsl.videoGen.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.videoGen.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.videoGen.VideoGenPackage
 * @generated
 */
public class VideoGenSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VideoGenPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideoGenSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = VideoGenPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case VideoGenPackage.VIDEO_GEN:
      {
        VideoGen videoGen = (VideoGen)theEObject;
        T result = caseVideoGen(videoGen);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VideoGenPackage.VIDEO:
      {
        Video video = (Video)theEObject;
        T result = caseVideo(video);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VideoGenPackage.MANDATORY_RULE:
      {
        MandatoryRule mandatoryRule = (MandatoryRule)theEObject;
        T result = caseMandatoryRule(mandatoryRule);
        if (result == null) result = caseVideo(mandatoryRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VideoGenPackage.OPTIONNAL_RULE:
      {
        OptionnalRule optionnalRule = (OptionnalRule)theEObject;
        T result = caseOptionnalRule(optionnalRule);
        if (result == null) result = caseVideo(optionnalRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VideoGenPackage.ALTERNATIVE_RULE:
      {
        AlternativeRule alternativeRule = (AlternativeRule)theEObject;
        T result = caseAlternativeRule(alternativeRule);
        if (result == null) result = caseVideo(alternativeRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VideoGenPackage.VIDEO_SEQ:
      {
        VideoSeq videoSeq = (VideoSeq)theEObject;
        T result = caseVideoSeq(videoSeq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VideoGenPackage.VIDEO_SEQ_MANDATORY:
      {
        VideoSeqMandatory videoSeqMandatory = (VideoSeqMandatory)theEObject;
        T result = caseVideoSeqMandatory(videoSeqMandatory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Video Gen</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Video Gen</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVideoGen(VideoGen object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Video</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Video</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVideo(Video object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mandatory Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mandatory Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMandatoryRule(MandatoryRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Optionnal Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Optionnal Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptionnalRule(OptionnalRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alternative Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alternative Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlternativeRule(AlternativeRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Video Seq</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Video Seq</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVideoSeq(VideoSeq object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Video Seq Mandatory</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Video Seq Mandatory</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVideoSeqMandatory(VideoSeqMandatory object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //VideoGenSwitch
