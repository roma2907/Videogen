/*
 * generated by Xtext
 */
grammar InternalVideoGen;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.xtext.example.mydsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleVideoGen
entryRuleVideoGen 
:
{ before(grammarAccess.getVideoGenRule()); }
	 ruleVideoGen
{ after(grammarAccess.getVideoGenRule()); } 
	 EOF 
;

// Rule VideoGen
ruleVideoGen
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getVideoGenAccess().getGroup()); }
(rule__VideoGen__Group__0)
{ after(grammarAccess.getVideoGenAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleVideo
entryRuleVideo 
:
{ before(grammarAccess.getVideoRule()); }
	 ruleVideo
{ after(grammarAccess.getVideoRule()); } 
	 EOF 
;

// Rule Video
ruleVideo
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getVideoAccess().getAlternatives()); }
(rule__Video__Alternatives)
{ after(grammarAccess.getVideoAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMandatoryRule
entryRuleMandatoryRule 
:
{ before(grammarAccess.getMandatoryRuleRule()); }
	 ruleMandatoryRule
{ after(grammarAccess.getMandatoryRuleRule()); } 
	 EOF 
;

// Rule MandatoryRule
ruleMandatoryRule
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMandatoryRuleAccess().getGroup()); }
(rule__MandatoryRule__Group__0)
{ after(grammarAccess.getMandatoryRuleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleOptionnalRule
entryRuleOptionnalRule 
:
{ before(grammarAccess.getOptionnalRuleRule()); }
	 ruleOptionnalRule
{ after(grammarAccess.getOptionnalRuleRule()); } 
	 EOF 
;

// Rule OptionnalRule
ruleOptionnalRule
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getOptionnalRuleAccess().getGroup()); }
(rule__OptionnalRule__Group__0)
{ after(grammarAccess.getOptionnalRuleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAlternativeRule
entryRuleAlternativeRule 
:
{ before(grammarAccess.getAlternativeRuleRule()); }
	 ruleAlternativeRule
{ after(grammarAccess.getAlternativeRuleRule()); } 
	 EOF 
;

// Rule AlternativeRule
ruleAlternativeRule
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAlternativeRuleAccess().getGroup()); }
(rule__AlternativeRule__Group__0)
{ after(grammarAccess.getAlternativeRuleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleVideoSeq
entryRuleVideoSeq 
:
{ before(grammarAccess.getVideoSeqRule()); }
	 ruleVideoSeq
{ after(grammarAccess.getVideoSeqRule()); } 
	 EOF 
;

// Rule VideoSeq
ruleVideoSeq
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getVideoSeqAccess().getGroup()); }
(rule__VideoSeq__Group__0)
{ after(grammarAccess.getVideoSeqAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleVideoSeqMandatory
entryRuleVideoSeqMandatory 
:
{ before(grammarAccess.getVideoSeqMandatoryRule()); }
	 ruleVideoSeqMandatory
{ after(grammarAccess.getVideoSeqMandatoryRule()); } 
	 EOF 
;

// Rule VideoSeqMandatory
ruleVideoSeqMandatory
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getVideoSeqMandatoryAccess().getGroup()); }
(rule__VideoSeqMandatory__Group__0)
{ after(grammarAccess.getVideoSeqMandatoryAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Video__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoAccess().getMandatoryRuleParserRuleCall_0()); }
	ruleMandatoryRule
{ after(grammarAccess.getVideoAccess().getMandatoryRuleParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getVideoAccess().getOptionnalRuleParserRuleCall_1()); }
	ruleOptionnalRule
{ after(grammarAccess.getVideoAccess().getOptionnalRuleParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getVideoAccess().getAlternativeRuleParserRuleCall_2()); }
	ruleAlternativeRule
{ after(grammarAccess.getVideoAccess().getAlternativeRuleParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__VideoGen__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoGen__Group__0__Impl
	rule__VideoGen__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoGen__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoGenAccess().getVideoGenKeyword_0()); }

	'VideoGen' 

{ after(grammarAccess.getVideoGenAccess().getVideoGenKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VideoGen__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoGen__Group__1__Impl
	rule__VideoGen__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoGen__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoGenAccess().getLeftCurlyBracketKeyword_1()); }

	'{' 

{ after(grammarAccess.getVideoGenAccess().getLeftCurlyBracketKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VideoGen__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoGen__Group__2__Impl
	rule__VideoGen__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoGen__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoGenAccess().getVideosAssignment_2()); }
(rule__VideoGen__VideosAssignment_2)*
{ after(grammarAccess.getVideoGenAccess().getVideosAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VideoGen__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoGen__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoGen__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoGenAccess().getRightCurlyBracketKeyword_3()); }

	'}' 

{ after(grammarAccess.getVideoGenAccess().getRightCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MandatoryRule__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MandatoryRule__Group__0__Impl
	rule__MandatoryRule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MandatoryRule__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMandatoryRuleAccess().getMandatoryKeyword_0()); }

	'mandatory' 

{ after(grammarAccess.getMandatoryRuleAccess().getMandatoryKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MandatoryRule__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MandatoryRule__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MandatoryRule__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMandatoryRuleAccess().getSeqAssignment_1()); }
(rule__MandatoryRule__SeqAssignment_1)
{ after(grammarAccess.getMandatoryRuleAccess().getSeqAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__OptionnalRule__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OptionnalRule__Group__0__Impl
	rule__OptionnalRule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionnalRule__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOptionnalRuleAccess().getOptionalKeyword_0()); }

	'optional' 

{ after(grammarAccess.getOptionnalRuleAccess().getOptionalKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OptionnalRule__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OptionnalRule__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionnalRule__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOptionnalRuleAccess().getSeqAssignment_1()); }
(rule__OptionnalRule__SeqAssignment_1)
{ after(grammarAccess.getOptionnalRuleAccess().getSeqAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__AlternativeRule__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AlternativeRule__Group__0__Impl
	rule__AlternativeRule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternativeRule__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAlternativeRuleAccess().getAlternativesKeyword_0()); }

	'alternatives' 

{ after(grammarAccess.getAlternativeRuleAccess().getAlternativesKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AlternativeRule__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AlternativeRule__Group__1__Impl
	rule__AlternativeRule__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternativeRule__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAlternativeRuleAccess().getIdAssignment_1()); }
(rule__AlternativeRule__IdAssignment_1)
{ after(grammarAccess.getAlternativeRuleAccess().getIdAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AlternativeRule__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AlternativeRule__Group__2__Impl
	rule__AlternativeRule__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternativeRule__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAlternativeRuleAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getAlternativeRuleAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AlternativeRule__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AlternativeRule__Group__3__Impl
	rule__AlternativeRule__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternativeRule__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getAlternativeRuleAccess().getAlternativesAssignment_3()); }
(rule__AlternativeRule__AlternativesAssignment_3)
{ after(grammarAccess.getAlternativeRuleAccess().getAlternativesAssignment_3()); }
)
(
{ before(grammarAccess.getAlternativeRuleAccess().getAlternativesAssignment_3()); }
(rule__AlternativeRule__AlternativesAssignment_3)*
{ after(grammarAccess.getAlternativeRuleAccess().getAlternativesAssignment_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AlternativeRule__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AlternativeRule__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternativeRule__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAlternativeRuleAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getAlternativeRuleAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__VideoSeq__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeq__Group__0__Impl
	rule__VideoSeq__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeq__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqAccess().getVideoseqKeyword_0()); }

	'videoseq' 

{ after(grammarAccess.getVideoSeqAccess().getVideoseqKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VideoSeq__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeq__Group__1__Impl
	rule__VideoSeq__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeq__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqAccess().getIdAssignment_1()); }
(rule__VideoSeq__IdAssignment_1)?
{ after(grammarAccess.getVideoSeqAccess().getIdAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VideoSeq__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeq__Group__2__Impl
	rule__VideoSeq__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeq__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqAccess().getUrlAssignment_2()); }
(rule__VideoSeq__UrlAssignment_2)
{ after(grammarAccess.getVideoSeqAccess().getUrlAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VideoSeq__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeq__Group__3__Impl
	rule__VideoSeq__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeq__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqAccess().getGroup_3()); }
(rule__VideoSeq__Group_3__0)?
{ after(grammarAccess.getVideoSeqAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VideoSeq__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeq__Group__4__Impl
	rule__VideoSeq__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeq__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqAccess().getGroup_4()); }
(rule__VideoSeq__Group_4__0)?
{ after(grammarAccess.getVideoSeqAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VideoSeq__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeq__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeq__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqAccess().getGroup_5()); }
(rule__VideoSeq__Group_5__0)?
{ after(grammarAccess.getVideoSeqAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__VideoSeq__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeq__Group_3__0__Impl
	rule__VideoSeq__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeq__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqAccess().getDescriptionKeyword_3_0()); }

	'description' 

{ after(grammarAccess.getVideoSeqAccess().getDescriptionKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VideoSeq__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeq__Group_3__1__Impl
	rule__VideoSeq__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeq__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqAccess().getColonKeyword_3_1()); }

	':' 

{ after(grammarAccess.getVideoSeqAccess().getColonKeyword_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VideoSeq__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeq__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeq__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqAccess().getDescriptionAssignment_3_2()); }
(rule__VideoSeq__DescriptionAssignment_3_2)
{ after(grammarAccess.getVideoSeqAccess().getDescriptionAssignment_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__VideoSeq__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeq__Group_4__0__Impl
	rule__VideoSeq__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeq__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqAccess().getProbabilityKeyword_4_0()); }

	'probability' 

{ after(grammarAccess.getVideoSeqAccess().getProbabilityKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VideoSeq__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeq__Group_4__1__Impl
	rule__VideoSeq__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeq__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqAccess().getColonKeyword_4_1()); }

	':' 

{ after(grammarAccess.getVideoSeqAccess().getColonKeyword_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VideoSeq__Group_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeq__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeq__Group_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqAccess().getProprobabilitePercentAssignment_4_2()); }
(rule__VideoSeq__ProprobabilitePercentAssignment_4_2)
{ after(grammarAccess.getVideoSeqAccess().getProprobabilitePercentAssignment_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__VideoSeq__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeq__Group_5__0__Impl
	rule__VideoSeq__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeq__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqAccess().getDurationKeyword_5_0()); }

	'duration' 

{ after(grammarAccess.getVideoSeqAccess().getDurationKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VideoSeq__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeq__Group_5__1__Impl
	rule__VideoSeq__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeq__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqAccess().getColonKeyword_5_1()); }

	':' 

{ after(grammarAccess.getVideoSeqAccess().getColonKeyword_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VideoSeq__Group_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeq__Group_5__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeq__Group_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqAccess().getDureeSecondeAssignment_5_2()); }
(rule__VideoSeq__DureeSecondeAssignment_5_2)
{ after(grammarAccess.getVideoSeqAccess().getDureeSecondeAssignment_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__VideoSeqMandatory__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeqMandatory__Group__0__Impl
	rule__VideoSeqMandatory__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeqMandatory__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqMandatoryAccess().getVideoseqKeyword_0()); }

	'videoseq' 

{ after(grammarAccess.getVideoSeqMandatoryAccess().getVideoseqKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VideoSeqMandatory__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeqMandatory__Group__1__Impl
	rule__VideoSeqMandatory__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeqMandatory__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqMandatoryAccess().getIdAssignment_1()); }
(rule__VideoSeqMandatory__IdAssignment_1)?
{ after(grammarAccess.getVideoSeqMandatoryAccess().getIdAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VideoSeqMandatory__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeqMandatory__Group__2__Impl
	rule__VideoSeqMandatory__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeqMandatory__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqMandatoryAccess().getUrlAssignment_2()); }
(rule__VideoSeqMandatory__UrlAssignment_2)
{ after(grammarAccess.getVideoSeqMandatoryAccess().getUrlAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VideoSeqMandatory__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeqMandatory__Group__3__Impl
	rule__VideoSeqMandatory__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeqMandatory__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqMandatoryAccess().getGroup_3()); }
(rule__VideoSeqMandatory__Group_3__0)?
{ after(grammarAccess.getVideoSeqMandatoryAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VideoSeqMandatory__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeqMandatory__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeqMandatory__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqMandatoryAccess().getGroup_4()); }
(rule__VideoSeqMandatory__Group_4__0)?
{ after(grammarAccess.getVideoSeqMandatoryAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__VideoSeqMandatory__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeqMandatory__Group_3__0__Impl
	rule__VideoSeqMandatory__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeqMandatory__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqMandatoryAccess().getDescriptionKeyword_3_0()); }

	'description' 

{ after(grammarAccess.getVideoSeqMandatoryAccess().getDescriptionKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VideoSeqMandatory__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeqMandatory__Group_3__1__Impl
	rule__VideoSeqMandatory__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeqMandatory__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqMandatoryAccess().getColonKeyword_3_1()); }

	':' 

{ after(grammarAccess.getVideoSeqMandatoryAccess().getColonKeyword_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VideoSeqMandatory__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeqMandatory__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeqMandatory__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqMandatoryAccess().getDescriptionAssignment_3_2()); }
(rule__VideoSeqMandatory__DescriptionAssignment_3_2)
{ after(grammarAccess.getVideoSeqMandatoryAccess().getDescriptionAssignment_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__VideoSeqMandatory__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeqMandatory__Group_4__0__Impl
	rule__VideoSeqMandatory__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeqMandatory__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqMandatoryAccess().getDurationKeyword_4_0()); }

	'duration' 

{ after(grammarAccess.getVideoSeqMandatoryAccess().getDurationKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VideoSeqMandatory__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeqMandatory__Group_4__1__Impl
	rule__VideoSeqMandatory__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeqMandatory__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqMandatoryAccess().getColonKeyword_4_1()); }

	':' 

{ after(grammarAccess.getVideoSeqMandatoryAccess().getColonKeyword_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VideoSeqMandatory__Group_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VideoSeqMandatory__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeqMandatory__Group_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqMandatoryAccess().getDureeSecondeAssignment_4_2()); }
(rule__VideoSeqMandatory__DureeSecondeAssignment_4_2)
{ after(grammarAccess.getVideoSeqMandatoryAccess().getDureeSecondeAssignment_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__VideoGen__VideosAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoGenAccess().getVideosVideoParserRuleCall_2_0()); }
	ruleVideo{ after(grammarAccess.getVideoGenAccess().getVideosVideoParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MandatoryRule__SeqAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMandatoryRuleAccess().getSeqVideoSeqMandatoryParserRuleCall_1_0()); }
	ruleVideoSeqMandatory{ after(grammarAccess.getMandatoryRuleAccess().getSeqVideoSeqMandatoryParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__OptionnalRule__SeqAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOptionnalRuleAccess().getSeqVideoSeqParserRuleCall_1_0()); }
	ruleVideoSeq{ after(grammarAccess.getOptionnalRuleAccess().getSeqVideoSeqParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AlternativeRule__IdAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAlternativeRuleAccess().getIdIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getAlternativeRuleAccess().getIdIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AlternativeRule__AlternativesAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAlternativeRuleAccess().getAlternativesVideoSeqParserRuleCall_3_0()); }
	ruleVideoSeq{ after(grammarAccess.getAlternativeRuleAccess().getAlternativesVideoSeqParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeq__IdAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqAccess().getIdIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getVideoSeqAccess().getIdIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeq__UrlAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqAccess().getUrlSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getVideoSeqAccess().getUrlSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeq__DescriptionAssignment_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqAccess().getDescriptionSTRINGTerminalRuleCall_3_2_0()); }
	RULE_STRING{ after(grammarAccess.getVideoSeqAccess().getDescriptionSTRINGTerminalRuleCall_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeq__ProprobabilitePercentAssignment_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqAccess().getProprobabilitePercentINTTerminalRuleCall_4_2_0()); }
	RULE_INT{ after(grammarAccess.getVideoSeqAccess().getProprobabilitePercentINTTerminalRuleCall_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeq__DureeSecondeAssignment_5_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqAccess().getDureeSecondeINTTerminalRuleCall_5_2_0()); }
	RULE_INT{ after(grammarAccess.getVideoSeqAccess().getDureeSecondeINTTerminalRuleCall_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeqMandatory__IdAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqMandatoryAccess().getIdIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getVideoSeqMandatoryAccess().getIdIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeqMandatory__UrlAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqMandatoryAccess().getUrlSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getVideoSeqMandatoryAccess().getUrlSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeqMandatory__DescriptionAssignment_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqMandatoryAccess().getDescriptionSTRINGTerminalRuleCall_3_2_0()); }
	RULE_STRING{ after(grammarAccess.getVideoSeqMandatoryAccess().getDescriptionSTRINGTerminalRuleCall_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VideoSeqMandatory__DureeSecondeAssignment_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVideoSeqMandatoryAccess().getDureeSecondeINTTerminalRuleCall_4_2_0()); }
	RULE_INT{ after(grammarAccess.getVideoSeqMandatoryAccess().getDureeSecondeINTTerminalRuleCall_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


