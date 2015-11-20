package fr.istic.videogen.playlistFormat

import playlist.PlayList
import java.io.File
import java.io.FileWriter
import java.io.IOException
import playlist.Video

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
	
	new(PlayList pPlayList) {
		playList = pPlayList
	}

	override void generateFile() {
		if(playList.videos.size==0){
			System.err.println("Aucun élément dans la playlist")
		}
		// on crée ici les fichiers ts, on modifie aussi les urls de la playlist 
		//pour qu'ils correspondent au ts créé
		creationTSFilePlaylist(playList)
		val f = new File("file.m3u");
		val fw = new FileWriter(f);

		fw.write("#EXTM3U")
		fw.write("\r\n")

		try {
			playList.videos.forEach [ v |
				fw.write("#EXT-X-DISCONTINUITY")
				fw.write("\r\n")
				fw.write("#EXTINF: "+v.duration+" "+v.description)
				fw.write("\r\n");
				fw.write(v.url);
				fw.write("\r\n");
			]
			fw.close();
		} catch (IOException exception) {
			System.out.println("Erreur lors de la lecture : " + exception.getMessage());
		}
	}
	
	/**
	 * Parcours toutes les vidéos, et crée des fichier ts 
	 */
	def creationTSFilePlaylist(PlayList playlist) {
		playlist.videos.forEach[v|
			creationTSFile(v)
		]
	}
	
	def creationTSFile(Video video){
		val newVideo = video.url.substring(0,video.url.lastIndexOf('.'))+".ts"
		val rt = Runtime::runtime
		val commande = "ffmpeg -i "+video.url+" -strict -2 -acodec aac -f mpegts "+newVideo
		val cmd = #[
			"/bin/bash",
			"-c",
			commande
		]
		rt.exec(cmd)
		video.url = newVideo
	}
	
	
}