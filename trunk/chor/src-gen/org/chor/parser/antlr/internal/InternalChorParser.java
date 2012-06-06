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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SEMICOLON", "RULE_LCURLY", "RULE_RCURLY", "RULE_COLON", "RULE_ARROW", "RULE_COMMA", "RULE_LPAREN", "RULE_RPAREN", "RULE_BANG", "RULE_QUESTION_MARK", "RULE_LSQUARE", "RULE_RSQUARE", "RULE_DOT", "RULE_AT", "RULE_PLUS", "RULE_MINUS", "RULE_INT", "RULE_STRING", "RULE_LESS", "RULE_EQUAL", "RULE_GREATER", "RULE_NOT_EQUAL", "RULE_TIMES", "RULE_VERT", "RULE_ASSIGN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'main'", "'protocol'", "'site'", "'int'", "'string'", "'bool'", "'void'", "'start'", "'if'", "'else'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_SEMICOLON=5;
    public static final int RULE_ANY_OTHER=33;
    public static final int RULE_NOT_EQUAL=26;
    public static final int EOF=-1;
    public static final int RULE_RSQUARE=16;
    public static final int RULE_ASSIGN=29;
    public static final int RULE_DOT=17;
    public static final int RULE_LPAREN=11;
    public static final int RULE_INT=21;
    public static final int RULE_VERT=28;
    public static final int RULE_LSQUARE=15;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int RULE_BANG=13;
    public static final int RULE_GREATER=25;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_PLUS=19;
    public static final int RULE_COMMA=10;
    public static final int RULE_EQUAL=24;
    public static final int RULE_SL_COMMENT=31;
    public static final int RULE_QUESTION_MARK=14;
    public static final int RULE_TIMES=27;
    public static final int RULE_ML_COMMENT=30;
    public static final int RULE_COLON=8;
    public static final int RULE_MINUS=20;
    public static final int RULE_STRING=22;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_ARROW=9;
    public static final int RULE_LESS=23;
    public static final int RULE_RPAREN=12;
    public static final int RULE_WS=32;
    public static final int RULE_RCURLY=7;
    public static final int RULE_AT=18;
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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:76:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_preamble_3_0= rulePreamble ) ) otherlv_4= 'main' this_LCURLY_5= RULE_LCURLY ( (lv_choreography_6_0= ruleChoreography ) ) this_RCURLY_7= RULE_RCURLY ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_SEMICOLON_2=null;
        Token otherlv_4=null;
        Token this_LCURLY_5=null;
        Token this_RCURLY_7=null;
        EObject lv_preamble_3_0 = null;

        EObject lv_choreography_6_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:79:28: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_preamble_3_0= rulePreamble ) ) otherlv_4= 'main' this_LCURLY_5= RULE_LCURLY ( (lv_choreography_6_0= ruleChoreography ) ) this_RCURLY_7= RULE_RCURLY ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:80:1: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_preamble_3_0= rulePreamble ) ) otherlv_4= 'main' this_LCURLY_5= RULE_LCURLY ( (lv_choreography_6_0= ruleChoreography ) ) this_RCURLY_7= RULE_RCURLY )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:80:1: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_preamble_3_0= rulePreamble ) ) otherlv_4= 'main' this_LCURLY_5= RULE_LCURLY ( (lv_choreography_6_0= ruleChoreography ) ) this_RCURLY_7= RULE_RCURLY )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:80:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_preamble_3_0= rulePreamble ) ) otherlv_4= 'main' this_LCURLY_5= RULE_LCURLY ( (lv_choreography_6_0= ruleChoreography ) ) this_RCURLY_7= RULE_RCURLY
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

            otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleProgram187); 

                	newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getMainKeyword_4());
                
            this_LCURLY_5=(Token)match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleProgram198); 
             
                newLeafNode(this_LCURLY_5, grammarAccess.getProgramAccess().getLCURLYTerminalRuleCall_5()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:132:1: ( (lv_choreography_6_0= ruleChoreography ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:133:1: (lv_choreography_6_0= ruleChoreography )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:133:1: (lv_choreography_6_0= ruleChoreography )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:134:3: lv_choreography_6_0= ruleChoreography
            {
             
            	        newCompositeNode(grammarAccess.getProgramAccess().getChoreographyChoreographyParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleChoreography_in_ruleProgram218);
            lv_choreography_6_0=ruleChoreography();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	        }
                   		set(
                   			current, 
                   			"choreography",
                    		lv_choreography_6_0, 
                    		"Choreography");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_RCURLY_7=(Token)match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleProgram229); 
             
                newLeafNode(this_RCURLY_7, grammarAccess.getProgramAccess().getRCURLYTerminalRuleCall_7()); 
                

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:162:1: entryRulePreamble returns [EObject current=null] : iv_rulePreamble= rulePreamble EOF ;
    public final EObject entryRulePreamble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreamble = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:163:2: (iv_rulePreamble= rulePreamble EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:164:2: iv_rulePreamble= rulePreamble EOF
            {
             newCompositeNode(grammarAccess.getPreambleRule()); 
            pushFollow(FOLLOW_rulePreamble_in_entryRulePreamble264);
            iv_rulePreamble=rulePreamble();

            state._fsp--;

             current =iv_rulePreamble; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreamble274); 

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:171:1: rulePreamble returns [EObject current=null] : ( () ( ( (lv_protocols_1_0= ruleProtocol ) ) | ( (lv_site_2_0= ruleSite ) ) )* ) ;
    public final EObject rulePreamble() throws RecognitionException {
        EObject current = null;

        EObject lv_protocols_1_0 = null;

        EObject lv_site_2_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:174:28: ( ( () ( ( (lv_protocols_1_0= ruleProtocol ) ) | ( (lv_site_2_0= ruleSite ) ) )* ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:175:1: ( () ( ( (lv_protocols_1_0= ruleProtocol ) ) | ( (lv_site_2_0= ruleSite ) ) )* )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:175:1: ( () ( ( (lv_protocols_1_0= ruleProtocol ) ) | ( (lv_site_2_0= ruleSite ) ) )* )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:175:2: () ( ( (lv_protocols_1_0= ruleProtocol ) ) | ( (lv_site_2_0= ruleSite ) ) )*
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:175:2: ()
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:176:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPreambleAccess().getPreambleAction_0(),
                        current);
                

            }

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:181:2: ( ( (lv_protocols_1_0= ruleProtocol ) ) | ( (lv_site_2_0= ruleSite ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==36) ) {
                    alt1=1;
                }
                else if ( (LA1_0==37) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:181:3: ( (lv_protocols_1_0= ruleProtocol ) )
            	    {
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:181:3: ( (lv_protocols_1_0= ruleProtocol ) )
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:182:1: (lv_protocols_1_0= ruleProtocol )
            	    {
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:182:1: (lv_protocols_1_0= ruleProtocol )
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:183:3: lv_protocols_1_0= ruleProtocol
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPreambleAccess().getProtocolsProtocolParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProtocol_in_rulePreamble330);
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
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:200:6: ( (lv_site_2_0= ruleSite ) )
            	    {
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:200:6: ( (lv_site_2_0= ruleSite ) )
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:201:1: (lv_site_2_0= ruleSite )
            	    {
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:201:1: (lv_site_2_0= ruleSite )
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:202:3: lv_site_2_0= ruleSite
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPreambleAccess().getSiteSiteParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSite_in_rulePreamble357);
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
            	    break loop1;
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


    // $ANTLR start "entryRuleProtocol"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:226:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:227:2: (iv_ruleProtocol= ruleProtocol EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:228:2: iv_ruleProtocol= ruleProtocol EOF
            {
             newCompositeNode(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_ruleProtocol_in_entryRuleProtocol395);
            iv_ruleProtocol=ruleProtocol();

            state._fsp--;

             current =iv_ruleProtocol; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocol405); 

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:235:1: ruleProtocol returns [EObject current=null] : (otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_type_3_0= ruleGlobalType ) ) this_RCURLY_4= RULE_RCURLY ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token this_RCURLY_4=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:238:28: ( (otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_type_3_0= ruleGlobalType ) ) this_RCURLY_4= RULE_RCURLY ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:239:1: (otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_type_3_0= ruleGlobalType ) ) this_RCURLY_4= RULE_RCURLY )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:239:1: (otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_type_3_0= ruleGlobalType ) ) this_RCURLY_4= RULE_RCURLY )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:239:3: otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_type_3_0= ruleGlobalType ) ) this_RCURLY_4= RULE_RCURLY
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleProtocol442); 

                	newLeafNode(otherlv_0, grammarAccess.getProtocolAccess().getProtocolKeyword_0());
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:243:1: ( (lv_name_1_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:244:1: (lv_name_1_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:244:1: (lv_name_1_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:245:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProtocol459); 

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

            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleProtocol475); 
             
                newLeafNode(this_LCURLY_2, grammarAccess.getProtocolAccess().getLCURLYTerminalRuleCall_2()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:265:1: ( (lv_type_3_0= ruleGlobalType ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:266:1: (lv_type_3_0= ruleGlobalType )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:266:1: (lv_type_3_0= ruleGlobalType )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:267:3: lv_type_3_0= ruleGlobalType
            {
             
            	        newCompositeNode(grammarAccess.getProtocolAccess().getTypeGlobalTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleGlobalType_in_ruleProtocol495);
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

            this_RCURLY_4=(Token)match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleProtocol506); 
             
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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:295:1: entryRuleSite returns [EObject current=null] : iv_ruleSite= ruleSite EOF ;
    public final EObject entryRuleSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSite = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:296:2: (iv_ruleSite= ruleSite EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:297:2: iv_ruleSite= ruleSite EOF
            {
             newCompositeNode(grammarAccess.getSiteRule()); 
            pushFollow(FOLLOW_ruleSite_in_entryRuleSite541);
            iv_ruleSite=ruleSite();

            state._fsp--;

             current =iv_ruleSite; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSite551); 

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:304:1: ruleSite returns [EObject current=null] : (otherlv_0= 'site' ( (lv_name_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleSite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_COLON_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:307:28: ( (otherlv_0= 'site' ( (lv_name_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (otherlv_3= RULE_ID ) ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:308:1: (otherlv_0= 'site' ( (lv_name_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (otherlv_3= RULE_ID ) ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:308:1: (otherlv_0= 'site' ( (lv_name_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (otherlv_3= RULE_ID ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:308:3: otherlv_0= 'site' ( (lv_name_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleSite588); 

                	newLeafNode(otherlv_0, grammarAccess.getSiteAccess().getSiteKeyword_0());
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:312:1: ( (lv_name_1_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:313:1: (lv_name_1_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:313:1: (lv_name_1_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:314:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSite605); 

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

            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleSite621); 
             
                newLeafNode(this_COLON_2, grammarAccess.getSiteAccess().getCOLONTerminalRuleCall_2()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:334:1: ( (otherlv_3= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:335:1: (otherlv_3= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:335:1: (otherlv_3= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:336:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSiteRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSite640); 

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:355:1: entryRuleGlobalType returns [EObject current=null] : iv_ruleGlobalType= ruleGlobalType EOF ;
    public final EObject entryRuleGlobalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalType = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:356:2: (iv_ruleGlobalType= ruleGlobalType EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:357:2: iv_ruleGlobalType= ruleGlobalType EOF
            {
             newCompositeNode(grammarAccess.getGlobalTypeRule()); 
            pushFollow(FOLLOW_ruleGlobalType_in_entryRuleGlobalType676);
            iv_ruleGlobalType=ruleGlobalType();

            state._fsp--;

             current =iv_ruleGlobalType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalType686); 

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:364:1: ruleGlobalType returns [EObject current=null] : ( ( (lv_sender_0_0= RULE_ID ) ) this_ARROW_1= RULE_ARROW ( (lv_receiver_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( ( (lv_branches_4_0= ruleBranchGType ) ) | (this_LCURLY_5= RULE_LCURLY ( (lv_branches_6_0= ruleBranchGType ) ) (this_COMMA_7= RULE_COMMA ( (lv_branches_8_0= ruleBranchGType ) ) )* this_RCURLY_9= RULE_RCURLY ) ) ) ;
    public final EObject ruleGlobalType() throws RecognitionException {
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:367:28: ( ( ( (lv_sender_0_0= RULE_ID ) ) this_ARROW_1= RULE_ARROW ( (lv_receiver_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( ( (lv_branches_4_0= ruleBranchGType ) ) | (this_LCURLY_5= RULE_LCURLY ( (lv_branches_6_0= ruleBranchGType ) ) (this_COMMA_7= RULE_COMMA ( (lv_branches_8_0= ruleBranchGType ) ) )* this_RCURLY_9= RULE_RCURLY ) ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:368:1: ( ( (lv_sender_0_0= RULE_ID ) ) this_ARROW_1= RULE_ARROW ( (lv_receiver_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( ( (lv_branches_4_0= ruleBranchGType ) ) | (this_LCURLY_5= RULE_LCURLY ( (lv_branches_6_0= ruleBranchGType ) ) (this_COMMA_7= RULE_COMMA ( (lv_branches_8_0= ruleBranchGType ) ) )* this_RCURLY_9= RULE_RCURLY ) ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:368:1: ( ( (lv_sender_0_0= RULE_ID ) ) this_ARROW_1= RULE_ARROW ( (lv_receiver_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( ( (lv_branches_4_0= ruleBranchGType ) ) | (this_LCURLY_5= RULE_LCURLY ( (lv_branches_6_0= ruleBranchGType ) ) (this_COMMA_7= RULE_COMMA ( (lv_branches_8_0= ruleBranchGType ) ) )* this_RCURLY_9= RULE_RCURLY ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:368:2: ( (lv_sender_0_0= RULE_ID ) ) this_ARROW_1= RULE_ARROW ( (lv_receiver_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( ( (lv_branches_4_0= ruleBranchGType ) ) | (this_LCURLY_5= RULE_LCURLY ( (lv_branches_6_0= ruleBranchGType ) ) (this_COMMA_7= RULE_COMMA ( (lv_branches_8_0= ruleBranchGType ) ) )* this_RCURLY_9= RULE_RCURLY ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:368:2: ( (lv_sender_0_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:369:1: (lv_sender_0_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:369:1: (lv_sender_0_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:370:3: lv_sender_0_0= RULE_ID
            {
            lv_sender_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlobalType728); 

            			newLeafNode(lv_sender_0_0, grammarAccess.getGlobalTypeAccess().getSenderIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGlobalTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sender",
                    		lv_sender_0_0, 
                    		"ID");
            	    

            }


            }

            this_ARROW_1=(Token)match(input,RULE_ARROW,FOLLOW_RULE_ARROW_in_ruleGlobalType744); 
             
                newLeafNode(this_ARROW_1, grammarAccess.getGlobalTypeAccess().getARROWTerminalRuleCall_1()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:390:1: ( (lv_receiver_2_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:391:1: (lv_receiver_2_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:391:1: (lv_receiver_2_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:392:3: lv_receiver_2_0= RULE_ID
            {
            lv_receiver_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlobalType760); 

            			newLeafNode(lv_receiver_2_0, grammarAccess.getGlobalTypeAccess().getReceiverIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGlobalTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"receiver",
                    		lv_receiver_2_0, 
                    		"ID");
            	    

            }


            }

            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleGlobalType776); 
             
                newLeafNode(this_COLON_3, grammarAccess.getGlobalTypeAccess().getCOLONTerminalRuleCall_3()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:412:1: ( ( (lv_branches_4_0= ruleBranchGType ) ) | (this_LCURLY_5= RULE_LCURLY ( (lv_branches_6_0= ruleBranchGType ) ) (this_COMMA_7= RULE_COMMA ( (lv_branches_8_0= ruleBranchGType ) ) )* this_RCURLY_9= RULE_RCURLY ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_LCURLY) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:412:2: ( (lv_branches_4_0= ruleBranchGType ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:412:2: ( (lv_branches_4_0= ruleBranchGType ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:413:1: (lv_branches_4_0= ruleBranchGType )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:413:1: (lv_branches_4_0= ruleBranchGType )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:414:3: lv_branches_4_0= ruleBranchGType
                    {
                     
                    	        newCompositeNode(grammarAccess.getGlobalTypeAccess().getBranchesBranchGTypeParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBranchGType_in_ruleGlobalType797);
                    lv_branches_4_0=ruleBranchGType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGlobalTypeRule());
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
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:431:6: (this_LCURLY_5= RULE_LCURLY ( (lv_branches_6_0= ruleBranchGType ) ) (this_COMMA_7= RULE_COMMA ( (lv_branches_8_0= ruleBranchGType ) ) )* this_RCURLY_9= RULE_RCURLY )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:431:6: (this_LCURLY_5= RULE_LCURLY ( (lv_branches_6_0= ruleBranchGType ) ) (this_COMMA_7= RULE_COMMA ( (lv_branches_8_0= ruleBranchGType ) ) )* this_RCURLY_9= RULE_RCURLY )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:431:7: this_LCURLY_5= RULE_LCURLY ( (lv_branches_6_0= ruleBranchGType ) ) (this_COMMA_7= RULE_COMMA ( (lv_branches_8_0= ruleBranchGType ) ) )* this_RCURLY_9= RULE_RCURLY
                    {
                    this_LCURLY_5=(Token)match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleGlobalType815); 
                     
                        newLeafNode(this_LCURLY_5, grammarAccess.getGlobalTypeAccess().getLCURLYTerminalRuleCall_4_1_0()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:435:1: ( (lv_branches_6_0= ruleBranchGType ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:436:1: (lv_branches_6_0= ruleBranchGType )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:436:1: (lv_branches_6_0= ruleBranchGType )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:437:3: lv_branches_6_0= ruleBranchGType
                    {
                     
                    	        newCompositeNode(grammarAccess.getGlobalTypeAccess().getBranchesBranchGTypeParserRuleCall_4_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBranchGType_in_ruleGlobalType835);
                    lv_branches_6_0=ruleBranchGType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGlobalTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"branches",
                            		lv_branches_6_0, 
                            		"BranchGType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:453:2: (this_COMMA_7= RULE_COMMA ( (lv_branches_8_0= ruleBranchGType ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_COMMA) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:453:3: this_COMMA_7= RULE_COMMA ( (lv_branches_8_0= ruleBranchGType ) )
                    	    {
                    	    this_COMMA_7=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleGlobalType847); 
                    	     
                    	        newLeafNode(this_COMMA_7, grammarAccess.getGlobalTypeAccess().getCOMMATerminalRuleCall_4_1_2_0()); 
                    	        
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:457:1: ( (lv_branches_8_0= ruleBranchGType ) )
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:458:1: (lv_branches_8_0= ruleBranchGType )
                    	    {
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:458:1: (lv_branches_8_0= ruleBranchGType )
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:459:3: lv_branches_8_0= ruleBranchGType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGlobalTypeAccess().getBranchesBranchGTypeParserRuleCall_4_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleBranchGType_in_ruleGlobalType867);
                    	    lv_branches_8_0=ruleBranchGType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGlobalTypeRule());
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
                    	    break loop2;
                        }
                    } while (true);

                    this_RCURLY_9=(Token)match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleGlobalType880); 
                     
                        newLeafNode(this_RCURLY_9, grammarAccess.getGlobalTypeAccess().getRCURLYTerminalRuleCall_4_1_3()); 
                        

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
    // $ANTLR end "ruleGlobalType"


    // $ANTLR start "entryRuleBranchGType"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:487:1: entryRuleBranchGType returns [EObject current=null] : iv_ruleBranchGType= ruleBranchGType EOF ;
    public final EObject entryRuleBranchGType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranchGType = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:488:2: (iv_ruleBranchGType= ruleBranchGType EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:489:2: iv_ruleBranchGType= ruleBranchGType EOF
            {
             newCompositeNode(grammarAccess.getBranchGTypeRule()); 
            pushFollow(FOLLOW_ruleBranchGType_in_entryRuleBranchGType917);
            iv_ruleBranchGType=ruleBranchGType();

            state._fsp--;

             current =iv_ruleBranchGType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBranchGType927); 

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:496:1: ruleBranchGType returns [EObject current=null] : ( ( (lv_operation_0_0= RULE_ID ) ) this_LPAREN_1= RULE_LPAREN ( (lv_dataType_2_0= ruleDataType ) ) this_RPAREN_3= RULE_RPAREN (this_SEMICOLON_4= RULE_SEMICOLON ( (lv_continuation_5_0= ruleGlobalType ) ) )? ) ;
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:499:28: ( ( ( (lv_operation_0_0= RULE_ID ) ) this_LPAREN_1= RULE_LPAREN ( (lv_dataType_2_0= ruleDataType ) ) this_RPAREN_3= RULE_RPAREN (this_SEMICOLON_4= RULE_SEMICOLON ( (lv_continuation_5_0= ruleGlobalType ) ) )? ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:500:1: ( ( (lv_operation_0_0= RULE_ID ) ) this_LPAREN_1= RULE_LPAREN ( (lv_dataType_2_0= ruleDataType ) ) this_RPAREN_3= RULE_RPAREN (this_SEMICOLON_4= RULE_SEMICOLON ( (lv_continuation_5_0= ruleGlobalType ) ) )? )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:500:1: ( ( (lv_operation_0_0= RULE_ID ) ) this_LPAREN_1= RULE_LPAREN ( (lv_dataType_2_0= ruleDataType ) ) this_RPAREN_3= RULE_RPAREN (this_SEMICOLON_4= RULE_SEMICOLON ( (lv_continuation_5_0= ruleGlobalType ) ) )? )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:500:2: ( (lv_operation_0_0= RULE_ID ) ) this_LPAREN_1= RULE_LPAREN ( (lv_dataType_2_0= ruleDataType ) ) this_RPAREN_3= RULE_RPAREN (this_SEMICOLON_4= RULE_SEMICOLON ( (lv_continuation_5_0= ruleGlobalType ) ) )?
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:500:2: ( (lv_operation_0_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:501:1: (lv_operation_0_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:501:1: (lv_operation_0_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:502:3: lv_operation_0_0= RULE_ID
            {
            lv_operation_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBranchGType969); 

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

            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleBranchGType985); 
             
                newLeafNode(this_LPAREN_1, grammarAccess.getBranchGTypeAccess().getLPARENTerminalRuleCall_1()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:522:1: ( (lv_dataType_2_0= ruleDataType ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:523:1: (lv_dataType_2_0= ruleDataType )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:523:1: (lv_dataType_2_0= ruleDataType )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:524:3: lv_dataType_2_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getBranchGTypeAccess().getDataTypeDataTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleBranchGType1005);
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

            this_RPAREN_3=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleBranchGType1016); 
             
                newLeafNode(this_RPAREN_3, grammarAccess.getBranchGTypeAccess().getRPARENTerminalRuleCall_3()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:544:1: (this_SEMICOLON_4= RULE_SEMICOLON ( (lv_continuation_5_0= ruleGlobalType ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_SEMICOLON) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:544:2: this_SEMICOLON_4= RULE_SEMICOLON ( (lv_continuation_5_0= ruleGlobalType ) )
                    {
                    this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleBranchGType1027); 
                     
                        newLeafNode(this_SEMICOLON_4, grammarAccess.getBranchGTypeAccess().getSEMICOLONTerminalRuleCall_4_0()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:548:1: ( (lv_continuation_5_0= ruleGlobalType ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:549:1: (lv_continuation_5_0= ruleGlobalType )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:549:1: (lv_continuation_5_0= ruleGlobalType )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:550:3: lv_continuation_5_0= ruleGlobalType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchGTypeAccess().getContinuationGlobalTypeParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGlobalType_in_ruleBranchGType1047);
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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:574:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:575:2: (iv_ruleDataType= ruleDataType EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:576:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType1085);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType1095); 

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:583:1: ruleDataType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_LocalType_1= ruleLocalType ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_LocalType_1 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:586:28: ( (this_BasicType_0= ruleBasicType | this_LocalType_1= ruleLocalType ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:587:1: (this_BasicType_0= ruleBasicType | this_LocalType_1= ruleLocalType )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:587:1: (this_BasicType_0= ruleBasicType | this_LocalType_1= ruleLocalType )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=38 && LA5_0<=41)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_BANG && LA5_0<=RULE_QUESTION_MARK)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:588:5: this_BasicType_0= ruleBasicType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getBasicTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBasicType_in_ruleDataType1142);
                    this_BasicType_0=ruleBasicType();

                    state._fsp--;

                     
                            current = this_BasicType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:598:5: this_LocalType_1= ruleLocalType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getLocalTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLocalType_in_ruleDataType1169);
                    this_LocalType_1=ruleLocalType();

                    state._fsp--;

                     
                            current = this_LocalType_1; 
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


    // $ANTLR start "entryRuleBasicType"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:614:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:615:2: (iv_ruleBasicType= ruleBasicType EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:616:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType1204);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType1214); 

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:623:1: ruleBasicType returns [EObject current=null] : ( ( () ( (lv_name_1_0= 'int' ) ) ) | ( (lv_name_2_0= 'string' ) ) | ( (lv_name_3_0= 'bool' ) ) | ( (lv_name_4_0= 'void' ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token lv_name_4_0=null;

         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:626:28: ( ( ( () ( (lv_name_1_0= 'int' ) ) ) | ( (lv_name_2_0= 'string' ) ) | ( (lv_name_3_0= 'bool' ) ) | ( (lv_name_4_0= 'void' ) ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:627:1: ( ( () ( (lv_name_1_0= 'int' ) ) ) | ( (lv_name_2_0= 'string' ) ) | ( (lv_name_3_0= 'bool' ) ) | ( (lv_name_4_0= 'void' ) ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:627:1: ( ( () ( (lv_name_1_0= 'int' ) ) ) | ( (lv_name_2_0= 'string' ) ) | ( (lv_name_3_0= 'bool' ) ) | ( (lv_name_4_0= 'void' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt6=1;
                }
                break;
            case 39:
                {
                alt6=2;
                }
                break;
            case 40:
                {
                alt6=3;
                }
                break;
            case 41:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:627:2: ( () ( (lv_name_1_0= 'int' ) ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:627:2: ( () ( (lv_name_1_0= 'int' ) ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:627:3: () ( (lv_name_1_0= 'int' ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:627:3: ()
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:628:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBasicTypeAccess().getBasicTypeAction_0_0(),
                                current);
                        

                    }

                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:633:2: ( (lv_name_1_0= 'int' ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:634:1: (lv_name_1_0= 'int' )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:634:1: (lv_name_1_0= 'int' )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:635:3: lv_name_1_0= 'int'
                    {
                    lv_name_1_0=(Token)match(input,38,FOLLOW_38_in_ruleBasicType1267); 

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
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:649:6: ( (lv_name_2_0= 'string' ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:649:6: ( (lv_name_2_0= 'string' ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:650:1: (lv_name_2_0= 'string' )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:650:1: (lv_name_2_0= 'string' )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:651:3: lv_name_2_0= 'string'
                    {
                    lv_name_2_0=(Token)match(input,39,FOLLOW_39_in_ruleBasicType1305); 

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
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:665:6: ( (lv_name_3_0= 'bool' ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:665:6: ( (lv_name_3_0= 'bool' ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:666:1: (lv_name_3_0= 'bool' )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:666:1: (lv_name_3_0= 'bool' )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:667:3: lv_name_3_0= 'bool'
                    {
                    lv_name_3_0=(Token)match(input,40,FOLLOW_40_in_ruleBasicType1342); 

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
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:681:6: ( (lv_name_4_0= 'void' ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:681:6: ( (lv_name_4_0= 'void' ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:682:1: (lv_name_4_0= 'void' )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:682:1: (lv_name_4_0= 'void' )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:683:3: lv_name_4_0= 'void'
                    {
                    lv_name_4_0=(Token)match(input,41,FOLLOW_41_in_ruleBasicType1379); 

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


    // $ANTLR start "entryRuleLocalType"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:704:1: entryRuleLocalType returns [EObject current=null] : iv_ruleLocalType= ruleLocalType EOF ;
    public final EObject entryRuleLocalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalType = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:705:2: (iv_ruleLocalType= ruleLocalType EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:706:2: iv_ruleLocalType= ruleLocalType EOF
            {
             newCompositeNode(grammarAccess.getLocalTypeRule()); 
            pushFollow(FOLLOW_ruleLocalType_in_entryRuleLocalType1428);
            iv_ruleLocalType=ruleLocalType();

            state._fsp--;

             current =iv_ruleLocalType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalType1438); 

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
    // $ANTLR end "entryRuleLocalType"


    // $ANTLR start "ruleLocalType"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:713:1: ruleLocalType returns [EObject current=null] : ( ( () this_BANG_1= RULE_BANG this_LPAREN_2= RULE_LPAREN ( (lv_datatype_3_0= ruleDataType ) ) this_RPAREN_4= RULE_RPAREN this_SEMICOLON_5= RULE_SEMICOLON ( (lv_continuation_6_0= ruleLocalType ) ) ) | ( () this_QUESTION_MARK_8= RULE_QUESTION_MARK this_LPAREN_9= RULE_LPAREN ( (lv_datatype_10_0= ruleDataType ) ) this_RPAREN_11= RULE_RPAREN this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleLocalType ) ) ) | ( () this_QUESTION_MARK_15= RULE_QUESTION_MARK this_LCURLY_16= RULE_LCURLY ( (lv_branches_17_0= ruleBranchType ) ) (this_COMMA_18= RULE_COMMA ( (lv_branches_19_0= ruleBranchType ) ) )* this_RCURLY_20= RULE_RCURLY ) | ( () this_BANG_22= RULE_BANG this_LCURLY_23= RULE_LCURLY ( (lv_branches_24_0= ruleBranchType ) ) (this_COMMA_25= RULE_COMMA ( (lv_branches_26_0= ruleBranchType ) ) )* this_RCURLY_27= RULE_RCURLY ) ) ;
    public final EObject ruleLocalType() throws RecognitionException {
        EObject current = null;

        Token this_BANG_1=null;
        Token this_LPAREN_2=null;
        Token this_RPAREN_4=null;
        Token this_SEMICOLON_5=null;
        Token this_QUESTION_MARK_8=null;
        Token this_LPAREN_9=null;
        Token this_RPAREN_11=null;
        Token this_SEMICOLON_12=null;
        Token this_QUESTION_MARK_15=null;
        Token this_LCURLY_16=null;
        Token this_COMMA_18=null;
        Token this_RCURLY_20=null;
        Token this_BANG_22=null;
        Token this_LCURLY_23=null;
        Token this_COMMA_25=null;
        Token this_RCURLY_27=null;
        EObject lv_datatype_3_0 = null;

        EObject lv_continuation_6_0 = null;

        EObject lv_datatype_10_0 = null;

        EObject lv_continuation_13_0 = null;

        EObject lv_branches_17_0 = null;

        EObject lv_branches_19_0 = null;

        EObject lv_branches_24_0 = null;

        EObject lv_branches_26_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:716:28: ( ( ( () this_BANG_1= RULE_BANG this_LPAREN_2= RULE_LPAREN ( (lv_datatype_3_0= ruleDataType ) ) this_RPAREN_4= RULE_RPAREN this_SEMICOLON_5= RULE_SEMICOLON ( (lv_continuation_6_0= ruleLocalType ) ) ) | ( () this_QUESTION_MARK_8= RULE_QUESTION_MARK this_LPAREN_9= RULE_LPAREN ( (lv_datatype_10_0= ruleDataType ) ) this_RPAREN_11= RULE_RPAREN this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleLocalType ) ) ) | ( () this_QUESTION_MARK_15= RULE_QUESTION_MARK this_LCURLY_16= RULE_LCURLY ( (lv_branches_17_0= ruleBranchType ) ) (this_COMMA_18= RULE_COMMA ( (lv_branches_19_0= ruleBranchType ) ) )* this_RCURLY_20= RULE_RCURLY ) | ( () this_BANG_22= RULE_BANG this_LCURLY_23= RULE_LCURLY ( (lv_branches_24_0= ruleBranchType ) ) (this_COMMA_25= RULE_COMMA ( (lv_branches_26_0= ruleBranchType ) ) )* this_RCURLY_27= RULE_RCURLY ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:717:1: ( ( () this_BANG_1= RULE_BANG this_LPAREN_2= RULE_LPAREN ( (lv_datatype_3_0= ruleDataType ) ) this_RPAREN_4= RULE_RPAREN this_SEMICOLON_5= RULE_SEMICOLON ( (lv_continuation_6_0= ruleLocalType ) ) ) | ( () this_QUESTION_MARK_8= RULE_QUESTION_MARK this_LPAREN_9= RULE_LPAREN ( (lv_datatype_10_0= ruleDataType ) ) this_RPAREN_11= RULE_RPAREN this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleLocalType ) ) ) | ( () this_QUESTION_MARK_15= RULE_QUESTION_MARK this_LCURLY_16= RULE_LCURLY ( (lv_branches_17_0= ruleBranchType ) ) (this_COMMA_18= RULE_COMMA ( (lv_branches_19_0= ruleBranchType ) ) )* this_RCURLY_20= RULE_RCURLY ) | ( () this_BANG_22= RULE_BANG this_LCURLY_23= RULE_LCURLY ( (lv_branches_24_0= ruleBranchType ) ) (this_COMMA_25= RULE_COMMA ( (lv_branches_26_0= ruleBranchType ) ) )* this_RCURLY_27= RULE_RCURLY ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:717:1: ( ( () this_BANG_1= RULE_BANG this_LPAREN_2= RULE_LPAREN ( (lv_datatype_3_0= ruleDataType ) ) this_RPAREN_4= RULE_RPAREN this_SEMICOLON_5= RULE_SEMICOLON ( (lv_continuation_6_0= ruleLocalType ) ) ) | ( () this_QUESTION_MARK_8= RULE_QUESTION_MARK this_LPAREN_9= RULE_LPAREN ( (lv_datatype_10_0= ruleDataType ) ) this_RPAREN_11= RULE_RPAREN this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleLocalType ) ) ) | ( () this_QUESTION_MARK_15= RULE_QUESTION_MARK this_LCURLY_16= RULE_LCURLY ( (lv_branches_17_0= ruleBranchType ) ) (this_COMMA_18= RULE_COMMA ( (lv_branches_19_0= ruleBranchType ) ) )* this_RCURLY_20= RULE_RCURLY ) | ( () this_BANG_22= RULE_BANG this_LCURLY_23= RULE_LCURLY ( (lv_branches_24_0= ruleBranchType ) ) (this_COMMA_25= RULE_COMMA ( (lv_branches_26_0= ruleBranchType ) ) )* this_RCURLY_27= RULE_RCURLY ) )
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_BANG) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_LPAREN) ) {
                    alt9=1;
                }
                else if ( (LA9_1==RULE_LCURLY) ) {
                    alt9=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==RULE_QUESTION_MARK) ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==RULE_LCURLY) ) {
                    alt9=3;
                }
                else if ( (LA9_2==RULE_LPAREN) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:717:2: ( () this_BANG_1= RULE_BANG this_LPAREN_2= RULE_LPAREN ( (lv_datatype_3_0= ruleDataType ) ) this_RPAREN_4= RULE_RPAREN this_SEMICOLON_5= RULE_SEMICOLON ( (lv_continuation_6_0= ruleLocalType ) ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:717:2: ( () this_BANG_1= RULE_BANG this_LPAREN_2= RULE_LPAREN ( (lv_datatype_3_0= ruleDataType ) ) this_RPAREN_4= RULE_RPAREN this_SEMICOLON_5= RULE_SEMICOLON ( (lv_continuation_6_0= ruleLocalType ) ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:717:3: () this_BANG_1= RULE_BANG this_LPAREN_2= RULE_LPAREN ( (lv_datatype_3_0= ruleDataType ) ) this_RPAREN_4= RULE_RPAREN this_SEMICOLON_5= RULE_SEMICOLON ( (lv_continuation_6_0= ruleLocalType ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:717:3: ()
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:718:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLocalTypeAccess().getOutputTypeAction_0_0(),
                                current);
                        

                    }

                    this_BANG_1=(Token)match(input,RULE_BANG,FOLLOW_RULE_BANG_in_ruleLocalType1484); 
                     
                        newLeafNode(this_BANG_1, grammarAccess.getLocalTypeAccess().getBANGTerminalRuleCall_0_1()); 
                        
                    this_LPAREN_2=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleLocalType1494); 
                     
                        newLeafNode(this_LPAREN_2, grammarAccess.getLocalTypeAccess().getLPARENTerminalRuleCall_0_2()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:731:1: ( (lv_datatype_3_0= ruleDataType ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:732:1: (lv_datatype_3_0= ruleDataType )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:732:1: (lv_datatype_3_0= ruleDataType )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:733:3: lv_datatype_3_0= ruleDataType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalTypeAccess().getDatatypeDataTypeParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataType_in_ruleLocalType1514);
                    lv_datatype_3_0=ruleDataType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"datatype",
                            		lv_datatype_3_0, 
                            		"DataType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_RPAREN_4=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleLocalType1525); 
                     
                        newLeafNode(this_RPAREN_4, grammarAccess.getLocalTypeAccess().getRPARENTerminalRuleCall_0_4()); 
                        
                    this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleLocalType1535); 
                     
                        newLeafNode(this_SEMICOLON_5, grammarAccess.getLocalTypeAccess().getSEMICOLONTerminalRuleCall_0_5()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:757:1: ( (lv_continuation_6_0= ruleLocalType ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:758:1: (lv_continuation_6_0= ruleLocalType )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:758:1: (lv_continuation_6_0= ruleLocalType )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:759:3: lv_continuation_6_0= ruleLocalType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalTypeAccess().getContinuationLocalTypeParserRuleCall_0_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLocalType_in_ruleLocalType1555);
                    lv_continuation_6_0=ruleLocalType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"continuation",
                            		lv_continuation_6_0, 
                            		"LocalType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:776:6: ( () this_QUESTION_MARK_8= RULE_QUESTION_MARK this_LPAREN_9= RULE_LPAREN ( (lv_datatype_10_0= ruleDataType ) ) this_RPAREN_11= RULE_RPAREN this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleLocalType ) ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:776:6: ( () this_QUESTION_MARK_8= RULE_QUESTION_MARK this_LPAREN_9= RULE_LPAREN ( (lv_datatype_10_0= ruleDataType ) ) this_RPAREN_11= RULE_RPAREN this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleLocalType ) ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:776:7: () this_QUESTION_MARK_8= RULE_QUESTION_MARK this_LPAREN_9= RULE_LPAREN ( (lv_datatype_10_0= ruleDataType ) ) this_RPAREN_11= RULE_RPAREN this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleLocalType ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:776:7: ()
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:777:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLocalTypeAccess().getInputTypeAction_1_0(),
                                current);
                        

                    }

                    this_QUESTION_MARK_8=(Token)match(input,RULE_QUESTION_MARK,FOLLOW_RULE_QUESTION_MARK_in_ruleLocalType1583); 
                     
                        newLeafNode(this_QUESTION_MARK_8, grammarAccess.getLocalTypeAccess().getQUESTION_MARKTerminalRuleCall_1_1()); 
                        
                    this_LPAREN_9=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleLocalType1593); 
                     
                        newLeafNode(this_LPAREN_9, grammarAccess.getLocalTypeAccess().getLPARENTerminalRuleCall_1_2()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:790:1: ( (lv_datatype_10_0= ruleDataType ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:791:1: (lv_datatype_10_0= ruleDataType )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:791:1: (lv_datatype_10_0= ruleDataType )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:792:3: lv_datatype_10_0= ruleDataType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalTypeAccess().getDatatypeDataTypeParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataType_in_ruleLocalType1613);
                    lv_datatype_10_0=ruleDataType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"datatype",
                            		lv_datatype_10_0, 
                            		"DataType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_RPAREN_11=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleLocalType1624); 
                     
                        newLeafNode(this_RPAREN_11, grammarAccess.getLocalTypeAccess().getRPARENTerminalRuleCall_1_4()); 
                        
                    this_SEMICOLON_12=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleLocalType1634); 
                     
                        newLeafNode(this_SEMICOLON_12, grammarAccess.getLocalTypeAccess().getSEMICOLONTerminalRuleCall_1_5()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:816:1: ( (lv_continuation_13_0= ruleLocalType ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:817:1: (lv_continuation_13_0= ruleLocalType )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:817:1: (lv_continuation_13_0= ruleLocalType )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:818:3: lv_continuation_13_0= ruleLocalType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalTypeAccess().getContinuationLocalTypeParserRuleCall_1_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLocalType_in_ruleLocalType1654);
                    lv_continuation_13_0=ruleLocalType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"continuation",
                            		lv_continuation_13_0, 
                            		"LocalType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:835:6: ( () this_QUESTION_MARK_15= RULE_QUESTION_MARK this_LCURLY_16= RULE_LCURLY ( (lv_branches_17_0= ruleBranchType ) ) (this_COMMA_18= RULE_COMMA ( (lv_branches_19_0= ruleBranchType ) ) )* this_RCURLY_20= RULE_RCURLY )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:835:6: ( () this_QUESTION_MARK_15= RULE_QUESTION_MARK this_LCURLY_16= RULE_LCURLY ( (lv_branches_17_0= ruleBranchType ) ) (this_COMMA_18= RULE_COMMA ( (lv_branches_19_0= ruleBranchType ) ) )* this_RCURLY_20= RULE_RCURLY )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:835:7: () this_QUESTION_MARK_15= RULE_QUESTION_MARK this_LCURLY_16= RULE_LCURLY ( (lv_branches_17_0= ruleBranchType ) ) (this_COMMA_18= RULE_COMMA ( (lv_branches_19_0= ruleBranchType ) ) )* this_RCURLY_20= RULE_RCURLY
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:835:7: ()
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:836:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLocalTypeAccess().getBranchingTypeAction_2_0(),
                                current);
                        

                    }

                    this_QUESTION_MARK_15=(Token)match(input,RULE_QUESTION_MARK,FOLLOW_RULE_QUESTION_MARK_in_ruleLocalType1682); 
                     
                        newLeafNode(this_QUESTION_MARK_15, grammarAccess.getLocalTypeAccess().getQUESTION_MARKTerminalRuleCall_2_1()); 
                        
                    this_LCURLY_16=(Token)match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleLocalType1692); 
                     
                        newLeafNode(this_LCURLY_16, grammarAccess.getLocalTypeAccess().getLCURLYTerminalRuleCall_2_2()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:849:1: ( (lv_branches_17_0= ruleBranchType ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:850:1: (lv_branches_17_0= ruleBranchType )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:850:1: (lv_branches_17_0= ruleBranchType )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:851:3: lv_branches_17_0= ruleBranchType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalTypeAccess().getBranchesBranchTypeParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBranchType_in_ruleLocalType1712);
                    lv_branches_17_0=ruleBranchType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"branches",
                            		lv_branches_17_0, 
                            		"BranchType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:867:2: (this_COMMA_18= RULE_COMMA ( (lv_branches_19_0= ruleBranchType ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_COMMA) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:867:3: this_COMMA_18= RULE_COMMA ( (lv_branches_19_0= ruleBranchType ) )
                    	    {
                    	    this_COMMA_18=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleLocalType1724); 
                    	     
                    	        newLeafNode(this_COMMA_18, grammarAccess.getLocalTypeAccess().getCOMMATerminalRuleCall_2_4_0()); 
                    	        
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:871:1: ( (lv_branches_19_0= ruleBranchType ) )
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:872:1: (lv_branches_19_0= ruleBranchType )
                    	    {
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:872:1: (lv_branches_19_0= ruleBranchType )
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:873:3: lv_branches_19_0= ruleBranchType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLocalTypeAccess().getBranchesBranchTypeParserRuleCall_2_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleBranchType_in_ruleLocalType1744);
                    	    lv_branches_19_0=ruleBranchType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLocalTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"branches",
                    	            		lv_branches_19_0, 
                    	            		"BranchType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    this_RCURLY_20=(Token)match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleLocalType1757); 
                     
                        newLeafNode(this_RCURLY_20, grammarAccess.getLocalTypeAccess().getRCURLYTerminalRuleCall_2_5()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:894:6: ( () this_BANG_22= RULE_BANG this_LCURLY_23= RULE_LCURLY ( (lv_branches_24_0= ruleBranchType ) ) (this_COMMA_25= RULE_COMMA ( (lv_branches_26_0= ruleBranchType ) ) )* this_RCURLY_27= RULE_RCURLY )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:894:6: ( () this_BANG_22= RULE_BANG this_LCURLY_23= RULE_LCURLY ( (lv_branches_24_0= ruleBranchType ) ) (this_COMMA_25= RULE_COMMA ( (lv_branches_26_0= ruleBranchType ) ) )* this_RCURLY_27= RULE_RCURLY )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:894:7: () this_BANG_22= RULE_BANG this_LCURLY_23= RULE_LCURLY ( (lv_branches_24_0= ruleBranchType ) ) (this_COMMA_25= RULE_COMMA ( (lv_branches_26_0= ruleBranchType ) ) )* this_RCURLY_27= RULE_RCURLY
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:894:7: ()
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:895:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLocalTypeAccess().getSelectionTypeAction_3_0(),
                                current);
                        

                    }

                    this_BANG_22=(Token)match(input,RULE_BANG,FOLLOW_RULE_BANG_in_ruleLocalType1784); 
                     
                        newLeafNode(this_BANG_22, grammarAccess.getLocalTypeAccess().getBANGTerminalRuleCall_3_1()); 
                        
                    this_LCURLY_23=(Token)match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleLocalType1794); 
                     
                        newLeafNode(this_LCURLY_23, grammarAccess.getLocalTypeAccess().getLCURLYTerminalRuleCall_3_2()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:908:1: ( (lv_branches_24_0= ruleBranchType ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:909:1: (lv_branches_24_0= ruleBranchType )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:909:1: (lv_branches_24_0= ruleBranchType )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:910:3: lv_branches_24_0= ruleBranchType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalTypeAccess().getBranchesBranchTypeParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBranchType_in_ruleLocalType1814);
                    lv_branches_24_0=ruleBranchType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"branches",
                            		lv_branches_24_0, 
                            		"BranchType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:926:2: (this_COMMA_25= RULE_COMMA ( (lv_branches_26_0= ruleBranchType ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:926:3: this_COMMA_25= RULE_COMMA ( (lv_branches_26_0= ruleBranchType ) )
                    	    {
                    	    this_COMMA_25=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleLocalType1826); 
                    	     
                    	        newLeafNode(this_COMMA_25, grammarAccess.getLocalTypeAccess().getCOMMATerminalRuleCall_3_4_0()); 
                    	        
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:930:1: ( (lv_branches_26_0= ruleBranchType ) )
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:931:1: (lv_branches_26_0= ruleBranchType )
                    	    {
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:931:1: (lv_branches_26_0= ruleBranchType )
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:932:3: lv_branches_26_0= ruleBranchType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLocalTypeAccess().getBranchesBranchTypeParserRuleCall_3_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleBranchType_in_ruleLocalType1846);
                    	    lv_branches_26_0=ruleBranchType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLocalTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"branches",
                    	            		lv_branches_26_0, 
                    	            		"BranchType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    this_RCURLY_27=(Token)match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleLocalType1859); 
                     
                        newLeafNode(this_RCURLY_27, grammarAccess.getLocalTypeAccess().getRCURLYTerminalRuleCall_3_5()); 
                        

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
    // $ANTLR end "ruleLocalType"


    // $ANTLR start "entryRuleBranchType"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:960:1: entryRuleBranchType returns [EObject current=null] : iv_ruleBranchType= ruleBranchType EOF ;
    public final EObject entryRuleBranchType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranchType = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:961:2: (iv_ruleBranchType= ruleBranchType EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:962:2: iv_ruleBranchType= ruleBranchType EOF
            {
             newCompositeNode(grammarAccess.getBranchTypeRule()); 
            pushFollow(FOLLOW_ruleBranchType_in_entryRuleBranchType1895);
            iv_ruleBranchType=ruleBranchType();

            state._fsp--;

             current =iv_ruleBranchType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBranchType1905); 

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
    // $ANTLR end "entryRuleBranchType"


    // $ANTLR start "ruleBranchType"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:969:1: ruleBranchType returns [EObject current=null] : ( ( (lv_label_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON this_LocalType_2= ruleLocalType ) ;
    public final EObject ruleBranchType() throws RecognitionException {
        EObject current = null;

        Token lv_label_0_0=null;
        Token this_COLON_1=null;
        EObject this_LocalType_2 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:972:28: ( ( ( (lv_label_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON this_LocalType_2= ruleLocalType ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:973:1: ( ( (lv_label_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON this_LocalType_2= ruleLocalType )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:973:1: ( ( (lv_label_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON this_LocalType_2= ruleLocalType )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:973:2: ( (lv_label_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON this_LocalType_2= ruleLocalType
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:973:2: ( (lv_label_0_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:974:1: (lv_label_0_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:974:1: (lv_label_0_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:975:3: lv_label_0_0= RULE_ID
            {
            lv_label_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBranchType1947); 

            			newLeafNode(lv_label_0_0, grammarAccess.getBranchTypeAccess().getLabelIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBranchTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_0_0, 
                    		"ID");
            	    

            }


            }

            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleBranchType1963); 
             
                newLeafNode(this_COLON_1, grammarAccess.getBranchTypeAccess().getCOLONTerminalRuleCall_1()); 
                
             
                    newCompositeNode(grammarAccess.getBranchTypeAccess().getLocalTypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleLocalType_in_ruleBranchType1984);
            this_LocalType_2=ruleLocalType();

            state._fsp--;

             
                    current = this_LocalType_2; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleBranchType"


    // $ANTLR start "entryRuleChoreography"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1012:1: entryRuleChoreography returns [EObject current=null] : iv_ruleChoreography= ruleChoreography EOF ;
    public final EObject entryRuleChoreography() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoreography = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1013:2: (iv_ruleChoreography= ruleChoreography EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1014:2: iv_ruleChoreography= ruleChoreography EOF
            {
             newCompositeNode(grammarAccess.getChoreographyRule()); 
            pushFollow(FOLLOW_ruleChoreography_in_entryRuleChoreography2019);
            iv_ruleChoreography=ruleChoreography();

            state._fsp--;

             current =iv_ruleChoreography; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoreography2029); 

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1021:1: ruleChoreography returns [EObject current=null] : (this_Start_0= ruleStart | this_Interaction_1= ruleInteraction | this_IfThenElse_2= ruleIfThenElse | (this_LCURLY_3= RULE_LCURLY this_Choreography_4= ruleChoreography this_RCURLY_5= RULE_RCURLY ) ) ;
    public final EObject ruleChoreography() throws RecognitionException {
        EObject current = null;

        Token this_LCURLY_3=null;
        Token this_RCURLY_5=null;
        EObject this_Start_0 = null;

        EObject this_Interaction_1 = null;

        EObject this_IfThenElse_2 = null;

        EObject this_Choreography_4 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1024:28: ( (this_Start_0= ruleStart | this_Interaction_1= ruleInteraction | this_IfThenElse_2= ruleIfThenElse | (this_LCURLY_3= RULE_LCURLY this_Choreography_4= ruleChoreography this_RCURLY_5= RULE_RCURLY ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1025:1: (this_Start_0= ruleStart | this_Interaction_1= ruleInteraction | this_IfThenElse_2= ruleIfThenElse | (this_LCURLY_3= RULE_LCURLY this_Choreography_4= ruleChoreography this_RCURLY_5= RULE_RCURLY ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1025:1: (this_Start_0= ruleStart | this_Interaction_1= ruleInteraction | this_IfThenElse_2= ruleIfThenElse | (this_LCURLY_3= RULE_LCURLY this_Choreography_4= ruleChoreography this_RCURLY_5= RULE_RCURLY ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_ARROW||LA10_1==RULE_DOT) ) {
                    alt10=2;
                }
                else if ( (LA10_1==RULE_LSQUARE) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                alt10=3;
                }
                break;
            case RULE_LCURLY:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1026:5: this_Start_0= ruleStart
                    {
                     
                            newCompositeNode(grammarAccess.getChoreographyAccess().getStartParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStart_in_ruleChoreography2076);
                    this_Start_0=ruleStart();

                    state._fsp--;

                     
                            current = this_Start_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1036:5: this_Interaction_1= ruleInteraction
                    {
                     
                            newCompositeNode(grammarAccess.getChoreographyAccess().getInteractionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInteraction_in_ruleChoreography2103);
                    this_Interaction_1=ruleInteraction();

                    state._fsp--;

                     
                            current = this_Interaction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1046:5: this_IfThenElse_2= ruleIfThenElse
                    {
                     
                            newCompositeNode(grammarAccess.getChoreographyAccess().getIfThenElseParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIfThenElse_in_ruleChoreography2130);
                    this_IfThenElse_2=ruleIfThenElse();

                    state._fsp--;

                     
                            current = this_IfThenElse_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1055:6: (this_LCURLY_3= RULE_LCURLY this_Choreography_4= ruleChoreography this_RCURLY_5= RULE_RCURLY )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1055:6: (this_LCURLY_3= RULE_LCURLY this_Choreography_4= ruleChoreography this_RCURLY_5= RULE_RCURLY )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1055:7: this_LCURLY_3= RULE_LCURLY this_Choreography_4= ruleChoreography this_RCURLY_5= RULE_RCURLY
                    {
                    this_LCURLY_3=(Token)match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleChoreography2147); 
                     
                        newLeafNode(this_LCURLY_3, grammarAccess.getChoreographyAccess().getLCURLYTerminalRuleCall_3_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getChoreographyAccess().getChoreographyParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_ruleChoreography_in_ruleChoreography2168);
                    this_Choreography_4=ruleChoreography();

                    state._fsp--;

                     
                            current = this_Choreography_4; 
                            afterParserOrEnumRuleCall();
                        
                    this_RCURLY_5=(Token)match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleChoreography2178); 
                     
                        newLeafNode(this_RCURLY_5, grammarAccess.getChoreographyAccess().getRCURLYTerminalRuleCall_3_2()); 
                        

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1080:1: entryRuleStart returns [EObject current=null] : iv_ruleStart= ruleStart EOF ;
    public final EObject entryRuleStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStart = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1081:2: (iv_ruleStart= ruleStart EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1082:2: iv_ruleStart= ruleStart EOF
            {
             newCompositeNode(grammarAccess.getStartRule()); 
            pushFollow(FOLLOW_ruleStart_in_entryRuleStart2214);
            iv_ruleStart=ruleStart();

            state._fsp--;

             current =iv_ruleStart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStart2224); 

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1089:1: ruleStart returns [EObject current=null] : ( ( (lv_activeThreads_0_0= ruleThreadWithRole ) ) (this_COMMA_1= RULE_COMMA ( (lv_activeThreads_2_0= ruleThreadWithRole ) ) )* otherlv_3= 'start' ( (lv_serviceThreads_4_0= ruleThreadWithRole ) ) (this_COMMA_5= RULE_COMMA ( (lv_serviceThreads_6_0= ruleThreadWithRole ) ) )* this_COLON_7= RULE_COLON ( (otherlv_8= RULE_ID ) ) this_LPAREN_9= RULE_LPAREN ( (lv_session_10_0= RULE_ID ) ) this_RPAREN_11= RULE_RPAREN (this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleChoreography ) ) )? ) ;
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1092:28: ( ( ( (lv_activeThreads_0_0= ruleThreadWithRole ) ) (this_COMMA_1= RULE_COMMA ( (lv_activeThreads_2_0= ruleThreadWithRole ) ) )* otherlv_3= 'start' ( (lv_serviceThreads_4_0= ruleThreadWithRole ) ) (this_COMMA_5= RULE_COMMA ( (lv_serviceThreads_6_0= ruleThreadWithRole ) ) )* this_COLON_7= RULE_COLON ( (otherlv_8= RULE_ID ) ) this_LPAREN_9= RULE_LPAREN ( (lv_session_10_0= RULE_ID ) ) this_RPAREN_11= RULE_RPAREN (this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleChoreography ) ) )? ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1093:1: ( ( (lv_activeThreads_0_0= ruleThreadWithRole ) ) (this_COMMA_1= RULE_COMMA ( (lv_activeThreads_2_0= ruleThreadWithRole ) ) )* otherlv_3= 'start' ( (lv_serviceThreads_4_0= ruleThreadWithRole ) ) (this_COMMA_5= RULE_COMMA ( (lv_serviceThreads_6_0= ruleThreadWithRole ) ) )* this_COLON_7= RULE_COLON ( (otherlv_8= RULE_ID ) ) this_LPAREN_9= RULE_LPAREN ( (lv_session_10_0= RULE_ID ) ) this_RPAREN_11= RULE_RPAREN (this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleChoreography ) ) )? )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1093:1: ( ( (lv_activeThreads_0_0= ruleThreadWithRole ) ) (this_COMMA_1= RULE_COMMA ( (lv_activeThreads_2_0= ruleThreadWithRole ) ) )* otherlv_3= 'start' ( (lv_serviceThreads_4_0= ruleThreadWithRole ) ) (this_COMMA_5= RULE_COMMA ( (lv_serviceThreads_6_0= ruleThreadWithRole ) ) )* this_COLON_7= RULE_COLON ( (otherlv_8= RULE_ID ) ) this_LPAREN_9= RULE_LPAREN ( (lv_session_10_0= RULE_ID ) ) this_RPAREN_11= RULE_RPAREN (this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleChoreography ) ) )? )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1093:2: ( (lv_activeThreads_0_0= ruleThreadWithRole ) ) (this_COMMA_1= RULE_COMMA ( (lv_activeThreads_2_0= ruleThreadWithRole ) ) )* otherlv_3= 'start' ( (lv_serviceThreads_4_0= ruleThreadWithRole ) ) (this_COMMA_5= RULE_COMMA ( (lv_serviceThreads_6_0= ruleThreadWithRole ) ) )* this_COLON_7= RULE_COLON ( (otherlv_8= RULE_ID ) ) this_LPAREN_9= RULE_LPAREN ( (lv_session_10_0= RULE_ID ) ) this_RPAREN_11= RULE_RPAREN (this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleChoreography ) ) )?
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1093:2: ( (lv_activeThreads_0_0= ruleThreadWithRole ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1094:1: (lv_activeThreads_0_0= ruleThreadWithRole )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1094:1: (lv_activeThreads_0_0= ruleThreadWithRole )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1095:3: lv_activeThreads_0_0= ruleThreadWithRole
            {
             
            	        newCompositeNode(grammarAccess.getStartAccess().getActiveThreadsThreadWithRoleParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleThreadWithRole_in_ruleStart2270);
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

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1111:2: (this_COMMA_1= RULE_COMMA ( (lv_activeThreads_2_0= ruleThreadWithRole ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1111:3: this_COMMA_1= RULE_COMMA ( (lv_activeThreads_2_0= ruleThreadWithRole ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleStart2282); 
            	     
            	        newLeafNode(this_COMMA_1, grammarAccess.getStartAccess().getCOMMATerminalRuleCall_1_0()); 
            	        
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1115:1: ( (lv_activeThreads_2_0= ruleThreadWithRole ) )
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1116:1: (lv_activeThreads_2_0= ruleThreadWithRole )
            	    {
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1116:1: (lv_activeThreads_2_0= ruleThreadWithRole )
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1117:3: lv_activeThreads_2_0= ruleThreadWithRole
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStartAccess().getActiveThreadsThreadWithRoleParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleThreadWithRole_in_ruleStart2302);
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
            	    break loop11;
                }
            } while (true);

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleStart2316); 

                	newLeafNode(otherlv_3, grammarAccess.getStartAccess().getStartKeyword_2());
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1137:1: ( (lv_serviceThreads_4_0= ruleThreadWithRole ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1138:1: (lv_serviceThreads_4_0= ruleThreadWithRole )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1138:1: (lv_serviceThreads_4_0= ruleThreadWithRole )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1139:3: lv_serviceThreads_4_0= ruleThreadWithRole
            {
             
            	        newCompositeNode(grammarAccess.getStartAccess().getServiceThreadsThreadWithRoleParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleThreadWithRole_in_ruleStart2337);
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

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1155:2: (this_COMMA_5= RULE_COMMA ( (lv_serviceThreads_6_0= ruleThreadWithRole ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1155:3: this_COMMA_5= RULE_COMMA ( (lv_serviceThreads_6_0= ruleThreadWithRole ) )
            	    {
            	    this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleStart2349); 
            	     
            	        newLeafNode(this_COMMA_5, grammarAccess.getStartAccess().getCOMMATerminalRuleCall_4_0()); 
            	        
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1159:1: ( (lv_serviceThreads_6_0= ruleThreadWithRole ) )
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1160:1: (lv_serviceThreads_6_0= ruleThreadWithRole )
            	    {
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1160:1: (lv_serviceThreads_6_0= ruleThreadWithRole )
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1161:3: lv_serviceThreads_6_0= ruleThreadWithRole
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStartAccess().getServiceThreadsThreadWithRoleParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleThreadWithRole_in_ruleStart2369);
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
            	    break loop12;
                }
            } while (true);

            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleStart2382); 
             
                newLeafNode(this_COLON_7, grammarAccess.getStartAccess().getCOLONTerminalRuleCall_5()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1181:1: ( (otherlv_8= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1182:1: (otherlv_8= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1182:1: (otherlv_8= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1183:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStartRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStart2401); 

            		newLeafNode(otherlv_8, grammarAccess.getStartAccess().getPublicChannelSiteCrossReference_6_0()); 
            	

            }


            }

            this_LPAREN_9=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleStart2412); 
             
                newLeafNode(this_LPAREN_9, grammarAccess.getStartAccess().getLPARENTerminalRuleCall_7()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1198:1: ( (lv_session_10_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1199:1: (lv_session_10_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1199:1: (lv_session_10_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1200:3: lv_session_10_0= RULE_ID
            {
            lv_session_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStart2428); 

            			newLeafNode(lv_session_10_0, grammarAccess.getStartAccess().getSessionIDTerminalRuleCall_8_0()); 
            		

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

            this_RPAREN_11=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleStart2444); 
             
                newLeafNode(this_RPAREN_11, grammarAccess.getStartAccess().getRPARENTerminalRuleCall_9()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1220:1: (this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleChoreography ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_SEMICOLON) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1220:2: this_SEMICOLON_12= RULE_SEMICOLON ( (lv_continuation_13_0= ruleChoreography ) )
                    {
                    this_SEMICOLON_12=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleStart2455); 
                     
                        newLeafNode(this_SEMICOLON_12, grammarAccess.getStartAccess().getSEMICOLONTerminalRuleCall_10_0()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1224:1: ( (lv_continuation_13_0= ruleChoreography ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1225:1: (lv_continuation_13_0= ruleChoreography )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1225:1: (lv_continuation_13_0= ruleChoreography )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1226:3: lv_continuation_13_0= ruleChoreography
                    {
                     
                    	        newCompositeNode(grammarAccess.getStartAccess().getContinuationChoreographyParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleChoreography_in_ruleStart2475);
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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1250:1: entryRuleThreadWithRole returns [EObject current=null] : iv_ruleThreadWithRole= ruleThreadWithRole EOF ;
    public final EObject entryRuleThreadWithRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThreadWithRole = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1251:2: (iv_ruleThreadWithRole= ruleThreadWithRole EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1252:2: iv_ruleThreadWithRole= ruleThreadWithRole EOF
            {
             newCompositeNode(grammarAccess.getThreadWithRoleRule()); 
            pushFollow(FOLLOW_ruleThreadWithRole_in_entryRuleThreadWithRole2513);
            iv_ruleThreadWithRole=ruleThreadWithRole();

            state._fsp--;

             current =iv_ruleThreadWithRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThreadWithRole2523); 

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1259:1: ruleThreadWithRole returns [EObject current=null] : ( ( (lv_thread_0_0= RULE_ID ) ) this_LSQUARE_1= RULE_LSQUARE ( (lv_role_2_0= RULE_ID ) ) this_RSQUARE_3= RULE_RSQUARE ) ;
    public final EObject ruleThreadWithRole() throws RecognitionException {
        EObject current = null;

        Token lv_thread_0_0=null;
        Token this_LSQUARE_1=null;
        Token lv_role_2_0=null;
        Token this_RSQUARE_3=null;

         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1262:28: ( ( ( (lv_thread_0_0= RULE_ID ) ) this_LSQUARE_1= RULE_LSQUARE ( (lv_role_2_0= RULE_ID ) ) this_RSQUARE_3= RULE_RSQUARE ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1263:1: ( ( (lv_thread_0_0= RULE_ID ) ) this_LSQUARE_1= RULE_LSQUARE ( (lv_role_2_0= RULE_ID ) ) this_RSQUARE_3= RULE_RSQUARE )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1263:1: ( ( (lv_thread_0_0= RULE_ID ) ) this_LSQUARE_1= RULE_LSQUARE ( (lv_role_2_0= RULE_ID ) ) this_RSQUARE_3= RULE_RSQUARE )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1263:2: ( (lv_thread_0_0= RULE_ID ) ) this_LSQUARE_1= RULE_LSQUARE ( (lv_role_2_0= RULE_ID ) ) this_RSQUARE_3= RULE_RSQUARE
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1263:2: ( (lv_thread_0_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1264:1: (lv_thread_0_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1264:1: (lv_thread_0_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1265:3: lv_thread_0_0= RULE_ID
            {
            lv_thread_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleThreadWithRole2565); 

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

            this_LSQUARE_1=(Token)match(input,RULE_LSQUARE,FOLLOW_RULE_LSQUARE_in_ruleThreadWithRole2581); 
             
                newLeafNode(this_LSQUARE_1, grammarAccess.getThreadWithRoleAccess().getLSQUARETerminalRuleCall_1()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1285:1: ( (lv_role_2_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1286:1: (lv_role_2_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1286:1: (lv_role_2_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1287:3: lv_role_2_0= RULE_ID
            {
            lv_role_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleThreadWithRole2597); 

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

            this_RSQUARE_3=(Token)match(input,RULE_RSQUARE,FOLLOW_RULE_RSQUARE_in_ruleThreadWithRole2613); 
             
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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1315:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1316:2: (iv_ruleInteraction= ruleInteraction EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1317:2: iv_ruleInteraction= ruleInteraction EOF
            {
             newCompositeNode(grammarAccess.getInteractionRule()); 
            pushFollow(FOLLOW_ruleInteraction_in_entryRuleInteraction2648);
            iv_ruleInteraction=ruleInteraction();

            state._fsp--;

             current =iv_ruleInteraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteraction2658); 

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1324:1: ruleInteraction returns [EObject current=null] : ( ( (lv_sender_0_0= RULE_ID ) ) (this_DOT_1= RULE_DOT this_LPAREN_2= RULE_LPAREN ( (lv_senderExpression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN )? this_ARROW_5= RULE_ARROW ( (lv_receiver_6_0= RULE_ID ) ) (this_DOT_7= RULE_DOT ( (lv_receiverVariable_8_0= RULE_ID ) ) )? this_COLON_9= RULE_COLON ( (lv_operation_10_0= RULE_ID ) ) this_LPAREN_11= RULE_LPAREN ( (lv_session_12_0= RULE_ID ) ) this_RPAREN_13= RULE_RPAREN (this_SEMICOLON_14= RULE_SEMICOLON ( (lv_continuation_15_0= ruleChoreography ) ) )? ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token lv_sender_0_0=null;
        Token this_DOT_1=null;
        Token this_LPAREN_2=null;
        Token this_RPAREN_4=null;
        Token this_ARROW_5=null;
        Token lv_receiver_6_0=null;
        Token this_DOT_7=null;
        Token lv_receiverVariable_8_0=null;
        Token this_COLON_9=null;
        Token lv_operation_10_0=null;
        Token this_LPAREN_11=null;
        Token lv_session_12_0=null;
        Token this_RPAREN_13=null;
        Token this_SEMICOLON_14=null;
        EObject lv_senderExpression_3_0 = null;

        EObject lv_continuation_15_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1327:28: ( ( ( (lv_sender_0_0= RULE_ID ) ) (this_DOT_1= RULE_DOT this_LPAREN_2= RULE_LPAREN ( (lv_senderExpression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN )? this_ARROW_5= RULE_ARROW ( (lv_receiver_6_0= RULE_ID ) ) (this_DOT_7= RULE_DOT ( (lv_receiverVariable_8_0= RULE_ID ) ) )? this_COLON_9= RULE_COLON ( (lv_operation_10_0= RULE_ID ) ) this_LPAREN_11= RULE_LPAREN ( (lv_session_12_0= RULE_ID ) ) this_RPAREN_13= RULE_RPAREN (this_SEMICOLON_14= RULE_SEMICOLON ( (lv_continuation_15_0= ruleChoreography ) ) )? ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1328:1: ( ( (lv_sender_0_0= RULE_ID ) ) (this_DOT_1= RULE_DOT this_LPAREN_2= RULE_LPAREN ( (lv_senderExpression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN )? this_ARROW_5= RULE_ARROW ( (lv_receiver_6_0= RULE_ID ) ) (this_DOT_7= RULE_DOT ( (lv_receiverVariable_8_0= RULE_ID ) ) )? this_COLON_9= RULE_COLON ( (lv_operation_10_0= RULE_ID ) ) this_LPAREN_11= RULE_LPAREN ( (lv_session_12_0= RULE_ID ) ) this_RPAREN_13= RULE_RPAREN (this_SEMICOLON_14= RULE_SEMICOLON ( (lv_continuation_15_0= ruleChoreography ) ) )? )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1328:1: ( ( (lv_sender_0_0= RULE_ID ) ) (this_DOT_1= RULE_DOT this_LPAREN_2= RULE_LPAREN ( (lv_senderExpression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN )? this_ARROW_5= RULE_ARROW ( (lv_receiver_6_0= RULE_ID ) ) (this_DOT_7= RULE_DOT ( (lv_receiverVariable_8_0= RULE_ID ) ) )? this_COLON_9= RULE_COLON ( (lv_operation_10_0= RULE_ID ) ) this_LPAREN_11= RULE_LPAREN ( (lv_session_12_0= RULE_ID ) ) this_RPAREN_13= RULE_RPAREN (this_SEMICOLON_14= RULE_SEMICOLON ( (lv_continuation_15_0= ruleChoreography ) ) )? )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1328:2: ( (lv_sender_0_0= RULE_ID ) ) (this_DOT_1= RULE_DOT this_LPAREN_2= RULE_LPAREN ( (lv_senderExpression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN )? this_ARROW_5= RULE_ARROW ( (lv_receiver_6_0= RULE_ID ) ) (this_DOT_7= RULE_DOT ( (lv_receiverVariable_8_0= RULE_ID ) ) )? this_COLON_9= RULE_COLON ( (lv_operation_10_0= RULE_ID ) ) this_LPAREN_11= RULE_LPAREN ( (lv_session_12_0= RULE_ID ) ) this_RPAREN_13= RULE_RPAREN (this_SEMICOLON_14= RULE_SEMICOLON ( (lv_continuation_15_0= ruleChoreography ) ) )?
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1328:2: ( (lv_sender_0_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1329:1: (lv_sender_0_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1329:1: (lv_sender_0_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1330:3: lv_sender_0_0= RULE_ID
            {
            lv_sender_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteraction2700); 

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

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1346:2: (this_DOT_1= RULE_DOT this_LPAREN_2= RULE_LPAREN ( (lv_senderExpression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_DOT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1346:3: this_DOT_1= RULE_DOT this_LPAREN_2= RULE_LPAREN ( (lv_senderExpression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN
                    {
                    this_DOT_1=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleInteraction2717); 
                     
                        newLeafNode(this_DOT_1, grammarAccess.getInteractionAccess().getDOTTerminalRuleCall_1_0()); 
                        
                    this_LPAREN_2=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleInteraction2727); 
                     
                        newLeafNode(this_LPAREN_2, grammarAccess.getInteractionAccess().getLPARENTerminalRuleCall_1_1()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1354:1: ( (lv_senderExpression_3_0= ruleExpression ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1355:1: (lv_senderExpression_3_0= ruleExpression )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1355:1: (lv_senderExpression_3_0= ruleExpression )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1356:3: lv_senderExpression_3_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getInteractionAccess().getSenderExpressionExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleInteraction2747);
                    lv_senderExpression_3_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInteractionRule());
                    	        }
                           		set(
                           			current, 
                           			"senderExpression",
                            		lv_senderExpression_3_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_RPAREN_4=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleInteraction2758); 
                     
                        newLeafNode(this_RPAREN_4, grammarAccess.getInteractionAccess().getRPARENTerminalRuleCall_1_3()); 
                        

                    }
                    break;

            }

            this_ARROW_5=(Token)match(input,RULE_ARROW,FOLLOW_RULE_ARROW_in_ruleInteraction2770); 
             
                newLeafNode(this_ARROW_5, grammarAccess.getInteractionAccess().getARROWTerminalRuleCall_2()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1380:1: ( (lv_receiver_6_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1381:1: (lv_receiver_6_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1381:1: (lv_receiver_6_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1382:3: lv_receiver_6_0= RULE_ID
            {
            lv_receiver_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteraction2786); 

            			newLeafNode(lv_receiver_6_0, grammarAccess.getInteractionAccess().getReceiverIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInteractionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"receiver",
                    		lv_receiver_6_0, 
                    		"ID");
            	    

            }


            }

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1398:2: (this_DOT_7= RULE_DOT ( (lv_receiverVariable_8_0= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_DOT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1398:3: this_DOT_7= RULE_DOT ( (lv_receiverVariable_8_0= RULE_ID ) )
                    {
                    this_DOT_7=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleInteraction2803); 
                     
                        newLeafNode(this_DOT_7, grammarAccess.getInteractionAccess().getDOTTerminalRuleCall_4_0()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1402:1: ( (lv_receiverVariable_8_0= RULE_ID ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1403:1: (lv_receiverVariable_8_0= RULE_ID )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1403:1: (lv_receiverVariable_8_0= RULE_ID )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1404:3: lv_receiverVariable_8_0= RULE_ID
                    {
                    lv_receiverVariable_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteraction2819); 

                    			newLeafNode(lv_receiverVariable_8_0, grammarAccess.getInteractionAccess().getReceiverVariableIDTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInteractionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"receiverVariable",
                            		lv_receiverVariable_8_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            this_COLON_9=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleInteraction2837); 
             
                newLeafNode(this_COLON_9, grammarAccess.getInteractionAccess().getCOLONTerminalRuleCall_5()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1424:1: ( (lv_operation_10_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1425:1: (lv_operation_10_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1425:1: (lv_operation_10_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1426:3: lv_operation_10_0= RULE_ID
            {
            lv_operation_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteraction2853); 

            			newLeafNode(lv_operation_10_0, grammarAccess.getInteractionAccess().getOperationIDTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInteractionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"operation",
                    		lv_operation_10_0, 
                    		"ID");
            	    

            }


            }

            this_LPAREN_11=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleInteraction2869); 
             
                newLeafNode(this_LPAREN_11, grammarAccess.getInteractionAccess().getLPARENTerminalRuleCall_7()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1446:1: ( (lv_session_12_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1447:1: (lv_session_12_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1447:1: (lv_session_12_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1448:3: lv_session_12_0= RULE_ID
            {
            lv_session_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteraction2885); 

            			newLeafNode(lv_session_12_0, grammarAccess.getInteractionAccess().getSessionIDTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInteractionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"session",
                    		lv_session_12_0, 
                    		"ID");
            	    

            }


            }

            this_RPAREN_13=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleInteraction2901); 
             
                newLeafNode(this_RPAREN_13, grammarAccess.getInteractionAccess().getRPARENTerminalRuleCall_9()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1468:1: (this_SEMICOLON_14= RULE_SEMICOLON ( (lv_continuation_15_0= ruleChoreography ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_SEMICOLON) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1468:2: this_SEMICOLON_14= RULE_SEMICOLON ( (lv_continuation_15_0= ruleChoreography ) )
                    {
                    this_SEMICOLON_14=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleInteraction2912); 
                     
                        newLeafNode(this_SEMICOLON_14, grammarAccess.getInteractionAccess().getSEMICOLONTerminalRuleCall_10_0()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1472:1: ( (lv_continuation_15_0= ruleChoreography ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1473:1: (lv_continuation_15_0= ruleChoreography )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1473:1: (lv_continuation_15_0= ruleChoreography )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1474:3: lv_continuation_15_0= ruleChoreography
                    {
                     
                    	        newCompositeNode(grammarAccess.getInteractionAccess().getContinuationChoreographyParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleChoreography_in_ruleInteraction2932);
                    lv_continuation_15_0=ruleChoreography();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInteractionRule());
                    	        }
                           		set(
                           			current, 
                           			"continuation",
                            		lv_continuation_15_0, 
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


    // $ANTLR start "entryRuleIfThenElse"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1498:1: entryRuleIfThenElse returns [EObject current=null] : iv_ruleIfThenElse= ruleIfThenElse EOF ;
    public final EObject entryRuleIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElse = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1499:2: (iv_ruleIfThenElse= ruleIfThenElse EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1500:2: iv_ruleIfThenElse= ruleIfThenElse EOF
            {
             newCompositeNode(grammarAccess.getIfThenElseRule()); 
            pushFollow(FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse2970);
            iv_ruleIfThenElse=ruleIfThenElse();

            state._fsp--;

             current =iv_ruleIfThenElse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfThenElse2980); 

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1507:1: ruleIfThenElse returns [EObject current=null] : (otherlv_0= 'if' this_LPAREN_1= RULE_LPAREN ( (lv_condition_2_0= ruleCondition ) ) this_RPAREN_3= RULE_RPAREN this_AT_4= RULE_AT ( (lv_thread_5_0= RULE_ID ) ) ( (lv_then_6_0= ruleChoreography ) ) (otherlv_7= 'else' ( (lv_else_8_0= ruleChoreography ) ) )? ) ;
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1510:28: ( (otherlv_0= 'if' this_LPAREN_1= RULE_LPAREN ( (lv_condition_2_0= ruleCondition ) ) this_RPAREN_3= RULE_RPAREN this_AT_4= RULE_AT ( (lv_thread_5_0= RULE_ID ) ) ( (lv_then_6_0= ruleChoreography ) ) (otherlv_7= 'else' ( (lv_else_8_0= ruleChoreography ) ) )? ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1511:1: (otherlv_0= 'if' this_LPAREN_1= RULE_LPAREN ( (lv_condition_2_0= ruleCondition ) ) this_RPAREN_3= RULE_RPAREN this_AT_4= RULE_AT ( (lv_thread_5_0= RULE_ID ) ) ( (lv_then_6_0= ruleChoreography ) ) (otherlv_7= 'else' ( (lv_else_8_0= ruleChoreography ) ) )? )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1511:1: (otherlv_0= 'if' this_LPAREN_1= RULE_LPAREN ( (lv_condition_2_0= ruleCondition ) ) this_RPAREN_3= RULE_RPAREN this_AT_4= RULE_AT ( (lv_thread_5_0= RULE_ID ) ) ( (lv_then_6_0= ruleChoreography ) ) (otherlv_7= 'else' ( (lv_else_8_0= ruleChoreography ) ) )? )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1511:3: otherlv_0= 'if' this_LPAREN_1= RULE_LPAREN ( (lv_condition_2_0= ruleCondition ) ) this_RPAREN_3= RULE_RPAREN this_AT_4= RULE_AT ( (lv_thread_5_0= RULE_ID ) ) ( (lv_then_6_0= ruleChoreography ) ) (otherlv_7= 'else' ( (lv_else_8_0= ruleChoreography ) ) )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleIfThenElse3017); 

                	newLeafNode(otherlv_0, grammarAccess.getIfThenElseAccess().getIfKeyword_0());
                
            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleIfThenElse3028); 
             
                newLeafNode(this_LPAREN_1, grammarAccess.getIfThenElseAccess().getLPARENTerminalRuleCall_1()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1519:1: ( (lv_condition_2_0= ruleCondition ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1520:1: (lv_condition_2_0= ruleCondition )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1520:1: (lv_condition_2_0= ruleCondition )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1521:3: lv_condition_2_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getIfThenElseAccess().getConditionConditionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleIfThenElse3048);
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

            this_RPAREN_3=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleIfThenElse3059); 
             
                newLeafNode(this_RPAREN_3, grammarAccess.getIfThenElseAccess().getRPARENTerminalRuleCall_3()); 
                
            this_AT_4=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleIfThenElse3069); 
             
                newLeafNode(this_AT_4, grammarAccess.getIfThenElseAccess().getATTerminalRuleCall_4()); 
                
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1545:1: ( (lv_thread_5_0= RULE_ID ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1546:1: (lv_thread_5_0= RULE_ID )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1546:1: (lv_thread_5_0= RULE_ID )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1547:3: lv_thread_5_0= RULE_ID
            {
            lv_thread_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIfThenElse3085); 

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

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1563:2: ( (lv_then_6_0= ruleChoreography ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1564:1: (lv_then_6_0= ruleChoreography )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1564:1: (lv_then_6_0= ruleChoreography )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1565:3: lv_then_6_0= ruleChoreography
            {
             
            	        newCompositeNode(grammarAccess.getIfThenElseAccess().getThenChoreographyParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleChoreography_in_ruleIfThenElse3111);
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

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1581:2: (otherlv_7= 'else' ( (lv_else_8_0= ruleChoreography ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==44) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1581:4: otherlv_7= 'else' ( (lv_else_8_0= ruleChoreography ) )
                    {
                    otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleIfThenElse3124); 

                        	newLeafNode(otherlv_7, grammarAccess.getIfThenElseAccess().getElseKeyword_7_0());
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1585:1: ( (lv_else_8_0= ruleChoreography ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1586:1: (lv_else_8_0= ruleChoreography )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1586:1: (lv_else_8_0= ruleChoreography )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1587:3: lv_else_8_0= ruleChoreography
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfThenElseAccess().getElseChoreographyParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleChoreography_in_ruleIfThenElse3145);
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


    // $ANTLR start "entryRuleExpression"
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1611:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1612:2: (iv_ruleExpression= ruleExpression EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1613:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression3183);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression3193); 

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1620:1: ruleExpression returns [EObject current=null] : ( (lv_sumExpression_0_0= ruleSumExpression ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_sumExpression_0_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1623:28: ( ( (lv_sumExpression_0_0= ruleSumExpression ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1624:1: ( (lv_sumExpression_0_0= ruleSumExpression ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1624:1: ( (lv_sumExpression_0_0= ruleSumExpression ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1625:1: (lv_sumExpression_0_0= ruleSumExpression )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1625:1: (lv_sumExpression_0_0= ruleSumExpression )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1626:3: lv_sumExpression_0_0= ruleSumExpression
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAccess().getSumExpressionSumExpressionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleSumExpression_in_ruleExpression3238);
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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1650:1: entryRuleSumExpression returns [EObject current=null] : iv_ruleSumExpression= ruleSumExpression EOF ;
    public final EObject entryRuleSumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumExpression = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1651:2: (iv_ruleSumExpression= ruleSumExpression EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1652:2: iv_ruleSumExpression= ruleSumExpression EOF
            {
             newCompositeNode(grammarAccess.getSumExpressionRule()); 
            pushFollow(FOLLOW_ruleSumExpression_in_entryRuleSumExpression3273);
            iv_ruleSumExpression=ruleSumExpression();

            state._fsp--;

             current =iv_ruleSumExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumExpression3283); 

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1659:1: ruleSumExpression returns [EObject current=null] : ( ( (lv_children_0_0= ruleExpressionBasicTerm ) ) ( (lv_children_1_0= ruleSumExpressionTerm ) )* ) ;
    public final EObject ruleSumExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_children_0_0 = null;

        EObject lv_children_1_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1662:28: ( ( ( (lv_children_0_0= ruleExpressionBasicTerm ) ) ( (lv_children_1_0= ruleSumExpressionTerm ) )* ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1663:1: ( ( (lv_children_0_0= ruleExpressionBasicTerm ) ) ( (lv_children_1_0= ruleSumExpressionTerm ) )* )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1663:1: ( ( (lv_children_0_0= ruleExpressionBasicTerm ) ) ( (lv_children_1_0= ruleSumExpressionTerm ) )* )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1663:2: ( (lv_children_0_0= ruleExpressionBasicTerm ) ) ( (lv_children_1_0= ruleSumExpressionTerm ) )*
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1663:2: ( (lv_children_0_0= ruleExpressionBasicTerm ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1664:1: (lv_children_0_0= ruleExpressionBasicTerm )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1664:1: (lv_children_0_0= ruleExpressionBasicTerm )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1665:3: lv_children_0_0= ruleExpressionBasicTerm
            {
             
            	        newCompositeNode(grammarAccess.getSumExpressionAccess().getChildrenExpressionBasicTermParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpressionBasicTerm_in_ruleSumExpression3329);
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

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1681:2: ( (lv_children_1_0= ruleSumExpressionTerm ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_PLUS && LA18_0<=RULE_MINUS)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1682:1: (lv_children_1_0= ruleSumExpressionTerm )
            	    {
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1682:1: (lv_children_1_0= ruleSumExpressionTerm )
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1683:3: lv_children_1_0= ruleSumExpressionTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSumExpressionAccess().getChildrenSumExpressionTermParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSumExpressionTerm_in_ruleSumExpression3350);
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
            	    break loop18;
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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1707:1: entryRuleSumExpressionTerm returns [EObject current=null] : iv_ruleSumExpressionTerm= ruleSumExpressionTerm EOF ;
    public final EObject entryRuleSumExpressionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumExpressionTerm = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1708:2: (iv_ruleSumExpressionTerm= ruleSumExpressionTerm EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1709:2: iv_ruleSumExpressionTerm= ruleSumExpressionTerm EOF
            {
             newCompositeNode(grammarAccess.getSumExpressionTermRule()); 
            pushFollow(FOLLOW_ruleSumExpressionTerm_in_entryRuleSumExpressionTerm3387);
            iv_ruleSumExpressionTerm=ruleSumExpressionTerm();

            state._fsp--;

             current =iv_ruleSumExpressionTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumExpressionTerm3397); 

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1716:1: ruleSumExpressionTerm returns [EObject current=null] : ( ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) ) | ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) ) ) ;
    public final EObject ruleSumExpressionTerm() throws RecognitionException {
        EObject current = null;

        Token this_PLUS_1=null;
        Token this_MINUS_4=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1719:28: ( ( ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) ) | ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1720:1: ( ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) ) | ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1720:1: ( ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) ) | ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_PLUS) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_MINUS) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1720:2: ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1720:2: ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1720:3: () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1720:3: ()
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1721:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSumExpressionTermAccess().getSumExpressionAddTermAction_0_0(),
                                current);
                        

                    }

                    this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleSumExpressionTerm3443); 
                     
                        newLeafNode(this_PLUS_1, grammarAccess.getSumExpressionTermAccess().getPLUSTerminalRuleCall_0_1()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1730:1: ( (lv_expression_2_0= ruleExpressionBasicTerm ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1731:1: (lv_expression_2_0= ruleExpressionBasicTerm )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1731:1: (lv_expression_2_0= ruleExpressionBasicTerm )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1732:3: lv_expression_2_0= ruleExpressionBasicTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getSumExpressionTermAccess().getExpressionExpressionBasicTermParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpressionBasicTerm_in_ruleSumExpressionTerm3463);
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
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1749:6: ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1749:6: ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1749:7: () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1749:7: ()
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1750:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSumExpressionTermAccess().getSumExpressionSubtractTermAction_1_0(),
                                current);
                        

                    }

                    this_MINUS_4=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleSumExpressionTerm3491); 
                     
                        newLeafNode(this_MINUS_4, grammarAccess.getSumExpressionTermAccess().getMINUSTerminalRuleCall_1_1()); 
                        
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1759:1: ( (lv_expression_5_0= ruleExpressionBasicTerm ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1760:1: (lv_expression_5_0= ruleExpressionBasicTerm )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1760:1: (lv_expression_5_0= ruleExpressionBasicTerm )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1761:3: lv_expression_5_0= ruleExpressionBasicTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getSumExpressionTermAccess().getExpressionExpressionBasicTermParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpressionBasicTerm_in_ruleSumExpressionTerm3511);
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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1785:1: entryRuleExpressionBasicTerm returns [EObject current=null] : iv_ruleExpressionBasicTerm= ruleExpressionBasicTerm EOF ;
    public final EObject entryRuleExpressionBasicTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBasicTerm = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1786:2: (iv_ruleExpressionBasicTerm= ruleExpressionBasicTerm EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1787:2: iv_ruleExpressionBasicTerm= ruleExpressionBasicTerm EOF
            {
             newCompositeNode(grammarAccess.getExpressionBasicTermRule()); 
            pushFollow(FOLLOW_ruleExpressionBasicTerm_in_entryRuleExpressionBasicTerm3548);
            iv_ruleExpressionBasicTerm=ruleExpressionBasicTerm();

            state._fsp--;

             current =iv_ruleExpressionBasicTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionBasicTerm3558); 

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1794:1: ruleExpressionBasicTerm returns [EObject current=null] : ( ( (lv_variable_0_0= RULE_ID ) ) | ( (lv_constant_1_0= ruleConstant ) ) ) ;
    public final EObject ruleExpressionBasicTerm() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0_0=null;
        EObject lv_constant_1_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1797:28: ( ( ( (lv_variable_0_0= RULE_ID ) ) | ( (lv_constant_1_0= ruleConstant ) ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1798:1: ( ( (lv_variable_0_0= RULE_ID ) ) | ( (lv_constant_1_0= ruleConstant ) ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1798:1: ( ( (lv_variable_0_0= RULE_ID ) ) | ( (lv_constant_1_0= ruleConstant ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_INT && LA20_0<=RULE_STRING)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1798:2: ( (lv_variable_0_0= RULE_ID ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1798:2: ( (lv_variable_0_0= RULE_ID ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1799:1: (lv_variable_0_0= RULE_ID )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1799:1: (lv_variable_0_0= RULE_ID )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1800:3: lv_variable_0_0= RULE_ID
                    {
                    lv_variable_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpressionBasicTerm3600); 

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
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1817:6: ( (lv_constant_1_0= ruleConstant ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1817:6: ( (lv_constant_1_0= ruleConstant ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1818:1: (lv_constant_1_0= ruleConstant )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1818:1: (lv_constant_1_0= ruleConstant )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1819:3: lv_constant_1_0= ruleConstant
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionBasicTermAccess().getConstantConstantParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstant_in_ruleExpressionBasicTerm3632);
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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1843:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1844:2: (iv_ruleConstant= ruleConstant EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1845:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant3668);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant3678); 

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1852:1: ruleConstant returns [EObject current=null] : ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_strValue_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_intValue_0_0=null;
        Token lv_strValue_1_0=null;

         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1855:28: ( ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_strValue_1_0= RULE_STRING ) ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1856:1: ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_strValue_1_0= RULE_STRING ) ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1856:1: ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_strValue_1_0= RULE_STRING ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_STRING) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1856:2: ( (lv_intValue_0_0= RULE_INT ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1856:2: ( (lv_intValue_0_0= RULE_INT ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1857:1: (lv_intValue_0_0= RULE_INT )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1857:1: (lv_intValue_0_0= RULE_INT )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1858:3: lv_intValue_0_0= RULE_INT
                    {
                    lv_intValue_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstant3720); 

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
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1875:6: ( (lv_strValue_1_0= RULE_STRING ) )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1875:6: ( (lv_strValue_1_0= RULE_STRING ) )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1876:1: (lv_strValue_1_0= RULE_STRING )
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1876:1: (lv_strValue_1_0= RULE_STRING )
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1877:3: lv_strValue_1_0= RULE_STRING
                    {
                    lv_strValue_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstant3748); 

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1901:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1902:2: (iv_ruleCondition= ruleCondition EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1903:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition3789);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition3799); 

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1910:1: ruleCondition returns [EObject current=null] : ( (lv_compareCondition_0_0= ruleCompareCondition ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_compareCondition_0_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1913:28: ( ( (lv_compareCondition_0_0= ruleCompareCondition ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1914:1: ( (lv_compareCondition_0_0= ruleCompareCondition ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1914:1: ( (lv_compareCondition_0_0= ruleCompareCondition ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1915:1: (lv_compareCondition_0_0= ruleCompareCondition )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1915:1: (lv_compareCondition_0_0= ruleCompareCondition )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1916:3: lv_compareCondition_0_0= ruleCompareCondition
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getCompareConditionCompareConditionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleCompareCondition_in_ruleCondition3844);
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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1940:1: entryRuleCompareCondition returns [EObject current=null] : iv_ruleCompareCondition= ruleCompareCondition EOF ;
    public final EObject entryRuleCompareCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareCondition = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1941:2: (iv_ruleCompareCondition= ruleCompareCondition EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1942:2: iv_ruleCompareCondition= ruleCompareCondition EOF
            {
             newCompositeNode(grammarAccess.getCompareConditionRule()); 
            pushFollow(FOLLOW_ruleCompareCondition_in_entryRuleCompareCondition3879);
            iv_ruleCompareCondition=ruleCompareCondition();

            state._fsp--;

             current =iv_ruleCompareCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareCondition3889); 

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1949:1: ruleCompareCondition returns [EObject current=null] : ( ( (lv_leftExpression_0_0= ruleExpression ) ) ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_rightExpression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleCompareCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_leftExpression_0_0 = null;

        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        EObject lv_rightExpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1952:28: ( ( ( (lv_leftExpression_0_0= ruleExpression ) ) ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_rightExpression_2_0= ruleExpression ) ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1953:1: ( ( (lv_leftExpression_0_0= ruleExpression ) ) ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_rightExpression_2_0= ruleExpression ) ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1953:1: ( ( (lv_leftExpression_0_0= ruleExpression ) ) ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_rightExpression_2_0= ruleExpression ) ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1953:2: ( (lv_leftExpression_0_0= ruleExpression ) ) ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_rightExpression_2_0= ruleExpression ) )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1953:2: ( (lv_leftExpression_0_0= ruleExpression ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1954:1: (lv_leftExpression_0_0= ruleExpression )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1954:1: (lv_leftExpression_0_0= ruleExpression )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1955:3: lv_leftExpression_0_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getCompareConditionAccess().getLeftExpressionExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleCompareCondition3935);
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

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1971:2: ( (lv_operator_1_0= ruleConditionOperator ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1972:1: (lv_operator_1_0= ruleConditionOperator )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1972:1: (lv_operator_1_0= ruleConditionOperator )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1973:3: lv_operator_1_0= ruleConditionOperator
            {
             
            	        newCompositeNode(grammarAccess.getCompareConditionAccess().getOperatorConditionOperatorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConditionOperator_in_ruleCompareCondition3956);
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

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1989:2: ( (lv_rightExpression_2_0= ruleExpression ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1990:1: (lv_rightExpression_2_0= ruleExpression )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1990:1: (lv_rightExpression_2_0= ruleExpression )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1991:3: lv_rightExpression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getCompareConditionAccess().getRightExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleCompareCondition3977);
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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2015:1: entryRuleConditionOperator returns [String current=null] : iv_ruleConditionOperator= ruleConditionOperator EOF ;
    public final String entryRuleConditionOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionOperator = null;


        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2016:2: (iv_ruleConditionOperator= ruleConditionOperator EOF )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2017:2: iv_ruleConditionOperator= ruleConditionOperator EOF
            {
             newCompositeNode(grammarAccess.getConditionOperatorRule()); 
            pushFollow(FOLLOW_ruleConditionOperator_in_entryRuleConditionOperator4014);
            iv_ruleConditionOperator=ruleConditionOperator();

            state._fsp--;

             current =iv_ruleConditionOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionOperator4025); 

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
    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2024:1: ruleConditionOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LESS_0= RULE_LESS | this_EQUAL_1= RULE_EQUAL | this_GREATER_2= RULE_GREATER | this_NOT_EQUAL_3= RULE_NOT_EQUAL ) ;
    public final AntlrDatatypeRuleToken ruleConditionOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LESS_0=null;
        Token this_EQUAL_1=null;
        Token this_GREATER_2=null;
        Token this_NOT_EQUAL_3=null;

         enterRule(); 
            
        try {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2027:28: ( (this_LESS_0= RULE_LESS | this_EQUAL_1= RULE_EQUAL | this_GREATER_2= RULE_GREATER | this_NOT_EQUAL_3= RULE_NOT_EQUAL ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2028:1: (this_LESS_0= RULE_LESS | this_EQUAL_1= RULE_EQUAL | this_GREATER_2= RULE_GREATER | this_NOT_EQUAL_3= RULE_NOT_EQUAL )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2028:1: (this_LESS_0= RULE_LESS | this_EQUAL_1= RULE_EQUAL | this_GREATER_2= RULE_GREATER | this_NOT_EQUAL_3= RULE_NOT_EQUAL )
            int alt22=4;
            switch ( input.LA(1) ) {
            case RULE_LESS:
                {
                alt22=1;
                }
                break;
            case RULE_EQUAL:
                {
                alt22=2;
                }
                break;
            case RULE_GREATER:
                {
                alt22=3;
                }
                break;
            case RULE_NOT_EQUAL:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2028:6: this_LESS_0= RULE_LESS
                    {
                    this_LESS_0=(Token)match(input,RULE_LESS,FOLLOW_RULE_LESS_in_ruleConditionOperator4065); 

                    		current.merge(this_LESS_0);
                        
                     
                        newLeafNode(this_LESS_0, grammarAccess.getConditionOperatorAccess().getLESSTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2036:10: this_EQUAL_1= RULE_EQUAL
                    {
                    this_EQUAL_1=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleConditionOperator4091); 

                    		current.merge(this_EQUAL_1);
                        
                     
                        newLeafNode(this_EQUAL_1, grammarAccess.getConditionOperatorAccess().getEQUALTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2044:10: this_GREATER_2= RULE_GREATER
                    {
                    this_GREATER_2=(Token)match(input,RULE_GREATER,FOLLOW_RULE_GREATER_in_ruleConditionOperator4117); 

                    		current.merge(this_GREATER_2);
                        
                     
                        newLeafNode(this_GREATER_2, grammarAccess.getConditionOperatorAccess().getGREATERTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2052:10: this_NOT_EQUAL_3= RULE_NOT_EQUAL
                    {
                    this_NOT_EQUAL_3=(Token)match(input,RULE_NOT_EQUAL,FOLLOW_RULE_NOT_EQUAL_in_ruleConditionOperator4143); 

                    		current.merge(this_NOT_EQUAL_3);
                        
                     
                        newLeafNode(this_NOT_EQUAL_3, grammarAccess.getConditionOperatorAccess().getNOT_EQUALTerminalRuleCall_3()); 
                        

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


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleProgram122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProgram139 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleProgram155 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_rulePreamble_in_ruleProgram175 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleProgram187 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleProgram198 = new BitSet(new long[]{0x0000080000000050L});
    public static final BitSet FOLLOW_ruleChoreography_in_ruleProgram218 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleProgram229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreamble_in_entryRulePreamble264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreamble274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_rulePreamble330 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleSite_in_rulePreamble357 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_entryRuleProtocol395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocol405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleProtocol442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProtocol459 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleProtocol475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGlobalType_in_ruleProtocol495 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleProtocol506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSite_in_entryRuleSite541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSite551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSite588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSite605 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleSite621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSite640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalType_in_entryRuleGlobalType676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalType686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlobalType728 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ARROW_in_ruleGlobalType744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlobalType760 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleGlobalType776 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleBranchGType_in_ruleGlobalType797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleGlobalType815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBranchGType_in_ruleGlobalType835 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleGlobalType847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBranchGType_in_ruleGlobalType867 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleGlobalType880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranchGType_in_entryRuleBranchGType917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBranchGType927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBranchGType969 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleBranchGType985 = new BitSet(new long[]{0x000003C000006000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleBranchGType1005 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleBranchGType1016 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleBranchGType1027 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGlobalType_in_ruleBranchGType1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType1085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleDataType1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalType_in_ruleDataType1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType1204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBasicType1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBasicType1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBasicType1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleBasicType1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalType_in_entryRuleLocalType1428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalType1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BANG_in_ruleLocalType1484 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleLocalType1494 = new BitSet(new long[]{0x000003C000006000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleLocalType1514 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleLocalType1525 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleLocalType1535 = new BitSet(new long[]{0x000003C000006000L});
    public static final BitSet FOLLOW_ruleLocalType_in_ruleLocalType1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_QUESTION_MARK_in_ruleLocalType1583 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleLocalType1593 = new BitSet(new long[]{0x000003C000006000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleLocalType1613 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleLocalType1624 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleLocalType1634 = new BitSet(new long[]{0x000003C000006000L});
    public static final BitSet FOLLOW_ruleLocalType_in_ruleLocalType1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_QUESTION_MARK_in_ruleLocalType1682 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleLocalType1692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBranchType_in_ruleLocalType1712 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleLocalType1724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBranchType_in_ruleLocalType1744 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleLocalType1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BANG_in_ruleLocalType1784 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleLocalType1794 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBranchType_in_ruleLocalType1814 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleLocalType1826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBranchType_in_ruleLocalType1846 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleLocalType1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranchType_in_entryRuleBranchType1895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBranchType1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBranchType1947 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleBranchType1963 = new BitSet(new long[]{0x000003C000006000L});
    public static final BitSet FOLLOW_ruleLocalType_in_ruleBranchType1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoreography_in_entryRuleChoreography2019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoreography2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStart_in_ruleChoreography2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteraction_in_ruleChoreography2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenElse_in_ruleChoreography2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleChoreography2147 = new BitSet(new long[]{0x0000080000000050L});
    public static final BitSet FOLLOW_ruleChoreography_in_ruleChoreography2168 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleChoreography2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStart_in_entryRuleStart2214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStart2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThreadWithRole_in_ruleStart2270 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleStart2282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleThreadWithRole_in_ruleStart2302 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_42_in_ruleStart2316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleThreadWithRole_in_ruleStart2337 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleStart2349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleThreadWithRole_in_ruleStart2369 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleStart2382 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStart2401 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleStart2412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStart2428 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleStart2444 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleStart2455 = new BitSet(new long[]{0x0000080000000050L});
    public static final BitSet FOLLOW_ruleChoreography_in_ruleStart2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThreadWithRole_in_entryRuleThreadWithRole2513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThreadWithRole2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleThreadWithRole2565 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_LSQUARE_in_ruleThreadWithRole2581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleThreadWithRole2597 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_RSQUARE_in_ruleThreadWithRole2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteraction_in_entryRuleInteraction2648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteraction2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteraction2700 = new BitSet(new long[]{0x0000000000020200L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleInteraction2717 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleInteraction2727 = new BitSet(new long[]{0x0000000000600010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInteraction2747 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleInteraction2758 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ARROW_in_ruleInteraction2770 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteraction2786 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleInteraction2803 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteraction2819 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleInteraction2837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteraction2853 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleInteraction2869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteraction2885 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleInteraction2901 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleInteraction2912 = new BitSet(new long[]{0x0000080000000050L});
    public static final BitSet FOLLOW_ruleChoreography_in_ruleInteraction2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse2970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfThenElse2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleIfThenElse3017 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleIfThenElse3028 = new BitSet(new long[]{0x0000000000600010L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleIfThenElse3048 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleIfThenElse3059 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleIfThenElse3069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIfThenElse3085 = new BitSet(new long[]{0x0000080000000050L});
    public static final BitSet FOLLOW_ruleChoreography_in_ruleIfThenElse3111 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleIfThenElse3124 = new BitSet(new long[]{0x0000080000000050L});
    public static final BitSet FOLLOW_ruleChoreography_in_ruleIfThenElse3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression3183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumExpression_in_ruleExpression3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumExpression_in_entryRuleSumExpression3273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumExpression3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionBasicTerm_in_ruleSumExpression3329 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleSumExpressionTerm_in_ruleSumExpression3350 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleSumExpressionTerm_in_entryRuleSumExpressionTerm3387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumExpressionTerm3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleSumExpressionTerm3443 = new BitSet(new long[]{0x0000000000600010L});
    public static final BitSet FOLLOW_ruleExpressionBasicTerm_in_ruleSumExpressionTerm3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleSumExpressionTerm3491 = new BitSet(new long[]{0x0000000000600010L});
    public static final BitSet FOLLOW_ruleExpressionBasicTerm_in_ruleSumExpressionTerm3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionBasicTerm_in_entryRuleExpressionBasicTerm3548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionBasicTerm3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpressionBasicTerm3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleExpressionBasicTerm3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant3668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstant3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstant3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition3789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareCondition_in_ruleCondition3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareCondition_in_entryRuleCompareCondition3879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareCondition3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCompareCondition3935 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_ruleConditionOperator_in_ruleCompareCondition3956 = new BitSet(new long[]{0x0000000000600010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCompareCondition3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionOperator_in_entryRuleConditionOperator4014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionOperator4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LESS_in_ruleConditionOperator4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleConditionOperator4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GREATER_in_ruleConditionOperator4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_EQUAL_in_ruleConditionOperator4143 = new BitSet(new long[]{0x0000000000000002L});

}