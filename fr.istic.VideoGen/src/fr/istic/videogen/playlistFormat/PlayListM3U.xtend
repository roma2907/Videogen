package fr.istic.videogen.playlistFormat

import java.io.IOException
import java.io.File
import java.io.FileWriter
import playlist.PlayList

class PlayListM3U implements GeneratorFile {

	val PlayList playList;
	val String fileOut;

	new(PlayList pPlayList,String pFileOut) {
		playList = pPlayList
		fileOut = pFileOut
	}

	override String generateFile() {
		if (playList.videos.size == 0) {
			System.err.println("Aucun élément dans la playlist")
		}
		val f = new File(fileOut);
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
		f.absolutePath
	}
}