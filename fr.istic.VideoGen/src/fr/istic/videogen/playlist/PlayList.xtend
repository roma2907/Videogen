package fr.istic.videogen.playlist

import java.util.List

class PlayList {
	
	private List<String> urlVideos ;
	
	 new() {
		urlVideos = newArrayList();
	}
	
	def void add(String video){
		urlVideos.add(video);
	}
	
	override String toString(){
		var msg="";
		for(String s:urlVideos){
			msg+=s + "\n";
		}
		return msg;
	}
}