package frsl.grammar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import frsl.metamodel.ConditionStep;
import frsl.metamodel.DefaultUsecaseV2;
import frsl.metamodel.DescriptionInfo;
import frsl.metamodel.FlowStep;
import frsl.metamodel.NavigableStep;
import frsl.metamodel.SequenceStep;
import frsl.metamodel.UseCase;
import frsl.metamodel.UseCaseV2;
import frsl.metamodel.flow_step.ActorStep;
import frsl.metamodel.flow_step.SystemStep;
import frsl.util.FlowStepTypeChecker;
import frsl.util.MetamodelUtil;

/**
 * create an usecase with a linked-list of flowstep
 */
public class FRSLWalkerV2 extends FRSLBaseListener {

	private UseCase metaModel;
	private UseCaseV2 improvedMetaModel;

	private String lastStepName;

	// for quickly access step in basic flow
	private Map<String, NavigableStep> stepGetterBasicFlow = new HashMap<>();
	private FlowStep basicSteps;
	private FlowStep preStep;
	
	// store alternative flows by their name
	private Map<String, AlternateFlow> alternateFlows = new HashMap<>(); 
	private FlowStep alternateSteps;
	private FlowStep preAlternateStep;
	private String start;
	private String end;

	private static final String BASIC_FLOW = "Basic Flow";

	private String currentFlowName;
	private String currentFlowDescription;
	
	private boolean isFirstStep = true;
	private boolean isFirstAlternateStep = true;

	public UseCaseV2 getMetaModel() {
		return this.improvedMetaModel;
	}

	private void track(NavigableStep flowStep) {
		stepGetterBasicFlow.put(flowStep.getName(), flowStep);
	}
	
	@Override
	public void enterBasicFlow(FRSLParser.BasicFlowContext ctx) {
		currentFlowName = BASIC_FLOW;
	}

	@Override
	public void exitBasicFlow(FRSLParser.BasicFlowContext ctx) {
		improvedMetaModel.addBasicFlow(basicSteps);
	}

	@Override
	public void enterBasicStep(FRSLParser.BasicStepContext ctx) {
		if(currentFlowName == BASIC_FLOW) {
			createABasicStep(ctx);
		} else {
			createAnAlternateStep(ctx);
		}
	}
	
	private void createABasicStep(FRSLParser.BasicStepContext ctx) {
		FlowStep currentStep;
		currentStep = new SequenceStep();

		if (ctx.condition() != null)
			currentStep = new ConditionStep();
		// if(ctx.step() != null)

		if (isFirstStep) {
			basicSteps = currentStep;
		}

		currentStep.setType(currentFlowName);

		String flowStepName = ctx.condition() != null ? ctx.condition().LETTER().getText()
				: ctx.step().LETTER().getText();
		currentStep.setName(flowStepName.trim().toLowerCase());
		currentStep.setDescription(ctx.STATEMENT().getText().trim());

		currentStep.setActionDescription(
				currentStep.getDescription().substring(0, currentStep.getDescription().indexOf(".")));
		currentStep.setValid(true);

		if (currentFlowName.equalsIgnoreCase(BASIC_FLOW)) {
			int lastStepIndex = lastStepName != null ? Integer.parseInt(lastStepName) : 0;
			int currentStepIndex = Integer.parseInt(currentStep.getName());
			if (currentStepIndex > lastStepIndex) {
				lastStepName = currentStep.getName();
			}

			currentStep.setId("Step_" + currentStep.getName());
		} else {
			currentStep.setId("Step_" + currentStep.getType().replace(" ", "") + currentStep.getName());
			String fullName = currentStep.getType().replace(" ", "") + currentStep.getName();
			currentStep.setName(fullName);
		}

		if (ctx.condition() != null) {
			currentStep.setName("c" + currentStep.getName());
		}

		if (!isFirstStep) {
			preStep.setNextStep(currentStep);
		}
		
		setActorForFlowStep(currentStep);
		
		stepGetterBasicFlow.put(currentStep.getName(), currentStep);

		preStep = currentStep;
		isFirstStep = false;
	}
	
	private void createAnAlternateStep(FRSLParser.BasicStepContext ctx) {
		FlowStep currentStep;
		currentStep = new SequenceStep();

		if (isFirstAlternateStep) {
			alternateSteps = currentStep;
		}
		
		currentStep.setType(currentFlowName);

		String flowStepName = ctx.step().LETTER().getText();
		currentStep.setName(flowStepName.trim().toLowerCase());
		currentStep.setDescription(ctx.STATEMENT().getText().trim());

		currentStep.setActionDescription(
				currentStep.getDescription().substring(0, currentStep.getDescription().indexOf(".")));
		currentStep.setValid(true);



			currentStep.setId("Step_" + currentStep.getName());

			currentStep.setId("Step_" + currentStep.getType().replace(" ", "") + currentStep.getName());
			String fullName = currentStep.getType().replace(" ", "") + currentStep.getName();
			currentStep.setName(fullName);


		if (!isFirstAlternateStep) {
			preAlternateStep.setNextStep(currentStep);
		}
		
		setActorForFlowStep(currentStep);

		preAlternateStep = currentStep;
		isFirstAlternateStep = false;
	}

	private void setActorForFlowStep(FlowStep flowStep) {
		// Check actor type of flowstep
		HasDescriptionInfo descriptionInfoWrapper = improvedMetaModel;
	
		int type = FlowStepTypeChecker.checkFlowStepType(flowStep, descriptionInfoWrapper);
		// actor type is SystemStep
		if (type == 0) {
			flowStep.setInitiator(new SystemStep());
		}
		// actor type is ActorStep
		if (type == 1) {
			ActorStep as = new ActorStep();
			as.setActorName(MetamodelUtil.findActorNameInSentence(flowStep.getDescription().toLowerCase(),
					descriptionInfoWrapper));
			flowStep.setInitiator(as);
		}
		if (type == -1) {
			flowStep.setValid(false);
		}
	}

	/**
	 * enter alternate flow
	 */

	@Override
	public void enterAlternativeFlow(FRSLParser.AlternativeFlowContext ctx) {
		currentFlowDescription = ctx.PHRASE().toString().trim();
	}
	
	@Override
	public void enterAFlow(FRSLParser.AFlowContext ctx) {
		currentFlowName = ctx.LETTER().getText().trim();
		alternateSteps = null;
		isFirstAlternateStep = true;
	}
	
	@Override
	public void exitAlternativeFlow(FRSLParser.AlternativeFlowContext ctx) {
		// get next step for last alternate step
		String nextGoTo = checkNextStep(preAlternateStep.getDescription());
		if (nextGoTo != null) {
			NavigableStep nextStep = stepGetterBasicFlow.get(nextGoTo);
			preAlternateStep.setNextStep(nextStep);
		}
		
		start = currentFlowName.substring(0, 1);
		end = nextGoTo;
		AlternateFlow alternateFlow = new AlternateFlow(
				currentFlowName, currentFlowDescription, alternateSteps,
				start, end,
				stepGetterBasicFlow.get(start), stepGetterBasicFlow.get(end)
			);
		
		// add an alternate flow
		alternateFlows.put(alternateFlow.getName(), alternateFlow);
		// add an alternate flow to usecase
		improvedMetaModel.addAlternateFlow(alternateFlow);
	}
	
	private String checkNextStep(String stepDescription) {
		Pattern r = Pattern.compile("(?= then )(?> then ).*step *([A-z0-9]+).*(?>\\.)");
		Matcher m = r.matcher(stepDescription.toLowerCase());
		if (m.find()) {
			String successorStep = m.group(1).trim();
			return successorStep;
		}
		return null;
	}

	public void enterCondition(FRSLParser.ConditionContext ctx) {

	}
	
	public void exitMetaModel(FRSLParser.MetaModelContext ctx) {
		// stub code 
		// no-operation method
	}
	
	/**
	 * create description info
	 */
	
	public void enterMetaModel(FRSLParser.MetaModelContext ctx) {
		improvedMetaModel = new DefaultUsecaseV2();
		improvedMetaModel.setDescriptionInfo(new DescriptionInfo());
	}

	public void enterUse_case_name(FRSLParser.Use_case_nameContext ctx) {
		improvedMetaModel.getDescriptionInfo().setUseCaseName(ctx.getText().trim());
	}

	public void enterUse_case_description(FRSLParser.Use_case_descriptionContext ctx) {
		improvedMetaModel.getDescriptionInfo().setDescription(ctx.getText().trim());
	}

	public void enterActor_names(FRSLParser.Actor_namesContext ctx) {
		improvedMetaModel.getDescriptionInfo().setActors(new ArrayList<String>());
	}

	public void enterActor_name(FRSLParser.Actor_nameContext ctx) {
		improvedMetaModel.getDescriptionInfo().getActors().add(ctx.getText().trim());
	}

	public void enterPre_condition(FRSLParser.Pre_conditionContext ctx) {
		improvedMetaModel.getDescriptionInfo().setPostCondition(ctx.getText().trim());
	}

	public void enterPost_condition(FRSLParser.Post_conditionContext ctx) {
		improvedMetaModel.getDescriptionInfo().setPostCondition(ctx.getText().trim());
	}

	public void enterTrigger_info(FRSLParser.Trigger_infoContext ctx) {
		improvedMetaModel.getDescriptionInfo().setTrigger(ctx.getText().trim());
	}

	public void enterSpecial_requirement(FRSLParser.Special_requirementContext ctx) {
		improvedMetaModel.getDescriptionInfo().setSpecialRequirement(ctx.getText().trim());
	}
}
