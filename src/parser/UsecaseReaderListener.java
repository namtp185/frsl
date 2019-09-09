// Generated from UsecaseReader.g4 by ANTLR 4.7.2
package parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UsecaseReaderParser}.
 */
public interface UsecaseReaderListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UsecaseReaderParser#usecaseList}.
	 * @param ctx the parse tree
	 */
	void enterUsecaseList(UsecaseReaderParser.UsecaseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UsecaseReaderParser#usecaseList}.
	 * @param ctx the parse tree
	 */
	void exitUsecaseList(UsecaseReaderParser.UsecaseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UsecaseReaderParser#usecase}.
	 * @param ctx the parse tree
	 */
	void enterUsecase(UsecaseReaderParser.UsecaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link UsecaseReaderParser#usecase}.
	 * @param ctx the parse tree
	 */
	void exitUsecase(UsecaseReaderParser.UsecaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link UsecaseReaderParser#ucName}.
	 * @param ctx the parse tree
	 */
	void enterUcName(UsecaseReaderParser.UcNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UsecaseReaderParser#ucName}.
	 * @param ctx the parse tree
	 */
	void exitUcName(UsecaseReaderParser.UcNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UsecaseReaderParser#briefDesc}.
	 * @param ctx the parse tree
	 */
	void enterBriefDesc(UsecaseReaderParser.BriefDescContext ctx);
	/**
	 * Exit a parse tree produced by {@link UsecaseReaderParser#briefDesc}.
	 * @param ctx the parse tree
	 */
	void exitBriefDesc(UsecaseReaderParser.BriefDescContext ctx);
	/**
	 * Enter a parse tree produced by {@link UsecaseReaderParser#precondition}.
	 * @param ctx the parse tree
	 */
	void enterPrecondition(UsecaseReaderParser.PreconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UsecaseReaderParser#precondition}.
	 * @param ctx the parse tree
	 */
	void exitPrecondition(UsecaseReaderParser.PreconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UsecaseReaderParser#actor}.
	 * @param ctx the parse tree
	 */
	void enterActor(UsecaseReaderParser.ActorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UsecaseReaderParser#actor}.
	 * @param ctx the parse tree
	 */
	void exitActor(UsecaseReaderParser.ActorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UsecaseReaderParser#actorType}.
	 * @param ctx the parse tree
	 */
	void enterActorType(UsecaseReaderParser.ActorTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UsecaseReaderParser#actorType}.
	 * @param ctx the parse tree
	 */
	void exitActorType(UsecaseReaderParser.ActorTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UsecaseReaderParser#dependency}.
	 * @param ctx the parse tree
	 */
	void enterDependency(UsecaseReaderParser.DependencyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UsecaseReaderParser#dependency}.
	 * @param ctx the parse tree
	 */
	void exitDependency(UsecaseReaderParser.DependencyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UsecaseReaderParser#generalization}.
	 * @param ctx the parse tree
	 */
	void enterGeneralization(UsecaseReaderParser.GeneralizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UsecaseReaderParser#generalization}.
	 * @param ctx the parse tree
	 */
	void exitGeneralization(UsecaseReaderParser.GeneralizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UsecaseReaderParser#flow}.
	 * @param ctx the parse tree
	 */
	void enterFlow(UsecaseReaderParser.FlowContext ctx);
	/**
	 * Exit a parse tree produced by {@link UsecaseReaderParser#flow}.
	 * @param ctx the parse tree
	 */
	void exitFlow(UsecaseReaderParser.FlowContext ctx);
	/**
	 * Enter a parse tree produced by {@link UsecaseReaderParser#flowType}.
	 * @param ctx the parse tree
	 */
	void enterFlowType(UsecaseReaderParser.FlowTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UsecaseReaderParser#flowType}.
	 * @param ctx the parse tree
	 */
	void exitFlowType(UsecaseReaderParser.FlowTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UsecaseReaderParser#rfs}.
	 * @param ctx the parse tree
	 */
	void enterRfs(UsecaseReaderParser.RfsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UsecaseReaderParser#rfs}.
	 * @param ctx the parse tree
	 */
	void exitRfs(UsecaseReaderParser.RfsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UsecaseReaderParser#steps}.
	 * @param ctx the parse tree
	 */
	void enterSteps(UsecaseReaderParser.StepsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UsecaseReaderParser#steps}.
	 * @param ctx the parse tree
	 */
	void exitSteps(UsecaseReaderParser.StepsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UsecaseReaderParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(UsecaseReaderParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link UsecaseReaderParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(UsecaseReaderParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link UsecaseReaderParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(UsecaseReaderParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link UsecaseReaderParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(UsecaseReaderParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link UsecaseReaderParser#specialKeyword}.
	 * @param ctx the parse tree
	 */
	void enterSpecialKeyword(UsecaseReaderParser.SpecialKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link UsecaseReaderParser#specialKeyword}.
	 * @param ctx the parse tree
	 */
	void exitSpecialKeyword(UsecaseReaderParser.SpecialKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link UsecaseReaderParser#conditionalLogic}.
	 * @param ctx the parse tree
	 */
	void enterConditionalLogic(UsecaseReaderParser.ConditionalLogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link UsecaseReaderParser#conditionalLogic}.
	 * @param ctx the parse tree
	 */
	void exitConditionalLogic(UsecaseReaderParser.ConditionalLogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link UsecaseReaderParser#postCondition}.
	 * @param ctx the parse tree
	 */
	void enterPostCondition(UsecaseReaderParser.PostConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UsecaseReaderParser#postCondition}.
	 * @param ctx the parse tree
	 */
	void exitPostCondition(UsecaseReaderParser.PostConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UsecaseReaderParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(UsecaseReaderParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UsecaseReaderParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(UsecaseReaderParser.StatementContext ctx);
}