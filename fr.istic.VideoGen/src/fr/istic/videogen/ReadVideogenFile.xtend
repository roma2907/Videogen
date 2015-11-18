package fr.istic.videogen

import fr.istic.videogen.playlist.PlayList
import org.xtext.example.mydsl.videoGen.OptionnalRule
import org.xtext.example.mydsl.videoGen.VideoGen
import org.xtext.example.mydsl.videoGen.MandatoryRule
import java.util.Random
import org.xtext.example.mydsl.videoGen.AlternativeRule
import fr.istic.videogen.playlist.PlayListFFMPEG
class ReadVideogenFile {
	
	var random = new Random;
	var VideoGen videogen;
	
	new(VideoGen pVideogen) {
		this.videogen = pVideogen;	
	}
	
	def apply(){
		val playList = new PlayListFFMPEG
		videogen.videos.forEach[video |
			if(video instanceof MandatoryRule){
				playList.add(video.seq.url);
			}else if(video instanceof OptionnalRule){
				if(canAddOptionnalVideo(video)){
					playList.add(video.seq.url);
				}
			}else if(video instanceof AlternativeRule){
				
			}
		]
		println(playList);
		playList
	}
	
	private def boolean canAddOptionnalVideo(OptionnalRule video){
		if(video.seq.proprobabilitePercent <= 0){
			//probabilité une chance sur deux
			random.nextBoolean
		}else{
			//probabilité spécifié
			random.nextInt(100)<video.seq.proprobabilitePercent
		}
	}
	
	private def String canAddAlternatieVideo(AlternativeRule video){
		var mapProbability = newHashMap();
		video.alternatves.forEach[a|
			
		]
		""
	}
}