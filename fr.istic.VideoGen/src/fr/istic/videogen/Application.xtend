package fr.istic.videogen

import fr.istic.videogen.playlistFormat.TypeGenerator
import java.net.URL
import java.util.Arrays

class Application {
	
	def static void main(String[] args){
		println(Generator.createVideo(new URL("file:///home/ramage/workspace/workspaceIDM/Videogen/fr.istic.VideoGen/src/main/webapp/resources/test.videogen"),Arrays.asList(6),TypeGenerator.M3UEXT,"filetest.m3u8"))
		//val list = Generator.createVignette(new URL("file:///home/ramage/workspace/workspaceIDM/Videogen/fr.istic.VideoGen/src/main/webapp/resources/test.videogen"))
		//println(list)
	}
}