package fr.istic.VideoGen.tests;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.xtext.example.mydsl.VideoGenStandaloneSetupGenerated;
import org.xtext.example.mydsl.videoGen.AlternativeRule;
import org.xtext.example.mydsl.videoGen.MandatoryRule;
import org.xtext.example.mydsl.videoGen.OptionnalRule;
import org.xtext.example.mydsl.videoGen.Video;
import org.xtext.example.mydsl.videoGen.VideoGen;
import org.xtext.example.mydsl.videoGen.VideoSeq;
import org.xtext.example.mydsl.videoGen.VideoSeqMandatory;

@SuppressWarnings("all")
public class VideoDemonstration {
  public VideoGen loadVideoGen(final URI uri) {
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
  
  public void saveVideoGen(final URI uri, final VideoGen videoGens) {
    try {
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource rs = _resourceSetImpl.createResource(uri);
      EList<EObject> _contents = rs.getContents();
      _contents.add(videoGens);
      HashMap<Object, Object> _hashMap = new HashMap<Object, Object>();
      rs.save(_hashMap);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void test1() {
    URI _createURI = URI.createURI("test.videogen");
    VideoGen videoGens = this.loadVideoGen(_createURI);
    Assert.assertNotNull(videoGens);
    EList<Video> _videos = videoGens.getVideos();
    int _size = _videos.size();
    Assert.assertEquals(6, _size);
    final ArrayList<String> existingID = CollectionLiterals.<String>newArrayList();
    EList<Video> _videos_1 = videoGens.getVideos();
    Iterable<MandatoryRule> _filter = Iterables.<MandatoryRule>filter(_videos_1, MandatoryRule.class);
    final Consumer<MandatoryRule> _function = (MandatoryRule p) -> {
      VideoSeqMandatory _seq = p.getSeq();
      String _id = _seq.getId();
      boolean _notEquals = (!Objects.equal(_id, null));
      if (_notEquals) {
        VideoSeqMandatory _seq_1 = p.getSeq();
        String _id_1 = _seq_1.getId();
        boolean _contains = existingID.contains(_id_1);
        Assert.assertFalse(_contains);
        VideoSeqMandatory _seq_2 = p.getSeq();
        int _dureeSeconde = _seq_2.getDureeSeconde();
        boolean _greaterEqualsThan = (_dureeSeconde >= 0);
        Assert.assertTrue(_greaterEqualsThan);
        VideoSeqMandatory _seq_3 = p.getSeq();
        String _id_2 = _seq_3.getId();
        existingID.add(_id_2);
      }
    };
    _filter.forEach(_function);
    EList<Video> _videos_2 = videoGens.getVideos();
    Iterable<OptionnalRule> _filter_1 = Iterables.<OptionnalRule>filter(_videos_2, OptionnalRule.class);
    final Consumer<OptionnalRule> _function_1 = (OptionnalRule p) -> {
      VideoSeq _seq = p.getSeq();
      String _id = _seq.getId();
      boolean _notEquals = (!Objects.equal(_id, null));
      if (_notEquals) {
        VideoSeq _seq_1 = p.getSeq();
        String _id_1 = _seq_1.getId();
        boolean _contains = existingID.contains(_id_1);
        Assert.assertFalse(_contains);
        boolean _and = false;
        VideoSeq _seq_2 = p.getSeq();
        int _proprobabilitePercent = _seq_2.getProprobabilitePercent();
        boolean _lessEqualsThan = (_proprobabilitePercent <= 100);
        if (!_lessEqualsThan) {
          _and = false;
        } else {
          VideoSeq _seq_3 = p.getSeq();
          int _proprobabilitePercent_1 = _seq_3.getProprobabilitePercent();
          boolean _greaterThan = (_proprobabilitePercent_1 > 0);
          _and = _greaterThan;
        }
        Assert.assertTrue(_and);
        VideoSeq _seq_4 = p.getSeq();
        int _dureeSeconde = _seq_4.getDureeSeconde();
        boolean _greaterEqualsThan = (_dureeSeconde >= 0);
        Assert.assertTrue(_greaterEqualsThan);
        VideoSeq _seq_5 = p.getSeq();
        String _id_2 = _seq_5.getId();
        existingID.add(_id_2);
      }
    };
    _filter_1.forEach(_function_1);
    EList<Video> _videos_3 = videoGens.getVideos();
    Iterable<AlternativeRule> _filter_2 = Iterables.<AlternativeRule>filter(_videos_3, AlternativeRule.class);
    final Consumer<AlternativeRule> _function_2 = (AlternativeRule p) -> {
      String _id = p.getId();
      boolean _notEquals = (!Objects.equal(_id, null));
      if (_notEquals) {
        String _id_1 = p.getId();
        boolean _contains = existingID.contains(_id_1);
        Assert.assertFalse(_contains);
        String _id_2 = p.getId();
        existingID.add(_id_2);
        EList<VideoSeq> _alternatives = p.getAlternatives();
        final Consumer<VideoSeq> _function_3 = (VideoSeq a) -> {
          String _id_3 = a.getId();
          boolean _notEquals_1 = (!Objects.equal(_id_3, null));
          if (_notEquals_1) {
            String _id_4 = a.getId();
            boolean _contains_1 = existingID.contains(_id_4);
            Assert.assertFalse(_contains_1);
            String _id_5 = a.getId();
            existingID.add(_id_5);
          }
        };
        _alternatives.forEach(_function_3);
      }
    };
    _filter_2.forEach(_function_2);
    EList<Video> _videos_4 = videoGens.getVideos();
    Iterable<AlternativeRule> _filter_3 = Iterables.<AlternativeRule>filter(_videos_4, AlternativeRule.class);
    final Consumer<AlternativeRule> _function_3 = (AlternativeRule p) -> {
      EList<VideoSeq> _alternatives = p.getAlternatives();
      Iterable<VideoSeq> _filter_4 = Iterables.<VideoSeq>filter(_alternatives, VideoSeq.class);
      final Function2<Integer, VideoSeq, Integer> _function_4 = (Integer i1, VideoSeq o) -> {
        int _proprobabilitePercent = o.getProprobabilitePercent();
        return Integer.valueOf(((i1).intValue() + _proprobabilitePercent));
      };
      final Integer probaAlternative = IterableExtensions.<VideoSeq, Integer>fold(_filter_4, Integer.valueOf(0), _function_4);
      Assert.assertTrue(((probaAlternative).intValue() <= 100));
    };
    _filter_3.forEach(_function_3);
    URI _createURI_1 = URI.createURI("videogen1.xmi");
    this.saveVideoGen(_createURI_1, videoGens);
    EList<Video> _videos_5 = videoGens.getVideos();
    Iterable<MandatoryRule> _filter_4 = Iterables.<MandatoryRule>filter(_videos_5, MandatoryRule.class);
    final Consumer<MandatoryRule> _function_4 = (MandatoryRule p) -> {
      VideoSeqMandatory _seq = p.getSeq();
      _seq.setUrl("coucou");
    };
    _filter_4.forEach(_function_4);
    URI _createURI_2 = URI.createURI("test3.videogen");
    this.saveVideoGen(_createURI_2, videoGens);
  }
}
