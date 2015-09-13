// $ANTLR 3.5.2 src/main/java/com/nishtahir/CSV.g 2015-09-13 23:59:47

    package com.nishtahir;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CSVLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__7=7;
	public static final int LINE_BREAK=4;
	public static final int STRING=5;
	public static final int TEXT=6;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public CSVLexer() {} 
	public CSVLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CSVLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "src/main/java/com/nishtahir/CSV.g"; }

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/java/com/nishtahir/CSV.g:6:6: ( ',' )
			// src/main/java/com/nishtahir/CSV.g:6:8: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__7"

	// $ANTLR start "LINE_BREAK"
	public final void mLINE_BREAK() throws RecognitionException {
		try {
			int _type = LINE_BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/java/com/nishtahir/CSV.g:33:5: ( ( '\\r' )? '\\n' | '\\r' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='\r') ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='\n') ) {
					alt2=1;
				}

				else {
					alt2=2;
				}

			}
			else if ( (LA2_0=='\n') ) {
				alt2=1;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// src/main/java/com/nishtahir/CSV.g:33:8: ( '\\r' )? '\\n'
					{
					// src/main/java/com/nishtahir/CSV.g:33:8: ( '\\r' )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0=='\r') ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// src/main/java/com/nishtahir/CSV.g:33:8: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					}
					break;
				case 2 :
					// src/main/java/com/nishtahir/CSV.g:34:8: '\\r'
					{
					match('\r'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_BREAK"

	// $ANTLR start "TEXT"
	public final void mTEXT() throws RecognitionException {
		try {
			int _type = TEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/java/com/nishtahir/CSV.g:38:5: ( (~ ( ',' | '\\r' | '\\n' | '\"' ) )+ )
			// src/main/java/com/nishtahir/CSV.g:38:8: (~ ( ',' | '\\r' | '\\n' | '\"' ) )+
			{
			// src/main/java/com/nishtahir/CSV.g:38:8: (~ ( ',' | '\\r' | '\\n' | '\"' ) )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '!')||(LA3_0 >= '#' && LA3_0 <= '+')||(LA3_0 >= '-' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// src/main/java/com/nishtahir/CSV.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEXT"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/java/com/nishtahir/CSV.g:42:5: ( '\"' ( '\"\"' |~ '\"' )* '\"' )
			// src/main/java/com/nishtahir/CSV.g:42:8: '\"' ( '\"\"' |~ '\"' )* '\"'
			{
			match('\"'); 
			// src/main/java/com/nishtahir/CSV.g:42:12: ( '\"\"' |~ '\"' )*
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\"') ) {
					int LA4_1 = input.LA(2);
					if ( (LA4_1=='\"') ) {
						alt4=1;
					}

				}
				else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '\uFFFF')) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// src/main/java/com/nishtahir/CSV.g:42:13: '\"\"'
					{
					match("\"\""); 

					}
					break;
				case 2 :
					// src/main/java/com/nishtahir/CSV.g:42:20: ~ '\"'
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	@Override
	public void mTokens() throws RecognitionException {
		// src/main/java/com/nishtahir/CSV.g:1:8: ( T__7 | LINE_BREAK | TEXT | STRING )
		int alt5=4;
		int LA5_0 = input.LA(1);
		if ( (LA5_0==',') ) {
			alt5=1;
		}
		else if ( (LA5_0=='\n'||LA5_0=='\r') ) {
			alt5=2;
		}
		else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '+')||(LA5_0 >= '-' && LA5_0 <= '\uFFFF')) ) {
			alt5=3;
		}
		else if ( (LA5_0=='\"') ) {
			alt5=4;
		}

		else {
			NoViableAltException nvae =
				new NoViableAltException("", 5, 0, input);
			throw nvae;
		}

		switch (alt5) {
			case 1 :
				// src/main/java/com/nishtahir/CSV.g:1:10: T__7
				{
				mT__7(); 

				}
				break;
			case 2 :
				// src/main/java/com/nishtahir/CSV.g:1:15: LINE_BREAK
				{
				mLINE_BREAK(); 

				}
				break;
			case 3 :
				// src/main/java/com/nishtahir/CSV.g:1:26: TEXT
				{
				mTEXT(); 

				}
				break;
			case 4 :
				// src/main/java/com/nishtahir/CSV.g:1:31: STRING
				{
				mSTRING(); 

				}
				break;

		}
	}



}
