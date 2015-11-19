package fr.istic.videogen.playlistFormat

import java.io.File
import java.io.FileWriter
import java.io.IOException
import playlist.PlayList

class PlayListFFMPEG {
	
	val PlayList playList;
	
	new(PlayList pPlayList){
		playList=pPlayList
	}
	
	def void generateFile() {

		val f = new File("file.ffmpeg");
		val fw = new FileWriter(f);

		try {
			playList.videos.forEach [ v |

				fw.write("file:" + "'" + v.url + "'");
				fw.write("\r\n");

			]
			fw.close();
			println("fin");
		} catch (IOException exception) {
			System.out.println("Erreur lors de la lecture : " + exception.getMessage());
		}
		
	}
	
}