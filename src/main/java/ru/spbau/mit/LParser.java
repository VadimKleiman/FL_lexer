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
		RULE_programm = 0, RULE_statement_t = 1, RULE_statement = 2, RULE_statementMode = 3, 
		RULE_assignStatement = 4, RULE_selectionStatement = 5, RULE_exprStatement = 6, 
		RULE_writeStatement = 7, RULE_readStatement = 8;
	public static final String[] ruleNames = {
		"programm", "statement_t", "statement", "statementMode", "assignStatement", 
		"selectionStatement", "exprStatement", "writeStatement", "readStatement"
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
		public Statement_tContext statement_t() {
			return getRuleContext(Statement_tContext.class,0);
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
			setState(18);
			statement_t();
			setState(19);
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

	public static class Statement_tContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(LParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(LParser.SEMICOLON, i);
		}
		public Statement_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterStatement_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitStatement_t(this);
		}
	}

	public final Statement_tContext statement_t() throws RecognitionException {
		Statement_tContext _localctx = new Statement_tContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			statement();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(22);
				match(SEMICOLON);
				setState(23);
				statement();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(PASS);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				assignStatement();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				writeStatement();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				readStatement();
				}
				break;
			case IF:
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(33);
				selectionStatement();
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

	public static class StatementModeContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode BEGIN() { return getToken(LParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(LParser.END, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(LParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(LParser.SEMICOLON, i);
		}
		public StatementModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementMode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterStatementMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitStatementMode(this);
		}
	}

	public final StatementModeContext statementMode() throws RecognitionException {
		StatementModeContext _localctx = new StatementModeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statementMode);
		int _la;
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PASS:
			case IF:
			case WHILE:
			case READ:
			case WRITE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				statement();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(BEGIN);
				setState(38);
				statement();
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON) {
					{
					{
					setState(39);
					match(SEMICOLON);
					setState(40);
					statement();
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46);
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
		enterRule(_localctx, 8, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(ID);
			setState(51);
			match(ASSIGN);
			setState(52);
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
		public List<StatementModeContext> statementMode() {
			return getRuleContexts(StatementModeContext.class);
		}
		public StatementModeContext statementMode(int i) {
			return getRuleContext(StatementModeContext.class,i);
		}
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
		enterRule(_localctx, 10, RULE_selectionStatement);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(WHILE);
				setState(55);
				match(LEFT);
				setState(56);
				exprStatement(0);
				setState(57);
				match(RIGHT);
				setState(58);
				match(DO);
				setState(59);
				statementMode();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(IF);
				setState(62);
				match(LEFT);
				setState(63);
				exprStatement(0);
				setState(64);
				match(RIGHT);
				setState(65);
				match(THEN);
				setState(66);
				statementMode();
				setState(67);
				match(ELSE);
				setState(68);
				statementMode();
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_exprStatement, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
				{
				setState(73);
				match(LEFT);
				setState(74);
				exprStatement(0);
				setState(75);
				match(RIGHT);
				}
				break;
			case BOOL:
				{
				setState(77);
				match(BOOL);
				}
				break;
			case VALUE:
				{
				setState(78);
				match(VALUE);
				}
				break;
			case ID:
				{
				setState(79);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprStatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprStatement);
						setState(82);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(83);
						match(POW);
						setState(84);
						exprStatement(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprStatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprStatement);
						setState(85);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(86);
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
						setState(87);
						exprStatement(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprStatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprStatement);
						setState(88);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(89);
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
						setState(90);
						exprStatement(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprStatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprStatement);
						setState(91);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(92);
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
						setState(93);
						exprStatement(8);
						}
						break;
					case 5:
						{
						_localctx = new ExprStatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprStatement);
						setState(94);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(95);
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
						setState(96);
						exprStatement(7);
						}
						break;
					case 6:
						{
						_localctx = new ExprStatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprStatement);
						setState(97);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(98);
						match(AND);
						setState(99);
						exprStatement(6);
						}
						break;
					case 7:
						{
						_localctx = new ExprStatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprStatement);
						setState(100);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(101);
						match(OR);
						setState(102);
						exprStatement(5);
						}
						break;
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 14, RULE_writeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(WRITE);
			setState(109);
			match(LEFT);
			setState(110);
			exprStatement(0);
			setState(111);
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
		enterRule(_localctx, 16, RULE_readStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(READ);
			setState(114);
			match(LEFT);
			setState(115);
			match(ID);
			setState(116);
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
		case 6:
			return exprStatement_sempred((ExprStatementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprStatement_sempred(ExprStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%y\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\4\3\4\3\4\3\4\3\4\5\4%\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\7\5,\n\5\f\5\16\5/\13\5\3\5\3\5\5\5\63\n\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7I\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bS\n\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"j\n\b\f\b\16\bm\13\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\2\3\16"+
		"\13\2\4\6\b\n\f\16\20\22\2\6\3\2\25\27\3\2\23\24\3\2\32\35\4\2\31\31\36"+
		"\36\2\u0081\2\24\3\2\2\2\4\27\3\2\2\2\6$\3\2\2\2\b\62\3\2\2\2\n\64\3\2"+
		"\2\2\fH\3\2\2\2\16R\3\2\2\2\20n\3\2\2\2\22s\3\2\2\2\24\25\5\4\3\2\25\26"+
		"\7\2\2\3\26\3\3\2\2\2\27\34\5\6\4\2\30\31\7#\2\2\31\33\5\6\4\2\32\30\3"+
		"\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\5\3\2\2\2\36\34\3"+
		"\2\2\2\37%\7\3\2\2 %\5\n\6\2!%\5\20\t\2\"%\5\22\n\2#%\5\f\7\2$\37\3\2"+
		"\2\2$ \3\2\2\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%\7\3\2\2\2&\63\5\6\4\2\'"+
		"(\7\13\2\2(-\5\6\4\2)*\7#\2\2*,\5\6\4\2+)\3\2\2\2,/\3\2\2\2-+\3\2\2\2"+
		"-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7\f\2\2\61\63\3\2\2\2\62&\3\2\2"+
		"\2\62\'\3\2\2\2\63\t\3\2\2\2\64\65\7\16\2\2\65\66\7\22\2\2\66\67\5\16"+
		"\b\2\67\13\3\2\2\289\7\7\2\29:\7!\2\2:;\5\16\b\2;<\7\"\2\2<=\7\b\2\2="+
		">\5\b\5\2>I\3\2\2\2?@\7\4\2\2@A\7!\2\2AB\5\16\b\2BC\7\"\2\2CD\7\5\2\2"+
		"DE\5\b\5\2EF\7\6\2\2FG\5\b\5\2GI\3\2\2\2H8\3\2\2\2H?\3\2\2\2I\r\3\2\2"+
		"\2JK\b\b\1\2KL\7!\2\2LM\5\16\b\2MN\7\"\2\2NS\3\2\2\2OS\7\r\2\2PS\7\17"+
		"\2\2QS\7\16\2\2RJ\3\2\2\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2Sk\3\2\2\2TU\f"+
		"\f\2\2UV\7\30\2\2Vj\5\16\b\fWX\f\13\2\2XY\t\2\2\2Yj\5\16\b\fZ[\f\n\2\2"+
		"[\\\t\3\2\2\\j\5\16\b\13]^\f\t\2\2^_\t\4\2\2_j\5\16\b\n`a\f\b\2\2ab\t"+
		"\5\2\2bj\5\16\b\tcd\f\7\2\2de\7 \2\2ej\5\16\b\bfg\f\6\2\2gh\7\37\2\2h"+
		"j\5\16\b\7iT\3\2\2\2iW\3\2\2\2iZ\3\2\2\2i]\3\2\2\2i`\3\2\2\2ic\3\2\2\2"+
		"if\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\17\3\2\2\2mk\3\2\2\2no\7\n\2"+
		"\2op\7!\2\2pq\5\16\b\2qr\7\"\2\2r\21\3\2\2\2st\7\t\2\2tu\7!\2\2uv\7\16"+
		"\2\2vw\7\"\2\2w\23\3\2\2\2\n\34$-\62HRik";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}