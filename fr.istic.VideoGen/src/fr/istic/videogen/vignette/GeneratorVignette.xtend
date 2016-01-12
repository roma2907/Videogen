package fr.istic.videogen.vignette

import java.io.BufferedReader
import java.io.InputStreamReader
import org.xtext.example.mydsl.videoGen.AlternativeRule
import org.xtext.example.mydsl.videoGen.MandatoryRule
import org.xtext.example.mydsl.videoGen.OptionnalRule
import org.xtext.example.mydsl.videoGen.VideoGen

class GeneratorVignette {
	
	var int j=0;
	
	private def createImage(String url,EnumTypeVideo type){
		val newImage = url.substring(0,url.lastIndexOf('.'))+".jpg"
		val rt = Runtime::runtime
		val commande = "ffmpeg -y -i "+url+" -r 1 -t 00:00:01 -ss 00:00:02 -f image2 "+newImage
	
		val cmd = #[
			"/bin/bash",
			"-c",
			commande
		]
		var p = rt.exec(cmd)
		val stdErr = new BufferedReader(
				new InputStreamReader(p.errorStream)
				)
				
				var c=stdErr.read;
				while(c!=-1){
					System.err.print(c as char)
					c=stdErr.read;
				}
		new SingleVideoWithImage(newImage.substring(newImage.lastIndexOf('/')+1,newImage.length()),type,j++)
	}
	
	public def generateVignette(VideoGen videogen){
		val list = newArrayList
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
	
	private def createImageAlternative(AlternativeRule alternative){
		val AlternativeVideoWithImage alternativeVideoWithImage= new AlternativeVideoWithImage
		alternative.alternatives.forEach[alter |
			alternativeVideoWithImage.videos.add(createImage(alter.url,null))
		]
		alternativeVideoWithImage.type = EnumTypeVideo.ALTERNATIVE
		alternativeVideoWithImage
	} 
}