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
	
	 def static String createVideo(URL url,TypeGenerator type,String fileOut) {
	 	
		var videogen = loadVideoGen(URI.createURI(url.file));
		var readFile = new ReadVideogenFile(videogen);
		val generator = createGenerator(type,readFile.apply(),fileOut);
		generator.generateFile
	}
	
	def static String createVideo(URL url,List<Integer> identifiantsVideo,TypeGenerator type,String fileOut) {
	 	
		var videogen = loadVideoGen(URI.createURI(url.file));
		var readFile = new ReadVideogenFile(videogen);
		val generator = createGenerator(type,readFile.apply(identifiantsVideo),fileOut);
		generator.generateFile
	}
	
	/**
	 * Url du fichier videogen
	 */
	def static List<VideoWithImage> createVignette(URL url){
		var videogen = loadVideoGen(URI.createURI(url.file));
		val generator = new GeneratorVignette;
		generator.generateVignette(videogen)
	}
	
	
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