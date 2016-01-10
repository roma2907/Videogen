package fr.istic.videogen.playlistFormat;

import fr.istic.videogen.playlistFormat.GeneratorFile;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import playlist.PlayList;
import playlist.Video;

@SuppressWarnings("all")
public class PlayListM3UEXT implements GeneratorFile {
  /**
   * #EXTM3U
   * 
   * #EXTINF:123, artiste du morceau - titre du morceau
   * C:\Documents and Settings\Moi\Ma musique\morceau.mp3
   * 
   * #EXTINF:321,Artiste d'exemple - Titre d'exemple
   * Bon Hits\Exemple.ogg
   * 
   * #EXTINF:800,Album d'artiste
   * #EXTREM:Collection de MP3 incomplète dans ce dossier, album sorti en 2003
   * Bon Hits\Super artiste
   */
  private final PlayList playList;
  
  private final String fileOut;
  
  public PlayListM3UEXT(final PlayList pPlayList, final String pFileOut) {
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
        this.creationTSFilePlaylist(this.playList);
        final File f = new File(this.fileOut);
        final FileWriter fw = new FileWriter(f);
        fw.write("#EXTM3U");
        fw.write("\r\n");
        try {
          EList<Video> _videos_1 = this.playList.getVideos();
          final Consumer<Video> _function = (Video v) -> {
            try {
              fw.write("#EXT-X-DISCONTINUITY");
              fw.write("\r\n");
              int _duration = v.getDuration();
              String _plus = ("#EXTINF: " + Integer.valueOf(_duration));
              String _plus_1 = (_plus + " ");
              String _description = v.getDescription();
              String _plus_2 = (_plus_1 + _description);
              fw.write(_plus_2);
              fw.write("\r\n");
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
        _xblockexpression = f.toString();
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Parcours toutes les vidéos, et crée des fichier ts
   */
  public void creationTSFilePlaylist(final PlayList playlist) {
    EList<Video> _videos = playlist.getVideos();
    final Consumer<Video> _function = (Video v) -> {
      this.creationTSFile(v);
    };
    _videos.forEach(_function);
  }
  
  public void creationTSFile(final Video video) {
    try {
      String _url = video.getUrl();
      String _url_1 = video.getUrl();
      int _lastIndexOf = _url_1.lastIndexOf(".");
      String _substring = _url.substring(0, _lastIndexOf);
      final String newVideo = (_substring + ".ts");
      final Runtime rt = Runtime.getRuntime();
      String _url_2 = video.getUrl();
      String _plus = ("ffmpeg -i " + _url_2);
      String _plus_1 = (_plus + " -strict -2 -acodec aac -vcodec h264  -f mpegts -y ");
      final String commande = (_plus_1 + newVideo);
      final List<String> cmd = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("/bin/bash", "-c", commande));
      final Process p = rt.exec(((String[])Conversions.unwrapArray(cmd, String.class)));
      InputStream _errorStream = p.getErrorStream();
      InputStreamReader _inputStreamReader = new InputStreamReader(_errorStream);
      final BufferedReader stdErr = new BufferedReader(_inputStreamReader);
      int c = stdErr.read();
      while ((c != (-1))) {
        {
          System.err.print(((char) c));
          int _read = stdErr.read();
          c = _read;
        }
      }
      video.setUrl(newVideo);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
