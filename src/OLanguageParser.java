// Generated from grammar/OLanguage.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class OLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, WS=27, IdentifierToken=28, IntegerToken=29, RealToken=30;
	public static final int
		RULE_identifierToken = 0, RULE_isToken = 1, RULE_endToken = 2, RULE_extendsToken = 3, 
		RULE_openSquareBracketToken = 4, RULE_closeSquareBracketToken = 5, RULE_varToken = 6, 
		RULE_colonToken = 7, RULE_openParenthesisToken = 8, RULE_closeParenthesisToken = 9, 
		RULE_integerClassToken = 10, RULE_integerToken = 11, RULE_commaToken = 12, 
		RULE_dotToken = 13, RULE_thisToken = 14, RULE_assignToken = 15, RULE_methodToken = 16, 
		RULE_returnToken = 17, RULE_realClassToken = 18, RULE_realToken = 19, 
		RULE_whileToken = 20, RULE_loopToken = 21, RULE_booleanClassToken = 22, 
		RULE_ifToken = 23, RULE_thenToken = 24, RULE_elseToken = 25, RULE_trueToken = 26, 
		RULE_falseToken = 27, RULE_classToken = 28, RULE_program = 29, RULE_classDeclaration = 30, 
		RULE_className = 31, RULE_memberDeclaration = 32, RULE_variableDeclaration = 33, 
		RULE_methodDeclaration = 34, RULE_parameters = 35, RULE_parameterDeclaration = 36, 
		RULE_constructorDeclaration = 37, RULE_body = 38, RULE_statement = 39, 
		RULE_assignment = 40, RULE_whileLoop = 41, RULE_ifStatement = 42, RULE_returnStatement = 43, 
		RULE_expression = 44, RULE_arguments = 45, RULE_primary = 46, RULE_booleanLiteral = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"identifierToken", "isToken", "endToken", "extendsToken", "openSquareBracketToken", 
			"closeSquareBracketToken", "varToken", "colonToken", "openParenthesisToken", 
			"closeParenthesisToken", "integerClassToken", "integerToken", "commaToken", 
			"dotToken", "thisToken", "assignToken", "methodToken", "returnToken", 
			"realClassToken", "realToken", "whileToken", "loopToken", "booleanClassToken", 
			"ifToken", "thenToken", "elseToken", "trueToken", "falseToken", "classToken", 
			"program", "classDeclaration", "className", "memberDeclaration", "variableDeclaration", 
			"methodDeclaration", "parameters", "parameterDeclaration", "constructorDeclaration", 
			"body", "statement", "assignment", "whileLoop", "ifStatement", "returnStatement", 
			"expression", "arguments", "primary", "booleanLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'is'", "'end'", "'extends'", "'['", "']'", "'var'", "':'", "'('", 
			"')'", "'Integer'", "','", "'.'", "'this'", "':='", "'method'", "'return'", 
			"'Real'", "'while'", "'loop'", "'Boolean'", "'if'", "'then'", "'else'", 
			"'true'", "'false'", "'class'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "WS", "IdentifierToken", "IntegerToken", "RealToken"
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

	@Override
	public String getGrammarFileName() { return "OLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierTokenContext extends ParserRuleContext {
		public TerminalNode IdentifierToken() { return getToken(OLanguageParser.IdentifierToken, 0); }
		public IdentifierTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierToken; }
	}

	public final IdentifierTokenContext identifierToken() throws RecognitionException {
		IdentifierTokenContext _localctx = new IdentifierTokenContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_identifierToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(IdentifierToken);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IsTokenContext extends ParserRuleContext {
		public IsTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isToken; }
	}

	public final IsTokenContext isToken() throws RecognitionException {
		IsTokenContext _localctx = new IsTokenContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_isToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EndTokenContext extends ParserRuleContext {
		public EndTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endToken; }
	}

	public final EndTokenContext endToken() throws RecognitionException {
		EndTokenContext _localctx = new EndTokenContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_endToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExtendsTokenContext extends ParserRuleContext {
		public ExtendsTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsToken; }
	}

	public final ExtendsTokenContext extendsToken() throws RecognitionException {
		ExtendsTokenContext _localctx = new ExtendsTokenContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_extendsToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpenSquareBracketTokenContext extends ParserRuleContext {
		public OpenSquareBracketTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openSquareBracketToken; }
	}

	public final OpenSquareBracketTokenContext openSquareBracketToken() throws RecognitionException {
		OpenSquareBracketTokenContext _localctx = new OpenSquareBracketTokenContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_openSquareBracketToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CloseSquareBracketTokenContext extends ParserRuleContext {
		public CloseSquareBracketTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeSquareBracketToken; }
	}

	public final CloseSquareBracketTokenContext closeSquareBracketToken() throws RecognitionException {
		CloseSquareBracketTokenContext _localctx = new CloseSquareBracketTokenContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_closeSquareBracketToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarTokenContext extends ParserRuleContext {
		public VarTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varToken; }
	}

	public final VarTokenContext varToken() throws RecognitionException {
		VarTokenContext _localctx = new VarTokenContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColonTokenContext extends ParserRuleContext {
		public ColonTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colonToken; }
	}

	public final ColonTokenContext colonToken() throws RecognitionException {
		ColonTokenContext _localctx = new ColonTokenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_colonToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpenParenthesisTokenContext extends ParserRuleContext {
		public OpenParenthesisTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openParenthesisToken; }
	}

	public final OpenParenthesisTokenContext openParenthesisToken() throws RecognitionException {
		OpenParenthesisTokenContext _localctx = new OpenParenthesisTokenContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_openParenthesisToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CloseParenthesisTokenContext extends ParserRuleContext {
		public CloseParenthesisTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeParenthesisToken; }
	}

	public final CloseParenthesisTokenContext closeParenthesisToken() throws RecognitionException {
		CloseParenthesisTokenContext _localctx = new CloseParenthesisTokenContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_closeParenthesisToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerClassTokenContext extends ParserRuleContext {
		public IntegerClassTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerClassToken; }
	}

	public final IntegerClassTokenContext integerClassToken() throws RecognitionException {
		IntegerClassTokenContext _localctx = new IntegerClassTokenContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_integerClassToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerTokenContext extends ParserRuleContext {
		public TerminalNode IntegerToken() { return getToken(OLanguageParser.IntegerToken, 0); }
		public IntegerTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerToken; }
	}

	public final IntegerTokenContext integerToken() throws RecognitionException {
		IntegerTokenContext _localctx = new IntegerTokenContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_integerToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(IntegerToken);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommaTokenContext extends ParserRuleContext {
		public CommaTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaToken; }
	}

	public final CommaTokenContext commaToken() throws RecognitionException {
		CommaTokenContext _localctx = new CommaTokenContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_commaToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DotTokenContext extends ParserRuleContext {
		public DotTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotToken; }
	}

	public final DotTokenContext dotToken() throws RecognitionException {
		DotTokenContext _localctx = new DotTokenContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dotToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__11);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThisTokenContext extends ParserRuleContext {
		public ThisTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisToken; }
	}

	public final ThisTokenContext thisToken() throws RecognitionException {
		ThisTokenContext _localctx = new ThisTokenContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_thisToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__12);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignTokenContext extends ParserRuleContext {
		public AssignTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignToken; }
	}

	public final AssignTokenContext assignToken() throws RecognitionException {
		AssignTokenContext _localctx = new AssignTokenContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__13);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodTokenContext extends ParserRuleContext {
		public MethodTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodToken; }
	}

	public final MethodTokenContext methodToken() throws RecognitionException {
		MethodTokenContext _localctx = new MethodTokenContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methodToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnTokenContext extends ParserRuleContext {
		public ReturnTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnToken; }
	}

	public final ReturnTokenContext returnToken() throws RecognitionException {
		ReturnTokenContext _localctx = new ReturnTokenContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RealClassTokenContext extends ParserRuleContext {
		public RealClassTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realClassToken; }
	}

	public final RealClassTokenContext realClassToken() throws RecognitionException {
		RealClassTokenContext _localctx = new RealClassTokenContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_realClassToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RealTokenContext extends ParserRuleContext {
		public TerminalNode RealToken() { return getToken(OLanguageParser.RealToken, 0); }
		public RealTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realToken; }
	}

	public final RealTokenContext realToken() throws RecognitionException {
		RealTokenContext _localctx = new RealTokenContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_realToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(RealToken);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileTokenContext extends ParserRuleContext {
		public WhileTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileToken; }
	}

	public final WhileTokenContext whileToken() throws RecognitionException {
		WhileTokenContext _localctx = new WhileTokenContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whileToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__17);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopTokenContext extends ParserRuleContext {
		public LoopTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopToken; }
	}

	public final LoopTokenContext loopToken() throws RecognitionException {
		LoopTokenContext _localctx = new LoopTokenContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_loopToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__18);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanClassTokenContext extends ParserRuleContext {
		public BooleanClassTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanClassToken; }
	}

	public final BooleanClassTokenContext booleanClassToken() throws RecognitionException {
		BooleanClassTokenContext _localctx = new BooleanClassTokenContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_booleanClassToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__19);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfTokenContext extends ParserRuleContext {
		public IfTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifToken; }
	}

	public final IfTokenContext ifToken() throws RecognitionException {
		IfTokenContext _localctx = new IfTokenContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__20);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThenTokenContext extends ParserRuleContext {
		public ThenTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenToken; }
	}

	public final ThenTokenContext thenToken() throws RecognitionException {
		ThenTokenContext _localctx = new ThenTokenContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_thenToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__21);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseTokenContext extends ParserRuleContext {
		public ElseTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseToken; }
	}

	public final ElseTokenContext elseToken() throws RecognitionException {
		ElseTokenContext _localctx = new ElseTokenContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_elseToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__22);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TrueTokenContext extends ParserRuleContext {
		public TrueTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueToken; }
	}

	public final TrueTokenContext trueToken() throws RecognitionException {
		TrueTokenContext _localctx = new TrueTokenContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_trueToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__23);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FalseTokenContext extends ParserRuleContext {
		public FalseTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_falseToken; }
	}

	public final FalseTokenContext falseToken() throws RecognitionException {
		FalseTokenContext _localctx = new FalseTokenContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_falseToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__24);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassTokenContext extends ParserRuleContext {
		public ClassTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classToken; }
	}

	public final ClassTokenContext classToken() throws RecognitionException {
		ClassTokenContext _localctx = new ClassTokenContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_classToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__25);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(OLanguageParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(154);
				classDeclaration();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassTokenContext classToken() {
			return getRuleContext(ClassTokenContext.class,0);
		}
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public IsTokenContext isToken() {
			return getRuleContext(IsTokenContext.class,0);
		}
		public EndTokenContext endToken() {
			return getRuleContext(EndTokenContext.class,0);
		}
		public ExtendsTokenContext extendsToken() {
			return getRuleContext(ExtendsTokenContext.class,0);
		}
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			classToken();
			setState(163);
			className();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(164);
				extendsToken();
				setState(165);
				className();
				}
			}

			setState(169);
			isToken();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 41024L) != 0)) {
				{
				{
				setState(170);
				memberDeclaration();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			endToken();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassNameContext extends ParserRuleContext {
		public IdentifierTokenContext identifierToken() {
			return getRuleContext(IdentifierTokenContext.class,0);
		}
		public BooleanClassTokenContext booleanClassToken() {
			return getRuleContext(BooleanClassTokenContext.class,0);
		}
		public RealClassTokenContext realClassToken() {
			return getRuleContext(RealClassTokenContext.class,0);
		}
		public IntegerClassTokenContext integerClassToken() {
			return getRuleContext(IntegerClassTokenContext.class,0);
		}
		public OpenSquareBracketTokenContext openSquareBracketToken() {
			return getRuleContext(OpenSquareBracketTokenContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public CloseSquareBracketTokenContext closeSquareBracketToken() {
			return getRuleContext(CloseSquareBracketTokenContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_className);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IdentifierToken:
				{
				setState(178);
				identifierToken();
				}
				break;
			case T__19:
				{
				setState(179);
				booleanClassToken();
				}
				break;
			case T__16:
				{
				setState(180);
				realClassToken();
				}
				break;
			case T__9:
				{
				setState(181);
				integerClassToken();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(184);
				openSquareBracketToken();
				setState(185);
				className();
				setState(186);
				closeSquareBracketToken();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class MemberDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_memberDeclaration);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				variableDeclaration();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				methodDeclaration();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				constructorDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public VarTokenContext varToken() {
			return getRuleContext(VarTokenContext.class,0);
		}
		public IdentifierTokenContext identifierToken() {
			return getRuleContext(IdentifierTokenContext.class,0);
		}
		public ColonTokenContext colonToken() {
			return getRuleContext(ColonTokenContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			varToken();
			setState(196);
			identifierToken();
			setState(197);
			colonToken();
			setState(198);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodTokenContext methodToken() {
			return getRuleContext(MethodTokenContext.class,0);
		}
		public IdentifierTokenContext identifierToken() {
			return getRuleContext(IdentifierTokenContext.class,0);
		}
		public OpenParenthesisTokenContext openParenthesisToken() {
			return getRuleContext(OpenParenthesisTokenContext.class,0);
		}
		public CloseParenthesisTokenContext closeParenthesisToken() {
			return getRuleContext(CloseParenthesisTokenContext.class,0);
		}
		public IsTokenContext isToken() {
			return getRuleContext(IsTokenContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public EndTokenContext endToken() {
			return getRuleContext(EndTokenContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ColonTokenContext colonToken() {
			return getRuleContext(ColonTokenContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			methodToken();
			setState(201);
			identifierToken();
			setState(202);
			openParenthesisToken();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IdentifierToken) {
				{
				setState(203);
				parameters();
				}
			}

			setState(206);
			closeParenthesisToken();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(207);
				colonToken();
				setState(208);
				className();
				}
			}

			setState(212);
			isToken();
			setState(213);
			body();
			setState(214);
			endToken();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<CommaTokenContext> commaToken() {
			return getRuleContexts(CommaTokenContext.class);
		}
		public CommaTokenContext commaToken(int i) {
			return getRuleContext(CommaTokenContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			parameterDeclaration();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(217);
				commaToken();
				setState(218);
				parameterDeclaration();
				}
				}
				setState(224);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDeclarationContext extends ParserRuleContext {
		public IdentifierTokenContext identifierToken() {
			return getRuleContext(IdentifierTokenContext.class,0);
		}
		public ColonTokenContext colonToken() {
			return getRuleContext(ColonTokenContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			identifierToken();
			setState(226);
			colonToken();
			setState(227);
			className();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ThisTokenContext thisToken() {
			return getRuleContext(ThisTokenContext.class,0);
		}
		public OpenParenthesisTokenContext openParenthesisToken() {
			return getRuleContext(OpenParenthesisTokenContext.class,0);
		}
		public CloseParenthesisTokenContext closeParenthesisToken() {
			return getRuleContext(CloseParenthesisTokenContext.class,0);
		}
		public IsTokenContext isToken() {
			return getRuleContext(IsTokenContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public EndTokenContext endToken() {
			return getRuleContext(EndTokenContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			thisToken();
			setState(230);
			openParenthesisToken();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IdentifierToken) {
				{
				setState(231);
				parameters();
				}
			}

			setState(234);
			closeParenthesisToken();
			setState(235);
			isToken();
			setState(236);
			body();
			setState(237);
			endToken();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1932993600L) != 0)) {
				{
				setState(241);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(239);
					variableDeclaration();
					}
					break;
				case T__9:
				case T__12:
				case T__15:
				case T__16:
				case T__17:
				case T__19:
				case T__20:
				case T__23:
				case T__24:
				case IdentifierToken:
				case IntegerToken:
				case RealToken:
					{
					setState(240);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(245);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_statement);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				whileLoop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				returnStatement();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public IdentifierTokenContext identifierToken() {
			return getRuleContext(IdentifierTokenContext.class,0);
		}
		public AssignTokenContext assignToken() {
			return getRuleContext(AssignTokenContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			identifierToken();
			setState(254);
			assignToken();
			setState(255);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public WhileTokenContext whileToken() {
			return getRuleContext(WhileTokenContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LoopTokenContext loopToken() {
			return getRuleContext(LoopTokenContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public EndTokenContext endToken() {
			return getRuleContext(EndTokenContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			whileToken();
			setState(258);
			expression();
			setState(259);
			loopToken();
			setState(260);
			body();
			setState(261);
			endToken();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public IfTokenContext ifToken() {
			return getRuleContext(IfTokenContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThenTokenContext thenToken() {
			return getRuleContext(ThenTokenContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public EndTokenContext endToken() {
			return getRuleContext(EndTokenContext.class,0);
		}
		public ElseTokenContext elseToken() {
			return getRuleContext(ElseTokenContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			ifToken();
			setState(264);
			expression();
			setState(265);
			thenToken();
			setState(266);
			body();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(267);
				elseToken();
				setState(268);
				body();
				}
			}

			setState(272);
			endToken();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnTokenContext returnToken() {
			return getRuleContext(ReturnTokenContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			returnToken();
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(275);
				expression();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<DotTokenContext> dotToken() {
			return getRuleContexts(DotTokenContext.class);
		}
		public DotTokenContext dotToken(int i) {
			return getRuleContext(DotTokenContext.class,i);
		}
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public List<IdentifierTokenContext> identifierToken() {
			return getRuleContexts(IdentifierTokenContext.class);
		}
		public IdentifierTokenContext identifierToken(int i) {
			return getRuleContext(IdentifierTokenContext.class,i);
		}
		public List<ThisTokenContext> thisToken() {
			return getRuleContexts(ThisTokenContext.class);
		}
		public ThisTokenContext thisToken(int i) {
			return getRuleContext(ThisTokenContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			primary();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(279);
				dotToken();
				setState(282);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IdentifierToken:
					{
					setState(280);
					identifierToken();
					}
					break;
				case T__12:
					{
					setState(281);
					thisToken();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(284);
				arguments();
				}
				}
				setState(290);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public OpenParenthesisTokenContext openParenthesisToken() {
			return getRuleContext(OpenParenthesisTokenContext.class,0);
		}
		public CloseParenthesisTokenContext closeParenthesisToken() {
			return getRuleContext(CloseParenthesisTokenContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<CommaTokenContext> commaToken() {
			return getRuleContexts(CommaTokenContext.class);
		}
		public CommaTokenContext commaToken(int i) {
			return getRuleContext(CommaTokenContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			openParenthesisToken();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1930568704L) != 0)) {
				{
				setState(292);
				expression();
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(293);
					commaToken();
					setState(294);
					expression();
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(303);
			closeParenthesisToken();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public IntegerTokenContext integerToken() {
			return getRuleContext(IntegerTokenContext.class,0);
		}
		public RealTokenContext realToken() {
			return getRuleContext(RealTokenContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public ThisTokenContext thisToken() {
			return getRuleContext(ThisTokenContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_primary);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerToken:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				integerToken();
				}
				break;
			case RealToken:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				realToken();
				}
				break;
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				booleanLiteral();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				thisToken();
				}
				break;
			case T__9:
			case T__16:
			case T__19:
			case IdentifierToken:
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
				className();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends ParserRuleContext {
		public TrueTokenContext trueToken() {
			return getRuleContext(TrueTokenContext.class,0);
		}
		public FalseTokenContext falseToken() {
			return getRuleContext(FalseTokenContext.class,0);
		}
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_booleanLiteral);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				trueToken();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				falseToken();
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

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u013d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0005\u001d"+
		"\u009c\b\u001d\n\u001d\f\u001d\u009f\t\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u00a8"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u00ac\b\u001e\n\u001e\f\u001e"+
		"\u00af\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u00b7\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u00bd\b\u001f\u0001 \u0001 \u0001 \u0003 \u00c2"+
		"\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0003\"\u00cd\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u00d3\b\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0005#\u00dd\b"+
		"#\n#\f#\u00e0\t#\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0003"+
		"%\u00e9\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0005&\u00f2"+
		"\b&\n&\f&\u00f5\t&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u00fc"+
		"\b\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u010f\b*\u0001"+
		"*\u0001*\u0001+\u0001+\u0003+\u0115\b+\u0001,\u0001,\u0001,\u0001,\u0003"+
		",\u011b\b,\u0001,\u0001,\u0005,\u011f\b,\n,\f,\u0122\t,\u0001-\u0001-"+
		"\u0001-\u0001-\u0001-\u0005-\u0129\b-\n-\f-\u012c\t-\u0003-\u012e\b-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u0137\b.\u0001/\u0001"+
		"/\u0003/\u013b\b/\u0001/\u0000\u00000\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^\u0000\u0000\u012a\u0000`\u0001\u0000\u0000\u0000\u0002b"+
		"\u0001\u0000\u0000\u0000\u0004d\u0001\u0000\u0000\u0000\u0006f\u0001\u0000"+
		"\u0000\u0000\bh\u0001\u0000\u0000\u0000\nj\u0001\u0000\u0000\u0000\fl"+
		"\u0001\u0000\u0000\u0000\u000en\u0001\u0000\u0000\u0000\u0010p\u0001\u0000"+
		"\u0000\u0000\u0012r\u0001\u0000\u0000\u0000\u0014t\u0001\u0000\u0000\u0000"+
		"\u0016v\u0001\u0000\u0000\u0000\u0018x\u0001\u0000\u0000\u0000\u001az"+
		"\u0001\u0000\u0000\u0000\u001c|\u0001\u0000\u0000\u0000\u001e~\u0001\u0000"+
		"\u0000\u0000 \u0080\u0001\u0000\u0000\u0000\"\u0082\u0001\u0000\u0000"+
		"\u0000$\u0084\u0001\u0000\u0000\u0000&\u0086\u0001\u0000\u0000\u0000("+
		"\u0088\u0001\u0000\u0000\u0000*\u008a\u0001\u0000\u0000\u0000,\u008c\u0001"+
		"\u0000\u0000\u0000.\u008e\u0001\u0000\u0000\u00000\u0090\u0001\u0000\u0000"+
		"\u00002\u0092\u0001\u0000\u0000\u00004\u0094\u0001\u0000\u0000\u00006"+
		"\u0096\u0001\u0000\u0000\u00008\u0098\u0001\u0000\u0000\u0000:\u009d\u0001"+
		"\u0000\u0000\u0000<\u00a2\u0001\u0000\u0000\u0000>\u00b6\u0001\u0000\u0000"+
		"\u0000@\u00c1\u0001\u0000\u0000\u0000B\u00c3\u0001\u0000\u0000\u0000D"+
		"\u00c8\u0001\u0000\u0000\u0000F\u00d8\u0001\u0000\u0000\u0000H\u00e1\u0001"+
		"\u0000\u0000\u0000J\u00e5\u0001\u0000\u0000\u0000L\u00f3\u0001\u0000\u0000"+
		"\u0000N\u00fb\u0001\u0000\u0000\u0000P\u00fd\u0001\u0000\u0000\u0000R"+
		"\u0101\u0001\u0000\u0000\u0000T\u0107\u0001\u0000\u0000\u0000V\u0112\u0001"+
		"\u0000\u0000\u0000X\u0116\u0001\u0000\u0000\u0000Z\u0123\u0001\u0000\u0000"+
		"\u0000\\\u0136\u0001\u0000\u0000\u0000^\u013a\u0001\u0000\u0000\u0000"+
		"`a\u0005\u001c\u0000\u0000a\u0001\u0001\u0000\u0000\u0000bc\u0005\u0001"+
		"\u0000\u0000c\u0003\u0001\u0000\u0000\u0000de\u0005\u0002\u0000\u0000"+
		"e\u0005\u0001\u0000\u0000\u0000fg\u0005\u0003\u0000\u0000g\u0007\u0001"+
		"\u0000\u0000\u0000hi\u0005\u0004\u0000\u0000i\t\u0001\u0000\u0000\u0000"+
		"jk\u0005\u0005\u0000\u0000k\u000b\u0001\u0000\u0000\u0000lm\u0005\u0006"+
		"\u0000\u0000m\r\u0001\u0000\u0000\u0000no\u0005\u0007\u0000\u0000o\u000f"+
		"\u0001\u0000\u0000\u0000pq\u0005\b\u0000\u0000q\u0011\u0001\u0000\u0000"+
		"\u0000rs\u0005\t\u0000\u0000s\u0013\u0001\u0000\u0000\u0000tu\u0005\n"+
		"\u0000\u0000u\u0015\u0001\u0000\u0000\u0000vw\u0005\u001d\u0000\u0000"+
		"w\u0017\u0001\u0000\u0000\u0000xy\u0005\u000b\u0000\u0000y\u0019\u0001"+
		"\u0000\u0000\u0000z{\u0005\f\u0000\u0000{\u001b\u0001\u0000\u0000\u0000"+
		"|}\u0005\r\u0000\u0000}\u001d\u0001\u0000\u0000\u0000~\u007f\u0005\u000e"+
		"\u0000\u0000\u007f\u001f\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u000f"+
		"\u0000\u0000\u0081!\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0010\u0000"+
		"\u0000\u0083#\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0011\u0000\u0000"+
		"\u0085%\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u001e\u0000\u0000\u0087"+
		"\'\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0012\u0000\u0000\u0089)"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0013\u0000\u0000\u008b+\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0005\u0014\u0000\u0000\u008d-\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0005\u0015\u0000\u0000\u008f/\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0005\u0016\u0000\u0000\u00911\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0005\u0017\u0000\u0000\u00933\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0005\u0018\u0000\u0000\u00955\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0005\u0019\u0000\u0000\u00977\u0001\u0000\u0000\u0000\u0098\u0099\u0005"+
		"\u001a\u0000\u0000\u00999\u0001\u0000\u0000\u0000\u009a\u009c\u0003<\u001e"+
		"\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0005\u0000\u0000\u0001\u00a1;\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u00038\u001c\u0000\u00a3\u00a7\u0003>\u001f\u0000\u00a4\u00a5"+
		"\u0003\u0006\u0003\u0000\u00a5\u00a6\u0003>\u001f\u0000\u00a6\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ad\u0003"+
		"\u0002\u0001\u0000\u00aa\u00ac\u0003@ \u0000\u00ab\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000"+
		"\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b1\u0003\u0004\u0002"+
		"\u0000\u00b1=\u0001\u0000\u0000\u0000\u00b2\u00b7\u0003\u0000\u0000\u0000"+
		"\u00b3\u00b7\u0003,\u0016\u0000\u00b4\u00b7\u0003$\u0012\u0000\u00b5\u00b7"+
		"\u0003\u0014\n\u0000\u00b6\u00b2\u0001\u0000\u0000\u0000\u00b6\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b7\u00bc\u0001\u0000\u0000\u0000\u00b8\u00b9\u0003"+
		"\b\u0004\u0000\u00b9\u00ba\u0003>\u001f\u0000\u00ba\u00bb\u0003\n\u0005"+
		"\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00b8\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd?\u0001\u0000\u0000\u0000"+
		"\u00be\u00c2\u0003B!\u0000\u00bf\u00c2\u0003D\"\u0000\u00c0\u00c2\u0003"+
		"J%\u0000\u00c1\u00be\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2A\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0003\f\u0006\u0000\u00c4\u00c5\u0003\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0003\u000e\u0007\u0000\u00c6\u00c7\u0003X,\u0000\u00c7C\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0003 \u0010\u0000\u00c9\u00ca\u0003\u0000"+
		"\u0000\u0000\u00ca\u00cc\u0003\u0010\b\u0000\u00cb\u00cd\u0003F#\u0000"+
		"\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d2\u0003\u0012\t\u0000\u00cf"+
		"\u00d0\u0003\u000e\u0007\u0000\u00d0\u00d1\u0003>\u001f\u0000\u00d1\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d2\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0003\u0002\u0001\u0000\u00d5\u00d6\u0003L&\u0000\u00d6\u00d7\u0003\u0004"+
		"\u0002\u0000\u00d7E\u0001\u0000\u0000\u0000\u00d8\u00de\u0003H$\u0000"+
		"\u00d9\u00da\u0003\u0018\f\u0000\u00da\u00db\u0003H$\u0000\u00db\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dc\u00d9\u0001\u0000\u0000\u0000\u00dd\u00e0"+
		"\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0001\u0000\u0000\u0000\u00dfG\u0001\u0000\u0000\u0000\u00e0\u00de\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0003\u0000\u0000\u0000\u00e2\u00e3\u0003"+
		"\u000e\u0007\u0000\u00e3\u00e4\u0003>\u001f\u0000\u00e4I\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0003\u001c\u000e\u0000\u00e6\u00e8\u0003\u0010\b\u0000"+
		"\u00e7\u00e9\u0003F#\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0003\u0012\t\u0000\u00eb\u00ec\u0003\u0002\u0001\u0000\u00ec\u00ed\u0003"+
		"L&\u0000\u00ed\u00ee\u0003\u0004\u0002\u0000\u00eeK\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f2\u0003B!\u0000\u00f0\u00f2\u0003N\'\u0000\u00f1\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f4M\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f6\u00fc\u0003P(\u0000\u00f7\u00fc\u0003X,\u0000"+
		"\u00f8\u00fc\u0003R)\u0000\u00f9\u00fc\u0003T*\u0000\u00fa\u00fc\u0003"+
		"V+\u0000\u00fb\u00f6\u0001\u0000\u0000\u0000\u00fb\u00f7\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f8\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fcO\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0003\u0000\u0000\u0000\u00fe\u00ff\u0003\u001e\u000f\u0000"+
		"\u00ff\u0100\u0003X,\u0000\u0100Q\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0003(\u0014\u0000\u0102\u0103\u0003X,\u0000\u0103\u0104\u0003*\u0015"+
		"\u0000\u0104\u0105\u0003L&\u0000\u0105\u0106\u0003\u0004\u0002\u0000\u0106"+
		"S\u0001\u0000\u0000\u0000\u0107\u0108\u0003.\u0017\u0000\u0108\u0109\u0003"+
		"X,\u0000\u0109\u010a\u00030\u0018\u0000\u010a\u010e\u0003L&\u0000\u010b"+
		"\u010c\u00032\u0019\u0000\u010c\u010d\u0003L&\u0000\u010d\u010f\u0001"+
		"\u0000\u0000\u0000\u010e\u010b\u0001\u0000\u0000\u0000\u010e\u010f\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0003"+
		"\u0004\u0002\u0000\u0111U\u0001\u0000\u0000\u0000\u0112\u0114\u0003\""+
		"\u0011\u0000\u0113\u0115\u0003X,\u0000\u0114\u0113\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0001\u0000\u0000\u0000\u0115W\u0001\u0000\u0000\u0000\u0116"+
		"\u0120\u0003\\.\u0000\u0117\u011a\u0003\u001a\r\u0000\u0118\u011b\u0003"+
		"\u0000\u0000\u0000\u0119\u011b\u0003\u001c\u000e\u0000\u011a\u0118\u0001"+
		"\u0000\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0003Z-\u0000\u011d\u011f\u0001\u0000\u0000"+
		"\u0000\u011e\u0117\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000"+
		"\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000"+
		"\u0000\u0121Y\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000"+
		"\u0123\u012d\u0003\u0010\b\u0000\u0124\u012a\u0003X,\u0000\u0125\u0126"+
		"\u0003\u0018\f\u0000\u0126\u0127\u0003X,\u0000\u0127\u0129\u0001\u0000"+
		"\u0000\u0000\u0128\u0125\u0001\u0000\u0000\u0000\u0129\u012c\u0001\u0000"+
		"\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000"+
		"\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000"+
		"\u0000\u0000\u012d\u0124\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u0003\u0012"+
		"\t\u0000\u0130[\u0001\u0000\u0000\u0000\u0131\u0137\u0003\u0016\u000b"+
		"\u0000\u0132\u0137\u0003&\u0013\u0000\u0133\u0137\u0003^/\u0000\u0134"+
		"\u0137\u0003\u001c\u000e\u0000\u0135\u0137\u0003>\u001f\u0000\u0136\u0131"+
		"\u0001\u0000\u0000\u0000\u0136\u0132\u0001\u0000\u0000\u0000\u0136\u0133"+
		"\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0135"+
		"\u0001\u0000\u0000\u0000\u0137]\u0001\u0000\u0000\u0000\u0138\u013b\u0003"+
		"4\u001a\u0000\u0139\u013b\u00036\u001b\u0000\u013a\u0138\u0001\u0000\u0000"+
		"\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013b_\u0001\u0000\u0000\u0000"+
		"\u0015\u009d\u00a7\u00ad\u00b6\u00bc\u00c1\u00cc\u00d2\u00de\u00e8\u00f1"+
		"\u00f3\u00fb\u010e\u0114\u011a\u0120\u012a\u012d\u0136\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}