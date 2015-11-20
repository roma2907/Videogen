package fr.istic.VideoGen.tests

import org.xtext.example.mydsl.VideoGenStandaloneSetupGenerated
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.xtext.example.mydsl.videoGen.VideoGen
import org.eclipse.emf.ecore.resource.Resource
import java.util.HashMap
import org.junit.Test

import static org.junit.Assert.*
import org.xtext.example.mydsl.videoGen.MandatoryRule
import org.xtext.example.mydsl.videoGen.OptionnalRule
import org.xtext.example.mydsl.videoGen.AlternativeRule
import org.xtext.example.mydsl.videoGen.VideoSeq

class VideoDemonstration {
	
	def loadVideoGen(URI uri) {
		new VideoGenStandaloneSetupGenerated().createInjectorAndDoEMFRegistration()
		var res = new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as VideoGen
	}
	
	def saveVideoGen(URI uri, VideoGen videoGens) {
		var Resource rs = new ResourceSetImpl().createResource(uri);
		rs.getContents.add(videoGens);
		rs.save(new HashMap());
	}
	
	@Test
	def test1() {
		// loading
		var videoGens = loadVideoGen(URI.createURI("test.videogen"))
		assertNotNull(videoGens)
		assertEquals(6, videoGens.videos.size)
		val existingID = newArrayList()
		//vérification qu'ils n'existent pas deux mêmes identifiant
		videoGens.videos.filter(MandatoryRule).forEach[p|
			if(p.seq.id !=null){
				assertFalse(existingID.contains(p.seq.id));
				assertTrue(p.seq.dureeSeconde >= 0);
				existingID.add(p.seq.id)
			}
		]
		
		videoGens.videos.filter(OptionnalRule).forEach[p|
			if(p.seq.id !=null){
				assertFalse(existingID.contains(p.seq.id));
				assertTrue(p.seq.proprobabilitePercent<=100 && p.seq.proprobabilitePercent>0);
				assertTrue(p.seq.dureeSeconde >= 0);
				existingID.add(p.seq.id)
			}
		]
		
		videoGens.videos.filter(AlternativeRule).forEach[p|
			if(p.id !=null){
				assertFalse(existingID.contains(p.id));
				existingID.add(p.id)
				p.alternatves.forEach[a|
					if(a.id !=null){
						assertFalse(existingID.contains(a.id));
						existingID.add(a.id)
					}
				]
			}
		]
		
		
		
		//vérification probabilté alternative <= 100%
		videoGens.videos.filter(AlternativeRule).forEach[p|
				val probaAlternative= p.alternatves.filter(VideoSeq).fold(0)[i1,VideoSeq o |
					i1 + o.proprobabilitePercent	
				]
				assertTrue(probaAlternative<=100);
		]
		
		saveVideoGen(URI.createURI("videogen1.xmi"), videoGens)
		// MODEL MANAGEMENT (ANALYSIS, TRANSFORMATION)
		videoGens.videos.filter(MandatoryRule).forEach[p | p.seq.url = "coucou"]
		// serializing
		saveVideoGen(URI.createURI("test3.videogen"), videoGens)
	}
	
}