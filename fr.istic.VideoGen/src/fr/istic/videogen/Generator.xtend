package fr.istic.videogen

import org.xtext.example.mydsl.VideoGenStandaloneSetupGenerated
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.xtext.example.mydsl.videoGen.VideoGen
import org.xtext.example.mydsl.videoGen.MandatoryRule

import org.xtext.example.mydsl.videoGen.OptionnalRule
import java.util.Random
import fr.istic.videogen.playlistFormat.PlayListFFMPEG
import fr.istic.videogen.playlistFormat.PlayListM3U
import playlist.PlayList
import fr.istic.videogen.playlistFormat.GeneratorFile
import fr.istic.videogen.playlistFormat.PlayListM3UEXT

class Generator {
	
	 def static String createVideo(String file,String format) {
	 	println(file + "\n"+format)
		var videogen = loadVideoGen(URI.createURI(file));
		var readFile = new ReadVideogenFile(videogen);
		val generator = createGenerator(format,readFile.apply());
		generator.generateFile
	}
	
	private static def GeneratorFile createGenerator(String arg,PlayList playlist){
		switch(arg){
			case "m3u":return new PlayListM3U(playlist)
			case "m3uext":return new PlayListM3UEXT(playlist)
			default:return new PlayListFFMPEG(playlist)
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