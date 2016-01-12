package fr.istic.videogen;

import fr.istic.videogen.VideoWithImage;

@SuppressWarnings("all")
public class SingleVideoWithImage implements VideoWithImage {
  public String urlImage;
  
  public Class type;
  
  public SingleVideoWithImage(final String image, final Class classType) {
    this.urlImage = image;
    this.type = classType;
  }
}
