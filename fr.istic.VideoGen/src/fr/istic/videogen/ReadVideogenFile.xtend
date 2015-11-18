package fr.istic.videogen

import fr.istic.videogen.playlist.PlayList
import org.xtext.example.mydsl.videoGen.OptionnalRule
import org.xtext.example.mydsl.videoGen.VideoGen
import org.xtext.example.mydsl.videoGen.MandatoryRule
import java.util.Random
import org.xtext.example.mydsl.videoGen.AlternativeRule
import org.xtext.example.mydsl.videoGen.VideoSeq
import java.util.Map.Entry

class ReadVideogenFile {
	
	var random = new Random;
	var VideoGen videogen;
	
	new(VideoGen pVideogen) {
		this.videogen = pVideogen;	
	}
	
	def apply(){
		val playList = new PlayList
		videogen.videos.forEach[video |
			if(video instanceof MandatoryRule){
				playList.add(video.seq.url);
			}else if(video instanceof OptionnalRule){
				if(canAddOptionnalVideo(video)){
					playList.add(video.seq.url);
				}
			}else if(video instanceof AlternativeRule){
				playList.add(addAlternativeVideo(video));
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
	
	private def String addAlternativeVideo(AlternativeRule video){
		val mapProbability = newHashMap();
		var probaRestante = 100;
		val listAlternativeWithNoProba = newArrayList(); 
		for(VideoSeq a : video.alternatves){
			if(a.proprobabilitePercent!=0){
				probaRestante -= a .proprobabilitePercent;
			}else{
				listAlternativeWithNoProba.add(a);
			}
			mapProbability.put(a,a.proprobabilitePercent);
		}
		//on partage le reste des probabilités entre les alternatives qui n'avait pas de probabilité au début
		val sizeNoProba = listAlternativeWithNoProba.size() 
		if(sizeNoProba != 0){
			val probaForAl = probaRestante / sizeNoProba
			listAlternativeWithNoProba.forEach[a|
				mapProbability.put(a,probaForAl);
			]
		}
		val aleatoire=random.nextInt(100)
		var parcours=0;
		for(Entry<VideoSeq,Integer> entry : mapProbability.entrySet){
			parcours += entry.value;
			if(parcours>aleatoire){
				return entry.key.url
			}
		}
		""
	}
}