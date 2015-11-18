package fr.istic.videogen;

import fr.istic.videogen.ReadVideogenFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.xtext.example.mydsl.VideoGenStandaloneSetupGenerated;
import org.xtext.example.mydsl.videoGen.VideoGen;

@SuppressWarnings("all")
public class Main {
  public static void main(final String[] args) {
    int _length = args.length;
    boolean _notEquals = (_length != 1);
    if (_notEquals) {
      throw new IllegalArgumentException();
    }
    String _get = args[0];
    URI _createURI = URI.createURI(_get);
    VideoGen videogen = Main.loadVideoGen(_createURI);
    ReadVideogenFile readFile = new ReadVideogenFile(videogen);
    readFile.apply();
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
