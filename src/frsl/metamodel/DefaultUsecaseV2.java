package frsl.metamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;

import com.google.gson.Gson;

import frsl.grammar.AlternateFlow;

public class DefaultUsecaseV2 implements UseCaseV2 {
	DescriptionInfo descriptionInfo;
	private String lastStepName;
	private NavigableStep firstStep;
	private NavigableStep currentStep;
	
	// for quickly access step in basic flow
	private Map<String, NavigableStep> flowStepGetter;
	
	// store alternate flow indexed by name
	private Map<String, AlternateFlow> alternateFlows = new HashMap<>();
	// store alternate flow with insertion order preserved
	private List<AlternateFlow> alternateFlowsList = new ArrayList<>();
	
	
	public DefaultUsecaseV2() {
		this.flowStepGetter = new HashMap<>();
	}
	
	public void addBasicFlow(FlowStep firstStep) {		
		// update firstStep
		this.firstStep = firstStep;
		
		// track steps
		NavigableStep currentStep = firstStep;
		while(true) {
			track(currentStep);
			if(currentStep.nextStep() == null) {
				// updateLastStepName
				this.lastStepName = currentStep.getName();
				break;
			}
			currentStep = currentStep.nextStep();
		}
	}
	
	public AlternateFlow getAlternateFlow(String flowName) {
		return alternateFlows.get(flowName);
	}
	
	public void addAlternateFlow(AlternateFlow alternateFlow) {
		this.alternateFlows.put(alternateFlow.getName(), alternateFlow);
		this.alternateFlowsList.add(alternateFlow);
	}
	
	public List<AlternateFlow> getAlternateFlowsList() {
		return this.alternateFlowsList;
	}
	
	public void setDescriptionInfo(DescriptionInfo descriptionInfo) {
		this.descriptionInfo = descriptionInfo;
	}
	
	@Override
	public DescriptionInfo getDescriptionInfo() {
		return this.descriptionInfo;
	}
	
	@Override
	public NavigableStep getFirstStep() {
		return this.firstStep;
	}
	
	public NavigableStep getStep(String name) {
		return this.flowStepGetter.get(name);
	}
	
	private void track(NavigableStep flowStep) {
		flowStepGetter.put(flowStep.getName(), flowStep);
	}
	
	private NavigableStep getOriginStep(String alternateStepName) {
		String originStepName = alternateStepName.substring(0, 1);
		return this.flowStepGetter.get(originStepName);
	}
	
	private boolean isNumeric(String stepName) {
		return StringUtils.isNumeric(stepName);
	}
	
	public String toString() {
		return new Gson().toJson(this);
	}
}
