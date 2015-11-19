package fr.istic.videogen

import org.xtext.example.mydsl.VideoGenStandaloneSetupGenerated
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.xtext.example.mydsl.videoGen.VideoGen
import org.xtext.example.mydsl.videoGen.MandatoryRule

import org.xtext.example.mydsl.videoGen.OptionnalRule
import java.util.Random
import fr.istic.videogen.playlistFormat.PlayListFFMPEG

class Main {
	
	 def static void main(String[] args) {	 	
	 	
		if(args.length!=1){
			throw new IllegalArgumentException;
		}
		var videogen = loadVideoGen(URI.createURI(args.get(0)));
		var readFile = new ReadVideogenFile(videogen);
		val ffmpeg = new PlayListFFMPEG(readFile.apply());
		ffmpeg.generateFile
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