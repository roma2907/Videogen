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

//classe qui lit un fichier et qui créé une playlist
class ReadVideogenFile {
	
	var random = new Random;
	var VideoGen videogen;
	
	//fichier videogen à lire
	new(VideoGen pVideogen) {
		this.videogen = pVideogen;	
	}
	
	/**
	 * Création de la playlist, à partir des vignettes sélectionnés par l'utilisateur
	 */
	def apply(List<Integer> listIdentifiants){
		val factory = PlayListFactory.eINSTANCE;
		val playList = factory.createPlayList;
		Collections.sort(listIdentifiants)
		var i=0;
		var a=0;
		//parcours de toutes les videos
		while(a<videogen.videos.size()){
			var video = videogen.videos.get(a)
			if(video instanceof MandatoryRule){
				//ajout à la playlist
				playList.videos.add(createVideoSeqToPlayList(video.seq,factory))
				i++;
			}else if(video instanceof OptionnalRule){
				//ajout à la playlist si la video fait partie des videos sélectionnées
				if(listIdentifiants.contains(i)){
					playList.videos.add(createVideoSeqToPlayList(video.seq,factory))
				}
				i++;
			}
			else if(video instanceof AlternativeRule){
				//parcours des videos de l'alternative
				for(VideoSeq alter :video.alternatives){
					if(listIdentifiants.contains(i)){
						//ajout à la playlist si la video fait partie des videos sélectionnées
						playList.videos.add(createVideoSeqToPlayList(alter,factory))
					}				
					i++;
				}
			}
			a++;
		}
		playList
	}
	
	/**
	 * Création de la playlist, à partir du fichier videogen, en prenant en compte les probabilités et l'aléatoire
	 */
	def apply(){
		
		val factory = PlayListFactory.eINSTANCE;
		
		val playList = factory.createPlayList;
		//parcours de toutes les vidéos
		videogen.videos.forEach[video |
			if(video instanceof MandatoryRule){
				//ajout de la vidéo à la playlist
				playList.videos.add(createVideoSeqToPlayList(video.seq,factory))
			}else if(video instanceof OptionnalRule){
				if(canAddOptionnalVideo(video)){
					//ajout de la vidéo à la playlist
					playList.videos.add(createVideoSeqToPlayList(video.seq,factory))
				}
			}else if(video instanceof AlternativeRule){
				playList.videos.add(createVideoSeqToPlayList(addAlternativeVideo(video),factory))
			}
		]
		playList
	}
	
	/**
	 * Foction qui va regarder les probabilités de la vidéos optionnel,
	 *  et qui retourne true si le nombre tiré aléatoirement est inférieur au probabilité
	 *  le fait de retourner true indique que l'on peut ajouter la vidéo à la playlist
	 */
	private def boolean canAddOptionnalVideo(OptionnalRule video){
		if(video.seq.proprobabilitePercent <= 0){
			//probabilité une chance sur deux
			random.nextBoolean
		}else{
			//probabilité spécifié
			random.nextInt(100)<video.seq.proprobabilitePercent
		}
	}
	
	/**
	 * Méthode qui va regarder une video alternative, et qui va retourner une des VideoSeq en fonction des probabilités 
	 * spécifiés dans le fichier videogen et en fonction des nombres tirés aléatoirement
	 */
	private def VideoSeq addAlternativeVideo(AlternativeRule video){

		val mapProbability = newHashMap();
		var probaRestante = 100;
		val listAlternativeWithNoProba = newArrayList();
		//parcours des vidéos de l'alternative 
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
	
	/** Création de la vidéo pour l'ajouter à la playlist */
	private def Video createVideoSeqToPlayList(VideoSeq videoSeq,PlayListFactory factory){
			val video = factory.createVideo
			video.description = videoSeq.description
			video.url = videoSeq.url
			if(videoSeq.dureeSeconde!=0){
				video.duration = videoSeq.dureeSeconde
			}
			else{
				//si la vidéo n'a pas de durée de spécifié, lire le fichier pour voir le temps de la vidéo
				video.duration = getDurationByFfmpeg(video.url)
			}
			return video
	}
	
	/**
	 * Fonction qui va lire dans le fichier la durée de la vidéo. 
	 */
	private def int getDurationByFfmpeg(String file){
		
		val rt = Runtime::runtime
		val cmd = #[
			"/bin/sh", "-c", "ffprobe -i "+file+" -show_format | grep duration"
		]

		try {
			val p = rt.exec(cmd)
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
	
	/** Création de la vidéo pour l'ajouter à la playlist pour une video de type mandatory. */
	private def Video createVideoSeqToPlayList(VideoSeqMandatory videoSeq,PlayListFactory factory){
			val video = factory.createVideo
			video.description = videoSeq.description
			video.url = videoSeq.url
			if(videoSeq.dureeSeconde!=0){
				video.duration = videoSeq.dureeSeconde
			}
			else{
				//si la vidéo n'a pas de durée de spécifié, lire le fichier pour voir le temps de la vidéo
				video.duration = getDurationByFfmpeg(video.url)
			}
			video
	}
}