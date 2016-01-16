package fr.istic.videogen;

import fr.istic.videogen.ReadVideogenFile;
import fr.istic.videogen.playlistFormat.GeneratorFile;
import fr.istic.videogen.playlistFormat.PlayListFFMPEG;
import fr.istic.videogen.playlistFormat.PlayListM3U;
import fr.istic.videogen.playlistFormat.PlayListM3UEXT;
import fr.istic.videogen.playlistFormat.TypeGenerator;
import fr.istic.videogen.vignette.GeneratorVignette;
import fr.istic.videogen.vignette.VideoWithImage;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.xtext.example.mydsl.VideoGenStandaloneSetupGenerated;
import org.xtext.example.mydsl.videoGen.VideoGen;
import playlist.PlayList;

@SuppressWarnings("all")
public class Generator {
  public static String createVideo(final URL url, final TypeGenerator type, final String fileOut) {
    String _xblockexpression = null;
    {
      String _file = url.getFile();
      URI _createURI = URI.createURI(_file);
      VideoGen videogen = Generator.loadVideoGen(_createURI);
      ReadVideogenFile readFile = new ReadVideogenFile(videogen);
      PlayList _apply = readFile.apply();
      final GeneratorFile generator = Generator.createGenerator(type, _apply, fileOut);
      _xblockexpression = generator.generateFile();
    }
    return _xblockexpression;
  }
  
  public static String createVideo(final URL url, final List<Integer> identifiantsVideo, final TypeGenerator type, final String fileOut) {
    String _xblockexpression = null;
    {
      String _file = url.getFile();
      URI _createURI = URI.createURI(_file);
      VideoGen videogen = Generator.loadVideoGen(_createURI);
      ReadVideogenFile readFile = new ReadVideogenFile(videogen);
      PlayList _apply = readFile.apply(identifiantsVideo);
      final GeneratorFile generator = Generator.createGenerator(type, _apply, fileOut);
      _xblockexpression = generator.generateFile();
    }
    return _xblockexpression;
  }
  
  public static List<VideoWithImage> createVignette(final URL url) {
    ArrayList<VideoWithImage> _xblockexpression = null;
    {
      String _file = url.getFile();
      URI _createURI = URI.createURI(_file);
      VideoGen videogen = Generator.loadVideoGen(_createURI);
      final GeneratorVignette generator = new GeneratorVignette();
      _xblockexpression = generator.generateVignette(videogen);
    }
    return _xblockexpression;
  }
  
  /**
   * Création du générateur de fichier en fonction du type spécifié (ffmpeg,m3u,m3u8)
   */
  private static GeneratorFile createGenerator(final TypeGenerator type, final PlayList playlist, final String fileOut) {
    if (type != null) {
      switch (type) {
        case M3U:
          return new PlayListM3U(playlist, fileOut);
        case M3UEXT:
          return new PlayListM3UEXT(playlist, fileOut);
        default:
          return new PlayListFFMPEG(playlist, fileOut);
      }
    } else {
      return new PlayListFFMPEG(playlist, fileOut);
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
