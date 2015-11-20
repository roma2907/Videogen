package fr.istic.videogen.playlistFormat

import java.io.IOException
import java.io.File
import java.io.FileWriter
import playlist.PlayList

class PlayListM3U implements GeneratorFile{
	
	val PlayList playList;
	
	new(PlayList pPlayList) {
		playList = pPlayList
	}

	override void generateFile() {

		val f = new File("file.m3u");
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