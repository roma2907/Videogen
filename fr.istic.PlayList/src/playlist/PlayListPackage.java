/**
 */
package playlist;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see playlist.PlayListFactory
 * @model kind="package"
 * @generated
 */
public interface PlayListPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "playlist";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/PlayList";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "playlist";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlayListPackage eINSTANCE = playlist.impl.PlayListPackageImpl.init();

	/**
	 * The meta object id for the '{@link playlist.impl.PlayListImpl <em>Play List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see playlist.impl.PlayListImpl
	 * @see playlist.impl.PlayListPackageImpl#getPlayList()
	 * @generated
	 */
	int PLAY_LIST = 0;

	/**
	 * The feature id for the '<em><b>Videos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_LIST__VIDEOS = 0;

	/**
	 * The number of structural features of the '<em>Play List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Play List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link playlist.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see playlist.impl.VideoImpl
	 * @see playlist.impl.PlayListPackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__URL = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__DURATION = 2;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link playlist.PlayList <em>Play List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Play List</em>'.
	 * @see playlist.PlayList
	 * @generated
	 */
	EClass getPlayList();

	/**
	 * Returns the meta object for the reference list '{@link playlist.PlayList#getVideos <em>Videos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Videos</em>'.
	 * @see playlist.PlayList#getVideos()
	 * @see #getPlayList()
	 * @generated
	 */
	EReference getPlayList_Videos();

	/**
	 * Returns the meta object for class '{@link playlist.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see playlist.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for the attribute '{@link playlist.Video#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see playlist.Video#getUrl()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Url();

	/**
	 * Returns the meta object for the attribute '{@link playlist.Video#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see playlist.Video#getDescription()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Description();

	/**
	 * Returns the meta object for the attribute '{@link playlist.Video#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see playlist.Video#getDuration()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Duration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlayListFactory getPlayListFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link playlist.impl.PlayListImpl <em>Play List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see playlist.impl.PlayListImpl
		 * @see playlist.impl.PlayListPackageImpl#getPlayList()
		 * @generated
		 */
		EClass PLAY_LIST = eINSTANCE.getPlayList();

		/**
		 * The meta object literal for the '<em><b>Videos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAY_LIST__VIDEOS = eINSTANCE.getPlayList_Videos();

		/**
		 * The meta object literal for the '{@link playlist.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see playlist.impl.VideoImpl
		 * @see playlist.impl.PlayListPackageImpl#getVideo()
		 * @generated
		 */
		EClass VIDEO = eINSTANCE.getVideo();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__URL = eINSTANCE.getVideo_Url();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__DESCRIPTION = eINSTANCE.getVideo_Description();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__DURATION = eINSTANCE.getVideo_Duration();

	}

} //PlayListPackage
