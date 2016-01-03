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
import fr.istic.videogen.playlistFormat.TypeGenerator

class Generator {
	
	 def static String createVideo(String file,TypeGenerator type,String fileOut) {
	 	println(file + "\n"+type.name)
		var videogen = loadVideoGen(URI.createURI(file));
		var readFile = new ReadVideogenFile(videogen);
		val generator = createGenerator(type,readFile.apply(),fileOut);
		generator.generateFile
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