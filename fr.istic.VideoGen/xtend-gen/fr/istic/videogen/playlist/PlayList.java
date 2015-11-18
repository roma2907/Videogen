package fr.istic.videogen.playlist;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public abstract class PlayList {
  protected List<String> urlVideos;
  
  public PlayList() {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList();
    this.urlVideos = _newArrayList;
  }
  
  public void add(final String video) {
    this.urlVideos.add(video);
  }
  
  public abstract void generateFile();
  
  @Override
  public String toString() {
    String msg = "";
    for (final String s : this.urlVideos) {
      String _msg = msg;
      msg = (_msg + (s + "\n"));
    }
    return msg;
  }
}
