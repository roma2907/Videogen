package fr.istic.videogen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
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
import playlist.PlayList;
import playlist.PlayListFactory;

@SuppressWarnings("all")
public class ReadVideogenFile {
  private Random random = new Random();
  
  private VideoGen videogen;
  
  public ReadVideogenFile(final VideoGen pVideogen) {
    this.videogen = pVideogen;
  }
  
  /**
   * Création de la playlist, à partir des vignettes sélectionnés par l'utilisateur
   */
  public PlayList apply(final List<Integer> listIdentifiants) {
    PlayList _xblockexpression = null;
    {
      final PlayListFactory factory = PlayListFactory.eINSTANCE;
      final PlayList playList = factory.createPlayList();
      Collections.<Integer>sort(listIdentifiants);
      int i = 0;
      int a = 0;
      while ((a < this.videogen.getVideos().size())) {
        {
          EList<Video> _videos = this.videogen.getVideos();
          Video video = _videos.get(a);
          if ((video instanceof MandatoryRule)) {
            EList<playlist.Video> _videos_1 = playList.getVideos();
            VideoSeqMandatory _seq = ((MandatoryRule)video).getSeq();
            playlist.Video _createVideoSeqToPlayList = this.createVideoSeqToPlayList(_seq, factory);
            _videos_1.add(_createVideoSeqToPlayList);
            i++;
          } else {
            if ((video instanceof OptionnalRule)) {
              boolean _contains = listIdentifiants.contains(Integer.valueOf(i));
              if (_contains) {
                EList<playlist.Video> _videos_2 = playList.getVideos();
                VideoSeq _seq_1 = ((OptionnalRule)video).getSeq();
                playlist.Video _createVideoSeqToPlayList_1 = this.createVideoSeqToPlayList(_seq_1, factory);
                _videos_2.add(_createVideoSeqToPlayList_1);
              }
              i++;
            } else {
              if ((video instanceof AlternativeRule)) {
                EList<VideoSeq> _alternatives = ((AlternativeRule)video).getAlternatives();
                for (final VideoSeq alter : _alternatives) {
                  {
                    boolean _contains_1 = listIdentifiants.contains(Integer.valueOf(i));
                    if (_contains_1) {
                      EList<playlist.Video> _videos_3 = playList.getVideos();
                      playlist.Video _createVideoSeqToPlayList_2 = this.createVideoSeqToPlayList(alter, factory);
                      _videos_3.add(_createVideoSeqToPlayList_2);
                    }
                    i++;
                  }
                }
              }
            }
          }
          a++;
        }
      }
      _xblockexpression = playList;
    }
    return _xblockexpression;
  }
  
  /**
   * Création de la playlist, à partir du fichier videogen, en prenant en compte les probabilités et l'aléatoire
   */
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
      _xblockexpression = playList;
    }
    return _xblockexpression;
  }
  
  /**
   * Foction qui va regarder les probabilités de la vidéos optionnel,
   *  et qui retourne true si le nombre tiré aléatoirement est inférieur au probabilité
   *  le fait de retourner true indique que l'on peut ajouter la vidéo à la playlist
   */
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
  
  /**
   * Méthode qui va regarder une video alternative, et qui va retourner une des VideoSeq en fonction des probabilités
   * spécifiés dans le fichier videogen et en fonction des nombres tirés aléatoirement
   */
  private VideoSeq addAlternativeVideo(final AlternativeRule video) {
    Object _xblockexpression = null;
    {
      final HashMap<VideoSeq, Integer> mapProbability = CollectionLiterals.<VideoSeq, Integer>newHashMap();
      int probaRestante = 100;
      final ArrayList<VideoSeq> listAlternativeWithNoProba = CollectionLiterals.<VideoSeq>newArrayList();
      EList<VideoSeq> _alternatives = video.getAlternatives();
      for (final VideoSeq a : _alternatives) {
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
        int probaForAl = (probaRestante / sizeNoProba);
        if (((probaRestante % probaForAl) != 0)) {
          probaForAl++;
        }
        for (final VideoSeq a_1 : listAlternativeWithNoProba) {
          mapProbability.put(a_1, Integer.valueOf(probaForAl));
        }
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
  
  /**
   * Création de la vidéo pour l'ajouter à la playlist
   */
  private playlist.Video createVideoSeqToPlayList(final VideoSeq videoSeq, final PlayListFactory factory) {
    final playlist.Video video = factory.createVideo();
    String _description = videoSeq.getDescription();
    video.setDescription(_description);
    String _url = videoSeq.getUrl();
    video.setUrl(_url);
    int _dureeSeconde = videoSeq.getDureeSeconde();
    boolean _notEquals = (_dureeSeconde != 0);
    if (_notEquals) {
      int _dureeSeconde_1 = videoSeq.getDureeSeconde();
      video.setDuration(_dureeSeconde_1);
    } else {
      String _url_1 = video.getUrl();
      int _durationByFfmpeg = this.getDurationByFfmpeg(_url_1);
      video.setDuration(_durationByFfmpeg);
    }
    return video;
  }
  
  /**
   * Fonction qui va lire dans le fichier la durée de la vidéo.
   */
  private int getDurationByFfmpeg(final String file) {
    final Runtime rt = Runtime.getRuntime();
    final List<String> cmd = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("/bin/sh", "-c", (("ffprobe -i " + file) + " -show_format | grep duration")));
    try {
      final Process p = rt.exec(((String[])Conversions.unwrapArray(cmd, String.class)));
      InputStream _inputStream = p.getInputStream();
      InputStreamReader _inputStreamReader = new InputStreamReader(_inputStream);
      final BufferedReader stdInput = new BufferedReader(_inputStreamReader);
      System.out.println(stdInput);
      final String durationLine = stdInput.readLine();
      String[] _split = durationLine.split("=");
      final String durationStr = _split[1];
      final double durationDouble = Double.parseDouble(durationStr);
      final int duration = Double.valueOf(durationDouble).intValue();
      return duration;
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
        return 0;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  /**
   * Création de la vidéo pour l'ajouter à la playlist pour une video de type mandatory.
   */
  private playlist.Video createVideoSeqToPlayList(final VideoSeqMandatory videoSeq, final PlayListFactory factory) {
    playlist.Video _xblockexpression = null;
    {
      final playlist.Video video = factory.createVideo();
      String _description = videoSeq.getDescription();
      video.setDescription(_description);
      String _url = videoSeq.getUrl();
      video.setUrl(_url);
      int _dureeSeconde = videoSeq.getDureeSeconde();
      boolean _notEquals = (_dureeSeconde != 0);
      if (_notEquals) {
        int _dureeSeconde_1 = videoSeq.getDureeSeconde();
        video.setDuration(_dureeSeconde_1);
      } else {
        String _url_1 = video.getUrl();
        int _durationByFfmpeg = this.getDurationByFfmpeg(_url_1);
        video.setDuration(_durationByFfmpeg);
      }
      _xblockexpression = video;
    }
    return _xblockexpression;
  }
}
