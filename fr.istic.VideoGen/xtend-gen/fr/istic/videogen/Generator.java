package fr.istic.videogen;

import fr.istic.videogen.ReadVideogenFile;
import fr.istic.videogen.playlistFormat.GeneratorFile;
import fr.istic.videogen.playlistFormat.PlayListFFMPEG;
import fr.istic.videogen.playlistFormat.PlayListM3U;
import fr.istic.videogen.playlistFormat.PlayListM3UEXT;
import fr.istic.videogen.playlistFormat.TypeGenerator;
import fr.istic.videogen.vignette.AlternativeVideoWithImage;
import fr.istic.videogen.vignette.EnumTypeVideo;
import fr.istic.videogen.vignette.SingleVideoWithImage;
import fr.istic.videogen.vignette.VideoWithImage;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.example.mydsl.VideoGenStandaloneSetupGenerated;
import org.xtext.example.mydsl.videoGen.AlternativeRule;
import org.xtext.example.mydsl.videoGen.MandatoryRule;
import org.xtext.example.mydsl.videoGen.OptionnalRule;
import org.xtext.example.mydsl.videoGen.Video;
import org.xtext.example.mydsl.videoGen.VideoGen;
import org.xtext.example.mydsl.videoGen.VideoSeq;
import org.xtext.example.mydsl.videoGen.VideoSeqMandatory;
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
  
  /**
   * Url du fichier videogen
   */
  public static List<VideoWithImage> createVignette(final URL url) {
    ArrayList<VideoWithImage> _xblockexpression = null;
    {
      String _file = url.getFile();
      URI _createURI = URI.createURI(_file);
      VideoGen videogen = Generator.loadVideoGen(_createURI);
      final ArrayList<VideoWithImage> list = CollectionLiterals.<VideoWithImage>newArrayList();
      int i = 0;
      for (i = 0; (i < ((Object[])Conversions.unwrapArray(videogen.getVideos(), Object.class)).length); i++) {
        {
          EList<Video> _videos = videogen.getVideos();
          Video video = _videos.get(i);
          if ((video instanceof MandatoryRule)) {
            VideoSeqMandatory _seq = ((MandatoryRule)video).getSeq();
            String _url = _seq.getUrl();
            String _createImage = Generator.createImage(_url);
            SingleVideoWithImage _singleVideoWithImage = new SingleVideoWithImage(_createImage, EnumTypeVideo.MANDATORY, i);
            list.add(_singleVideoWithImage);
          } else {
            if ((video instanceof OptionnalRule)) {
              VideoSeq _seq_1 = ((OptionnalRule)video).getSeq();
              String _url_1 = _seq_1.getUrl();
              String _createImage_1 = Generator.createImage(_url_1);
              SingleVideoWithImage _singleVideoWithImage_1 = new SingleVideoWithImage(_createImage_1, EnumTypeVideo.OPTIONNAL, i);
              list.add(_singleVideoWithImage_1);
            } else {
              if ((video instanceof AlternativeRule)) {
                AlternativeVideoWithImage _createImageAlternative = Generator.createImageAlternative(((AlternativeRule)video), i);
                list.add(_createImageAlternative);
              }
            }
          }
        }
      }
      _xblockexpression = list;
    }
    return _xblockexpression;
  }
  
  private static AlternativeVideoWithImage createImageAlternative(final AlternativeRule alternative, final int i) {
    AlternativeVideoWithImage _xblockexpression = null;
    {
      final AlternativeVideoWithImage alternativeVideoWithImage = new AlternativeVideoWithImage();
      EList<VideoSeq> _alternatives = alternative.getAlternatives();
      final Consumer<VideoSeq> _function = (VideoSeq alter) -> {
        String _url = alter.getUrl();
        String _createImage = Generator.createImage(_url);
        SingleVideoWithImage _singleVideoWithImage = new SingleVideoWithImage(_createImage, null, i);
        alternativeVideoWithImage.videos.add(_singleVideoWithImage);
      };
      _alternatives.forEach(_function);
      alternativeVideoWithImage.type = EnumTypeVideo.ALTERNATIVE;
      _xblockexpression = alternativeVideoWithImage;
    }
    return _xblockexpression;
  }
  
  private static String createImage(final String url) {
    try {
      String _xblockexpression = null;
      {
        int _lastIndexOf = url.lastIndexOf(".");
        String _substring = url.substring(0, _lastIndexOf);
        final String newImage = (_substring + ".jpg");
        final Runtime rt = Runtime.getRuntime();
        final String commande = ((("ffmpeg -y -i " + url) + " -r 1 -t 00:00:01 -ss 00:00:02 -f image2 ") + newImage);
        final List<String> cmd = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("/bin/bash", "-c", commande));
        rt.exec(((String[])Conversions.unwrapArray(cmd, String.class)));
        int _lastIndexOf_1 = newImage.lastIndexOf("/");
        int _length = newImage.length();
        _xblockexpression = newImage.substring(_lastIndexOf_1, _length);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
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
