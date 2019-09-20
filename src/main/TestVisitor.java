package main;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Collection;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import parser.*;
import metamodels.*;
import net.sourceforge.plantuml.SourceStringReader;

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
		model.applySecondEnd(currentUsecase);
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
			ActorInterface actor = model.getActor(actorName);
			if (actor == null) {
				actor = model.createActor(actorName);
			}
			currentUsecase.addActor(actor, true);
			actor.addUsecase(currentUsecase);
		}
		return visitChildren(ctx);
	}
	
	public T visitDependency(UsecaseReaderParser.DependencyContext ctx) {
		String secondUsecaseName = ctx.statement().getText();
		if (!"None".equals(secondUsecaseName)) {
			int associationType = 0;
			String keyword = ctx.specialKeyword().getText();
			if ("INCLUDE USE CASE".equals(keyword)) {
				associationType = Association.ASSOCIATION_TYPE_INCLUDE;
			} else if ("EXTEND USE CASE".equals(keyword)) {
				associationType = Association.ASSOCIATION_TYPE_EXTEND;
			}
			AssociationInterface association = model.createAssociation(currentUsecase.getName() + "::" + secondUsecaseName,
					currentUsecase, associationType, secondUsecaseName);
		}
		return visitChildren(ctx);
	}
	
	public T visitGeneralization(UsecaseReaderParser.GeneralizationContext ctx) {
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
	
	public void generate() {
		try {
			OutputStream png = new FileOutputStream("test.png");
			String source = "@startuml\n";
			
			for(UsecaseInterface usecase : model.getUsecases().values()) {
				source += "(" + usecase.getName() + ")\n";
			};
			
			for(ActorInterface actor : model.getActors().values()) {
				source += ":" + actor.getName() + ":\n";
				for(UsecaseInterface usecase : actor.getUsecases()) {
					source += ":" + actor.getName() + ": --> (" + usecase.getName() + ")\n";
				};
			};
			
			for(AssociationInterface association : model.getAssociations().values()) {
				source += "(" + association.getFirstEnd().getName() + ") .> (" + association.getSecondEnd().getName() + ")";
				if (association.getAssociationType() == Association.ASSOCIATION_TYPE_INCLUDE) {
					source += " : <<include>>";
				}
				else if (association.getAssociationType() == Association.ASSOCIATION_TYPE_EXTEND) {
					source += " : <<extends>>";
				}
				source += "\n";
			};
			
			source += "@enduml\n";
			
			System.out.println(source);
	
			SourceStringReader reader = new SourceStringReader(source);
			// Write the first image to "png"
			String desc = reader.outputImage(png).getDescription();
			// Return a null string if no generation
		}
		catch (Exception e) {
			
		}
	}
}
