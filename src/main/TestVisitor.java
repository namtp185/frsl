package main;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import parser.*;
import metamodels.*;

public class TestVisitor<T> extends UsecaseReaderBaseVisitor<T>
{
	FRSLModel model = new FRSLModel();
	UsecaseInterface currentUsecase;
	
	public T visitUsecaseList(UsecaseReaderParser.UsecaseListContext ctx)
	{
		return visitChildren(ctx);
	}
	
	public T visitUsecase(UsecaseReaderParser.UsecaseContext ctx) {
		currentUsecase = null;
		return visitChildren(ctx);
	}
	
	public T visitUcName(UsecaseReaderParser.UcNameContext ctx)
	{
		String ucName = ctx.statement().getText();
		currentUsecase = model.createUsecase(ucName);
		return visitChildren(ctx);
	}
	
	public T visitBriefDesc(UsecaseReaderParser.BriefDescContext ctx) {
		String text = ctx.statement().getText();
		currentUsecase.getDescription().setText(text);
		return visitChildren(ctx);
	}
	
	public T visitPrecondition(UsecaseReaderParser.PreconditionContext ctx) {
		String text = ctx.statement().getText();
		currentUsecase.getPrecondition().setText(text);
		return visitChildren(ctx);
	}
	
	public T visitActor(UsecaseReaderParser.ActorContext ctx) {
		String actorName = ctx.statement().getText();
		if (!"None".equals(actorName)) {
			ActorInterface actor = model.createActor(actorName);
			currentUsecase.addActor(actor, true);
		}
		return visitChildren(ctx);
	}
	
	public T visitFlow(UsecaseReaderParser.FlowContext ctx)
	{
		T temp = visitChildren(ctx);
		return temp;
	}
	
	public T visitStep(UsecaseReaderParser.StepContext ctx)
	{
		return visitChildren(ctx);
	}
	
	public T visitConditionalLogic(UsecaseReaderParser.ConditionalLogicContext ctx)
	{
		return visitChildren(ctx);
	}
	
	public T visitPostCondition(UsecaseReaderParser.PostConditionContext ctx)
	{
		return visitChildren(ctx);
	}
}
