package fr.istic.videogen.playlist;

import fr.istic.videogen.playlist.PlayList;
import java.util.function.Consumer;

@SuppressWarnings("all")
public class PlayListFFMPEG extends PlayList {
  @Override
  public void generateFile() {
    final Consumer<String> _function = (String v) -> {
    };
    this.urlVideos.forEach(_function);
  }
}
