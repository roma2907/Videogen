package fr.istic.videogen.playlistFormat;

import fr.istic.videogen.playlistFormat.GeneratorFile;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import playlist.PlayList;
import playlist.Video;

@SuppressWarnings("all")
public class PlayListFFMPEG implements GeneratorFile {
  private final PlayList playList;
  
  public PlayListFFMPEG(final PlayList pPlayList) {
    this.playList = pPlayList;
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
        final File f = new File("file.ffmpeg");
        final FileWriter fw = new FileWriter(f);
        try {
          EList<Video> _videos_1 = this.playList.getVideos();
          final Consumer<Video> _function = (Video v) -> {
            try {
              String _url = v.getUrl();
              String _plus = (("file " + "\'") + _url);
              String _plus_1 = (_plus + "\'");
              fw.write(_plus_1);
              fw.write("\r\n");
            } catch (Throwable _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          };
          _videos_1.forEach(_function);
          fw.close();
          InputOutput.<String>println("fin");
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
        final Runtime rt = Runtime.getRuntime();
        String _absolutePath = f.getAbsolutePath();
        String _plus_1 = ("ffmpeg -y -f concat -i " + _absolutePath);
        final String commande = (_plus_1 + " -c copy ../output.avi");
        final List<String> cmd = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("/bin/bash", "-c", commande));
        rt.exec(((String[])Conversions.unwrapArray(cmd, String.class)));
        _xblockexpression = f.getAbsolutePath();
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
