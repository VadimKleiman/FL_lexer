package ru.spbau.mit;

import org.abego.treelayout.TreeForTreeLayout;
import org.antlr.v4.gui.TreeTextProvider;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import javax.naming.LinkLoopException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
                return name + "[" + nodeSymbol.getText() + ", " + nodeSymbol.getLine() + ", " + nodeSymbol.getStartIndex() + ", " + nodeSymbol.getStartIndex() + "]";
            } else if (type == LLexer.EOF) {
                return "EOF";
            }
            return name + "[" + nodeSymbol.getLine() + ", " + nodeSymbol.getStartIndex() + ", " + nodeSymbol.getStartIndex() + "]";
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

class FilterTree implements TreeForTreeLayout<Tree> {
    private final Tree root;
    private final Predicate<Tree> filter;

    private List<Tree> getFilterList(Tree node) {
        return IntStream.range(0, node.getChildCount())
                .mapToObj(node::getChild)
                .filter(filter)
                .collect(Collectors.toList());
    }

    public FilterTree(Tree node, Predicate<Tree> filter) {
        this.root = node;
        this.filter = filter;
    }

    @Override
    public Tree getRoot() {
        return root;
    }

    @Override
    public boolean isLeaf(Tree tree) {
        return tree == null || tree.getChildCount() == 0;
    }

    @Override
    public boolean isChildOfParent(Tree tree, Tree treeNode1) {
        return tree.getParent() == treeNode1;
    }

    @Override
    public Iterable<Tree> getChildren(Tree tree) {
        return getFilterList(tree);
    }

    @Override
    public Iterable<Tree> getChildrenReverse(Tree tree) {
        List<Tree> children = getFilterList(tree);
        Collections.reverse(children);
        return children;
    }

    @Override
    public Tree getFirstChild(Tree tree) {
        List<Tree> children = getFilterList(tree);
        return children.size() > 0 ? children.get(0) : null;
    }

    @Override
    public Tree getLastChild(Tree tree) {
        List<Tree> children = getFilterList(tree);
        return children.size() > 0 ? children.get(children.size() - 1) : null;
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
            final TreeViewer viewer = new TreeViewer(null, null) {
                @Override
                public TreeForTreeLayout<Tree> getTreeLayoutAdaptor(final Tree root) {
                    return new FilterTree(root, node -> {
                        if (node instanceof TerminalNode) {
                            final int type = ((TerminalNode) node).getSymbol().getType();
                            return LLexer.PASS == type ||
                                    LLexer.BOOL == type
                                    || LLexer.VALUE == type
                                    || LLexer.ID == type
                                    || (LLexer.ADD <= type && type <= LLexer.AND);
                        }
                        return true;
                    });
                }
            };
            viewer.setTreeTextProvider(new Labels());
            viewer.setTree(tree);
            viewer.open();
        } catch (IOException e) {
            throw new RuntimeException("Oops!", e);
        }
    }
}
