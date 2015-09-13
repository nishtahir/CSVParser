// $ANTLR 3.5.2 src/main/java/com/nishtahir/CSV.g 2015-09-13 23:59:47

    package com.nishtahir;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class CSVParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "LINE_BREAK", "STRING", "TEXT", 
		"','"
	};
	public static final int EOF=-1;
	public static final int T__7=7;
	public static final int LINE_BREAK=4;
	public static final int STRING=5;
	public static final int TEXT=6;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public CSVParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CSVParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return CSVParser.tokenNames; }
	@Override public String getGrammarFileName() { return "src/main/java/com/nishtahir/CSV.g"; }


	public static class file_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "file"
	// src/main/java/com/nishtahir/CSV.g:15:1: file : head ( row )+ EOF ;
	public final CSVParser.file_return file() throws RecognitionException {
		CSVParser.file_return retval = new CSVParser.file_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF3=null;
		ParserRuleReturnScope head1 =null;
		ParserRuleReturnScope row2 =null;

		Object EOF3_tree=null;

		try {
			// src/main/java/com/nishtahir/CSV.g:16:5: ( head ( row )+ EOF )
			// src/main/java/com/nishtahir/CSV.g:16:8: head ( row )+ EOF
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_head_in_file42);
			head1=head();
			state._fsp--;

			adaptor.addChild(root_0, head1.getTree());

			// src/main/java/com/nishtahir/CSV.g:16:13: ( row )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= STRING && LA1_0 <= TEXT)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src/main/java/com/nishtahir/CSV.g:16:13: row
					{
					pushFollow(FOLLOW_row_in_file44);
					row2=row();
					state._fsp--;

					adaptor.addChild(root_0, row2.getTree());

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_file47); 
			EOF3_tree = (Object)adaptor.create(EOF3);
			adaptor.addChild(root_0, EOF3_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "file"


	public static class head_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "head"
	// src/main/java/com/nishtahir/CSV.g:19:1: head : row ;
	public final CSVParser.head_return head() throws RecognitionException {
		CSVParser.head_return retval = new CSVParser.head_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope row4 =null;


		try {
			// src/main/java/com/nishtahir/CSV.g:20:5: ( row )
			// src/main/java/com/nishtahir/CSV.g:20:7: row
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_row_in_head64);
			row4=row();
			state._fsp--;

			adaptor.addChild(root_0, row4.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "head"


	public static class row_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "row"
	// src/main/java/com/nishtahir/CSV.g:23:1: row : field ( ',' field )* ( LINE_BREAK | EOF ) ;
	public final CSVParser.row_return row() throws RecognitionException {
		CSVParser.row_return retval = new CSVParser.row_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal6=null;
		Token set8=null;
		ParserRuleReturnScope field5 =null;
		ParserRuleReturnScope field7 =null;

		Object char_literal6_tree=null;
		Object set8_tree=null;

		try {
			// src/main/java/com/nishtahir/CSV.g:24:5: ( field ( ',' field )* ( LINE_BREAK | EOF ) )
			// src/main/java/com/nishtahir/CSV.g:24:8: field ( ',' field )* ( LINE_BREAK | EOF )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_field_in_row82);
			field5=field();
			state._fsp--;

			adaptor.addChild(root_0, field5.getTree());

			// src/main/java/com/nishtahir/CSV.g:24:14: ( ',' field )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==7) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// src/main/java/com/nishtahir/CSV.g:24:15: ',' field
					{
					char_literal6=(Token)match(input,7,FOLLOW_7_in_row85); 
					char_literal6_tree = (Object)adaptor.create(char_literal6);
					adaptor.addChild(root_0, char_literal6_tree);

					pushFollow(FOLLOW_field_in_row87);
					field7=field();
					state._fsp--;

					adaptor.addChild(root_0, field7.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			set8=input.LT(1);
			if ( input.LA(1)==EOF||input.LA(1)==LINE_BREAK ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set8));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "row"


	public static class field_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "field"
	// src/main/java/com/nishtahir/CSV.g:27:1: field : ( TEXT | STRING );
	public final CSVParser.field_return field() throws RecognitionException {
		CSVParser.field_return retval = new CSVParser.field_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set9=null;

		Object set9_tree=null;

		try {
			// src/main/java/com/nishtahir/CSV.g:28:5: ( TEXT | STRING )
			// src/main/java/com/nishtahir/CSV.g:
			{
			root_0 = (Object)adaptor.nil();


			set9=input.LT(1);
			if ( (input.LA(1) >= STRING && input.LA(1) <= TEXT) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set9));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "field"

	// Delegated rules



	public static final BitSet FOLLOW_head_in_file42 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_row_in_file44 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_EOF_in_file47 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_row_in_head64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_field_in_row82 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_7_in_row85 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_field_in_row87 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_set_in_row91 = new BitSet(new long[]{0x0000000000000002L});
}
