package com.nishtahir;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

import java.io.IOException;

public class App{
	public static void main(String[] args) throws IOException, RecognitionException{
		CharStream charStream = new ANTLRFileStream("test.csv");
		CSVLexer lexer = new CSVLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		CSVParser parser  = new CSVParser(tokenStream);
		
		CommonTree tree = (CommonTree) parser.file().getTree();
		DOTTreeGenerator gen = new DOTTreeGenerator();
		StringTemplate st = gen.toDOT(tree);
		System.out.println(st);
	}
}
