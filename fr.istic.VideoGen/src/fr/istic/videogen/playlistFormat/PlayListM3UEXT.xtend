package fr.istic.videogen.playlistFormat

import java.io.BufferedReader
import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.io.InputStreamReader
import playlist.PlayList
import playlist.Video

//Classe qui va générer un fichier de type m3u8
class PlayListM3UEXT implements GeneratorFile {
	/**
	 * #EXTM3U

#EXTINF:123, artiste du morceau - titre du morceau
C:\Documents and Settings\Moi\Ma musique\morceau.mp3

#EXTINF:321,Artiste d'exemple - Titre d'exemple
Bon Hits\Exemple.ogg

#EXTINF:800,Album d'artiste
#EXTREM:Collection de MP3 incomplète dans ce dossier, album sorti en 2003
Bon Hits\Super artiste
	 */
	 
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
		// on crée ici les fichiers ts, on modifie aussi les urls de la playlist 
		//pour qu'ils correspondent au ts créé
		creationTSFilePlaylist(playList)
		val f = new File(fileOut);
		val fw = new FileWriter(f);

		fw.write("#EXTM3U")
		fw.write("\r\n")

		try {
			playList.videos.forEach [ v |
				fw.write("#EXT-X-DISCONTINUITY")
				fw.write("\r\n")
				fw.write("#EXTINF: "+v.duration+" "+v.description)
				fw.write("\r\n");
				fw.write(v.url.replace("src/main/webapp",""));
				fw.write("\r\n");
			]
			fw.close();
		} catch (IOException exception) {
			System.out.println("Erreur lors de la lecture : " + exception.getMessage());
		}
		f.toString
	}
	
	/**
	 * Parcours toutes les vidéos, et crée des fichier ts 
	 */
	def creationTSFilePlaylist(PlayList playlist) {
		playlist.videos.forEach[v|
			creationTSFile(v)
		]
	}
	
	//Méthode qui crée un fichier .ts à partir de la vidéo
	def creationTSFile(Video video){
		val newVideo = video.url.substring(0,video.url.lastIndexOf('.'))+".ts"
		val rt = Runtime::runtime
		val commande = "ffmpeg -i "+video.url+" -strict -2 -acodec aac -vcodec h264  -f mpegts -y "+newVideo
		val cmd = #[
			"/bin/bash",
			"-c",
			commande
		]
		rt.exec(cmd)
		video.url = newVideo
	}
	
	
}