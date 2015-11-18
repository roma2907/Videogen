package fr.istic.videogen.playlist

import java.util.List

abstract class PlayList {
	
	protected List<String> urlVideos ;
	
	 new() {
		urlVideos = newArrayList();
	}
	
	def void add(String video){
		urlVideos.add(video);
	}
	
	abstract def void generateFile()	
	
	override String toString(){
		var msg="";
		for(String s:urlVideos){
			msg+=s + "\n";
		}
		return msg;
	}
}