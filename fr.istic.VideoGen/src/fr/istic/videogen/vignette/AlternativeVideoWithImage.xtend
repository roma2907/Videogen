package fr.istic.videogen.vignette

import java.util.List
import org.xtext.example.mydsl.videoGen.Video
import java.util.ArrayList

/**
 * Classe qui associe la liste des identifiants et l'image et le type de vidéo
 */
class AlternativeVideoWithImage implements VideoWithImage{
	
	public var List<SingleVideoWithImage> videos = newArrayList
	public var EnumTypeVideo type;
	
}