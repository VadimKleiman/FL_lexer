// Generated from L.g4 by ANTLR 4.7
package ru.spbau.mit;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PASS=1, IF=2, THEN=3, ELSE=4, WHILE=5, DO=6, READ=7, WRITE=8, BEGIN=9, 
		END=10, BOOL=11, ID=12, VALUE=13, ML_COMMENT=14, COMMENT=15, ASSIGN=16, 
		ADD=17, SUB=18, MUL=19, DIV=20, MOD=21, POW=22, EQ=23, L=24, G=25, LE=26, 
		GE=27, NE=28, OR=29, AND=30, LEFT=31, RIGHT=32, SEMICOLON=33, NL=34, OTHER=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PASS", "IF", "THEN", "ELSE", "WHILE", "DO", "READ", "WRITE", "BEGIN", 
		"END", "BOOL", "TRUE", "FALSE", "ID", "VALUE", "UNSIGNED_INT", "UNSIGNED_FLOAT", 
		"Exponent", "ML_COMMENT", "COMMENT", "ASSIGN", "ADD", "SUB", "MUL", "DIV", 
		"MOD", "POW", "EQ", "L", "G", "LE", "GE", "NE", "OR", "AND", "LEFT", "RIGHT", 
		"SEMICOLON", "NL", "OTHER"
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


	public LLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "L.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u0138\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u0086\n\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\7\17\u0095\n\17"+
		"\f\17\16\17\u0098\13\17\3\20\5\20\u009b\n\20\3\20\3\20\5\20\u009f\n\20"+
		"\3\20\5\20\u00a2\n\20\3\21\3\21\3\21\7\21\u00a7\n\21\f\21\16\21\u00aa"+
		"\13\21\5\21\u00ac\n\21\3\22\6\22\u00af\n\22\r\22\16\22\u00b0\3\22\3\22"+
		"\7\22\u00b5\n\22\f\22\16\22\u00b8\13\22\3\22\5\22\u00bb\n\22\3\22\3\22"+
		"\6\22\u00bf\n\22\r\22\16\22\u00c0\3\22\5\22\u00c4\n\22\3\22\6\22\u00c7"+
		"\n\22\r\22\16\22\u00c8\3\22\5\22\u00cc\n\22\3\23\3\23\5\23\u00d0\n\23"+
		"\3\23\6\23\u00d3\n\23\r\23\16\23\u00d4\3\24\3\24\3\24\3\24\7\24\u00db"+
		"\n\24\f\24\16\24\u00de\13\24\3\24\3\24\7\24\u00e2\n\24\f\24\16\24\u00e5"+
		"\13\24\3\24\7\24\u00e8\n\24\f\24\16\24\u00eb\13\24\5\24\u00ed\n\24\3\24"+
		"\7\24\u00f0\n\24\f\24\16\24\u00f3\13\24\3\24\7\24\u00f6\n\24\f\24\16\24"+
		"\u00f9\13\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\""+
		"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3)\3)\5\u00dc"+
		"\u00f1\u00f7\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\2\33\2\35\16\37\17!\2#\2%\2\'\20)\21+\22-\23/\24\61\25\63\26\65\27\67"+
		"\309\31;\32=\33?\34A\35C\36E\37G I!K\"M#O$Q%\3\2\t\5\2C\\aac|\6\2\62;"+
		"C\\aac|\4\2GGgg\4\2--//\4\2,,\61\61\5\2\f\f\17\17``\5\2\13\f\17\17\"\""+
		"\2\u014a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2"+
		"-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2"+
		"\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2"+
		"E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3"+
		"\2\2\2\3S\3\2\2\2\5X\3\2\2\2\7[\3\2\2\2\t`\3\2\2\2\13e\3\2\2\2\rk\3\2"+
		"\2\2\17n\3\2\2\2\21s\3\2\2\2\23y\3\2\2\2\25\177\3\2\2\2\27\u0085\3\2\2"+
		"\2\31\u0087\3\2\2\2\33\u008c\3\2\2\2\35\u0092\3\2\2\2\37\u00a1\3\2\2\2"+
		"!\u00ab\3\2\2\2#\u00cb\3\2\2\2%\u00cd\3\2\2\2\'\u00d6\3\2\2\2)\u00ff\3"+
		"\2\2\2+\u0106\3\2\2\2-\u0109\3\2\2\2/\u010b\3\2\2\2\61\u010d\3\2\2\2\63"+
		"\u010f\3\2\2\2\65\u0111\3\2\2\2\67\u0113\3\2\2\29\u0116\3\2\2\2;\u0119"+
		"\3\2\2\2=\u011b\3\2\2\2?\u011d\3\2\2\2A\u0120\3\2\2\2C\u0123\3\2\2\2E"+
		"\u0126\3\2\2\2G\u0129\3\2\2\2I\u012c\3\2\2\2K\u012e\3\2\2\2M\u0130\3\2"+
		"\2\2O\u0132\3\2\2\2Q\u0136\3\2\2\2ST\7u\2\2TU\7m\2\2UV\7k\2\2VW\7r\2\2"+
		"W\4\3\2\2\2XY\7k\2\2YZ\7h\2\2Z\6\3\2\2\2[\\\7v\2\2\\]\7j\2\2]^\7g\2\2"+
		"^_\7p\2\2_\b\3\2\2\2`a\7g\2\2ab\7n\2\2bc\7u\2\2cd\7g\2\2d\n\3\2\2\2ef"+
		"\7y\2\2fg\7j\2\2gh\7k\2\2hi\7n\2\2ij\7g\2\2j\f\3\2\2\2kl\7f\2\2lm\7q\2"+
		"\2m\16\3\2\2\2no\7t\2\2op\7g\2\2pq\7c\2\2qr\7f\2\2r\20\3\2\2\2st\7y\2"+
		"\2tu\7t\2\2uv\7k\2\2vw\7v\2\2wx\7g\2\2x\22\3\2\2\2yz\7d\2\2z{\7g\2\2{"+
		"|\7i\2\2|}\7k\2\2}~\7p\2\2~\24\3\2\2\2\177\u0080\7g\2\2\u0080\u0081\7"+
		"p\2\2\u0081\u0082\7f\2\2\u0082\26\3\2\2\2\u0083\u0086\5\31\r\2\u0084\u0086"+
		"\5\33\16\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\30\3\2\2\2\u0087"+
		"\u0088\7v\2\2\u0088\u0089\7t\2\2\u0089\u008a\7w\2\2\u008a\u008b\7g\2\2"+
		"\u008b\32\3\2\2\2\u008c\u008d\7h\2\2\u008d\u008e\7c\2\2\u008e\u008f\7"+
		"n\2\2\u008f\u0090\7u\2\2\u0090\u0091\7g\2\2\u0091\34\3\2\2\2\u0092\u0096"+
		"\t\2\2\2\u0093\u0095\t\3\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\36\3\2\2\2\u0098\u0096\3\2\2"+
		"\2\u0099\u009b\7/\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u00a2\5!\21\2\u009d\u009f\7/\2\2\u009e\u009d\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\5#\22\2\u00a1\u009a\3\2"+
		"\2\2\u00a1\u009e\3\2\2\2\u00a2 \3\2\2\2\u00a3\u00ac\7\62\2\2\u00a4\u00a8"+
		"\4\63;\2\u00a5\u00a7\4\62;\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00ab\u00a3\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ac\"\3\2\2\2\u00ad\u00af"+
		"\4\62;\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b6\7\60\2\2\u00b3\u00b5\4"+
		"\62;\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bb\5%"+
		"\23\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00cc\3\2\2\2\u00bc"+
		"\u00be\7\60\2\2\u00bd\u00bf\4\62;\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3"+
		"\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00c4\5%\23\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00cc\3\2"+
		"\2\2\u00c5\u00c7\4\62;\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\5%"+
		"\23\2\u00cb\u00ae\3\2\2\2\u00cb\u00bc\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cc"+
		"$\3\2\2\2\u00cd\u00cf\t\4\2\2\u00ce\u00d0\t\5\2\2\u00cf\u00ce\3\2\2\2"+
		"\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00d3\4\62;\2\u00d2\u00d1"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"&\3\2\2\2\u00d6\u00d7\7*\2\2\u00d7\u00d8\7,\2\2\u00d8\u00f1\3\2\2\2\u00d9"+
		"\u00db\7*\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00f0\5\'\24\2\u00e0\u00e2\7*\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00ed\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00e8\7,\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00ec\u00e3\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00f0\n\6\2\2\u00ef\u00dc\3\2\2\2\u00ef\u00ec\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f7\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f6\7,\2\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fa\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7,\2\2\u00fb\u00fc\7+\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\u00fe\b\24\2\2\u00fe(\3\2\2\2\u00ff\u0100\7\61\2\2\u0100"+
		"\u0101\7\61\2\2\u0101\u0102\3\2\2\2\u0102\u0103\t\7\2\2\u0103\u0104\3"+
		"\2\2\2\u0104\u0105\b\25\2\2\u0105*\3\2\2\2\u0106\u0107\7<\2\2\u0107\u0108"+
		"\7?\2\2\u0108,\3\2\2\2\u0109\u010a\7-\2\2\u010a.\3\2\2\2\u010b\u010c\7"+
		"/\2\2\u010c\60\3\2\2\2\u010d\u010e\7,\2\2\u010e\62\3\2\2\2\u010f\u0110"+
		"\7\61\2\2\u0110\64\3\2\2\2\u0111\u0112\7\'\2\2\u0112\66\3\2\2\2\u0113"+
		"\u0114\7,\2\2\u0114\u0115\7,\2\2\u01158\3\2\2\2\u0116\u0117\7?\2\2\u0117"+
		"\u0118\7?\2\2\u0118:\3\2\2\2\u0119\u011a\7>\2\2\u011a<\3\2\2\2\u011b\u011c"+
		"\7@\2\2\u011c>\3\2\2\2\u011d\u011e\7>\2\2\u011e\u011f\7?\2\2\u011f@\3"+
		"\2\2\2\u0120\u0121\7@\2\2\u0121\u0122\7?\2\2\u0122B\3\2\2\2\u0123\u0124"+
		"\7#\2\2\u0124\u0125\7?\2\2\u0125D\3\2\2\2\u0126\u0127\7~\2\2\u0127\u0128"+
		"\7~\2\2\u0128F\3\2\2\2\u0129\u012a\7(\2\2\u012a\u012b\7(\2\2\u012bH\3"+
		"\2\2\2\u012c\u012d\7*\2\2\u012dJ\3\2\2\2\u012e\u012f\7+\2\2\u012fL\3\2"+
		"\2\2\u0130\u0131\7=\2\2\u0131N\3\2\2\2\u0132\u0133\t\b\2\2\u0133\u0134"+
		"\3\2\2\2\u0134\u0135\b(\2\2\u0135P\3\2\2\2\u0136\u0137\13\2\2\2\u0137"+
		"R\3\2\2\2\32\2\u0085\u0096\u009a\u009e\u00a1\u00a8\u00ab\u00b0\u00b6\u00ba"+
		"\u00c0\u00c3\u00c8\u00cb\u00cf\u00d4\u00dc\u00e3\u00e9\u00ec\u00ef\u00f1"+
		"\u00f7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}