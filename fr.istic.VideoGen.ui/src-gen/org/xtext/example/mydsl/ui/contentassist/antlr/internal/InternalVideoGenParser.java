package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.VideoGenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoGenParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g"; }


     
     	private VideoGenGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(VideoGenGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleVideoGen"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:60:1: entryRuleVideoGen : ruleVideoGen EOF ;
    public final void entryRuleVideoGen() throws RecognitionException {
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:61:1: ( ruleVideoGen EOF )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:62:1: ruleVideoGen EOF
            {
             before(grammarAccess.getVideoGenRule()); 
            pushFollow(FOLLOW_ruleVideoGen_in_entryRuleVideoGen61);
            ruleVideoGen();

            state._fsp--;

             after(grammarAccess.getVideoGenRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoGen68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVideoGen"


    // $ANTLR start "ruleVideoGen"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:69:1: ruleVideoGen : ( ( rule__VideoGen__Group__0 ) ) ;
    public final void ruleVideoGen() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:73:2: ( ( ( rule__VideoGen__Group__0 ) ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:74:1: ( ( rule__VideoGen__Group__0 ) )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:74:1: ( ( rule__VideoGen__Group__0 ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:75:1: ( rule__VideoGen__Group__0 )
            {
             before(grammarAccess.getVideoGenAccess().getGroup()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:76:1: ( rule__VideoGen__Group__0 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:76:2: rule__VideoGen__Group__0
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__0_in_ruleVideoGen94);
            rule__VideoGen__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoGenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideoGen"


    // $ANTLR start "entryRuleVideo"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:88:1: entryRuleVideo : ruleVideo EOF ;
    public final void entryRuleVideo() throws RecognitionException {
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:89:1: ( ruleVideo EOF )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:90:1: ruleVideo EOF
            {
             before(grammarAccess.getVideoRule()); 
            pushFollow(FOLLOW_ruleVideo_in_entryRuleVideo121);
            ruleVideo();

            state._fsp--;

             after(grammarAccess.getVideoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideo128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVideo"


    // $ANTLR start "ruleVideo"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:97:1: ruleVideo : ( ( rule__Video__Alternatives ) ) ;
    public final void ruleVideo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:101:2: ( ( ( rule__Video__Alternatives ) ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:102:1: ( ( rule__Video__Alternatives ) )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:102:1: ( ( rule__Video__Alternatives ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:103:1: ( rule__Video__Alternatives )
            {
             before(grammarAccess.getVideoAccess().getAlternatives()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:104:1: ( rule__Video__Alternatives )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:104:2: rule__Video__Alternatives
            {
            pushFollow(FOLLOW_rule__Video__Alternatives_in_ruleVideo154);
            rule__Video__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleMandatoryRule"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:116:1: entryRuleMandatoryRule : ruleMandatoryRule EOF ;
    public final void entryRuleMandatoryRule() throws RecognitionException {
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:117:1: ( ruleMandatoryRule EOF )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:118:1: ruleMandatoryRule EOF
            {
             before(grammarAccess.getMandatoryRuleRule()); 
            pushFollow(FOLLOW_ruleMandatoryRule_in_entryRuleMandatoryRule181);
            ruleMandatoryRule();

            state._fsp--;

             after(grammarAccess.getMandatoryRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatoryRule188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMandatoryRule"


    // $ANTLR start "ruleMandatoryRule"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:125:1: ruleMandatoryRule : ( ( rule__MandatoryRule__Group__0 ) ) ;
    public final void ruleMandatoryRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:129:2: ( ( ( rule__MandatoryRule__Group__0 ) ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:130:1: ( ( rule__MandatoryRule__Group__0 ) )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:130:1: ( ( rule__MandatoryRule__Group__0 ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:131:1: ( rule__MandatoryRule__Group__0 )
            {
             before(grammarAccess.getMandatoryRuleAccess().getGroup()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:132:1: ( rule__MandatoryRule__Group__0 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:132:2: rule__MandatoryRule__Group__0
            {
            pushFollow(FOLLOW_rule__MandatoryRule__Group__0_in_ruleMandatoryRule214);
            rule__MandatoryRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMandatoryRule"


    // $ANTLR start "entryRuleOptionnalRule"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:144:1: entryRuleOptionnalRule : ruleOptionnalRule EOF ;
    public final void entryRuleOptionnalRule() throws RecognitionException {
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:145:1: ( ruleOptionnalRule EOF )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:146:1: ruleOptionnalRule EOF
            {
             before(grammarAccess.getOptionnalRuleRule()); 
            pushFollow(FOLLOW_ruleOptionnalRule_in_entryRuleOptionnalRule241);
            ruleOptionnalRule();

            state._fsp--;

             after(grammarAccess.getOptionnalRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionnalRule248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptionnalRule"


    // $ANTLR start "ruleOptionnalRule"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:153:1: ruleOptionnalRule : ( ( rule__OptionnalRule__Group__0 ) ) ;
    public final void ruleOptionnalRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:157:2: ( ( ( rule__OptionnalRule__Group__0 ) ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:158:1: ( ( rule__OptionnalRule__Group__0 ) )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:158:1: ( ( rule__OptionnalRule__Group__0 ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:159:1: ( rule__OptionnalRule__Group__0 )
            {
             before(grammarAccess.getOptionnalRuleAccess().getGroup()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:160:1: ( rule__OptionnalRule__Group__0 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:160:2: rule__OptionnalRule__Group__0
            {
            pushFollow(FOLLOW_rule__OptionnalRule__Group__0_in_ruleOptionnalRule274);
            rule__OptionnalRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionnalRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptionnalRule"


    // $ANTLR start "entryRuleAlternativeRule"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:172:1: entryRuleAlternativeRule : ruleAlternativeRule EOF ;
    public final void entryRuleAlternativeRule() throws RecognitionException {
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:173:1: ( ruleAlternativeRule EOF )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:174:1: ruleAlternativeRule EOF
            {
             before(grammarAccess.getAlternativeRuleRule()); 
            pushFollow(FOLLOW_ruleAlternativeRule_in_entryRuleAlternativeRule301);
            ruleAlternativeRule();

            state._fsp--;

             after(grammarAccess.getAlternativeRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternativeRule308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlternativeRule"


    // $ANTLR start "ruleAlternativeRule"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:181:1: ruleAlternativeRule : ( ( rule__AlternativeRule__Group__0 ) ) ;
    public final void ruleAlternativeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:185:2: ( ( ( rule__AlternativeRule__Group__0 ) ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:186:1: ( ( rule__AlternativeRule__Group__0 ) )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:186:1: ( ( rule__AlternativeRule__Group__0 ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:187:1: ( rule__AlternativeRule__Group__0 )
            {
             before(grammarAccess.getAlternativeRuleAccess().getGroup()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:188:1: ( rule__AlternativeRule__Group__0 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:188:2: rule__AlternativeRule__Group__0
            {
            pushFollow(FOLLOW_rule__AlternativeRule__Group__0_in_ruleAlternativeRule334);
            rule__AlternativeRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlternativeRule"


    // $ANTLR start "entryRuleVideoSeq"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:200:1: entryRuleVideoSeq : ruleVideoSeq EOF ;
    public final void entryRuleVideoSeq() throws RecognitionException {
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:201:1: ( ruleVideoSeq EOF )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:202:1: ruleVideoSeq EOF
            {
             before(grammarAccess.getVideoSeqRule()); 
            pushFollow(FOLLOW_ruleVideoSeq_in_entryRuleVideoSeq361);
            ruleVideoSeq();

            state._fsp--;

             after(grammarAccess.getVideoSeqRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoSeq368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVideoSeq"


    // $ANTLR start "ruleVideoSeq"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:209:1: ruleVideoSeq : ( ( rule__VideoSeq__Group__0 ) ) ;
    public final void ruleVideoSeq() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:213:2: ( ( ( rule__VideoSeq__Group__0 ) ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:214:1: ( ( rule__VideoSeq__Group__0 ) )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:214:1: ( ( rule__VideoSeq__Group__0 ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:215:1: ( rule__VideoSeq__Group__0 )
            {
             before(grammarAccess.getVideoSeqAccess().getGroup()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:216:1: ( rule__VideoSeq__Group__0 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:216:2: rule__VideoSeq__Group__0
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group__0_in_ruleVideoSeq394);
            rule__VideoSeq__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoSeqAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideoSeq"


    // $ANTLR start "entryRuleVideoSeqMandatory"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:228:1: entryRuleVideoSeqMandatory : ruleVideoSeqMandatory EOF ;
    public final void entryRuleVideoSeqMandatory() throws RecognitionException {
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:229:1: ( ruleVideoSeqMandatory EOF )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:230:1: ruleVideoSeqMandatory EOF
            {
             before(grammarAccess.getVideoSeqMandatoryRule()); 
            pushFollow(FOLLOW_ruleVideoSeqMandatory_in_entryRuleVideoSeqMandatory421);
            ruleVideoSeqMandatory();

            state._fsp--;

             after(grammarAccess.getVideoSeqMandatoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoSeqMandatory428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVideoSeqMandatory"


    // $ANTLR start "ruleVideoSeqMandatory"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:237:1: ruleVideoSeqMandatory : ( ( rule__VideoSeqMandatory__Group__0 ) ) ;
    public final void ruleVideoSeqMandatory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:241:2: ( ( ( rule__VideoSeqMandatory__Group__0 ) ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:242:1: ( ( rule__VideoSeqMandatory__Group__0 ) )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:242:1: ( ( rule__VideoSeqMandatory__Group__0 ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:243:1: ( rule__VideoSeqMandatory__Group__0 )
            {
             before(grammarAccess.getVideoSeqMandatoryAccess().getGroup()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:244:1: ( rule__VideoSeqMandatory__Group__0 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:244:2: rule__VideoSeqMandatory__Group__0
            {
            pushFollow(FOLLOW_rule__VideoSeqMandatory__Group__0_in_ruleVideoSeqMandatory454);
            rule__VideoSeqMandatory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoSeqMandatoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideoSeqMandatory"


    // $ANTLR start "rule__Video__Alternatives"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:256:1: rule__Video__Alternatives : ( ( ruleMandatoryRule ) | ( ruleOptionnalRule ) | ( ruleAlternativeRule ) );
    public final void rule__Video__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:260:1: ( ( ruleMandatoryRule ) | ( ruleOptionnalRule ) | ( ruleAlternativeRule ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 16:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:261:1: ( ruleMandatoryRule )
                    {
                    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:261:1: ( ruleMandatoryRule )
                    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:262:1: ruleMandatoryRule
                    {
                     before(grammarAccess.getVideoAccess().getMandatoryRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMandatoryRule_in_rule__Video__Alternatives490);
                    ruleMandatoryRule();

                    state._fsp--;

                     after(grammarAccess.getVideoAccess().getMandatoryRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:267:6: ( ruleOptionnalRule )
                    {
                    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:267:6: ( ruleOptionnalRule )
                    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:268:1: ruleOptionnalRule
                    {
                     before(grammarAccess.getVideoAccess().getOptionnalRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOptionnalRule_in_rule__Video__Alternatives507);
                    ruleOptionnalRule();

                    state._fsp--;

                     after(grammarAccess.getVideoAccess().getOptionnalRuleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:273:6: ( ruleAlternativeRule )
                    {
                    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:273:6: ( ruleAlternativeRule )
                    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:274:1: ruleAlternativeRule
                    {
                     before(grammarAccess.getVideoAccess().getAlternativeRuleParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAlternativeRule_in_rule__Video__Alternatives524);
                    ruleAlternativeRule();

                    state._fsp--;

                     after(grammarAccess.getVideoAccess().getAlternativeRuleParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Alternatives"


    // $ANTLR start "rule__VideoGen__Group__0"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:286:1: rule__VideoGen__Group__0 : rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1 ;
    public final void rule__VideoGen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:290:1: ( rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:291:2: rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__0__Impl_in_rule__VideoGen__Group__0554);
            rule__VideoGen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGen__Group__1_in_rule__VideoGen__Group__0557);
            rule__VideoGen__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__0"


    // $ANTLR start "rule__VideoGen__Group__0__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:298:1: rule__VideoGen__Group__0__Impl : ( 'VideoGen' ) ;
    public final void rule__VideoGen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:302:1: ( ( 'VideoGen' ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:303:1: ( 'VideoGen' )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:303:1: ( 'VideoGen' )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:304:1: 'VideoGen'
            {
             before(grammarAccess.getVideoGenAccess().getVideoGenKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__VideoGen__Group__0__Impl585); 
             after(grammarAccess.getVideoGenAccess().getVideoGenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__0__Impl"


    // $ANTLR start "rule__VideoGen__Group__1"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:317:1: rule__VideoGen__Group__1 : rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2 ;
    public final void rule__VideoGen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:321:1: ( rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:322:2: rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__1__Impl_in_rule__VideoGen__Group__1616);
            rule__VideoGen__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGen__Group__2_in_rule__VideoGen__Group__1619);
            rule__VideoGen__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__1"


    // $ANTLR start "rule__VideoGen__Group__1__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:329:1: rule__VideoGen__Group__1__Impl : ( '{' ) ;
    public final void rule__VideoGen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:333:1: ( ( '{' ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:334:1: ( '{' )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:334:1: ( '{' )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:335:1: '{'
            {
             before(grammarAccess.getVideoGenAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__VideoGen__Group__1__Impl647); 
             after(grammarAccess.getVideoGenAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__1__Impl"


    // $ANTLR start "rule__VideoGen__Group__2"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:348:1: rule__VideoGen__Group__2 : rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3 ;
    public final void rule__VideoGen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:352:1: ( rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:353:2: rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__2__Impl_in_rule__VideoGen__Group__2678);
            rule__VideoGen__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGen__Group__3_in_rule__VideoGen__Group__2681);
            rule__VideoGen__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__2"


    // $ANTLR start "rule__VideoGen__Group__2__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:360:1: rule__VideoGen__Group__2__Impl : ( ( rule__VideoGen__VideosAssignment_2 )* ) ;
    public final void rule__VideoGen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:364:1: ( ( ( rule__VideoGen__VideosAssignment_2 )* ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:365:1: ( ( rule__VideoGen__VideosAssignment_2 )* )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:365:1: ( ( rule__VideoGen__VideosAssignment_2 )* )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:366:1: ( rule__VideoGen__VideosAssignment_2 )*
            {
             before(grammarAccess.getVideoGenAccess().getVideosAssignment_2()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:367:1: ( rule__VideoGen__VideosAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=14 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:367:2: rule__VideoGen__VideosAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__VideoGen__VideosAssignment_2_in_rule__VideoGen__Group__2__Impl708);
            	    rule__VideoGen__VideosAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getVideoGenAccess().getVideosAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__2__Impl"


    // $ANTLR start "rule__VideoGen__Group__3"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:377:1: rule__VideoGen__Group__3 : rule__VideoGen__Group__3__Impl ;
    public final void rule__VideoGen__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:381:1: ( rule__VideoGen__Group__3__Impl )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:382:2: rule__VideoGen__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__3__Impl_in_rule__VideoGen__Group__3739);
            rule__VideoGen__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__3"


    // $ANTLR start "rule__VideoGen__Group__3__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:388:1: rule__VideoGen__Group__3__Impl : ( '}' ) ;
    public final void rule__VideoGen__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:392:1: ( ( '}' ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:393:1: ( '}' )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:393:1: ( '}' )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:394:1: '}'
            {
             before(grammarAccess.getVideoGenAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__VideoGen__Group__3__Impl767); 
             after(grammarAccess.getVideoGenAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__3__Impl"


    // $ANTLR start "rule__MandatoryRule__Group__0"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:415:1: rule__MandatoryRule__Group__0 : rule__MandatoryRule__Group__0__Impl rule__MandatoryRule__Group__1 ;
    public final void rule__MandatoryRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:419:1: ( rule__MandatoryRule__Group__0__Impl rule__MandatoryRule__Group__1 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:420:2: rule__MandatoryRule__Group__0__Impl rule__MandatoryRule__Group__1
            {
            pushFollow(FOLLOW_rule__MandatoryRule__Group__0__Impl_in_rule__MandatoryRule__Group__0806);
            rule__MandatoryRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MandatoryRule__Group__1_in_rule__MandatoryRule__Group__0809);
            rule__MandatoryRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryRule__Group__0"


    // $ANTLR start "rule__MandatoryRule__Group__0__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:427:1: rule__MandatoryRule__Group__0__Impl : ( 'mandatory' ) ;
    public final void rule__MandatoryRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:431:1: ( ( 'mandatory' ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:432:1: ( 'mandatory' )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:432:1: ( 'mandatory' )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:433:1: 'mandatory'
            {
             before(grammarAccess.getMandatoryRuleAccess().getMandatoryKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__MandatoryRule__Group__0__Impl837); 
             after(grammarAccess.getMandatoryRuleAccess().getMandatoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryRule__Group__0__Impl"


    // $ANTLR start "rule__MandatoryRule__Group__1"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:446:1: rule__MandatoryRule__Group__1 : rule__MandatoryRule__Group__1__Impl ;
    public final void rule__MandatoryRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:450:1: ( rule__MandatoryRule__Group__1__Impl )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:451:2: rule__MandatoryRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MandatoryRule__Group__1__Impl_in_rule__MandatoryRule__Group__1868);
            rule__MandatoryRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryRule__Group__1"


    // $ANTLR start "rule__MandatoryRule__Group__1__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:457:1: rule__MandatoryRule__Group__1__Impl : ( ( rule__MandatoryRule__SeqAssignment_1 ) ) ;
    public final void rule__MandatoryRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:461:1: ( ( ( rule__MandatoryRule__SeqAssignment_1 ) ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:462:1: ( ( rule__MandatoryRule__SeqAssignment_1 ) )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:462:1: ( ( rule__MandatoryRule__SeqAssignment_1 ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:463:1: ( rule__MandatoryRule__SeqAssignment_1 )
            {
             before(grammarAccess.getMandatoryRuleAccess().getSeqAssignment_1()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:464:1: ( rule__MandatoryRule__SeqAssignment_1 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:464:2: rule__MandatoryRule__SeqAssignment_1
            {
            pushFollow(FOLLOW_rule__MandatoryRule__SeqAssignment_1_in_rule__MandatoryRule__Group__1__Impl895);
            rule__MandatoryRule__SeqAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryRuleAccess().getSeqAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryRule__Group__1__Impl"


    // $ANTLR start "rule__OptionnalRule__Group__0"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:478:1: rule__OptionnalRule__Group__0 : rule__OptionnalRule__Group__0__Impl rule__OptionnalRule__Group__1 ;
    public final void rule__OptionnalRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:482:1: ( rule__OptionnalRule__Group__0__Impl rule__OptionnalRule__Group__1 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:483:2: rule__OptionnalRule__Group__0__Impl rule__OptionnalRule__Group__1
            {
            pushFollow(FOLLOW_rule__OptionnalRule__Group__0__Impl_in_rule__OptionnalRule__Group__0929);
            rule__OptionnalRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionnalRule__Group__1_in_rule__OptionnalRule__Group__0932);
            rule__OptionnalRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionnalRule__Group__0"


    // $ANTLR start "rule__OptionnalRule__Group__0__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:490:1: rule__OptionnalRule__Group__0__Impl : ( 'optional' ) ;
    public final void rule__OptionnalRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:494:1: ( ( 'optional' ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:495:1: ( 'optional' )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:495:1: ( 'optional' )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:496:1: 'optional'
            {
             before(grammarAccess.getOptionnalRuleAccess().getOptionalKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__OptionnalRule__Group__0__Impl960); 
             after(grammarAccess.getOptionnalRuleAccess().getOptionalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionnalRule__Group__0__Impl"


    // $ANTLR start "rule__OptionnalRule__Group__1"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:509:1: rule__OptionnalRule__Group__1 : rule__OptionnalRule__Group__1__Impl ;
    public final void rule__OptionnalRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:513:1: ( rule__OptionnalRule__Group__1__Impl )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:514:2: rule__OptionnalRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OptionnalRule__Group__1__Impl_in_rule__OptionnalRule__Group__1991);
            rule__OptionnalRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionnalRule__Group__1"


    // $ANTLR start "rule__OptionnalRule__Group__1__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:520:1: rule__OptionnalRule__Group__1__Impl : ( ( rule__OptionnalRule__SeqAssignment_1 ) ) ;
    public final void rule__OptionnalRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:524:1: ( ( ( rule__OptionnalRule__SeqAssignment_1 ) ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:525:1: ( ( rule__OptionnalRule__SeqAssignment_1 ) )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:525:1: ( ( rule__OptionnalRule__SeqAssignment_1 ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:526:1: ( rule__OptionnalRule__SeqAssignment_1 )
            {
             before(grammarAccess.getOptionnalRuleAccess().getSeqAssignment_1()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:527:1: ( rule__OptionnalRule__SeqAssignment_1 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:527:2: rule__OptionnalRule__SeqAssignment_1
            {
            pushFollow(FOLLOW_rule__OptionnalRule__SeqAssignment_1_in_rule__OptionnalRule__Group__1__Impl1018);
            rule__OptionnalRule__SeqAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionnalRuleAccess().getSeqAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionnalRule__Group__1__Impl"


    // $ANTLR start "rule__AlternativeRule__Group__0"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:541:1: rule__AlternativeRule__Group__0 : rule__AlternativeRule__Group__0__Impl rule__AlternativeRule__Group__1 ;
    public final void rule__AlternativeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:545:1: ( rule__AlternativeRule__Group__0__Impl rule__AlternativeRule__Group__1 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:546:2: rule__AlternativeRule__Group__0__Impl rule__AlternativeRule__Group__1
            {
            pushFollow(FOLLOW_rule__AlternativeRule__Group__0__Impl_in_rule__AlternativeRule__Group__01052);
            rule__AlternativeRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeRule__Group__1_in_rule__AlternativeRule__Group__01055);
            rule__AlternativeRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeRule__Group__0"


    // $ANTLR start "rule__AlternativeRule__Group__0__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:553:1: rule__AlternativeRule__Group__0__Impl : ( 'alternatives' ) ;
    public final void rule__AlternativeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:557:1: ( ( 'alternatives' ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:558:1: ( 'alternatives' )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:558:1: ( 'alternatives' )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:559:1: 'alternatives'
            {
             before(grammarAccess.getAlternativeRuleAccess().getAlternativesKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__AlternativeRule__Group__0__Impl1083); 
             after(grammarAccess.getAlternativeRuleAccess().getAlternativesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeRule__Group__0__Impl"


    // $ANTLR start "rule__AlternativeRule__Group__1"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:572:1: rule__AlternativeRule__Group__1 : rule__AlternativeRule__Group__1__Impl rule__AlternativeRule__Group__2 ;
    public final void rule__AlternativeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:576:1: ( rule__AlternativeRule__Group__1__Impl rule__AlternativeRule__Group__2 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:577:2: rule__AlternativeRule__Group__1__Impl rule__AlternativeRule__Group__2
            {
            pushFollow(FOLLOW_rule__AlternativeRule__Group__1__Impl_in_rule__AlternativeRule__Group__11114);
            rule__AlternativeRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeRule__Group__2_in_rule__AlternativeRule__Group__11117);
            rule__AlternativeRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeRule__Group__1"


    // $ANTLR start "rule__AlternativeRule__Group__1__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:584:1: rule__AlternativeRule__Group__1__Impl : ( ( rule__AlternativeRule__IdAssignment_1 ) ) ;
    public final void rule__AlternativeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:588:1: ( ( ( rule__AlternativeRule__IdAssignment_1 ) ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:589:1: ( ( rule__AlternativeRule__IdAssignment_1 ) )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:589:1: ( ( rule__AlternativeRule__IdAssignment_1 ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:590:1: ( rule__AlternativeRule__IdAssignment_1 )
            {
             before(grammarAccess.getAlternativeRuleAccess().getIdAssignment_1()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:591:1: ( rule__AlternativeRule__IdAssignment_1 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:591:2: rule__AlternativeRule__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__AlternativeRule__IdAssignment_1_in_rule__AlternativeRule__Group__1__Impl1144);
            rule__AlternativeRule__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeRuleAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeRule__Group__1__Impl"


    // $ANTLR start "rule__AlternativeRule__Group__2"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:601:1: rule__AlternativeRule__Group__2 : rule__AlternativeRule__Group__2__Impl rule__AlternativeRule__Group__3 ;
    public final void rule__AlternativeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:605:1: ( rule__AlternativeRule__Group__2__Impl rule__AlternativeRule__Group__3 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:606:2: rule__AlternativeRule__Group__2__Impl rule__AlternativeRule__Group__3
            {
            pushFollow(FOLLOW_rule__AlternativeRule__Group__2__Impl_in_rule__AlternativeRule__Group__21174);
            rule__AlternativeRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeRule__Group__3_in_rule__AlternativeRule__Group__21177);
            rule__AlternativeRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeRule__Group__2"


    // $ANTLR start "rule__AlternativeRule__Group__2__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:613:1: rule__AlternativeRule__Group__2__Impl : ( '{' ) ;
    public final void rule__AlternativeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:617:1: ( ( '{' ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:618:1: ( '{' )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:618:1: ( '{' )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:619:1: '{'
            {
             before(grammarAccess.getAlternativeRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__AlternativeRule__Group__2__Impl1205); 
             after(grammarAccess.getAlternativeRuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeRule__Group__2__Impl"


    // $ANTLR start "rule__AlternativeRule__Group__3"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:632:1: rule__AlternativeRule__Group__3 : rule__AlternativeRule__Group__3__Impl rule__AlternativeRule__Group__4 ;
    public final void rule__AlternativeRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:636:1: ( rule__AlternativeRule__Group__3__Impl rule__AlternativeRule__Group__4 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:637:2: rule__AlternativeRule__Group__3__Impl rule__AlternativeRule__Group__4
            {
            pushFollow(FOLLOW_rule__AlternativeRule__Group__3__Impl_in_rule__AlternativeRule__Group__31236);
            rule__AlternativeRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeRule__Group__4_in_rule__AlternativeRule__Group__31239);
            rule__AlternativeRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeRule__Group__3"


    // $ANTLR start "rule__AlternativeRule__Group__3__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:644:1: rule__AlternativeRule__Group__3__Impl : ( ( ( rule__AlternativeRule__AlternatvesAssignment_3 ) ) ( ( rule__AlternativeRule__AlternatvesAssignment_3 )* ) ) ;
    public final void rule__AlternativeRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:648:1: ( ( ( ( rule__AlternativeRule__AlternatvesAssignment_3 ) ) ( ( rule__AlternativeRule__AlternatvesAssignment_3 )* ) ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:649:1: ( ( ( rule__AlternativeRule__AlternatvesAssignment_3 ) ) ( ( rule__AlternativeRule__AlternatvesAssignment_3 )* ) )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:649:1: ( ( ( rule__AlternativeRule__AlternatvesAssignment_3 ) ) ( ( rule__AlternativeRule__AlternatvesAssignment_3 )* ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:650:1: ( ( rule__AlternativeRule__AlternatvesAssignment_3 ) ) ( ( rule__AlternativeRule__AlternatvesAssignment_3 )* )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:650:1: ( ( rule__AlternativeRule__AlternatvesAssignment_3 ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:651:1: ( rule__AlternativeRule__AlternatvesAssignment_3 )
            {
             before(grammarAccess.getAlternativeRuleAccess().getAlternatvesAssignment_3()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:652:1: ( rule__AlternativeRule__AlternatvesAssignment_3 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:652:2: rule__AlternativeRule__AlternatvesAssignment_3
            {
            pushFollow(FOLLOW_rule__AlternativeRule__AlternatvesAssignment_3_in_rule__AlternativeRule__Group__3__Impl1268);
            rule__AlternativeRule__AlternatvesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeRuleAccess().getAlternatvesAssignment_3()); 

            }

            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:655:1: ( ( rule__AlternativeRule__AlternatvesAssignment_3 )* )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:656:1: ( rule__AlternativeRule__AlternatvesAssignment_3 )*
            {
             before(grammarAccess.getAlternativeRuleAccess().getAlternatvesAssignment_3()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:657:1: ( rule__AlternativeRule__AlternatvesAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:657:2: rule__AlternativeRule__AlternatvesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__AlternativeRule__AlternatvesAssignment_3_in_rule__AlternativeRule__Group__3__Impl1280);
            	    rule__AlternativeRule__AlternatvesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getAlternativeRuleAccess().getAlternatvesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeRule__Group__3__Impl"


    // $ANTLR start "rule__AlternativeRule__Group__4"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:668:1: rule__AlternativeRule__Group__4 : rule__AlternativeRule__Group__4__Impl ;
    public final void rule__AlternativeRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:672:1: ( rule__AlternativeRule__Group__4__Impl )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:673:2: rule__AlternativeRule__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AlternativeRule__Group__4__Impl_in_rule__AlternativeRule__Group__41313);
            rule__AlternativeRule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeRule__Group__4"


    // $ANTLR start "rule__AlternativeRule__Group__4__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:679:1: rule__AlternativeRule__Group__4__Impl : ( '}' ) ;
    public final void rule__AlternativeRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:683:1: ( ( '}' ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:684:1: ( '}' )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:684:1: ( '}' )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:685:1: '}'
            {
             before(grammarAccess.getAlternativeRuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__AlternativeRule__Group__4__Impl1341); 
             after(grammarAccess.getAlternativeRuleAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeRule__Group__4__Impl"


    // $ANTLR start "rule__VideoSeq__Group__0"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:708:1: rule__VideoSeq__Group__0 : rule__VideoSeq__Group__0__Impl rule__VideoSeq__Group__1 ;
    public final void rule__VideoSeq__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:712:1: ( rule__VideoSeq__Group__0__Impl rule__VideoSeq__Group__1 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:713:2: rule__VideoSeq__Group__0__Impl rule__VideoSeq__Group__1
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group__0__Impl_in_rule__VideoSeq__Group__01382);
            rule__VideoSeq__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group__1_in_rule__VideoSeq__Group__01385);
            rule__VideoSeq__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__0"


    // $ANTLR start "rule__VideoSeq__Group__0__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:720:1: rule__VideoSeq__Group__0__Impl : ( 'videoseq' ) ;
    public final void rule__VideoSeq__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:724:1: ( ( 'videoseq' ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:725:1: ( 'videoseq' )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:725:1: ( 'videoseq' )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:726:1: 'videoseq'
            {
             before(grammarAccess.getVideoSeqAccess().getVideoseqKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__VideoSeq__Group__0__Impl1413); 
             after(grammarAccess.getVideoSeqAccess().getVideoseqKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__0__Impl"


    // $ANTLR start "rule__VideoSeq__Group__1"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:739:1: rule__VideoSeq__Group__1 : rule__VideoSeq__Group__1__Impl rule__VideoSeq__Group__2 ;
    public final void rule__VideoSeq__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:743:1: ( rule__VideoSeq__Group__1__Impl rule__VideoSeq__Group__2 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:744:2: rule__VideoSeq__Group__1__Impl rule__VideoSeq__Group__2
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group__1__Impl_in_rule__VideoSeq__Group__11444);
            rule__VideoSeq__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group__2_in_rule__VideoSeq__Group__11447);
            rule__VideoSeq__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__1"


    // $ANTLR start "rule__VideoSeq__Group__1__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:751:1: rule__VideoSeq__Group__1__Impl : ( ( rule__VideoSeq__IdAssignment_1 )? ) ;
    public final void rule__VideoSeq__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:755:1: ( ( ( rule__VideoSeq__IdAssignment_1 )? ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:756:1: ( ( rule__VideoSeq__IdAssignment_1 )? )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:756:1: ( ( rule__VideoSeq__IdAssignment_1 )? )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:757:1: ( rule__VideoSeq__IdAssignment_1 )?
            {
             before(grammarAccess.getVideoSeqAccess().getIdAssignment_1()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:758:1: ( rule__VideoSeq__IdAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:758:2: rule__VideoSeq__IdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__VideoSeq__IdAssignment_1_in_rule__VideoSeq__Group__1__Impl1474);
                    rule__VideoSeq__IdAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoSeqAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__1__Impl"


    // $ANTLR start "rule__VideoSeq__Group__2"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:768:1: rule__VideoSeq__Group__2 : rule__VideoSeq__Group__2__Impl rule__VideoSeq__Group__3 ;
    public final void rule__VideoSeq__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:772:1: ( rule__VideoSeq__Group__2__Impl rule__VideoSeq__Group__3 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:773:2: rule__VideoSeq__Group__2__Impl rule__VideoSeq__Group__3
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group__2__Impl_in_rule__VideoSeq__Group__21505);
            rule__VideoSeq__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group__3_in_rule__VideoSeq__Group__21508);
            rule__VideoSeq__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__2"


    // $ANTLR start "rule__VideoSeq__Group__2__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:780:1: rule__VideoSeq__Group__2__Impl : ( ( rule__VideoSeq__UrlAssignment_2 ) ) ;
    public final void rule__VideoSeq__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:784:1: ( ( ( rule__VideoSeq__UrlAssignment_2 ) ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:785:1: ( ( rule__VideoSeq__UrlAssignment_2 ) )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:785:1: ( ( rule__VideoSeq__UrlAssignment_2 ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:786:1: ( rule__VideoSeq__UrlAssignment_2 )
            {
             before(grammarAccess.getVideoSeqAccess().getUrlAssignment_2()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:787:1: ( rule__VideoSeq__UrlAssignment_2 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:787:2: rule__VideoSeq__UrlAssignment_2
            {
            pushFollow(FOLLOW_rule__VideoSeq__UrlAssignment_2_in_rule__VideoSeq__Group__2__Impl1535);
            rule__VideoSeq__UrlAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoSeqAccess().getUrlAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__2__Impl"


    // $ANTLR start "rule__VideoSeq__Group__3"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:797:1: rule__VideoSeq__Group__3 : rule__VideoSeq__Group__3__Impl rule__VideoSeq__Group__4 ;
    public final void rule__VideoSeq__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:801:1: ( rule__VideoSeq__Group__3__Impl rule__VideoSeq__Group__4 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:802:2: rule__VideoSeq__Group__3__Impl rule__VideoSeq__Group__4
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group__3__Impl_in_rule__VideoSeq__Group__31565);
            rule__VideoSeq__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group__4_in_rule__VideoSeq__Group__31568);
            rule__VideoSeq__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__3"


    // $ANTLR start "rule__VideoSeq__Group__3__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:809:1: rule__VideoSeq__Group__3__Impl : ( ( rule__VideoSeq__Group_3__0 )? ) ;
    public final void rule__VideoSeq__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:813:1: ( ( ( rule__VideoSeq__Group_3__0 )? ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:814:1: ( ( rule__VideoSeq__Group_3__0 )? )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:814:1: ( ( rule__VideoSeq__Group_3__0 )? )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:815:1: ( rule__VideoSeq__Group_3__0 )?
            {
             before(grammarAccess.getVideoSeqAccess().getGroup_3()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:816:1: ( rule__VideoSeq__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:816:2: rule__VideoSeq__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__VideoSeq__Group_3__0_in_rule__VideoSeq__Group__3__Impl1595);
                    rule__VideoSeq__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoSeqAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__3__Impl"


    // $ANTLR start "rule__VideoSeq__Group__4"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:826:1: rule__VideoSeq__Group__4 : rule__VideoSeq__Group__4__Impl rule__VideoSeq__Group__5 ;
    public final void rule__VideoSeq__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:830:1: ( rule__VideoSeq__Group__4__Impl rule__VideoSeq__Group__5 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:831:2: rule__VideoSeq__Group__4__Impl rule__VideoSeq__Group__5
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group__4__Impl_in_rule__VideoSeq__Group__41626);
            rule__VideoSeq__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group__5_in_rule__VideoSeq__Group__41629);
            rule__VideoSeq__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__4"


    // $ANTLR start "rule__VideoSeq__Group__4__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:838:1: rule__VideoSeq__Group__4__Impl : ( ( rule__VideoSeq__Group_4__0 )? ) ;
    public final void rule__VideoSeq__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:842:1: ( ( ( rule__VideoSeq__Group_4__0 )? ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:843:1: ( ( rule__VideoSeq__Group_4__0 )? )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:843:1: ( ( rule__VideoSeq__Group_4__0 )? )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:844:1: ( rule__VideoSeq__Group_4__0 )?
            {
             before(grammarAccess.getVideoSeqAccess().getGroup_4()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:845:1: ( rule__VideoSeq__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:845:2: rule__VideoSeq__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__VideoSeq__Group_4__0_in_rule__VideoSeq__Group__4__Impl1656);
                    rule__VideoSeq__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoSeqAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__4__Impl"


    // $ANTLR start "rule__VideoSeq__Group__5"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:855:1: rule__VideoSeq__Group__5 : rule__VideoSeq__Group__5__Impl ;
    public final void rule__VideoSeq__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:859:1: ( rule__VideoSeq__Group__5__Impl )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:860:2: rule__VideoSeq__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group__5__Impl_in_rule__VideoSeq__Group__51687);
            rule__VideoSeq__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__5"


    // $ANTLR start "rule__VideoSeq__Group__5__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:866:1: rule__VideoSeq__Group__5__Impl : ( ( rule__VideoSeq__Group_5__0 )? ) ;
    public final void rule__VideoSeq__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:870:1: ( ( ( rule__VideoSeq__Group_5__0 )? ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:871:1: ( ( rule__VideoSeq__Group_5__0 )? )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:871:1: ( ( rule__VideoSeq__Group_5__0 )? )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:872:1: ( rule__VideoSeq__Group_5__0 )?
            {
             before(grammarAccess.getVideoSeqAccess().getGroup_5()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:873:1: ( rule__VideoSeq__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:873:2: rule__VideoSeq__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__VideoSeq__Group_5__0_in_rule__VideoSeq__Group__5__Impl1714);
                    rule__VideoSeq__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoSeqAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__5__Impl"


    // $ANTLR start "rule__VideoSeq__Group_3__0"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:895:1: rule__VideoSeq__Group_3__0 : rule__VideoSeq__Group_3__0__Impl rule__VideoSeq__Group_3__1 ;
    public final void rule__VideoSeq__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:899:1: ( rule__VideoSeq__Group_3__0__Impl rule__VideoSeq__Group_3__1 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:900:2: rule__VideoSeq__Group_3__0__Impl rule__VideoSeq__Group_3__1
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group_3__0__Impl_in_rule__VideoSeq__Group_3__01757);
            rule__VideoSeq__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group_3__1_in_rule__VideoSeq__Group_3__01760);
            rule__VideoSeq__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_3__0"


    // $ANTLR start "rule__VideoSeq__Group_3__0__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:907:1: rule__VideoSeq__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__VideoSeq__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:911:1: ( ( 'description' ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:912:1: ( 'description' )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:912:1: ( 'description' )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:913:1: 'description'
            {
             before(grammarAccess.getVideoSeqAccess().getDescriptionKeyword_3_0()); 
            match(input,18,FOLLOW_18_in_rule__VideoSeq__Group_3__0__Impl1788); 
             after(grammarAccess.getVideoSeqAccess().getDescriptionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_3__0__Impl"


    // $ANTLR start "rule__VideoSeq__Group_3__1"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:926:1: rule__VideoSeq__Group_3__1 : rule__VideoSeq__Group_3__1__Impl rule__VideoSeq__Group_3__2 ;
    public final void rule__VideoSeq__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:930:1: ( rule__VideoSeq__Group_3__1__Impl rule__VideoSeq__Group_3__2 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:931:2: rule__VideoSeq__Group_3__1__Impl rule__VideoSeq__Group_3__2
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group_3__1__Impl_in_rule__VideoSeq__Group_3__11819);
            rule__VideoSeq__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group_3__2_in_rule__VideoSeq__Group_3__11822);
            rule__VideoSeq__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_3__1"


    // $ANTLR start "rule__VideoSeq__Group_3__1__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:938:1: rule__VideoSeq__Group_3__1__Impl : ( ':' ) ;
    public final void rule__VideoSeq__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:942:1: ( ( ':' ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:943:1: ( ':' )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:943:1: ( ':' )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:944:1: ':'
            {
             before(grammarAccess.getVideoSeqAccess().getColonKeyword_3_1()); 
            match(input,19,FOLLOW_19_in_rule__VideoSeq__Group_3__1__Impl1850); 
             after(grammarAccess.getVideoSeqAccess().getColonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_3__1__Impl"


    // $ANTLR start "rule__VideoSeq__Group_3__2"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:957:1: rule__VideoSeq__Group_3__2 : rule__VideoSeq__Group_3__2__Impl ;
    public final void rule__VideoSeq__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:961:1: ( rule__VideoSeq__Group_3__2__Impl )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:962:2: rule__VideoSeq__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group_3__2__Impl_in_rule__VideoSeq__Group_3__21881);
            rule__VideoSeq__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_3__2"


    // $ANTLR start "rule__VideoSeq__Group_3__2__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:968:1: rule__VideoSeq__Group_3__2__Impl : ( ( rule__VideoSeq__DescriptionAssignment_3_2 ) ) ;
    public final void rule__VideoSeq__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:972:1: ( ( ( rule__VideoSeq__DescriptionAssignment_3_2 ) ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:973:1: ( ( rule__VideoSeq__DescriptionAssignment_3_2 ) )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:973:1: ( ( rule__VideoSeq__DescriptionAssignment_3_2 ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:974:1: ( rule__VideoSeq__DescriptionAssignment_3_2 )
            {
             before(grammarAccess.getVideoSeqAccess().getDescriptionAssignment_3_2()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:975:1: ( rule__VideoSeq__DescriptionAssignment_3_2 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:975:2: rule__VideoSeq__DescriptionAssignment_3_2
            {
            pushFollow(FOLLOW_rule__VideoSeq__DescriptionAssignment_3_2_in_rule__VideoSeq__Group_3__2__Impl1908);
            rule__VideoSeq__DescriptionAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoSeqAccess().getDescriptionAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_3__2__Impl"


    // $ANTLR start "rule__VideoSeq__Group_4__0"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:991:1: rule__VideoSeq__Group_4__0 : rule__VideoSeq__Group_4__0__Impl rule__VideoSeq__Group_4__1 ;
    public final void rule__VideoSeq__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:995:1: ( rule__VideoSeq__Group_4__0__Impl rule__VideoSeq__Group_4__1 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:996:2: rule__VideoSeq__Group_4__0__Impl rule__VideoSeq__Group_4__1
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group_4__0__Impl_in_rule__VideoSeq__Group_4__01944);
            rule__VideoSeq__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group_4__1_in_rule__VideoSeq__Group_4__01947);
            rule__VideoSeq__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_4__0"


    // $ANTLR start "rule__VideoSeq__Group_4__0__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1003:1: rule__VideoSeq__Group_4__0__Impl : ( 'probability' ) ;
    public final void rule__VideoSeq__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1007:1: ( ( 'probability' ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1008:1: ( 'probability' )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1008:1: ( 'probability' )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1009:1: 'probability'
            {
             before(grammarAccess.getVideoSeqAccess().getProbabilityKeyword_4_0()); 
            match(input,20,FOLLOW_20_in_rule__VideoSeq__Group_4__0__Impl1975); 
             after(grammarAccess.getVideoSeqAccess().getProbabilityKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_4__0__Impl"


    // $ANTLR start "rule__VideoSeq__Group_4__1"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1022:1: rule__VideoSeq__Group_4__1 : rule__VideoSeq__Group_4__1__Impl rule__VideoSeq__Group_4__2 ;
    public final void rule__VideoSeq__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1026:1: ( rule__VideoSeq__Group_4__1__Impl rule__VideoSeq__Group_4__2 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1027:2: rule__VideoSeq__Group_4__1__Impl rule__VideoSeq__Group_4__2
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group_4__1__Impl_in_rule__VideoSeq__Group_4__12006);
            rule__VideoSeq__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group_4__2_in_rule__VideoSeq__Group_4__12009);
            rule__VideoSeq__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_4__1"


    // $ANTLR start "rule__VideoSeq__Group_4__1__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1034:1: rule__VideoSeq__Group_4__1__Impl : ( ':' ) ;
    public final void rule__VideoSeq__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1038:1: ( ( ':' ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1039:1: ( ':' )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1039:1: ( ':' )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1040:1: ':'
            {
             before(grammarAccess.getVideoSeqAccess().getColonKeyword_4_1()); 
            match(input,19,FOLLOW_19_in_rule__VideoSeq__Group_4__1__Impl2037); 
             after(grammarAccess.getVideoSeqAccess().getColonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_4__1__Impl"


    // $ANTLR start "rule__VideoSeq__Group_4__2"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1053:1: rule__VideoSeq__Group_4__2 : rule__VideoSeq__Group_4__2__Impl ;
    public final void rule__VideoSeq__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1057:1: ( rule__VideoSeq__Group_4__2__Impl )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1058:2: rule__VideoSeq__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group_4__2__Impl_in_rule__VideoSeq__Group_4__22068);
            rule__VideoSeq__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_4__2"


    // $ANTLR start "rule__VideoSeq__Group_4__2__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1064:1: rule__VideoSeq__Group_4__2__Impl : ( ( rule__VideoSeq__ProprobabilitePercentAssignment_4_2 ) ) ;
    public final void rule__VideoSeq__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1068:1: ( ( ( rule__VideoSeq__ProprobabilitePercentAssignment_4_2 ) ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1069:1: ( ( rule__VideoSeq__ProprobabilitePercentAssignment_4_2 ) )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1069:1: ( ( rule__VideoSeq__ProprobabilitePercentAssignment_4_2 ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1070:1: ( rule__VideoSeq__ProprobabilitePercentAssignment_4_2 )
            {
             before(grammarAccess.getVideoSeqAccess().getProprobabilitePercentAssignment_4_2()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1071:1: ( rule__VideoSeq__ProprobabilitePercentAssignment_4_2 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1071:2: rule__VideoSeq__ProprobabilitePercentAssignment_4_2
            {
            pushFollow(FOLLOW_rule__VideoSeq__ProprobabilitePercentAssignment_4_2_in_rule__VideoSeq__Group_4__2__Impl2095);
            rule__VideoSeq__ProprobabilitePercentAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoSeqAccess().getProprobabilitePercentAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_4__2__Impl"


    // $ANTLR start "rule__VideoSeq__Group_5__0"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1087:1: rule__VideoSeq__Group_5__0 : rule__VideoSeq__Group_5__0__Impl rule__VideoSeq__Group_5__1 ;
    public final void rule__VideoSeq__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1091:1: ( rule__VideoSeq__Group_5__0__Impl rule__VideoSeq__Group_5__1 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1092:2: rule__VideoSeq__Group_5__0__Impl rule__VideoSeq__Group_5__1
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group_5__0__Impl_in_rule__VideoSeq__Group_5__02131);
            rule__VideoSeq__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group_5__1_in_rule__VideoSeq__Group_5__02134);
            rule__VideoSeq__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_5__0"


    // $ANTLR start "rule__VideoSeq__Group_5__0__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1099:1: rule__VideoSeq__Group_5__0__Impl : ( 'duration' ) ;
    public final void rule__VideoSeq__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1103:1: ( ( 'duration' ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1104:1: ( 'duration' )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1104:1: ( 'duration' )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1105:1: 'duration'
            {
             before(grammarAccess.getVideoSeqAccess().getDurationKeyword_5_0()); 
            match(input,21,FOLLOW_21_in_rule__VideoSeq__Group_5__0__Impl2162); 
             after(grammarAccess.getVideoSeqAccess().getDurationKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_5__0__Impl"


    // $ANTLR start "rule__VideoSeq__Group_5__1"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1118:1: rule__VideoSeq__Group_5__1 : rule__VideoSeq__Group_5__1__Impl rule__VideoSeq__Group_5__2 ;
    public final void rule__VideoSeq__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1122:1: ( rule__VideoSeq__Group_5__1__Impl rule__VideoSeq__Group_5__2 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1123:2: rule__VideoSeq__Group_5__1__Impl rule__VideoSeq__Group_5__2
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group_5__1__Impl_in_rule__VideoSeq__Group_5__12193);
            rule__VideoSeq__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group_5__2_in_rule__VideoSeq__Group_5__12196);
            rule__VideoSeq__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_5__1"


    // $ANTLR start "rule__VideoSeq__Group_5__1__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1130:1: rule__VideoSeq__Group_5__1__Impl : ( ':' ) ;
    public final void rule__VideoSeq__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1134:1: ( ( ':' ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1135:1: ( ':' )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1135:1: ( ':' )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1136:1: ':'
            {
             before(grammarAccess.getVideoSeqAccess().getColonKeyword_5_1()); 
            match(input,19,FOLLOW_19_in_rule__VideoSeq__Group_5__1__Impl2224); 
             after(grammarAccess.getVideoSeqAccess().getColonKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_5__1__Impl"


    // $ANTLR start "rule__VideoSeq__Group_5__2"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1149:1: rule__VideoSeq__Group_5__2 : rule__VideoSeq__Group_5__2__Impl ;
    public final void rule__VideoSeq__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1153:1: ( rule__VideoSeq__Group_5__2__Impl )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1154:2: rule__VideoSeq__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group_5__2__Impl_in_rule__VideoSeq__Group_5__22255);
            rule__VideoSeq__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_5__2"


    // $ANTLR start "rule__VideoSeq__Group_5__2__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1160:1: rule__VideoSeq__Group_5__2__Impl : ( ( rule__VideoSeq__DureeSecondeAssignment_5_2 ) ) ;
    public final void rule__VideoSeq__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1164:1: ( ( ( rule__VideoSeq__DureeSecondeAssignment_5_2 ) ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1165:1: ( ( rule__VideoSeq__DureeSecondeAssignment_5_2 ) )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1165:1: ( ( rule__VideoSeq__DureeSecondeAssignment_5_2 ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1166:1: ( rule__VideoSeq__DureeSecondeAssignment_5_2 )
            {
             before(grammarAccess.getVideoSeqAccess().getDureeSecondeAssignment_5_2()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1167:1: ( rule__VideoSeq__DureeSecondeAssignment_5_2 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1167:2: rule__VideoSeq__DureeSecondeAssignment_5_2
            {
            pushFollow(FOLLOW_rule__VideoSeq__DureeSecondeAssignment_5_2_in_rule__VideoSeq__Group_5__2__Impl2282);
            rule__VideoSeq__DureeSecondeAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoSeqAccess().getDureeSecondeAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_5__2__Impl"


    // $ANTLR start "rule__VideoSeqMandatory__Group__0"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1183:1: rule__VideoSeqMandatory__Group__0 : rule__VideoSeqMandatory__Group__0__Impl rule__VideoSeqMandatory__Group__1 ;
    public final void rule__VideoSeqMandatory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1187:1: ( rule__VideoSeqMandatory__Group__0__Impl rule__VideoSeqMandatory__Group__1 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1188:2: rule__VideoSeqMandatory__Group__0__Impl rule__VideoSeqMandatory__Group__1
            {
            pushFollow(FOLLOW_rule__VideoSeqMandatory__Group__0__Impl_in_rule__VideoSeqMandatory__Group__02318);
            rule__VideoSeqMandatory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeqMandatory__Group__1_in_rule__VideoSeqMandatory__Group__02321);
            rule__VideoSeqMandatory__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__Group__0"


    // $ANTLR start "rule__VideoSeqMandatory__Group__0__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1195:1: rule__VideoSeqMandatory__Group__0__Impl : ( 'videoseq' ) ;
    public final void rule__VideoSeqMandatory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1199:1: ( ( 'videoseq' ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1200:1: ( 'videoseq' )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1200:1: ( 'videoseq' )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1201:1: 'videoseq'
            {
             before(grammarAccess.getVideoSeqMandatoryAccess().getVideoseqKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__VideoSeqMandatory__Group__0__Impl2349); 
             after(grammarAccess.getVideoSeqMandatoryAccess().getVideoseqKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__Group__0__Impl"


    // $ANTLR start "rule__VideoSeqMandatory__Group__1"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1214:1: rule__VideoSeqMandatory__Group__1 : rule__VideoSeqMandatory__Group__1__Impl rule__VideoSeqMandatory__Group__2 ;
    public final void rule__VideoSeqMandatory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1218:1: ( rule__VideoSeqMandatory__Group__1__Impl rule__VideoSeqMandatory__Group__2 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1219:2: rule__VideoSeqMandatory__Group__1__Impl rule__VideoSeqMandatory__Group__2
            {
            pushFollow(FOLLOW_rule__VideoSeqMandatory__Group__1__Impl_in_rule__VideoSeqMandatory__Group__12380);
            rule__VideoSeqMandatory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeqMandatory__Group__2_in_rule__VideoSeqMandatory__Group__12383);
            rule__VideoSeqMandatory__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__Group__1"


    // $ANTLR start "rule__VideoSeqMandatory__Group__1__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1226:1: rule__VideoSeqMandatory__Group__1__Impl : ( ( rule__VideoSeqMandatory__IdAssignment_1 )? ) ;
    public final void rule__VideoSeqMandatory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1230:1: ( ( ( rule__VideoSeqMandatory__IdAssignment_1 )? ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1231:1: ( ( rule__VideoSeqMandatory__IdAssignment_1 )? )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1231:1: ( ( rule__VideoSeqMandatory__IdAssignment_1 )? )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1232:1: ( rule__VideoSeqMandatory__IdAssignment_1 )?
            {
             before(grammarAccess.getVideoSeqMandatoryAccess().getIdAssignment_1()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1233:1: ( rule__VideoSeqMandatory__IdAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1233:2: rule__VideoSeqMandatory__IdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__VideoSeqMandatory__IdAssignment_1_in_rule__VideoSeqMandatory__Group__1__Impl2410);
                    rule__VideoSeqMandatory__IdAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoSeqMandatoryAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__Group__1__Impl"


    // $ANTLR start "rule__VideoSeqMandatory__Group__2"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1243:1: rule__VideoSeqMandatory__Group__2 : rule__VideoSeqMandatory__Group__2__Impl rule__VideoSeqMandatory__Group__3 ;
    public final void rule__VideoSeqMandatory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1247:1: ( rule__VideoSeqMandatory__Group__2__Impl rule__VideoSeqMandatory__Group__3 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1248:2: rule__VideoSeqMandatory__Group__2__Impl rule__VideoSeqMandatory__Group__3
            {
            pushFollow(FOLLOW_rule__VideoSeqMandatory__Group__2__Impl_in_rule__VideoSeqMandatory__Group__22441);
            rule__VideoSeqMandatory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeqMandatory__Group__3_in_rule__VideoSeqMandatory__Group__22444);
            rule__VideoSeqMandatory__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__Group__2"


    // $ANTLR start "rule__VideoSeqMandatory__Group__2__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1255:1: rule__VideoSeqMandatory__Group__2__Impl : ( ( rule__VideoSeqMandatory__UrlAssignment_2 ) ) ;
    public final void rule__VideoSeqMandatory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1259:1: ( ( ( rule__VideoSeqMandatory__UrlAssignment_2 ) ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1260:1: ( ( rule__VideoSeqMandatory__UrlAssignment_2 ) )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1260:1: ( ( rule__VideoSeqMandatory__UrlAssignment_2 ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1261:1: ( rule__VideoSeqMandatory__UrlAssignment_2 )
            {
             before(grammarAccess.getVideoSeqMandatoryAccess().getUrlAssignment_2()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1262:1: ( rule__VideoSeqMandatory__UrlAssignment_2 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1262:2: rule__VideoSeqMandatory__UrlAssignment_2
            {
            pushFollow(FOLLOW_rule__VideoSeqMandatory__UrlAssignment_2_in_rule__VideoSeqMandatory__Group__2__Impl2471);
            rule__VideoSeqMandatory__UrlAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoSeqMandatoryAccess().getUrlAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__Group__2__Impl"


    // $ANTLR start "rule__VideoSeqMandatory__Group__3"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1272:1: rule__VideoSeqMandatory__Group__3 : rule__VideoSeqMandatory__Group__3__Impl rule__VideoSeqMandatory__Group__4 ;
    public final void rule__VideoSeqMandatory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1276:1: ( rule__VideoSeqMandatory__Group__3__Impl rule__VideoSeqMandatory__Group__4 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1277:2: rule__VideoSeqMandatory__Group__3__Impl rule__VideoSeqMandatory__Group__4
            {
            pushFollow(FOLLOW_rule__VideoSeqMandatory__Group__3__Impl_in_rule__VideoSeqMandatory__Group__32501);
            rule__VideoSeqMandatory__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeqMandatory__Group__4_in_rule__VideoSeqMandatory__Group__32504);
            rule__VideoSeqMandatory__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__Group__3"


    // $ANTLR start "rule__VideoSeqMandatory__Group__3__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1284:1: rule__VideoSeqMandatory__Group__3__Impl : ( ( rule__VideoSeqMandatory__Group_3__0 )? ) ;
    public final void rule__VideoSeqMandatory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1288:1: ( ( ( rule__VideoSeqMandatory__Group_3__0 )? ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1289:1: ( ( rule__VideoSeqMandatory__Group_3__0 )? )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1289:1: ( ( rule__VideoSeqMandatory__Group_3__0 )? )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1290:1: ( rule__VideoSeqMandatory__Group_3__0 )?
            {
             before(grammarAccess.getVideoSeqMandatoryAccess().getGroup_3()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1291:1: ( rule__VideoSeqMandatory__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1291:2: rule__VideoSeqMandatory__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__VideoSeqMandatory__Group_3__0_in_rule__VideoSeqMandatory__Group__3__Impl2531);
                    rule__VideoSeqMandatory__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoSeqMandatoryAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__Group__3__Impl"


    // $ANTLR start "rule__VideoSeqMandatory__Group__4"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1301:1: rule__VideoSeqMandatory__Group__4 : rule__VideoSeqMandatory__Group__4__Impl ;
    public final void rule__VideoSeqMandatory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1305:1: ( rule__VideoSeqMandatory__Group__4__Impl )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1306:2: rule__VideoSeqMandatory__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__VideoSeqMandatory__Group__4__Impl_in_rule__VideoSeqMandatory__Group__42562);
            rule__VideoSeqMandatory__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__Group__4"


    // $ANTLR start "rule__VideoSeqMandatory__Group__4__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1312:1: rule__VideoSeqMandatory__Group__4__Impl : ( ( rule__VideoSeqMandatory__Group_4__0 )? ) ;
    public final void rule__VideoSeqMandatory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1316:1: ( ( ( rule__VideoSeqMandatory__Group_4__0 )? ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1317:1: ( ( rule__VideoSeqMandatory__Group_4__0 )? )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1317:1: ( ( rule__VideoSeqMandatory__Group_4__0 )? )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1318:1: ( rule__VideoSeqMandatory__Group_4__0 )?
            {
             before(grammarAccess.getVideoSeqMandatoryAccess().getGroup_4()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1319:1: ( rule__VideoSeqMandatory__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1319:2: rule__VideoSeqMandatory__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__VideoSeqMandatory__Group_4__0_in_rule__VideoSeqMandatory__Group__4__Impl2589);
                    rule__VideoSeqMandatory__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoSeqMandatoryAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__Group__4__Impl"


    // $ANTLR start "rule__VideoSeqMandatory__Group_3__0"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1339:1: rule__VideoSeqMandatory__Group_3__0 : rule__VideoSeqMandatory__Group_3__0__Impl rule__VideoSeqMandatory__Group_3__1 ;
    public final void rule__VideoSeqMandatory__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1343:1: ( rule__VideoSeqMandatory__Group_3__0__Impl rule__VideoSeqMandatory__Group_3__1 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1344:2: rule__VideoSeqMandatory__Group_3__0__Impl rule__VideoSeqMandatory__Group_3__1
            {
            pushFollow(FOLLOW_rule__VideoSeqMandatory__Group_3__0__Impl_in_rule__VideoSeqMandatory__Group_3__02630);
            rule__VideoSeqMandatory__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeqMandatory__Group_3__1_in_rule__VideoSeqMandatory__Group_3__02633);
            rule__VideoSeqMandatory__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__Group_3__0"


    // $ANTLR start "rule__VideoSeqMandatory__Group_3__0__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1351:1: rule__VideoSeqMandatory__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__VideoSeqMandatory__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1355:1: ( ( 'description' ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1356:1: ( 'description' )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1356:1: ( 'description' )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1357:1: 'description'
            {
             before(grammarAccess.getVideoSeqMandatoryAccess().getDescriptionKeyword_3_0()); 
            match(input,18,FOLLOW_18_in_rule__VideoSeqMandatory__Group_3__0__Impl2661); 
             after(grammarAccess.getVideoSeqMandatoryAccess().getDescriptionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__Group_3__0__Impl"


    // $ANTLR start "rule__VideoSeqMandatory__Group_3__1"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1370:1: rule__VideoSeqMandatory__Group_3__1 : rule__VideoSeqMandatory__Group_3__1__Impl rule__VideoSeqMandatory__Group_3__2 ;
    public final void rule__VideoSeqMandatory__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1374:1: ( rule__VideoSeqMandatory__Group_3__1__Impl rule__VideoSeqMandatory__Group_3__2 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1375:2: rule__VideoSeqMandatory__Group_3__1__Impl rule__VideoSeqMandatory__Group_3__2
            {
            pushFollow(FOLLOW_rule__VideoSeqMandatory__Group_3__1__Impl_in_rule__VideoSeqMandatory__Group_3__12692);
            rule__VideoSeqMandatory__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeqMandatory__Group_3__2_in_rule__VideoSeqMandatory__Group_3__12695);
            rule__VideoSeqMandatory__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__Group_3__1"


    // $ANTLR start "rule__VideoSeqMandatory__Group_3__1__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1382:1: rule__VideoSeqMandatory__Group_3__1__Impl : ( ':' ) ;
    public final void rule__VideoSeqMandatory__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1386:1: ( ( ':' ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1387:1: ( ':' )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1387:1: ( ':' )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1388:1: ':'
            {
             before(grammarAccess.getVideoSeqMandatoryAccess().getColonKeyword_3_1()); 
            match(input,19,FOLLOW_19_in_rule__VideoSeqMandatory__Group_3__1__Impl2723); 
             after(grammarAccess.getVideoSeqMandatoryAccess().getColonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__Group_3__1__Impl"


    // $ANTLR start "rule__VideoSeqMandatory__Group_3__2"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1401:1: rule__VideoSeqMandatory__Group_3__2 : rule__VideoSeqMandatory__Group_3__2__Impl ;
    public final void rule__VideoSeqMandatory__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1405:1: ( rule__VideoSeqMandatory__Group_3__2__Impl )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1406:2: rule__VideoSeqMandatory__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__VideoSeqMandatory__Group_3__2__Impl_in_rule__VideoSeqMandatory__Group_3__22754);
            rule__VideoSeqMandatory__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__Group_3__2"


    // $ANTLR start "rule__VideoSeqMandatory__Group_3__2__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1412:1: rule__VideoSeqMandatory__Group_3__2__Impl : ( ( rule__VideoSeqMandatory__DescriptionAssignment_3_2 ) ) ;
    public final void rule__VideoSeqMandatory__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1416:1: ( ( ( rule__VideoSeqMandatory__DescriptionAssignment_3_2 ) ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1417:1: ( ( rule__VideoSeqMandatory__DescriptionAssignment_3_2 ) )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1417:1: ( ( rule__VideoSeqMandatory__DescriptionAssignment_3_2 ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1418:1: ( rule__VideoSeqMandatory__DescriptionAssignment_3_2 )
            {
             before(grammarAccess.getVideoSeqMandatoryAccess().getDescriptionAssignment_3_2()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1419:1: ( rule__VideoSeqMandatory__DescriptionAssignment_3_2 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1419:2: rule__VideoSeqMandatory__DescriptionAssignment_3_2
            {
            pushFollow(FOLLOW_rule__VideoSeqMandatory__DescriptionAssignment_3_2_in_rule__VideoSeqMandatory__Group_3__2__Impl2781);
            rule__VideoSeqMandatory__DescriptionAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoSeqMandatoryAccess().getDescriptionAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__Group_3__2__Impl"


    // $ANTLR start "rule__VideoSeqMandatory__Group_4__0"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1435:1: rule__VideoSeqMandatory__Group_4__0 : rule__VideoSeqMandatory__Group_4__0__Impl rule__VideoSeqMandatory__Group_4__1 ;
    public final void rule__VideoSeqMandatory__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1439:1: ( rule__VideoSeqMandatory__Group_4__0__Impl rule__VideoSeqMandatory__Group_4__1 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1440:2: rule__VideoSeqMandatory__Group_4__0__Impl rule__VideoSeqMandatory__Group_4__1
            {
            pushFollow(FOLLOW_rule__VideoSeqMandatory__Group_4__0__Impl_in_rule__VideoSeqMandatory__Group_4__02817);
            rule__VideoSeqMandatory__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeqMandatory__Group_4__1_in_rule__VideoSeqMandatory__Group_4__02820);
            rule__VideoSeqMandatory__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__Group_4__0"


    // $ANTLR start "rule__VideoSeqMandatory__Group_4__0__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1447:1: rule__VideoSeqMandatory__Group_4__0__Impl : ( 'duration' ) ;
    public final void rule__VideoSeqMandatory__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1451:1: ( ( 'duration' ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1452:1: ( 'duration' )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1452:1: ( 'duration' )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1453:1: 'duration'
            {
             before(grammarAccess.getVideoSeqMandatoryAccess().getDurationKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__VideoSeqMandatory__Group_4__0__Impl2848); 
             after(grammarAccess.getVideoSeqMandatoryAccess().getDurationKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__Group_4__0__Impl"


    // $ANTLR start "rule__VideoSeqMandatory__Group_4__1"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1466:1: rule__VideoSeqMandatory__Group_4__1 : rule__VideoSeqMandatory__Group_4__1__Impl rule__VideoSeqMandatory__Group_4__2 ;
    public final void rule__VideoSeqMandatory__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1470:1: ( rule__VideoSeqMandatory__Group_4__1__Impl rule__VideoSeqMandatory__Group_4__2 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1471:2: rule__VideoSeqMandatory__Group_4__1__Impl rule__VideoSeqMandatory__Group_4__2
            {
            pushFollow(FOLLOW_rule__VideoSeqMandatory__Group_4__1__Impl_in_rule__VideoSeqMandatory__Group_4__12879);
            rule__VideoSeqMandatory__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeqMandatory__Group_4__2_in_rule__VideoSeqMandatory__Group_4__12882);
            rule__VideoSeqMandatory__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__Group_4__1"


    // $ANTLR start "rule__VideoSeqMandatory__Group_4__1__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1478:1: rule__VideoSeqMandatory__Group_4__1__Impl : ( ':' ) ;
    public final void rule__VideoSeqMandatory__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1482:1: ( ( ':' ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1483:1: ( ':' )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1483:1: ( ':' )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1484:1: ':'
            {
             before(grammarAccess.getVideoSeqMandatoryAccess().getColonKeyword_4_1()); 
            match(input,19,FOLLOW_19_in_rule__VideoSeqMandatory__Group_4__1__Impl2910); 
             after(grammarAccess.getVideoSeqMandatoryAccess().getColonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__Group_4__1__Impl"


    // $ANTLR start "rule__VideoSeqMandatory__Group_4__2"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1497:1: rule__VideoSeqMandatory__Group_4__2 : rule__VideoSeqMandatory__Group_4__2__Impl ;
    public final void rule__VideoSeqMandatory__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1501:1: ( rule__VideoSeqMandatory__Group_4__2__Impl )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1502:2: rule__VideoSeqMandatory__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__VideoSeqMandatory__Group_4__2__Impl_in_rule__VideoSeqMandatory__Group_4__22941);
            rule__VideoSeqMandatory__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__Group_4__2"


    // $ANTLR start "rule__VideoSeqMandatory__Group_4__2__Impl"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1508:1: rule__VideoSeqMandatory__Group_4__2__Impl : ( ( rule__VideoSeqMandatory__DureeSecondeAssignment_4_2 ) ) ;
    public final void rule__VideoSeqMandatory__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1512:1: ( ( ( rule__VideoSeqMandatory__DureeSecondeAssignment_4_2 ) ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1513:1: ( ( rule__VideoSeqMandatory__DureeSecondeAssignment_4_2 ) )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1513:1: ( ( rule__VideoSeqMandatory__DureeSecondeAssignment_4_2 ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1514:1: ( rule__VideoSeqMandatory__DureeSecondeAssignment_4_2 )
            {
             before(grammarAccess.getVideoSeqMandatoryAccess().getDureeSecondeAssignment_4_2()); 
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1515:1: ( rule__VideoSeqMandatory__DureeSecondeAssignment_4_2 )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1515:2: rule__VideoSeqMandatory__DureeSecondeAssignment_4_2
            {
            pushFollow(FOLLOW_rule__VideoSeqMandatory__DureeSecondeAssignment_4_2_in_rule__VideoSeqMandatory__Group_4__2__Impl2968);
            rule__VideoSeqMandatory__DureeSecondeAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoSeqMandatoryAccess().getDureeSecondeAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__Group_4__2__Impl"


    // $ANTLR start "rule__VideoGen__VideosAssignment_2"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1532:1: rule__VideoGen__VideosAssignment_2 : ( ruleVideo ) ;
    public final void rule__VideoGen__VideosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1536:1: ( ( ruleVideo ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1537:1: ( ruleVideo )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1537:1: ( ruleVideo )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1538:1: ruleVideo
            {
             before(grammarAccess.getVideoGenAccess().getVideosVideoParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVideo_in_rule__VideoGen__VideosAssignment_23009);
            ruleVideo();

            state._fsp--;

             after(grammarAccess.getVideoGenAccess().getVideosVideoParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__VideosAssignment_2"


    // $ANTLR start "rule__MandatoryRule__SeqAssignment_1"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1547:1: rule__MandatoryRule__SeqAssignment_1 : ( ruleVideoSeqMandatory ) ;
    public final void rule__MandatoryRule__SeqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1551:1: ( ( ruleVideoSeqMandatory ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1552:1: ( ruleVideoSeqMandatory )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1552:1: ( ruleVideoSeqMandatory )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1553:1: ruleVideoSeqMandatory
            {
             before(grammarAccess.getMandatoryRuleAccess().getSeqVideoSeqMandatoryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVideoSeqMandatory_in_rule__MandatoryRule__SeqAssignment_13040);
            ruleVideoSeqMandatory();

            state._fsp--;

             after(grammarAccess.getMandatoryRuleAccess().getSeqVideoSeqMandatoryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryRule__SeqAssignment_1"


    // $ANTLR start "rule__OptionnalRule__SeqAssignment_1"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1562:1: rule__OptionnalRule__SeqAssignment_1 : ( ruleVideoSeq ) ;
    public final void rule__OptionnalRule__SeqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1566:1: ( ( ruleVideoSeq ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1567:1: ( ruleVideoSeq )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1567:1: ( ruleVideoSeq )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1568:1: ruleVideoSeq
            {
             before(grammarAccess.getOptionnalRuleAccess().getSeqVideoSeqParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVideoSeq_in_rule__OptionnalRule__SeqAssignment_13071);
            ruleVideoSeq();

            state._fsp--;

             after(grammarAccess.getOptionnalRuleAccess().getSeqVideoSeqParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionnalRule__SeqAssignment_1"


    // $ANTLR start "rule__AlternativeRule__IdAssignment_1"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1577:1: rule__AlternativeRule__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__AlternativeRule__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1581:1: ( ( RULE_ID ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1582:1: ( RULE_ID )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1582:1: ( RULE_ID )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1583:1: RULE_ID
            {
             before(grammarAccess.getAlternativeRuleAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AlternativeRule__IdAssignment_13102); 
             after(grammarAccess.getAlternativeRuleAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeRule__IdAssignment_1"


    // $ANTLR start "rule__AlternativeRule__AlternatvesAssignment_3"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1592:1: rule__AlternativeRule__AlternatvesAssignment_3 : ( ruleVideoSeq ) ;
    public final void rule__AlternativeRule__AlternatvesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1596:1: ( ( ruleVideoSeq ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1597:1: ( ruleVideoSeq )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1597:1: ( ruleVideoSeq )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1598:1: ruleVideoSeq
            {
             before(grammarAccess.getAlternativeRuleAccess().getAlternatvesVideoSeqParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleVideoSeq_in_rule__AlternativeRule__AlternatvesAssignment_33133);
            ruleVideoSeq();

            state._fsp--;

             after(grammarAccess.getAlternativeRuleAccess().getAlternatvesVideoSeqParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeRule__AlternatvesAssignment_3"


    // $ANTLR start "rule__VideoSeq__IdAssignment_1"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1607:1: rule__VideoSeq__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__VideoSeq__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1611:1: ( ( RULE_ID ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1612:1: ( RULE_ID )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1612:1: ( RULE_ID )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1613:1: RULE_ID
            {
             before(grammarAccess.getVideoSeqAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VideoSeq__IdAssignment_13164); 
             after(grammarAccess.getVideoSeqAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__IdAssignment_1"


    // $ANTLR start "rule__VideoSeq__UrlAssignment_2"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1622:1: rule__VideoSeq__UrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__VideoSeq__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1626:1: ( ( RULE_STRING ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1627:1: ( RULE_STRING )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1627:1: ( RULE_STRING )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1628:1: RULE_STRING
            {
             before(grammarAccess.getVideoSeqAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__VideoSeq__UrlAssignment_23195); 
             after(grammarAccess.getVideoSeqAccess().getUrlSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__UrlAssignment_2"


    // $ANTLR start "rule__VideoSeq__DescriptionAssignment_3_2"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1637:1: rule__VideoSeq__DescriptionAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__VideoSeq__DescriptionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1641:1: ( ( RULE_STRING ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1642:1: ( RULE_STRING )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1642:1: ( RULE_STRING )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1643:1: RULE_STRING
            {
             before(grammarAccess.getVideoSeqAccess().getDescriptionSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__VideoSeq__DescriptionAssignment_3_23226); 
             after(grammarAccess.getVideoSeqAccess().getDescriptionSTRINGTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__DescriptionAssignment_3_2"


    // $ANTLR start "rule__VideoSeq__ProprobabilitePercentAssignment_4_2"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1652:1: rule__VideoSeq__ProprobabilitePercentAssignment_4_2 : ( RULE_INT ) ;
    public final void rule__VideoSeq__ProprobabilitePercentAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1656:1: ( ( RULE_INT ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1657:1: ( RULE_INT )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1657:1: ( RULE_INT )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1658:1: RULE_INT
            {
             before(grammarAccess.getVideoSeqAccess().getProprobabilitePercentINTTerminalRuleCall_4_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__VideoSeq__ProprobabilitePercentAssignment_4_23257); 
             after(grammarAccess.getVideoSeqAccess().getProprobabilitePercentINTTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__ProprobabilitePercentAssignment_4_2"


    // $ANTLR start "rule__VideoSeq__DureeSecondeAssignment_5_2"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1667:1: rule__VideoSeq__DureeSecondeAssignment_5_2 : ( RULE_INT ) ;
    public final void rule__VideoSeq__DureeSecondeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1671:1: ( ( RULE_INT ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1672:1: ( RULE_INT )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1672:1: ( RULE_INT )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1673:1: RULE_INT
            {
             before(grammarAccess.getVideoSeqAccess().getDureeSecondeINTTerminalRuleCall_5_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__VideoSeq__DureeSecondeAssignment_5_23288); 
             after(grammarAccess.getVideoSeqAccess().getDureeSecondeINTTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__DureeSecondeAssignment_5_2"


    // $ANTLR start "rule__VideoSeqMandatory__IdAssignment_1"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1682:1: rule__VideoSeqMandatory__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__VideoSeqMandatory__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1686:1: ( ( RULE_ID ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1687:1: ( RULE_ID )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1687:1: ( RULE_ID )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1688:1: RULE_ID
            {
             before(grammarAccess.getVideoSeqMandatoryAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VideoSeqMandatory__IdAssignment_13319); 
             after(grammarAccess.getVideoSeqMandatoryAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__IdAssignment_1"


    // $ANTLR start "rule__VideoSeqMandatory__UrlAssignment_2"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1697:1: rule__VideoSeqMandatory__UrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__VideoSeqMandatory__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1701:1: ( ( RULE_STRING ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1702:1: ( RULE_STRING )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1702:1: ( RULE_STRING )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1703:1: RULE_STRING
            {
             before(grammarAccess.getVideoSeqMandatoryAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__VideoSeqMandatory__UrlAssignment_23350); 
             after(grammarAccess.getVideoSeqMandatoryAccess().getUrlSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__UrlAssignment_2"


    // $ANTLR start "rule__VideoSeqMandatory__DescriptionAssignment_3_2"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1712:1: rule__VideoSeqMandatory__DescriptionAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__VideoSeqMandatory__DescriptionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1716:1: ( ( RULE_STRING ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1717:1: ( RULE_STRING )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1717:1: ( RULE_STRING )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1718:1: RULE_STRING
            {
             before(grammarAccess.getVideoSeqMandatoryAccess().getDescriptionSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__VideoSeqMandatory__DescriptionAssignment_3_23381); 
             after(grammarAccess.getVideoSeqMandatoryAccess().getDescriptionSTRINGTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__DescriptionAssignment_3_2"


    // $ANTLR start "rule__VideoSeqMandatory__DureeSecondeAssignment_4_2"
    // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1727:1: rule__VideoSeqMandatory__DureeSecondeAssignment_4_2 : ( RULE_INT ) ;
    public final void rule__VideoSeqMandatory__DureeSecondeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1731:1: ( ( RULE_INT ) )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1732:1: ( RULE_INT )
            {
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1732:1: ( RULE_INT )
            // ../fr.istic.VideoGen.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVideoGen.g:1733:1: RULE_INT
            {
             before(grammarAccess.getVideoSeqMandatoryAccess().getDureeSecondeINTTerminalRuleCall_4_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__VideoSeqMandatory__DureeSecondeAssignment_4_23412); 
             after(grammarAccess.getVideoSeqMandatoryAccess().getDureeSecondeINTTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeqMandatory__DureeSecondeAssignment_4_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleVideoGen_in_entryRuleVideoGen61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoGen68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__0_in_ruleVideoGen94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideo_in_entryRuleVideo121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideo128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Video__Alternatives_in_ruleVideo154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryRule_in_entryRuleMandatoryRule181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatoryRule188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryRule__Group__0_in_ruleMandatoryRule214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionnalRule_in_entryRuleOptionnalRule241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionnalRule248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionnalRule__Group__0_in_ruleOptionnalRule274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternativeRule_in_entryRuleAlternativeRule301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternativeRule308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeRule__Group__0_in_ruleAlternativeRule334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_entryRuleVideoSeq361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoSeq368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__0_in_ruleVideoSeq394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoSeqMandatory_in_entryRuleVideoSeqMandatory421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoSeqMandatory428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__Group__0_in_ruleVideoSeqMandatory454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryRule_in_rule__Video__Alternatives490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionnalRule_in_rule__Video__Alternatives507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternativeRule_in_rule__Video__Alternatives524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__0__Impl_in_rule__VideoGen__Group__0554 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__1_in_rule__VideoGen__Group__0557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__VideoGen__Group__0__Impl585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__1__Impl_in_rule__VideoGen__Group__1616 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__2_in_rule__VideoGen__Group__1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__VideoGen__Group__1__Impl647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__2__Impl_in_rule__VideoGen__Group__2678 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__3_in_rule__VideoGen__Group__2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__VideosAssignment_2_in_rule__VideoGen__Group__2__Impl708 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__3__Impl_in_rule__VideoGen__Group__3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__VideoGen__Group__3__Impl767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryRule__Group__0__Impl_in_rule__MandatoryRule__Group__0806 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__MandatoryRule__Group__1_in_rule__MandatoryRule__Group__0809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MandatoryRule__Group__0__Impl837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryRule__Group__1__Impl_in_rule__MandatoryRule__Group__1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryRule__SeqAssignment_1_in_rule__MandatoryRule__Group__1__Impl895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionnalRule__Group__0__Impl_in_rule__OptionnalRule__Group__0929 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__OptionnalRule__Group__1_in_rule__OptionnalRule__Group__0932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__OptionnalRule__Group__0__Impl960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionnalRule__Group__1__Impl_in_rule__OptionnalRule__Group__1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionnalRule__SeqAssignment_1_in_rule__OptionnalRule__Group__1__Impl1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeRule__Group__0__Impl_in_rule__AlternativeRule__Group__01052 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AlternativeRule__Group__1_in_rule__AlternativeRule__Group__01055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AlternativeRule__Group__0__Impl1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeRule__Group__1__Impl_in_rule__AlternativeRule__Group__11114 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__AlternativeRule__Group__2_in_rule__AlternativeRule__Group__11117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeRule__IdAssignment_1_in_rule__AlternativeRule__Group__1__Impl1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeRule__Group__2__Impl_in_rule__AlternativeRule__Group__21174 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__AlternativeRule__Group__3_in_rule__AlternativeRule__Group__21177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__AlternativeRule__Group__2__Impl1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeRule__Group__3__Impl_in_rule__AlternativeRule__Group__31236 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__AlternativeRule__Group__4_in_rule__AlternativeRule__Group__31239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeRule__AlternatvesAssignment_3_in_rule__AlternativeRule__Group__3__Impl1268 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__AlternativeRule__AlternatvesAssignment_3_in_rule__AlternativeRule__Group__3__Impl1280 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__AlternativeRule__Group__4__Impl_in_rule__AlternativeRule__Group__41313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AlternativeRule__Group__4__Impl1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__0__Impl_in_rule__VideoSeq__Group__01382 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__1_in_rule__VideoSeq__Group__01385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__VideoSeq__Group__0__Impl1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__1__Impl_in_rule__VideoSeq__Group__11444 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__2_in_rule__VideoSeq__Group__11447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__IdAssignment_1_in_rule__VideoSeq__Group__1__Impl1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__2__Impl_in_rule__VideoSeq__Group__21505 = new BitSet(new long[]{0x0000000000340000L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__3_in_rule__VideoSeq__Group__21508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__UrlAssignment_2_in_rule__VideoSeq__Group__2__Impl1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__3__Impl_in_rule__VideoSeq__Group__31565 = new BitSet(new long[]{0x0000000000340000L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__4_in_rule__VideoSeq__Group__31568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_3__0_in_rule__VideoSeq__Group__3__Impl1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__4__Impl_in_rule__VideoSeq__Group__41626 = new BitSet(new long[]{0x0000000000340000L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__5_in_rule__VideoSeq__Group__41629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_4__0_in_rule__VideoSeq__Group__4__Impl1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__5__Impl_in_rule__VideoSeq__Group__51687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_5__0_in_rule__VideoSeq__Group__5__Impl1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_3__0__Impl_in_rule__VideoSeq__Group_3__01757 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_3__1_in_rule__VideoSeq__Group_3__01760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__VideoSeq__Group_3__0__Impl1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_3__1__Impl_in_rule__VideoSeq__Group_3__11819 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_3__2_in_rule__VideoSeq__Group_3__11822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__VideoSeq__Group_3__1__Impl1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_3__2__Impl_in_rule__VideoSeq__Group_3__21881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__DescriptionAssignment_3_2_in_rule__VideoSeq__Group_3__2__Impl1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_4__0__Impl_in_rule__VideoSeq__Group_4__01944 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_4__1_in_rule__VideoSeq__Group_4__01947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__VideoSeq__Group_4__0__Impl1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_4__1__Impl_in_rule__VideoSeq__Group_4__12006 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_4__2_in_rule__VideoSeq__Group_4__12009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__VideoSeq__Group_4__1__Impl2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_4__2__Impl_in_rule__VideoSeq__Group_4__22068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__ProprobabilitePercentAssignment_4_2_in_rule__VideoSeq__Group_4__2__Impl2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_5__0__Impl_in_rule__VideoSeq__Group_5__02131 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_5__1_in_rule__VideoSeq__Group_5__02134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VideoSeq__Group_5__0__Impl2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_5__1__Impl_in_rule__VideoSeq__Group_5__12193 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_5__2_in_rule__VideoSeq__Group_5__12196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__VideoSeq__Group_5__1__Impl2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_5__2__Impl_in_rule__VideoSeq__Group_5__22255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__DureeSecondeAssignment_5_2_in_rule__VideoSeq__Group_5__2__Impl2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__Group__0__Impl_in_rule__VideoSeqMandatory__Group__02318 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__Group__1_in_rule__VideoSeqMandatory__Group__02321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__VideoSeqMandatory__Group__0__Impl2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__Group__1__Impl_in_rule__VideoSeqMandatory__Group__12380 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__Group__2_in_rule__VideoSeqMandatory__Group__12383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__IdAssignment_1_in_rule__VideoSeqMandatory__Group__1__Impl2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__Group__2__Impl_in_rule__VideoSeqMandatory__Group__22441 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__Group__3_in_rule__VideoSeqMandatory__Group__22444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__UrlAssignment_2_in_rule__VideoSeqMandatory__Group__2__Impl2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__Group__3__Impl_in_rule__VideoSeqMandatory__Group__32501 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__Group__4_in_rule__VideoSeqMandatory__Group__32504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__Group_3__0_in_rule__VideoSeqMandatory__Group__3__Impl2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__Group__4__Impl_in_rule__VideoSeqMandatory__Group__42562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__Group_4__0_in_rule__VideoSeqMandatory__Group__4__Impl2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__Group_3__0__Impl_in_rule__VideoSeqMandatory__Group_3__02630 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__Group_3__1_in_rule__VideoSeqMandatory__Group_3__02633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__VideoSeqMandatory__Group_3__0__Impl2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__Group_3__1__Impl_in_rule__VideoSeqMandatory__Group_3__12692 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__Group_3__2_in_rule__VideoSeqMandatory__Group_3__12695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__VideoSeqMandatory__Group_3__1__Impl2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__Group_3__2__Impl_in_rule__VideoSeqMandatory__Group_3__22754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__DescriptionAssignment_3_2_in_rule__VideoSeqMandatory__Group_3__2__Impl2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__Group_4__0__Impl_in_rule__VideoSeqMandatory__Group_4__02817 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__Group_4__1_in_rule__VideoSeqMandatory__Group_4__02820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VideoSeqMandatory__Group_4__0__Impl2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__Group_4__1__Impl_in_rule__VideoSeqMandatory__Group_4__12879 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__Group_4__2_in_rule__VideoSeqMandatory__Group_4__12882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__VideoSeqMandatory__Group_4__1__Impl2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__Group_4__2__Impl_in_rule__VideoSeqMandatory__Group_4__22941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeqMandatory__DureeSecondeAssignment_4_2_in_rule__VideoSeqMandatory__Group_4__2__Impl2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideo_in_rule__VideoGen__VideosAssignment_23009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoSeqMandatory_in_rule__MandatoryRule__SeqAssignment_13040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_rule__OptionnalRule__SeqAssignment_13071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AlternativeRule__IdAssignment_13102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_rule__AlternativeRule__AlternatvesAssignment_33133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VideoSeq__IdAssignment_13164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__VideoSeq__UrlAssignment_23195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__VideoSeq__DescriptionAssignment_3_23226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__VideoSeq__ProprobabilitePercentAssignment_4_23257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__VideoSeq__DureeSecondeAssignment_5_23288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VideoSeqMandatory__IdAssignment_13319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__VideoSeqMandatory__UrlAssignment_23350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__VideoSeqMandatory__DescriptionAssignment_3_23381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__VideoSeqMandatory__DureeSecondeAssignment_4_23412 = new BitSet(new long[]{0x0000000000000002L});

}