package fr.istic.videogen.playlistFormat;

import fr.istic.videogen.playlistFormat.GeneratorFile;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import playlist.PlayList;
import playlist.Video;

@SuppressWarnings("all")
public class PlayListM3U implements GeneratorFile {
  private final PlayList playList;
  
  public PlayListM3U(final PlayList pPlayList) {
    this.playList = pPlayList;
  }
  
  @Override
  public void generateFile() {
    try {
      final File f = new File("file.m3u");
      final FileWriter fw = new FileWriter(f);
      try {
        EList<Video> _videos = this.playList.getVideos();
        final Consumer<Video> _function = (Video v) -> {
          try {
            String _url = v.getUrl();
            fw.write(_url);
            fw.write("\r\n");
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        };
        _videos.forEach(_function);
        fw.close();
      } catch (final Throwable _t) {
        if (_t instanceof IOException) {
          final IOException exception = (IOException)_t;
          String _message = exception.getMessage();
          String _plus = ("Erreur lors de la lecture : " + _message);
          System.out.println(_plus);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}