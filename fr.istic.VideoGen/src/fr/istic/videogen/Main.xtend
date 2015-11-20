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

class Main {
	
	 def static void main(String[] args) {	 	
	 	
		if(!(args.length == 1 || args.length == 2)){
			throw new IllegalArgumentException;
		}
		var videogen = loadVideoGen(URI.createURI(args.get(0)));
		var readFile = new ReadVideogenFile(videogen);
		val generator = createGenerator(args.get(1),readFile.apply());
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