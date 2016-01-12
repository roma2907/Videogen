package fr.istic.videogen;

import fr.istic.videogen.Generator;
import fr.istic.videogen.vignette.VideoWithImage;
import java.net.URL;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Application {
  public static void main(final String[] args) {
    try {
      URL _uRL = new URL("file:///home/ramage/workspace/workspaceIDM/Videogen/fr.istic.VideoGen/src/main/webapp/resources/test.videogen");
      final List<VideoWithImage> list = Generator.createVignette(_uRL);
      InputOutput.<List<VideoWithImage>>println(list);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
