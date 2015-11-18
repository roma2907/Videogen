/**
 */
package org.xtext.example.mydsl.videoGen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.videoGen.VideoGenFactory
 * @model kind="package"
 * @generated
 */
public interface VideoGenPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "videoGen";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/VideoGen";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "videoGen";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VideoGenPackage eINSTANCE = org.xtext.example.mydsl.videoGen.impl.VideoGenPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.videoGen.impl.VideoGenImpl <em>Video Gen</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.videoGen.impl.VideoGenImpl
   * @see org.xtext.example.mydsl.videoGen.impl.VideoGenPackageImpl#getVideoGen()
   * @generated
   */
  int VIDEO_GEN = 0;

  /**
   * The feature id for the '<em><b>Videos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_GEN__VIDEOS = 0;

  /**
   * The number of structural features of the '<em>Video Gen</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_GEN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.videoGen.impl.VideoImpl <em>Video</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.videoGen.impl.VideoImpl
   * @see org.xtext.example.mydsl.videoGen.impl.VideoGenPackageImpl#getVideo()
   * @generated
   */
  int VIDEO = 1;

  /**
   * The number of structural features of the '<em>Video</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.videoGen.impl.MandatoryRuleImpl <em>Mandatory Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.videoGen.impl.MandatoryRuleImpl
   * @see org.xtext.example.mydsl.videoGen.impl.VideoGenPackageImpl#getMandatoryRule()
   * @generated
   */
  int MANDATORY_RULE = 2;

  /**
   * The feature id for the '<em><b>Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_RULE__SEQ = VIDEO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mandatory Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_RULE_FEATURE_COUNT = VIDEO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.videoGen.impl.OptionnalRuleImpl <em>Optionnal Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.videoGen.impl.OptionnalRuleImpl
   * @see org.xtext.example.mydsl.videoGen.impl.VideoGenPackageImpl#getOptionnalRule()
   * @generated
   */
  int OPTIONNAL_RULE = 3;

  /**
   * The feature id for the '<em><b>Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONNAL_RULE__SEQ = VIDEO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Optionnal Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONNAL_RULE_FEATURE_COUNT = VIDEO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.videoGen.impl.AlternativeRuleImpl <em>Alternative Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.videoGen.impl.AlternativeRuleImpl
   * @see org.xtext.example.mydsl.videoGen.impl.VideoGenPackageImpl#getAlternativeRule()
   * @generated
   */
  int ALTERNATIVE_RULE = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_RULE__ID = VIDEO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Alternatves</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_RULE__ALTERNATVES = VIDEO_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Alternative Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_RULE_FEATURE_COUNT = VIDEO_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.videoGen.impl.VideoSeqImpl <em>Video Seq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.videoGen.impl.VideoSeqImpl
   * @see org.xtext.example.mydsl.videoGen.impl.VideoGenPackageImpl#getVideoSeq()
   * @generated
   */
  int VIDEO_SEQ = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ__ID = 0;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ__URL = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Proprobabilite Percent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ__PROPROBABILITE_PERCENT = 3;

  /**
   * The feature id for the '<em><b>Duree Seconde</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ__DUREE_SECONDE = 4;

  /**
   * The number of structural features of the '<em>Video Seq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.videoGen.impl.VideoSeqMandatoryImpl <em>Video Seq Mandatory</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.videoGen.impl.VideoSeqMandatoryImpl
   * @see org.xtext.example.mydsl.videoGen.impl.VideoGenPackageImpl#getVideoSeqMandatory()
   * @generated
   */
  int VIDEO_SEQ_MANDATORY = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ_MANDATORY__ID = 0;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ_MANDATORY__URL = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ_MANDATORY__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Duree Seconde</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ_MANDATORY__DUREE_SECONDE = 3;

  /**
   * The number of structural features of the '<em>Video Seq Mandatory</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ_MANDATORY_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.videoGen.VideoGen <em>Video Gen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Video Gen</em>'.
   * @see org.xtext.example.mydsl.videoGen.VideoGen
   * @generated
   */
  EClass getVideoGen();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.videoGen.VideoGen#getVideos <em>Videos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Videos</em>'.
   * @see org.xtext.example.mydsl.videoGen.VideoGen#getVideos()
   * @see #getVideoGen()
   * @generated
   */
  EReference getVideoGen_Videos();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.videoGen.Video <em>Video</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Video</em>'.
   * @see org.xtext.example.mydsl.videoGen.Video
   * @generated
   */
  EClass getVideo();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.videoGen.MandatoryRule <em>Mandatory Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mandatory Rule</em>'.
   * @see org.xtext.example.mydsl.videoGen.MandatoryRule
   * @generated
   */
  EClass getMandatoryRule();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.videoGen.MandatoryRule#getSeq <em>Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Seq</em>'.
   * @see org.xtext.example.mydsl.videoGen.MandatoryRule#getSeq()
   * @see #getMandatoryRule()
   * @generated
   */
  EReference getMandatoryRule_Seq();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.videoGen.OptionnalRule <em>Optionnal Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Optionnal Rule</em>'.
   * @see org.xtext.example.mydsl.videoGen.OptionnalRule
   * @generated
   */
  EClass getOptionnalRule();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.videoGen.OptionnalRule#getSeq <em>Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Seq</em>'.
   * @see org.xtext.example.mydsl.videoGen.OptionnalRule#getSeq()
   * @see #getOptionnalRule()
   * @generated
   */
  EReference getOptionnalRule_Seq();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.videoGen.AlternativeRule <em>Alternative Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alternative Rule</em>'.
   * @see org.xtext.example.mydsl.videoGen.AlternativeRule
   * @generated
   */
  EClass getAlternativeRule();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.videoGen.AlternativeRule#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.example.mydsl.videoGen.AlternativeRule#getId()
   * @see #getAlternativeRule()
   * @generated
   */
  EAttribute getAlternativeRule_Id();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.videoGen.AlternativeRule#getAlternatves <em>Alternatves</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Alternatves</em>'.
   * @see org.xtext.example.mydsl.videoGen.AlternativeRule#getAlternatves()
   * @see #getAlternativeRule()
   * @generated
   */
  EReference getAlternativeRule_Alternatves();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.videoGen.VideoSeq <em>Video Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Video Seq</em>'.
   * @see org.xtext.example.mydsl.videoGen.VideoSeq
   * @generated
   */
  EClass getVideoSeq();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.videoGen.VideoSeq#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.example.mydsl.videoGen.VideoSeq#getId()
   * @see #getVideoSeq()
   * @generated
   */
  EAttribute getVideoSeq_Id();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.videoGen.VideoSeq#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see org.xtext.example.mydsl.videoGen.VideoSeq#getUrl()
   * @see #getVideoSeq()
   * @generated
   */
  EAttribute getVideoSeq_Url();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.videoGen.VideoSeq#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.example.mydsl.videoGen.VideoSeq#getDescription()
   * @see #getVideoSeq()
   * @generated
   */
  EAttribute getVideoSeq_Description();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.videoGen.VideoSeq#getProprobabilitePercent <em>Proprobabilite Percent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Proprobabilite Percent</em>'.
   * @see org.xtext.example.mydsl.videoGen.VideoSeq#getProprobabilitePercent()
   * @see #getVideoSeq()
   * @generated
   */
  EAttribute getVideoSeq_ProprobabilitePercent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.videoGen.VideoSeq#getDureeSeconde <em>Duree Seconde</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duree Seconde</em>'.
   * @see org.xtext.example.mydsl.videoGen.VideoSeq#getDureeSeconde()
   * @see #getVideoSeq()
   * @generated
   */
  EAttribute getVideoSeq_DureeSeconde();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.videoGen.VideoSeqMandatory <em>Video Seq Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Video Seq Mandatory</em>'.
   * @see org.xtext.example.mydsl.videoGen.VideoSeqMandatory
   * @generated
   */
  EClass getVideoSeqMandatory();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.videoGen.VideoSeqMandatory#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.example.mydsl.videoGen.VideoSeqMandatory#getId()
   * @see #getVideoSeqMandatory()
   * @generated
   */
  EAttribute getVideoSeqMandatory_Id();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.videoGen.VideoSeqMandatory#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see org.xtext.example.mydsl.videoGen.VideoSeqMandatory#getUrl()
   * @see #getVideoSeqMandatory()
   * @generated
   */
  EAttribute getVideoSeqMandatory_Url();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.videoGen.VideoSeqMandatory#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.example.mydsl.videoGen.VideoSeqMandatory#getDescription()
   * @see #getVideoSeqMandatory()
   * @generated
   */
  EAttribute getVideoSeqMandatory_Description();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.videoGen.VideoSeqMandatory#getDureeSeconde <em>Duree Seconde</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duree Seconde</em>'.
   * @see org.xtext.example.mydsl.videoGen.VideoSeqMandatory#getDureeSeconde()
   * @see #getVideoSeqMandatory()
   * @generated
   */
  EAttribute getVideoSeqMandatory_DureeSeconde();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  VideoGenFactory getVideoGenFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.videoGen.impl.VideoGenImpl <em>Video Gen</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.videoGen.impl.VideoGenImpl
     * @see org.xtext.example.mydsl.videoGen.impl.VideoGenPackageImpl#getVideoGen()
     * @generated
     */
    EClass VIDEO_GEN = eINSTANCE.getVideoGen();

    /**
     * The meta object literal for the '<em><b>Videos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIDEO_GEN__VIDEOS = eINSTANCE.getVideoGen_Videos();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.videoGen.impl.VideoImpl <em>Video</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.videoGen.impl.VideoImpl
     * @see org.xtext.example.mydsl.videoGen.impl.VideoGenPackageImpl#getVideo()
     * @generated
     */
    EClass VIDEO = eINSTANCE.getVideo();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.videoGen.impl.MandatoryRuleImpl <em>Mandatory Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.videoGen.impl.MandatoryRuleImpl
     * @see org.xtext.example.mydsl.videoGen.impl.VideoGenPackageImpl#getMandatoryRule()
     * @generated
     */
    EClass MANDATORY_RULE = eINSTANCE.getMandatoryRule();

    /**
     * The meta object literal for the '<em><b>Seq</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MANDATORY_RULE__SEQ = eINSTANCE.getMandatoryRule_Seq();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.videoGen.impl.OptionnalRuleImpl <em>Optionnal Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.videoGen.impl.OptionnalRuleImpl
     * @see org.xtext.example.mydsl.videoGen.impl.VideoGenPackageImpl#getOptionnalRule()
     * @generated
     */
    EClass OPTIONNAL_RULE = eINSTANCE.getOptionnalRule();

    /**
     * The meta object literal for the '<em><b>Seq</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTIONNAL_RULE__SEQ = eINSTANCE.getOptionnalRule_Seq();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.videoGen.impl.AlternativeRuleImpl <em>Alternative Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.videoGen.impl.AlternativeRuleImpl
     * @see org.xtext.example.mydsl.videoGen.impl.VideoGenPackageImpl#getAlternativeRule()
     * @generated
     */
    EClass ALTERNATIVE_RULE = eINSTANCE.getAlternativeRule();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALTERNATIVE_RULE__ID = eINSTANCE.getAlternativeRule_Id();

    /**
     * The meta object literal for the '<em><b>Alternatves</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTERNATIVE_RULE__ALTERNATVES = eINSTANCE.getAlternativeRule_Alternatves();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.videoGen.impl.VideoSeqImpl <em>Video Seq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.videoGen.impl.VideoSeqImpl
     * @see org.xtext.example.mydsl.videoGen.impl.VideoGenPackageImpl#getVideoSeq()
     * @generated
     */
    EClass VIDEO_SEQ = eINSTANCE.getVideoSeq();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_SEQ__ID = eINSTANCE.getVideoSeq_Id();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_SEQ__URL = eINSTANCE.getVideoSeq_Url();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_SEQ__DESCRIPTION = eINSTANCE.getVideoSeq_Description();

    /**
     * The meta object literal for the '<em><b>Proprobabilite Percent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_SEQ__PROPROBABILITE_PERCENT = eINSTANCE.getVideoSeq_ProprobabilitePercent();

    /**
     * The meta object literal for the '<em><b>Duree Seconde</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_SEQ__DUREE_SECONDE = eINSTANCE.getVideoSeq_DureeSeconde();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.videoGen.impl.VideoSeqMandatoryImpl <em>Video Seq Mandatory</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.videoGen.impl.VideoSeqMandatoryImpl
     * @see org.xtext.example.mydsl.videoGen.impl.VideoGenPackageImpl#getVideoSeqMandatory()
     * @generated
     */
    EClass VIDEO_SEQ_MANDATORY = eINSTANCE.getVideoSeqMandatory();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_SEQ_MANDATORY__ID = eINSTANCE.getVideoSeqMandatory_Id();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_SEQ_MANDATORY__URL = eINSTANCE.getVideoSeqMandatory_Url();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_SEQ_MANDATORY__DESCRIPTION = eINSTANCE.getVideoSeqMandatory_Description();

    /**
     * The meta object literal for the '<em><b>Duree Seconde</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_SEQ_MANDATORY__DUREE_SECONDE = eINSTANCE.getVideoSeqMandatory_DureeSeconde();

  }

} //VideoGenPackage
