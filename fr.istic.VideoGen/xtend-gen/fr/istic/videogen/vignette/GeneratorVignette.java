package fr.istic.videogen.vignette;

import fr.istic.videogen.vignette.AlternativeVideoWithImage;
import fr.istic.videogen.vignette.EnumTypeVideo;
import fr.istic.videogen.vignette.SingleVideoWithImage;
import fr.istic.videogen.vignette.VideoWithImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.example.mydsl.videoGen.AlternativeRule;
import org.xtext.example.mydsl.videoGen.MandatoryRule;
import org.xtext.example.mydsl.videoGen.OptionnalRule;
import org.xtext.example.mydsl.videoGen.Video;
import org.xtext.example.mydsl.videoGen.VideoGen;
import org.xtext.example.mydsl.videoGen.VideoSeq;
import org.xtext.example.mydsl.videoGen.VideoSeqMandatory;

@SuppressWarnings("all")
public class GeneratorVignette {
  private int j = 0;
  
  /**
   * Création de l'image à partir de la vidéo
   */
  private SingleVideoWithImage createImage(final String url, final EnumTypeVideo type) {
    try {
      SingleVideoWithImage _xblockexpression = null;
      {
        int _lastIndexOf = url.lastIndexOf(".");
        String _substring = url.substring(0, _lastIndexOf);
        final String newImage = (_substring + ".jpg");
        final Runtime rt = Runtime.getRuntime();
        final String commande = ((("ffmpeg -y -i " + url) + " -r 1 -t 00:00:01 -ss 00:00:02 -f image2 ") + newImage);
        final List<String> cmd = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("/bin/bash", "-c", commande));
        rt.exec(((String[])Conversions.unwrapArray(cmd, String.class)));
        int _lastIndexOf_1 = newImage.lastIndexOf("/");
        int _plus = (_lastIndexOf_1 + 1);
        int _length = newImage.length();
        String _substring_1 = newImage.substring(_plus, _length);
        int _plusPlus = this.j++;
        _xblockexpression = new SingleVideoWithImage(_substring_1, type, _plusPlus);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Génération des vignettes des vidéos du fichier videogen
   */
  public ArrayList<VideoWithImage> generateVignette(final VideoGen videogen) {
    ArrayList<VideoWithImage> _xblockexpression = null;
    {
      final ArrayList<VideoWithImage> list = CollectionLiterals.<VideoWithImage>newArrayList();
      EList<Video> _videos = videogen.getVideos();
      final Consumer<Video> _function = (Video video) -> {
        if ((video instanceof MandatoryRule)) {
          VideoSeqMandatory _seq = ((MandatoryRule)video).getSeq();
          String _url = _seq.getUrl();
          SingleVideoWithImage _createImage = this.createImage(_url, EnumTypeVideo.MANDATORY);
          list.add(_createImage);
        } else {
          if ((video instanceof OptionnalRule)) {
            VideoSeq _seq_1 = ((OptionnalRule)video).getSeq();
            String _url_1 = _seq_1.getUrl();
            SingleVideoWithImage _createImage_1 = this.createImage(_url_1, EnumTypeVideo.OPTIONNAL);
            list.add(_createImage_1);
          } else {
            if ((video instanceof AlternativeRule)) {
              AlternativeVideoWithImage _createImageAlternative = this.createImageAlternative(((AlternativeRule)video));
              list.add(_createImageAlternative);
            }
          }
        }
      };
      _videos.forEach(_function);
      _xblockexpression = list;
    }
    return _xblockexpression;
  }
  
  /**
   * Création des vignettes pour une vidéo alternative
   */
  private AlternativeVideoWithImage createImageAlternative(final AlternativeRule alternative) {
    AlternativeVideoWithImage _xblockexpression = null;
    {
      final AlternativeVideoWithImage alternativeVideoWithImage = new AlternativeVideoWithImage();
      EList<VideoSeq> _alternatives = alternative.getAlternatives();
      final Consumer<VideoSeq> _function = (VideoSeq alter) -> {
        String _url = alter.getUrl();
        SingleVideoWithImage _createImage = this.createImage(_url, null);
        alternativeVideoWithImage.videos.add(_createImage);
      };
      _alternatives.forEach(_function);
      alternativeVideoWithImage.type = EnumTypeVideo.ALTERNATIVE;
      _xblockexpression = alternativeVideoWithImage;
    }
    return _xblockexpression;
  }
}
