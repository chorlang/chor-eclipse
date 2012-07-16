package org.chor.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChorLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_SEMICOLON=5;
    public static final int RULE_ANY_OTHER=33;
    public static final int RULE_NOT_EQUAL=25;
    public static final int RULE_RSQUARE=13;
    public static final int EOF=-1;
    public static final int RULE_ASSIGN=17;
    public static final int RULE_DOT=16;
    public static final int RULE_LPAREN=8;
    public static final int RULE_INT=20;
    public static final int RULE_VERT=27;
    public static final int RULE_LSQUARE=11;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_GREATER=24;
    public static final int T__40=40;
    public static final int RULE_BANG=29;
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

    public InternalChorLexer() {;} 
    public InternalChorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalChorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g"; }

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:11:7: ( 'program' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:11:9: 'program'
            {
            match("program"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:12:7: ( 'main' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:12:9: 'main'
            {
            match("main"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:13:7: ( 'define' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:13:9: 'define'
            {
            match("define"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:14:7: ( 'protocol' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:14:9: 'protocol'
            {
            match("protocol"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:15:7: ( 'public' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:15:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:16:7: ( 'int' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:16:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:17:7: ( 'string' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:17:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:18:7: ( 'bool' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:18:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:19:7: ( 'void' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:19:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:20:7: ( 'start' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:20:9: 'start'
            {
            match("start"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:21:7: ( 'if' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:21:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:22:7: ( 'else' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:22:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:23:7: ( 'ask' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:23:9: 'ask'
            {
            match("ask"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:24:7: ( 'show' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:24:9: 'show'
            {
            match("show"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:25:7: ( 'local' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:25:9: 'local'
            {
            match("local"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "RULE_LCURLY"
    public final void mRULE_LCURLY() throws RecognitionException {
        try {
            int _type = RULE_LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2872:13: ( '{' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2872:15: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LCURLY"

    // $ANTLR start "RULE_RCURLY"
    public final void mRULE_RCURLY() throws RecognitionException {
        try {
            int _type = RULE_RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2874:13: ( '}' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2874:15: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RCURLY"

    // $ANTLR start "RULE_LSQUARE"
    public final void mRULE_LSQUARE() throws RecognitionException {
        try {
            int _type = RULE_LSQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2876:14: ( '[' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2876:16: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LSQUARE"

    // $ANTLR start "RULE_RSQUARE"
    public final void mRULE_RSQUARE() throws RecognitionException {
        try {
            int _type = RULE_RSQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2878:14: ( ']' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2878:16: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RSQUARE"

    // $ANTLR start "RULE_ARROW"
    public final void mRULE_ARROW() throws RecognitionException {
        try {
            int _type = RULE_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2880:12: ( '->' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2880:14: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ARROW"

    // $ANTLR start "RULE_SEMICOLON"
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2882:16: ( ';' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2882:18: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMICOLON"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2884:12: ( ':' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2884:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2886:11: ( '+' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2886:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_TIMES"
    public final void mRULE_TIMES() throws RecognitionException {
        try {
            int _type = RULE_TIMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2888:12: ( '*' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2888:14: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TIMES"

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2890:12: ( '-' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2890:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS"

    // $ANTLR start "RULE_VERT"
    public final void mRULE_VERT() throws RecognitionException {
        try {
            int _type = RULE_VERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2892:11: ( '|' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2892:13: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VERT"

    // $ANTLR start "RULE_QUESTION_MARK"
    public final void mRULE_QUESTION_MARK() throws RecognitionException {
        try {
            int _type = RULE_QUESTION_MARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2894:20: ( '?' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2894:22: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUESTION_MARK"

    // $ANTLR start "RULE_BANG"
    public final void mRULE_BANG() throws RecognitionException {
        try {
            int _type = RULE_BANG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2896:11: ( '!' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2896:13: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BANG"

    // $ANTLR start "RULE_AT"
    public final void mRULE_AT() throws RecognitionException {
        try {
            int _type = RULE_AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2898:9: ( '@' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2898:11: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AT"

    // $ANTLR start "RULE_ASSIGN"
    public final void mRULE_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2900:13: ( '=' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2900:15: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASSIGN"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2902:10: ( '.' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2902:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_LPAREN"
    public final void mRULE_LPAREN() throws RecognitionException {
        try {
            int _type = RULE_LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2904:13: ( '(' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2904:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LPAREN"

    // $ANTLR start "RULE_RPAREN"
    public final void mRULE_RPAREN() throws RecognitionException {
        try {
            int _type = RULE_RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2906:13: ( ')' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2906:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RPAREN"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2908:12: ( ',' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2908:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_LESS"
    public final void mRULE_LESS() throws RecognitionException {
        try {
            int _type = RULE_LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2910:11: ( '<' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2910:13: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LESS"

    // $ANTLR start "RULE_EQUAL"
    public final void mRULE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2912:12: ( '==' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2912:14: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUAL"

    // $ANTLR start "RULE_GREATER"
    public final void mRULE_GREATER() throws RecognitionException {
        try {
            int _type = RULE_GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2914:14: ( '>' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2914:16: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GREATER"

    // $ANTLR start "RULE_NOT_EQUAL"
    public final void mRULE_NOT_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2916:16: ( '!=' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2916:18: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT_EQUAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2918:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2918:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2918:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2918:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2918:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2920:10: ( ( '0' .. '9' )+ )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2920:12: ( '0' .. '9' )+
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2920:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2920:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2922:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2922:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2922:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2922:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2922:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2922:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2922:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2922:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2922:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2922:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2922:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2924:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2924:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2924:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2924:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2926:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2926:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2926:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2926:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2926:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2926:41: ( '\\r' )? '\\n'
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2926:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2926:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2928:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2928:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2928:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2930:16: ( . )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2930:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:8: ( T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | RULE_LCURLY | RULE_RCURLY | RULE_LSQUARE | RULE_RSQUARE | RULE_ARROW | RULE_SEMICOLON | RULE_COLON | RULE_PLUS | RULE_TIMES | RULE_MINUS | RULE_VERT | RULE_QUESTION_MARK | RULE_BANG | RULE_AT | RULE_ASSIGN | RULE_DOT | RULE_LPAREN | RULE_RPAREN | RULE_COMMA | RULE_LESS | RULE_EQUAL | RULE_GREATER | RULE_NOT_EQUAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=45;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:10: T__34
                {
                mT__34(); 

                }
                break;
            case 2 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:16: T__35
                {
                mT__35(); 

                }
                break;
            case 3 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:22: T__36
                {
                mT__36(); 

                }
                break;
            case 4 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:28: T__37
                {
                mT__37(); 

                }
                break;
            case 5 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:34: T__38
                {
                mT__38(); 

                }
                break;
            case 6 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:40: T__39
                {
                mT__39(); 

                }
                break;
            case 7 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:46: T__40
                {
                mT__40(); 

                }
                break;
            case 8 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:52: T__41
                {
                mT__41(); 

                }
                break;
            case 9 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:58: T__42
                {
                mT__42(); 

                }
                break;
            case 10 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:64: T__43
                {
                mT__43(); 

                }
                break;
            case 11 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:70: T__44
                {
                mT__44(); 

                }
                break;
            case 12 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:76: T__45
                {
                mT__45(); 

                }
                break;
            case 13 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:82: T__46
                {
                mT__46(); 

                }
                break;
            case 14 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:88: T__47
                {
                mT__47(); 

                }
                break;
            case 15 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:94: T__48
                {
                mT__48(); 

                }
                break;
            case 16 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:100: RULE_LCURLY
                {
                mRULE_LCURLY(); 

                }
                break;
            case 17 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:112: RULE_RCURLY
                {
                mRULE_RCURLY(); 

                }
                break;
            case 18 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:124: RULE_LSQUARE
                {
                mRULE_LSQUARE(); 

                }
                break;
            case 19 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:137: RULE_RSQUARE
                {
                mRULE_RSQUARE(); 

                }
                break;
            case 20 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:150: RULE_ARROW
                {
                mRULE_ARROW(); 

                }
                break;
            case 21 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:161: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 22 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:176: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 23 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:187: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 24 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:197: RULE_TIMES
                {
                mRULE_TIMES(); 

                }
                break;
            case 25 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:208: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 26 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:219: RULE_VERT
                {
                mRULE_VERT(); 

                }
                break;
            case 27 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:229: RULE_QUESTION_MARK
                {
                mRULE_QUESTION_MARK(); 

                }
                break;
            case 28 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:248: RULE_BANG
                {
                mRULE_BANG(); 

                }
                break;
            case 29 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:258: RULE_AT
                {
                mRULE_AT(); 

                }
                break;
            case 30 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:266: RULE_ASSIGN
                {
                mRULE_ASSIGN(); 

                }
                break;
            case 31 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:278: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 32 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:287: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 33 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:299: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 34 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:311: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 35 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:322: RULE_LESS
                {
                mRULE_LESS(); 

                }
                break;
            case 36 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:332: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 37 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:343: RULE_GREATER
                {
                mRULE_GREATER(); 

                }
                break;
            case 38 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:356: RULE_NOT_EQUAL
                {
                mRULE_NOT_EQUAL(); 

                }
                break;
            case 39 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:371: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 40 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:379: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 41 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:388: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 42 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:400: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 43 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:416: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 44 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:432: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 45 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:440: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\12\51\4\uffff\1\72\6\uffff\1\102\1\uffff\1\105\6\uffff"+
        "\1\46\2\uffff\3\46\2\uffff\2\51\1\uffff\3\51\1\126\7\51\34\uffff"+
        "\4\51\1\144\1\uffff\6\51\1\153\4\51\1\160\1\51\1\uffff\2\51\1\164"+
        "\1\165\1\166\1\167\1\uffff\4\51\1\uffff\2\51\1\176\4\uffff\1\177"+
        "\2\51\1\u0082\1\u0083\1\u0084\2\uffff\1\u0085\1\51\4\uffff\1\u0087"+
        "\1\uffff";
    static final String DFA12_eofS =
        "\u0088\uffff";
    static final String DFA12_minS =
        "\1\0\1\162\1\141\1\145\1\146\1\150\2\157\1\154\1\163\1\157\4\uffff"+
        "\1\76\6\uffff\1\75\1\uffff\1\75\6\uffff\1\101\2\uffff\2\0\1\52\2"+
        "\uffff\1\157\1\142\1\uffff\1\151\1\146\1\164\1\60\1\141\2\157\1"+
        "\151\1\163\1\153\1\143\34\uffff\1\147\1\154\1\156\1\151\1\60\1\uffff"+
        "\1\151\1\162\1\167\1\154\1\144\1\145\1\60\1\141\1\162\1\157\1\151"+
        "\1\60\1\156\1\uffff\1\156\1\164\4\60\1\uffff\1\154\1\141\2\143\1"+
        "\uffff\1\145\1\147\1\60\4\uffff\1\60\1\155\1\157\3\60\2\uffff\1"+
        "\60\1\154\4\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\165\1\141\1\145\1\156\1\164\2\157\1\154\1\163\1\157\4"+
        "\uffff\1\76\6\uffff\1\75\1\uffff\1\75\6\uffff\1\172\2\uffff\2\uffff"+
        "\1\57\2\uffff\1\157\1\142\1\uffff\1\151\1\146\1\164\1\172\1\162"+
        "\2\157\1\151\1\163\1\153\1\143\34\uffff\1\164\1\154\1\156\1\151"+
        "\1\172\1\uffff\1\151\1\162\1\167\1\154\1\144\1\145\1\172\1\141\1"+
        "\162\1\157\1\151\1\172\1\156\1\uffff\1\156\1\164\4\172\1\uffff\1"+
        "\154\1\141\2\143\1\uffff\1\145\1\147\1\172\4\uffff\1\172\1\155\1"+
        "\157\3\172\2\uffff\1\172\1\154\4\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\13\uffff\1\20\1\21\1\22\1\23\1\uffff\1\25\1\26\1\27\1\30\1\32\1"+
        "\33\1\uffff\1\35\1\uffff\1\37\1\40\1\41\1\42\1\43\1\45\1\uffff\1"+
        "\47\1\50\3\uffff\1\54\1\55\2\uffff\1\47\13\uffff\1\20\1\21\1\22"+
        "\1\23\1\24\1\31\1\25\1\26\1\27\1\30\1\32\1\33\1\46\1\34\1\35\1\44"+
        "\1\36\1\37\1\40\1\41\1\42\1\43\1\45\1\50\1\51\1\52\1\53\1\54\5\uffff"+
        "\1\13\15\uffff\1\6\6\uffff\1\15\4\uffff\1\2\3\uffff\1\16\1\10\1"+
        "\11\1\14\6\uffff\1\12\1\17\2\uffff\1\5\1\3\1\7\1\1\1\uffff\1\4";
    static final String DFA12_specialS =
        "\1\1\41\uffff\1\0\1\2\144\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\46\2\45\2\46\1\45\22\46\1\45\1\26\1\42\4\46\1\43\1\32\1"+
            "\33\1\23\1\22\1\34\1\17\1\31\1\44\12\41\1\21\1\20\1\35\1\30"+
            "\1\36\1\25\1\27\32\40\1\15\1\46\1\16\1\37\1\40\1\46\1\11\1\6"+
            "\1\40\1\3\1\10\3\40\1\4\2\40\1\12\1\2\2\40\1\1\2\40\1\5\2\40"+
            "\1\7\4\40\1\13\1\24\1\14\uff82\46",
            "\1\47\2\uffff\1\50",
            "\1\52",
            "\1\53",
            "\1\55\7\uffff\1\54",
            "\1\57\13\uffff\1\56",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "",
            "",
            "",
            "\1\71",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\101",
            "",
            "\1\104",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\0\115",
            "\0\115",
            "\1\116\4\uffff\1\117",
            "",
            "",
            "\1\121",
            "\1\122",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\130\20\uffff\1\127",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\137\14\uffff\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\161",
            "",
            "\1\162",
            "\1\163",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "\1\174",
            "\1\175",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0080",
            "\1\u0081",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0086",
            "",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | RULE_LCURLY | RULE_RCURLY | RULE_LSQUARE | RULE_RSQUARE | RULE_ARROW | RULE_SEMICOLON | RULE_COLON | RULE_PLUS | RULE_TIMES | RULE_MINUS | RULE_VERT | RULE_QUESTION_MARK | RULE_BANG | RULE_AT | RULE_ASSIGN | RULE_DOT | RULE_LPAREN | RULE_RPAREN | RULE_COMMA | RULE_LESS | RULE_EQUAL | RULE_GREATER | RULE_NOT_EQUAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_34 = input.LA(1);

                        s = -1;
                        if ( ((LA12_34>='\u0000' && LA12_34<='\uFFFF')) ) {s = 77;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='p') ) {s = 1;}

                        else if ( (LA12_0=='m') ) {s = 2;}

                        else if ( (LA12_0=='d') ) {s = 3;}

                        else if ( (LA12_0=='i') ) {s = 4;}

                        else if ( (LA12_0=='s') ) {s = 5;}

                        else if ( (LA12_0=='b') ) {s = 6;}

                        else if ( (LA12_0=='v') ) {s = 7;}

                        else if ( (LA12_0=='e') ) {s = 8;}

                        else if ( (LA12_0=='a') ) {s = 9;}

                        else if ( (LA12_0=='l') ) {s = 10;}

                        else if ( (LA12_0=='{') ) {s = 11;}

                        else if ( (LA12_0=='}') ) {s = 12;}

                        else if ( (LA12_0=='[') ) {s = 13;}

                        else if ( (LA12_0==']') ) {s = 14;}

                        else if ( (LA12_0=='-') ) {s = 15;}

                        else if ( (LA12_0==';') ) {s = 16;}

                        else if ( (LA12_0==':') ) {s = 17;}

                        else if ( (LA12_0=='+') ) {s = 18;}

                        else if ( (LA12_0=='*') ) {s = 19;}

                        else if ( (LA12_0=='|') ) {s = 20;}

                        else if ( (LA12_0=='?') ) {s = 21;}

                        else if ( (LA12_0=='!') ) {s = 22;}

                        else if ( (LA12_0=='@') ) {s = 23;}

                        else if ( (LA12_0=='=') ) {s = 24;}

                        else if ( (LA12_0=='.') ) {s = 25;}

                        else if ( (LA12_0=='(') ) {s = 26;}

                        else if ( (LA12_0==')') ) {s = 27;}

                        else if ( (LA12_0==',') ) {s = 28;}

                        else if ( (LA12_0=='<') ) {s = 29;}

                        else if ( (LA12_0=='>') ) {s = 30;}

                        else if ( (LA12_0=='^') ) {s = 31;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='c'||(LA12_0>='f' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||(LA12_0>='n' && LA12_0<='o')||(LA12_0>='q' && LA12_0<='r')||(LA12_0>='t' && LA12_0<='u')||(LA12_0>='w' && LA12_0<='z')) ) {s = 32;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 33;}

                        else if ( (LA12_0=='\"') ) {s = 34;}

                        else if ( (LA12_0=='\'') ) {s = 35;}

                        else if ( (LA12_0=='/') ) {s = 36;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 37;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='&')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_35 = input.LA(1);

                        s = -1;
                        if ( ((LA12_35>='\u0000' && LA12_35<='\uFFFF')) ) {s = 77;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}