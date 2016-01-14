package fr.istic.videogen.vignette

import org.xtext.example.mydsl.videoGen.AlternativeRule
import org.xtext.example.mydsl.videoGen.MandatoryRule
import org.xtext.example.mydsl.videoGen.OptionnalRule
import org.xtext.example.mydsl.videoGen.VideoGen

class GeneratorVignette {
	
	var int j=0;
	
	/**
	 * Création de l'image à partir de la vidéo
	 */
	private def createImage(String url,EnumTypeVideo type){
		val newImage = url.substring(0,url.lastIndexOf('.'))+".jpg"
		val rt = Runtime::runtime
		//création de l'image
		val commande = "ffmpeg -y -i "+url+" -r 1 -t 00:00:01 -ss 00:00:02 -f image2 "+newImage
	
		val cmd = #[
			"/bin/bash",
			"-c",
			commande
		]
		rt.exec(cmd)
		new SingleVideoWithImage(newImage.substring(newImage.lastIndexOf('/')+1,newImage.length()),type,j++)
	}
	
	/**
	 * Génération des vignettes des vidéos du fichier videogen
	 */
	public def generateVignette(VideoGen videogen){
		val list = newArrayList
		//parcours des vidéos du videogen
		videogen.videos.forEach[video|
			if(video instanceof MandatoryRule){
				list.add(createImage(video.seq.url,EnumTypeVideo.MANDATORY))
			}else if(video instanceof OptionnalRule){
				list.add(createImage(video.seq.url,EnumTypeVideo.OPTIONNAL))
			}else if(video instanceof AlternativeRule){
				list.add(createImageAlternative(video))
			}
		]
		list
	}
	
	/**
	 * Création des vignettes pour une vidéo alternative
	 */
	private def createImageAlternative(AlternativeRule alternative){
		val AlternativeVideoWithImage alternativeVideoWithImage= new AlternativeVideoWithImage
		alternative.alternatives.forEach[alter |
			alternativeVideoWithImage.videos.add(createImage(alter.url,null))
		]
		alternativeVideoWithImage.type = EnumTypeVideo.ALTERNATIVE
		alternativeVideoWithImage
	} 
}