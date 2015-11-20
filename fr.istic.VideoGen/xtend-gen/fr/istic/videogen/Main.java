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
import org.xtext.example.mydsl.VideoGenStandaloneSetupGenerated;
import org.xtext.example.mydsl.videoGen.VideoGen;
import playlist.PlayList;

@SuppressWarnings("all")
public class Main {
  public static void main(final String[] args) {
    boolean _or = false;
    int _length = args.length;
    boolean _equals = (_length == 1);
    if (_equals) {
      _or = true;
    } else {
      int _length_1 = args.length;
      boolean _equals_1 = (_length_1 == 2);
      _or = _equals_1;
    }
    boolean _not = (!_or);
    if (_not) {
      throw new IllegalArgumentException();
    }
    String _get = args[0];
    URI _createURI = URI.createURI(_get);
    VideoGen videogen = Main.loadVideoGen(_createURI);
    ReadVideogenFile readFile = new ReadVideogenFile(videogen);
    String _get_1 = args[1];
    PlayList _apply = readFile.apply();
    final GeneratorFile generator = Main.createGenerator(_get_1, _apply);
    generator.generateFile();
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
