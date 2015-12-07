package fr.istic.videogen.playlistFormat

import java.io.File
import java.io.FileWriter
import java.io.IOException
import playlist.PlayList

class PlayListFFMPEG implements GeneratorFile {

	val PlayList playList;

	new(PlayList pPlayList) {
		playList = pPlayList
	}

	override String generateFile() {
		if(playList.videos.size==0){
			System.err.println("Aucun élément dans la playlist")
		}
		
		val f = new File("file.ffmpeg");
		val fw = new FileWriter(f);
		
		try {
			playList.videos.forEach [ v |
				fw.write("file " + "'" + v.url + "'");
				fw.write("\r\n");
			]
			fw.close();
			println("fin");
		} catch (IOException exception) {
			System.out.println("Erreur lors de la lecture : " + exception.getMessage());
		}
		//requis que ffmpeg soit installé sur la machine
		//appel de ffmpeg pour concaténer les vidéos ensemble
		val rt = Runtime::runtime
		val commande = "ffmpeg -y -f concat -i "+ f.absolutePath+" -c copy ../output.avi"
		val cmd = #[
			"/bin/bash",
			"-c",
			commande
		]
		rt.exec(cmd)
		f.absolutePath
	}

}