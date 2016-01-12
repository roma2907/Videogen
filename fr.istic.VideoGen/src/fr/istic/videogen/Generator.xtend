package fr.istic.videogen

import fr.istic.videogen.playlistFormat.GeneratorFile
import fr.istic.videogen.playlistFormat.PlayListFFMPEG
import fr.istic.videogen.playlistFormat.PlayListM3U
import fr.istic.videogen.playlistFormat.PlayListM3UEXT
import fr.istic.videogen.playlistFormat.TypeGenerator
import java.net.URL
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.xtext.example.mydsl.VideoGenStandaloneSetupGenerated
import org.xtext.example.mydsl.videoGen.AlternativeRule
import org.xtext.example.mydsl.videoGen.MandatoryRule
import org.xtext.example.mydsl.videoGen.OptionnalRule
import org.xtext.example.mydsl.videoGen.VideoGen
import playlist.PlayList

class Generator {
	
	 def static String createVideo(URL url,TypeGenerator type,String fileOut) {
	 	
		var videogen = loadVideoGen(URI.createURI(url.file));
		var readFile = new ReadVideogenFile(videogen);
		val generator = createGenerator(type,readFile.apply(),fileOut);
		generator.generateFile
	}
	
	/**
	 * Url du fichier videogen
	 */
	def static List<VideoWithImage> createVignette(URL url){
		var videogen = loadVideoGen(URI.createURI(url.file));
		val list = newArrayList
		videogen.videos.forEach[video |
			if(video instanceof MandatoryRule){
				list.add(new SingleVideoWithImage(createImage(video.seq.url),MandatoryRule))
			}else if(video instanceof OptionnalRule){
				list.add(new SingleVideoWithImage(createImage(video.seq.url),OptionnalRule))
			}else if(video instanceof AlternativeRule){
				list.add(createImageAlternative(video))
			}
		]
		list
	}
	
	private static def createImageAlternative(AlternativeRule alternative){
		val AlternativeVideoWithImage alternativeVideoWithImage= new AlternativeVideoWithImage
		alternative.alternatves.forEach[alter |
			alternativeVideoWithImage.videos.add(new SingleVideoWithImage(createImage(alter.url),null))
		]
		alternativeVideoWithImage.type = AlternativeRule
		alternativeVideoWithImage
	} 
	
	private static def createImage(String url){
		val newImage = url.substring(0,url.lastIndexOf('.'))+".jpg"
		val rt = Runtime::runtime
		val commande = "ffmpeg -y -i "+url+" -r 1 -t 00:00:01 -ss 00:00:02 -f image2 "+newImage
	
		val cmd = #[
			"/bin/bash",
			"-c",
			commande
		]
		val p=rt.exec(cmd)
		newImage
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