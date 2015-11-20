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
  
  public PlayListM3UEXT(final PlayList pPlayList) {
    this.playList = pPlayList;
  }
  
  @Override
  public void generateFile() {
    try {
      final File f = new File("file.m3u");
      final FileWriter fw = new FileWriter(f);
      fw.write("#EXTM3U");
      fw.write("\r\n");
      try {
        EList<Video> _videos = this.playList.getVideos();
        final Consumer<Video> _function = (Video v) -> {
          try {
            int _duration = v.getDuration();
            String _plus = ("#EXTINF: " + Integer.valueOf(_duration));
            String _plus_1 = (_plus + " ");
            String _description = v.getDescription();
            String _plus_2 = (_plus_1 + _description);
            fw.write(_plus_2);
            fw.write("\r\n");
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
