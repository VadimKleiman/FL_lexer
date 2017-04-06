package ru.spbau.mit;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.util.Arrays.asList;

public class Main {

    public static void main(final String[] args) {
        if (args.length != 1)
        {
            System.err.println("Specify a file");
            return;
        }
        try {
            LLexer lex = new LLexer(new ANTLRFileStream(args[0]));
            LParser parser = new LParser(new CommonTokenStream(lex));
            TreeViewer view = new TreeViewer(asList(LParser.ruleNames), parser.programm());
            view.open();
        } catch (IOException e) {
            throw new RuntimeException("Oops!", e);
        }
    }
}
