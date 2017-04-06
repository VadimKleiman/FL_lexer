// Generated from L.g4 by ANTLR 4.7
package ru.spbau.mit;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PASS=1, IF=2, THEN=3, ELSE=4, WHILE=5, DO=6, READ=7, WRITE=8, BEGIN=9, 
		END=10, BOOL=11, ID=12, VALUE=13, ML_COMMENT=14, COMMENT=15, ASSIGN=16, 
		ADD=17, SUB=18, MUL=19, DIV=20, MOD=21, POW=22, EQ=23, L=24, G=25, LE=26, 
		GE=27, NE=28, OR=29, AND=30, LEFT=31, RIGHT=32, SEMICOLON=33, NL=34, OTHER=35;
	public static final int
		RULE_programm = 0, RULE_statement = 1, RULE_assignStatement = 2, RULE_selectionStatement = 3, 
		RULE_exprStatement = 4, RULE_writeStatement = 5, RULE_readStatement = 6;
	public static final String[] ruleNames = {
		"programm", "statement", "assignStatement", "selectionStatement", "exprStatement", 
		"writeStatement", "readStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'skip'", "'if'", "'then'", "'else'", "'while'", "'do'", "'read'", 
		"'write'", "'begin'", "'end'", null, null, null, null, null, "':='", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'**'", "'=='", "'<'", "'>'", "'<='", "'>='", 
		"'!='", "'||'", "'&&'", "'('", "')'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PASS", "IF", "THEN", "ELSE", "WHILE", "DO", "READ", "WRITE", "BEGIN", 
		"END", "BOOL", "ID", "VALUE", "ML_COMMENT", "COMMENT", "ASSIGN", "ADD", 
		"SUB", "MUL", "DIV", "MOD", "POW", "EQ", "L", "G", "LE", "GE", "NE", "OR", 
		"AND", "LEFT", "RIGHT", "SEMICOLON", "NL", "OTHER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "L.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgrammContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LParser.EOF, 0); }
		public ProgrammContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterProgramm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitProgramm(this);
		}
	}

	public final ProgrammContext programm() throws RecognitionException {
		ProgrammContext _localctx = new ProgrammContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			statement(0);
			setState(15);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(LParser.PASS, 0); }
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public WriteStatementContext writeStatement() {
			return getRuleContext(WriteStatementContext.class,0);
		}
		public ReadStatementContext readStatement() {
			return getRuleContext(ReadStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(LParser.SEMICOLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		return statement(0);
	}

	private StatementContext statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementContext _localctx = new StatementContext(_ctx, _parentState);
		StatementContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_statement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PASS:
				{
				setState(18);
				match(PASS);
				}
				break;
			case ID:
				{
				setState(19);
				assignStatement();
				}
				break;
			case WRITE:
				{
				setState(20);
				writeStatement();
				}
				break;
			case READ:
				{
				setState(21);
				readStatement();
				}
				break;
			case IF:
			case WHILE:
				{
				setState(22);
				selectionStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(30);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statement);
					setState(25);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(26);
					match(SEMICOLON);
					setState(27);
					statement(5);
					}
					} 
				}
				setState(32);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LParser.ASSIGN, 0); }
		public ExprStatementContext exprStatement() {
			return getRuleContext(ExprStatementContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitAssignStatement(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(ID);
			setState(34);
			match(ASSIGN);
			setState(35);
			exprStatement(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LParser.WHILE, 0); }
		public TerminalNode LEFT() { return getToken(LParser.LEFT, 0); }
		public ExprStatementContext exprStatement() {
			return getRuleContext(ExprStatementContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(LParser.RIGHT, 0); }
		public TerminalNode DO() { return getToken(LParser.DO, 0); }
		public TerminalNode BEGIN() { return getToken(LParser.BEGIN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode END() { return getToken(LParser.END, 0); }
		public TerminalNode IF() { return getToken(LParser.IF, 0); }
		public TerminalNode THEN() { return getToken(LParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(LParser.ELSE, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitSelectionStatement(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selectionStatement);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(WHILE);
				setState(38);
				match(LEFT);
				setState(39);
				exprStatement(0);
				setState(40);
				match(RIGHT);
				setState(41);
				match(DO);
				setState(42);
				match(BEGIN);
				setState(43);
				statement(0);
				setState(44);
				match(END);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(IF);
				setState(47);
				match(LEFT);
				setState(48);
				exprStatement(0);
				setState(49);
				match(RIGHT);
				setState(50);
				match(THEN);
				setState(51);
				statement(0);
				setState(52);
				match(ELSE);
				setState(53);
				match(BEGIN);
				setState(54);
				statement(0);
				setState(55);
				match(END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprStatementContext extends ParserRuleContext {
		public Token op;
		public TerminalNode LEFT() { return getToken(LParser.LEFT, 0); }
		public List<ExprStatementContext> exprStatement() {
			return getRuleContexts(ExprStatementContext.class);
		}
		public ExprStatementContext exprStatement(int i) {
			return getRuleContext(ExprStatementContext.class,i);
		}
		public TerminalNode RIGHT() { return getToken(LParser.RIGHT, 0); }
		public TerminalNode BOOL() { return getToken(LParser.BOOL, 0); }
		public TerminalNode VALUE() { return getToken(LParser.VALUE, 0); }
		public TerminalNode ID() { return getToken(LParser.ID, 0); }
		public TerminalNode POW() { return getToken(LParser.POW, 0); }
		public TerminalNode MUL() { return getToken(LParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(LParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(LParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(LParser.SUB, 0); }
		public TerminalNode G() { return getToken(LParser.G, 0); }
		public TerminalNode GE() { return getToken(LParser.GE, 0); }
		public TerminalNode L() { return getToken(LParser.L, 0); }
		public TerminalNode LE() { return getToken(LParser.LE, 0); }
		public TerminalNode EQ() { return getToken(LParser.EQ, 0); }
		public TerminalNode NE() { return getToken(LParser.NE, 0); }
		public TerminalNode AND() { return getToken(LParser.AND, 0); }
		public TerminalNode OR() { return getToken(LParser.OR, 0); }
		public ExprStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterExprStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitExprStatement(this);
		}
	}

	public final ExprStatementContext exprStatement() throws RecognitionException {
		return exprStatement(0);
	}

	private ExprStatementContext exprStatement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprStatementContext _localctx = new ExprStatementContext(_ctx, _parentState);
		ExprStatementContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_exprStatement, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
				{
				setState(60);
				match(LEFT);
				setState(61);
				exprStatement(0);
				setState(62);
				match(RIGHT);
				}
				break;
			case BOOL:
				{
				setState(64);
				match(BOOL);
				}
				break;
			case VALUE:
				{
				setState(65);
				match(VALUE);
				}
				break;
			case ID:
				{
				setState(66);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(90);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprStatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprStatement);
						setState(69);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(70);
						match(POW);
						setState(71);
						exprStatement(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprStatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprStatement);
						setState(72);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(73);
						((ExprStatementContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((ExprStatementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(74);
						exprStatement(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprStatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprStatement);
						setState(75);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(76);
						((ExprStatementContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprStatementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(77);
						exprStatement(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprStatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprStatement);
						setState(78);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(79);
						((ExprStatementContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L) | (1L << G) | (1L << LE) | (1L << GE))) != 0)) ) {
							((ExprStatementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(80);
						exprStatement(8);
						}
						break;
					case 5:
						{
						_localctx = new ExprStatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprStatement);
						setState(81);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(82);
						((ExprStatementContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NE) ) {
							((ExprStatementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(83);
						exprStatement(7);
						}
						break;
					case 6:
						{
						_localctx = new ExprStatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprStatement);
						setState(84);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(85);
						match(AND);
						setState(86);
						exprStatement(6);
						}
						break;
					case 7:
						{
						_localctx = new ExprStatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprStatement);
						setState(87);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(88);
						match(OR);
						setState(89);
						exprStatement(5);
						}
						break;
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class WriteStatementContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(LParser.WRITE, 0); }
		public TerminalNode LEFT() { return getToken(LParser.LEFT, 0); }
		public ExprStatementContext exprStatement() {
			return getRuleContext(ExprStatementContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(LParser.RIGHT, 0); }
		public WriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitWriteStatement(this);
		}
	}

	public final WriteStatementContext writeStatement() throws RecognitionException {
		WriteStatementContext _localctx = new WriteStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_writeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(WRITE);
			setState(96);
			match(LEFT);
			setState(97);
			exprStatement(0);
			setState(98);
			match(RIGHT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadStatementContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(LParser.READ, 0); }
		public TerminalNode LEFT() { return getToken(LParser.LEFT, 0); }
		public TerminalNode ID() { return getToken(LParser.ID, 0); }
		public TerminalNode RIGHT() { return getToken(LParser.RIGHT, 0); }
		public ReadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterReadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitReadStatement(this);
		}
	}

	public final ReadStatementContext readStatement() throws RecognitionException {
		ReadStatementContext _localctx = new ReadStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_readStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(READ);
			setState(101);
			match(LEFT);
			setState(102);
			match(ID);
			setState(103);
			match(RIGHT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return statement_sempred((StatementContext)_localctx, predIndex);
		case 4:
			return exprStatement_sempred((ExprStatementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean exprStatement_sempred(ExprStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%l\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\32\n\3\3\3\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5<\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6F\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6]\n\6\f\6\16\6`\13\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\2\4\4\n\t\2\4\6\b\n\f\16\2\6\3\2\25\27\3\2\23\24\3\2\32\35\4\2\31"+
		"\31\36\36\2t\2\20\3\2\2\2\4\31\3\2\2\2\6#\3\2\2\2\b;\3\2\2\2\nE\3\2\2"+
		"\2\fa\3\2\2\2\16f\3\2\2\2\20\21\5\4\3\2\21\22\7\2\2\3\22\3\3\2\2\2\23"+
		"\24\b\3\1\2\24\32\7\3\2\2\25\32\5\6\4\2\26\32\5\f\7\2\27\32\5\16\b\2\30"+
		"\32\5\b\5\2\31\23\3\2\2\2\31\25\3\2\2\2\31\26\3\2\2\2\31\27\3\2\2\2\31"+
		"\30\3\2\2\2\32 \3\2\2\2\33\34\f\6\2\2\34\35\7#\2\2\35\37\5\4\3\7\36\33"+
		"\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\5\3\2\2\2\" \3\2\2\2#$\7"+
		"\16\2\2$%\7\22\2\2%&\5\n\6\2&\7\3\2\2\2\'(\7\7\2\2()\7!\2\2)*\5\n\6\2"+
		"*+\7\"\2\2+,\7\b\2\2,-\7\13\2\2-.\5\4\3\2./\7\f\2\2/<\3\2\2\2\60\61\7"+
		"\4\2\2\61\62\7!\2\2\62\63\5\n\6\2\63\64\7\"\2\2\64\65\7\5\2\2\65\66\5"+
		"\4\3\2\66\67\7\6\2\2\678\7\13\2\289\5\4\3\29:\7\f\2\2:<\3\2\2\2;\'\3\2"+
		"\2\2;\60\3\2\2\2<\t\3\2\2\2=>\b\6\1\2>?\7!\2\2?@\5\n\6\2@A\7\"\2\2AF\3"+
		"\2\2\2BF\7\r\2\2CF\7\17\2\2DF\7\16\2\2E=\3\2\2\2EB\3\2\2\2EC\3\2\2\2E"+
		"D\3\2\2\2F^\3\2\2\2GH\f\f\2\2HI\7\30\2\2I]\5\n\6\fJK\f\13\2\2KL\t\2\2"+
		"\2L]\5\n\6\fMN\f\n\2\2NO\t\3\2\2O]\5\n\6\13PQ\f\t\2\2QR\t\4\2\2R]\5\n"+
		"\6\nST\f\b\2\2TU\t\5\2\2U]\5\n\6\tVW\f\7\2\2WX\7 \2\2X]\5\n\6\bYZ\f\6"+
		"\2\2Z[\7\37\2\2[]\5\n\6\7\\G\3\2\2\2\\J\3\2\2\2\\M\3\2\2\2\\P\3\2\2\2"+
		"\\S\3\2\2\2\\V\3\2\2\2\\Y\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\13\3"+
		"\2\2\2`^\3\2\2\2ab\7\n\2\2bc\7!\2\2cd\5\n\6\2de\7\"\2\2e\r\3\2\2\2fg\7"+
		"\t\2\2gh\7!\2\2hi\7\16\2\2ij\7\"\2\2j\17\3\2\2\2\b\31 ;E\\^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}