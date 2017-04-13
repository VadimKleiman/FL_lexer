package ru.spbau.mit;

import org.antlr.v4.gui.TreeTextProvider;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.IOException;

class Labels implements TreeTextProvider {
    public String getText(Tree node) {
        if (node instanceof ErrorNode) {
            return node.toString();
        }
        if (node instanceof TerminalNode) {
            Token nodeSymbol = ((TerminalNode) node).getSymbol();
            String name = LLexer.VOCABULARY.getSymbolicName(nodeSymbol.getType());
            int type = nodeSymbol.getType();
            if (type == LLexer.VALUE || type == LLexer.ID || type == LLexer.BOOL) {
                StringBuilder out = new StringBuilder();
                out.append(name).append("[").append(nodeSymbol.getText()).append(", ").append(nodeSymbol.getLine()).append(", ").append(nodeSymbol.getStartIndex()).append(", ").append(nodeSymbol.getStartIndex()).append("]");
                return out.toString();
            } else if (type == LLexer.EOF) {
                return "EOF";
            }
            StringBuilder out = new StringBuilder();
            out.append(name).append("[").append(nodeSymbol.getLine()).append(", ").append(nodeSymbol.getStartIndex()).append(", ").append(nodeSymbol.getStartIndex()).append("]");
            return out.toString();
        }
        if (node instanceof RuleContext) {
            int ruleIndex = ((RuleContext) node).getRuleContext().getRuleIndex();
            String ruleName = LParser.ruleNames[ruleIndex];
            int altNumber = ((RuleContext) node).getAltNumber();
            if (altNumber != ATN.INVALID_ALT_NUMBER) {
                return ruleName + ":" + altNumber;
            }
            return ruleName;
        }
        Object payload = node.getPayload();
        if (payload instanceof Token) {
            return ((Token) payload).getText();
        }
        return node.getPayload().toString();
    }
}
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
            ParseTree tree = parser.programm();
            TreeViewer view = new TreeViewer(null, null);
            view.setTreeTextProvider(new Labels());
            view.setTree(tree);
            view.open();
        } catch (IOException e) {
            throw new RuntimeException("Oops!", e);
        }
    }
}
