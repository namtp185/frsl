// Generated from src/frsl/grammar/FRSL.g4 by ANTLR 4.8

package frsl.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FRSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NEWLINE=15, STATEMENT=16, 
		PHRASE=17, LETTER=18, NUMBER=19, WS=20;
	public static final int
		RULE_metaModel = 0, RULE_useCaseName = 1, RULE_useCaseDescription = 2, 
		RULE_actors = 3, RULE_precondition = 4, RULE_postcondition = 5, RULE_trigger = 6, 
		RULE_specialRequirement = 7, RULE_flows = 8, RULE_use_case_name = 9, RULE_use_case_description = 10, 
		RULE_actor_names = 11, RULE_actor_name = 12, RULE_pre_condition = 13, 
		RULE_post_condition = 14, RULE_trigger_info = 15, RULE_special_requirement = 16, 
		RULE_basicFlow = 17, RULE_alternativeFlows = 18, RULE_basicStep = 19, 
		RULE_alternativeFlow = 20, RULE_step = 21, RULE_condition = 22, RULE_aFlow = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"metaModel", "useCaseName", "useCaseDescription", "actors", "precondition", 
			"postcondition", "trigger", "specialRequirement", "flows", "use_case_name", 
			"use_case_description", "actor_names", "actor_name", "pre_condition", 
			"post_condition", "trigger_info", "special_requirement", "basicFlow", 
			"alternativeFlows", "basicStep", "alternativeFlow", "step", "condition", 
			"aFlow"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'UseCase :'", "'BriefDescription :'", "'Actors :'", "'Precondition :'", 
			"'Postcondition :'", "'Trigger :'", "'SpecialRequirement :'", "','", 
			"'BasicFlow :'", "'AlternativeFlows :'", "':'", "'Step '", "'Condition '", 
			"'Flow '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NEWLINE", "STATEMENT", "PHRASE", "LETTER", "NUMBER", 
			"WS"
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
	public String getGrammarFileName() { return "FRSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FRSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MetaModelContext extends ParserRuleContext {
		public UseCaseNameContext useCaseName() {
			return getRuleContext(UseCaseNameContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FRSLParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FRSLParser.NEWLINE, i);
		}
		public ActorsContext actors() {
			return getRuleContext(ActorsContext.class,0);
		}
		public FlowsContext flows() {
			return getRuleContext(FlowsContext.class,0);
		}
		public UseCaseDescriptionContext useCaseDescription() {
			return getRuleContext(UseCaseDescriptionContext.class,0);
		}
		public PreconditionContext precondition() {
			return getRuleContext(PreconditionContext.class,0);
		}
		public PostconditionContext postcondition() {
			return getRuleContext(PostconditionContext.class,0);
		}
		public TriggerContext trigger() {
			return getRuleContext(TriggerContext.class,0);
		}
		public SpecialRequirementContext specialRequirement() {
			return getRuleContext(SpecialRequirementContext.class,0);
		}
		public MetaModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metaModel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterMetaModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitMetaModel(this);
		}
	}

	public final MetaModelContext metaModel() throws RecognitionException {
		MetaModelContext _localctx = new MetaModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_metaModel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			useCaseName();
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(49);
				match(NEWLINE);
				setState(50);
				useCaseDescription();
				}
				break;
			}
			setState(53);
			match(NEWLINE);
			setState(54);
			actors();
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(55);
				match(NEWLINE);
				setState(56);
				precondition();
				}
				break;
			}
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(59);
				match(NEWLINE);
				setState(60);
				postcondition();
				}
				break;
			}
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(63);
				match(NEWLINE);
				setState(64);
				trigger();
				}
				break;
			}
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(67);
				match(NEWLINE);
				setState(68);
				specialRequirement();
				}
				break;
			}
			setState(71);
			match(NEWLINE);
			setState(72);
			flows();
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

	public static class UseCaseNameContext extends ParserRuleContext {
		public Use_case_nameContext use_case_name() {
			return getRuleContext(Use_case_nameContext.class,0);
		}
		public UseCaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useCaseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterUseCaseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitUseCaseName(this);
		}
	}

	public final UseCaseNameContext useCaseName() throws RecognitionException {
		UseCaseNameContext _localctx = new UseCaseNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_useCaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__0);
			setState(75);
			use_case_name();
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

	public static class UseCaseDescriptionContext extends ParserRuleContext {
		public Use_case_descriptionContext use_case_description() {
			return getRuleContext(Use_case_descriptionContext.class,0);
		}
		public UseCaseDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useCaseDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterUseCaseDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitUseCaseDescription(this);
		}
	}

	public final UseCaseDescriptionContext useCaseDescription() throws RecognitionException {
		UseCaseDescriptionContext _localctx = new UseCaseDescriptionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_useCaseDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__1);
			setState(78);
			use_case_description();
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

	public static class ActorsContext extends ParserRuleContext {
		public Actor_namesContext actor_names() {
			return getRuleContext(Actor_namesContext.class,0);
		}
		public ActorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterActors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitActors(this);
		}
	}

	public final ActorsContext actors() throws RecognitionException {
		ActorsContext _localctx = new ActorsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_actors);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__2);
			setState(81);
			actor_names();
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
		public Pre_conditionContext pre_condition() {
			return getRuleContext(Pre_conditionContext.class,0);
		}
		public PreconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterPrecondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitPrecondition(this);
		}
	}

	public final PreconditionContext precondition() throws RecognitionException {
		PreconditionContext _localctx = new PreconditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_precondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__3);
			setState(84);
			pre_condition();
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

	public static class PostconditionContext extends ParserRuleContext {
		public Post_conditionContext post_condition() {
			return getRuleContext(Post_conditionContext.class,0);
		}
		public PostconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postcondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterPostcondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitPostcondition(this);
		}
	}

	public final PostconditionContext postcondition() throws RecognitionException {
		PostconditionContext _localctx = new PostconditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_postcondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__4);
			setState(87);
			post_condition();
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

	public static class TriggerContext extends ParserRuleContext {
		public Trigger_infoContext trigger_info() {
			return getRuleContext(Trigger_infoContext.class,0);
		}
		public TriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterTrigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitTrigger(this);
		}
	}

	public final TriggerContext trigger() throws RecognitionException {
		TriggerContext _localctx = new TriggerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_trigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__5);
			setState(90);
			trigger_info();
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

	public static class SpecialRequirementContext extends ParserRuleContext {
		public Special_requirementContext special_requirement() {
			return getRuleContext(Special_requirementContext.class,0);
		}
		public SpecialRequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialRequirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterSpecialRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitSpecialRequirement(this);
		}
	}

	public final SpecialRequirementContext specialRequirement() throws RecognitionException {
		SpecialRequirementContext _localctx = new SpecialRequirementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_specialRequirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__6);
			setState(93);
			special_requirement();
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

	public static class FlowsContext extends ParserRuleContext {
		public BasicFlowContext basicFlow() {
			return getRuleContext(BasicFlowContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(FRSLParser.NEWLINE, 0); }
		public AlternativeFlowsContext alternativeFlows() {
			return getRuleContext(AlternativeFlowsContext.class,0);
		}
		public FlowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterFlows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitFlows(this);
		}
	}

	public final FlowsContext flows() throws RecognitionException {
		FlowsContext _localctx = new FlowsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_flows);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			basicFlow();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(96);
				match(NEWLINE);
				setState(97);
				alternativeFlows();
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

	public static class Use_case_nameContext extends ParserRuleContext {
		public TerminalNode PHRASE() { return getToken(FRSLParser.PHRASE, 0); }
		public Use_case_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_case_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterUse_case_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitUse_case_name(this);
		}
	}

	public final Use_case_nameContext use_case_name() throws RecognitionException {
		Use_case_nameContext _localctx = new Use_case_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_use_case_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(PHRASE);
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

	public static class Use_case_descriptionContext extends ParserRuleContext {
		public TerminalNode STATEMENT() { return getToken(FRSLParser.STATEMENT, 0); }
		public Use_case_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_case_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterUse_case_description(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitUse_case_description(this);
		}
	}

	public final Use_case_descriptionContext use_case_description() throws RecognitionException {
		Use_case_descriptionContext _localctx = new Use_case_descriptionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_use_case_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(STATEMENT);
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

	public static class Actor_namesContext extends ParserRuleContext {
		public List<Actor_nameContext> actor_name() {
			return getRuleContexts(Actor_nameContext.class);
		}
		public Actor_nameContext actor_name(int i) {
			return getRuleContext(Actor_nameContext.class,i);
		}
		public Actor_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterActor_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitActor_names(this);
		}
	}

	public final Actor_namesContext actor_names() throws RecognitionException {
		Actor_namesContext _localctx = new Actor_namesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_actor_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(106);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(104);
					match(T__7);
					}
					break;
				case PHRASE:
					{
					setState(105);
					actor_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 || _la==PHRASE );
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

	public static class Actor_nameContext extends ParserRuleContext {
		public TerminalNode PHRASE() { return getToken(FRSLParser.PHRASE, 0); }
		public Actor_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterActor_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitActor_name(this);
		}
	}

	public final Actor_nameContext actor_name() throws RecognitionException {
		Actor_nameContext _localctx = new Actor_nameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_actor_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(PHRASE);
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

	public static class Pre_conditionContext extends ParserRuleContext {
		public TerminalNode STATEMENT() { return getToken(FRSLParser.STATEMENT, 0); }
		public Pre_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterPre_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitPre_condition(this);
		}
	}

	public final Pre_conditionContext pre_condition() throws RecognitionException {
		Pre_conditionContext _localctx = new Pre_conditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pre_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(STATEMENT);
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

	public static class Post_conditionContext extends ParserRuleContext {
		public TerminalNode STATEMENT() { return getToken(FRSLParser.STATEMENT, 0); }
		public Post_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_post_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterPost_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitPost_condition(this);
		}
	}

	public final Post_conditionContext post_condition() throws RecognitionException {
		Post_conditionContext _localctx = new Post_conditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_post_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(STATEMENT);
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

	public static class Trigger_infoContext extends ParserRuleContext {
		public TerminalNode STATEMENT() { return getToken(FRSLParser.STATEMENT, 0); }
		public Trigger_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterTrigger_info(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitTrigger_info(this);
		}
	}

	public final Trigger_infoContext trigger_info() throws RecognitionException {
		Trigger_infoContext _localctx = new Trigger_infoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_trigger_info);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(STATEMENT);
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

	public static class Special_requirementContext extends ParserRuleContext {
		public TerminalNode STATEMENT() { return getToken(FRSLParser.STATEMENT, 0); }
		public Special_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterSpecial_requirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitSpecial_requirement(this);
		}
	}

	public final Special_requirementContext special_requirement() throws RecognitionException {
		Special_requirementContext _localctx = new Special_requirementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_special_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(STATEMENT);
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

	public static class BasicFlowContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(FRSLParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FRSLParser.NEWLINE, i);
		}
		public List<BasicStepContext> basicStep() {
			return getRuleContexts(BasicStepContext.class);
		}
		public BasicStepContext basicStep(int i) {
			return getRuleContext(BasicStepContext.class,i);
		}
		public BasicFlowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicFlow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterBasicFlow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitBasicFlow(this);
		}
	}

	public final BasicFlowContext basicFlow() throws RecognitionException {
		BasicFlowContext _localctx = new BasicFlowContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_basicFlow);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__8);
			setState(121);
			match(NEWLINE);
			setState(124); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(124);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__11:
					case T__12:
						{
						setState(122);
						basicStep();
						}
						break;
					case NEWLINE:
						{
						setState(123);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(126); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class AlternativeFlowsContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(FRSLParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FRSLParser.NEWLINE, i);
		}
		public List<AlternativeFlowContext> alternativeFlow() {
			return getRuleContexts(AlternativeFlowContext.class);
		}
		public AlternativeFlowContext alternativeFlow(int i) {
			return getRuleContext(AlternativeFlowContext.class,i);
		}
		public AlternativeFlowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternativeFlows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterAlternativeFlows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitAlternativeFlows(this);
		}
	}

	public final AlternativeFlowsContext alternativeFlows() throws RecognitionException {
		AlternativeFlowsContext _localctx = new AlternativeFlowsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_alternativeFlows);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__9);
			setState(129);
			match(NEWLINE);
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(132);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__13:
					{
					setState(130);
					alternativeFlow();
					}
					break;
				case NEWLINE:
					{
					setState(131);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__13 || _la==NEWLINE );
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

	public static class BasicStepContext extends ParserRuleContext {
		public StepContext step() {
			return getRuleContext(StepContext.class,0);
		}
		public TerminalNode STATEMENT() { return getToken(FRSLParser.STATEMENT, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BasicStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterBasicStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitBasicStep(this);
		}
	}

	public final BasicStepContext basicStep() throws RecognitionException {
		BasicStepContext _localctx = new BasicStepContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_basicStep);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				step();
				setState(137);
				match(T__10);
				setState(138);
				match(STATEMENT);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				condition();
				setState(141);
				match(T__10);
				setState(142);
				match(STATEMENT);
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

	public static class AlternativeFlowContext extends ParserRuleContext {
		public AFlowContext aFlow() {
			return getRuleContext(AFlowContext.class,0);
		}
		public TerminalNode PHRASE() { return getToken(FRSLParser.PHRASE, 0); }
		public List<BasicStepContext> basicStep() {
			return getRuleContexts(BasicStepContext.class);
		}
		public BasicStepContext basicStep(int i) {
			return getRuleContext(BasicStepContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FRSLParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FRSLParser.NEWLINE, i);
		}
		public AlternativeFlowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternativeFlow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterAlternativeFlow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitAlternativeFlow(this);
		}
	}

	public final AlternativeFlowContext alternativeFlow() throws RecognitionException {
		AlternativeFlowContext _localctx = new AlternativeFlowContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_alternativeFlow);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			aFlow();
			setState(147);
			match(T__10);
			setState(148);
			match(PHRASE);
			setState(151); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(151);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__11:
					case T__12:
						{
						setState(149);
						basicStep();
						}
						break;
					case NEWLINE:
						{
						setState(150);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(153); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class StepContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(FRSLParser.LETTER, 0); }
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitStep(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__11);
			setState(156);
			match(LETTER);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(FRSLParser.LETTER, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__12);
			setState(159);
			match(LETTER);
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

	public static class AFlowContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(FRSLParser.LETTER, 0); }
		public AFlowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aFlow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).enterAFlow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRSLListener ) ((FRSLListener)listener).exitAFlow(this);
		}
	}

	public final AFlowContext aFlow() throws RecognitionException {
		AFlowContext _localctx = new AFlowContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_aFlow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__13);
			setState(162);
			match(LETTER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u00a7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\5\2\66\n\2\3\2\3\2\3\2\3\2\5\2<\n\2\3\2\3\2\5\2@\n\2\3\2"+
		"\3\2\5\2D\n\2\3\2\3\2\5\2H\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\5"+
		"\ne\n\n\3\13\3\13\3\f\3\f\3\r\3\r\6\rm\n\r\r\r\16\rn\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\6\23\177\n\23\r"+
		"\23\16\23\u0080\3\24\3\24\3\24\3\24\6\24\u0087\n\24\r\24\16\24\u0088\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0093\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\6\26\u009a\n\26\r\26\16\26\u009b\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\2\2\2\u009d\2\62\3\2\2\2\4L\3\2\2\2\6O\3\2\2\2\bR\3\2\2\2"+
		"\nU\3\2\2\2\fX\3\2\2\2\16[\3\2\2\2\20^\3\2\2\2\22a\3\2\2\2\24f\3\2\2\2"+
		"\26h\3\2\2\2\30l\3\2\2\2\32p\3\2\2\2\34r\3\2\2\2\36t\3\2\2\2 v\3\2\2\2"+
		"\"x\3\2\2\2$z\3\2\2\2&\u0082\3\2\2\2(\u0092\3\2\2\2*\u0094\3\2\2\2,\u009d"+
		"\3\2\2\2.\u00a0\3\2\2\2\60\u00a3\3\2\2\2\62\65\5\4\3\2\63\64\7\21\2\2"+
		"\64\66\5\6\4\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\7\21\2\2"+
		"8;\5\b\5\29:\7\21\2\2:<\5\n\6\2;9\3\2\2\2;<\3\2\2\2<?\3\2\2\2=>\7\21\2"+
		"\2>@\5\f\7\2?=\3\2\2\2?@\3\2\2\2@C\3\2\2\2AB\7\21\2\2BD\5\16\b\2CA\3\2"+
		"\2\2CD\3\2\2\2DG\3\2\2\2EF\7\21\2\2FH\5\20\t\2GE\3\2\2\2GH\3\2\2\2HI\3"+
		"\2\2\2IJ\7\21\2\2JK\5\22\n\2K\3\3\2\2\2LM\7\3\2\2MN\5\24\13\2N\5\3\2\2"+
		"\2OP\7\4\2\2PQ\5\26\f\2Q\7\3\2\2\2RS\7\5\2\2ST\5\30\r\2T\t\3\2\2\2UV\7"+
		"\6\2\2VW\5\34\17\2W\13\3\2\2\2XY\7\7\2\2YZ\5\36\20\2Z\r\3\2\2\2[\\\7\b"+
		"\2\2\\]\5 \21\2]\17\3\2\2\2^_\7\t\2\2_`\5\"\22\2`\21\3\2\2\2ad\5$\23\2"+
		"bc\7\21\2\2ce\5&\24\2db\3\2\2\2de\3\2\2\2e\23\3\2\2\2fg\7\23\2\2g\25\3"+
		"\2\2\2hi\7\22\2\2i\27\3\2\2\2jm\7\n\2\2km\5\32\16\2lj\3\2\2\2lk\3\2\2"+
		"\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o\31\3\2\2\2pq\7\23\2\2q\33\3\2\2\2rs"+
		"\7\22\2\2s\35\3\2\2\2tu\7\22\2\2u\37\3\2\2\2vw\7\22\2\2w!\3\2\2\2xy\7"+
		"\22\2\2y#\3\2\2\2z{\7\13\2\2{~\7\21\2\2|\177\5(\25\2}\177\7\21\2\2~|\3"+
		"\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081%\3\2\2\2\u0082\u0083\7\f\2\2\u0083\u0086\7\21\2\2\u0084\u0087\5"+
		"*\26\2\u0085\u0087\7\21\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\'\3\2\2\2"+
		"\u008a\u008b\5,\27\2\u008b\u008c\7\r\2\2\u008c\u008d\7\22\2\2\u008d\u0093"+
		"\3\2\2\2\u008e\u008f\5.\30\2\u008f\u0090\7\r\2\2\u0090\u0091\7\22\2\2"+
		"\u0091\u0093\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u008e\3\2\2\2\u0093)\3"+
		"\2\2\2\u0094\u0095\5\60\31\2\u0095\u0096\7\r\2\2\u0096\u0099\7\23\2\2"+
		"\u0097\u009a\5(\25\2\u0098\u009a\7\21\2\2\u0099\u0097\3\2\2\2\u0099\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"+\3\2\2\2\u009d\u009e\7\16\2\2\u009e\u009f\7\24\2\2\u009f-\3\2\2\2\u00a0"+
		"\u00a1\7\17\2\2\u00a1\u00a2\7\24\2\2\u00a2/\3\2\2\2\u00a3\u00a4\7\20\2"+
		"\2\u00a4\u00a5\7\24\2\2\u00a5\61\3\2\2\2\21\65;?CGdln~\u0080\u0086\u0088"+
		"\u0092\u0099\u009b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}