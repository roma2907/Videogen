package fr.istic.videogen

import fr.istic.videogen.playlistFormat.GeneratorFile
import fr.istic.videogen.playlistFormat.PlayListFFMPEG
import fr.istic.videogen.playlistFormat.PlayListM3U
import fr.istic.videogen.playlistFormat.PlayListM3UEXT
import fr.istic.videogen.playlistFormat.TypeGenerator
import fr.istic.videogen.vignette.VideoWithImage
import java.net.URL
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.xtext.example.mydsl.VideoGenStandaloneSetupGenerated
import org.xtext.example.mydsl.videoGen.VideoGen
import playlist.PlayList
import fr.istic.videogen.vignette.GeneratorVignette

class Generator {
	
	//Création d'une video aleatoire:
	// Création de la playlist
	// Création du fichier du type voulu (ffmpeg,m3u,m3u8)
	// Retourne le chemin où se trouve le fichier créé
	 def static String createVideo(URL url,TypeGenerator type,String fileOut) {
	 	
		var videogen = loadVideoGen(URI.createURI(url.file));
		var readFile = new ReadVideogenFile(videogen);
		val generator = createGenerator(type,readFile.apply(),fileOut);
		generator.generateFile
	}
	
	
	//Création d'une video à partir de séquence choisie par l'utilisateur
	// Création de la playlist
	// Création du fichier du type voulu (ffmpeg,m3u,m3u8)
	// Retourne le chemin où se trouve le fichier créé
	def static String createVideo(URL url,List<Integer> identifiantsVideo,TypeGenerator type,String fileOut) {
	 	
		var videogen = loadVideoGen(URI.createURI(url.file));
		var readFile = new ReadVideogenFile(videogen);
		val generator = createGenerator(type,readFile.apply(identifiantsVideo),fileOut);
		generator.generateFile
	}
	
	//Récupération de l'ensemble des vignettes de videogen, assignation d'un identifiant à chauqe video
	def static List<VideoWithImage> createVignette(URL url){
		var videogen = loadVideoGen(URI.createURI(url.file));
		val generator = new GeneratorVignette;
		generator.generateVignette(videogen)
	}
	
	/**
	 * Création du générateur de fichier en fonction du type spécifié 
	 */
	private static def GeneratorFile createGenerator(TypeGenerator type,PlayList playlist,String fileOut){
		switch(type){
			case TypeGenerator.M3U:return new PlayListM3U(playlist,fileOut)
			case TypeGenerator.M3UEXT:return new PlayListM3UEXT(playlist,fileOut)
			default:return new PlayListFFMPEG(playlist,fileOut)
		}
	}
	
	/**
	 * Chargement du fichier videogen
	 */
	def static loadVideoGen(URI uri) {
		new VideoGenStandaloneSetupGenerated().createInjectorAndDoEMFRegistration()
		var res = new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as VideoGen
 
	}
}