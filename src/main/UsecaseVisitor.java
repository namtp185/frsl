package main;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import parser.*;
import metamodels.*;
import net.sourceforge.plantuml.FileFormat;
import net.sourceforge.plantuml.FileFormatOption;
import net.sourceforge.plantuml.SourceStringReader;

public class UsecaseVisitor<T> extends UsecaseReaderBaseVisitor<T>
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
			} else if ("EXTENDED BY USE CASE".equals(keyword)) {
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
	
	public void addUseCase(Map<String, String> data) {
		UsecaseInterface newUsecase = model.createUsecase(data.get("Usecase Name"));
		model.applySecondEnd(newUsecase);
		newUsecase.getDescription().setText(data.get("Brief Description"));
		newUsecase.getPrecondition().setText(data.get("Precondition"));
		
		String actorName;
		actorName = data.get("Primary Actor");
		if (!"None".equals(actorName) && !"".equals(actorName)) {
			ActorInterface actor = model.getActor(actorName);
			if (actor == null) {
				actor = model.createActor(actorName);
			}
			newUsecase.addActor(actor, true);
			actor.addUsecase(newUsecase);
		}
		actorName = data.get("Secondary Actors");
		if (!"None".equals(actorName) && !"".equals(actorName)) {
			ActorInterface actor = model.getActor(actorName);
			if (actor == null) {
				actor = model.createActor(actorName);
			}
			newUsecase.addActor(actor, true);
			actor.addUsecase(newUsecase);
		}
		
		String dependencyText = data.get("Dependency");
		String secondUsecaseName = "";
		int associationType = 0;
		if (dependencyText.startsWith("INCLUDE USE CASE")) {
			associationType = Association.ASSOCIATION_TYPE_INCLUDE;
			secondUsecaseName = dependencyText.substring(17);
		} else if (dependencyText.startsWith("EXTENDED BY USE CASE")) {
			associationType = Association.ASSOCIATION_TYPE_EXTEND;
			secondUsecaseName = dependencyText.substring(21);
		}
		if (!"None".equals(secondUsecaseName) && !"".equals(secondUsecaseName)) {
			model.createAssociation(newUsecase.getName() + "::" + secondUsecaseName,
				newUsecase, associationType, secondUsecaseName);
		}
	}
	
	public FRSLModel generate() {
		try {
			OutputStream png = new FileOutputStream("ucDiagram.png");
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
				source += "(" + association.getFirstEnd().getName() + ") ..> (" + association.getSecondEnd().getName() + ")";
				if (association.getAssociationType() == Association.ASSOCIATION_TYPE_INCLUDE) {
					source += " : <<include>>";
				}
				else if (association.getAssociationType() == Association.ASSOCIATION_TYPE_EXTEND) {
					source += " : <<extends>>";
				}
				source += "\n";
			};
			
			source += "@enduml\n";
			
			// System.out.println(source);
	
			SourceStringReader reader = new SourceStringReader(source);
			// Write the first image to "png"
			String desc = reader.outputImage(png).getDescription();
			/*
			 * FileFormat uml = new FileOutputStream("ucDiagram.png"); FileFormatOption
			 * fileFormatOption = new FileFormatOption(uml); String desc1 =
			 * reader.generateDiagramDescription(fileFormatOption);
			 */
			// Return a null string if no generation
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		/* Write abstract syntax (metamodel) to concreate syntax (model) */
		String filePath = "G:\\WORKSPACE\\thesis\\frsl\\src\\model\\FRSL.uml";
		GenerateModel genModel = new GenerateModel(filePath, model);
		genModel.generate();
		/* Write abstract syntax (metamodel) to concreate syntax (model) */
		
		return model;
	}
}
