/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.services.VideoGenGrammarAccess;
import org.xtext.example.mydsl.videoGen.AlternativeRule;
import org.xtext.example.mydsl.videoGen.MandatoryRule;
import org.xtext.example.mydsl.videoGen.OptionnalRule;
import org.xtext.example.mydsl.videoGen.VideoGen;
import org.xtext.example.mydsl.videoGen.VideoGenPackage;
import org.xtext.example.mydsl.videoGen.VideoSeq;
import org.xtext.example.mydsl.videoGen.VideoSeqMandatory;

@SuppressWarnings("all")
public class VideoGenSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VideoGenGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == VideoGenPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case VideoGenPackage.ALTERNATIVE_RULE:
				sequence_AlternativeRule(context, (AlternativeRule) semanticObject); 
				return; 
			case VideoGenPackage.MANDATORY_RULE:
				sequence_MandatoryRule(context, (MandatoryRule) semanticObject); 
				return; 
			case VideoGenPackage.OPTIONNAL_RULE:
				sequence_OptionnalRule(context, (OptionnalRule) semanticObject); 
				return; 
			case VideoGenPackage.VIDEO_GEN:
				sequence_VideoGen(context, (VideoGen) semanticObject); 
				return; 
			case VideoGenPackage.VIDEO_SEQ:
				sequence_VideoSeq(context, (VideoSeq) semanticObject); 
				return; 
			case VideoGenPackage.VIDEO_SEQ_MANDATORY:
				sequence_VideoSeqMandatory(context, (VideoSeqMandatory) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (id=ID alternatives+=VideoSeq+)
	 */
	protected void sequence_AlternativeRule(EObject context, AlternativeRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     seq=VideoSeqMandatory
	 */
	protected void sequence_MandatoryRule(EObject context, MandatoryRule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VideoGenPackage.Literals.MANDATORY_RULE__SEQ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VideoGenPackage.Literals.MANDATORY_RULE__SEQ));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMandatoryRuleAccess().getSeqVideoSeqMandatoryParserRuleCall_1_0(), semanticObject.getSeq());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     seq=VideoSeq
	 */
	protected void sequence_OptionnalRule(EObject context, OptionnalRule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VideoGenPackage.Literals.OPTIONNAL_RULE__SEQ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VideoGenPackage.Literals.OPTIONNAL_RULE__SEQ));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOptionnalRuleAccess().getSeqVideoSeqParserRuleCall_1_0(), semanticObject.getSeq());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     videos+=Video*
	 */
	protected void sequence_VideoGen(EObject context, VideoGen semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID? url=STRING description=STRING? dureeSeconde=INT?)
	 */
	protected void sequence_VideoSeqMandatory(EObject context, VideoSeqMandatory semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID? url=STRING description=STRING? proprobabilitePercent=INT? dureeSeconde=INT?)
	 */
	protected void sequence_VideoSeq(EObject context, VideoSeq semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
