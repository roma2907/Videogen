package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.VideoGenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoGenParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VideoGen'", "'{'", "'}'", "'mandatory'", "'optional'", "'alternatives'", "'videoseq'", "'description'", "':'", "'probability'", "'duration'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalVideoGenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVideoGenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVideoGenParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g"; }



     	private VideoGenGrammarAccess grammarAccess;
     	
        public InternalVideoGenParser(TokenStream input, VideoGenGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "VideoGen";	
       	}
       	
       	@Override
       	protected VideoGenGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleVideoGen"
    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:67:1: entryRuleVideoGen returns [EObject current=null] : iv_ruleVideoGen= ruleVideoGen EOF ;
    public final EObject entryRuleVideoGen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoGen = null;


        try {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:68:2: (iv_ruleVideoGen= ruleVideoGen EOF )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:69:2: iv_ruleVideoGen= ruleVideoGen EOF
            {
             newCompositeNode(grammarAccess.getVideoGenRule()); 
            pushFollow(FOLLOW_ruleVideoGen_in_entryRuleVideoGen75);
            iv_ruleVideoGen=ruleVideoGen();

            state._fsp--;

             current =iv_ruleVideoGen; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoGen85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVideoGen"


    // $ANTLR start "ruleVideoGen"
    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:76:1: ruleVideoGen returns [EObject current=null] : (otherlv_0= 'VideoGen' otherlv_1= '{' ( (lv_videos_2_0= ruleVideo ) )* otherlv_3= '}' ) ;
    public final EObject ruleVideoGen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_videos_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:79:28: ( (otherlv_0= 'VideoGen' otherlv_1= '{' ( (lv_videos_2_0= ruleVideo ) )* otherlv_3= '}' ) )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:80:1: (otherlv_0= 'VideoGen' otherlv_1= '{' ( (lv_videos_2_0= ruleVideo ) )* otherlv_3= '}' )
            {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:80:1: (otherlv_0= 'VideoGen' otherlv_1= '{' ( (lv_videos_2_0= ruleVideo ) )* otherlv_3= '}' )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:80:3: otherlv_0= 'VideoGen' otherlv_1= '{' ( (lv_videos_2_0= ruleVideo ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleVideoGen122); 

                	newLeafNode(otherlv_0, grammarAccess.getVideoGenAccess().getVideoGenKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleVideoGen134); 

                	newLeafNode(otherlv_1, grammarAccess.getVideoGenAccess().getLeftCurlyBracketKeyword_1());
                
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:88:1: ( (lv_videos_2_0= ruleVideo ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:89:1: (lv_videos_2_0= ruleVideo )
            	    {
            	    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:89:1: (lv_videos_2_0= ruleVideo )
            	    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:90:3: lv_videos_2_0= ruleVideo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVideoGenAccess().getVideosVideoParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVideo_in_ruleVideoGen155);
            	    lv_videos_2_0=ruleVideo();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVideoGenRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"videos",
            	            		lv_videos_2_0, 
            	            		"Video");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleVideoGen168); 

                	newLeafNode(otherlv_3, grammarAccess.getVideoGenAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVideoGen"


    // $ANTLR start "entryRuleVideo"
    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:118:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:119:2: (iv_ruleVideo= ruleVideo EOF )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:120:2: iv_ruleVideo= ruleVideo EOF
            {
             newCompositeNode(grammarAccess.getVideoRule()); 
            pushFollow(FOLLOW_ruleVideo_in_entryRuleVideo204);
            iv_ruleVideo=ruleVideo();

            state._fsp--;

             current =iv_ruleVideo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideo214); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVideo"


    // $ANTLR start "ruleVideo"
    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:127:1: ruleVideo returns [EObject current=null] : (this_MandatoryRule_0= ruleMandatoryRule | this_OptionnalRule_1= ruleOptionnalRule | this_AlternativeRule_2= ruleAlternativeRule ) ;
    public final EObject ruleVideo() throws RecognitionException {
        EObject current = null;

        EObject this_MandatoryRule_0 = null;

        EObject this_OptionnalRule_1 = null;

        EObject this_AlternativeRule_2 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:130:28: ( (this_MandatoryRule_0= ruleMandatoryRule | this_OptionnalRule_1= ruleOptionnalRule | this_AlternativeRule_2= ruleAlternativeRule ) )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:131:1: (this_MandatoryRule_0= ruleMandatoryRule | this_OptionnalRule_1= ruleOptionnalRule | this_AlternativeRule_2= ruleAlternativeRule )
            {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:131:1: (this_MandatoryRule_0= ruleMandatoryRule | this_OptionnalRule_1= ruleOptionnalRule | this_AlternativeRule_2= ruleAlternativeRule )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:132:5: this_MandatoryRule_0= ruleMandatoryRule
                    {
                     
                            newCompositeNode(grammarAccess.getVideoAccess().getMandatoryRuleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMandatoryRule_in_ruleVideo261);
                    this_MandatoryRule_0=ruleMandatoryRule();

                    state._fsp--;

                     
                            current = this_MandatoryRule_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:142:5: this_OptionnalRule_1= ruleOptionnalRule
                    {
                     
                            newCompositeNode(grammarAccess.getVideoAccess().getOptionnalRuleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOptionnalRule_in_ruleVideo288);
                    this_OptionnalRule_1=ruleOptionnalRule();

                    state._fsp--;

                     
                            current = this_OptionnalRule_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:152:5: this_AlternativeRule_2= ruleAlternativeRule
                    {
                     
                            newCompositeNode(grammarAccess.getVideoAccess().getAlternativeRuleParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAlternativeRule_in_ruleVideo315);
                    this_AlternativeRule_2=ruleAlternativeRule();

                    state._fsp--;

                     
                            current = this_AlternativeRule_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleMandatoryRule"
    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:168:1: entryRuleMandatoryRule returns [EObject current=null] : iv_ruleMandatoryRule= ruleMandatoryRule EOF ;
    public final EObject entryRuleMandatoryRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatoryRule = null;


        try {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:169:2: (iv_ruleMandatoryRule= ruleMandatoryRule EOF )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:170:2: iv_ruleMandatoryRule= ruleMandatoryRule EOF
            {
             newCompositeNode(grammarAccess.getMandatoryRuleRule()); 
            pushFollow(FOLLOW_ruleMandatoryRule_in_entryRuleMandatoryRule350);
            iv_ruleMandatoryRule=ruleMandatoryRule();

            state._fsp--;

             current =iv_ruleMandatoryRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatoryRule360); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMandatoryRule"


    // $ANTLR start "ruleMandatoryRule"
    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:177:1: ruleMandatoryRule returns [EObject current=null] : (otherlv_0= 'mandatory' ( (lv_seq_1_0= ruleVideoSeqMandatory ) ) ) ;
    public final EObject ruleMandatoryRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_seq_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:180:28: ( (otherlv_0= 'mandatory' ( (lv_seq_1_0= ruleVideoSeqMandatory ) ) ) )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:181:1: (otherlv_0= 'mandatory' ( (lv_seq_1_0= ruleVideoSeqMandatory ) ) )
            {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:181:1: (otherlv_0= 'mandatory' ( (lv_seq_1_0= ruleVideoSeqMandatory ) ) )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:181:3: otherlv_0= 'mandatory' ( (lv_seq_1_0= ruleVideoSeqMandatory ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleMandatoryRule397); 

                	newLeafNode(otherlv_0, grammarAccess.getMandatoryRuleAccess().getMandatoryKeyword_0());
                
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:185:1: ( (lv_seq_1_0= ruleVideoSeqMandatory ) )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:186:1: (lv_seq_1_0= ruleVideoSeqMandatory )
            {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:186:1: (lv_seq_1_0= ruleVideoSeqMandatory )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:187:3: lv_seq_1_0= ruleVideoSeqMandatory
            {
             
            	        newCompositeNode(grammarAccess.getMandatoryRuleAccess().getSeqVideoSeqMandatoryParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVideoSeqMandatory_in_ruleMandatoryRule418);
            lv_seq_1_0=ruleVideoSeqMandatory();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMandatoryRuleRule());
            	        }
                   		set(
                   			current, 
                   			"seq",
                    		lv_seq_1_0, 
                    		"VideoSeqMandatory");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMandatoryRule"


    // $ANTLR start "entryRuleOptionnalRule"
    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:211:1: entryRuleOptionnalRule returns [EObject current=null] : iv_ruleOptionnalRule= ruleOptionnalRule EOF ;
    public final EObject entryRuleOptionnalRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionnalRule = null;


        try {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:212:2: (iv_ruleOptionnalRule= ruleOptionnalRule EOF )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:213:2: iv_ruleOptionnalRule= ruleOptionnalRule EOF
            {
             newCompositeNode(grammarAccess.getOptionnalRuleRule()); 
            pushFollow(FOLLOW_ruleOptionnalRule_in_entryRuleOptionnalRule454);
            iv_ruleOptionnalRule=ruleOptionnalRule();

            state._fsp--;

             current =iv_ruleOptionnalRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionnalRule464); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionnalRule"


    // $ANTLR start "ruleOptionnalRule"
    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:220:1: ruleOptionnalRule returns [EObject current=null] : (otherlv_0= 'optional' ( (lv_seq_1_0= ruleVideoSeq ) ) ) ;
    public final EObject ruleOptionnalRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_seq_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:223:28: ( (otherlv_0= 'optional' ( (lv_seq_1_0= ruleVideoSeq ) ) ) )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:224:1: (otherlv_0= 'optional' ( (lv_seq_1_0= ruleVideoSeq ) ) )
            {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:224:1: (otherlv_0= 'optional' ( (lv_seq_1_0= ruleVideoSeq ) ) )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:224:3: otherlv_0= 'optional' ( (lv_seq_1_0= ruleVideoSeq ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleOptionnalRule501); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionnalRuleAccess().getOptionalKeyword_0());
                
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:228:1: ( (lv_seq_1_0= ruleVideoSeq ) )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:229:1: (lv_seq_1_0= ruleVideoSeq )
            {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:229:1: (lv_seq_1_0= ruleVideoSeq )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:230:3: lv_seq_1_0= ruleVideoSeq
            {
             
            	        newCompositeNode(grammarAccess.getOptionnalRuleAccess().getSeqVideoSeqParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVideoSeq_in_ruleOptionnalRule522);
            lv_seq_1_0=ruleVideoSeq();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionnalRuleRule());
            	        }
                   		set(
                   			current, 
                   			"seq",
                    		lv_seq_1_0, 
                    		"VideoSeq");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionnalRule"


    // $ANTLR start "entryRuleAlternativeRule"
    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:254:1: entryRuleAlternativeRule returns [EObject current=null] : iv_ruleAlternativeRule= ruleAlternativeRule EOF ;
    public final EObject entryRuleAlternativeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternativeRule = null;


        try {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:255:2: (iv_ruleAlternativeRule= ruleAlternativeRule EOF )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:256:2: iv_ruleAlternativeRule= ruleAlternativeRule EOF
            {
             newCompositeNode(grammarAccess.getAlternativeRuleRule()); 
            pushFollow(FOLLOW_ruleAlternativeRule_in_entryRuleAlternativeRule558);
            iv_ruleAlternativeRule=ruleAlternativeRule();

            state._fsp--;

             current =iv_ruleAlternativeRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternativeRule568); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlternativeRule"


    // $ANTLR start "ruleAlternativeRule"
    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:263:1: ruleAlternativeRule returns [EObject current=null] : (otherlv_0= 'alternatives' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_alternatves_3_0= ruleVideoSeq ) )+ otherlv_4= '}' ) ;
    public final EObject ruleAlternativeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_alternatves_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:266:28: ( (otherlv_0= 'alternatives' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_alternatves_3_0= ruleVideoSeq ) )+ otherlv_4= '}' ) )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:267:1: (otherlv_0= 'alternatives' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_alternatves_3_0= ruleVideoSeq ) )+ otherlv_4= '}' )
            {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:267:1: (otherlv_0= 'alternatives' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_alternatves_3_0= ruleVideoSeq ) )+ otherlv_4= '}' )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:267:3: otherlv_0= 'alternatives' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_alternatves_3_0= ruleVideoSeq ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleAlternativeRule605); 

                	newLeafNode(otherlv_0, grammarAccess.getAlternativeRuleAccess().getAlternativesKeyword_0());
                
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:271:1: ( (lv_id_1_0= RULE_ID ) )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:272:1: (lv_id_1_0= RULE_ID )
            {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:272:1: (lv_id_1_0= RULE_ID )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:273:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlternativeRule622); 

            			newLeafNode(lv_id_1_0, grammarAccess.getAlternativeRuleAccess().getIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAlternativeRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAlternativeRule639); 

                	newLeafNode(otherlv_2, grammarAccess.getAlternativeRuleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:293:1: ( (lv_alternatves_3_0= ruleVideoSeq ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:294:1: (lv_alternatves_3_0= ruleVideoSeq )
            	    {
            	    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:294:1: (lv_alternatves_3_0= ruleVideoSeq )
            	    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:295:3: lv_alternatves_3_0= ruleVideoSeq
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAlternativeRuleAccess().getAlternatvesVideoSeqParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVideoSeq_in_ruleAlternativeRule660);
            	    lv_alternatves_3_0=ruleVideoSeq();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAlternativeRuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"alternatves",
            	            		lv_alternatves_3_0, 
            	            		"VideoSeq");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleAlternativeRule673); 

                	newLeafNode(otherlv_4, grammarAccess.getAlternativeRuleAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlternativeRule"


    // $ANTLR start "entryRuleVideoSeq"
    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:323:1: entryRuleVideoSeq returns [EObject current=null] : iv_ruleVideoSeq= ruleVideoSeq EOF ;
    public final EObject entryRuleVideoSeq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoSeq = null;


        try {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:324:2: (iv_ruleVideoSeq= ruleVideoSeq EOF )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:325:2: iv_ruleVideoSeq= ruleVideoSeq EOF
            {
             newCompositeNode(grammarAccess.getVideoSeqRule()); 
            pushFollow(FOLLOW_ruleVideoSeq_in_entryRuleVideoSeq709);
            iv_ruleVideoSeq=ruleVideoSeq();

            state._fsp--;

             current =iv_ruleVideoSeq; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoSeq719); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVideoSeq"


    // $ANTLR start "ruleVideoSeq"
    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:332:1: ruleVideoSeq returns [EObject current=null] : (otherlv_0= 'videoseq' ( (lv_id_1_0= RULE_ID ) )? ( (lv_url_2_0= RULE_STRING ) ) (otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'probability' otherlv_7= ':' ( (lv_proprobabilitePercent_8_0= RULE_INT ) ) )? (otherlv_9= 'duration' otherlv_10= ':' ( (lv_dureeSeconde_11_0= RULE_INT ) ) )? ) ;
    public final EObject ruleVideoSeq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token lv_url_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_proprobabilitePercent_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_dureeSeconde_11_0=null;

         enterRule(); 
            
        try {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:335:28: ( (otherlv_0= 'videoseq' ( (lv_id_1_0= RULE_ID ) )? ( (lv_url_2_0= RULE_STRING ) ) (otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'probability' otherlv_7= ':' ( (lv_proprobabilitePercent_8_0= RULE_INT ) ) )? (otherlv_9= 'duration' otherlv_10= ':' ( (lv_dureeSeconde_11_0= RULE_INT ) ) )? ) )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:336:1: (otherlv_0= 'videoseq' ( (lv_id_1_0= RULE_ID ) )? ( (lv_url_2_0= RULE_STRING ) ) (otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'probability' otherlv_7= ':' ( (lv_proprobabilitePercent_8_0= RULE_INT ) ) )? (otherlv_9= 'duration' otherlv_10= ':' ( (lv_dureeSeconde_11_0= RULE_INT ) ) )? )
            {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:336:1: (otherlv_0= 'videoseq' ( (lv_id_1_0= RULE_ID ) )? ( (lv_url_2_0= RULE_STRING ) ) (otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'probability' otherlv_7= ':' ( (lv_proprobabilitePercent_8_0= RULE_INT ) ) )? (otherlv_9= 'duration' otherlv_10= ':' ( (lv_dureeSeconde_11_0= RULE_INT ) ) )? )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:336:3: otherlv_0= 'videoseq' ( (lv_id_1_0= RULE_ID ) )? ( (lv_url_2_0= RULE_STRING ) ) (otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'probability' otherlv_7= ':' ( (lv_proprobabilitePercent_8_0= RULE_INT ) ) )? (otherlv_9= 'duration' otherlv_10= ':' ( (lv_dureeSeconde_11_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleVideoSeq756); 

                	newLeafNode(otherlv_0, grammarAccess.getVideoSeqAccess().getVideoseqKeyword_0());
                
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:340:1: ( (lv_id_1_0= RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:341:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:341:1: (lv_id_1_0= RULE_ID )
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:342:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVideoSeq773); 

                    			newLeafNode(lv_id_1_0, grammarAccess.getVideoSeqAccess().getIdIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVideoSeqRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:358:3: ( (lv_url_2_0= RULE_STRING ) )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:359:1: (lv_url_2_0= RULE_STRING )
            {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:359:1: (lv_url_2_0= RULE_STRING )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:360:3: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVideoSeq796); 

            			newLeafNode(lv_url_2_0, grammarAccess.getVideoSeqAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVideoSeqRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"url",
                    		lv_url_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:376:2: (otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:376:4: otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleVideoSeq814); 

                        	newLeafNode(otherlv_3, grammarAccess.getVideoSeqAccess().getDescriptionKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleVideoSeq826); 

                        	newLeafNode(otherlv_4, grammarAccess.getVideoSeqAccess().getColonKeyword_3_1());
                        
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:384:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:385:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:385:1: (lv_description_5_0= RULE_STRING )
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:386:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVideoSeq843); 

                    			newLeafNode(lv_description_5_0, grammarAccess.getVideoSeqAccess().getDescriptionSTRINGTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVideoSeqRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:402:4: (otherlv_6= 'probability' otherlv_7= ':' ( (lv_proprobabilitePercent_8_0= RULE_INT ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:402:6: otherlv_6= 'probability' otherlv_7= ':' ( (lv_proprobabilitePercent_8_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleVideoSeq863); 

                        	newLeafNode(otherlv_6, grammarAccess.getVideoSeqAccess().getProbabilityKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleVideoSeq875); 

                        	newLeafNode(otherlv_7, grammarAccess.getVideoSeqAccess().getColonKeyword_4_1());
                        
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:410:1: ( (lv_proprobabilitePercent_8_0= RULE_INT ) )
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:411:1: (lv_proprobabilitePercent_8_0= RULE_INT )
                    {
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:411:1: (lv_proprobabilitePercent_8_0= RULE_INT )
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:412:3: lv_proprobabilitePercent_8_0= RULE_INT
                    {
                    lv_proprobabilitePercent_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVideoSeq892); 

                    			newLeafNode(lv_proprobabilitePercent_8_0, grammarAccess.getVideoSeqAccess().getProprobabilitePercentINTTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVideoSeqRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"proprobabilitePercent",
                            		lv_proprobabilitePercent_8_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:428:4: (otherlv_9= 'duration' otherlv_10= ':' ( (lv_dureeSeconde_11_0= RULE_INT ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:428:6: otherlv_9= 'duration' otherlv_10= ':' ( (lv_dureeSeconde_11_0= RULE_INT ) )
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleVideoSeq912); 

                        	newLeafNode(otherlv_9, grammarAccess.getVideoSeqAccess().getDurationKeyword_5_0());
                        
                    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleVideoSeq924); 

                        	newLeafNode(otherlv_10, grammarAccess.getVideoSeqAccess().getColonKeyword_5_1());
                        
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:436:1: ( (lv_dureeSeconde_11_0= RULE_INT ) )
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:437:1: (lv_dureeSeconde_11_0= RULE_INT )
                    {
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:437:1: (lv_dureeSeconde_11_0= RULE_INT )
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:438:3: lv_dureeSeconde_11_0= RULE_INT
                    {
                    lv_dureeSeconde_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVideoSeq941); 

                    			newLeafNode(lv_dureeSeconde_11_0, grammarAccess.getVideoSeqAccess().getDureeSecondeINTTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVideoSeqRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"dureeSeconde",
                            		lv_dureeSeconde_11_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVideoSeq"


    // $ANTLR start "entryRuleVideoSeqMandatory"
    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:462:1: entryRuleVideoSeqMandatory returns [EObject current=null] : iv_ruleVideoSeqMandatory= ruleVideoSeqMandatory EOF ;
    public final EObject entryRuleVideoSeqMandatory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoSeqMandatory = null;


        try {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:463:2: (iv_ruleVideoSeqMandatory= ruleVideoSeqMandatory EOF )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:464:2: iv_ruleVideoSeqMandatory= ruleVideoSeqMandatory EOF
            {
             newCompositeNode(grammarAccess.getVideoSeqMandatoryRule()); 
            pushFollow(FOLLOW_ruleVideoSeqMandatory_in_entryRuleVideoSeqMandatory984);
            iv_ruleVideoSeqMandatory=ruleVideoSeqMandatory();

            state._fsp--;

             current =iv_ruleVideoSeqMandatory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoSeqMandatory994); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVideoSeqMandatory"


    // $ANTLR start "ruleVideoSeqMandatory"
    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:471:1: ruleVideoSeqMandatory returns [EObject current=null] : (otherlv_0= 'videoseq' ( (lv_id_1_0= RULE_ID ) )? ( (lv_url_2_0= RULE_STRING ) ) (otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'duration' otherlv_7= ':' ( (lv_dureeSeconde_8_0= RULE_INT ) ) )? ) ;
    public final EObject ruleVideoSeqMandatory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token lv_url_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_dureeSeconde_8_0=null;

         enterRule(); 
            
        try {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:474:28: ( (otherlv_0= 'videoseq' ( (lv_id_1_0= RULE_ID ) )? ( (lv_url_2_0= RULE_STRING ) ) (otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'duration' otherlv_7= ':' ( (lv_dureeSeconde_8_0= RULE_INT ) ) )? ) )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:475:1: (otherlv_0= 'videoseq' ( (lv_id_1_0= RULE_ID ) )? ( (lv_url_2_0= RULE_STRING ) ) (otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'duration' otherlv_7= ':' ( (lv_dureeSeconde_8_0= RULE_INT ) ) )? )
            {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:475:1: (otherlv_0= 'videoseq' ( (lv_id_1_0= RULE_ID ) )? ( (lv_url_2_0= RULE_STRING ) ) (otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'duration' otherlv_7= ':' ( (lv_dureeSeconde_8_0= RULE_INT ) ) )? )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:475:3: otherlv_0= 'videoseq' ( (lv_id_1_0= RULE_ID ) )? ( (lv_url_2_0= RULE_STRING ) ) (otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'duration' otherlv_7= ':' ( (lv_dureeSeconde_8_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleVideoSeqMandatory1031); 

                	newLeafNode(otherlv_0, grammarAccess.getVideoSeqMandatoryAccess().getVideoseqKeyword_0());
                
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:479:1: ( (lv_id_1_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:480:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:480:1: (lv_id_1_0= RULE_ID )
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:481:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVideoSeqMandatory1048); 

                    			newLeafNode(lv_id_1_0, grammarAccess.getVideoSeqMandatoryAccess().getIdIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVideoSeqMandatoryRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:497:3: ( (lv_url_2_0= RULE_STRING ) )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:498:1: (lv_url_2_0= RULE_STRING )
            {
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:498:1: (lv_url_2_0= RULE_STRING )
            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:499:3: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVideoSeqMandatory1071); 

            			newLeafNode(lv_url_2_0, grammarAccess.getVideoSeqMandatoryAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVideoSeqMandatoryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"url",
                    		lv_url_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:515:2: (otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:515:4: otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleVideoSeqMandatory1089); 

                        	newLeafNode(otherlv_3, grammarAccess.getVideoSeqMandatoryAccess().getDescriptionKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleVideoSeqMandatory1101); 

                        	newLeafNode(otherlv_4, grammarAccess.getVideoSeqMandatoryAccess().getColonKeyword_3_1());
                        
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:523:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:524:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:524:1: (lv_description_5_0= RULE_STRING )
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:525:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVideoSeqMandatory1118); 

                    			newLeafNode(lv_description_5_0, grammarAccess.getVideoSeqMandatoryAccess().getDescriptionSTRINGTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVideoSeqMandatoryRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:541:4: (otherlv_6= 'duration' otherlv_7= ':' ( (lv_dureeSeconde_8_0= RULE_INT ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:541:6: otherlv_6= 'duration' otherlv_7= ':' ( (lv_dureeSeconde_8_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleVideoSeqMandatory1138); 

                        	newLeafNode(otherlv_6, grammarAccess.getVideoSeqMandatoryAccess().getDurationKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleVideoSeqMandatory1150); 

                        	newLeafNode(otherlv_7, grammarAccess.getVideoSeqMandatoryAccess().getColonKeyword_4_1());
                        
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:549:1: ( (lv_dureeSeconde_8_0= RULE_INT ) )
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:550:1: (lv_dureeSeconde_8_0= RULE_INT )
                    {
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:550:1: (lv_dureeSeconde_8_0= RULE_INT )
                    // ../fr.istic.VideoGen/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVideoGen.g:551:3: lv_dureeSeconde_8_0= RULE_INT
                    {
                    lv_dureeSeconde_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVideoSeqMandatory1167); 

                    			newLeafNode(lv_dureeSeconde_8_0, grammarAccess.getVideoSeqMandatoryAccess().getDureeSecondeINTTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVideoSeqMandatoryRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"dureeSeconde",
                            		lv_dureeSeconde_8_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVideoSeqMandatory"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleVideoGen_in_entryRuleVideoGen75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoGen85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleVideoGen122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleVideoGen134 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_ruleVideo_in_ruleVideoGen155 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_13_in_ruleVideoGen168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideo_in_entryRuleVideo204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideo214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryRule_in_ruleVideo261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionnalRule_in_ruleVideo288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternativeRule_in_ruleVideo315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryRule_in_entryRuleMandatoryRule350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatoryRule360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleMandatoryRule397 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleVideoSeqMandatory_in_ruleMandatoryRule418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionnalRule_in_entryRuleOptionnalRule454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionnalRule464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOptionnalRule501 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_ruleOptionnalRule522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternativeRule_in_entryRuleAlternativeRule558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternativeRule568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAlternativeRule605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlternativeRule622 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAlternativeRule639 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_ruleAlternativeRule660 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleAlternativeRule673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_entryRuleVideoSeq709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoSeq719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleVideoSeq756 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVideoSeq773 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVideoSeq796 = new BitSet(new long[]{0x0000000000340002L});
    public static final BitSet FOLLOW_18_in_ruleVideoSeq814 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVideoSeq826 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVideoSeq843 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_20_in_ruleVideoSeq863 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVideoSeq875 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVideoSeq892 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleVideoSeq912 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVideoSeq924 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVideoSeq941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoSeqMandatory_in_entryRuleVideoSeqMandatory984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoSeqMandatory994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleVideoSeqMandatory1031 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVideoSeqMandatory1048 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVideoSeqMandatory1071 = new BitSet(new long[]{0x0000000000240002L});
    public static final BitSet FOLLOW_18_in_ruleVideoSeqMandatory1089 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVideoSeqMandatory1101 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVideoSeqMandatory1118 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleVideoSeqMandatory1138 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVideoSeqMandatory1150 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVideoSeqMandatory1167 = new BitSet(new long[]{0x0000000000000002L});

}