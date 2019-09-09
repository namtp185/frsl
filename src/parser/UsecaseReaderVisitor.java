// Generated from UsecaseReader.g4 by ANTLR 4.7.2
package parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UsecaseReaderParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UsecaseReaderVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UsecaseReaderParser#usecaseList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsecaseList(UsecaseReaderParser.UsecaseListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UsecaseReaderParser#usecase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsecase(UsecaseReaderParser.UsecaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link UsecaseReaderParser#ucName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUcName(UsecaseReaderParser.UcNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UsecaseReaderParser#briefDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBriefDesc(UsecaseReaderParser.BriefDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link UsecaseReaderParser#precondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecondition(UsecaseReaderParser.PreconditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UsecaseReaderParser#actor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActor(UsecaseReaderParser.ActorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UsecaseReaderParser#actorType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActorType(UsecaseReaderParser.ActorTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UsecaseReaderParser#dependency}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependency(UsecaseReaderParser.DependencyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UsecaseReaderParser#generalization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralization(UsecaseReaderParser.GeneralizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UsecaseReaderParser#flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow(UsecaseReaderParser.FlowContext ctx);
	/**
	 * Visit a parse tree produced by {@link UsecaseReaderParser#flowType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlowType(UsecaseReaderParser.FlowTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UsecaseReaderParser#rfs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRfs(UsecaseReaderParser.RfsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UsecaseReaderParser#steps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSteps(UsecaseReaderParser.StepsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UsecaseReaderParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(UsecaseReaderParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link UsecaseReaderParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(UsecaseReaderParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link UsecaseReaderParser#specialKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialKeyword(UsecaseReaderParser.SpecialKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link UsecaseReaderParser#conditionalLogic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalLogic(UsecaseReaderParser.ConditionalLogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link UsecaseReaderParser#postCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostCondition(UsecaseReaderParser.PostConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UsecaseReaderParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(UsecaseReaderParser.StatementContext ctx);
}