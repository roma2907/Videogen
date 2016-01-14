package fr.istic.videogen;

import fr.istic.videogen.Generator;
import fr.istic.videogen.playlistFormat.TypeGenerator;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Application {
  public static void main(final String[] args) {
    try {
      URL _uRL = new URL("file:///home/ramage/workspace/workspaceIDM/Videogen/fr.istic.VideoGen/src/main/webapp/resources/test.videogen");
      List<Integer> _asList = Arrays.<Integer>asList(Integer.valueOf(6));
      String _createVideo = Generator.createVideo(_uRL, _asList, TypeGenerator.M3UEXT, "filetest.m3u8");
      InputOutput.<String>println(_createVideo);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
