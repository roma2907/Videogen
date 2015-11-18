/**
 */
package org.xtext.example.mydsl.videoGen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Seq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.videoGen.VideoSeq#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.videoGen.VideoSeq#getUrl <em>Url</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.videoGen.VideoSeq#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.videoGen.VideoSeq#getProprobabilitePercent <em>Proprobabilite Percent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.videoGen.VideoSeq#getDureeSeconde <em>Duree Seconde</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.videoGen.VideoGenPackage#getVideoSeq()
 * @model
 * @generated
 */
public interface VideoSeq extends EObject
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
   * @see org.xtext.example.mydsl.videoGen.VideoGenPackage#getVideoSeq_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.videoGen.VideoSeq#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see org.xtext.example.mydsl.videoGen.VideoGenPackage#getVideoSeq_Url()
   * @model
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.videoGen.VideoSeq#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.xtext.example.mydsl.videoGen.VideoGenPackage#getVideoSeq_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.videoGen.VideoSeq#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Proprobabilite Percent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proprobabilite Percent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proprobabilite Percent</em>' attribute.
   * @see #setProprobabilitePercent(int)
   * @see org.xtext.example.mydsl.videoGen.VideoGenPackage#getVideoSeq_ProprobabilitePercent()
   * @model
   * @generated
   */
  int getProprobabilitePercent();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.videoGen.VideoSeq#getProprobabilitePercent <em>Proprobabilite Percent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Proprobabilite Percent</em>' attribute.
   * @see #getProprobabilitePercent()
   * @generated
   */
  void setProprobabilitePercent(int value);

  /**
   * Returns the value of the '<em><b>Duree Seconde</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duree Seconde</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duree Seconde</em>' attribute.
   * @see #setDureeSeconde(int)
   * @see org.xtext.example.mydsl.videoGen.VideoGenPackage#getVideoSeq_DureeSeconde()
   * @model
   * @generated
   */
  int getDureeSeconde();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.videoGen.VideoSeq#getDureeSeconde <em>Duree Seconde</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duree Seconde</em>' attribute.
   * @see #getDureeSeconde()
   * @generated
   */
  void setDureeSeconde(int value);

} // VideoSeq
