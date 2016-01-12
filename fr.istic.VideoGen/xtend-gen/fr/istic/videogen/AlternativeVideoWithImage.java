package fr.istic.videogen;

import fr.istic.videogen.SingleVideoWithImage;
import fr.istic.videogen.VideoWithImage;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class AlternativeVideoWithImage implements VideoWithImage {
  public List<SingleVideoWithImage> videos = CollectionLiterals.<SingleVideoWithImage>newArrayList();
  
  public Class type;
}
