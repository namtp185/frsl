package frsl.metamodel;

import java.util.List;
import java.util.TreeMap;

import com.google.gson.Gson;

public class DefaultUseCase implements UseCase {

	DescriptionInfo descriptionInfo;

	List<Variable> variables;

	List<FlowEdge> flowEdges;

	List<USLNode> uslNodes;
	
	private String lastStepName;
	
	TreeMap<String, FlowStep> tracker = new TreeMap<>();
	TreeMap<Integer, String> indexTracker = new TreeMap<>();
	TreeMap<String, Integer> intIndexTracker = new TreeMap<>();
	

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

	@Override
	public DescriptionInfo getDescriptionInfo() {
		return descriptionInfo;
	}

	@Override
	public void setDescriptionInfo(DescriptionInfo descriptionInfo) {
		this.descriptionInfo = descriptionInfo;
	}

	@Override
	public List<Variable> getVariables() {
		return variables;
	}

	@Override
	public void setVariables(List<Variable> variables) {
		this.variables = variables;
	}

	@Override
	public List<FlowEdge> getFlowEdges() {
		return flowEdges;
	}

	@Override
	public void setFlowEdges(List<FlowEdge> flowEdges) {
		this.flowEdges = flowEdges;
	}

	@Override
	public List<USLNode> getUslNodes() {
		return uslNodes;
	}

	@Override
	public void setUslNodes(List<USLNode> uslNodes) {
		this.uslNodes = uslNodes;
	}
	
	@Override
	public void track(FlowStep step) {
		String fullName = step.getName();
//		if(step.getType() != "") {
//			fullName = step.getType().replace(" ", "") + step.getName();
//		} 
		this.tracker.put(fullName, step);
		this.indexTracker.put(uslNodes.size() - 1, fullName);
		this.intIndexTracker.put(fullName, uslNodes.size() - 1);
	}
	
	@Override
	public NavigableStep getFlowStep(String stepName) {
		return this.tracker.get(stepName);
	}
	
	@Override
	public NavigableStep getFlowStep(Integer index) {
		return this.tracker.get(indexTracker.get(index));
	}
	
	@Override
	public Integer getFlowStepIntIndex(String stepName) {
		return this.intIndexTracker.get(stepName);
	}
	
	@Override
	public String getFlowStepStringIndex(Integer index) {
		return this.indexTracker.get(index);
	}
	
	@Override
	public String getLastStepName() {
		return this.lastStepName;
	}
	
	@Override
	public void setLastStepName(String lastStepName) {
		this.lastStepName = lastStepName;
	}
	
	@Override
	public String getReferenceAlternateStep(String basicStepName) {
		for(String stepName : this.tracker.keySet()) {
			if(stepName.contains(basicStepName) && !stepName.equals(basicStepName)) {
				return stepName;
			}
		}
		return null;
	}

}