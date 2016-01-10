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
  
  private final String fileOut;
  
  public PlayListM3U(final PlayList pPlayList, final String pFileOut) {
    this.playList = pPlayList;
    this.fileOut = pFileOut;
  }
  
  @Override
  public String generateFile() {
    try {
      String _xblockexpression = null;
      {
        EList<Video> _videos = this.playList.getVideos();
        int _size = _videos.size();
        boolean _equals = (_size == 0);
        if (_equals) {
          System.err.println("Aucun élément dans la playlist");
        }
        final File f = new File(this.fileOut);
        final FileWriter fw = new FileWriter(f);
        try {
          EList<Video> _videos_1 = this.playList.getVideos();
          final Consumer<Video> _function = (Video v) -> {
            try {
              String _url = v.getUrl();
              String _replace = _url.replace("src/main/webapp", "");
              fw.write(_replace);
              fw.write("\r\n");
            } catch (Throwable _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          };
          _videos_1.forEach(_function);
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
        _xblockexpression = f.getAbsolutePath();
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
