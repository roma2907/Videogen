package fr.istic.videogen

import fr.istic.videogen.playlistFormat.TypeGenerator
import java.net.URL

class Application {
	
	def static void main(String[] args){
		println(Generator.createVideo(new URL("file:///home/ramage/workspace/workspaceIDM/Videogen/fr.istic.VideoGen/src/main/webapp/resources/test.videogen"),TypeGenerator.M3UEXT,"filetest.m3u8"))
		//val list = Generator.createVignette(new URL("file:///home/ramage/workspace/workspaceIDM/Videogen/fr.istic.VideoGen/src/main/webapp/resources/test.videogen"))
		//println(list)
	}
}