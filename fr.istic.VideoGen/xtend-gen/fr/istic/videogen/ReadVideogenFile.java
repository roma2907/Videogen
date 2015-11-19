package fr.istic.videogen;

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
import playlist.PlayList;
import playlist.PlayListFactory;

@SuppressWarnings("all")
public class ReadVideogenFile {
  private Random random = new Random();
  
  private VideoGen videogen;
  
  public ReadVideogenFile(final VideoGen pVideogen) {
    this.videogen = pVideogen;
  }
  
  public PlayList apply() {
    PlayList _xblockexpression = null;
    {
      final PlayListFactory factory = PlayListFactory.eINSTANCE;
      final PlayList playList = factory.createPlayList();
      EList<Video> _videos = this.videogen.getVideos();
      final Consumer<Video> _function = (Video video) -> {
        if ((video instanceof MandatoryRule)) {
          EList<playlist.Video> _videos_1 = playList.getVideos();
          VideoSeqMandatory _seq = ((MandatoryRule)video).getSeq();
          playlist.Video _createVideoSeqToPlayList = this.createVideoSeqToPlayList(_seq, factory);
          _videos_1.add(_createVideoSeqToPlayList);
        } else {
          if ((video instanceof OptionnalRule)) {
            boolean _canAddOptionnalVideo = this.canAddOptionnalVideo(((OptionnalRule)video));
            if (_canAddOptionnalVideo) {
              EList<playlist.Video> _videos_2 = playList.getVideos();
              VideoSeq _seq_1 = ((OptionnalRule)video).getSeq();
              playlist.Video _createVideoSeqToPlayList_1 = this.createVideoSeqToPlayList(_seq_1, factory);
              _videos_2.add(_createVideoSeqToPlayList_1);
            }
          } else {
            if ((video instanceof AlternativeRule)) {
              EList<playlist.Video> _videos_3 = playList.getVideos();
              VideoSeq _addAlternativeVideo = this.addAlternativeVideo(((AlternativeRule)video));
              playlist.Video _createVideoSeqToPlayList_2 = this.createVideoSeqToPlayList(_addAlternativeVideo, factory);
              _videos_3.add(_createVideoSeqToPlayList_2);
            }
          }
        }
      };
      _videos.forEach(_function);
      EList<playlist.Video> _videos_1 = playList.getVideos();
      final Consumer<playlist.Video> _function_1 = (playlist.Video f) -> {
        String _url = f.getUrl();
        InputOutput.<String>println(_url);
      };
      _videos_1.forEach(_function_1);
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
  
  private VideoSeq addAlternativeVideo(final AlternativeRule video) {
    Object _xblockexpression = null;
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
            return entry.getKey();
          }
        }
      }
      _xblockexpression = null;
    }
    return ((VideoSeq)_xblockexpression);
  }
  
  private playlist.Video createVideoSeqToPlayList(final VideoSeq videoSeq, final PlayListFactory factory) {
    final playlist.Video video = factory.createVideo();
    String _description = videoSeq.getDescription();
    video.setDescription(_description);
    String _url = videoSeq.getUrl();
    video.setUrl(_url);
    int _dureeSeconde = videoSeq.getDureeSeconde();
    video.setDuration(_dureeSeconde);
    return video;
  }
  
  private playlist.Video createVideoSeqToPlayList(final VideoSeqMandatory videoSeq, final PlayListFactory factory) {
    playlist.Video _xblockexpression = null;
    {
      final playlist.Video video = factory.createVideo();
      String _description = videoSeq.getDescription();
      video.setDescription(_description);
      String _url = videoSeq.getUrl();
      video.setUrl(_url);
      int _dureeSeconde = videoSeq.getDureeSeconde();
      video.setDuration(_dureeSeconde);
      _xblockexpression = video;
    }
    return _xblockexpression;
  }
}
