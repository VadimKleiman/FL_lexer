package ru.spbau.mit;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ParserTest {
    @Test
    public void parserTest() throws IOException {
        LLexer lex = new LLexer(new ANTLRFileStream("src/test/resources/false"));
        LParser parser = new LParser(new CommonTokenStream(lex));
        parser.programm();
        System.out.print(parser.getNumberOfSyntaxErrors());
        assertEquals(parser.getNumberOfSyntaxErrors(), 1);
        lex = new LLexer(new ANTLRFileStream("src/test/resources/true"));
        parser = new LParser(new CommonTokenStream(lex));
        parser.programm();
        System.out.print(parser.getNumberOfSyntaxErrors());
        assertEquals(parser.getNumberOfSyntaxErrors(), 0);
    }

}