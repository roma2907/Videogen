/**
 */
package org.xtext.example.mydsl.videoGen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.videoGen.OptionnalRule;
import org.xtext.example.mydsl.videoGen.VideoGenPackage;
import org.xtext.example.mydsl.videoGen.VideoSeq;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optionnal Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.videoGen.impl.OptionnalRuleImpl#getSeq <em>Seq</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionnalRuleImpl extends VideoImpl implements OptionnalRule
{
  /**
   * The cached value of the '{@link #getSeq() <em>Seq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeq()
   * @generated
   * @ordered
   */
  protected VideoSeq seq;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OptionnalRuleImpl()
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
    return VideoGenPackage.Literals.OPTIONNAL_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideoSeq getSeq()
  {
    return seq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSeq(VideoSeq newSeq, NotificationChain msgs)
  {
    VideoSeq oldSeq = seq;
    seq = newSeq;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideoGenPackage.OPTIONNAL_RULE__SEQ, oldSeq, newSeq);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeq(VideoSeq newSeq)
  {
    if (newSeq != seq)
    {
      NotificationChain msgs = null;
      if (seq != null)
        msgs = ((InternalEObject)seq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideoGenPackage.OPTIONNAL_RULE__SEQ, null, msgs);
      if (newSeq != null)
        msgs = ((InternalEObject)newSeq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideoGenPackage.OPTIONNAL_RULE__SEQ, null, msgs);
      msgs = basicSetSeq(newSeq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.OPTIONNAL_RULE__SEQ, newSeq, newSeq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case VideoGenPackage.OPTIONNAL_RULE__SEQ:
        return basicSetSeq(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case VideoGenPackage.OPTIONNAL_RULE__SEQ:
        return getSeq();
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
      case VideoGenPackage.OPTIONNAL_RULE__SEQ:
        setSeq((VideoSeq)newValue);
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
      case VideoGenPackage.OPTIONNAL_RULE__SEQ:
        setSeq((VideoSeq)null);
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
      case VideoGenPackage.OPTIONNAL_RULE__SEQ:
        return seq != null;
    }
    return super.eIsSet(featureID);
  }

} //OptionnalRuleImpl
