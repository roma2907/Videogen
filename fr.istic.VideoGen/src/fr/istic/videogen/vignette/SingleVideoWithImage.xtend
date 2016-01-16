package fr.istic.videogen.vignette

/**
 * Classe qui associe l'url de l'image, l'identifiant de la vidéo, et le type de vidéo
 */
class SingleVideoWithImage implements VideoWithImage {
	
	public var String name;
	public var EnumTypeVideo type;
	public var int ident;
	
	new (String image,EnumTypeVideo enumType,int pIdent){
		name = image;
		type = enumType;
		ident=pIdent;
	}
	
}