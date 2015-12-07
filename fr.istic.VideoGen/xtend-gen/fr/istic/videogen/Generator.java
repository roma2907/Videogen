package fr.istic.videogen;

import fr.istic.videogen.ReadVideogenFile;
import fr.istic.videogen.playlistFormat.GeneratorFile;
import fr.istic.videogen.playlistFormat.PlayListFFMPEG;
import fr.istic.videogen.playlistFormat.PlayListM3U;
import fr.istic.videogen.playlistFormat.PlayListM3UEXT;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.example.mydsl.VideoGenStandaloneSetupGenerated;
import org.xtext.example.mydsl.videoGen.VideoGen;
import playlist.PlayList;

@SuppressWarnings("all")
public class Generator {
  public static String createVideo(final String file, final String format) {
    String _xblockexpression = null;
    {
      InputOutput.<String>println(((file + "\n") + format));
      URI _createURI = URI.createURI(file);
      VideoGen videogen = Generator.loadVideoGen(_createURI);
      ReadVideogenFile readFile = new ReadVideogenFile(videogen);
      PlayList _apply = readFile.apply();
      final GeneratorFile generator = Generator.createGenerator(format, _apply);
      _xblockexpression = generator.generateFile();
    }
    return _xblockexpression;
  }
  
  private static GeneratorFile createGenerator(final String arg, final PlayList playlist) {
    switch (arg) {
      case "m3u":
        return new PlayListM3U(playlist);
      case "m3uext":
        return new PlayListM3UEXT(playlist);
      default:
        return new PlayListFFMPEG(playlist);
    }
  }
  
  /**
   * Chargement du fichier videogen
   */
  public static VideoGen loadVideoGen(final URI uri) {
    VideoGen _xblockexpression = null;
    {
      VideoGenStandaloneSetupGenerated _videoGenStandaloneSetupGenerated = new VideoGenStandaloneSetupGenerated();
      _videoGenStandaloneSetupGenerated.createInjectorAndDoEMFRegistration();
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource res = _resourceSetImpl.getResource(uri, true);
      EList<EObject> _contents = res.getContents();
      EObject _get = _contents.get(0);
      _xblockexpression = ((VideoGen) _get);
    }
    return _xblockexpression;
  }
}
