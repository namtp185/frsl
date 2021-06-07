package frsl.metamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import frsl.metamodel.flow_step.Action;
import frsl.metamodel.flow_step.Initiator;

public class FlowStep extends USLNode implements NavigableStep {

	private String name;

	private String description;

	private int maxloop = 1;

	private String type;

	private boolean isValid;

	private String actionDescription;

	private List<Action> actions;
	
	private Initiator initiator;
	
	private NavigableStep nextStep = null;
	
	// thesis problem scope expects alternateSteps.size() <= 1 
	private Map<String, NavigableStep> alternateSteps;
	
	private boolean isLastAlternateStep;
	
	private String nextGoTo;

	public FlowStep() {
		alternateSteps = new HashMap<>();
	}
	
	public String toString() {
		return new Gson().toJson(this);
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getMaxloop() {
		return maxloop;
	}

	public void setMaxloop(int maxloop) {
		this.maxloop = maxloop;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public boolean isBasicStep() {
		return this.type == null;
	}
	
	@Override
	public boolean isAlternateStep() {
		return !isBasicStep();
	}
	
	@Override
	public boolean hasAlternateFlow() {
		return this.alternateSteps.size() > 0;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	@Override
	public String getActionDescription() {
		return actionDescription;
	}

	public void setActionDescription(String actionDescription) {
		this.actionDescription = actionDescription;
	}
	
	public void setInitiator(Initiator initiator) {
		this.initiator = initiator;
	}
	
	@Override
	public boolean isActorStep() {
		return initiator.isActorStep();
	}
	
	@Override
	public boolean isSystemStep() {
		return initiator.isSystemStep();
	}
	
	public void setNextStep(NavigableStep step) {
		this.nextStep = step;
	}

	@Override
	public NavigableStep nextStep() {
		return this.nextStep;
	}
	
//	public boolean isLastAlternateStep() {
//		
//	}
//	
//	public void setNextGoTo(String nextGoTo) {
//		this.nextGoTo = nextGoTo;
//	}
//	
//	public String getNextGoTo() {
//		
//	}
}
