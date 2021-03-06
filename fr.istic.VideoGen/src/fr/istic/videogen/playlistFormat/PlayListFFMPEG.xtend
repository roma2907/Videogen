package fr.istic.videogen.playlistFormat

import java.io.File
import java.io.FileWriter
import java.io.IOException
import playlist.PlayList

// Classe qui va générer un fichier de type ffmpeg
class PlayListFFMPEG implements GeneratorFile {

	val PlayList playList;
	val String fileOut;

	new(PlayList pPlayList,String pFileOut) {
		playList = pPlayList
		fileOut = pFileOut
	}

	override String generateFile() {
		if(playList.videos.size==0){
			System.err.println("Aucun élément dans la playlist")
		}
		
		val f = new File(fileOut);
		val fw = new FileWriter(f);
		
		try {
			playList.videos.forEach [ v |
				fw.write("file " + "'" + v.url.replace("src/main/webapp","") + "'");
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