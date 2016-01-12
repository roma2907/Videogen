package fr.istic.videogen

import org.xtext.example.mydsl.videoGen.Video

class SingleVideoWithImage implements VideoWithImage {
	
	public var String urlImage;
	public var Class type;
	
	new (String image,Class classType){
		urlImage = image;
		type = classType;
	}
}