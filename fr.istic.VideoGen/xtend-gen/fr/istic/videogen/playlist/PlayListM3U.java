package fr.istic.videogen.playlist;

import fr.istic.videogen.playlist.PlayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class PlayListM3U extends PlayList {
  @Override
  public void generateFile() {
    try {
      final File f = new File("file.m3u");
      final FileWriter fw = new FileWriter(f);
      try {
        final Consumer<String> _function = (String v) -> {
          try {
            fw.write(v);
            fw.write("\r\n");
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        };
        this.urlVideos.forEach(_function);
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
