package fr.istic.videogen.vignette


class SingleVideoWithImage implements VideoWithImage {
	
	public var String name;
	public var EnumTypeVideo type;
	
	new (String image,EnumTypeVideo enumType){
		name = image;
		type = enumType;
	}
}