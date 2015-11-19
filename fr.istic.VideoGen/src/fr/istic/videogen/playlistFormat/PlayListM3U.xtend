package fr.istic.videogen.playlistFormat

import java.io.IOException
import java.io.File
import java.io.FileWriter
import playlist.PlayList

class PlayListM3U {
	
	val PlayList playList;
	
	new(PlayList pPlayList) {
		playList = pPlayList
	}

	def void generateFile() {

		val f = new File("file.ffmpeg");
		val fw = new FileWriter(f);

		try {
			playList.videos.forEach [ v |

				fw.write(v.url);
				fw.write("\r\n");

			]
			fw.close();
		} catch (IOException exception) {
			System.out.println("Erreur lors de la lecture : " + exception.getMessage());
		}
	}
}