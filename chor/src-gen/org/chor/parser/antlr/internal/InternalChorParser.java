package org.chor.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.chor.services.ChorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SEMICOLON", "RULE_LCURLY", "RULE_RCURLY", "RULE_LPAREN", "RULE_COMMA", "RULE_RPAREN", "RULE_LSQUARE", "RULE_COLON", "RULE_RSQUARE", "RULE_ARROW", "RULE_AT", "RULE_DOT", "RULE_ASSIGN", "RULE_PLUS", "RULE_MINUS", "RULE_INT", "RULE_STRING", "RULE_LESS", "RULE_EQUAL", "RULE_GREATER", "RULE_NOT_EQUAL", "RULE_TIMES", "RULE_VERT", "RULE_QUESTION_MARK", "RULE_BANG", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'main'", "'define'", "'protocol'", "'public'", "'int'", "'string'", "'bool'", "'void'", "'start'", "'if'", "'else'", "'ask'", "'show'", "'local'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_SEMICOLON=5;
    public static final int RULE_ANY_OTHER=33;
    public static final int RULE_NOT_EQUAL=25;
    public static final int EOF=-1;
    public static final int RULE_RSQUARE=13;
    public static final int RULE_ASSIGN=17;
    public static final int RULE_DOT=16;
    public static final int RULE_LPAREN=8;
    public static final int RULE_INT=20;
    public static final int RULE_VERT=27;
    public static final int RULE_LSQUARE=11;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_BANG=29;
    public static final int T__40=40;
    public static final int RULE_GREATER=24;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int RULE_PLUS=18;
    public static final int RULE_COMMA=9;
    public static final int RULE_EQUAL=23;
    public static final int RULE_SL_COMMENT=31;
    public static final int RULE_QUESTION_MARK=28;
    public static final int RULE_TIMES=26;
    public static final int RULE_ML_COMMENT=30;
    public static final int RULE_COLON=12;
    public static final int RULE_MINUS=19;
    public static final int RULE_STRING=21;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_ARROW=14;
    public static final int RULE_LESS=22;
    public static final int RULE_RPAREN=10;
    public static final int RULE_WS=32;
    public static final int RULE_RCURLY=7;
    public static final int RULE_AT=15;
    public static final int RULE_LCURLY=6;

    // delegates
    // delegators


        public InternalChorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalChorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalChorParser.tokenNames; }
    public String getGrammarFileName() { return "../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g"; }



     	private ChorGrammarAccess grammarAccess;
     	
        public InternalChorParser(TokenStream input, ChorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected ChorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:67:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:68:2: (iv_ruleProgram= ruleProgram EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:69:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:76:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_preamble_3_0= rulePreamble ) ) ( (lv_procedures_4_0= ruleProcedure ) )* otherlv_5= 'main' this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_SEMICOLON_2=null;
        Token otherlv_5=null;
        Token this_LCURLY_6=null;
        Token this_RCURLY_8=null;
        EObject lv_preamble_3_0 = null;

        EObject lv_procedures_4_0 = null;

        EObject lv_choreography_7_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:79:28: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_preamble_3_0= rulePreamble ) ) ( (lv_procedures_4_0= ruleProcedure ) )* otherlv_5= 'main' this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:80:1: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_preamble_3_0= rulePreamble ) ) ( (lv_procedures_4_0= ruleProcedure ) )* otherlv_5= 'main' this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:80:1: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_preamble_3_0= rulePreamble ) ) ( (lv_procedures_4_0= ruleProcedure ) )* otherlv_5= 'main' this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:80:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_preamble_3_0= rulePreamble ) ) ( (lv_procedures_4_0= ruleProcedure ) )* otherlv_5= 'main' this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleProgram122); 

                	newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:85:1: (lv_name_1_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProgram139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProgramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            this_SEMICOLON_2=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleProgram155); 
             
                newLeafNode(this_SEMICOLON_2, grammarAccess.getProgramAccess().getSEMICOLONTerminalRuleCall_2()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:106:1: ( (lv_preamble_3_0= rulePreamble ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:107:1: (lv_preamble_3_0= rulePreamble )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:107:1: (lv_preamble_3_0= rulePreamble )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:108:3: lv_preamble_3_0= rulePreamble
            {
             
            	        newCompositeNode(grammarAccess.getProgramAccess().getPreamblePreambleParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulePreamble_in_ruleProgram175);
            lv_preamble_3_0=rulePreamble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	        }
                   		set(
                   			current, 
                   			"preamble",
                    		lv_preamble_3_0, 
                    		"Preamble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:124:2: ( (lv_procedures_4_0= ruleProcedure ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==36) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:125:1: (lv_procedures_4_0= ruleProcedure )
            	    {
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:125:1: (lv_procedures_4_0= ruleProcedure )
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:126:3: lv_procedures_4_0= ruleProcedure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getProceduresProcedureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcedure_in_ruleProgram196);
            	    lv_procedures_4_0=ruleProcedure();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"procedures",
            	            		lv_procedures_4_0, 
            	            		"Procedure");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleProgram209); 

                	newLeafNode(otherlv_5, grammarAccess.getProgramAccess().getMainKeyword_5());
                
            this_LCURLY_6=(Token)match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleProgram220); 
             
                newLeafNode(this_LCURLY_6, grammarAccess.getProgramAccess().getLCURLYTerminalRuleCall_6()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:150:1: ( (lv_choreography_7_0= ruleChoreography ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:151:1: (lv_choreography_7_0= ruleChoreography )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:151:1: (lv_choreography_7_0= ruleChoreography )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:152:3: lv_choreography_7_0= ruleChoreography
            {
             
            	        newCompositeNode(grammarAccess.getProgramAccess().getChoreographyChoreographyParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleChoreography_in_ruleProgram240);
            lv_choreography_7_0=ruleChoreography();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	        }
                   		set(
                   			current, 
                   			"choreography",
                    		lv_choreography_7_0, 
                    		"Choreography");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_RCURLY_8=(Token)match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleProgram251); 
             
                newLeafNode(this_RCURLY_8, grammarAccess.getProgramAccess().getRCURLYTerminalRuleCall_8()); 
                

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRulePreamble"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:180:1: entryRulePreamble returns [EObject current=null] : iv_rulePreamble= rulePreamble EOF ;
    public final EObject entryRulePreamble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreamble = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:181:2: (iv_rulePreamble= rulePreamble EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:182:2: iv_rulePreamble= rulePreamble EOF
            {
             newCompositeNode(grammarAccess.getPreambleRule()); 
            pushFollow(FOLLOW_rulePreamble_in_entryRulePreamble286);
            iv_rulePreamble=rulePreamble();

            state._fsp--;

             current =iv_rulePreamble; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreamble296); 

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
    // $ANTLR end "entryRulePreamble"


    // $ANTLR start "rulePreamble"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:189:1: rulePreamble returns [EObject current=null] : ( () ( ( (lv_protocols_1_0= ruleProtocol ) ) | ( (lv_site_2_0= ruleSite ) ) )* ) ;
    public final EObject rulePreamble() throws RecognitionException {
        EObject current = null;

        EObject lv_protocols_1_0 = null;

        EObject lv_site_2_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:192:28: ( ( () ( ( (lv_protocols_1_0= ruleProtocol ) ) | ( (lv_site_2_0= ruleSite ) ) )* ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:193:1: ( () ( ( (lv_protocols_1_0= ruleProtocol ) ) | ( (lv_site_2_0= ruleSite ) ) )* )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:193:1: ( () ( ( (lv_protocols_1_0= ruleProtocol ) ) | ( (lv_site_2_0= ruleSite ) ) )* )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:193:2: () ( ( (lv_protocols_1_0= ruleProtocol ) ) | ( (lv_site_2_0= ruleSite ) ) )*
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:193:2: ()
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:194:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPreambleAccess().getPreambleAction_0(),
                        current);
                

            }

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:199:2: ( ( (lv_protocols_1_0= ruleProtocol ) ) | ( (lv_site_2_0= ruleSite ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==37) ) {
                    alt2=1;
                }
                else if ( (LA2_0==38) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:199:3: ( (lv_protocols_1_0= ruleProtocol ) )
            	    {
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:199:3: ( (lv_protocols_1_0= ruleProtocol ) )
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:200:1: (lv_protocols_1_0= ruleProtocol )
            	    {
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:200:1: (lv_protocols_1_0= ruleProtocol )
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:201:3: lv_protocols_1_0= ruleProtocol
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPreambleAccess().getProtocolsProtocolParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProtocol_in_rulePreamble352);
            	    lv_protocols_1_0=ruleProtocol();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPreambleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"protocols",
            	            		lv_protocols_1_0, 
            	            		"Protocol");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:218:6: ( (lv_site_2_0= ruleSite ) )
            	    {
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:218:6: ( (lv_site_2_0= ruleSite ) )
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:219:1: (lv_site_2_0= ruleSite )
            	    {
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:219:1: (lv_site_2_0= ruleSite )
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:220:3: lv_site_2_0= ruleSite
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPreambleAccess().getSiteSiteParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSite_in_rulePreamble379);
            	    lv_site_2_0=ruleSite();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPreambleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"site",
            	            		lv_site_2_0, 
            	            		"Site");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "rulePreamble"


    // $ANTLR start "entryRuleProcedure"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:244:1: entryRuleProcedure returns [EObject current=null] : iv_ruleProcedure= ruleProcedure EOF ;
    public final EObject entryRuleProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedure = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:245:2: (iv_ruleProcedure= ruleProcedure EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:246:2: iv_ruleProcedure= ruleProcedure EOF
            {
             newCompositeNode(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_ruleProcedure_in_entryRuleProcedure417);
            iv_ruleProcedure=ruleProcedure();

            state._fsp--;

             current =iv_ruleProcedure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcedure427); 

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
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:253:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) this_LPAREN_2= RULE_LPAREN ( (lv_threadParameters_3_0= RULE_ID ) ) (this_COMMA_4= RULE_COMMA ( (lv_threadParameters_5_0= RULE_ID ) ) )* this_RPAREN_6= RULE_RPAREN this_LPAREN_7= RULE_LPAREN ( ( (lv_sessionParameters_8_0= ruleSessionProcedureParameter ) ) (this_COMMA_9= RULE_COMMA ( (lv_sessionParameters_10_0= ruleSessionProcedureParameter ) ) )* )? this_RPAREN_11= RULE_RPAREN this_LCURLY_12= RULE_LCURLY ( (lv_choreography_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY ) ;
    public final EObject ruleProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_LPAREN_2=null;
        Token lv_threadParameters_3_0=null;
        Token this_COMMA_4=null;
        Token lv_threadParameters_5_0=null;
        Token this_RPAREN_6=null;
        Token this_LPAREN_7=null;
        Token this_COMMA_9=null;
        Token this_RPAREN_11=null;
        Token this_LCURLY_12=null;
        Token this_RCURLY_14=null;
        EObject lv_sessionParameters_8_0 = null;

        EObject lv_sessionParameters_10_0 = null;

        EObject lv_choreography_13_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:256:28: ( (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) this_LPAREN_2= RULE_LPAREN ( (lv_threadParameters_3_0= RULE_ID ) ) (this_COMMA_4= RULE_COMMA ( (lv_threadParameters_5_0= RULE_ID ) ) )* this_RPAREN_6= RULE_RPAREN this_LPAREN_7= RULE_LPAREN ( ( (lv_sessionParameters_8_0= ruleSessionProcedureParameter ) ) (this_COMMA_9= RULE_COMMA ( (lv_sessionParameters_10_0= ruleSessionProcedureParameter ) ) )* )? this_RPAREN_11= RULE_RPAREN this_LCURLY_12= RULE_LCURLY ( (lv_choreography_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:257:1: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) this_LPAREN_2= RULE_LPAREN ( (lv_threadParameters_3_0= RULE_ID ) ) (this_COMMA_4= RULE_COMMA ( (lv_threadParameters_5_0= RULE_ID ) ) )* this_RPAREN_6= RULE_RPAREN this_LPAREN_7= RULE_LPAREN ( ( (lv_sessionParameters_8_0= ruleSessionProcedureParameter ) ) (this_COMMA_9= RULE_COMMA ( (lv_sessionParameters_10_0= ruleSessionProcedureParameter ) ) )* )? this_RPAREN_11= RULE_RPAREN this_LCURLY_12= RULE_LCURLY ( (lv_choreography_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:257:1: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) this_LPAREN_2= RULE_LPAREN ( (lv_threadParameters_3_0= RULE_ID ) ) (this_COMMA_4= RULE_COMMA ( (lv_threadParameters_5_0= RULE_ID ) ) )* this_RPAREN_6= RULE_RPAREN this_LPAREN_7= RULE_LPAREN ( ( (lv_sessionParameters_8_0= ruleSessionProcedureParameter ) ) (this_COMMA_9= RULE_COMMA ( (lv_sessionParameters_10_0= ruleSessionProcedureParameter ) ) )* )? this_RPAREN_11= RULE_RPAREN this_LCURLY_12= RULE_LCURLY ( (lv_choreography_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:257:3: otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) this_LPAREN_2= RULE_LPAREN ( (lv_threadParameters_3_0= RULE_ID ) ) (this_COMMA_4= RULE_COMMA ( (lv_threadParameters_5_0= RULE_ID ) ) )* this_RPAREN_6= RULE_RPAREN this_LPAREN_7= RULE_LPAREN ( ( (lv_sessionParameters_8_0= ruleSessionProcedureParameter ) ) (this_COMMA_9= RULE_COMMA ( (lv_sessionParameters_10_0= ruleSessionProcedureParameter ) ) )* )? this_RPAREN_11= RULE_RPAREN this_LCURLY_12= RULE_LCURLY ( (lv_choreography_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleProcedure464); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedureAccess().getDefineKeyword_0());
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:261:1: ( (lv_name_1_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:262:1: (lv_name_1_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:262:1: (lv_name_1_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:263:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcedure481); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcedureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            this_LPAREN_2=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleProcedure497); 
             
                newLeafNode(this_LPAREN_2, grammarAccess.getProcedureAccess().getLPARENTerminalRuleCall_2()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:283:1: ( (lv_threadParameters_3_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:284:1: (lv_threadParameters_3_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:284:1: (lv_threadParameters_3_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:285:3: lv_threadParameters_3_0= RULE_ID
            {
            lv_threadParameters_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcedure513); 

            			newLeafNode(lv_threadParameters_3_0, grammarAccess.getProcedureAccess().getThreadParametersIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcedureRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"threadParameters",
                    		lv_threadParameters_3_0, 
                    		"ID");
            	    

            }


            }

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:301:2: (this_COMMA_4= RULE_COMMA ( (lv_threadParameters_5_0= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_COMMA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:301:3: this_COMMA_4= RULE_COMMA ( (lv_threadParameters_5_0= RULE_ID ) )
            	    {
            	    this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleProcedure530); 
            	     
            	        newLeafNode(this_COMMA_4, grammarAccess.getProcedureAccess().getCOMMATerminalRuleCall_4_0()); 
            	        
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:305:1: ( (lv_threadParameters_5_0= RULE_ID ) )
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:306:1: (lv_threadParameters_5_0= RULE_ID )
            	    {
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:306:1: (lv_threadParameters_5_0= RULE_ID )
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:307:3: lv_threadParameters_5_0= RULE_ID
            	    {
            	    lv_threadParameters_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcedure546); 

            	    			newLeafNode(lv_threadParameters_5_0, grammarAccess.getProcedureAccess().getThreadParametersIDTerminalRuleCall_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProcedureRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"threadParameters",
            	            		lv_threadParameters_5_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            this_RPAREN_6=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleProcedure564); 
             
                newLeafNode(this_RPAREN_6, grammarAccess.getProcedureAccess().getRPARENTerminalRuleCall_5()); 
                
            this_LPAREN_7=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleProcedure574); 
             
                newLeafNode(this_LPAREN_7, grammarAccess.getProcedureAccess().getLPARENTerminalRuleCall_6()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:331:1: ( ( (lv_sessionParameters_8_0= ruleSessionProcedureParameter ) ) (this_COMMA_9= RULE_COMMA ( (lv_sessionParameters_10_0= ruleSessionProcedureParameter ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:331:2: ( (lv_sessionParameters_8_0= ruleSessionProcedureParameter ) ) (this_COMMA_9= RULE_COMMA ( (lv_sessionParameters_10_0= ruleSessionProcedureParameter ) ) )*
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:331:2: ( (lv_sessionParameters_8_0= ruleSessionProcedureParameter ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:332:1: (lv_sessionParameters_8_0= ruleSessionProcedureParameter )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:332:1: (lv_sessionParameters_8_0= ruleSessionProcedureParameter )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:333:3: lv_sessionParameters_8_0= ruleSessionProcedureParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedureAccess().getSessionParametersSessionProcedureParameterParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSessionProcedureParameter_in_ruleProcedure595);
                    lv_sessionParameters_8_0=ruleSessionProcedureParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcedureRule());
                    	        }
                           		add(
                           			current, 
                           			"sessionParameters",
                            		lv_sessionParameters_8_0, 
                            		"SessionProcedureParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:349:2: (this_COMMA_9= RULE_COMMA ( (lv_sessionParameters_10_0= ruleSessionProcedureParameter ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_COMMA) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:349:3: this_COMMA_9= RULE_COMMA ( (lv_sessionParameters_10_0= ruleSessionProcedureParameter ) )
                    	    {
                    	    this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleProcedure607); 
                    	     
                    	        newLeafNode(this_COMMA_9, grammarAccess.getProcedureAccess().getCOMMATerminalRuleCall_7_1_0()); 
                    	        
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:353:1: ( (lv_sessionParameters_10_0= ruleSessionProcedureParameter ) )
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:354:1: (lv_sessionParameters_10_0= ruleSessionProcedureParameter )
                    	    {
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:354:1: (lv_sessionParameters_10_0= ruleSessionProcedureParameter )
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:355:3: lv_sessionParameters_10_0= ruleSessionProcedureParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedureAccess().getSessionParametersSessionProcedureParameterParserRuleCall_7_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSessionProcedureParameter_in_ruleProcedure627);
                    	    lv_sessionParameters_10_0=ruleSessionProcedureParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcedureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sessionParameters",
                    	            		lv_sessionParameters_10_0, 
                    	            		"SessionProcedureParameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            this_RPAREN_11=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleProcedure642); 
             
                newLeafNode(this_RPAREN_11, grammarAccess.getProcedureAccess().getRPARENTerminalRuleCall_8()); 
                
            this_LCURLY_12=(Token)match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleProcedure652); 
             
                newLeafNode(this_LCURLY_12, grammarAccess.getProcedureAccess().getLCURLYTerminalRuleCall_9()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:379:1: ( (lv_choreography_13_0= ruleChoreography ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:380:1: (lv_choreography_13_0= ruleChoreography )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:380:1: (lv_choreography_13_0= ruleChoreography )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:381:3: lv_choreography_13_0= ruleChoreography
            {
             
            	        newCompositeNode(grammarAccess.getProcedureAccess().getChoreographyChoreographyParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleChoreography_in_ruleProcedure672);
            lv_choreography_13_0=ruleChoreography();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProcedureRule());
            	        }
                   		set(
                   			current, 
                   			"choreography",
                    		lv_choreography_13_0, 
                    		"Choreography");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_RCURLY_14=(Token)match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleProcedure683); 
             
                newLeafNode(this_RCURLY_14, grammarAccess.getProcedureAccess().getRCURLYTerminalRuleCall_11()); 
                

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
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleSessionProcedureParameter"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:409:1: entryRuleSessionProcedureParameter returns [EObject current=null] : iv_ruleSessionProcedureParameter= ruleSessionProcedureParameter EOF ;
    public final EObject entryRuleSessionProcedureParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSessionProcedureParameter = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:410:2: (iv_ruleSessionProcedureParameter= ruleSessionProcedureParameter EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:411:2: iv_ruleSessionProcedureParameter= ruleSessionProcedureParameter EOF
            {
             newCompositeNode(grammarAccess.getSessionProcedureParameterRule()); 
            pushFollow(FOLLOW_ruleSessionProcedureParameter_in_entryRuleSessionProcedureParameter718);
            iv_ruleSessionProcedureParameter=ruleSessionProcedureParameter();

            state._fsp--;

             current =iv_ruleSessionProcedureParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSessionProcedureParameter728); 

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
    // $ANTLR end "entryRuleSessionProcedureParameter"


    // $ANTLR start "ruleSessionProcedureParameter"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:418:1: ruleSessionProcedureParameter returns [EObject current=null] : ( ( (lv_session_0_0= RULE_ID ) ) this_LSQUARE_1= RULE_LSQUARE ( (lv_type_2_0= ruleGlobalTypeCall ) ) this_COLON_3= RULE_COLON ( (lv_activeThreads_4_0= ruleThreadWithRole ) ) (this_COMMA_5= RULE_COMMA ( (lv_activeThreads_6_0= ruleThreadWithRole ) ) )* this_RSQUARE_7= RULE_RSQUARE ) ;
    public final EObject ruleSessionProcedureParameter() throws RecognitionException {
        EObject current = null;

        Token lv_session_0_0=null;
        Token this_LSQUARE_1=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token this_RSQUARE_7=null;
        EObject lv_type_2_0 = null;

        EObject lv_activeThreads_4_0 = null;

        EObject lv_activeThreads_6_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:421:28: ( ( ( (lv_session_0_0= RULE_ID ) ) this_LSQUARE_1= RULE_LSQUARE ( (lv_type_2_0= ruleGlobalTypeCall ) ) this_COLON_3= RULE_COLON ( (lv_activeThreads_4_0= ruleThreadWithRole ) ) (this_COMMA_5= RULE_COMMA ( (lv_activeThreads_6_0= ruleThreadWithRole ) ) )* this_RSQUARE_7= RULE_RSQUARE ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:422:1: ( ( (lv_session_0_0= RULE_ID ) ) this_LSQUARE_1= RULE_LSQUARE ( (lv_type_2_0= ruleGlobalTypeCall ) ) this_COLON_3= RULE_COLON ( (lv_activeThreads_4_0= ruleThreadWithRole ) ) (this_COMMA_5= RULE_COMMA ( (lv_activeThreads_6_0= ruleThreadWithRole ) ) )* this_RSQUARE_7= RULE_RSQUARE )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:422:1: ( ( (lv_session_0_0= RULE_ID ) ) this_LSQUARE_1= RULE_LSQUARE ( (lv_type_2_0= ruleGlobalTypeCall ) ) this_COLON_3= RULE_COLON ( (lv_activeThreads_4_0= ruleThreadWithRole ) ) (this_COMMA_5= RULE_COMMA ( (lv_activeThreads_6_0= ruleThreadWithRole ) ) )* this_RSQUARE_7= RULE_RSQUARE )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:422:2: ( (lv_session_0_0= RULE_ID ) ) this_LSQUARE_1= RULE_LSQUARE ( (lv_type_2_0= ruleGlobalTypeCall ) ) this_COLON_3= RULE_COLON ( (lv_activeThreads_4_0= ruleThreadWithRole ) ) (this_COMMA_5= RULE_COMMA ( (lv_activeThreads_6_0= ruleThreadWithRole ) ) )* this_RSQUARE_7= RULE_RSQUARE
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:422:2: ( (lv_session_0_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:423:1: (lv_session_0_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:423:1: (lv_session_0_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:424:3: lv_session_0_0= RULE_ID
            {
            lv_session_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSessionProcedureParameter770); 

            			newLeafNode(lv_session_0_0, grammarAccess.getSessionProcedureParameterAccess().getSessionIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSessionProcedureParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"session",
                    		lv_session_0_0, 
                    		"ID");
            	    

            }


            }

            this_LSQUARE_1=(Token)match(input,RULE_LSQUARE,FOLLOW_RULE_LSQUARE_in_ruleSessionProcedureParameter786); 
             
                newLeafNode(this_LSQUARE_1, grammarAccess.getSessionProcedureParameterAccess().getLSQUARETerminalRuleCall_1()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:444:1: ( (lv_type_2_0= ruleGlobalTypeCall ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:445:1: (lv_type_2_0= ruleGlobalTypeCall )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:445:1: (lv_type_2_0= ruleGlobalTypeCall )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:446:3: lv_type_2_0= ruleGlobalTypeCall
            {
             
            	        newCompositeNode(grammarAccess.getSessionProcedureParameterAccess().getTypeGlobalTypeCallParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleGlobalTypeCall_in_ruleSessionProcedureParameter806);
            lv_type_2_0=ruleGlobalTypeCall();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSessionProcedureParameterRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"GlobalTypeCall");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleSessionProcedureParameter817); 
             
                newLeafNode(this_COLON_3, grammarAccess.getSessionProcedureParameterAccess().getCOLONTerminalRuleCall_3()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:466:1: ( (lv_activeThreads_4_0= ruleThreadWithRole ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:467:1: (lv_activeThreads_4_0= ruleThreadWithRole )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:467:1: (lv_activeThreads_4_0= ruleThreadWithRole )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:468:3: lv_activeThreads_4_0= ruleThreadWithRole
            {
             
            	        newCompositeNode(grammarAccess.getSessionProcedureParameterAccess().getActiveThreadsThreadWithRoleParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleThreadWithRole_in_ruleSessionProcedureParameter837);
            lv_activeThreads_4_0=ruleThreadWithRole();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSessionProcedureParameterRule());
            	        }
                   		add(
                   			current, 
                   			"activeThreads",
                    		lv_activeThreads_4_0, 
                    		"ThreadWithRole");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:484:2: (this_COMMA_5= RULE_COMMA ( (lv_activeThreads_6_0= ruleThreadWithRole ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:484:3: this_COMMA_5= RULE_COMMA ( (lv_activeThreads_6_0= ruleThreadWithRole ) )
            	    {
            	    this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleSessionProcedureParameter849); 
            	     
            	        newLeafNode(this_COMMA_5, grammarAccess.getSessionProcedureParameterAccess().getCOMMATerminalRuleCall_5_0()); 
            	        
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:488:1: ( (lv_activeThreads_6_0= ruleThreadWithRole ) )
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:489:1: (lv_activeThreads_6_0= ruleThreadWithRole )
            	    {
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:489:1: (lv_activeThreads_6_0= ruleThreadWithRole )
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:490:3: lv_activeThreads_6_0= ruleThreadWithRole
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSessionProcedureParameterAccess().getActiveThreadsThreadWithRoleParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleThreadWithRole_in_ruleSessionProcedureParameter869);
            	    lv_activeThreads_6_0=ruleThreadWithRole();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSessionProcedureParameterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"activeThreads",
            	            		lv_activeThreads_6_0, 
            	            		"ThreadWithRole");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            this_RSQUARE_7=(Token)match(input,RULE_RSQUARE,FOLLOW_RULE_RSQUARE_in_ruleSessionProcedureParameter882); 
             
                newLeafNode(this_RSQUARE_7, grammarAccess.getSessionProcedureParameterAccess().getRSQUARETerminalRuleCall_6()); 
                

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
    // $ANTLR end "ruleSessionProcedureParameter"


    // $ANTLR start "entryRuleProtocol"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:518:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:519:2: (iv_ruleProtocol= ruleProtocol EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:520:2: iv_ruleProtocol= ruleProtocol EOF
            {
             newCompositeNode(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_ruleProtocol_in_entryRuleProtocol917);
            iv_ruleProtocol=ruleProtocol();

            state._fsp--;

             current =iv_ruleProtocol; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocol927); 

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
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:527:1: ruleProtocol returns [EObject current=null] : (otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_type_3_0= ruleGlobalType ) ) this_RCURLY_4= RULE_RCURLY ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token this_RCURLY_4=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:530:28: ( (otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_type_3_0= ruleGlobalType ) ) this_RCURLY_4= RULE_RCURLY ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:531:1: (otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_type_3_0= ruleGlobalType ) ) this_RCURLY_4= RULE_RCURLY )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:531:1: (otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_type_3_0= ruleGlobalType ) ) this_RCURLY_4= RULE_RCURLY )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:531:3: otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_type_3_0= ruleGlobalType ) ) this_RCURLY_4= RULE_RCURLY
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleProtocol964); 

                	newLeafNode(otherlv_0, grammarAccess.getProtocolAccess().getProtocolKeyword_0());
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:535:1: ( (lv_name_1_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:536:1: (lv_name_1_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:536:1: (lv_name_1_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:537:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProtocol981); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProtocolRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleProtocol997); 
             
                newLeafNode(this_LCURLY_2, grammarAccess.getProtocolAccess().getLCURLYTerminalRuleCall_2()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:557:1: ( (lv_type_3_0= ruleGlobalType ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:558:1: (lv_type_3_0= ruleGlobalType )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:558:1: (lv_type_3_0= ruleGlobalType )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:559:3: lv_type_3_0= ruleGlobalType
            {
             
            	        newCompositeNode(grammarAccess.getProtocolAccess().getTypeGlobalTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleGlobalType_in_ruleProtocol1017);
            lv_type_3_0=ruleGlobalType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProtocolRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"GlobalType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_RCURLY_4=(Token)match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleProtocol1028); 
             
                newLeafNode(this_RCURLY_4, grammarAccess.getProtocolAccess().getRCURLYTerminalRuleCall_4()); 
                

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
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleSite"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:587:1: entryRuleSite returns [EObject current=null] : iv_ruleSite= ruleSite EOF ;
    public final EObject entryRuleSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSite = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:588:2: (iv_ruleSite= ruleSite EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:589:2: iv_ruleSite= ruleSite EOF
            {
             newCompositeNode(grammarAccess.getSiteRule()); 
            pushFollow(FOLLOW_ruleSite_in_entryRuleSite1063);
            iv_ruleSite=ruleSite();

            state._fsp--;

             current =iv_ruleSite; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSite1073); 

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
    // $ANTLR end "entryRuleSite"


    // $ANTLR start "ruleSite"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:596:1: ruleSite returns [EObject current=null] : (otherlv_0= 'public' ( (lv_name_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleSite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_COLON_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:599:28: ( (otherlv_0= 'public' ( (lv_name_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (otherlv_3= RULE_ID ) ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:600:1: (otherlv_0= 'public' ( (lv_name_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (otherlv_3= RULE_ID ) ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:600:1: (otherlv_0= 'public' ( (lv_name_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (otherlv_3= RULE_ID ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:600:3: otherlv_0= 'public' ( (lv_name_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleSite1110); 

                	newLeafNode(otherlv_0, grammarAccess.getSiteAccess().getPublicKeyword_0());
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:604:1: ( (lv_name_1_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:605:1: (lv_name_1_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:605:1: (lv_name_1_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:606:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSite1127); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSiteAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSiteRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleSite1143); 
             
                newLeafNode(this_COLON_2, grammarAccess.getSiteAccess().getCOLONTerminalRuleCall_2()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:626:1: ( (otherlv_3= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:627:1: (otherlv_3= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:627:1: (otherlv_3= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:628:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSiteRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSite1162); 

            		newLeafNode(otherlv_3, grammarAccess.getSiteAccess().getProtocolProtocolCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleSite"


    // $ANTLR start "entryRuleGlobalType"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:647:1: entryRuleGlobalType returns [EObject current=null] : iv_ruleGlobalType= ruleGlobalType EOF ;
    public final EObject entryRuleGlobalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalType = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:648:2: (iv_ruleGlobalType= ruleGlobalType EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:649:2: iv_ruleGlobalType= ruleGlobalType EOF
            {
             newCompositeNode(grammarAccess.getGlobalTypeRule()); 
            pushFollow(FOLLOW_ruleGlobalType_in_entryRuleGlobalType1198);
            iv_ruleGlobalType=ruleGlobalType();

            state._fsp--;

             current =iv_ruleGlobalType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalType1208); 

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
    // $ANTLR end "entryRuleGlobalType"


    // $ANTLR start "ruleGlobalType"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:656:1: ruleGlobalType returns [EObject current=null] : (this_GlobalTypeInteraction_0= ruleGlobalTypeInteraction | this_GlobalTypeCall_1= ruleGlobalTypeCall ) ;
    public final EObject ruleGlobalType() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalTypeInteraction_0 = null;

        EObject this_GlobalTypeCall_1 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:659:28: ( (this_GlobalTypeInteraction_0= ruleGlobalTypeInteraction | this_GlobalTypeCall_1= ruleGlobalTypeCall ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:660:1: (this_GlobalTypeInteraction_0= ruleGlobalTypeInteraction | this_GlobalTypeCall_1= ruleGlobalTypeCall )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:660:1: (this_GlobalTypeInteraction_0= ruleGlobalTypeInteraction | this_GlobalTypeCall_1= ruleGlobalTypeCall )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ARROW) ) {
                    alt7=1;
                }
                else if ( (LA7_1==EOF||LA7_1==RULE_RCURLY||LA7_1==RULE_COMMA) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:661:5: this_GlobalTypeInteraction_0= ruleGlobalTypeInteraction
                    {
                     
                            newCompositeNode(grammarAccess.getGlobalTypeAccess().getGlobalTypeInteractionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleGlobalTypeInteraction_in_ruleGlobalType1255);
                    this_GlobalTypeInteraction_0=ruleGlobalTypeInteraction();

                    state._fsp--;

                     
                            current = this_GlobalTypeInteraction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:671:5: this_GlobalTypeCall_1= ruleGlobalTypeCall
                    {
                     
                            newCompositeNode(grammarAccess.getGlobalTypeAccess().getGlobalTypeCallParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGlobalTypeCall_in_ruleGlobalType1282);
                    this_GlobalTypeCall_1=ruleGlobalTypeCall();

                    state._fsp--;

                     
                            current = this_GlobalTypeCall_1; 
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
    // $ANTLR end "ruleGlobalType"


    // $ANTLR start "entryRuleGlobalTypeInteraction"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:687:1: entryRuleGlobalTypeInteraction returns [EObject current=null] : iv_ruleGlobalTypeInteraction= ruleGlobalTypeInteraction EOF ;
    public final EObject entryRuleGlobalTypeInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalTypeInteraction = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:688:2: (iv_ruleGlobalTypeInteraction= ruleGlobalTypeInteraction EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:689:2: iv_ruleGlobalTypeInteraction= ruleGlobalTypeInteraction EOF
            {
             newCompositeNode(grammarAccess.getGlobalTypeInteractionRule()); 
            pushFollow(FOLLOW_ruleGlobalTypeInteraction_in_entryRuleGlobalTypeInteraction1317);
            iv_ruleGlobalTypeInteraction=ruleGlobalTypeInteraction();

            state._fsp--;

             current =iv_ruleGlobalTypeInteraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalTypeInteraction1327); 

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
    // $ANTLR end "entryRuleGlobalTypeInteraction"


    // $ANTLR start "ruleGlobalTypeInteraction"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:696:1: ruleGlobalTypeInteraction returns [EObject current=null] : ( ( (lv_sender_0_0= RULE_ID ) ) this_ARROW_1= RULE_ARROW ( (lv_receiver_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( ( (lv_branches_4_0= ruleBranchGType ) ) | (this_LCURLY_5= RULE_LCURLY ( (lv_branches_6_0= ruleBranchGType ) ) (this_COMMA_7= RULE_COMMA ( (lv_branches_8_0= ruleBranchGType ) ) )* this_RCURLY_9= RULE_RCURLY ) ) ) ;
    public final EObject ruleGlobalTypeInteraction() throws RecognitionException {
        EObject current = null;

        Token lv_sender_0_0=null;
        Token this_ARROW_1=null;
        Token lv_receiver_2_0=null;
        Token this_COLON_3=null;
        Token this_LCURLY_5=null;
        Token this_COMMA_7=null;
        Token this_RCURLY_9=null;
        EObject lv_branches_4_0 = null;

        EObject lv_branches_6_0 = null;

        EObject lv_branches_8_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:699:28: ( ( ( (lv_sender_0_0= RULE_ID ) ) this_ARROW_1= RULE_ARROW ( (lv_receiver_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( ( (lv_branches_4_0= ruleBranchGType ) ) | (this_LCURLY_5= RULE_LCURLY ( (lv_branches_6_0= ruleBranchGType ) ) (this_COMMA_7= RULE_COMMA ( (lv_branches_8_0= ruleBranchGType ) ) )* this_RCURLY_9= RULE_RCURLY ) ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:700:1: ( ( (lv_sender_0_0= RULE_ID ) ) this_ARROW_1= RULE_ARROW ( (lv_receiver_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( ( (lv_branches_4_0= ruleBranchGType ) ) | (this_LCURLY_5= RULE_LCURLY ( (lv_branches_6_0= ruleBranchGType ) ) (this_COMMA_7= RULE_COMMA ( (lv_branches_8_0= ruleBranchGType ) ) )* this_RCURLY_9= RULE_RCURLY ) ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:700:1: ( ( (lv_sender_0_0= RULE_ID ) ) this_ARROW_1= RULE_ARROW ( (lv_receiver_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( ( (lv_branches_4_0= ruleBranchGType ) ) | (this_LCURLY_5= RULE_LCURLY ( (lv_branches_6_0= ruleBranchGType ) ) (this_COMMA_7= RULE_COMMA ( (lv_branches_8_0= ruleBranchGType ) ) )* this_RCURLY_9= RULE_RCURLY ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:700:2: ( (lv_sender_0_0= RULE_ID ) ) this_ARROW_1= RULE_ARROW ( (lv_receiver_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( ( (lv_branches_4_0= ruleBranchGType ) ) | (this_LCURLY_5= RULE_LCURLY ( (lv_branches_6_0= ruleBranchGType ) ) (this_COMMA_7= RULE_COMMA ( (lv_branches_8_0= ruleBranchGType ) ) )* this_RCURLY_9= RULE_RCURLY ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:700:2: ( (lv_sender_0_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:701:1: (lv_sender_0_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:701:1: (lv_sender_0_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:702:3: lv_sender_0_0= RULE_ID
            {
            lv_sender_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlobalTypeInteraction1369); 

            			newLeafNode(lv_sender_0_0, grammarAccess.getGlobalTypeInteractionAccess().getSenderIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGlobalTypeInteractionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sender",
                    		lv_sender_0_0, 
                    		"ID");
            	    

            }


            }

            this_ARROW_1=(Token)match(input,RULE_ARROW,FOLLOW_RULE_ARROW_in_ruleGlobalTypeInteraction1385); 
             
                newLeafNode(this_ARROW_1, grammarAccess.getGlobalTypeInteractionAccess().getARROWTerminalRuleCall_1()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:722:1: ( (lv_receiver_2_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:723:1: (lv_receiver_2_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:723:1: (lv_receiver_2_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:724:3: lv_receiver_2_0= RULE_ID
            {
            lv_receiver_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlobalTypeInteraction1401); 

            			newLeafNode(lv_receiver_2_0, grammarAccess.getGlobalTypeInteractionAccess().getReceiverIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGlobalTypeInteractionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"receiver",
                    		lv_receiver_2_0, 
                    		"ID");
            	    

            }


            }

            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleGlobalTypeInteraction1417); 
             
                newLeafNode(this_COLON_3, grammarAccess.getGlobalTypeInteractionAccess().getCOLONTerminalRuleCall_3()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:744:1: ( ( (lv_branches_4_0= ruleBranchGType ) ) | (this_LCURLY_5= RULE_LCURLY ( (lv_branches_6_0= ruleBranchGType ) ) (this_COMMA_7= RULE_COMMA ( (lv_branches_8_0= ruleBranchGType ) ) )* this_RCURLY_9= RULE_RCURLY ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_LCURLY) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:744:2: ( (lv_branches_4_0= ruleBranchGType ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:744:2: ( (lv_branches_4_0= ruleBranchGType ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:745:1: (lv_branches_4_0= ruleBranchGType )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:745:1: (lv_branches_4_0= ruleBranchGType )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:746:3: lv_branches_4_0= ruleBranchGType
                    {
                     
                    	        newCompositeNode(grammarAccess.getGlobalTypeInteractionAccess().getBranchesBranchGTypeParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBranchGType_in_ruleGlobalTypeInteraction1438);
                    lv_branches_4_0=ruleBranchGType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGlobalTypeInteractionRule());
                    	        }
                           		add(
                           			current, 
                           			"branches",
                            		lv_branches_4_0, 
                            		"BranchGType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:763:6: (this_LCURLY_5= RULE_LCURLY ( (lv_branches_6_0= ruleBranchGType ) ) (this_COMMA_7= RULE_COMMA ( (lv_branches_8_0= ruleBranchGType ) ) )* this_RCURLY_9= RULE_RCURLY )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:763:6: (this_LCURLY_5= RULE_LCURLY ( (lv_branches_6_0= ruleBranchGType ) ) (this_COMMA_7= RULE_COMMA ( (lv_branches_8_0= ruleBranchGType ) ) )* this_RCURLY_9= RULE_RCURLY )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:763:7: this_LCURLY_5= RULE_LCURLY ( (lv_branches_6_0= ruleBranchGType ) ) (this_COMMA_7= RULE_COMMA ( (lv_branches_8_0= ruleBranchGType ) ) )* this_RCURLY_9= RULE_RCURLY
                    {
                    this_LCURLY_5=(Token)match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleGlobalTypeInteraction1456); 
                     
                        newLeafNode(this_LCURLY_5, grammarAccess.getGlobalTypeInteractionAccess().getLCURLYTerminalRuleCall_4_1_0()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:767:1: ( (lv_branches_6_0= ruleBranchGType ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:768:1: (lv_branches_6_0= ruleBranchGType )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:768:1: (lv_branches_6_0= ruleBranchGType )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:769:3: lv_branches_6_0= ruleBranchGType
                    {
                     
                    	        newCompositeNode(grammarAccess.getGlobalTypeInteractionAccess().getBranchesBranchGTypeParserRuleCall_4_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBranchGType_in_ruleGlobalTypeInteraction1476);
                    lv_branches_6_0=ruleBranchGType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGlobalTypeInteractionRule());
                    	        }
                           		add(
                           			current, 
                           			"branches",
                            		lv_branches_6_0, 
                            		"BranchGType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:785:2: (this_COMMA_7= RULE_COMMA ( (lv_branches_8_0= ruleBranchGType ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:785:3: this_COMMA_7= RULE_COMMA ( (lv_branches_8_0= ruleBranchGType ) )
                    	    {
                    	    this_COMMA_7=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleGlobalTypeInteraction1488); 
                    	     
                    	        newLeafNode(this_COMMA_7, grammarAccess.getGlobalTypeInteractionAccess().getCOMMATerminalRuleCall_4_1_2_0()); 
                    	        
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:789:1: ( (lv_branches_8_0= ruleBranchGType ) )
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:790:1: (lv_branches_8_0= ruleBranchGType )
                    	    {
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:790:1: (lv_branches_8_0= ruleBranchGType )
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:791:3: lv_branches_8_0= ruleBranchGType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGlobalTypeInteractionAccess().getBranchesBranchGTypeParserRuleCall_4_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleBranchGType_in_ruleGlobalTypeInteraction1508);
                    	    lv_branches_8_0=ruleBranchGType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGlobalTypeInteractionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"branches",
                    	            		lv_branches_8_0, 
                    	            		"BranchGType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    this_RCURLY_9=(Token)match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleGlobalTypeInteraction1521); 
                     
                        newLeafNode(this_RCURLY_9, grammarAccess.getGlobalTypeInteractionAccess().getRCURLYTerminalRuleCall_4_1_3()); 
                        

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
    // $ANTLR end "ruleGlobalTypeInteraction"


    // $ANTLR start "entryRuleGlobalTypeCall"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:819:1: entryRuleGlobalTypeCall returns [EObject current=null] : iv_ruleGlobalTypeCall= ruleGlobalTypeCall EOF ;
    public final EObject entryRuleGlobalTypeCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalTypeCall = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:820:2: (iv_ruleGlobalTypeCall= ruleGlobalTypeCall EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:821:2: iv_ruleGlobalTypeCall= ruleGlobalTypeCall EOF
            {
             newCompositeNode(grammarAccess.getGlobalTypeCallRule()); 
            pushFollow(FOLLOW_ruleGlobalTypeCall_in_entryRuleGlobalTypeCall1558);
            iv_ruleGlobalTypeCall=ruleGlobalTypeCall();

            state._fsp--;

             current =iv_ruleGlobalTypeCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalTypeCall1568); 

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
    // $ANTLR end "entryRuleGlobalTypeCall"


    // $ANTLR start "ruleGlobalTypeCall"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:828:1: ruleGlobalTypeCall returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleGlobalTypeCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:831:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:832:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:832:1: ( (otherlv_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:833:1: (otherlv_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:833:1: (otherlv_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:834:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGlobalTypeCallRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlobalTypeCall1612); 

            		newLeafNode(otherlv_0, grammarAccess.getGlobalTypeCallAccess().getProtocolProtocolCrossReference_0()); 
            	

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
    // $ANTLR end "ruleGlobalTypeCall"


    // $ANTLR start "entryRuleBranchGType"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:853:1: entryRuleBranchGType returns [EObject current=null] : iv_ruleBranchGType= ruleBranchGType EOF ;
    public final EObject entryRuleBranchGType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranchGType = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:854:2: (iv_ruleBranchGType= ruleBranchGType EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:855:2: iv_ruleBranchGType= ruleBranchGType EOF
            {
             newCompositeNode(grammarAccess.getBranchGTypeRule()); 
            pushFollow(FOLLOW_ruleBranchGType_in_entryRuleBranchGType1647);
            iv_ruleBranchGType=ruleBranchGType();

            state._fsp--;

             current =iv_ruleBranchGType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBranchGType1657); 

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
    // $ANTLR end "entryRuleBranchGType"


    // $ANTLR start "ruleBranchGType"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:862:1: ruleBranchGType returns [EObject current=null] : ( ( (lv_operation_0_0= RULE_ID ) ) this_LPAREN_1= RULE_LPAREN ( (lv_dataType_2_0= ruleDataType ) ) this_RPAREN_3= RULE_RPAREN (this_SEMICOLON_4= RULE_SEMICOLON ( (lv_continuation_5_0= ruleGlobalType ) ) )? ) ;
    public final EObject ruleBranchGType() throws RecognitionException {
        EObject current = null;

        Token lv_operation_0_0=null;
        Token this_LPAREN_1=null;
        Token this_RPAREN_3=null;
        Token this_SEMICOLON_4=null;
        EObject lv_dataType_2_0 = null;

        EObject lv_continuation_5_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:865:28: ( ( ( (lv_operation_0_0= RULE_ID ) ) this_LPAREN_1= RULE_LPAREN ( (lv_dataType_2_0= ruleDataType ) ) this_RPAREN_3= RULE_RPAREN (this_SEMICOLON_4= RULE_SEMICOLON ( (lv_continuation_5_0= ruleGlobalType ) ) )? ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:866:1: ( ( (lv_operation_0_0= RULE_ID ) ) this_LPAREN_1= RULE_LPAREN ( (lv_dataType_2_0= ruleDataType ) ) this_RPAREN_3= RULE_RPAREN (this_SEMICOLON_4= RULE_SEMICOLON ( (lv_continuation_5_0= ruleGlobalType ) ) )? )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:866:1: ( ( (lv_operation_0_0= RULE_ID ) ) this_LPAREN_1= RULE_LPAREN ( (lv_dataType_2_0= ruleDataType ) ) this_RPAREN_3= RULE_RPAREN (this_SEMICOLON_4= RULE_SEMICOLON ( (lv_continuation_5_0= ruleGlobalType ) ) )? )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:866:2: ( (lv_operation_0_0= RULE_ID ) ) this_LPAREN_1= RULE_LPAREN ( (lv_dataType_2_0= ruleDataType ) ) this_RPAREN_3= RULE_RPAREN (this_SEMICOLON_4= RULE_SEMICOLON ( (lv_continuation_5_0= ruleGlobalType ) ) )?
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:866:2: ( (lv_operation_0_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:867:1: (lv_operation_0_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:867:1: (lv_operation_0_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:868:3: lv_operation_0_0= RULE_ID
            {
            lv_operation_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBranchGType1699); 

            			newLeafNode(lv_operation_0_0, grammarAccess.getBranchGTypeAccess().getOperationIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBranchGTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"operation",
                    		lv_operation_0_0, 
                    		"ID");
            	    

            }


            }

            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleBranchGType1715); 
             
                newLeafNode(this_LPAREN_1, grammarAccess.getBranchGTypeAccess().getLPARENTerminalRuleCall_1()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:888:1: ( (lv_dataType_2_0= ruleDataType ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:889:1: (lv_dataType_2_0= ruleDataType )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:889:1: (lv_dataType_2_0= ruleDataType )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:890:3: lv_dataType_2_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getBranchGTypeAccess().getDataTypeDataTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleBranchGType1735);
            lv_dataType_2_0=ruleDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBranchGTypeRule());
            	        }
                   		set(
                   			current, 
                   			"dataType",
                    		lv_dataType_2_0, 
                    		"DataType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_RPAREN_3=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleBranchGType1746); 
             
                newLeafNode(this_RPAREN_3, grammarAccess.getBranchGTypeAccess().getRPARENTerminalRuleCall_3()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:910:1: (this_SEMICOLON_4= RULE_SEMICOLON ( (lv_continuation_5_0= ruleGlobalType ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_SEMICOLON) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:910:2: this_SEMICOLON_4= RULE_SEMICOLON ( (lv_continuation_5_0= ruleGlobalType ) )
                    {
                    this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleBranchGType1757); 
                     
                        newLeafNode(this_SEMICOLON_4, grammarAccess.getBranchGTypeAccess().getSEMICOLONTerminalRuleCall_4_0()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:914:1: ( (lv_continuation_5_0= ruleGlobalType ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:915:1: (lv_continuation_5_0= ruleGlobalType )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:915:1: (lv_continuation_5_0= ruleGlobalType )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:916:3: lv_continuation_5_0= ruleGlobalType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchGTypeAccess().getContinuationGlobalTypeParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGlobalType_in_ruleBranchGType1777);
                    lv_continuation_5_0=ruleGlobalType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBranchGTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"continuation",
                            		lv_continuation_5_0, 
                            		"GlobalType");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleBranchGType"


    // $ANTLR start "entryRuleDataType"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:940:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:941:2: (iv_ruleDataType= ruleDataType EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:942:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType1815);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType1825); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:949:1: ruleDataType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_DelegationType_1= ruleDelegationType ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_DelegationType_1 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:952:28: ( (this_BasicType_0= ruleBasicType | this_DelegationType_1= ruleDelegationType ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:953:1: (this_BasicType_0= ruleBasicType | this_DelegationType_1= ruleDelegationType )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:953:1: (this_BasicType_0= ruleBasicType | this_DelegationType_1= ruleDelegationType )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=39 && LA11_0<=42)) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:954:5: this_BasicType_0= ruleBasicType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getBasicTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBasicType_in_ruleDataType1872);
                    this_BasicType_0=ruleBasicType();

                    state._fsp--;

                     
                            current = this_BasicType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:964:5: this_DelegationType_1= ruleDelegationType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getDelegationTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDelegationType_in_ruleDataType1899);
                    this_DelegationType_1=ruleDelegationType();

                    state._fsp--;

                     
                            current = this_DelegationType_1; 
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleDelegationType"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:980:1: entryRuleDelegationType returns [EObject current=null] : iv_ruleDelegationType= ruleDelegationType EOF ;
    public final EObject entryRuleDelegationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegationType = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:981:2: (iv_ruleDelegationType= ruleDelegationType EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:982:2: iv_ruleDelegationType= ruleDelegationType EOF
            {
             newCompositeNode(grammarAccess.getDelegationTypeRule()); 
            pushFollow(FOLLOW_ruleDelegationType_in_entryRuleDelegationType1934);
            iv_ruleDelegationType=ruleDelegationType();

            state._fsp--;

             current =iv_ruleDelegationType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelegationType1944); 

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
    // $ANTLR end "entryRuleDelegationType"


    // $ANTLR start "ruleDelegationType"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:989:1: ruleDelegationType returns [EObject current=null] : ( ( (lv_type_0_0= ruleGlobalTypeCall ) ) this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDelegationType() throws RecognitionException {
        EObject current = null;

        Token this_AT_1=null;
        Token lv_role_2_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:992:28: ( ( ( (lv_type_0_0= ruleGlobalTypeCall ) ) this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:993:1: ( ( (lv_type_0_0= ruleGlobalTypeCall ) ) this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:993:1: ( ( (lv_type_0_0= ruleGlobalTypeCall ) ) this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:993:2: ( (lv_type_0_0= ruleGlobalTypeCall ) ) this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:993:2: ( (lv_type_0_0= ruleGlobalTypeCall ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:994:1: (lv_type_0_0= ruleGlobalTypeCall )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:994:1: (lv_type_0_0= ruleGlobalTypeCall )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:995:3: lv_type_0_0= ruleGlobalTypeCall
            {
             
            	        newCompositeNode(grammarAccess.getDelegationTypeAccess().getTypeGlobalTypeCallParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleGlobalTypeCall_in_ruleDelegationType1990);
            lv_type_0_0=ruleGlobalTypeCall();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDelegationTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"GlobalTypeCall");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_AT_1=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleDelegationType2001); 
             
                newLeafNode(this_AT_1, grammarAccess.getDelegationTypeAccess().getATTerminalRuleCall_1()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1015:1: ( (lv_role_2_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1016:1: (lv_role_2_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1016:1: (lv_role_2_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1017:3: lv_role_2_0= RULE_ID
            {
            lv_role_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDelegationType2017); 

            			newLeafNode(lv_role_2_0, grammarAccess.getDelegationTypeAccess().getRoleIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDelegationTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"role",
                    		lv_role_2_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleDelegationType"


    // $ANTLR start "entryRuleBasicType"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1041:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1042:2: (iv_ruleBasicType= ruleBasicType EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1043:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType2058);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType2068); 

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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1050:1: ruleBasicType returns [EObject current=null] : ( ( () ( (lv_name_1_0= 'int' ) ) ) | ( (lv_name_2_0= 'string' ) ) | ( (lv_name_3_0= 'bool' ) ) | ( (lv_name_4_0= 'void' ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token lv_name_4_0=null;

         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1053:28: ( ( ( () ( (lv_name_1_0= 'int' ) ) ) | ( (lv_name_2_0= 'string' ) ) | ( (lv_name_3_0= 'bool' ) ) | ( (lv_name_4_0= 'void' ) ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1054:1: ( ( () ( (lv_name_1_0= 'int' ) ) ) | ( (lv_name_2_0= 'string' ) ) | ( (lv_name_3_0= 'bool' ) ) | ( (lv_name_4_0= 'void' ) ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1054:1: ( ( () ( (lv_name_1_0= 'int' ) ) ) | ( (lv_name_2_0= 'string' ) ) | ( (lv_name_3_0= 'bool' ) ) | ( (lv_name_4_0= 'void' ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt12=1;
                }
                break;
            case 40:
                {
                alt12=2;
                }
                break;
            case 41:
                {
                alt12=3;
                }
                break;
            case 42:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1054:2: ( () ( (lv_name_1_0= 'int' ) ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1054:2: ( () ( (lv_name_1_0= 'int' ) ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1054:3: () ( (lv_name_1_0= 'int' ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1054:3: ()
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1055:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBasicTypeAccess().getBasicTypeAction_0_0(),
                                current);
                        

                    }

                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1060:2: ( (lv_name_1_0= 'int' ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1061:1: (lv_name_1_0= 'int' )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1061:1: (lv_name_1_0= 'int' )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1062:3: lv_name_1_0= 'int'
                    {
                    lv_name_1_0=(Token)match(input,39,FOLLOW_39_in_ruleBasicType2121); 

                            newLeafNode(lv_name_1_0, grammarAccess.getBasicTypeAccess().getNameIntKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_1_0, "int");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1076:6: ( (lv_name_2_0= 'string' ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1076:6: ( (lv_name_2_0= 'string' ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1077:1: (lv_name_2_0= 'string' )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1077:1: (lv_name_2_0= 'string' )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1078:3: lv_name_2_0= 'string'
                    {
                    lv_name_2_0=(Token)match(input,40,FOLLOW_40_in_ruleBasicType2159); 

                            newLeafNode(lv_name_2_0, grammarAccess.getBasicTypeAccess().getNameStringKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_2_0, "string");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1092:6: ( (lv_name_3_0= 'bool' ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1092:6: ( (lv_name_3_0= 'bool' ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1093:1: (lv_name_3_0= 'bool' )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1093:1: (lv_name_3_0= 'bool' )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1094:3: lv_name_3_0= 'bool'
                    {
                    lv_name_3_0=(Token)match(input,41,FOLLOW_41_in_ruleBasicType2196); 

                            newLeafNode(lv_name_3_0, grammarAccess.getBasicTypeAccess().getNameBoolKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_3_0, "bool");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1108:6: ( (lv_name_4_0= 'void' ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1108:6: ( (lv_name_4_0= 'void' ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1109:1: (lv_name_4_0= 'void' )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1109:1: (lv_name_4_0= 'void' )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1110:3: lv_name_4_0= 'void'
                    {
                    lv_name_4_0=(Token)match(input,42,FOLLOW_42_in_ruleBasicType2233); 

                            newLeafNode(lv_name_4_0, grammarAccess.getBasicTypeAccess().getNameVoidKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_4_0, "void");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleChoreography"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1131:1: entryRuleChoreography returns [EObject current=null] : iv_ruleChoreography= ruleChoreography EOF ;
    public final EObject entryRuleChoreography() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoreography = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1132:2: (iv_ruleChoreography= ruleChoreography EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1133:2: iv_ruleChoreography= ruleChoreography EOF
            {
             newCompositeNode(grammarAccess.getChoreographyRule()); 
            pushFollow(FOLLOW_ruleChoreography_in_entryRuleChoreography2282);
            iv_ruleChoreography=ruleChoreography();

            state._fsp--;

             current =iv_ruleChoreography; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoreography2292); 

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
    // $ANTLR end "entryRuleChoreography"


    // $ANTLR start "ruleChoreography"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1140:1: ruleChoreography returns [EObject current=null] : (this_Start_0= ruleStart | this_Interaction_1= ruleInteraction | this_Delegation_2= ruleDelegation | this_Call_3= ruleCall | this_IfThenElse_4= ruleIfThenElse | this_LocalCode_5= ruleLocalCode | (this_LCURLY_6= RULE_LCURLY this_Choreography_7= ruleChoreography this_RCURLY_8= RULE_RCURLY ) ) ;
    public final EObject ruleChoreography() throws RecognitionException {
        EObject current = null;

        Token this_LCURLY_6=null;
        Token this_RCURLY_8=null;
        EObject this_Start_0 = null;

        EObject this_Interaction_1 = null;

        EObject this_Delegation_2 = null;

        EObject this_Call_3 = null;

        EObject this_IfThenElse_4 = null;

        EObject this_LocalCode_5 = null;

        EObject this_Choreography_7 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1143:28: ( (this_Start_0= ruleStart | this_Interaction_1= ruleInteraction | this_Delegation_2= ruleDelegation | this_Call_3= ruleCall | this_IfThenElse_4= ruleIfThenElse | this_LocalCode_5= ruleLocalCode | (this_LCURLY_6= RULE_LCURLY this_Choreography_7= ruleChoreography this_RCURLY_8= RULE_RCURLY ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1144:1: (this_Start_0= ruleStart | this_Interaction_1= ruleInteraction | this_Delegation_2= ruleDelegation | this_Call_3= ruleCall | this_IfThenElse_4= ruleIfThenElse | this_LocalCode_5= ruleLocalCode | (this_LCURLY_6= RULE_LCURLY this_Choreography_7= ruleChoreography this_RCURLY_8= RULE_RCURLY ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1144:1: (this_Start_0= ruleStart | this_Interaction_1= ruleInteraction | this_Delegation_2= ruleDelegation | this_Call_3= ruleCall | this_IfThenElse_4= ruleIfThenElse | this_LocalCode_5= ruleLocalCode | (this_LCURLY_6= RULE_LCURLY this_Choreography_7= ruleChoreography this_RCURLY_8= RULE_RCURLY ) )
            int alt13=7;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1145:5: this_Start_0= ruleStart
                    {
                     
                            newCompositeNode(grammarAccess.getChoreographyAccess().getStartParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStart_in_ruleChoreography2339);
                    this_Start_0=ruleStart();

                    state._fsp--;

                     
                            current = this_Start_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1155:5: this_Interaction_1= ruleInteraction
                    {
                     
                            newCompositeNode(grammarAccess.getChoreographyAccess().getInteractionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInteraction_in_ruleChoreography2366);
                    this_Interaction_1=ruleInteraction();

                    state._fsp--;

                     
                            current = this_Interaction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1165:5: this_Delegation_2= ruleDelegation
                    {
                     
                            newCompositeNode(grammarAccess.getChoreographyAccess().getDelegationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDelegation_in_ruleChoreography2393);
                    this_Delegation_2=ruleDelegation();

                    state._fsp--;

                     
                            current = this_Delegation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1175:5: this_Call_3= ruleCall
                    {
                     
                            newCompositeNode(grammarAccess.getChoreographyAccess().getCallParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCall_in_ruleChoreography2420);
                    this_Call_3=ruleCall();

                    state._fsp--;

                     
                            current = this_Call_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1185:5: this_IfThenElse_4= ruleIfThenElse
                    {
                     
                            newCompositeNode(grammarAccess.getChoreographyAccess().getIfThenElseParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleIfThenElse_in_ruleChoreography2447);
                    this_IfThenElse_4=ruleIfThenElse();

                    state._fsp--;

                     
                            current = this_IfThenElse_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1195:5: this_LocalCode_5= ruleLocalCode
                    {
                     
                            newCompositeNode(grammarAccess.getChoreographyAccess().getLocalCodeParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleLocalCode_in_ruleChoreography2474);
                    this_LocalCode_5=ruleLocalCode();

                    state._fsp--;

                     
                            current = this_LocalCode_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1204:6: (this_LCURLY_6= RULE_LCURLY this_Choreography_7= ruleChoreography this_RCURLY_8= RULE_RCURLY )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1204:6: (this_LCURLY_6= RULE_LCURLY this_Choreography_7= ruleChoreography this_RCURLY_8= RULE_RCURLY )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1204:7: this_LCURLY_6= RULE_LCURLY this_Choreography_7= ruleChoreography this_RCURLY_8= RULE_RCURLY
                    {
                    this_LCURLY_6=(Token)match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleChoreography2491); 
                     
                        newLeafNode(this_LCURLY_6, grammarAccess.getChoreographyAccess().getLCURLYTerminalRuleCall_6_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getChoreographyAccess().getChoreographyParserRuleCall_6_1()); 
                        
                    pushFollow(FOLLOW_ruleChoreography_in_ruleChoreography2512);
                    this_Choreography_7=ruleChoreography();

                    state._fsp--;

                     
                            current = this_Choreography_7; 
                            afterParserOrEnumRuleCall();
                        
                    this_RCURLY_8=(Token)match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleChoreography2522); 
                     
                        newLeafNode(this_RCURLY_8, grammarAccess.getChoreographyAccess().getRCURLYTerminalRuleCall_6_2()); 
                        

                    }


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
    // $ANTLR end "ruleChoreography"


    // $ANTLR start "entryRuleStart"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1229:1: entryRuleStart returns [EObject current=null] : iv_ruleStart= ruleStart EOF ;
    public final EObject entryRuleStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStart = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1230:2: (iv_ruleStart= ruleStart EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1231:2: iv_ruleStart= ruleStart EOF
            {
             newCompositeNode(grammarAccess.getStartRule()); 
            pushFollow(FOLLOW_ruleStart_in_entryRuleStart2558);
            iv_ruleStart=ruleStart();

            state._fsp--;

             current =iv_ruleStart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStart2568); 

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
    // $ANTLR end "entryRuleStart"


    // $ANTLR start "ruleStart"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1238:1: ruleStart returns [EObject current=null] : ( ( (lv_activeThreads_0_0= ruleThreadWithRole ) ) (this_COMMA_1= RULE_COMMA ( (lv_activeThreads_2_0= ruleThreadWithRole ) ) )* otherlv_3= 'start' ( ( (lv_serviceThreads_4_0= ruleThreadWithRole ) ) (this_COMMA_5= RULE_COMMA ( (lv_serviceThreads_6_0= ruleThreadWithRole ) ) )* )? this_COLON_7= RULE_COLON ( (otherlv_8= RULE_ID ) ) this_LPAREN_9= RULE_LPAREN ( (lv_session_10_0= RULE_ID ) ) this_RPAREN_11= RULE_RPAREN (this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleChoreography ) ) )? ) ;
    public final EObject ruleStart() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        Token otherlv_3=null;
        Token this_COMMA_5=null;
        Token this_COLON_7=null;
        Token otherlv_8=null;
        Token this_LPAREN_9=null;
        Token lv_session_10_0=null;
        Token this_RPAREN_11=null;
        Token this_SEMICOLON_12=null;
        EObject lv_activeThreads_0_0 = null;

        EObject lv_activeThreads_2_0 = null;

        EObject lv_serviceThreads_4_0 = null;

        EObject lv_serviceThreads_6_0 = null;

        EObject lv_continuation_13_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1241:28: ( ( ( (lv_activeThreads_0_0= ruleThreadWithRole ) ) (this_COMMA_1= RULE_COMMA ( (lv_activeThreads_2_0= ruleThreadWithRole ) ) )* otherlv_3= 'start' ( ( (lv_serviceThreads_4_0= ruleThreadWithRole ) ) (this_COMMA_5= RULE_COMMA ( (lv_serviceThreads_6_0= ruleThreadWithRole ) ) )* )? this_COLON_7= RULE_COLON ( (otherlv_8= RULE_ID ) ) this_LPAREN_9= RULE_LPAREN ( (lv_session_10_0= RULE_ID ) ) this_RPAREN_11= RULE_RPAREN (this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleChoreography ) ) )? ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1242:1: ( ( (lv_activeThreads_0_0= ruleThreadWithRole ) ) (this_COMMA_1= RULE_COMMA ( (lv_activeThreads_2_0= ruleThreadWithRole ) ) )* otherlv_3= 'start' ( ( (lv_serviceThreads_4_0= ruleThreadWithRole ) ) (this_COMMA_5= RULE_COMMA ( (lv_serviceThreads_6_0= ruleThreadWithRole ) ) )* )? this_COLON_7= RULE_COLON ( (otherlv_8= RULE_ID ) ) this_LPAREN_9= RULE_LPAREN ( (lv_session_10_0= RULE_ID ) ) this_RPAREN_11= RULE_RPAREN (this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleChoreography ) ) )? )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1242:1: ( ( (lv_activeThreads_0_0= ruleThreadWithRole ) ) (this_COMMA_1= RULE_COMMA ( (lv_activeThreads_2_0= ruleThreadWithRole ) ) )* otherlv_3= 'start' ( ( (lv_serviceThreads_4_0= ruleThreadWithRole ) ) (this_COMMA_5= RULE_COMMA ( (lv_serviceThreads_6_0= ruleThreadWithRole ) ) )* )? this_COLON_7= RULE_COLON ( (otherlv_8= RULE_ID ) ) this_LPAREN_9= RULE_LPAREN ( (lv_session_10_0= RULE_ID ) ) this_RPAREN_11= RULE_RPAREN (this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleChoreography ) ) )? )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1242:2: ( (lv_activeThreads_0_0= ruleThreadWithRole ) ) (this_COMMA_1= RULE_COMMA ( (lv_activeThreads_2_0= ruleThreadWithRole ) ) )* otherlv_3= 'start' ( ( (lv_serviceThreads_4_0= ruleThreadWithRole ) ) (this_COMMA_5= RULE_COMMA ( (lv_serviceThreads_6_0= ruleThreadWithRole ) ) )* )? this_COLON_7= RULE_COLON ( (otherlv_8= RULE_ID ) ) this_LPAREN_9= RULE_LPAREN ( (lv_session_10_0= RULE_ID ) ) this_RPAREN_11= RULE_RPAREN (this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleChoreography ) ) )?
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1242:2: ( (lv_activeThreads_0_0= ruleThreadWithRole ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1243:1: (lv_activeThreads_0_0= ruleThreadWithRole )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1243:1: (lv_activeThreads_0_0= ruleThreadWithRole )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1244:3: lv_activeThreads_0_0= ruleThreadWithRole
            {
             
            	        newCompositeNode(grammarAccess.getStartAccess().getActiveThreadsThreadWithRoleParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleThreadWithRole_in_ruleStart2614);
            lv_activeThreads_0_0=ruleThreadWithRole();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStartRule());
            	        }
                   		add(
                   			current, 
                   			"activeThreads",
                    		lv_activeThreads_0_0, 
                    		"ThreadWithRole");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1260:2: (this_COMMA_1= RULE_COMMA ( (lv_activeThreads_2_0= ruleThreadWithRole ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1260:3: this_COMMA_1= RULE_COMMA ( (lv_activeThreads_2_0= ruleThreadWithRole ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleStart2626); 
            	     
            	        newLeafNode(this_COMMA_1, grammarAccess.getStartAccess().getCOMMATerminalRuleCall_1_0()); 
            	        
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1264:1: ( (lv_activeThreads_2_0= ruleThreadWithRole ) )
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1265:1: (lv_activeThreads_2_0= ruleThreadWithRole )
            	    {
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1265:1: (lv_activeThreads_2_0= ruleThreadWithRole )
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1266:3: lv_activeThreads_2_0= ruleThreadWithRole
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStartAccess().getActiveThreadsThreadWithRoleParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleThreadWithRole_in_ruleStart2646);
            	    lv_activeThreads_2_0=ruleThreadWithRole();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStartRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"activeThreads",
            	            		lv_activeThreads_2_0, 
            	            		"ThreadWithRole");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleStart2660); 

                	newLeafNode(otherlv_3, grammarAccess.getStartAccess().getStartKeyword_2());
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1286:1: ( ( (lv_serviceThreads_4_0= ruleThreadWithRole ) ) (this_COMMA_5= RULE_COMMA ( (lv_serviceThreads_6_0= ruleThreadWithRole ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1286:2: ( (lv_serviceThreads_4_0= ruleThreadWithRole ) ) (this_COMMA_5= RULE_COMMA ( (lv_serviceThreads_6_0= ruleThreadWithRole ) ) )*
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1286:2: ( (lv_serviceThreads_4_0= ruleThreadWithRole ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1287:1: (lv_serviceThreads_4_0= ruleThreadWithRole )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1287:1: (lv_serviceThreads_4_0= ruleThreadWithRole )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1288:3: lv_serviceThreads_4_0= ruleThreadWithRole
                    {
                     
                    	        newCompositeNode(grammarAccess.getStartAccess().getServiceThreadsThreadWithRoleParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleThreadWithRole_in_ruleStart2682);
                    lv_serviceThreads_4_0=ruleThreadWithRole();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStartRule());
                    	        }
                           		add(
                           			current, 
                           			"serviceThreads",
                            		lv_serviceThreads_4_0, 
                            		"ThreadWithRole");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1304:2: (this_COMMA_5= RULE_COMMA ( (lv_serviceThreads_6_0= ruleThreadWithRole ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_COMMA) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1304:3: this_COMMA_5= RULE_COMMA ( (lv_serviceThreads_6_0= ruleThreadWithRole ) )
                    	    {
                    	    this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleStart2694); 
                    	     
                    	        newLeafNode(this_COMMA_5, grammarAccess.getStartAccess().getCOMMATerminalRuleCall_3_1_0()); 
                    	        
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1308:1: ( (lv_serviceThreads_6_0= ruleThreadWithRole ) )
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1309:1: (lv_serviceThreads_6_0= ruleThreadWithRole )
                    	    {
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1309:1: (lv_serviceThreads_6_0= ruleThreadWithRole )
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1310:3: lv_serviceThreads_6_0= ruleThreadWithRole
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStartAccess().getServiceThreadsThreadWithRoleParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleThreadWithRole_in_ruleStart2714);
                    	    lv_serviceThreads_6_0=ruleThreadWithRole();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStartRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"serviceThreads",
                    	            		lv_serviceThreads_6_0, 
                    	            		"ThreadWithRole");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleStart2729); 
             
                newLeafNode(this_COLON_7, grammarAccess.getStartAccess().getCOLONTerminalRuleCall_4()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1330:1: ( (otherlv_8= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1331:1: (otherlv_8= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1331:1: (otherlv_8= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1332:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStartRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStart2748); 

            		newLeafNode(otherlv_8, grammarAccess.getStartAccess().getPublicChannelSiteCrossReference_5_0()); 
            	

            }


            }

            this_LPAREN_9=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleStart2759); 
             
                newLeafNode(this_LPAREN_9, grammarAccess.getStartAccess().getLPARENTerminalRuleCall_6()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1347:1: ( (lv_session_10_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1348:1: (lv_session_10_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1348:1: (lv_session_10_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1349:3: lv_session_10_0= RULE_ID
            {
            lv_session_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStart2775); 

            			newLeafNode(lv_session_10_0, grammarAccess.getStartAccess().getSessionIDTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"session",
                    		lv_session_10_0, 
                    		"ID");
            	    

            }


            }

            this_RPAREN_11=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleStart2791); 
             
                newLeafNode(this_RPAREN_11, grammarAccess.getStartAccess().getRPARENTerminalRuleCall_8()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1369:1: (this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleChoreography ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_SEMICOLON) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1369:2: this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleChoreography ) )
                    {
                    this_SEMICOLON_12=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleStart2802); 
                     
                        newLeafNode(this_SEMICOLON_12, grammarAccess.getStartAccess().getSEMICOLONTerminalRuleCall_9_0()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1373:1: ( (lv_continuation_13_0= ruleChoreography ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1374:1: (lv_continuation_13_0= ruleChoreography )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1374:1: (lv_continuation_13_0= ruleChoreography )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1375:3: lv_continuation_13_0= ruleChoreography
                    {
                     
                    	        newCompositeNode(grammarAccess.getStartAccess().getContinuationChoreographyParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleChoreography_in_ruleStart2822);
                    lv_continuation_13_0=ruleChoreography();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStartRule());
                    	        }
                           		set(
                           			current, 
                           			"continuation",
                            		lv_continuation_13_0, 
                            		"Choreography");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleStart"


    // $ANTLR start "entryRuleThreadWithRole"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1399:1: entryRuleThreadWithRole returns [EObject current=null] : iv_ruleThreadWithRole= ruleThreadWithRole EOF ;
    public final EObject entryRuleThreadWithRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThreadWithRole = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1400:2: (iv_ruleThreadWithRole= ruleThreadWithRole EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1401:2: iv_ruleThreadWithRole= ruleThreadWithRole EOF
            {
             newCompositeNode(grammarAccess.getThreadWithRoleRule()); 
            pushFollow(FOLLOW_ruleThreadWithRole_in_entryRuleThreadWithRole2860);
            iv_ruleThreadWithRole=ruleThreadWithRole();

            state._fsp--;

             current =iv_ruleThreadWithRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThreadWithRole2870); 

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
    // $ANTLR end "entryRuleThreadWithRole"


    // $ANTLR start "ruleThreadWithRole"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1408:1: ruleThreadWithRole returns [EObject current=null] : ( ( (lv_thread_0_0= RULE_ID ) ) this_LSQUARE_1= RULE_LSQUARE ( (lv_role_2_0= RULE_ID ) ) this_RSQUARE_3= RULE_RSQUARE ) ;
    public final EObject ruleThreadWithRole() throws RecognitionException {
        EObject current = null;

        Token lv_thread_0_0=null;
        Token this_LSQUARE_1=null;
        Token lv_role_2_0=null;
        Token this_RSQUARE_3=null;

         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1411:28: ( ( ( (lv_thread_0_0= RULE_ID ) ) this_LSQUARE_1= RULE_LSQUARE ( (lv_role_2_0= RULE_ID ) ) this_RSQUARE_3= RULE_RSQUARE ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1412:1: ( ( (lv_thread_0_0= RULE_ID ) ) this_LSQUARE_1= RULE_LSQUARE ( (lv_role_2_0= RULE_ID ) ) this_RSQUARE_3= RULE_RSQUARE )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1412:1: ( ( (lv_thread_0_0= RULE_ID ) ) this_LSQUARE_1= RULE_LSQUARE ( (lv_role_2_0= RULE_ID ) ) this_RSQUARE_3= RULE_RSQUARE )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1412:2: ( (lv_thread_0_0= RULE_ID ) ) this_LSQUARE_1= RULE_LSQUARE ( (lv_role_2_0= RULE_ID ) ) this_RSQUARE_3= RULE_RSQUARE
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1412:2: ( (lv_thread_0_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1413:1: (lv_thread_0_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1413:1: (lv_thread_0_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1414:3: lv_thread_0_0= RULE_ID
            {
            lv_thread_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleThreadWithRole2912); 

            			newLeafNode(lv_thread_0_0, grammarAccess.getThreadWithRoleAccess().getThreadIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getThreadWithRoleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"thread",
                    		lv_thread_0_0, 
                    		"ID");
            	    

            }


            }

            this_LSQUARE_1=(Token)match(input,RULE_LSQUARE,FOLLOW_RULE_LSQUARE_in_ruleThreadWithRole2928); 
             
                newLeafNode(this_LSQUARE_1, grammarAccess.getThreadWithRoleAccess().getLSQUARETerminalRuleCall_1()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1434:1: ( (lv_role_2_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1435:1: (lv_role_2_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1435:1: (lv_role_2_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1436:3: lv_role_2_0= RULE_ID
            {
            lv_role_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleThreadWithRole2944); 

            			newLeafNode(lv_role_2_0, grammarAccess.getThreadWithRoleAccess().getRoleIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getThreadWithRoleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"role",
                    		lv_role_2_0, 
                    		"ID");
            	    

            }


            }

            this_RSQUARE_3=(Token)match(input,RULE_RSQUARE,FOLLOW_RULE_RSQUARE_in_ruleThreadWithRole2960); 
             
                newLeafNode(this_RSQUARE_3, grammarAccess.getThreadWithRoleAccess().getRSQUARETerminalRuleCall_3()); 
                

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
    // $ANTLR end "ruleThreadWithRole"


    // $ANTLR start "entryRuleInteraction"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1464:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1465:2: (iv_ruleInteraction= ruleInteraction EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1466:2: iv_ruleInteraction= ruleInteraction EOF
            {
             newCompositeNode(grammarAccess.getInteractionRule()); 
            pushFollow(FOLLOW_ruleInteraction_in_entryRuleInteraction2995);
            iv_ruleInteraction=ruleInteraction();

            state._fsp--;

             current =iv_ruleInteraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteraction3005); 

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
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1473:1: ruleInteraction returns [EObject current=null] : ( ( (lv_sender_0_0= RULE_ID ) ) (this_DOT_1= RULE_DOT ( (lv_senderExpression_2_0= ruleExpressionBasicTerm ) ) )? this_ARROW_3= RULE_ARROW ( (lv_receiver_4_0= RULE_ID ) ) (this_DOT_5= RULE_DOT ( (lv_receiverVariable_6_0= RULE_ID ) ) )? this_COLON_7= RULE_COLON ( (lv_operation_8_0= RULE_ID ) ) this_LPAREN_9= RULE_LPAREN ( (lv_session_10_0= RULE_ID ) ) this_RPAREN_11= RULE_RPAREN (this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleChoreography ) ) )? ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token lv_sender_0_0=null;
        Token this_DOT_1=null;
        Token this_ARROW_3=null;
        Token lv_receiver_4_0=null;
        Token this_DOT_5=null;
        Token lv_receiverVariable_6_0=null;
        Token this_COLON_7=null;
        Token lv_operation_8_0=null;
        Token this_LPAREN_9=null;
        Token lv_session_10_0=null;
        Token this_RPAREN_11=null;
        Token this_SEMICOLON_12=null;
        EObject lv_senderExpression_2_0 = null;

        EObject lv_continuation_13_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1476:28: ( ( ( (lv_sender_0_0= RULE_ID ) ) (this_DOT_1= RULE_DOT ( (lv_senderExpression_2_0= ruleExpressionBasicTerm ) ) )? this_ARROW_3= RULE_ARROW ( (lv_receiver_4_0= RULE_ID ) ) (this_DOT_5= RULE_DOT ( (lv_receiverVariable_6_0= RULE_ID ) ) )? this_COLON_7= RULE_COLON ( (lv_operation_8_0= RULE_ID ) ) this_LPAREN_9= RULE_LPAREN ( (lv_session_10_0= RULE_ID ) ) this_RPAREN_11= RULE_RPAREN (this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleChoreography ) ) )? ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1477:1: ( ( (lv_sender_0_0= RULE_ID ) ) (this_DOT_1= RULE_DOT ( (lv_senderExpression_2_0= ruleExpressionBasicTerm ) ) )? this_ARROW_3= RULE_ARROW ( (lv_receiver_4_0= RULE_ID ) ) (this_DOT_5= RULE_DOT ( (lv_receiverVariable_6_0= RULE_ID ) ) )? this_COLON_7= RULE_COLON ( (lv_operation_8_0= RULE_ID ) ) this_LPAREN_9= RULE_LPAREN ( (lv_session_10_0= RULE_ID ) ) this_RPAREN_11= RULE_RPAREN (this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleChoreography ) ) )? )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1477:1: ( ( (lv_sender_0_0= RULE_ID ) ) (this_DOT_1= RULE_DOT ( (lv_senderExpression_2_0= ruleExpressionBasicTerm ) ) )? this_ARROW_3= RULE_ARROW ( (lv_receiver_4_0= RULE_ID ) ) (this_DOT_5= RULE_DOT ( (lv_receiverVariable_6_0= RULE_ID ) ) )? this_COLON_7= RULE_COLON ( (lv_operation_8_0= RULE_ID ) ) this_LPAREN_9= RULE_LPAREN ( (lv_session_10_0= RULE_ID ) ) this_RPAREN_11= RULE_RPAREN (this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleChoreography ) ) )? )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1477:2: ( (lv_sender_0_0= RULE_ID ) ) (this_DOT_1= RULE_DOT ( (lv_senderExpression_2_0= ruleExpressionBasicTerm ) ) )? this_ARROW_3= RULE_ARROW ( (lv_receiver_4_0= RULE_ID ) ) (this_DOT_5= RULE_DOT ( (lv_receiverVariable_6_0= RULE_ID ) ) )? this_COLON_7= RULE_COLON ( (lv_operation_8_0= RULE_ID ) ) this_LPAREN_9= RULE_LPAREN ( (lv_session_10_0= RULE_ID ) ) this_RPAREN_11= RULE_RPAREN (this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleChoreography ) ) )?
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1477:2: ( (lv_sender_0_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1478:1: (lv_sender_0_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1478:1: (lv_sender_0_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1479:3: lv_sender_0_0= RULE_ID
            {
            lv_sender_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteraction3047); 

            			newLeafNode(lv_sender_0_0, grammarAccess.getInteractionAccess().getSenderIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInteractionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sender",
                    		lv_sender_0_0, 
                    		"ID");
            	    

            }


            }

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1495:2: (this_DOT_1= RULE_DOT ( (lv_senderExpression_2_0= ruleExpressionBasicTerm ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_DOT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1495:3: this_DOT_1= RULE_DOT ( (lv_senderExpression_2_0= ruleExpressionBasicTerm ) )
                    {
                    this_DOT_1=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleInteraction3064); 
                     
                        newLeafNode(this_DOT_1, grammarAccess.getInteractionAccess().getDOTTerminalRuleCall_1_0()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1499:1: ( (lv_senderExpression_2_0= ruleExpressionBasicTerm ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1500:1: (lv_senderExpression_2_0= ruleExpressionBasicTerm )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1500:1: (lv_senderExpression_2_0= ruleExpressionBasicTerm )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1501:3: lv_senderExpression_2_0= ruleExpressionBasicTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getInteractionAccess().getSenderExpressionExpressionBasicTermParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpressionBasicTerm_in_ruleInteraction3084);
                    lv_senderExpression_2_0=ruleExpressionBasicTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInteractionRule());
                    	        }
                           		set(
                           			current, 
                           			"senderExpression",
                            		lv_senderExpression_2_0, 
                            		"ExpressionBasicTerm");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            this_ARROW_3=(Token)match(input,RULE_ARROW,FOLLOW_RULE_ARROW_in_ruleInteraction3097); 
             
                newLeafNode(this_ARROW_3, grammarAccess.getInteractionAccess().getARROWTerminalRuleCall_2()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1521:1: ( (lv_receiver_4_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1522:1: (lv_receiver_4_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1522:1: (lv_receiver_4_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1523:3: lv_receiver_4_0= RULE_ID
            {
            lv_receiver_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteraction3113); 

            			newLeafNode(lv_receiver_4_0, grammarAccess.getInteractionAccess().getReceiverIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInteractionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"receiver",
                    		lv_receiver_4_0, 
                    		"ID");
            	    

            }


            }

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1539:2: (this_DOT_5= RULE_DOT ( (lv_receiverVariable_6_0= RULE_ID ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_DOT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1539:3: this_DOT_5= RULE_DOT ( (lv_receiverVariable_6_0= RULE_ID ) )
                    {
                    this_DOT_5=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleInteraction3130); 
                     
                        newLeafNode(this_DOT_5, grammarAccess.getInteractionAccess().getDOTTerminalRuleCall_4_0()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1543:1: ( (lv_receiverVariable_6_0= RULE_ID ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1544:1: (lv_receiverVariable_6_0= RULE_ID )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1544:1: (lv_receiverVariable_6_0= RULE_ID )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1545:3: lv_receiverVariable_6_0= RULE_ID
                    {
                    lv_receiverVariable_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteraction3146); 

                    			newLeafNode(lv_receiverVariable_6_0, grammarAccess.getInteractionAccess().getReceiverVariableIDTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInteractionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"receiverVariable",
                            		lv_receiverVariable_6_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleInteraction3164); 
             
                newLeafNode(this_COLON_7, grammarAccess.getInteractionAccess().getCOLONTerminalRuleCall_5()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1565:1: ( (lv_operation_8_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1566:1: (lv_operation_8_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1566:1: (lv_operation_8_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1567:3: lv_operation_8_0= RULE_ID
            {
            lv_operation_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteraction3180); 

            			newLeafNode(lv_operation_8_0, grammarAccess.getInteractionAccess().getOperationIDTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInteractionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"operation",
                    		lv_operation_8_0, 
                    		"ID");
            	    

            }


            }

            this_LPAREN_9=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleInteraction3196); 
             
                newLeafNode(this_LPAREN_9, grammarAccess.getInteractionAccess().getLPARENTerminalRuleCall_7()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1587:1: ( (lv_session_10_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1588:1: (lv_session_10_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1588:1: (lv_session_10_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1589:3: lv_session_10_0= RULE_ID
            {
            lv_session_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteraction3212); 

            			newLeafNode(lv_session_10_0, grammarAccess.getInteractionAccess().getSessionIDTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInteractionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"session",
                    		lv_session_10_0, 
                    		"ID");
            	    

            }


            }

            this_RPAREN_11=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleInteraction3228); 
             
                newLeafNode(this_RPAREN_11, grammarAccess.getInteractionAccess().getRPARENTerminalRuleCall_9()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1609:1: (this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleChoreography ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_SEMICOLON) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1609:2: this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleChoreography ) )
                    {
                    this_SEMICOLON_12=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleInteraction3239); 
                     
                        newLeafNode(this_SEMICOLON_12, grammarAccess.getInteractionAccess().getSEMICOLONTerminalRuleCall_10_0()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1613:1: ( (lv_continuation_13_0= ruleChoreography ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1614:1: (lv_continuation_13_0= ruleChoreography )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1614:1: (lv_continuation_13_0= ruleChoreography )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1615:3: lv_continuation_13_0= ruleChoreography
                    {
                     
                    	        newCompositeNode(grammarAccess.getInteractionAccess().getContinuationChoreographyParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleChoreography_in_ruleInteraction3259);
                    lv_continuation_13_0=ruleChoreography();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInteractionRule());
                    	        }
                           		set(
                           			current, 
                           			"continuation",
                            		lv_continuation_13_0, 
                            		"Choreography");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleDelegation"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1639:1: entryRuleDelegation returns [EObject current=null] : iv_ruleDelegation= ruleDelegation EOF ;
    public final EObject entryRuleDelegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegation = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1640:2: (iv_ruleDelegation= ruleDelegation EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1641:2: iv_ruleDelegation= ruleDelegation EOF
            {
             newCompositeNode(grammarAccess.getDelegationRule()); 
            pushFollow(FOLLOW_ruleDelegation_in_entryRuleDelegation3297);
            iv_ruleDelegation=ruleDelegation();

            state._fsp--;

             current =iv_ruleDelegation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelegation3307); 

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
    // $ANTLR end "entryRuleDelegation"


    // $ANTLR start "ruleDelegation"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1648:1: ruleDelegation returns [EObject current=null] : ( ( (lv_sender_0_0= RULE_ID ) ) this_ARROW_1= RULE_ARROW ( (lv_receiver_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_operation_4_0= RULE_ID ) ) this_LPAREN_5= RULE_LPAREN ( (lv_session_6_0= RULE_ID ) ) this_LPAREN_7= RULE_LPAREN ( (lv_delegatedSession_8_0= RULE_ID ) ) this_RPAREN_9= RULE_RPAREN this_RPAREN_10= RULE_RPAREN (this_SEMICOLON_11= RULE_SEMICOLON ( (lv_continuation_12_0= ruleChoreography ) ) )? ) ;
    public final EObject ruleDelegation() throws RecognitionException {
        EObject current = null;

        Token lv_sender_0_0=null;
        Token this_ARROW_1=null;
        Token lv_receiver_2_0=null;
        Token this_COLON_3=null;
        Token lv_operation_4_0=null;
        Token this_LPAREN_5=null;
        Token lv_session_6_0=null;
        Token this_LPAREN_7=null;
        Token lv_delegatedSession_8_0=null;
        Token this_RPAREN_9=null;
        Token this_RPAREN_10=null;
        Token this_SEMICOLON_11=null;
        EObject lv_continuation_12_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1651:28: ( ( ( (lv_sender_0_0= RULE_ID ) ) this_ARROW_1= RULE_ARROW ( (lv_receiver_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_operation_4_0= RULE_ID ) ) this_LPAREN_5= RULE_LPAREN ( (lv_session_6_0= RULE_ID ) ) this_LPAREN_7= RULE_LPAREN ( (lv_delegatedSession_8_0= RULE_ID ) ) this_RPAREN_9= RULE_RPAREN this_RPAREN_10= RULE_RPAREN (this_SEMICOLON_11= RULE_SEMICOLON ( (lv_continuation_12_0= ruleChoreography ) ) )? ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1652:1: ( ( (lv_sender_0_0= RULE_ID ) ) this_ARROW_1= RULE_ARROW ( (lv_receiver_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_operation_4_0= RULE_ID ) ) this_LPAREN_5= RULE_LPAREN ( (lv_session_6_0= RULE_ID ) ) this_LPAREN_7= RULE_LPAREN ( (lv_delegatedSession_8_0= RULE_ID ) ) this_RPAREN_9= RULE_RPAREN this_RPAREN_10= RULE_RPAREN (this_SEMICOLON_11= RULE_SEMICOLON ( (lv_continuation_12_0= ruleChoreography ) ) )? )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1652:1: ( ( (lv_sender_0_0= RULE_ID ) ) this_ARROW_1= RULE_ARROW ( (lv_receiver_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_operation_4_0= RULE_ID ) ) this_LPAREN_5= RULE_LPAREN ( (lv_session_6_0= RULE_ID ) ) this_LPAREN_7= RULE_LPAREN ( (lv_delegatedSession_8_0= RULE_ID ) ) this_RPAREN_9= RULE_RPAREN this_RPAREN_10= RULE_RPAREN (this_SEMICOLON_11= RULE_SEMICOLON ( (lv_continuation_12_0= ruleChoreography ) ) )? )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1652:2: ( (lv_sender_0_0= RULE_ID ) ) this_ARROW_1= RULE_ARROW ( (lv_receiver_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_operation_4_0= RULE_ID ) ) this_LPAREN_5= RULE_LPAREN ( (lv_session_6_0= RULE_ID ) ) this_LPAREN_7= RULE_LPAREN ( (lv_delegatedSession_8_0= RULE_ID ) ) this_RPAREN_9= RULE_RPAREN this_RPAREN_10= RULE_RPAREN (this_SEMICOLON_11= RULE_SEMICOLON ( (lv_continuation_12_0= ruleChoreography ) ) )?
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1652:2: ( (lv_sender_0_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1653:1: (lv_sender_0_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1653:1: (lv_sender_0_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1654:3: lv_sender_0_0= RULE_ID
            {
            lv_sender_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDelegation3349); 

            			newLeafNode(lv_sender_0_0, grammarAccess.getDelegationAccess().getSenderIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDelegationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sender",
                    		lv_sender_0_0, 
                    		"ID");
            	    

            }


            }

            this_ARROW_1=(Token)match(input,RULE_ARROW,FOLLOW_RULE_ARROW_in_ruleDelegation3365); 
             
                newLeafNode(this_ARROW_1, grammarAccess.getDelegationAccess().getARROWTerminalRuleCall_1()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1674:1: ( (lv_receiver_2_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1675:1: (lv_receiver_2_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1675:1: (lv_receiver_2_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1676:3: lv_receiver_2_0= RULE_ID
            {
            lv_receiver_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDelegation3381); 

            			newLeafNode(lv_receiver_2_0, grammarAccess.getDelegationAccess().getReceiverIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDelegationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"receiver",
                    		lv_receiver_2_0, 
                    		"ID");
            	    

            }


            }

            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleDelegation3397); 
             
                newLeafNode(this_COLON_3, grammarAccess.getDelegationAccess().getCOLONTerminalRuleCall_3()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1696:1: ( (lv_operation_4_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1697:1: (lv_operation_4_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1697:1: (lv_operation_4_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1698:3: lv_operation_4_0= RULE_ID
            {
            lv_operation_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDelegation3413); 

            			newLeafNode(lv_operation_4_0, grammarAccess.getDelegationAccess().getOperationIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDelegationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"operation",
                    		lv_operation_4_0, 
                    		"ID");
            	    

            }


            }

            this_LPAREN_5=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleDelegation3429); 
             
                newLeafNode(this_LPAREN_5, grammarAccess.getDelegationAccess().getLPARENTerminalRuleCall_5()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1718:1: ( (lv_session_6_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1719:1: (lv_session_6_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1719:1: (lv_session_6_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1720:3: lv_session_6_0= RULE_ID
            {
            lv_session_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDelegation3445); 

            			newLeafNode(lv_session_6_0, grammarAccess.getDelegationAccess().getSessionIDTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDelegationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"session",
                    		lv_session_6_0, 
                    		"ID");
            	    

            }


            }

            this_LPAREN_7=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleDelegation3461); 
             
                newLeafNode(this_LPAREN_7, grammarAccess.getDelegationAccess().getLPARENTerminalRuleCall_7()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1740:1: ( (lv_delegatedSession_8_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1741:1: (lv_delegatedSession_8_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1741:1: (lv_delegatedSession_8_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1742:3: lv_delegatedSession_8_0= RULE_ID
            {
            lv_delegatedSession_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDelegation3477); 

            			newLeafNode(lv_delegatedSession_8_0, grammarAccess.getDelegationAccess().getDelegatedSessionIDTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDelegationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"delegatedSession",
                    		lv_delegatedSession_8_0, 
                    		"ID");
            	    

            }


            }

            this_RPAREN_9=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleDelegation3493); 
             
                newLeafNode(this_RPAREN_9, grammarAccess.getDelegationAccess().getRPARENTerminalRuleCall_9()); 
                
            this_RPAREN_10=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleDelegation3503); 
             
                newLeafNode(this_RPAREN_10, grammarAccess.getDelegationAccess().getRPARENTerminalRuleCall_10()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1766:1: (this_SEMICOLON_11= RULE_SEMICOLON ( (lv_continuation_12_0= ruleChoreography ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_SEMICOLON) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1766:2: this_SEMICOLON_11= RULE_SEMICOLON ( (lv_continuation_12_0= ruleChoreography ) )
                    {
                    this_SEMICOLON_11=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleDelegation3514); 
                     
                        newLeafNode(this_SEMICOLON_11, grammarAccess.getDelegationAccess().getSEMICOLONTerminalRuleCall_11_0()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1770:1: ( (lv_continuation_12_0= ruleChoreography ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1771:1: (lv_continuation_12_0= ruleChoreography )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1771:1: (lv_continuation_12_0= ruleChoreography )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1772:3: lv_continuation_12_0= ruleChoreography
                    {
                     
                    	        newCompositeNode(grammarAccess.getDelegationAccess().getContinuationChoreographyParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleChoreography_in_ruleDelegation3534);
                    lv_continuation_12_0=ruleChoreography();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDelegationRule());
                    	        }
                           		set(
                           			current, 
                           			"continuation",
                            		lv_continuation_12_0, 
                            		"Choreography");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleDelegation"


    // $ANTLR start "entryRuleCall"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1796:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1797:2: (iv_ruleCall= ruleCall EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1798:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall3572);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall3582); 

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
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1805:1: ruleCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) this_LPAREN_1= RULE_LPAREN ( (lv_threads_2_0= RULE_ID ) ) (this_COMMA_3= RULE_COMMA ( (lv_threads_4_0= RULE_ID ) ) )* this_RPAREN_5= RULE_RPAREN this_LPAREN_6= RULE_LPAREN ( ( (lv_sessions_7_0= RULE_ID ) ) (this_COMMA_8= RULE_COMMA ( (lv_sessions_9_0= RULE_ID ) ) )* )? this_RPAREN_10= RULE_RPAREN ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LPAREN_1=null;
        Token lv_threads_2_0=null;
        Token this_COMMA_3=null;
        Token lv_threads_4_0=null;
        Token this_RPAREN_5=null;
        Token this_LPAREN_6=null;
        Token lv_sessions_7_0=null;
        Token this_COMMA_8=null;
        Token lv_sessions_9_0=null;
        Token this_RPAREN_10=null;

         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1808:28: ( ( ( (otherlv_0= RULE_ID ) ) this_LPAREN_1= RULE_LPAREN ( (lv_threads_2_0= RULE_ID ) ) (this_COMMA_3= RULE_COMMA ( (lv_threads_4_0= RULE_ID ) ) )* this_RPAREN_5= RULE_RPAREN this_LPAREN_6= RULE_LPAREN ( ( (lv_sessions_7_0= RULE_ID ) ) (this_COMMA_8= RULE_COMMA ( (lv_sessions_9_0= RULE_ID ) ) )* )? this_RPAREN_10= RULE_RPAREN ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1809:1: ( ( (otherlv_0= RULE_ID ) ) this_LPAREN_1= RULE_LPAREN ( (lv_threads_2_0= RULE_ID ) ) (this_COMMA_3= RULE_COMMA ( (lv_threads_4_0= RULE_ID ) ) )* this_RPAREN_5= RULE_RPAREN this_LPAREN_6= RULE_LPAREN ( ( (lv_sessions_7_0= RULE_ID ) ) (this_COMMA_8= RULE_COMMA ( (lv_sessions_9_0= RULE_ID ) ) )* )? this_RPAREN_10= RULE_RPAREN )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1809:1: ( ( (otherlv_0= RULE_ID ) ) this_LPAREN_1= RULE_LPAREN ( (lv_threads_2_0= RULE_ID ) ) (this_COMMA_3= RULE_COMMA ( (lv_threads_4_0= RULE_ID ) ) )* this_RPAREN_5= RULE_RPAREN this_LPAREN_6= RULE_LPAREN ( ( (lv_sessions_7_0= RULE_ID ) ) (this_COMMA_8= RULE_COMMA ( (lv_sessions_9_0= RULE_ID ) ) )* )? this_RPAREN_10= RULE_RPAREN )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1809:2: ( (otherlv_0= RULE_ID ) ) this_LPAREN_1= RULE_LPAREN ( (lv_threads_2_0= RULE_ID ) ) (this_COMMA_3= RULE_COMMA ( (lv_threads_4_0= RULE_ID ) ) )* this_RPAREN_5= RULE_RPAREN this_LPAREN_6= RULE_LPAREN ( ( (lv_sessions_7_0= RULE_ID ) ) (this_COMMA_8= RULE_COMMA ( (lv_sessions_9_0= RULE_ID ) ) )* )? this_RPAREN_10= RULE_RPAREN
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1809:2: ( (otherlv_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1810:1: (otherlv_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1810:1: (otherlv_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1811:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCallRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCall3627); 

            		newLeafNode(otherlv_0, grammarAccess.getCallAccess().getProcedureProcedureCrossReference_0_0()); 
            	

            }


            }

            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleCall3638); 
             
                newLeafNode(this_LPAREN_1, grammarAccess.getCallAccess().getLPARENTerminalRuleCall_1()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1826:1: ( (lv_threads_2_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1827:1: (lv_threads_2_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1827:1: (lv_threads_2_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1828:3: lv_threads_2_0= RULE_ID
            {
            lv_threads_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCall3654); 

            			newLeafNode(lv_threads_2_0, grammarAccess.getCallAccess().getThreadsIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCallRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"threads",
                    		lv_threads_2_0, 
                    		"ID");
            	    

            }


            }

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1844:2: (this_COMMA_3= RULE_COMMA ( (lv_threads_4_0= RULE_ID ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1844:3: this_COMMA_3= RULE_COMMA ( (lv_threads_4_0= RULE_ID ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleCall3671); 
            	     
            	        newLeafNode(this_COMMA_3, grammarAccess.getCallAccess().getCOMMATerminalRuleCall_3_0()); 
            	        
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1848:1: ( (lv_threads_4_0= RULE_ID ) )
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1849:1: (lv_threads_4_0= RULE_ID )
            	    {
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1849:1: (lv_threads_4_0= RULE_ID )
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1850:3: lv_threads_4_0= RULE_ID
            	    {
            	    lv_threads_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCall3687); 

            	    			newLeafNode(lv_threads_4_0, grammarAccess.getCallAccess().getThreadsIDTerminalRuleCall_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCallRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"threads",
            	            		lv_threads_4_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            this_RPAREN_5=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleCall3705); 
             
                newLeafNode(this_RPAREN_5, grammarAccess.getCallAccess().getRPARENTerminalRuleCall_4()); 
                
            this_LPAREN_6=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleCall3715); 
             
                newLeafNode(this_LPAREN_6, grammarAccess.getCallAccess().getLPARENTerminalRuleCall_5()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1874:1: ( ( (lv_sessions_7_0= RULE_ID ) ) (this_COMMA_8= RULE_COMMA ( (lv_sessions_9_0= RULE_ID ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1874:2: ( (lv_sessions_7_0= RULE_ID ) ) (this_COMMA_8= RULE_COMMA ( (lv_sessions_9_0= RULE_ID ) ) )*
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1874:2: ( (lv_sessions_7_0= RULE_ID ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1875:1: (lv_sessions_7_0= RULE_ID )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1875:1: (lv_sessions_7_0= RULE_ID )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1876:3: lv_sessions_7_0= RULE_ID
                    {
                    lv_sessions_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCall3732); 

                    			newLeafNode(lv_sessions_7_0, grammarAccess.getCallAccess().getSessionsIDTerminalRuleCall_6_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCallRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"sessions",
                            		lv_sessions_7_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1892:2: (this_COMMA_8= RULE_COMMA ( (lv_sessions_9_0= RULE_ID ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_COMMA) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1892:3: this_COMMA_8= RULE_COMMA ( (lv_sessions_9_0= RULE_ID ) )
                    	    {
                    	    this_COMMA_8=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleCall3749); 
                    	     
                    	        newLeafNode(this_COMMA_8, grammarAccess.getCallAccess().getCOMMATerminalRuleCall_6_1_0()); 
                    	        
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1896:1: ( (lv_sessions_9_0= RULE_ID ) )
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1897:1: (lv_sessions_9_0= RULE_ID )
                    	    {
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1897:1: (lv_sessions_9_0= RULE_ID )
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1898:3: lv_sessions_9_0= RULE_ID
                    	    {
                    	    lv_sessions_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCall3765); 

                    	    			newLeafNode(lv_sessions_9_0, grammarAccess.getCallAccess().getSessionsIDTerminalRuleCall_6_1_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getCallRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"sessions",
                    	            		lv_sessions_9_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            this_RPAREN_10=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleCall3785); 
             
                newLeafNode(this_RPAREN_10, grammarAccess.getCallAccess().getRPARENTerminalRuleCall_7()); 
                

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
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleIfThenElse"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1926:1: entryRuleIfThenElse returns [EObject current=null] : iv_ruleIfThenElse= ruleIfThenElse EOF ;
    public final EObject entryRuleIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElse = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1927:2: (iv_ruleIfThenElse= ruleIfThenElse EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1928:2: iv_ruleIfThenElse= ruleIfThenElse EOF
            {
             newCompositeNode(grammarAccess.getIfThenElseRule()); 
            pushFollow(FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse3820);
            iv_ruleIfThenElse=ruleIfThenElse();

            state._fsp--;

             current =iv_ruleIfThenElse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfThenElse3830); 

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
    // $ANTLR end "entryRuleIfThenElse"


    // $ANTLR start "ruleIfThenElse"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1935:1: ruleIfThenElse returns [EObject current=null] : (otherlv_0= 'if' this_LPAREN_1= RULE_LPAREN ( (lv_condition_2_0= ruleCondition ) ) this_RPAREN_3= RULE_RPAREN this_AT_4= RULE_AT ( (lv_thread_5_0= RULE_ID ) ) ( (lv_then_6_0= ruleChoreography ) ) (otherlv_7= 'else' ( (lv_else_8_0= ruleChoreography ) ) )? ) ;
    public final EObject ruleIfThenElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LPAREN_1=null;
        Token this_RPAREN_3=null;
        Token this_AT_4=null;
        Token lv_thread_5_0=null;
        Token otherlv_7=null;
        EObject lv_condition_2_0 = null;

        EObject lv_then_6_0 = null;

        EObject lv_else_8_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1938:28: ( (otherlv_0= 'if' this_LPAREN_1= RULE_LPAREN ( (lv_condition_2_0= ruleCondition ) ) this_RPAREN_3= RULE_RPAREN this_AT_4= RULE_AT ( (lv_thread_5_0= RULE_ID ) ) ( (lv_then_6_0= ruleChoreography ) ) (otherlv_7= 'else' ( (lv_else_8_0= ruleChoreography ) ) )? ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1939:1: (otherlv_0= 'if' this_LPAREN_1= RULE_LPAREN ( (lv_condition_2_0= ruleCondition ) ) this_RPAREN_3= RULE_RPAREN this_AT_4= RULE_AT ( (lv_thread_5_0= RULE_ID ) ) ( (lv_then_6_0= ruleChoreography ) ) (otherlv_7= 'else' ( (lv_else_8_0= ruleChoreography ) ) )? )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1939:1: (otherlv_0= 'if' this_LPAREN_1= RULE_LPAREN ( (lv_condition_2_0= ruleCondition ) ) this_RPAREN_3= RULE_RPAREN this_AT_4= RULE_AT ( (lv_thread_5_0= RULE_ID ) ) ( (lv_then_6_0= ruleChoreography ) ) (otherlv_7= 'else' ( (lv_else_8_0= ruleChoreography ) ) )? )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1939:3: otherlv_0= 'if' this_LPAREN_1= RULE_LPAREN ( (lv_condition_2_0= ruleCondition ) ) this_RPAREN_3= RULE_RPAREN this_AT_4= RULE_AT ( (lv_thread_5_0= RULE_ID ) ) ( (lv_then_6_0= ruleChoreography ) ) (otherlv_7= 'else' ( (lv_else_8_0= ruleChoreography ) ) )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleIfThenElse3867); 

                	newLeafNode(otherlv_0, grammarAccess.getIfThenElseAccess().getIfKeyword_0());
                
            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleIfThenElse3878); 
             
                newLeafNode(this_LPAREN_1, grammarAccess.getIfThenElseAccess().getLPARENTerminalRuleCall_1()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1947:1: ( (lv_condition_2_0= ruleCondition ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1948:1: (lv_condition_2_0= ruleCondition )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1948:1: (lv_condition_2_0= ruleCondition )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1949:3: lv_condition_2_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getIfThenElseAccess().getConditionConditionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleIfThenElse3898);
            lv_condition_2_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_2_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_RPAREN_3=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleIfThenElse3909); 
             
                newLeafNode(this_RPAREN_3, grammarAccess.getIfThenElseAccess().getRPARENTerminalRuleCall_3()); 
                
            this_AT_4=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleIfThenElse3919); 
             
                newLeafNode(this_AT_4, grammarAccess.getIfThenElseAccess().getATTerminalRuleCall_4()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1973:1: ( (lv_thread_5_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1974:1: (lv_thread_5_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1974:1: (lv_thread_5_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1975:3: lv_thread_5_0= RULE_ID
            {
            lv_thread_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIfThenElse3935); 

            			newLeafNode(lv_thread_5_0, grammarAccess.getIfThenElseAccess().getThreadIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIfThenElseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"thread",
                    		lv_thread_5_0, 
                    		"ID");
            	    

            }


            }

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1991:2: ( (lv_then_6_0= ruleChoreography ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1992:1: (lv_then_6_0= ruleChoreography )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1992:1: (lv_then_6_0= ruleChoreography )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1993:3: lv_then_6_0= ruleChoreography
            {
             
            	        newCompositeNode(grammarAccess.getIfThenElseAccess().getThenChoreographyParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleChoreography_in_ruleIfThenElse3961);
            lv_then_6_0=ruleChoreography();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
            	        }
                   		set(
                   			current, 
                   			"then",
                    		lv_then_6_0, 
                    		"Choreography");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2009:2: (otherlv_7= 'else' ( (lv_else_8_0= ruleChoreography ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==45) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2009:4: otherlv_7= 'else' ( (lv_else_8_0= ruleChoreography ) )
                    {
                    otherlv_7=(Token)match(input,45,FOLLOW_45_in_ruleIfThenElse3974); 

                        	newLeafNode(otherlv_7, grammarAccess.getIfThenElseAccess().getElseKeyword_7_0());
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2013:1: ( (lv_else_8_0= ruleChoreography ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2014:1: (lv_else_8_0= ruleChoreography )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2014:1: (lv_else_8_0= ruleChoreography )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2015:3: lv_else_8_0= ruleChoreography
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfThenElseAccess().getElseChoreographyParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleChoreography_in_ruleIfThenElse3995);
                    lv_else_8_0=ruleChoreography();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    	        }
                           		set(
                           			current, 
                           			"else",
                            		lv_else_8_0, 
                            		"Choreography");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleIfThenElse"


    // $ANTLR start "entryRuleLocalCode"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2039:1: entryRuleLocalCode returns [EObject current=null] : iv_ruleLocalCode= ruleLocalCode EOF ;
    public final EObject entryRuleLocalCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalCode = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2040:2: (iv_ruleLocalCode= ruleLocalCode EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2041:2: iv_ruleLocalCode= ruleLocalCode EOF
            {
             newCompositeNode(grammarAccess.getLocalCodeRule()); 
            pushFollow(FOLLOW_ruleLocalCode_in_entryRuleLocalCode4033);
            iv_ruleLocalCode=ruleLocalCode();

            state._fsp--;

             current =iv_ruleLocalCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalCode4043); 

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
    // $ANTLR end "entryRuleLocalCode"


    // $ANTLR start "ruleLocalCode"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2048:1: ruleLocalCode returns [EObject current=null] : ( ( () otherlv_1= 'ask' this_AT_2= RULE_AT ( (lv_thread_3_0= RULE_ID ) ) this_LPAREN_4= RULE_LPAREN ( (lv_question_5_0= ruleExpression ) ) this_COMMA_6= RULE_COMMA ( (lv_resultVariable_7_0= RULE_ID ) ) this_RPAREN_8= RULE_RPAREN (this_SEMICOLON_9= RULE_SEMICOLON ( (lv_continuation_10_0= ruleChoreography ) ) )? ) | ( () otherlv_12= 'show' this_AT_13= RULE_AT ( (lv_thread_14_0= RULE_ID ) ) this_LPAREN_15= RULE_LPAREN ( (lv_expression_16_0= ruleExpression ) ) this_RPAREN_17= RULE_RPAREN (this_SEMICOLON_18= RULE_SEMICOLON ( (lv_continuation_19_0= ruleChoreography ) ) )? ) | ( () otherlv_21= 'local' this_AT_22= RULE_AT ( (lv_thread_23_0= RULE_ID ) ) this_LPAREN_24= RULE_LPAREN ( (lv_variable_25_0= RULE_ID ) ) this_ASSIGN_26= RULE_ASSIGN ( (lv_expression_27_0= ruleExpression ) ) this_RPAREN_28= RULE_RPAREN (this_SEMICOLON_29= RULE_SEMICOLON ( (lv_continuation_30_0= ruleChoreography ) ) )? ) ) ;
    public final EObject ruleLocalCode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_AT_2=null;
        Token lv_thread_3_0=null;
        Token this_LPAREN_4=null;
        Token this_COMMA_6=null;
        Token lv_resultVariable_7_0=null;
        Token this_RPAREN_8=null;
        Token this_SEMICOLON_9=null;
        Token otherlv_12=null;
        Token this_AT_13=null;
        Token lv_thread_14_0=null;
        Token this_LPAREN_15=null;
        Token this_RPAREN_17=null;
        Token this_SEMICOLON_18=null;
        Token otherlv_21=null;
        Token this_AT_22=null;
        Token lv_thread_23_0=null;
        Token this_LPAREN_24=null;
        Token lv_variable_25_0=null;
        Token this_ASSIGN_26=null;
        Token this_RPAREN_28=null;
        Token this_SEMICOLON_29=null;
        EObject lv_question_5_0 = null;

        EObject lv_continuation_10_0 = null;

        EObject lv_expression_16_0 = null;

        EObject lv_continuation_19_0 = null;

        EObject lv_expression_27_0 = null;

        EObject lv_continuation_30_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2051:28: ( ( ( () otherlv_1= 'ask' this_AT_2= RULE_AT ( (lv_thread_3_0= RULE_ID ) ) this_LPAREN_4= RULE_LPAREN ( (lv_question_5_0= ruleExpression ) ) this_COMMA_6= RULE_COMMA ( (lv_resultVariable_7_0= RULE_ID ) ) this_RPAREN_8= RULE_RPAREN (this_SEMICOLON_9= RULE_SEMICOLON ( (lv_continuation_10_0= ruleChoreography ) ) )? ) | ( () otherlv_12= 'show' this_AT_13= RULE_AT ( (lv_thread_14_0= RULE_ID ) ) this_LPAREN_15= RULE_LPAREN ( (lv_expression_16_0= ruleExpression ) ) this_RPAREN_17= RULE_RPAREN (this_SEMICOLON_18= RULE_SEMICOLON ( (lv_continuation_19_0= ruleChoreography ) ) )? ) | ( () otherlv_21= 'local' this_AT_22= RULE_AT ( (lv_thread_23_0= RULE_ID ) ) this_LPAREN_24= RULE_LPAREN ( (lv_variable_25_0= RULE_ID ) ) this_ASSIGN_26= RULE_ASSIGN ( (lv_expression_27_0= ruleExpression ) ) this_RPAREN_28= RULE_RPAREN (this_SEMICOLON_29= RULE_SEMICOLON ( (lv_continuation_30_0= ruleChoreography ) ) )? ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2052:1: ( ( () otherlv_1= 'ask' this_AT_2= RULE_AT ( (lv_thread_3_0= RULE_ID ) ) this_LPAREN_4= RULE_LPAREN ( (lv_question_5_0= ruleExpression ) ) this_COMMA_6= RULE_COMMA ( (lv_resultVariable_7_0= RULE_ID ) ) this_RPAREN_8= RULE_RPAREN (this_SEMICOLON_9= RULE_SEMICOLON ( (lv_continuation_10_0= ruleChoreography ) ) )? ) | ( () otherlv_12= 'show' this_AT_13= RULE_AT ( (lv_thread_14_0= RULE_ID ) ) this_LPAREN_15= RULE_LPAREN ( (lv_expression_16_0= ruleExpression ) ) this_RPAREN_17= RULE_RPAREN (this_SEMICOLON_18= RULE_SEMICOLON ( (lv_continuation_19_0= ruleChoreography ) ) )? ) | ( () otherlv_21= 'local' this_AT_22= RULE_AT ( (lv_thread_23_0= RULE_ID ) ) this_LPAREN_24= RULE_LPAREN ( (lv_variable_25_0= RULE_ID ) ) this_ASSIGN_26= RULE_ASSIGN ( (lv_expression_27_0= ruleExpression ) ) this_RPAREN_28= RULE_RPAREN (this_SEMICOLON_29= RULE_SEMICOLON ( (lv_continuation_30_0= ruleChoreography ) ) )? ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2052:1: ( ( () otherlv_1= 'ask' this_AT_2= RULE_AT ( (lv_thread_3_0= RULE_ID ) ) this_LPAREN_4= RULE_LPAREN ( (lv_question_5_0= ruleExpression ) ) this_COMMA_6= RULE_COMMA ( (lv_resultVariable_7_0= RULE_ID ) ) this_RPAREN_8= RULE_RPAREN (this_SEMICOLON_9= RULE_SEMICOLON ( (lv_continuation_10_0= ruleChoreography ) ) )? ) | ( () otherlv_12= 'show' this_AT_13= RULE_AT ( (lv_thread_14_0= RULE_ID ) ) this_LPAREN_15= RULE_LPAREN ( (lv_expression_16_0= ruleExpression ) ) this_RPAREN_17= RULE_RPAREN (this_SEMICOLON_18= RULE_SEMICOLON ( (lv_continuation_19_0= ruleChoreography ) ) )? ) | ( () otherlv_21= 'local' this_AT_22= RULE_AT ( (lv_thread_23_0= RULE_ID ) ) this_LPAREN_24= RULE_LPAREN ( (lv_variable_25_0= RULE_ID ) ) this_ASSIGN_26= RULE_ASSIGN ( (lv_expression_27_0= ruleExpression ) ) this_RPAREN_28= RULE_RPAREN (this_SEMICOLON_29= RULE_SEMICOLON ( (lv_continuation_30_0= ruleChoreography ) ) )? ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt29=1;
                }
                break;
            case 47:
                {
                alt29=2;
                }
                break;
            case 48:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2052:2: ( () otherlv_1= 'ask' this_AT_2= RULE_AT ( (lv_thread_3_0= RULE_ID ) ) this_LPAREN_4= RULE_LPAREN ( (lv_question_5_0= ruleExpression ) ) this_COMMA_6= RULE_COMMA ( (lv_resultVariable_7_0= RULE_ID ) ) this_RPAREN_8= RULE_RPAREN (this_SEMICOLON_9= RULE_SEMICOLON ( (lv_continuation_10_0= ruleChoreography ) ) )? )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2052:2: ( () otherlv_1= 'ask' this_AT_2= RULE_AT ( (lv_thread_3_0= RULE_ID ) ) this_LPAREN_4= RULE_LPAREN ( (lv_question_5_0= ruleExpression ) ) this_COMMA_6= RULE_COMMA ( (lv_resultVariable_7_0= RULE_ID ) ) this_RPAREN_8= RULE_RPAREN (this_SEMICOLON_9= RULE_SEMICOLON ( (lv_continuation_10_0= ruleChoreography ) ) )? )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2052:3: () otherlv_1= 'ask' this_AT_2= RULE_AT ( (lv_thread_3_0= RULE_ID ) ) this_LPAREN_4= RULE_LPAREN ( (lv_question_5_0= ruleExpression ) ) this_COMMA_6= RULE_COMMA ( (lv_resultVariable_7_0= RULE_ID ) ) this_RPAREN_8= RULE_RPAREN (this_SEMICOLON_9= RULE_SEMICOLON ( (lv_continuation_10_0= ruleChoreography ) ) )?
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2052:3: ()
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2053:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLocalCodeAccess().getLocalAskCommandAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleLocalCode4090); 

                        	newLeafNode(otherlv_1, grammarAccess.getLocalCodeAccess().getAskKeyword_0_1());
                        
                    this_AT_2=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleLocalCode4101); 
                     
                        newLeafNode(this_AT_2, grammarAccess.getLocalCodeAccess().getATTerminalRuleCall_0_2()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2066:1: ( (lv_thread_3_0= RULE_ID ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2067:1: (lv_thread_3_0= RULE_ID )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2067:1: (lv_thread_3_0= RULE_ID )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2068:3: lv_thread_3_0= RULE_ID
                    {
                    lv_thread_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalCode4117); 

                    			newLeafNode(lv_thread_3_0, grammarAccess.getLocalCodeAccess().getThreadIDTerminalRuleCall_0_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLocalCodeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"thread",
                            		lv_thread_3_0, 
                            		"ID");
                    	    

                    }


                    }

                    this_LPAREN_4=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleLocalCode4133); 
                     
                        newLeafNode(this_LPAREN_4, grammarAccess.getLocalCodeAccess().getLPARENTerminalRuleCall_0_4()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2088:1: ( (lv_question_5_0= ruleExpression ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2089:1: (lv_question_5_0= ruleExpression )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2089:1: (lv_question_5_0= ruleExpression )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2090:3: lv_question_5_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalCodeAccess().getQuestionExpressionParserRuleCall_0_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleLocalCode4153);
                    lv_question_5_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalCodeRule());
                    	        }
                           		set(
                           			current, 
                           			"question",
                            		lv_question_5_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleLocalCode4164); 
                     
                        newLeafNode(this_COMMA_6, grammarAccess.getLocalCodeAccess().getCOMMATerminalRuleCall_0_6()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2110:1: ( (lv_resultVariable_7_0= RULE_ID ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2111:1: (lv_resultVariable_7_0= RULE_ID )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2111:1: (lv_resultVariable_7_0= RULE_ID )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2112:3: lv_resultVariable_7_0= RULE_ID
                    {
                    lv_resultVariable_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalCode4180); 

                    			newLeafNode(lv_resultVariable_7_0, grammarAccess.getLocalCodeAccess().getResultVariableIDTerminalRuleCall_0_7_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLocalCodeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"resultVariable",
                            		lv_resultVariable_7_0, 
                            		"ID");
                    	    

                    }


                    }

                    this_RPAREN_8=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleLocalCode4196); 
                     
                        newLeafNode(this_RPAREN_8, grammarAccess.getLocalCodeAccess().getRPARENTerminalRuleCall_0_8()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2132:1: (this_SEMICOLON_9= RULE_SEMICOLON ( (lv_continuation_10_0= ruleChoreography ) ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==RULE_SEMICOLON) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2132:2: this_SEMICOLON_9= RULE_SEMICOLON ( (lv_continuation_10_0= ruleChoreography ) )
                            {
                            this_SEMICOLON_9=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleLocalCode4207); 
                             
                                newLeafNode(this_SEMICOLON_9, grammarAccess.getLocalCodeAccess().getSEMICOLONTerminalRuleCall_0_9_0()); 
                                
                            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2136:1: ( (lv_continuation_10_0= ruleChoreography ) )
                            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2137:1: (lv_continuation_10_0= ruleChoreography )
                            {
                            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2137:1: (lv_continuation_10_0= ruleChoreography )
                            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2138:3: lv_continuation_10_0= ruleChoreography
                            {
                             
                            	        newCompositeNode(grammarAccess.getLocalCodeAccess().getContinuationChoreographyParserRuleCall_0_9_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleChoreography_in_ruleLocalCode4227);
                            lv_continuation_10_0=ruleChoreography();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getLocalCodeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"continuation",
                                    		lv_continuation_10_0, 
                                    		"Choreography");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2155:6: ( () otherlv_12= 'show' this_AT_13= RULE_AT ( (lv_thread_14_0= RULE_ID ) ) this_LPAREN_15= RULE_LPAREN ( (lv_expression_16_0= ruleExpression ) ) this_RPAREN_17= RULE_RPAREN (this_SEMICOLON_18= RULE_SEMICOLON ( (lv_continuation_19_0= ruleChoreography ) ) )? )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2155:6: ( () otherlv_12= 'show' this_AT_13= RULE_AT ( (lv_thread_14_0= RULE_ID ) ) this_LPAREN_15= RULE_LPAREN ( (lv_expression_16_0= ruleExpression ) ) this_RPAREN_17= RULE_RPAREN (this_SEMICOLON_18= RULE_SEMICOLON ( (lv_continuation_19_0= ruleChoreography ) ) )? )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2155:7: () otherlv_12= 'show' this_AT_13= RULE_AT ( (lv_thread_14_0= RULE_ID ) ) this_LPAREN_15= RULE_LPAREN ( (lv_expression_16_0= ruleExpression ) ) this_RPAREN_17= RULE_RPAREN (this_SEMICOLON_18= RULE_SEMICOLON ( (lv_continuation_19_0= ruleChoreography ) ) )?
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2155:7: ()
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2156:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLocalCodeAccess().getLocalShowCommandAction_1_0(),
                                current);
                        

                    }

                    otherlv_12=(Token)match(input,47,FOLLOW_47_in_ruleLocalCode4258); 

                        	newLeafNode(otherlv_12, grammarAccess.getLocalCodeAccess().getShowKeyword_1_1());
                        
                    this_AT_13=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleLocalCode4269); 
                     
                        newLeafNode(this_AT_13, grammarAccess.getLocalCodeAccess().getATTerminalRuleCall_1_2()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2169:1: ( (lv_thread_14_0= RULE_ID ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2170:1: (lv_thread_14_0= RULE_ID )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2170:1: (lv_thread_14_0= RULE_ID )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2171:3: lv_thread_14_0= RULE_ID
                    {
                    lv_thread_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalCode4285); 

                    			newLeafNode(lv_thread_14_0, grammarAccess.getLocalCodeAccess().getThreadIDTerminalRuleCall_1_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLocalCodeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"thread",
                            		lv_thread_14_0, 
                            		"ID");
                    	    

                    }


                    }

                    this_LPAREN_15=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleLocalCode4301); 
                     
                        newLeafNode(this_LPAREN_15, grammarAccess.getLocalCodeAccess().getLPARENTerminalRuleCall_1_4()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2191:1: ( (lv_expression_16_0= ruleExpression ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2192:1: (lv_expression_16_0= ruleExpression )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2192:1: (lv_expression_16_0= ruleExpression )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2193:3: lv_expression_16_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalCodeAccess().getExpressionExpressionParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleLocalCode4321);
                    lv_expression_16_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalCodeRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_16_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_RPAREN_17=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleLocalCode4332); 
                     
                        newLeafNode(this_RPAREN_17, grammarAccess.getLocalCodeAccess().getRPARENTerminalRuleCall_1_6()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2213:1: (this_SEMICOLON_18= RULE_SEMICOLON ( (lv_continuation_19_0= ruleChoreography ) ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_SEMICOLON) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2213:2: this_SEMICOLON_18= RULE_SEMICOLON ( (lv_continuation_19_0= ruleChoreography ) )
                            {
                            this_SEMICOLON_18=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleLocalCode4343); 
                             
                                newLeafNode(this_SEMICOLON_18, grammarAccess.getLocalCodeAccess().getSEMICOLONTerminalRuleCall_1_7_0()); 
                                
                            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2217:1: ( (lv_continuation_19_0= ruleChoreography ) )
                            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2218:1: (lv_continuation_19_0= ruleChoreography )
                            {
                            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2218:1: (lv_continuation_19_0= ruleChoreography )
                            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2219:3: lv_continuation_19_0= ruleChoreography
                            {
                             
                            	        newCompositeNode(grammarAccess.getLocalCodeAccess().getContinuationChoreographyParserRuleCall_1_7_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleChoreography_in_ruleLocalCode4363);
                            lv_continuation_19_0=ruleChoreography();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getLocalCodeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"continuation",
                                    		lv_continuation_19_0, 
                                    		"Choreography");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2236:6: ( () otherlv_21= 'local' this_AT_22= RULE_AT ( (lv_thread_23_0= RULE_ID ) ) this_LPAREN_24= RULE_LPAREN ( (lv_variable_25_0= RULE_ID ) ) this_ASSIGN_26= RULE_ASSIGN ( (lv_expression_27_0= ruleExpression ) ) this_RPAREN_28= RULE_RPAREN (this_SEMICOLON_29= RULE_SEMICOLON ( (lv_continuation_30_0= ruleChoreography ) ) )? )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2236:6: ( () otherlv_21= 'local' this_AT_22= RULE_AT ( (lv_thread_23_0= RULE_ID ) ) this_LPAREN_24= RULE_LPAREN ( (lv_variable_25_0= RULE_ID ) ) this_ASSIGN_26= RULE_ASSIGN ( (lv_expression_27_0= ruleExpression ) ) this_RPAREN_28= RULE_RPAREN (this_SEMICOLON_29= RULE_SEMICOLON ( (lv_continuation_30_0= ruleChoreography ) ) )? )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2236:7: () otherlv_21= 'local' this_AT_22= RULE_AT ( (lv_thread_23_0= RULE_ID ) ) this_LPAREN_24= RULE_LPAREN ( (lv_variable_25_0= RULE_ID ) ) this_ASSIGN_26= RULE_ASSIGN ( (lv_expression_27_0= ruleExpression ) ) this_RPAREN_28= RULE_RPAREN (this_SEMICOLON_29= RULE_SEMICOLON ( (lv_continuation_30_0= ruleChoreography ) ) )?
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2236:7: ()
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2237:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLocalCodeAccess().getLocalAssignmentCommandAction_2_0(),
                                current);
                        

                    }

                    otherlv_21=(Token)match(input,48,FOLLOW_48_in_ruleLocalCode4394); 

                        	newLeafNode(otherlv_21, grammarAccess.getLocalCodeAccess().getLocalKeyword_2_1());
                        
                    this_AT_22=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleLocalCode4405); 
                     
                        newLeafNode(this_AT_22, grammarAccess.getLocalCodeAccess().getATTerminalRuleCall_2_2()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2250:1: ( (lv_thread_23_0= RULE_ID ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2251:1: (lv_thread_23_0= RULE_ID )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2251:1: (lv_thread_23_0= RULE_ID )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2252:3: lv_thread_23_0= RULE_ID
                    {
                    lv_thread_23_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalCode4421); 

                    			newLeafNode(lv_thread_23_0, grammarAccess.getLocalCodeAccess().getThreadIDTerminalRuleCall_2_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLocalCodeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"thread",
                            		lv_thread_23_0, 
                            		"ID");
                    	    

                    }


                    }

                    this_LPAREN_24=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleLocalCode4437); 
                     
                        newLeafNode(this_LPAREN_24, grammarAccess.getLocalCodeAccess().getLPARENTerminalRuleCall_2_4()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2272:1: ( (lv_variable_25_0= RULE_ID ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2273:1: (lv_variable_25_0= RULE_ID )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2273:1: (lv_variable_25_0= RULE_ID )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2274:3: lv_variable_25_0= RULE_ID
                    {
                    lv_variable_25_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalCode4453); 

                    			newLeafNode(lv_variable_25_0, grammarAccess.getLocalCodeAccess().getVariableIDTerminalRuleCall_2_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLocalCodeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"variable",
                            		lv_variable_25_0, 
                            		"ID");
                    	    

                    }


                    }

                    this_ASSIGN_26=(Token)match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_ruleLocalCode4469); 
                     
                        newLeafNode(this_ASSIGN_26, grammarAccess.getLocalCodeAccess().getASSIGNTerminalRuleCall_2_6()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2294:1: ( (lv_expression_27_0= ruleExpression ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2295:1: (lv_expression_27_0= ruleExpression )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2295:1: (lv_expression_27_0= ruleExpression )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2296:3: lv_expression_27_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalCodeAccess().getExpressionExpressionParserRuleCall_2_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleLocalCode4489);
                    lv_expression_27_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalCodeRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_27_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_RPAREN_28=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleLocalCode4500); 
                     
                        newLeafNode(this_RPAREN_28, grammarAccess.getLocalCodeAccess().getRPARENTerminalRuleCall_2_8()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2316:1: (this_SEMICOLON_29= RULE_SEMICOLON ( (lv_continuation_30_0= ruleChoreography ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_SEMICOLON) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2316:2: this_SEMICOLON_29= RULE_SEMICOLON ( (lv_continuation_30_0= ruleChoreography ) )
                            {
                            this_SEMICOLON_29=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleLocalCode4511); 
                             
                                newLeafNode(this_SEMICOLON_29, grammarAccess.getLocalCodeAccess().getSEMICOLONTerminalRuleCall_2_9_0()); 
                                
                            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2320:1: ( (lv_continuation_30_0= ruleChoreography ) )
                            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2321:1: (lv_continuation_30_0= ruleChoreography )
                            {
                            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2321:1: (lv_continuation_30_0= ruleChoreography )
                            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2322:3: lv_continuation_30_0= ruleChoreography
                            {
                             
                            	        newCompositeNode(grammarAccess.getLocalCodeAccess().getContinuationChoreographyParserRuleCall_2_9_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleChoreography_in_ruleLocalCode4531);
                            lv_continuation_30_0=ruleChoreography();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getLocalCodeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"continuation",
                                    		lv_continuation_30_0, 
                                    		"Choreography");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


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
    // $ANTLR end "ruleLocalCode"


    // $ANTLR start "entryRuleExpression"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2346:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2347:2: (iv_ruleExpression= ruleExpression EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2348:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression4570);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression4580); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2355:1: ruleExpression returns [EObject current=null] : ( (lv_sumExpression_0_0= ruleSumExpression ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_sumExpression_0_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2358:28: ( ( (lv_sumExpression_0_0= ruleSumExpression ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2359:1: ( (lv_sumExpression_0_0= ruleSumExpression ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2359:1: ( (lv_sumExpression_0_0= ruleSumExpression ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2360:1: (lv_sumExpression_0_0= ruleSumExpression )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2360:1: (lv_sumExpression_0_0= ruleSumExpression )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2361:3: lv_sumExpression_0_0= ruleSumExpression
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAccess().getSumExpressionSumExpressionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleSumExpression_in_ruleExpression4625);
            lv_sumExpression_0_0=ruleSumExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"sumExpression",
                    		lv_sumExpression_0_0, 
                    		"SumExpression");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSumExpression"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2385:1: entryRuleSumExpression returns [EObject current=null] : iv_ruleSumExpression= ruleSumExpression EOF ;
    public final EObject entryRuleSumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumExpression = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2386:2: (iv_ruleSumExpression= ruleSumExpression EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2387:2: iv_ruleSumExpression= ruleSumExpression EOF
            {
             newCompositeNode(grammarAccess.getSumExpressionRule()); 
            pushFollow(FOLLOW_ruleSumExpression_in_entryRuleSumExpression4660);
            iv_ruleSumExpression=ruleSumExpression();

            state._fsp--;

             current =iv_ruleSumExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumExpression4670); 

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
    // $ANTLR end "entryRuleSumExpression"


    // $ANTLR start "ruleSumExpression"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2394:1: ruleSumExpression returns [EObject current=null] : ( ( (lv_children_0_0= ruleExpressionBasicTerm ) ) ( (lv_children_1_0= ruleSumExpressionTerm ) )* ) ;
    public final EObject ruleSumExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_children_0_0 = null;

        EObject lv_children_1_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2397:28: ( ( ( (lv_children_0_0= ruleExpressionBasicTerm ) ) ( (lv_children_1_0= ruleSumExpressionTerm ) )* ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2398:1: ( ( (lv_children_0_0= ruleExpressionBasicTerm ) ) ( (lv_children_1_0= ruleSumExpressionTerm ) )* )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2398:1: ( ( (lv_children_0_0= ruleExpressionBasicTerm ) ) ( (lv_children_1_0= ruleSumExpressionTerm ) )* )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2398:2: ( (lv_children_0_0= ruleExpressionBasicTerm ) ) ( (lv_children_1_0= ruleSumExpressionTerm ) )*
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2398:2: ( (lv_children_0_0= ruleExpressionBasicTerm ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2399:1: (lv_children_0_0= ruleExpressionBasicTerm )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2399:1: (lv_children_0_0= ruleExpressionBasicTerm )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2400:3: lv_children_0_0= ruleExpressionBasicTerm
            {
             
            	        newCompositeNode(grammarAccess.getSumExpressionAccess().getChildrenExpressionBasicTermParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpressionBasicTerm_in_ruleSumExpression4716);
            lv_children_0_0=ruleExpressionBasicTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSumExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"children",
                    		lv_children_0_0, 
                    		"ExpressionBasicTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2416:2: ( (lv_children_1_0= ruleSumExpressionTerm ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_PLUS && LA30_0<=RULE_MINUS)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2417:1: (lv_children_1_0= ruleSumExpressionTerm )
            	    {
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2417:1: (lv_children_1_0= ruleSumExpressionTerm )
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2418:3: lv_children_1_0= ruleSumExpressionTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSumExpressionAccess().getChildrenSumExpressionTermParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSumExpressionTerm_in_ruleSumExpression4737);
            	    lv_children_1_0=ruleSumExpressionTerm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSumExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"children",
            	            		lv_children_1_0, 
            	            		"SumExpressionTerm");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


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
    // $ANTLR end "ruleSumExpression"


    // $ANTLR start "entryRuleSumExpressionTerm"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2442:1: entryRuleSumExpressionTerm returns [EObject current=null] : iv_ruleSumExpressionTerm= ruleSumExpressionTerm EOF ;
    public final EObject entryRuleSumExpressionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumExpressionTerm = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2443:2: (iv_ruleSumExpressionTerm= ruleSumExpressionTerm EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2444:2: iv_ruleSumExpressionTerm= ruleSumExpressionTerm EOF
            {
             newCompositeNode(grammarAccess.getSumExpressionTermRule()); 
            pushFollow(FOLLOW_ruleSumExpressionTerm_in_entryRuleSumExpressionTerm4774);
            iv_ruleSumExpressionTerm=ruleSumExpressionTerm();

            state._fsp--;

             current =iv_ruleSumExpressionTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumExpressionTerm4784); 

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
    // $ANTLR end "entryRuleSumExpressionTerm"


    // $ANTLR start "ruleSumExpressionTerm"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2451:1: ruleSumExpressionTerm returns [EObject current=null] : ( ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) ) | ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) ) ) ;
    public final EObject ruleSumExpressionTerm() throws RecognitionException {
        EObject current = null;

        Token this_PLUS_1=null;
        Token this_MINUS_4=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2454:28: ( ( ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) ) | ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2455:1: ( ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) ) | ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2455:1: ( ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) ) | ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_PLUS) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_MINUS) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2455:2: ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2455:2: ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2455:3: () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2455:3: ()
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2456:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSumExpressionTermAccess().getSumExpressionAddTermAction_0_0(),
                                current);
                        

                    }

                    this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleSumExpressionTerm4830); 
                     
                        newLeafNode(this_PLUS_1, grammarAccess.getSumExpressionTermAccess().getPLUSTerminalRuleCall_0_1()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2465:1: ( (lv_expression_2_0= ruleExpressionBasicTerm ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2466:1: (lv_expression_2_0= ruleExpressionBasicTerm )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2466:1: (lv_expression_2_0= ruleExpressionBasicTerm )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2467:3: lv_expression_2_0= ruleExpressionBasicTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getSumExpressionTermAccess().getExpressionExpressionBasicTermParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpressionBasicTerm_in_ruleSumExpressionTerm4850);
                    lv_expression_2_0=ruleExpressionBasicTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSumExpressionTermRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_2_0, 
                            		"ExpressionBasicTerm");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2484:6: ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2484:6: ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2484:7: () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2484:7: ()
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2485:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSumExpressionTermAccess().getSumExpressionSubtractTermAction_1_0(),
                                current);
                        

                    }

                    this_MINUS_4=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleSumExpressionTerm4878); 
                     
                        newLeafNode(this_MINUS_4, grammarAccess.getSumExpressionTermAccess().getMINUSTerminalRuleCall_1_1()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2494:1: ( (lv_expression_5_0= ruleExpressionBasicTerm ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2495:1: (lv_expression_5_0= ruleExpressionBasicTerm )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2495:1: (lv_expression_5_0= ruleExpressionBasicTerm )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2496:3: lv_expression_5_0= ruleExpressionBasicTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getSumExpressionTermAccess().getExpressionExpressionBasicTermParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpressionBasicTerm_in_ruleSumExpressionTerm4898);
                    lv_expression_5_0=ruleExpressionBasicTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSumExpressionTermRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_5_0, 
                            		"ExpressionBasicTerm");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


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
    // $ANTLR end "ruleSumExpressionTerm"


    // $ANTLR start "entryRuleExpressionBasicTerm"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2520:1: entryRuleExpressionBasicTerm returns [EObject current=null] : iv_ruleExpressionBasicTerm= ruleExpressionBasicTerm EOF ;
    public final EObject entryRuleExpressionBasicTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBasicTerm = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2521:2: (iv_ruleExpressionBasicTerm= ruleExpressionBasicTerm EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2522:2: iv_ruleExpressionBasicTerm= ruleExpressionBasicTerm EOF
            {
             newCompositeNode(grammarAccess.getExpressionBasicTermRule()); 
            pushFollow(FOLLOW_ruleExpressionBasicTerm_in_entryRuleExpressionBasicTerm4935);
            iv_ruleExpressionBasicTerm=ruleExpressionBasicTerm();

            state._fsp--;

             current =iv_ruleExpressionBasicTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionBasicTerm4945); 

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
    // $ANTLR end "entryRuleExpressionBasicTerm"


    // $ANTLR start "ruleExpressionBasicTerm"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2529:1: ruleExpressionBasicTerm returns [EObject current=null] : ( ( (lv_variable_0_0= RULE_ID ) ) | ( (lv_constant_1_0= ruleConstant ) ) | (this_LPAREN_2= RULE_LPAREN ( (lv_expression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN ) ) ;
    public final EObject ruleExpressionBasicTerm() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0_0=null;
        Token this_LPAREN_2=null;
        Token this_RPAREN_4=null;
        EObject lv_constant_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2532:28: ( ( ( (lv_variable_0_0= RULE_ID ) ) | ( (lv_constant_1_0= ruleConstant ) ) | (this_LPAREN_2= RULE_LPAREN ( (lv_expression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2533:1: ( ( (lv_variable_0_0= RULE_ID ) ) | ( (lv_constant_1_0= ruleConstant ) ) | (this_LPAREN_2= RULE_LPAREN ( (lv_expression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2533:1: ( ( (lv_variable_0_0= RULE_ID ) ) | ( (lv_constant_1_0= ruleConstant ) ) | (this_LPAREN_2= RULE_LPAREN ( (lv_expression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt32=1;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
                {
                alt32=2;
                }
                break;
            case RULE_LPAREN:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2533:2: ( (lv_variable_0_0= RULE_ID ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2533:2: ( (lv_variable_0_0= RULE_ID ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2534:1: (lv_variable_0_0= RULE_ID )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2534:1: (lv_variable_0_0= RULE_ID )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2535:3: lv_variable_0_0= RULE_ID
                    {
                    lv_variable_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpressionBasicTerm4987); 

                    			newLeafNode(lv_variable_0_0, grammarAccess.getExpressionBasicTermAccess().getVariableIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExpressionBasicTermRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"variable",
                            		lv_variable_0_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2552:6: ( (lv_constant_1_0= ruleConstant ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2552:6: ( (lv_constant_1_0= ruleConstant ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2553:1: (lv_constant_1_0= ruleConstant )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2553:1: (lv_constant_1_0= ruleConstant )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2554:3: lv_constant_1_0= ruleConstant
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionBasicTermAccess().getConstantConstantParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstant_in_ruleExpressionBasicTerm5019);
                    lv_constant_1_0=ruleConstant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionBasicTermRule());
                    	        }
                           		set(
                           			current, 
                           			"constant",
                            		lv_constant_1_0, 
                            		"Constant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2571:6: (this_LPAREN_2= RULE_LPAREN ( (lv_expression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2571:6: (this_LPAREN_2= RULE_LPAREN ( (lv_expression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2571:7: this_LPAREN_2= RULE_LPAREN ( (lv_expression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN
                    {
                    this_LPAREN_2=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleExpressionBasicTerm5037); 
                     
                        newLeafNode(this_LPAREN_2, grammarAccess.getExpressionBasicTermAccess().getLPARENTerminalRuleCall_2_0()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2575:1: ( (lv_expression_3_0= ruleExpression ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2576:1: (lv_expression_3_0= ruleExpression )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2576:1: (lv_expression_3_0= ruleExpression )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2577:3: lv_expression_3_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionBasicTermAccess().getExpressionExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionBasicTerm5057);
                    lv_expression_3_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionBasicTermRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_3_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_RPAREN_4=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleExpressionBasicTerm5068); 
                     
                        newLeafNode(this_RPAREN_4, grammarAccess.getExpressionBasicTermAccess().getRPARENTerminalRuleCall_2_2()); 
                        

                    }


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
    // $ANTLR end "ruleExpressionBasicTerm"


    // $ANTLR start "entryRuleConstant"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2605:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2606:2: (iv_ruleConstant= ruleConstant EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2607:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant5104);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant5114); 

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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2614:1: ruleConstant returns [EObject current=null] : ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_strValue_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_intValue_0_0=null;
        Token lv_strValue_1_0=null;

         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2617:28: ( ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_strValue_1_0= RULE_STRING ) ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2618:1: ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_strValue_1_0= RULE_STRING ) ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2618:1: ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_strValue_1_0= RULE_STRING ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_STRING) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2618:2: ( (lv_intValue_0_0= RULE_INT ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2618:2: ( (lv_intValue_0_0= RULE_INT ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2619:1: (lv_intValue_0_0= RULE_INT )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2619:1: (lv_intValue_0_0= RULE_INT )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2620:3: lv_intValue_0_0= RULE_INT
                    {
                    lv_intValue_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstant5156); 

                    			newLeafNode(lv_intValue_0_0, grammarAccess.getConstantAccess().getIntValueINTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"intValue",
                            		lv_intValue_0_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2637:6: ( (lv_strValue_1_0= RULE_STRING ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2637:6: ( (lv_strValue_1_0= RULE_STRING ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2638:1: (lv_strValue_1_0= RULE_STRING )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2638:1: (lv_strValue_1_0= RULE_STRING )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2639:3: lv_strValue_1_0= RULE_STRING
                    {
                    lv_strValue_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstant5184); 

                    			newLeafNode(lv_strValue_1_0, grammarAccess.getConstantAccess().getStrValueSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"strValue",
                            		lv_strValue_1_0, 
                            		"STRING");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleCondition"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2663:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2664:2: (iv_ruleCondition= ruleCondition EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2665:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition5225);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition5235); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2672:1: ruleCondition returns [EObject current=null] : ( (lv_compareCondition_0_0= ruleCompareCondition ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_compareCondition_0_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2675:28: ( ( (lv_compareCondition_0_0= ruleCompareCondition ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2676:1: ( (lv_compareCondition_0_0= ruleCompareCondition ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2676:1: ( (lv_compareCondition_0_0= ruleCompareCondition ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2677:1: (lv_compareCondition_0_0= ruleCompareCondition )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2677:1: (lv_compareCondition_0_0= ruleCompareCondition )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2678:3: lv_compareCondition_0_0= ruleCompareCondition
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getCompareConditionCompareConditionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleCompareCondition_in_ruleCondition5280);
            lv_compareCondition_0_0=ruleCompareCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	        }
                   		set(
                   			current, 
                   			"compareCondition",
                    		lv_compareCondition_0_0, 
                    		"CompareCondition");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleCompareCondition"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2702:1: entryRuleCompareCondition returns [EObject current=null] : iv_ruleCompareCondition= ruleCompareCondition EOF ;
    public final EObject entryRuleCompareCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareCondition = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2703:2: (iv_ruleCompareCondition= ruleCompareCondition EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2704:2: iv_ruleCompareCondition= ruleCompareCondition EOF
            {
             newCompositeNode(grammarAccess.getCompareConditionRule()); 
            pushFollow(FOLLOW_ruleCompareCondition_in_entryRuleCompareCondition5315);
            iv_ruleCompareCondition=ruleCompareCondition();

            state._fsp--;

             current =iv_ruleCompareCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareCondition5325); 

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
    // $ANTLR end "entryRuleCompareCondition"


    // $ANTLR start "ruleCompareCondition"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2711:1: ruleCompareCondition returns [EObject current=null] : ( ( (lv_leftExpression_0_0= ruleExpression ) ) ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_rightExpression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleCompareCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_leftExpression_0_0 = null;

        EObject lv_operator_1_0 = null;

        EObject lv_rightExpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2714:28: ( ( ( (lv_leftExpression_0_0= ruleExpression ) ) ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_rightExpression_2_0= ruleExpression ) ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2715:1: ( ( (lv_leftExpression_0_0= ruleExpression ) ) ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_rightExpression_2_0= ruleExpression ) ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2715:1: ( ( (lv_leftExpression_0_0= ruleExpression ) ) ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_rightExpression_2_0= ruleExpression ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2715:2: ( (lv_leftExpression_0_0= ruleExpression ) ) ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_rightExpression_2_0= ruleExpression ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2715:2: ( (lv_leftExpression_0_0= ruleExpression ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2716:1: (lv_leftExpression_0_0= ruleExpression )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2716:1: (lv_leftExpression_0_0= ruleExpression )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2717:3: lv_leftExpression_0_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getCompareConditionAccess().getLeftExpressionExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleCompareCondition5371);
            lv_leftExpression_0_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompareConditionRule());
            	        }
                   		set(
                   			current, 
                   			"leftExpression",
                    		lv_leftExpression_0_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2733:2: ( (lv_operator_1_0= ruleConditionOperator ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2734:1: (lv_operator_1_0= ruleConditionOperator )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2734:1: (lv_operator_1_0= ruleConditionOperator )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2735:3: lv_operator_1_0= ruleConditionOperator
            {
             
            	        newCompositeNode(grammarAccess.getCompareConditionAccess().getOperatorConditionOperatorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConditionOperator_in_ruleCompareCondition5392);
            lv_operator_1_0=ruleConditionOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompareConditionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_1_0, 
                    		"ConditionOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2751:2: ( (lv_rightExpression_2_0= ruleExpression ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2752:1: (lv_rightExpression_2_0= ruleExpression )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2752:1: (lv_rightExpression_2_0= ruleExpression )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2753:3: lv_rightExpression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getCompareConditionAccess().getRightExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleCompareCondition5413);
            lv_rightExpression_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompareConditionRule());
            	        }
                   		set(
                   			current, 
                   			"rightExpression",
                    		lv_rightExpression_2_0, 
                    		"Expression");
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
    // $ANTLR end "ruleCompareCondition"


    // $ANTLR start "entryRuleConditionOperator"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2777:1: entryRuleConditionOperator returns [EObject current=null] : iv_ruleConditionOperator= ruleConditionOperator EOF ;
    public final EObject entryRuleConditionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionOperator = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2778:2: (iv_ruleConditionOperator= ruleConditionOperator EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2779:2: iv_ruleConditionOperator= ruleConditionOperator EOF
            {
             newCompositeNode(grammarAccess.getConditionOperatorRule()); 
            pushFollow(FOLLOW_ruleConditionOperator_in_entryRuleConditionOperator5449);
            iv_ruleConditionOperator=ruleConditionOperator();

            state._fsp--;

             current =iv_ruleConditionOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionOperator5459); 

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
    // $ANTLR end "entryRuleConditionOperator"


    // $ANTLR start "ruleConditionOperator"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2786:1: ruleConditionOperator returns [EObject current=null] : ( ( (lv_less_0_0= RULE_LESS ) ) | ( (lv_equal_1_0= RULE_EQUAL ) ) | ( (lv_greater_2_0= RULE_GREATER ) ) | ( (lv_not_equal_3_0= RULE_NOT_EQUAL ) ) ) ;
    public final EObject ruleConditionOperator() throws RecognitionException {
        EObject current = null;

        Token lv_less_0_0=null;
        Token lv_equal_1_0=null;
        Token lv_greater_2_0=null;
        Token lv_not_equal_3_0=null;

         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2789:28: ( ( ( (lv_less_0_0= RULE_LESS ) ) | ( (lv_equal_1_0= RULE_EQUAL ) ) | ( (lv_greater_2_0= RULE_GREATER ) ) | ( (lv_not_equal_3_0= RULE_NOT_EQUAL ) ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2790:1: ( ( (lv_less_0_0= RULE_LESS ) ) | ( (lv_equal_1_0= RULE_EQUAL ) ) | ( (lv_greater_2_0= RULE_GREATER ) ) | ( (lv_not_equal_3_0= RULE_NOT_EQUAL ) ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2790:1: ( ( (lv_less_0_0= RULE_LESS ) ) | ( (lv_equal_1_0= RULE_EQUAL ) ) | ( (lv_greater_2_0= RULE_GREATER ) ) | ( (lv_not_equal_3_0= RULE_NOT_EQUAL ) ) )
            int alt34=4;
            switch ( input.LA(1) ) {
            case RULE_LESS:
                {
                alt34=1;
                }
                break;
            case RULE_EQUAL:
                {
                alt34=2;
                }
                break;
            case RULE_GREATER:
                {
                alt34=3;
                }
                break;
            case RULE_NOT_EQUAL:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2790:2: ( (lv_less_0_0= RULE_LESS ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2790:2: ( (lv_less_0_0= RULE_LESS ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2791:1: (lv_less_0_0= RULE_LESS )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2791:1: (lv_less_0_0= RULE_LESS )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2792:3: lv_less_0_0= RULE_LESS
                    {
                    lv_less_0_0=(Token)match(input,RULE_LESS,FOLLOW_RULE_LESS_in_ruleConditionOperator5501); 

                    			newLeafNode(lv_less_0_0, grammarAccess.getConditionOperatorAccess().getLessLESSTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConditionOperatorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"less",
                            		true, 
                            		"LESS");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2809:6: ( (lv_equal_1_0= RULE_EQUAL ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2809:6: ( (lv_equal_1_0= RULE_EQUAL ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2810:1: (lv_equal_1_0= RULE_EQUAL )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2810:1: (lv_equal_1_0= RULE_EQUAL )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2811:3: lv_equal_1_0= RULE_EQUAL
                    {
                    lv_equal_1_0=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleConditionOperator5529); 

                    			newLeafNode(lv_equal_1_0, grammarAccess.getConditionOperatorAccess().getEqualEQUALTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConditionOperatorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"equal",
                            		true, 
                            		"EQUAL");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2828:6: ( (lv_greater_2_0= RULE_GREATER ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2828:6: ( (lv_greater_2_0= RULE_GREATER ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2829:1: (lv_greater_2_0= RULE_GREATER )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2829:1: (lv_greater_2_0= RULE_GREATER )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2830:3: lv_greater_2_0= RULE_GREATER
                    {
                    lv_greater_2_0=(Token)match(input,RULE_GREATER,FOLLOW_RULE_GREATER_in_ruleConditionOperator5557); 

                    			newLeafNode(lv_greater_2_0, grammarAccess.getConditionOperatorAccess().getGreaterGREATERTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConditionOperatorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"greater",
                            		true, 
                            		"GREATER");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2847:6: ( (lv_not_equal_3_0= RULE_NOT_EQUAL ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2847:6: ( (lv_not_equal_3_0= RULE_NOT_EQUAL ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2848:1: (lv_not_equal_3_0= RULE_NOT_EQUAL )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2848:1: (lv_not_equal_3_0= RULE_NOT_EQUAL )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2849:3: lv_not_equal_3_0= RULE_NOT_EQUAL
                    {
                    lv_not_equal_3_0=(Token)match(input,RULE_NOT_EQUAL,FOLLOW_RULE_NOT_EQUAL_in_ruleConditionOperator5585); 

                    			newLeafNode(lv_not_equal_3_0, grammarAccess.getConditionOperatorAccess().getNot_equalNOT_EQUALTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConditionOperatorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"not_equal",
                            		true, 
                            		"NOT_EQUAL");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleConditionOperator"

    // Delegated rules


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\17\uffff";
    static final String DFA13_eofS =
        "\17\uffff";
    static final String DFA13_minS =
        "\1\4\1\10\4\uffff\1\4\2\uffff\1\14\1\4\1\10\1\4\1\10\1\uffff";
    static final String DFA13_maxS =
        "\1\60\1\20\4\uffff\1\4\2\uffff\1\20\1\4\1\10\1\4\1\12\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\5\1\6\1\7\1\4\1\uffff\1\2\1\1\5\uffff\1\3";
    static final String DFA13_specialS =
        "\17\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\1\uffff\1\4\45\uffff\1\2\1\uffff\3\3",
            "\1\5\2\uffff\1\10\2\uffff\1\6\1\uffff\1\7",
            "",
            "",
            "",
            "",
            "\1\11",
            "",
            "",
            "\1\12\3\uffff\1\7",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16\1\uffff\1\7",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1144:1: (this_Start_0= ruleStart | this_Interaction_1= ruleInteraction | this_Delegation_2= ruleDelegation | this_Call_3= ruleCall | this_IfThenElse_4= ruleIfThenElse | this_LocalCode_5= ruleLocalCode | (this_LCURLY_6= RULE_LCURLY this_Choreography_7= ruleChoreography this_RCURLY_8= RULE_RCURLY ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleProgram122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProgram139 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleProgram155 = new BitSet(new long[]{0x0000007800000000L});
    public static final BitSet FOLLOW_rulePreamble_in_ruleProgram175 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_ruleProcedure_in_ruleProgram196 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleProgram209 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleProgram220 = new BitSet(new long[]{0x0001D00000000050L});
    public static final BitSet FOLLOW_ruleChoreography_in_ruleProgram240 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleProgram251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreamble_in_entryRulePreamble286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreamble296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_rulePreamble352 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleSite_in_rulePreamble379 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_entryRuleProcedure417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedure427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleProcedure464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcedure481 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleProcedure497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcedure513 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleProcedure530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcedure546 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleProcedure564 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleProcedure574 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_ruleSessionProcedureParameter_in_ruleProcedure595 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleProcedure607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSessionProcedureParameter_in_ruleProcedure627 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleProcedure642 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleProcedure652 = new BitSet(new long[]{0x0001D00000000050L});
    public static final BitSet FOLLOW_ruleChoreography_in_ruleProcedure672 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleProcedure683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSessionProcedureParameter_in_entryRuleSessionProcedureParameter718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSessionProcedureParameter728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSessionProcedureParameter770 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_LSQUARE_in_ruleSessionProcedureParameter786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGlobalTypeCall_in_ruleSessionProcedureParameter806 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleSessionProcedureParameter817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleThreadWithRole_in_ruleSessionProcedureParameter837 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleSessionProcedureParameter849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleThreadWithRole_in_ruleSessionProcedureParameter869 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_RULE_RSQUARE_in_ruleSessionProcedureParameter882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_entryRuleProtocol917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocol927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleProtocol964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProtocol981 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleProtocol997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGlobalType_in_ruleProtocol1017 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleProtocol1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSite_in_entryRuleSite1063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSite1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleSite1110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSite1127 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleSite1143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSite1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalType_in_entryRuleGlobalType1198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalType1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalTypeInteraction_in_ruleGlobalType1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalTypeCall_in_ruleGlobalType1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalTypeInteraction_in_entryRuleGlobalTypeInteraction1317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalTypeInteraction1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlobalTypeInteraction1369 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_ARROW_in_ruleGlobalTypeInteraction1385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlobalTypeInteraction1401 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleGlobalTypeInteraction1417 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleBranchGType_in_ruleGlobalTypeInteraction1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleGlobalTypeInteraction1456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBranchGType_in_ruleGlobalTypeInteraction1476 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleGlobalTypeInteraction1488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBranchGType_in_ruleGlobalTypeInteraction1508 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleGlobalTypeInteraction1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalTypeCall_in_entryRuleGlobalTypeCall1558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalTypeCall1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlobalTypeCall1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranchGType_in_entryRuleBranchGType1647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBranchGType1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBranchGType1699 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleBranchGType1715 = new BitSet(new long[]{0x0000078000000010L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleBranchGType1735 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleBranchGType1746 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleBranchGType1757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGlobalType_in_ruleBranchGType1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType1815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleDataType1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelegationType_in_ruleDataType1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelegationType_in_entryRuleDelegationType1934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelegationType1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalTypeCall_in_ruleDelegationType1990 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleDelegationType2001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDelegationType2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType2058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBasicType2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBasicType2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleBasicType2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleBasicType2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoreography_in_entryRuleChoreography2282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoreography2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStart_in_ruleChoreography2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteraction_in_ruleChoreography2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelegation_in_ruleChoreography2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleChoreography2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenElse_in_ruleChoreography2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalCode_in_ruleChoreography2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleChoreography2491 = new BitSet(new long[]{0x0001D00000000050L});
    public static final BitSet FOLLOW_ruleChoreography_in_ruleChoreography2512 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleChoreography2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStart_in_entryRuleStart2558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStart2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThreadWithRole_in_ruleStart2614 = new BitSet(new long[]{0x0000080000000200L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleStart2626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleThreadWithRole_in_ruleStart2646 = new BitSet(new long[]{0x0000080000000200L});
    public static final BitSet FOLLOW_43_in_ruleStart2660 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleThreadWithRole_in_ruleStart2682 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleStart2694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleThreadWithRole_in_ruleStart2714 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleStart2729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStart2748 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleStart2759 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStart2775 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleStart2791 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleStart2802 = new BitSet(new long[]{0x0001D00000000050L});
    public static final BitSet FOLLOW_ruleChoreography_in_ruleStart2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThreadWithRole_in_entryRuleThreadWithRole2860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThreadWithRole2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleThreadWithRole2912 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_LSQUARE_in_ruleThreadWithRole2928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleThreadWithRole2944 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RSQUARE_in_ruleThreadWithRole2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteraction_in_entryRuleInteraction2995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteraction3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteraction3047 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleInteraction3064 = new BitSet(new long[]{0x0000000000300110L});
    public static final BitSet FOLLOW_ruleExpressionBasicTerm_in_ruleInteraction3084 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_ARROW_in_ruleInteraction3097 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteraction3113 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleInteraction3130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteraction3146 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleInteraction3164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteraction3180 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleInteraction3196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteraction3212 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleInteraction3228 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleInteraction3239 = new BitSet(new long[]{0x0001D00000000050L});
    public static final BitSet FOLLOW_ruleChoreography_in_ruleInteraction3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelegation_in_entryRuleDelegation3297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelegation3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDelegation3349 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_ARROW_in_ruleDelegation3365 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDelegation3381 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleDelegation3397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDelegation3413 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleDelegation3429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDelegation3445 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleDelegation3461 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDelegation3477 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleDelegation3493 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleDelegation3503 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleDelegation3514 = new BitSet(new long[]{0x0001D00000000050L});
    public static final BitSet FOLLOW_ruleChoreography_in_ruleDelegation3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall3572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCall3627 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleCall3638 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCall3654 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleCall3671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCall3687 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleCall3705 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleCall3715 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCall3732 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleCall3749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCall3765 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleCall3785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse3820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfThenElse3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleIfThenElse3867 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleIfThenElse3878 = new BitSet(new long[]{0x0000000000300110L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleIfThenElse3898 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleIfThenElse3909 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleIfThenElse3919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIfThenElse3935 = new BitSet(new long[]{0x0001D00000000050L});
    public static final BitSet FOLLOW_ruleChoreography_in_ruleIfThenElse3961 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleIfThenElse3974 = new BitSet(new long[]{0x0001D00000000050L});
    public static final BitSet FOLLOW_ruleChoreography_in_ruleIfThenElse3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalCode_in_entryRuleLocalCode4033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalCode4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleLocalCode4090 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleLocalCode4101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalCode4117 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleLocalCode4133 = new BitSet(new long[]{0x0000000000300110L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLocalCode4153 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleLocalCode4164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalCode4180 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleLocalCode4196 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleLocalCode4207 = new BitSet(new long[]{0x0001D00000000050L});
    public static final BitSet FOLLOW_ruleChoreography_in_ruleLocalCode4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleLocalCode4258 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleLocalCode4269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalCode4285 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleLocalCode4301 = new BitSet(new long[]{0x0000000000300110L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLocalCode4321 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleLocalCode4332 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleLocalCode4343 = new BitSet(new long[]{0x0001D00000000050L});
    public static final BitSet FOLLOW_ruleChoreography_in_ruleLocalCode4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleLocalCode4394 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleLocalCode4405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalCode4421 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleLocalCode4437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalCode4453 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_ruleLocalCode4469 = new BitSet(new long[]{0x0000000000300110L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLocalCode4489 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleLocalCode4500 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleLocalCode4511 = new BitSet(new long[]{0x0001D00000000050L});
    public static final BitSet FOLLOW_ruleChoreography_in_ruleLocalCode4531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression4570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression4580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumExpression_in_ruleExpression4625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumExpression_in_entryRuleSumExpression4660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumExpression4670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionBasicTerm_in_ruleSumExpression4716 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_ruleSumExpressionTerm_in_ruleSumExpression4737 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_ruleSumExpressionTerm_in_entryRuleSumExpressionTerm4774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumExpressionTerm4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleSumExpressionTerm4830 = new BitSet(new long[]{0x0000000000300110L});
    public static final BitSet FOLLOW_ruleExpressionBasicTerm_in_ruleSumExpressionTerm4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleSumExpressionTerm4878 = new BitSet(new long[]{0x0000000000300110L});
    public static final BitSet FOLLOW_ruleExpressionBasicTerm_in_ruleSumExpressionTerm4898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionBasicTerm_in_entryRuleExpressionBasicTerm4935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionBasicTerm4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpressionBasicTerm4987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleExpressionBasicTerm5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleExpressionBasicTerm5037 = new BitSet(new long[]{0x0000000000300110L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionBasicTerm5057 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleExpressionBasicTerm5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant5104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant5114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstant5156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstant5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition5225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareCondition_in_ruleCondition5280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareCondition_in_entryRuleCompareCondition5315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareCondition5325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCompareCondition5371 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_ruleConditionOperator_in_ruleCompareCondition5392 = new BitSet(new long[]{0x0000000000300110L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCompareCondition5413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionOperator_in_entryRuleConditionOperator5449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionOperator5459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LESS_in_ruleConditionOperator5501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleConditionOperator5529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GREATER_in_ruleConditionOperator5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_EQUAL_in_ruleConditionOperator5585 = new BitSet(new long[]{0x0000000000000002L});

}