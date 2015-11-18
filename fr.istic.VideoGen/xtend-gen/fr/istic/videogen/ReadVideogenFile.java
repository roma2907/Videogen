package fr.istic.videogen;

import fr.istic.videogen.playlist.PlayListFFMPEG;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.example.mydsl.videoGen.AlternativeRule;
import org.xtext.example.mydsl.videoGen.MandatoryRule;
import org.xtext.example.mydsl.videoGen.OptionnalRule;
import org.xtext.example.mydsl.videoGen.Video;
import org.xtext.example.mydsl.videoGen.VideoGen;
import org.xtext.example.mydsl.videoGen.VideoSeq;
import org.xtext.example.mydsl.videoGen.VideoSeqMandatory;

@SuppressWarnings("all")
public class ReadVideogenFile {
  private Random random = new Random();
  
  private VideoGen videogen;
  
  public ReadVideogenFile(final VideoGen pVideogen) {
    this.videogen = pVideogen;
  }
  
  public PlayListFFMPEG apply() {
    PlayListFFMPEG _xblockexpression = null;
    {
      final PlayListFFMPEG playList = new PlayListFFMPEG();
      EList<Video> _videos = this.videogen.getVideos();
      final Consumer<Video> _function = (Video video) -> {
        if ((video instanceof MandatoryRule)) {
          VideoSeqMandatory _seq = ((MandatoryRule)video).getSeq();
          String _url = _seq.getUrl();
          playList.add(_url);
        } else {
          if ((video instanceof OptionnalRule)) {
            boolean _canAddOptionnalVideo = this.canAddOptionnalVideo(((OptionnalRule)video));
            if (_canAddOptionnalVideo) {
              VideoSeq _seq_1 = ((OptionnalRule)video).getSeq();
              String _url_1 = _seq_1.getUrl();
              playList.add(_url_1);
            }
          } else {
            if ((video instanceof AlternativeRule)) {
              String _addAlternativeVideo = this.addAlternativeVideo(((AlternativeRule)video));
              playList.add(_addAlternativeVideo);
            }
          }
        }
      };
      _videos.forEach(_function);
      InputOutput.<PlayListFFMPEG>println(playList);
      _xblockexpression = playList;
    }
    return _xblockexpression;
  }
  
  private boolean canAddOptionnalVideo(final OptionnalRule video) {
    boolean _xifexpression = false;
    VideoSeq _seq = video.getSeq();
    int _proprobabilitePercent = _seq.getProprobabilitePercent();
    boolean _lessEqualsThan = (_proprobabilitePercent <= 0);
    if (_lessEqualsThan) {
      _xifexpression = this.random.nextBoolean();
    } else {
      int _nextInt = this.random.nextInt(100);
      VideoSeq _seq_1 = video.getSeq();
      int _proprobabilitePercent_1 = _seq_1.getProprobabilitePercent();
      _xifexpression = (_nextInt < _proprobabilitePercent_1);
    }
    return _xifexpression;
  }
  
  private String addAlternativeVideo(final AlternativeRule video) {
    String _xblockexpression = null;
    {
      final HashMap<VideoSeq, Integer> mapProbability = CollectionLiterals.<VideoSeq, Integer>newHashMap();
      int probaRestante = 100;
      final ArrayList<VideoSeq> listAlternativeWithNoProba = CollectionLiterals.<VideoSeq>newArrayList();
      EList<VideoSeq> _alternatves = video.getAlternatves();
      for (final VideoSeq a : _alternatves) {
        {
          int _proprobabilitePercent = a.getProprobabilitePercent();
          boolean _notEquals = (_proprobabilitePercent != 0);
          if (_notEquals) {
            int _probaRestante = probaRestante;
            int _proprobabilitePercent_1 = a.getProprobabilitePercent();
            probaRestante = (_probaRestante - _proprobabilitePercent_1);
          } else {
            listAlternativeWithNoProba.add(a);
          }
          int _proprobabilitePercent_2 = a.getProprobabilitePercent();
          mapProbability.put(a, Integer.valueOf(_proprobabilitePercent_2));
        }
      }
      final int sizeNoProba = listAlternativeWithNoProba.size();
      if ((sizeNoProba != 0)) {
        final int probaForAl = (probaRestante / sizeNoProba);
        final Consumer<VideoSeq> _function = (VideoSeq a_1) -> {
          mapProbability.put(a_1, Integer.valueOf(probaForAl));
        };
        listAlternativeWithNoProba.forEach(_function);
      }
      final int aleatoire = this.random.nextInt(100);
      int parcours = 0;
      Set<Map.Entry<VideoSeq, Integer>> _entrySet = mapProbability.entrySet();
      for (final Map.Entry<VideoSeq, Integer> entry : _entrySet) {
        {
          int _parcours = parcours;
          Integer _value = entry.getValue();
          parcours = (_parcours + (_value).intValue());
          if ((parcours > aleatoire)) {
            VideoSeq _key = entry.getKey();
            return _key.getUrl();
          }
        }
      }
      _xblockexpression = "";
    }
    return _xblockexpression;
  }
}
