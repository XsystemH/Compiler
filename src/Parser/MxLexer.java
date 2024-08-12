// Generated from C:/Users/13199/IdeaProjects/Compiler/src/Mx.g4 by ANTLR 4.13.1
package Parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, BasicType=3, FormatBegin=4, FormatEmpty=5, FormatEnd=6, 
		FormatMid=7, DecInteger=8, StringCons=9, Add=10, Sub=11, Mul=12, Div=13, 
		Greater=14, Smaller=15, GorE=16, SorE=17, NotEqual=18, Equal=19, LogicAnd=20, 
		LogicOr_=21, LogicNot=22, RightShift=23, Left_Shift=24, And=25, Or_=26, 
		Xor=27, Not=28, Assign=29, SelfAdd=30, SelfSub=31, Component=32, Left_Bracket=33, 
		RightBracket=34, Left_Paren=35, RightParen=36, Question=37, Colon=38, 
		SemiC=39, Comma=40, Left_Brace=41, RightBrace=42, LineComment=43, BlockComment=44, 
		Quote=45, Void=46, Bool=47, Int=48, String=49, New=50, Class=51, Null=52, 
		True=53, False=54, This=55, If=56, Else=57, For=58, While=59, Break=60, 
		Continue=61, Return=62, Main=63, Identifier=64, Whitespace=65, PrintableChar=66, 
		FormatChar=67, EscapeSequence=68;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "BasicType", "FormatBegin", "FormatEmpty", "FormatEnd", 
			"FormatMid", "DecInteger", "StringCons", "Add", "Sub", "Mul", "Div", 
			"Greater", "Smaller", "GorE", "SorE", "NotEqual", "Equal", "LogicAnd", 
			"LogicOr_", "LogicNot", "RightShift", "Left_Shift", "And", "Or_", "Xor", 
			"Not", "Assign", "SelfAdd", "SelfSub", "Component", "Left_Bracket", "RightBracket", 
			"Left_Paren", "RightParen", "Question", "Colon", "SemiC", "Comma", "Left_Brace", 
			"RightBrace", "LineComment", "BlockComment", "Quote", "Void", "Bool", 
			"Int", "String", "New", "Class", "Null", "True", "False", "This", "If", 
			"Else", "For", "While", "Break", "Continue", "Return", "Main", "Identifier", 
			"Whitespace", "PrintableChar", "FormatChar", "EscapeSequence"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'%'", "'[]'", null, null, null, null, null, null, null, "'+'", 
			"'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'!='", "'=='", "'&&'", 
			"'||'", "'!'", "'>>'", "'<<'", "'&'", "'|'", "'^'", "'~'", "'='", "'++'", 
			"'--'", "'.'", "'['", "']'", "'('", "')'", "'?'", "':'", "';'", "','", 
			"'{'", "'}'", null, null, "'\"'", "'void'", "'bool'", "'int'", "'string'", 
			"'new'", "'class'", "'null'", "'true'", "'false'", "'this'", "'if'", 
			"'else'", "'for'", "'while'", "'break'", "'continue'", "'return'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "BasicType", "FormatBegin", "FormatEmpty", "FormatEnd", 
			"FormatMid", "DecInteger", "StringCons", "Add", "Sub", "Mul", "Div", 
			"Greater", "Smaller", "GorE", "SorE", "NotEqual", "Equal", "LogicAnd", 
			"LogicOr_", "LogicNot", "RightShift", "Left_Shift", "And", "Or_", "Xor", 
			"Not", "Assign", "SelfAdd", "SelfSub", "Component", "Left_Bracket", "RightBracket", 
			"Left_Paren", "RightParen", "Question", "Colon", "SemiC", "Comma", "Left_Brace", 
			"RightBrace", "LineComment", "BlockComment", "Quote", "Void", "Bool", 
			"Int", "String", "New", "Class", "Null", "True", "False", "This", "If", 
			"Else", "For", "While", "Break", "Continue", "Return", "Main", "Identifier", 
			"Whitespace", "PrintableChar", "FormatChar", "EscapeSequence"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public MxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mx.g4"; }

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
		"\u0004\u0000D\u01bb\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u0093\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"\u009c\b\u0003\n\u0003\f\u0003\u009f\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u00aa\b\u0004\n\u0004\f\u0004\u00ad\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u00b6\b\u0005\n\u0005\f\u0005\u00b9\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u00c2\b\u0006\n\u0006\f\u0006\u00c5\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u00cb\b\u0007\n\u0007\f\u0007\u00ce"+
		"\t\u0007\u0001\u0007\u0003\u0007\u00d1\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u00d8\b\b\n\b\f\b\u00db\t\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001"+
		"%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0001*\u0005*\u012f\b*\n*\f*\u0132\t*\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0005+\u013a\b+\n+\f+\u013d\t+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u00013\u0001"+
		"4\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00016\u00016\u00016\u00016\u00016\u00017\u00017\u00017\u00018\u0001"+
		"8\u00018\u00018\u00018\u00019\u00019\u00019\u00019\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001?\u0001?\u0005?\u01a9\b?\n?\f?\u01ac\t?\u0001@\u0004@\u01af\b@"+
		"\u000b@\f@\u01b0\u0001@\u0001@\u0001A\u0001A\u0001B\u0001B\u0001C\u0001"+
		"C\u0001C\u0001\u013b\u0000D\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9s"+
		":u;w<y={>}?\u007f@\u0081A\u0083B\u0085C\u0087D\u0001\u0000\t\u0001\u0000"+
		"19\u0001\u000009\u0002\u0000\n\n\r\r\u0002\u0000AZaz\u0004\u000009AZ_"+
		"_az\u0003\u0000\t\n\r\r  \u0002\u0000  #~\u0003\u0000 !##%~\u0003\u0000"+
		"\"\"\\\\nn\u01d2\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"+
		"\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000"+
		"\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000"+
		"O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001"+
		"\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000"+
		"\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000"+
		"]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001"+
		"\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000"+
		"\u0000\u0000g\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000"+
		"k\u0001\u0000\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0000o\u0001"+
		"\u0000\u0000\u0000\u0000q\u0001\u0000\u0000\u0000\u0000s\u0001\u0000\u0000"+
		"\u0000\u0000u\u0001\u0000\u0000\u0000\u0000w\u0001\u0000\u0000\u0000\u0000"+
		"y\u0001\u0000\u0000\u0000\u0000{\u0001\u0000\u0000\u0000\u0000}\u0001"+
		"\u0000\u0000\u0000\u0000\u007f\u0001\u0000\u0000\u0000\u0000\u0081\u0001"+
		"\u0000\u0000\u0000\u0000\u0083\u0001\u0000\u0000\u0000\u0000\u0085\u0001"+
		"\u0000\u0000\u0000\u0000\u0087\u0001\u0000\u0000\u0000\u0001\u0089\u0001"+
		"\u0000\u0000\u0000\u0003\u008b\u0001\u0000\u0000\u0000\u0005\u0092\u0001"+
		"\u0000\u0000\u0000\u0007\u0094\u0001\u0000\u0000\u0000\t\u00a2\u0001\u0000"+
		"\u0000\u0000\u000b\u00b0\u0001\u0000\u0000\u0000\r\u00bc\u0001\u0000\u0000"+
		"\u0000\u000f\u00d0\u0001\u0000\u0000\u0000\u0011\u00d2\u0001\u0000\u0000"+
		"\u0000\u0013\u00de\u0001\u0000\u0000\u0000\u0015\u00e0\u0001\u0000\u0000"+
		"\u0000\u0017\u00e2\u0001\u0000\u0000\u0000\u0019\u00e4\u0001\u0000\u0000"+
		"\u0000\u001b\u00e6\u0001\u0000\u0000\u0000\u001d\u00e8\u0001\u0000\u0000"+
		"\u0000\u001f\u00ea\u0001\u0000\u0000\u0000!\u00ed\u0001\u0000\u0000\u0000"+
		"#\u00f0\u0001\u0000\u0000\u0000%\u00f3\u0001\u0000\u0000\u0000\'\u00f6"+
		"\u0001\u0000\u0000\u0000)\u00f9\u0001\u0000\u0000\u0000+\u00fc\u0001\u0000"+
		"\u0000\u0000-\u00fe\u0001\u0000\u0000\u0000/\u0101\u0001\u0000\u0000\u0000"+
		"1\u0104\u0001\u0000\u0000\u00003\u0106\u0001\u0000\u0000\u00005\u0108"+
		"\u0001\u0000\u0000\u00007\u010a\u0001\u0000\u0000\u00009\u010c\u0001\u0000"+
		"\u0000\u0000;\u010e\u0001\u0000\u0000\u0000=\u0111\u0001\u0000\u0000\u0000"+
		"?\u0114\u0001\u0000\u0000\u0000A\u0116\u0001\u0000\u0000\u0000C\u0118"+
		"\u0001\u0000\u0000\u0000E\u011a\u0001\u0000\u0000\u0000G\u011c\u0001\u0000"+
		"\u0000\u0000I\u011e\u0001\u0000\u0000\u0000K\u0120\u0001\u0000\u0000\u0000"+
		"M\u0122\u0001\u0000\u0000\u0000O\u0124\u0001\u0000\u0000\u0000Q\u0126"+
		"\u0001\u0000\u0000\u0000S\u0128\u0001\u0000\u0000\u0000U\u012a\u0001\u0000"+
		"\u0000\u0000W\u0135\u0001\u0000\u0000\u0000Y\u0143\u0001\u0000\u0000\u0000"+
		"[\u0145\u0001\u0000\u0000\u0000]\u014a\u0001\u0000\u0000\u0000_\u014f"+
		"\u0001\u0000\u0000\u0000a\u0153\u0001\u0000\u0000\u0000c\u015a\u0001\u0000"+
		"\u0000\u0000e\u015e\u0001\u0000\u0000\u0000g\u0164\u0001\u0000\u0000\u0000"+
		"i\u0169\u0001\u0000\u0000\u0000k\u016e\u0001\u0000\u0000\u0000m\u0174"+
		"\u0001\u0000\u0000\u0000o\u0179\u0001\u0000\u0000\u0000q\u017c\u0001\u0000"+
		"\u0000\u0000s\u0181\u0001\u0000\u0000\u0000u\u0185\u0001\u0000\u0000\u0000"+
		"w\u018b\u0001\u0000\u0000\u0000y\u0191\u0001\u0000\u0000\u0000{\u019a"+
		"\u0001\u0000\u0000\u0000}\u01a1\u0001\u0000\u0000\u0000\u007f\u01a6\u0001"+
		"\u0000\u0000\u0000\u0081\u01ae\u0001\u0000\u0000\u0000\u0083\u01b4\u0001"+
		"\u0000\u0000\u0000\u0085\u01b6\u0001\u0000\u0000\u0000\u0087\u01b8\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005%\u0000\u0000\u008a\u0002\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005[\u0000\u0000\u008c\u008d\u0005]\u0000\u0000"+
		"\u008d\u0004\u0001\u0000\u0000\u0000\u008e\u0093\u0003_/\u0000\u008f\u0093"+
		"\u0003].\u0000\u0090\u0093\u0003a0\u0000\u0091\u0093\u0003\u007f?\u0000"+
		"\u0092\u008e\u0001\u0000\u0000\u0000\u0092\u008f\u0001\u0000\u0000\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000"+
		"\u0093\u0006\u0001\u0000\u0000\u0000\u0094\u0095\u0005f\u0000\u0000\u0095"+
		"\u0096\u0005\"\u0000\u0000\u0096\u009d\u0001\u0000\u0000\u0000\u0097\u009c"+
		"\u0003\u0085B\u0000\u0098\u009c\u0003\u0087C\u0000\u0099\u009a\u0005$"+
		"\u0000\u0000\u009a\u009c\u0005$\u0000\u0000\u009b\u0097\u0001\u0000\u0000"+
		"\u0000\u009b\u0098\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005$\u0000\u0000"+
		"\u00a1\b\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005f\u0000\u0000\u00a3"+
		"\u00a4\u0005\"\u0000\u0000\u00a4\u00ab\u0001\u0000\u0000\u0000\u00a5\u00aa"+
		"\u0003\u0085B\u0000\u00a6\u00aa\u0003\u0087C\u0000\u00a7\u00a8\u0005$"+
		"\u0000\u0000\u00a8\u00aa\u0005$\u0000\u0000\u00a9\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a6\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\"\u0000\u0000"+
		"\u00af\n\u0001\u0000\u0000\u0000\u00b0\u00b7\u0005$\u0000\u0000\u00b1"+
		"\u00b6\u0003\u0085B\u0000\u00b2\u00b6\u0003\u0087C\u0000\u00b3\u00b4\u0005"+
		"$\u0000\u0000\u00b4\u00b6\u0005$\u0000\u0000\u00b5\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00ba\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\"\u0000\u0000"+
		"\u00bb\f\u0001\u0000\u0000\u0000\u00bc\u00c3\u0005$\u0000\u0000\u00bd"+
		"\u00c2\u0003\u0085B\u0000\u00be\u00c2\u0003\u0087C\u0000\u00bf\u00c0\u0005"+
		"$\u0000\u0000\u00c0\u00c2\u0005$\u0000\u0000\u00c1\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c1\u00be\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005$\u0000\u0000"+
		"\u00c7\u000e\u0001\u0000\u0000\u0000\u00c8\u00cc\u0007\u0000\u0000\u0000"+
		"\u00c9\u00cb\u0007\u0001\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00d1\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d1\u00050\u0000\u0000\u00d0"+
		"\u00c8\u0001\u0000\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1"+
		"\u0010\u0001\u0000\u0000\u0000\u00d2\u00d9\u0005\"\u0000\u0000\u00d3\u00d8"+
		"\u0003\u0083A\u0000\u00d4\u00d8\u0003\u0087C\u0000\u00d5\u00d6\u0005$"+
		"\u0000\u0000\u00d6\u00d8\u0005$\u0000\u0000\u00d7\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00dc\u0001\u0000\u0000"+
		"\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\"\u0000\u0000"+
		"\u00dd\u0012\u0001\u0000\u0000\u0000\u00de\u00df\u0005+\u0000\u0000\u00df"+
		"\u0014\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005-\u0000\u0000\u00e1\u0016"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005*\u0000\u0000\u00e3\u0018\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0005/\u0000\u0000\u00e5\u001a\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0005>\u0000\u0000\u00e7\u001c\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0005<\u0000\u0000\u00e9\u001e\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0005>\u0000\u0000\u00eb\u00ec\u0005=\u0000\u0000\u00ec "+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005<\u0000\u0000\u00ee\u00ef\u0005"+
		"=\u0000\u0000\u00ef\"\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005!\u0000"+
		"\u0000\u00f1\u00f2\u0005=\u0000\u0000\u00f2$\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0005=\u0000\u0000\u00f4\u00f5\u0005=\u0000\u0000\u00f5&\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0005&\u0000\u0000\u00f7\u00f8\u0005&\u0000"+
		"\u0000\u00f8(\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005|\u0000\u0000\u00fa"+
		"\u00fb\u0005|\u0000\u0000\u00fb*\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005"+
		"!\u0000\u0000\u00fd,\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005>\u0000"+
		"\u0000\u00ff\u0100\u0005>\u0000\u0000\u0100.\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0005<\u0000\u0000\u0102\u0103\u0005<\u0000\u0000\u01030\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0005&\u0000\u0000\u01052\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0005|\u0000\u0000\u01074\u0001\u0000\u0000\u0000\u0108"+
		"\u0109\u0005^\u0000\u0000\u01096\u0001\u0000\u0000\u0000\u010a\u010b\u0005"+
		"~\u0000\u0000\u010b8\u0001\u0000\u0000\u0000\u010c\u010d\u0005=\u0000"+
		"\u0000\u010d:\u0001\u0000\u0000\u0000\u010e\u010f\u0005+\u0000\u0000\u010f"+
		"\u0110\u0005+\u0000\u0000\u0110<\u0001\u0000\u0000\u0000\u0111\u0112\u0005"+
		"-\u0000\u0000\u0112\u0113\u0005-\u0000\u0000\u0113>\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0005.\u0000\u0000\u0115@\u0001\u0000\u0000\u0000\u0116"+
		"\u0117\u0005[\u0000\u0000\u0117B\u0001\u0000\u0000\u0000\u0118\u0119\u0005"+
		"]\u0000\u0000\u0119D\u0001\u0000\u0000\u0000\u011a\u011b\u0005(\u0000"+
		"\u0000\u011bF\u0001\u0000\u0000\u0000\u011c\u011d\u0005)\u0000\u0000\u011d"+
		"H\u0001\u0000\u0000\u0000\u011e\u011f\u0005?\u0000\u0000\u011fJ\u0001"+
		"\u0000\u0000\u0000\u0120\u0121\u0005:\u0000\u0000\u0121L\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0005;\u0000\u0000\u0123N\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0005,\u0000\u0000\u0125P\u0001\u0000\u0000\u0000\u0126\u0127\u0005"+
		"{\u0000\u0000\u0127R\u0001\u0000\u0000\u0000\u0128\u0129\u0005}\u0000"+
		"\u0000\u0129T\u0001\u0000\u0000\u0000\u012a\u012b\u0005/\u0000\u0000\u012b"+
		"\u012c\u0005/\u0000\u0000\u012c\u0130\u0001\u0000\u0000\u0000\u012d\u012f"+
		"\b\u0002\u0000\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012f\u0132\u0001"+
		"\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001"+
		"\u0000\u0000\u0000\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u0130\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0006*\u0000\u0000\u0134V\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0005/\u0000\u0000\u0136\u0137\u0005*\u0000\u0000\u0137"+
		"\u013b\u0001\u0000\u0000\u0000\u0138\u013a\t\u0000\u0000\u0000\u0139\u0138"+
		"\u0001\u0000\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u013e"+
		"\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u013f"+
		"\u0005*\u0000\u0000\u013f\u0140\u0005/\u0000\u0000\u0140\u0141\u0001\u0000"+
		"\u0000\u0000\u0141\u0142\u0006+\u0000\u0000\u0142X\u0001\u0000\u0000\u0000"+
		"\u0143\u0144\u0005\"\u0000\u0000\u0144Z\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0005v\u0000\u0000\u0146\u0147\u0005o\u0000\u0000\u0147\u0148\u0005"+
		"i\u0000\u0000\u0148\u0149\u0005d\u0000\u0000\u0149\\\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0005b\u0000\u0000\u014b\u014c\u0005o\u0000\u0000\u014c"+
		"\u014d\u0005o\u0000\u0000\u014d\u014e\u0005l\u0000\u0000\u014e^\u0001"+
		"\u0000\u0000\u0000\u014f\u0150\u0005i\u0000\u0000\u0150\u0151\u0005n\u0000"+
		"\u0000\u0151\u0152\u0005t\u0000\u0000\u0152`\u0001\u0000\u0000\u0000\u0153"+
		"\u0154\u0005s\u0000\u0000\u0154\u0155\u0005t\u0000\u0000\u0155\u0156\u0005"+
		"r\u0000\u0000\u0156\u0157\u0005i\u0000\u0000\u0157\u0158\u0005n\u0000"+
		"\u0000\u0158\u0159\u0005g\u0000\u0000\u0159b\u0001\u0000\u0000\u0000\u015a"+
		"\u015b\u0005n\u0000\u0000\u015b\u015c\u0005e\u0000\u0000\u015c\u015d\u0005"+
		"w\u0000\u0000\u015dd\u0001\u0000\u0000\u0000\u015e\u015f\u0005c\u0000"+
		"\u0000\u015f\u0160\u0005l\u0000\u0000\u0160\u0161\u0005a\u0000\u0000\u0161"+
		"\u0162\u0005s\u0000\u0000\u0162\u0163\u0005s\u0000\u0000\u0163f\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u0005n\u0000\u0000\u0165\u0166\u0005u\u0000"+
		"\u0000\u0166\u0167\u0005l\u0000\u0000\u0167\u0168\u0005l\u0000\u0000\u0168"+
		"h\u0001\u0000\u0000\u0000\u0169\u016a\u0005t\u0000\u0000\u016a\u016b\u0005"+
		"r\u0000\u0000\u016b\u016c\u0005u\u0000\u0000\u016c\u016d\u0005e\u0000"+
		"\u0000\u016dj\u0001\u0000\u0000\u0000\u016e\u016f\u0005f\u0000\u0000\u016f"+
		"\u0170\u0005a\u0000\u0000\u0170\u0171\u0005l\u0000\u0000\u0171\u0172\u0005"+
		"s\u0000\u0000\u0172\u0173\u0005e\u0000\u0000\u0173l\u0001\u0000\u0000"+
		"\u0000\u0174\u0175\u0005t\u0000\u0000\u0175\u0176\u0005h\u0000\u0000\u0176"+
		"\u0177\u0005i\u0000\u0000\u0177\u0178\u0005s\u0000\u0000\u0178n\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0005i\u0000\u0000\u017a\u017b\u0005f\u0000"+
		"\u0000\u017bp\u0001\u0000\u0000\u0000\u017c\u017d\u0005e\u0000\u0000\u017d"+
		"\u017e\u0005l\u0000\u0000\u017e\u017f\u0005s\u0000\u0000\u017f\u0180\u0005"+
		"e\u0000\u0000\u0180r\u0001\u0000\u0000\u0000\u0181\u0182\u0005f\u0000"+
		"\u0000\u0182\u0183\u0005o\u0000\u0000\u0183\u0184\u0005r\u0000\u0000\u0184"+
		"t\u0001\u0000\u0000\u0000\u0185\u0186\u0005w\u0000\u0000\u0186\u0187\u0005"+
		"h\u0000\u0000\u0187\u0188\u0005i\u0000\u0000\u0188\u0189\u0005l\u0000"+
		"\u0000\u0189\u018a\u0005e\u0000\u0000\u018av\u0001\u0000\u0000\u0000\u018b"+
		"\u018c\u0005b\u0000\u0000\u018c\u018d\u0005r\u0000\u0000\u018d\u018e\u0005"+
		"e\u0000\u0000\u018e\u018f\u0005a\u0000\u0000\u018f\u0190\u0005k\u0000"+
		"\u0000\u0190x\u0001\u0000\u0000\u0000\u0191\u0192\u0005c\u0000\u0000\u0192"+
		"\u0193\u0005o\u0000\u0000\u0193\u0194\u0005n\u0000\u0000\u0194\u0195\u0005"+
		"t\u0000\u0000\u0195\u0196\u0005i\u0000\u0000\u0196\u0197\u0005n\u0000"+
		"\u0000\u0197\u0198\u0005u\u0000\u0000\u0198\u0199\u0005e\u0000\u0000\u0199"+
		"z\u0001\u0000\u0000\u0000\u019a\u019b\u0005r\u0000\u0000\u019b\u019c\u0005"+
		"e\u0000\u0000\u019c\u019d\u0005t\u0000\u0000\u019d\u019e\u0005u\u0000"+
		"\u0000\u019e\u019f\u0005r\u0000\u0000\u019f\u01a0\u0005n\u0000\u0000\u01a0"+
		"|\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005m\u0000\u0000\u01a2\u01a3\u0005"+
		"a\u0000\u0000\u01a3\u01a4\u0005i\u0000\u0000\u01a4\u01a5\u0005n\u0000"+
		"\u0000\u01a5~\u0001\u0000\u0000\u0000\u01a6\u01aa\u0007\u0003\u0000\u0000"+
		"\u01a7\u01a9\u0007\u0004\u0000\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000"+
		"\u01a9\u01ac\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000"+
		"\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u0080\u0001\u0000\u0000\u0000"+
		"\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad\u01af\u0007\u0005\u0000\u0000"+
		"\u01ae\u01ad\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b3\u0006@\u0000\u0000\u01b3"+
		"\u0082\u0001\u0000\u0000\u0000\u01b4\u01b5\u0007\u0006\u0000\u0000\u01b5"+
		"\u0084\u0001\u0000\u0000\u0000\u01b6\u01b7\u0007\u0007\u0000\u0000\u01b7"+
		"\u0086\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005\\\u0000\u0000\u01b9\u01ba"+
		"\u0007\b\u0000\u0000\u01ba\u0088\u0001\u0000\u0000\u0000\u0012\u0000\u0092"+
		"\u009b\u009d\u00a9\u00ab\u00b5\u00b7\u00c1\u00c3\u00cc\u00d0\u00d7\u00d9"+
		"\u0130\u013b\u01aa\u01b0\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}