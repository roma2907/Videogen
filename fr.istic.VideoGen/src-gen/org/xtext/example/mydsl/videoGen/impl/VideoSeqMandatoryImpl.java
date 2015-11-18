/**
 */
package org.xtext.example.mydsl.videoGen.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.videoGen.VideoGenPackage;
import org.xtext.example.mydsl.videoGen.VideoSeqMandatory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video Seq Mandatory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.videoGen.impl.VideoSeqMandatoryImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.videoGen.impl.VideoSeqMandatoryImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.videoGen.impl.VideoSeqMandatoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.videoGen.impl.VideoSeqMandatoryImpl#getDureeSeconde <em>Duree Seconde</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VideoSeqMandatoryImpl extends MinimalEObjectImpl.Container implements VideoSeqMandatory
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected static final String URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected String url = URL_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getDureeSeconde() <em>Duree Seconde</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDureeSeconde()
   * @generated
   * @ordered
   */
  protected static final int DUREE_SECONDE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDureeSeconde() <em>Duree Seconde</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDureeSeconde()
   * @generated
   * @ordered
   */
  protected int dureeSeconde = DUREE_SECONDE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VideoSeqMandatoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return VideoGenPackage.Literals.VIDEO_SEQ_MANDATORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.VIDEO_SEQ_MANDATORY__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUrl()
  {
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(String newUrl)
  {
    String oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.VIDEO_SEQ_MANDATORY__URL, oldUrl, url));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.VIDEO_SEQ_MANDATORY__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDureeSeconde()
  {
    return dureeSeconde;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDureeSeconde(int newDureeSeconde)
  {
    int oldDureeSeconde = dureeSeconde;
    dureeSeconde = newDureeSeconde;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.VIDEO_SEQ_MANDATORY__DUREE_SECONDE, oldDureeSeconde, dureeSeconde));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case VideoGenPackage.VIDEO_SEQ_MANDATORY__ID:
        return getId();
      case VideoGenPackage.VIDEO_SEQ_MANDATORY__URL:
        return getUrl();
      case VideoGenPackage.VIDEO_SEQ_MANDATORY__DESCRIPTION:
        return getDescription();
      case VideoGenPackage.VIDEO_SEQ_MANDATORY__DUREE_SECONDE:
        return getDureeSeconde();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VideoGenPackage.VIDEO_SEQ_MANDATORY__ID:
        setId((String)newValue);
        return;
      case VideoGenPackage.VIDEO_SEQ_MANDATORY__URL:
        setUrl((String)newValue);
        return;
      case VideoGenPackage.VIDEO_SEQ_MANDATORY__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case VideoGenPackage.VIDEO_SEQ_MANDATORY__DUREE_SECONDE:
        setDureeSeconde((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case VideoGenPackage.VIDEO_SEQ_MANDATORY__ID:
        setId(ID_EDEFAULT);
        return;
      case VideoGenPackage.VIDEO_SEQ_MANDATORY__URL:
        setUrl(URL_EDEFAULT);
        return;
      case VideoGenPackage.VIDEO_SEQ_MANDATORY__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case VideoGenPackage.VIDEO_SEQ_MANDATORY__DUREE_SECONDE:
        setDureeSeconde(DUREE_SECONDE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case VideoGenPackage.VIDEO_SEQ_MANDATORY__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case VideoGenPackage.VIDEO_SEQ_MANDATORY__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case VideoGenPackage.VIDEO_SEQ_MANDATORY__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case VideoGenPackage.VIDEO_SEQ_MANDATORY__DUREE_SECONDE:
        return dureeSeconde != DUREE_SECONDE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (id: ");
    result.append(id);
    result.append(", url: ");
    result.append(url);
    result.append(", description: ");
    result.append(description);
    result.append(", dureeSeconde: ");
    result.append(dureeSeconde);
    result.append(')');
    return result.toString();
  }

} //VideoSeqMandatoryImpl
