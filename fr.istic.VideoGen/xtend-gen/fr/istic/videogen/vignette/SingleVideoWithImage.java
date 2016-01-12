package fr.istic.videogen.vignette;

import fr.istic.videogen.vignette.EnumTypeVideo;
import fr.istic.videogen.vignette.VideoWithImage;

@SuppressWarnings("all")
public class SingleVideoWithImage implements VideoWithImage {
  public String name;
  
  public EnumTypeVideo type;
  
  public int ident;
  
  public SingleVideoWithImage(final String image, final EnumTypeVideo enumType, final int pIdent) {
    this.name = image;
    this.type = enumType;
    this.ident = pIdent;
  }
}
