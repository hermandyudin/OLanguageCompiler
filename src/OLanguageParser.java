// Generated from C:/Users/dyudi/IdeaProjects/finally/grammar/OLanguage.g4 by ANTLR 4.13.1
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
		RULE_identifierToken = 0, RULE_integerClassToken = 1, RULE_integerToken = 2, 
		RULE_realClassToken = 3, RULE_realToken = 4, RULE_booleanClassToken = 5, 
		RULE_program = 6, RULE_classDeclaration = 7, RULE_className = 8, RULE_memberDeclaration = 9, 
		RULE_variableDeclaration = 10, RULE_methodDeclaration = 11, RULE_parameters = 12, 
		RULE_parameterDeclaration = 13, RULE_constructorDeclaration = 14, RULE_body = 15, 
		RULE_statement = 16, RULE_assignment = 17, RULE_whileLoop = 18, RULE_ifStatement = 19, 
		RULE_returnStatement = 20, RULE_expression = 21, RULE_arguments = 22, 
		RULE_primary = 23, RULE_booleanLiteral = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"identifierToken", "integerClassToken", "integerToken", "realClassToken", 
			"realToken", "booleanClassToken", "program", "classDeclaration", "className", 
			"memberDeclaration", "variableDeclaration", "methodDeclaration", "parameters", 
			"parameterDeclaration", "constructorDeclaration", "body", "statement", 
			"assignment", "whileLoop", "ifStatement", "returnStatement", "expression", 
			"arguments", "primary", "booleanLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Integer'", "'Real'", "'Boolean'", "'class'", "'extends'", "'is'", 
			"'end'", "'['", "']'", "'var'", "':'", "'method'", "'('", "')'", "','", 
			"'this'", "':='", "'while'", "'loop'", "'if'", "'then'", "'else'", "'return'", 
			"'.'", "'true'", "'false'"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterIdentifierToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitIdentifierToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitIdentifierToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierTokenContext identifierToken() throws RecognitionException {
		IdentifierTokenContext _localctx = new IdentifierTokenContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_identifierToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
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
	public static class IntegerClassTokenContext extends ParserRuleContext {
		public IntegerClassTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerClassToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterIntegerClassToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitIntegerClassToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitIntegerClassToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerClassTokenContext integerClassToken() throws RecognitionException {
		IntegerClassTokenContext _localctx = new IntegerClassTokenContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_integerClassToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
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
	public static class IntegerTokenContext extends ParserRuleContext {
		public TerminalNode IntegerToken() { return getToken(OLanguageParser.IntegerToken, 0); }
		public IntegerTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterIntegerToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitIntegerToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitIntegerToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerTokenContext integerToken() throws RecognitionException {
		IntegerTokenContext _localctx = new IntegerTokenContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_integerToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
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
	public static class RealClassTokenContext extends ParserRuleContext {
		public RealClassTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realClassToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterRealClassToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitRealClassToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitRealClassToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealClassTokenContext realClassToken() throws RecognitionException {
		RealClassTokenContext _localctx = new RealClassTokenContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_realClassToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
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
	public static class RealTokenContext extends ParserRuleContext {
		public TerminalNode RealToken() { return getToken(OLanguageParser.RealToken, 0); }
		public RealTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterRealToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitRealToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitRealToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealTokenContext realToken() throws RecognitionException {
		RealTokenContext _localctx = new RealTokenContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_realToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
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
	public static class BooleanClassTokenContext extends ParserRuleContext {
		public BooleanClassTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanClassToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterBooleanClassToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitBooleanClassToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitBooleanClassToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanClassTokenContext booleanClassToken() throws RecognitionException {
		BooleanClassTokenContext _localctx = new BooleanClassTokenContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_booleanClassToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(62);
				classDeclaration();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__3);
			setState(71);
			className();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(72);
				match(T__4);
				setState(73);
				className();
				}
			}

			setState(76);
			match(T__5);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70656L) != 0)) {
				{
				{
				setState(77);
				memberDeclaration();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
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
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_className);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IdentifierToken:
				{
				setState(85);
				identifierToken();
				}
				break;
			case T__2:
				{
				setState(86);
				booleanClassToken();
				}
				break;
			case T__1:
				{
				setState(87);
				realClassToken();
				}
				break;
			case T__0:
				{
				setState(88);
				integerClassToken();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(91);
				match(T__7);
				setState(92);
				className();
				setState(93);
				match(T__8);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_memberDeclaration);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				variableDeclaration();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				methodDeclaration();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
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
		public IdentifierTokenContext identifierToken() {
			return getRuleContext(IdentifierTokenContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__9);
			setState(103);
			identifierToken();
			setState(104);
			match(T__10);
			setState(105);
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
		public IdentifierTokenContext identifierToken() {
			return getRuleContext(IdentifierTokenContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__11);
			setState(108);
			identifierToken();
			setState(109);
			match(T__12);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IdentifierToken) {
				{
				setState(110);
				parameters();
				}
			}

			setState(113);
			match(T__13);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(114);
				match(T__10);
				setState(115);
				className();
				}
			}

			setState(118);
			match(T__5);
			setState(119);
			body();
			setState(120);
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
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			parameterDeclaration();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(123);
				match(T__14);
				setState(124);
				parameterDeclaration();
				}
				}
				setState(129);
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
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			identifierToken();
			setState(131);
			match(T__10);
			setState(132);
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
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__15);
			setState(135);
			match(T__12);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IdentifierToken) {
				{
				setState(136);
				parameters();
				}
			}

			setState(139);
			match(T__13);
			setState(140);
			match(T__5);
			setState(141);
			body();
			setState(142);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1989477390L) != 0)) {
				{
				setState(146);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(144);
					variableDeclaration();
					}
					break;
				case T__0:
				case T__1:
				case T__2:
				case T__15:
				case T__17:
				case T__19:
				case T__22:
				case T__24:
				case T__25:
				case IdentifierToken:
				case IntegerToken:
				case RealToken:
					{
					setState(145);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(150);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				whileLoop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			identifierToken();
			setState(159);
			match(T__16);
			setState(160);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__17);
			setState(163);
			expression();
			setState(164);
			match(T__18);
			setState(165);
			body();
			setState(166);
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
	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__19);
			setState(169);
			expression();
			setState(170);
			match(T__20);
			setState(171);
			body();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(172);
				match(T__21);
				setState(173);
				body();
				}
			}

			setState(176);
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__22);
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(179);
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
		public List<IdentifierTokenContext> identifierToken() {
			return getRuleContexts(IdentifierTokenContext.class);
		}
		public IdentifierTokenContext identifierToken(int i) {
			return getRuleContext(IdentifierTokenContext.class,i);
		}
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			primary();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(183);
				match(T__23);
				setState(186);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IdentifierToken:
					{
					setState(184);
					identifierToken();
					}
					break;
				case T__15:
					{
					setState(185);
					match(T__15);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(188);
					arguments();
					}
				}

				}
				}
				setState(195);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__12);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1979777038L) != 0)) {
				{
				setState(197);
				expression();
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(198);
					match(T__14);
					setState(199);
					expression();
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(207);
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
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primary);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerToken:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				integerToken();
				}
				break;
			case RealToken:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				realToken();
				}
				break;
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				booleanLiteral();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				match(T__15);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case IdentifierToken:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
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
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OLanguageListener ) ((OLanguageListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OLanguageVisitor ) return ((OLanguageVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u00db\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0005\u0006@\b\u0006\n\u0006\f\u0006C\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007K\b\u0007\u0001\u0007\u0001\u0007\u0005\u0007O\b\u0007\n\u0007\f"+
		"\u0007R\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bZ\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b`\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0003\te\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bp\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000bu\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f~\b\f\n"+
		"\f\f\f\u0081\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u008a\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u0093\b\u000f"+
		"\n\u000f\f\u000f\u0096\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u009d\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00af\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u00b5\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u00bb\b\u0015\u0001\u0015\u0003\u0015\u00be"+
		"\b\u0015\u0005\u0015\u00c0\b\u0015\n\u0015\f\u0015\u00c3\t\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00c9\b\u0016\n"+
		"\u0016\f\u0016\u00cc\t\u0016\u0003\u0016\u00ce\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u00d7\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0000\u0000\u0019"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.0\u0000\u0001\u0001\u0000\u0019\u001a\u00df\u0000"+
		"2\u0001\u0000\u0000\u0000\u00024\u0001\u0000\u0000\u0000\u00046\u0001"+
		"\u0000\u0000\u0000\u00068\u0001\u0000\u0000\u0000\b:\u0001\u0000\u0000"+
		"\u0000\n<\u0001\u0000\u0000\u0000\fA\u0001\u0000\u0000\u0000\u000eF\u0001"+
		"\u0000\u0000\u0000\u0010Y\u0001\u0000\u0000\u0000\u0012d\u0001\u0000\u0000"+
		"\u0000\u0014f\u0001\u0000\u0000\u0000\u0016k\u0001\u0000\u0000\u0000\u0018"+
		"z\u0001\u0000\u0000\u0000\u001a\u0082\u0001\u0000\u0000\u0000\u001c\u0086"+
		"\u0001\u0000\u0000\u0000\u001e\u0094\u0001\u0000\u0000\u0000 \u009c\u0001"+
		"\u0000\u0000\u0000\"\u009e\u0001\u0000\u0000\u0000$\u00a2\u0001\u0000"+
		"\u0000\u0000&\u00a8\u0001\u0000\u0000\u0000(\u00b2\u0001\u0000\u0000\u0000"+
		"*\u00b6\u0001\u0000\u0000\u0000,\u00c4\u0001\u0000\u0000\u0000.\u00d6"+
		"\u0001\u0000\u0000\u00000\u00d8\u0001\u0000\u0000\u000023\u0005\u001c"+
		"\u0000\u00003\u0001\u0001\u0000\u0000\u000045\u0005\u0001\u0000\u0000"+
		"5\u0003\u0001\u0000\u0000\u000067\u0005\u001d\u0000\u00007\u0005\u0001"+
		"\u0000\u0000\u000089\u0005\u0002\u0000\u00009\u0007\u0001\u0000\u0000"+
		"\u0000:;\u0005\u001e\u0000\u0000;\t\u0001\u0000\u0000\u0000<=\u0005\u0003"+
		"\u0000\u0000=\u000b\u0001\u0000\u0000\u0000>@\u0003\u000e\u0007\u0000"+
		"?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000DE\u0005\u0000\u0000\u0001E\r\u0001\u0000\u0000\u0000FG\u0005"+
		"\u0004\u0000\u0000GJ\u0003\u0010\b\u0000HI\u0005\u0005\u0000\u0000IK\u0003"+
		"\u0010\b\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LP\u0005\u0006\u0000\u0000MO\u0003\u0012\t\u0000NM\u0001"+
		"\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000ST\u0005\u0007\u0000\u0000T\u000f\u0001\u0000\u0000\u0000UZ\u0003"+
		"\u0000\u0000\u0000VZ\u0003\n\u0005\u0000WZ\u0003\u0006\u0003\u0000XZ\u0003"+
		"\u0002\u0001\u0000YU\u0001\u0000\u0000\u0000YV\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000Z_\u0001\u0000\u0000"+
		"\u0000[\\\u0005\b\u0000\u0000\\]\u0003\u0010\b\u0000]^\u0005\t\u0000\u0000"+
		"^`\u0001\u0000\u0000\u0000_[\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`\u0011\u0001\u0000\u0000\u0000ae\u0003\u0014\n\u0000be\u0003\u0016"+
		"\u000b\u0000ce\u0003\u001c\u000e\u0000da\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000e\u0013\u0001\u0000\u0000"+
		"\u0000fg\u0005\n\u0000\u0000gh\u0003\u0000\u0000\u0000hi\u0005\u000b\u0000"+
		"\u0000ij\u0003*\u0015\u0000j\u0015\u0001\u0000\u0000\u0000kl\u0005\f\u0000"+
		"\u0000lm\u0003\u0000\u0000\u0000mo\u0005\r\u0000\u0000np\u0003\u0018\f"+
		"\u0000on\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qt\u0005\u000e\u0000\u0000rs\u0005\u000b\u0000\u0000su\u0003"+
		"\u0010\b\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0001"+
		"\u0000\u0000\u0000vw\u0005\u0006\u0000\u0000wx\u0003\u001e\u000f\u0000"+
		"xy\u0005\u0007\u0000\u0000y\u0017\u0001\u0000\u0000\u0000z\u007f\u0003"+
		"\u001a\r\u0000{|\u0005\u000f\u0000\u0000|~\u0003\u001a\r\u0000}{\u0001"+
		"\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0019\u0001\u0000\u0000"+
		"\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0083\u0003\u0000\u0000"+
		"\u0000\u0083\u0084\u0005\u000b\u0000\u0000\u0084\u0085\u0003\u0010\b\u0000"+
		"\u0085\u001b\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0010\u0000\u0000"+
		"\u0087\u0089\u0005\r\u0000\u0000\u0088\u008a\u0003\u0018\f\u0000\u0089"+
		"\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u000e\u0000\u0000\u008c"+
		"\u008d\u0005\u0006\u0000\u0000\u008d\u008e\u0003\u001e\u000f\u0000\u008e"+
		"\u008f\u0005\u0007\u0000\u0000\u008f\u001d\u0001\u0000\u0000\u0000\u0090"+
		"\u0093\u0003\u0014\n\u0000\u0091\u0093\u0003 \u0010\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0096"+
		"\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0001\u0000\u0000\u0000\u0095\u001f\u0001\u0000\u0000\u0000\u0096\u0094"+
		"\u0001\u0000\u0000\u0000\u0097\u009d\u0003\"\u0011\u0000\u0098\u009d\u0003"+
		"*\u0015\u0000\u0099\u009d\u0003$\u0012\u0000\u009a\u009d\u0003&\u0013"+
		"\u0000\u009b\u009d\u0003(\u0014\u0000\u009c\u0097\u0001\u0000\u0000\u0000"+
		"\u009c\u0098\u0001\u0000\u0000\u0000\u009c\u0099\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000"+
		"\u009d!\u0001\u0000\u0000\u0000\u009e\u009f\u0003\u0000\u0000\u0000\u009f"+
		"\u00a0\u0005\u0011\u0000\u0000\u00a0\u00a1\u0003*\u0015\u0000\u00a1#\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0005\u0012\u0000\u0000\u00a3\u00a4\u0003"+
		"*\u0015\u0000\u00a4\u00a5\u0005\u0013\u0000\u0000\u00a5\u00a6\u0003\u001e"+
		"\u000f\u0000\u00a6\u00a7\u0005\u0007\u0000\u0000\u00a7%\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0005\u0014\u0000\u0000\u00a9\u00aa\u0003*\u0015\u0000"+
		"\u00aa\u00ab\u0005\u0015\u0000\u0000\u00ab\u00ae\u0003\u001e\u000f\u0000"+
		"\u00ac\u00ad\u0005\u0016\u0000\u0000\u00ad\u00af\u0003\u001e\u000f\u0000"+
		"\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0007\u0000\u0000"+
		"\u00b1\'\u0001\u0000\u0000\u0000\u00b2\u00b4\u0005\u0017\u0000\u0000\u00b3"+
		"\u00b5\u0003*\u0015\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b5)\u0001\u0000\u0000\u0000\u00b6\u00c1\u0003"+
		".\u0017\u0000\u00b7\u00ba\u0005\u0018\u0000\u0000\u00b8\u00bb\u0003\u0000"+
		"\u0000\u0000\u00b9\u00bb\u0005\u0010\u0000\u0000\u00ba\u00b8\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bc\u00be\u0003,\u0016\u0000\u00bd\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c0\u0001\u0000\u0000"+
		"\u0000\u00bf\u00b7\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c2+\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c4\u00cd\u0005\r\u0000\u0000\u00c5\u00ca\u0003*\u0015\u0000\u00c6"+
		"\u00c7\u0005\u000f\u0000\u0000\u00c7\u00c9\u0003*\u0015\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00ce"+
		"\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00c5"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u000e\u0000\u0000\u00d0-\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d7\u0003\u0004\u0002\u0000\u00d2\u00d7\u0003"+
		"\b\u0004\u0000\u00d3\u00d7\u00030\u0018\u0000\u00d4\u00d7\u0005\u0010"+
		"\u0000\u0000\u00d5\u00d7\u0003\u0010\b\u0000\u00d6\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d2\u0001\u0000\u0000\u0000\u00d6\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d7/\u0001\u0000\u0000\u0000\u00d8\u00d9\u0007\u0000\u0000\u0000"+
		"\u00d91\u0001\u0000\u0000\u0000\u0015AJPY_dot\u007f\u0089\u0092\u0094"+
		"\u009c\u00ae\u00b4\u00ba\u00bd\u00c1\u00ca\u00cd\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}