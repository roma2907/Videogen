/**
 */
package org.xtext.example.mydsl.videoGen.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.videoGen.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideoGenFactoryImpl extends EFactoryImpl implements VideoGenFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VideoGenFactory init()
  {
    try
    {
      VideoGenFactory theVideoGenFactory = (VideoGenFactory)EPackage.Registry.INSTANCE.getEFactory(VideoGenPackage.eNS_URI);
      if (theVideoGenFactory != null)
      {
        return theVideoGenFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new VideoGenFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideoGenFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case VideoGenPackage.VIDEO_GEN: return createVideoGen();
      case VideoGenPackage.VIDEO: return createVideo();
      case VideoGenPackage.MANDATORY_RULE: return createMandatoryRule();
      case VideoGenPackage.OPTIONNAL_RULE: return createOptionnalRule();
      case VideoGenPackage.ALTERNATIVE_RULE: return createAlternativeRule();
      case VideoGenPackage.VIDEO_SEQ: return createVideoSeq();
      case VideoGenPackage.VIDEO_SEQ_MANDATORY: return createVideoSeqMandatory();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideoGen createVideoGen()
  {
    VideoGenImpl videoGen = new VideoGenImpl();
    return videoGen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Video createVideo()
  {
    VideoImpl video = new VideoImpl();
    return video;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MandatoryRule createMandatoryRule()
  {
    MandatoryRuleImpl mandatoryRule = new MandatoryRuleImpl();
    return mandatoryRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionnalRule createOptionnalRule()
  {
    OptionnalRuleImpl optionnalRule = new OptionnalRuleImpl();
    return optionnalRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlternativeRule createAlternativeRule()
  {
    AlternativeRuleImpl alternativeRule = new AlternativeRuleImpl();
    return alternativeRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideoSeq createVideoSeq()
  {
    VideoSeqImpl videoSeq = new VideoSeqImpl();
    return videoSeq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideoSeqMandatory createVideoSeqMandatory()
  {
    VideoSeqMandatoryImpl videoSeqMandatory = new VideoSeqMandatoryImpl();
    return videoSeqMandatory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideoGenPackage getVideoGenPackage()
  {
    return (VideoGenPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static VideoGenPackage getPackage()
  {
    return VideoGenPackage.eINSTANCE;
  }

} //VideoGenFactoryImpl
