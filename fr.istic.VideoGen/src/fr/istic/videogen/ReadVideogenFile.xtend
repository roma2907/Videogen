package fr.istic.videogen

import org.xtext.example.mydsl.videoGen.OptionnalRule
import org.xtext.example.mydsl.videoGen.VideoGen
import org.xtext.example.mydsl.videoGen.MandatoryRule
import java.util.Random
import org.xtext.example.mydsl.videoGen.AlternativeRule
import org.xtext.example.mydsl.videoGen.VideoSeq
import java.util.Map.Entry
import org.xtext.example.mydsl.videoGen.VideoSeqMandatory
import playlist.Video
import playlist.PlayListFactory
import java.io.File
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.IOException
import java.util.List
import java.util.Collections

class ReadVideogenFile {
	
	var random = new Random;
	var VideoGen videogen;
	
	new(VideoGen pVideogen) {
		this.videogen = pVideogen;	
	}
	
	def apply(List<Integer> listIdentifiants){
		val factory = PlayListFactory.eINSTANCE;
		val playList = factory.createPlayList;
		Collections.sort(listIdentifiants)
		var i=0;
		var a=0;
		while(a<videogen.videos.size()){
			var video = videogen.videos.get(a)
			if(video instanceof MandatoryRule){
				playList.videos.add(createVideoSeqToPlayList(video.seq,factory))
				i++;
			}else if(video instanceof OptionnalRule){
				if(listIdentifiants.contains(i)){
					playList.videos.add(createVideoSeqToPlayList(video.seq,factory))
				}
				i++;
			}
			else if(video instanceof AlternativeRule){
				for(VideoSeq alter :video.alternatives){
					if(listIdentifiants.contains(i)){
						playList.videos.add(createVideoSeqToPlayList(alter,factory))
					}				
					i++;
				}
			}
			a++;
		}
		playList
	}
	
	def apply(){
		
		val factory = PlayListFactory.eINSTANCE;
		
		val playList = factory.createPlayList;
		
		videogen.videos.forEach[video |
			if(video instanceof MandatoryRule){
				playList.videos.add(createVideoSeqToPlayList(video.seq,factory))
			}else if(video instanceof OptionnalRule){
				if(canAddOptionnalVideo(video)){
					playList.videos.add(createVideoSeqToPlayList(video.seq,factory))
				}
			}else if(video instanceof AlternativeRule){
				playList.videos.add(createVideoSeqToPlayList(addAlternativeVideo(video),factory))
			}
		]
		playList.videos.forEach[
			f| println(f.url)
		]
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
	
	private def VideoSeq addAlternativeVideo(AlternativeRule video){

		val mapProbability = newHashMap();
		var probaRestante = 100;
		val listAlternativeWithNoProba = newArrayList(); 
		for(VideoSeq a : video.alternatives){
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
			var probaForAl = probaRestante / sizeNoProba
			if(probaRestante % probaForAl != 0){
				probaForAl++;
			}
			for(VideoSeq a :listAlternativeWithNoProba){
				mapProbability.put(a,probaForAl);
			}
		}
		val aleatoire=random.nextInt(100)
		var parcours=0;
		for(Entry<VideoSeq,Integer> entry : mapProbability.entrySet){
			parcours += entry.value;
			if(parcours>aleatoire){
				return entry.key
			}
		}
		null
	}
	
	private def Video createVideoSeqToPlayList(VideoSeq videoSeq,PlayListFactory factory){
			val video = factory.createVideo
			video.description = videoSeq.description
			video.url = videoSeq.url
			if(videoSeq.dureeSeconde!=0){
				video.duration = videoSeq.dureeSeconde
			}
			else{
				video.duration = getDurationByFfmpeg(video.url)
			}
			
			println("//////////////////")
			println(video.url)
			println("//////////////////")
			return video
	}
	
	private def int getDurationByFfmpeg(String file){
		
		val rt = Runtime::runtime
		val cmd = #[
			"/bin/sh", "-c", "ffprobe -i "+file+" -show_format | grep duration"
		]

		try {
			val p = rt.exec(cmd)
			val stdErr = new BufferedReader(
				new InputStreamReader(p.errorStream)
				)
				
				var c=stdErr.read;
				while(c!=-1){
					System.err.print(c as char)
					c=stdErr.read;
				}
			val stdInput = new BufferedReader(
				new InputStreamReader(p.inputStream))
				System.out.println(stdInput)
			val durationLine = stdInput.readLine
			val durationStr = durationLine.split("=").get(1)
			val durationDouble = Double.parseDouble(durationStr)
			val duration = durationDouble.intValue
			return duration;
		} catch (IOException e) {
			e.printStackTrace
			return 0
		}
	}
	
	private def Video createVideoSeqToPlayList(VideoSeqMandatory videoSeq,PlayListFactory factory){
			val video = factory.createVideo
			video.description = videoSeq.description
			video.url = videoSeq.url
			if(videoSeq.dureeSeconde!=0){
				video.duration = videoSeq.dureeSeconde
			}
			else{
				video.duration = getDurationByFfmpeg(video.url)
			}
			println("//////////////////")
			println(video.url)
			println("//////////////////")
			video
	}
}