// Generated from UsecaseReader.g4 by ANTLR 4.7.2
package parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UsecaseReaderParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, Word=30, Number=31, 
		Punctuation=32, EOL=33, WS=34;
	public static final int
		RULE_usecaseList = 0, RULE_usecase = 1, RULE_ucName = 2, RULE_briefDesc = 3, 
		RULE_precondition = 4, RULE_actor = 5, RULE_actorType = 6, RULE_dependency = 7, 
		RULE_generalization = 8, RULE_flow = 9, RULE_flowType = 10, RULE_rfs = 11, 
		RULE_steps = 12, RULE_step = 13, RULE_sentence = 14, RULE_specialKeyword = 15, 
		RULE_conditionalLogic = 16, RULE_postCondition = 17, RULE_statement = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"usecaseList", "usecase", "ucName", "briefDesc", "precondition", "actor", 
			"actorType", "dependency", "generalization", "flow", "flowType", "rfs", 
			"steps", "step", "sentence", "specialKeyword", "conditionalLogic", "postCondition", 
			"statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Use Case Name '", "'Brief Description '", "'Precondition '", 
			"'Actor'", "'Actors'", "'Primary'", "'Secondary'", "'Dependency '", "'Generalization '", 
			"'Flow'", "'Flows'", "'Basic'", "'Bounded Alternative'", "'Global Alternative'", 
			"'Specific Alternative'", "'RFS '", "'-'", "'INCLUDE USE CASE'", "'EXTENDED BY USE CASE'", 
			"'MEANWHILE'", "'VALIDATES THAT'", "'ELSE'", "'ENDIF'", "'DO'", "'UNTIL'", 
			"'IF'", "'ELSEIF'", "'THEN'", "'Postcondition '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "Word", "Number", "Punctuation", 
			"EOL", "WS"
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
	public String getGrammarFileName() { return "UsecaseReader.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UsecaseReaderParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class UsecaseListContext extends ParserRuleContext {
		public List<UsecaseContext> usecase() {
			return getRuleContexts(UsecaseContext.class);
		}
		public UsecaseContext usecase(int i) {
			return getRuleContext(UsecaseContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(UsecaseReaderParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(UsecaseReaderParser.EOL, i);
		}
		public UsecaseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usecaseList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).enterUsecaseList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).exitUsecaseList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UsecaseReaderVisitor ) return ((UsecaseReaderVisitor<? extends T>)visitor).visitUsecaseList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsecaseListContext usecaseList() throws RecognitionException {
		UsecaseListContext _localctx = new UsecaseListContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_usecaseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(40);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(38);
					usecase();
					}
					break;
				case EOL:
					{
					setState(39);
					match(EOL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==EOL );
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

	public static class UsecaseContext extends ParserRuleContext {
		public UcNameContext ucName() {
			return getRuleContext(UcNameContext.class,0);
		}
		public List<TerminalNode> EOL() { return getTokens(UsecaseReaderParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(UsecaseReaderParser.EOL, i);
		}
		public List<FlowContext> flow() {
			return getRuleContexts(FlowContext.class);
		}
		public FlowContext flow(int i) {
			return getRuleContext(FlowContext.class,i);
		}
		public List<BriefDescContext> briefDesc() {
			return getRuleContexts(BriefDescContext.class);
		}
		public BriefDescContext briefDesc(int i) {
			return getRuleContext(BriefDescContext.class,i);
		}
		public List<PreconditionContext> precondition() {
			return getRuleContexts(PreconditionContext.class);
		}
		public PreconditionContext precondition(int i) {
			return getRuleContext(PreconditionContext.class,i);
		}
		public List<ActorContext> actor() {
			return getRuleContexts(ActorContext.class);
		}
		public ActorContext actor(int i) {
			return getRuleContext(ActorContext.class,i);
		}
		public List<DependencyContext> dependency() {
			return getRuleContexts(DependencyContext.class);
		}
		public DependencyContext dependency(int i) {
			return getRuleContext(DependencyContext.class,i);
		}
		public List<GeneralizationContext> generalization() {
			return getRuleContexts(GeneralizationContext.class);
		}
		public GeneralizationContext generalization(int i) {
			return getRuleContext(GeneralizationContext.class,i);
		}
		public UsecaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usecase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).enterUsecase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).exitUsecase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UsecaseReaderVisitor ) return ((UsecaseReaderVisitor<? extends T>)visitor).visitUsecase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsecaseContext usecase() throws RecognitionException {
		UsecaseContext _localctx = new UsecaseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_usecase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			ucName();
			setState(45);
			match(EOL);
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
				case T__12:
				case T__13:
				case T__14:
					{
					setState(46);
					flow();
					}
					break;
				case T__1:
				case T__2:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
					{
					setState(52);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
						{
						setState(47);
						briefDesc();
						}
						break;
					case T__2:
						{
						setState(48);
						precondition();
						}
						break;
					case T__5:
					case T__6:
						{
						setState(49);
						actor();
						}
						break;
					case T__7:
						{
						setState(50);
						dependency();
						}
						break;
					case T__8:
						{
						setState(51);
						generalization();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(54);
					match(EOL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0) );
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

	public static class UcNameContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public UcNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ucName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).enterUcName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).exitUcName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UsecaseReaderVisitor ) return ((UsecaseReaderVisitor<? extends T>)visitor).visitUcName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UcNameContext ucName() throws RecognitionException {
		UcNameContext _localctx = new UcNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ucName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__0);
			setState(61);
			statement();
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

	public static class BriefDescContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BriefDescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_briefDesc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).enterBriefDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).exitBriefDesc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UsecaseReaderVisitor ) return ((UsecaseReaderVisitor<? extends T>)visitor).visitBriefDesc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BriefDescContext briefDesc() throws RecognitionException {
		BriefDescContext _localctx = new BriefDescContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_briefDesc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__1);
			setState(64);
			statement();
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

	public static class PreconditionContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public PreconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).enterPrecondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).exitPrecondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UsecaseReaderVisitor ) return ((UsecaseReaderVisitor<? extends T>)visitor).visitPrecondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreconditionContext precondition() throws RecognitionException {
		PreconditionContext _localctx = new PreconditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_precondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__2);
			setState(67);
			statement();
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

	public static class ActorContext extends ParserRuleContext {
		public ActorTypeContext actorType() {
			return getRuleContext(ActorTypeContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(UsecaseReaderParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(UsecaseReaderParser.WS, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ActorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).enterActor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).exitActor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UsecaseReaderVisitor ) return ((UsecaseReaderVisitor<? extends T>)visitor).visitActor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActorContext actor() throws RecognitionException {
		ActorContext _localctx = new ActorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_actor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			actorType();
			setState(70);
			match(WS);
			setState(71);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(72);
			match(WS);
			setState(73);
			statement();
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

	public static class ActorTypeContext extends ParserRuleContext {
		public ActorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actorType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).enterActorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).exitActorType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UsecaseReaderVisitor ) return ((UsecaseReaderVisitor<? extends T>)visitor).visitActorType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActorTypeContext actorType() throws RecognitionException {
		ActorTypeContext _localctx = new ActorTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_actorType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
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

	public static class DependencyContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SpecialKeywordContext specialKeyword() {
			return getRuleContext(SpecialKeywordContext.class,0);
		}
		public TerminalNode WS() { return getToken(UsecaseReaderParser.WS, 0); }
		public DependencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependency; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).enterDependency(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).exitDependency(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UsecaseReaderVisitor ) return ((UsecaseReaderVisitor<? extends T>)visitor).visitDependency(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DependencyContext dependency() throws RecognitionException {
		DependencyContext _localctx = new DependencyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dependency);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__7);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
				{
				setState(78);
				specialKeyword();
				}
			}

			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(81);
				match(WS);
				}
				break;
			}
			setState(84);
			statement();
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

	public static class GeneralizationContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SpecialKeywordContext specialKeyword() {
			return getRuleContext(SpecialKeywordContext.class,0);
		}
		public TerminalNode WS() { return getToken(UsecaseReaderParser.WS, 0); }
		public GeneralizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).enterGeneralization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).exitGeneralization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UsecaseReaderVisitor ) return ((UsecaseReaderVisitor<? extends T>)visitor).visitGeneralization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneralizationContext generalization() throws RecognitionException {
		GeneralizationContext _localctx = new GeneralizationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_generalization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__8);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
				{
				setState(87);
				specialKeyword();
				}
			}

			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(90);
				match(WS);
				}
				break;
			}
			setState(93);
			statement();
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

	public static class FlowContext extends ParserRuleContext {
		public StepsContext steps() {
			return getRuleContext(StepsContext.class,0);
		}
		public PostConditionContext postCondition() {
			return getRuleContext(PostConditionContext.class,0);
		}
		public FlowTypeContext flowType() {
			return getRuleContext(FlowTypeContext.class,0);
		}
		public TerminalNode WS() { return getToken(UsecaseReaderParser.WS, 0); }
		public TerminalNode EOL() { return getToken(UsecaseReaderParser.EOL, 0); }
		public RfsContext rfs() {
			return getRuleContext(RfsContext.class,0);
		}
		public FlowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).enterFlow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).exitFlow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UsecaseReaderVisitor ) return ((UsecaseReaderVisitor<? extends T>)visitor).visitFlow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlowContext flow() throws RecognitionException {
		FlowContext _localctx = new FlowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_flow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(95);
			flowType();
			setState(96);
			match(WS);
			setState(97);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(98);
			match(EOL);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(100);
				rfs();
				}
			}

			setState(103);
			steps();
			setState(104);
			postCondition();
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

	public static class FlowTypeContext extends ParserRuleContext {
		public FlowTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flowType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).enterFlowType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).exitFlowType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UsecaseReaderVisitor ) return ((UsecaseReaderVisitor<? extends T>)visitor).visitFlowType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlowTypeContext flowType() throws RecognitionException {
		FlowTypeContext _localctx = new FlowTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_flowType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
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

	public static class RfsContext extends ParserRuleContext {
		public FlowTypeContext flowType() {
			return getRuleContext(FlowTypeContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(UsecaseReaderParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(UsecaseReaderParser.WS, i);
		}
		public List<TerminalNode> Number() { return getTokens(UsecaseReaderParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(UsecaseReaderParser.Number, i);
		}
		public TerminalNode EOL() { return getToken(UsecaseReaderParser.EOL, 0); }
		public RfsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rfs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).enterRfs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).exitRfs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UsecaseReaderVisitor ) return ((UsecaseReaderVisitor<? extends T>)visitor).visitRfs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RfsContext rfs() throws RecognitionException {
		RfsContext _localctx = new RfsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rfs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__15);
			setState(109);
			flowType();
			setState(110);
			match(WS);
			setState(111);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(112);
			match(WS);
			setState(113);
			match(Number);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(114);
				match(T__16);
				setState(115);
				match(Number);
				}
			}

			setState(118);
			match(EOL);
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

	public static class StepsContext extends ParserRuleContext {
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public List<ConditionalLogicContext> conditionalLogic() {
			return getRuleContexts(ConditionalLogicContext.class);
		}
		public ConditionalLogicContext conditionalLogic(int i) {
			return getRuleContext(ConditionalLogicContext.class,i);
		}
		public StepsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_steps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).enterSteps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).exitSteps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UsecaseReaderVisitor ) return ((UsecaseReaderVisitor<? extends T>)visitor).visitSteps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepsContext steps() throws RecognitionException {
		StepsContext _localctx = new StepsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_steps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(122);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Number:
					{
					setState(120);
					step();
					}
					break;
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
					{
					setState(121);
					conditionalLogic();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << Number))) != 0) );
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

	public static class StepContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(UsecaseReaderParser.Number, 0); }
		public TerminalNode WS() { return getToken(UsecaseReaderParser.WS, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode EOL() { return getToken(UsecaseReaderParser.EOL, 0); }
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).exitStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UsecaseReaderVisitor ) return ((UsecaseReaderVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(Number);
			setState(127);
			match(WS);
			setState(128);
			sentence();
			setState(129);
			match(EOL);
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

	public static class SentenceContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SpecialKeywordContext specialKeyword() {
			return getRuleContext(SpecialKeywordContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UsecaseReaderVisitor ) return ((UsecaseReaderVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(131);
				statement();
				}
				break;
			}
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
				{
				setState(134);
				specialKeyword();
				}
			}

			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Word) | (1L << Number) | (1L << Punctuation) | (1L << WS))) != 0)) {
				{
				setState(137);
				statement();
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

	public static class SpecialKeywordContext extends ParserRuleContext {
		public SpecialKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).enterSpecialKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).exitSpecialKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UsecaseReaderVisitor ) return ((UsecaseReaderVisitor<? extends T>)visitor).visitSpecialKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialKeywordContext specialKeyword() throws RecognitionException {
		SpecialKeywordContext _localctx = new SpecialKeywordContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_specialKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
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

	public static class ConditionalLogicContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(UsecaseReaderParser.EOL, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConditionalLogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalLogic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).enterConditionalLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).exitConditionalLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UsecaseReaderVisitor ) return ((UsecaseReaderVisitor<? extends T>)visitor).visitConditionalLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalLogicContext conditionalLogic() throws RecognitionException {
		ConditionalLogicContext _localctx = new ConditionalLogicContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conditionalLogic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				{
				setState(142);
				match(T__21);
				}
				break;
			case T__22:
				{
				setState(143);
				match(T__22);
				}
				break;
			case T__23:
				{
				setState(144);
				match(T__23);
				}
				break;
			case T__24:
				{
				setState(145);
				match(T__24);
				}
				break;
			case T__25:
			case T__26:
				{
				setState(146);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==T__26) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(147);
				statement();
				setState(148);
				match(T__27);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(152);
			match(EOL);
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

	public static class PostConditionContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOL() { return getToken(UsecaseReaderParser.EOL, 0); }
		public PostConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).enterPostCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).exitPostCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UsecaseReaderVisitor ) return ((UsecaseReaderVisitor<? extends T>)visitor).visitPostCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostConditionContext postCondition() throws RecognitionException {
		PostConditionContext _localctx = new PostConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_postCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__28);
			setState(155);
			statement();
			setState(156);
			match(EOL);
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
		public List<TerminalNode> Word() { return getTokens(UsecaseReaderParser.Word); }
		public TerminalNode Word(int i) {
			return getToken(UsecaseReaderParser.Word, i);
		}
		public List<TerminalNode> Number() { return getTokens(UsecaseReaderParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(UsecaseReaderParser.Number, i);
		}
		public List<TerminalNode> Punctuation() { return getTokens(UsecaseReaderParser.Punctuation); }
		public TerminalNode Punctuation(int i) {
			return getToken(UsecaseReaderParser.Punctuation, i);
		}
		public List<TerminalNode> WS() { return getTokens(UsecaseReaderParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(UsecaseReaderParser.WS, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsecaseReaderListener ) ((UsecaseReaderListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UsecaseReaderVisitor ) return ((UsecaseReaderVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(158);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Word) | (1L << Number) | (1L << Punctuation) | (1L << WS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(161); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00a6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\6\2+\n\2\r\2\16\2,\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3\67\n\3\3\3\3\3\6\3;\n\3\r\3\16\3<\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\5\tR\n\t\3\t\5"+
		"\tU\n\t\3\t\3\t\3\n\3\n\5\n[\n\n\3\n\5\n^\n\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13h\n\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\rw\n\r\3\r\3\r\3\16\3\16\6\16}\n\16\r\16\16\16~\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\5\20\u0087\n\20\3\20\5\20\u008a\n\20\3\20\5\20\u008d"+
		"\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0099\n\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\24\6\24\u00a2\n\24\r\24\16\24\u00a3\3"+
		"\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\t\3\2\6\7\3\2"+
		"\b\t\3\2\f\r\3\2\16\21\3\2\24\27\3\2\34\35\4\2 \"$$\2\u00aa\2*\3\2\2\2"+
		"\4.\3\2\2\2\6>\3\2\2\2\bA\3\2\2\2\nD\3\2\2\2\fG\3\2\2\2\16M\3\2\2\2\20"+
		"O\3\2\2\2\22X\3\2\2\2\24a\3\2\2\2\26l\3\2\2\2\30n\3\2\2\2\32|\3\2\2\2"+
		"\34\u0080\3\2\2\2\36\u0086\3\2\2\2 \u008e\3\2\2\2\"\u0098\3\2\2\2$\u009c"+
		"\3\2\2\2&\u00a1\3\2\2\2(+\5\4\3\2)+\7#\2\2*(\3\2\2\2*)\3\2\2\2+,\3\2\2"+
		"\2,*\3\2\2\2,-\3\2\2\2-\3\3\2\2\2./\5\6\4\2/:\7#\2\2\60;\5\24\13\2\61"+
		"\67\5\b\5\2\62\67\5\n\6\2\63\67\5\f\7\2\64\67\5\20\t\2\65\67\5\22\n\2"+
		"\66\61\3\2\2\2\66\62\3\2\2\2\66\63\3\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2"+
		"\678\3\2\2\289\7#\2\29;\3\2\2\2:\60\3\2\2\2:\66\3\2\2\2;<\3\2\2\2<:\3"+
		"\2\2\2<=\3\2\2\2=\5\3\2\2\2>?\7\3\2\2?@\5&\24\2@\7\3\2\2\2AB\7\4\2\2B"+
		"C\5&\24\2C\t\3\2\2\2DE\7\5\2\2EF\5&\24\2F\13\3\2\2\2GH\5\16\b\2HI\7$\2"+
		"\2IJ\t\2\2\2JK\7$\2\2KL\5&\24\2L\r\3\2\2\2MN\t\3\2\2N\17\3\2\2\2OQ\7\n"+
		"\2\2PR\5 \21\2QP\3\2\2\2QR\3\2\2\2RT\3\2\2\2SU\7$\2\2TS\3\2\2\2TU\3\2"+
		"\2\2UV\3\2\2\2VW\5&\24\2W\21\3\2\2\2XZ\7\13\2\2Y[\5 \21\2ZY\3\2\2\2Z["+
		"\3\2\2\2[]\3\2\2\2\\^\7$\2\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\5&\24\2"+
		"`\23\3\2\2\2ab\5\26\f\2bc\7$\2\2cd\t\4\2\2de\7#\2\2eg\3\2\2\2fh\5\30\r"+
		"\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\5\32\16\2jk\5$\23\2k\25\3\2\2\2lm\t"+
		"\5\2\2m\27\3\2\2\2no\7\22\2\2op\5\26\f\2pq\7$\2\2qr\t\4\2\2rs\7$\2\2s"+
		"v\7!\2\2tu\7\23\2\2uw\7!\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7#\2\2y\31"+
		"\3\2\2\2z}\5\34\17\2{}\5\"\22\2|z\3\2\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2"+
		"\2~\177\3\2\2\2\177\33\3\2\2\2\u0080\u0081\7!\2\2\u0081\u0082\7$\2\2\u0082"+
		"\u0083\5\36\20\2\u0083\u0084\7#\2\2\u0084\35\3\2\2\2\u0085\u0087\5&\24"+
		"\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u008a"+
		"\5 \21\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b"+
		"\u008d\5&\24\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\37\3\2\2"+
		"\2\u008e\u008f\t\6\2\2\u008f!\3\2\2\2\u0090\u0099\7\30\2\2\u0091\u0099"+
		"\7\31\2\2\u0092\u0099\7\32\2\2\u0093\u0099\7\33\2\2\u0094\u0095\t\7\2"+
		"\2\u0095\u0096\5&\24\2\u0096\u0097\7\36\2\2\u0097\u0099\3\2\2\2\u0098"+
		"\u0090\3\2\2\2\u0098\u0091\3\2\2\2\u0098\u0092\3\2\2\2\u0098\u0093\3\2"+
		"\2\2\u0098\u0094\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7#\2\2\u009b"+
		"#\3\2\2\2\u009c\u009d\7\37\2\2\u009d\u009e\5&\24\2\u009e\u009f\7#\2\2"+
		"\u009f%\3\2\2\2\u00a0\u00a2\t\b\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3"+
		"\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\'\3\2\2\2\24*,\66"+
		":<QTZ]gv|~\u0086\u0089\u008c\u0098\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}