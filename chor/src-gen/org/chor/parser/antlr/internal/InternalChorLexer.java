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
    public static final int RULE_NOT_EQUAL=26;
    public static final int RULE_RSQUARE=16;
    public static final int EOF=-1;
    public static final int RULE_ASSIGN=29;
    public static final int RULE_DOT=17;
    public static final int RULE_LPAREN=11;
    public static final int RULE_INT=21;
    public static final int RULE_VERT=28;
    public static final int RULE_LSQUARE=15;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_GREATER=25;
    public static final int RULE_BANG=13;
    public static final int T__40=40;
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:13:7: ( 'protocol' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:13:9: 'protocol'
            {
            match("protocol"); 


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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:14:7: ( 'site' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:14:9: 'site'
            {
            match("site"); 


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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:15:7: ( 'int' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:15:9: 'int'
            {
            match("int"); 


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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:16:7: ( 'string' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:16:9: 'string'
            {
            match("string"); 


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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:17:7: ( 'bool' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:17:9: 'bool'
            {
            match("bool"); 


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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:18:7: ( 'void' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:18:9: 'void'
            {
            match("void"); 


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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:19:7: ( 'start' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:19:9: 'start'
            {
            match("start"); 


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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:20:7: ( 'if' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:20:9: 'if'
            {
            match("if"); 


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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:21:7: ( 'else' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:21:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "RULE_LCURLY"
    public final void mRULE_LCURLY() throws RecognitionException {
        try {
            int _type = RULE_LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2066:13: ( '{' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2066:15: '{'
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2068:13: ( '}' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2068:15: '}'
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2070:14: ( '[' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2070:16: '['
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2072:14: ( ']' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2072:16: ']'
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2074:12: ( '->' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2074:14: '->'
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2076:16: ( ';' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2076:18: ';'
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2078:12: ( ':' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2078:14: ':'
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2080:11: ( '+' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2080:13: '+'
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2082:12: ( '*' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2082:14: '*'
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2084:12: ( '-' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2084:14: '-'
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2086:11: ( '|' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2086:13: '|'
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2088:20: ( '?' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2088:22: '?'
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2090:11: ( '!' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2090:13: '!'
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2092:9: ( '@' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2092:11: '@'
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2094:13: ( '=' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2094:15: '='
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2096:10: ( '.' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2096:12: '.'
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2098:13: ( '(' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2098:15: '('
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2100:13: ( ')' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2100:15: ')'
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2102:12: ( ',' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2102:14: ','
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2104:11: ( '<' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2104:13: '<'
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2106:12: ( '==' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2106:14: '=='
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2108:14: ( '>' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2108:16: '>'
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2110:16: ( '!=' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2110:18: '!='
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2112:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2112:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2112:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2112:11: '^'
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

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2112:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2114:10: ( ( '0' .. '9' )+ )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2114:12: ( '0' .. '9' )+
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2114:12: ( '0' .. '9' )+
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
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2114:13: '0' .. '9'
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2116:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2116:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2116:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2116:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2116:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2116:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2116:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2116:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2116:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2116:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2116:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2118:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2118:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2118:24: ( options {greedy=false; } : . )*
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
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2118:52: .
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2120:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2120:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2120:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2120:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2120:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2120:41: ( '\\r' )? '\\n'
                    {
                    // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2120:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2120:41: '\\r'
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2122:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2122:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2122:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2124:16: ( . )
            // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:2124:18: .
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
        // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:8: ( T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_LCURLY | RULE_RCURLY | RULE_LSQUARE | RULE_RSQUARE | RULE_ARROW | RULE_SEMICOLON | RULE_COLON | RULE_PLUS | RULE_TIMES | RULE_MINUS | RULE_VERT | RULE_QUESTION_MARK | RULE_BANG | RULE_AT | RULE_ASSIGN | RULE_DOT | RULE_LPAREN | RULE_RPAREN | RULE_COMMA | RULE_LESS | RULE_EQUAL | RULE_GREATER | RULE_NOT_EQUAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=41;
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
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:76: RULE_LCURLY
                {
                mRULE_LCURLY(); 

                }
                break;
            case 13 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:88: RULE_RCURLY
                {
                mRULE_RCURLY(); 

                }
                break;
            case 14 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:100: RULE_LSQUARE
                {
                mRULE_LSQUARE(); 

                }
                break;
            case 15 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:113: RULE_RSQUARE
                {
                mRULE_RSQUARE(); 

                }
                break;
            case 16 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:126: RULE_ARROW
                {
                mRULE_ARROW(); 

                }
                break;
            case 17 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:137: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 18 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:152: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 19 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:163: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 20 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:173: RULE_TIMES
                {
                mRULE_TIMES(); 

                }
                break;
            case 21 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:184: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 22 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:195: RULE_VERT
                {
                mRULE_VERT(); 

                }
                break;
            case 23 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:205: RULE_QUESTION_MARK
                {
                mRULE_QUESTION_MARK(); 

                }
                break;
            case 24 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:224: RULE_BANG
                {
                mRULE_BANG(); 

                }
                break;
            case 25 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:234: RULE_AT
                {
                mRULE_AT(); 

                }
                break;
            case 26 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:242: RULE_ASSIGN
                {
                mRULE_ASSIGN(); 

                }
                break;
            case 27 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:254: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 28 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:263: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 29 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:275: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 30 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:287: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 31 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:298: RULE_LESS
                {
                mRULE_LESS(); 

                }
                break;
            case 32 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:308: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 33 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:319: RULE_GREATER
                {
                mRULE_GREATER(); 

                }
                break;
            case 34 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:332: RULE_NOT_EQUAL
                {
                mRULE_NOT_EQUAL(); 

                }
                break;
            case 35 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:347: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 36 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:355: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 37 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:364: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 38 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:376: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 39 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:392: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 40 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:408: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 41 :
                // ../chor/src-gen/org/chor/parser/antlr/internal/InternalChor.g:1:416: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\7\45\4\uffff\1\63\6\uffff\1\73\1\uffff\1\76\6\uffff\1\43"+
        "\2\uffff\3\43\2\uffff\1\45\1\uffff\4\45\1\120\3\45\34\uffff\5\45"+
        "\1\132\1\uffff\5\45\1\140\1\141\2\45\1\uffff\1\144\1\145\1\146\2"+
        "\45\2\uffff\1\45\1\152\3\uffff\2\45\1\155\1\uffff\1\156\1\45\2\uffff"+
        "\1\160\1\uffff";
    static final String DFA12_eofS =
        "\161\uffff";
    static final String DFA12_minS =
        "\1\0\1\162\1\141\1\151\1\146\2\157\1\154\4\uffff\1\76\6\uffff\1"+
        "\75\1\uffff\1\75\6\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\157\1"+
        "\uffff\1\151\1\164\1\141\1\164\1\60\1\157\1\151\1\163\34\uffff\1"+
        "\147\1\156\1\145\1\151\1\162\1\60\1\uffff\1\154\1\144\1\145\1\162"+
        "\1\157\2\60\1\156\1\164\1\uffff\3\60\1\141\1\143\2\uffff\1\147\1"+
        "\60\3\uffff\1\155\1\157\1\60\1\uffff\1\60\1\154\2\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\162\1\141\1\164\1\156\2\157\1\154\4\uffff\1\76\6\uffff"+
        "\1\75\1\uffff\1\75\6\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1"+
        "\157\1\uffff\1\151\1\164\1\162\1\164\1\172\1\157\1\151\1\163\34"+
        "\uffff\1\164\1\156\1\145\1\151\1\162\1\172\1\uffff\1\154\1\144\1"+
        "\145\1\162\1\157\2\172\1\156\1\164\1\uffff\3\172\1\141\1\143\2\uffff"+
        "\1\147\1\172\3\uffff\1\155\1\157\1\172\1\uffff\1\172\1\154\2\uffff"+
        "\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\10\uffff\1\14\1\15\1\16\1\17\1\uffff\1\21\1\22\1\23\1\24\1\26\1"+
        "\27\1\uffff\1\31\1\uffff\1\33\1\34\1\35\1\36\1\37\1\41\1\uffff\1"+
        "\43\1\44\3\uffff\1\50\1\51\1\uffff\1\43\10\uffff\1\14\1\15\1\16"+
        "\1\17\1\20\1\25\1\21\1\22\1\23\1\24\1\26\1\27\1\42\1\30\1\31\1\40"+
        "\1\32\1\33\1\34\1\35\1\36\1\37\1\41\1\44\1\45\1\46\1\47\1\50\6\uffff"+
        "\1\12\11\uffff\1\5\5\uffff\1\2\1\4\2\uffff\1\7\1\10\1\13\3\uffff"+
        "\1\11\2\uffff\1\6\1\1\1\uffff\1\3";
    static final String DFA12_specialS =
        "\1\1\36\uffff\1\2\1\0\120\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\23\1\37\4\43\1\40\1\27\1"+
            "\30\1\20\1\17\1\31\1\14\1\26\1\41\12\36\1\16\1\15\1\32\1\25"+
            "\1\33\1\22\1\24\32\35\1\12\1\43\1\13\1\34\1\35\1\43\1\35\1\5"+
            "\2\35\1\7\3\35\1\4\3\35\1\2\2\35\1\1\2\35\1\3\2\35\1\6\4\35"+
            "\1\10\1\21\1\11\uff82\43",
            "\1\44",
            "\1\46",
            "\1\47\12\uffff\1\50",
            "\1\52\7\uffff\1\51",
            "\1\53",
            "\1\54",
            "\1\55",
            "",
            "",
            "",
            "",
            "\1\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\72",
            "",
            "\1\75",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\0\106",
            "\0\106",
            "\1\107\4\uffff\1\110",
            "",
            "",
            "\1\112",
            "",
            "\1\113",
            "\1\114",
            "\1\116\20\uffff\1\115",
            "\1\117",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\121",
            "\1\122",
            "\1\123",
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
            "\1\124\14\uffff\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\142",
            "\1\143",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\147",
            "\1\150",
            "",
            "",
            "\1\151",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "\1\153",
            "\1\154",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\157",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
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
            return "1:1: Tokens : ( T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_LCURLY | RULE_RCURLY | RULE_LSQUARE | RULE_RSQUARE | RULE_ARROW | RULE_SEMICOLON | RULE_COLON | RULE_PLUS | RULE_TIMES | RULE_MINUS | RULE_VERT | RULE_QUESTION_MARK | RULE_BANG | RULE_AT | RULE_ASSIGN | RULE_DOT | RULE_LPAREN | RULE_RPAREN | RULE_COMMA | RULE_LESS | RULE_EQUAL | RULE_GREATER | RULE_NOT_EQUAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_32 = input.LA(1);

                        s = -1;
                        if ( ((LA12_32>='\u0000' && LA12_32<='\uFFFF')) ) {s = 70;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='p') ) {s = 1;}

                        else if ( (LA12_0=='m') ) {s = 2;}

                        else if ( (LA12_0=='s') ) {s = 3;}

                        else if ( (LA12_0=='i') ) {s = 4;}

                        else if ( (LA12_0=='b') ) {s = 5;}

                        else if ( (LA12_0=='v') ) {s = 6;}

                        else if ( (LA12_0=='e') ) {s = 7;}

                        else if ( (LA12_0=='{') ) {s = 8;}

                        else if ( (LA12_0=='}') ) {s = 9;}

                        else if ( (LA12_0=='[') ) {s = 10;}

                        else if ( (LA12_0==']') ) {s = 11;}

                        else if ( (LA12_0=='-') ) {s = 12;}

                        else if ( (LA12_0==';') ) {s = 13;}

                        else if ( (LA12_0==':') ) {s = 14;}

                        else if ( (LA12_0=='+') ) {s = 15;}

                        else if ( (LA12_0=='*') ) {s = 16;}

                        else if ( (LA12_0=='|') ) {s = 17;}

                        else if ( (LA12_0=='?') ) {s = 18;}

                        else if ( (LA12_0=='!') ) {s = 19;}

                        else if ( (LA12_0=='@') ) {s = 20;}

                        else if ( (LA12_0=='=') ) {s = 21;}

                        else if ( (LA12_0=='.') ) {s = 22;}

                        else if ( (LA12_0=='(') ) {s = 23;}

                        else if ( (LA12_0==')') ) {s = 24;}

                        else if ( (LA12_0==',') ) {s = 25;}

                        else if ( (LA12_0=='<') ) {s = 26;}

                        else if ( (LA12_0=='>') ) {s = 27;}

                        else if ( (LA12_0=='^') ) {s = 28;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='a'||(LA12_0>='c' && LA12_0<='d')||(LA12_0>='f' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='l')||(LA12_0>='n' && LA12_0<='o')||(LA12_0>='q' && LA12_0<='r')||(LA12_0>='t' && LA12_0<='u')||(LA12_0>='w' && LA12_0<='z')) ) {s = 29;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 30;}

                        else if ( (LA12_0=='\"') ) {s = 31;}

                        else if ( (LA12_0=='\'') ) {s = 32;}

                        else if ( (LA12_0=='/') ) {s = 33;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 34;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='&')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_31 = input.LA(1);

                        s = -1;
                        if ( ((LA12_31>='\u0000' && LA12_31<='\uFFFF')) ) {s = 70;}

                        else s = 35;

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