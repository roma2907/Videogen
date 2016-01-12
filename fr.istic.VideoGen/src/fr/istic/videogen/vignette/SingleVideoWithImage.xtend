package fr.istic.videogen.vignette


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