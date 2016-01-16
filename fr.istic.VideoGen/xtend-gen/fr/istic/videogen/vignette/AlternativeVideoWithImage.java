package fr.istic.videogen.vignette;

import fr.istic.videogen.vignette.EnumTypeVideo;
import fr.istic.videogen.vignette.SingleVideoWithImage;
import fr.istic.videogen.vignette.VideoWithImage;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * Classe qui associe la liste des identifiants et l'image et le type de vidéo
 */
@SuppressWarnings("all")
public class AlternativeVideoWithImage implements VideoWithImage {
  public List<SingleVideoWithImage> videos = CollectionLiterals.<SingleVideoWithImage>newArrayList();
  
  public EnumTypeVideo type;
}
