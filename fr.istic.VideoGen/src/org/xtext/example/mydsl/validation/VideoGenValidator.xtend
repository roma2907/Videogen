/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.validation

import org.xtext.example.mydsl.videoGen.AlternativeRule
import org.eclipse.xtext.validation.Check
import org.xtext.example.mydsl.videoGen.VideoSeq
import org.xtext.example.mydsl.videoGen.VideoGenPackage
import org.xtext.example.mydsl.videoGen.VideoGen
import java.io.File
import org.xtext.example.mydsl.videoGen.VideoSeqMandatory

//import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class VideoGenValidator extends AbstractVideoGenValidator {

//  public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	@Check
	def probabilityAlternativeInferiorOrEgalACent(AlternativeRule alternative){
		//somme des probabilités de chaque alternative
		val probaAlternative= alternative.alternatves.filter(VideoSeq).fold(0)[i1,VideoSeq o |
					i1 + o.proprobabilitePercent	
		]
		if(probaAlternative > 100){
			error("La somme des probailités d'une alternative ne peut pas être supérieur à 100.",alternative.eClass().getEStructuralFeature(VideoGenPackage.ALTERNATIVE_RULE__ALTERNATVES))
		}
	}
	
	@Check
	def verifyIfFileExist(VideoSeq videoSeq){
		val file = new File(videoSeq.url)
		if(!file.exists || file.isDirectory){
			error("L'url ne correspond pas à un fichier.",videoSeq.eClass.getEStructuralFeature(VideoGenPackage.VIDEO_SEQ__URL))	
		}
	}	
	
	@Check
	def verifyIfFileExistMandatory(VideoSeqMandatory videoSeq){
		val file = new File(videoSeq.url)
		if(!file.exists || file.isDirectory){
			error("L'url ne correspond pas à un fichier.",videoSeq.eClass.getEStructuralFeature(VideoGenPackage.VIDEO_SEQ_MANDATORY__URL))	
		}
	}
	
}
