package frsl.metamodel;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.google.gson.Gson;

public class UseCase {

	DescriptionInfo descriptionInfo;

	List<Variable> variables;

	List<FlowEdge> flowEdges;

	List<USLNode> uslNodes;
	
	private String lastStepName;
	
	TreeMap<String, FlowStep> tracker = new TreeMap<>();
	TreeMap<Integer, String> indexTracker = new TreeMap<>();
	TreeMap<String, Integer> intIndexTracker = new TreeMap<>();
	

	public String toString() {
		return new Gson().toJson(this);
	}

	public DescriptionInfo getDescriptionInfo() {
		return descriptionInfo;
	}

	public void setDescriptionInfo(DescriptionInfo descriptionInfo) {
		this.descriptionInfo = descriptionInfo;
	}

	public List<Variable> getVariables() {
		return variables;
	}

	public void setVariables(List<Variable> variables) {
		this.variables = variables;
	}

	public List<FlowEdge> getFlowEdges() {
		return flowEdges;
	}

	public void setFlowEdges(List<FlowEdge> flowEdges) {
		this.flowEdges = flowEdges;
	}

	public List<USLNode> getUslNodes() {
		return uslNodes;
	}

	public void setUslNodes(List<USLNode> uslNodes) {
		this.uslNodes = uslNodes;
	}
	
	public void track(FlowStep step) {
		String fullName = step.getName();
//		if(step.getType() != "") {
//			fullName = step.getType().replace(" ", "") + step.getName();
//		} 
		this.tracker.put(fullName, step);
		this.indexTracker.put(uslNodes.size() - 1, fullName);
		this.intIndexTracker.put(fullName, uslNodes.size() - 1);
	}
	
	public FlowStep getFlowStep(String stepName) {
		return this.tracker.get(stepName);
	}
	
	public FlowStep getFlowStep(Integer index) {
		return this.tracker.get(indexTracker.get(index));
	}
	
	public Integer getFlowStepIntIndex(String stepName) {
		return this.intIndexTracker.get(stepName);
	}
	
	public String getFlowStepStringIndex(Integer index) {
		return this.indexTracker.get(index);
	}
	
	public String getLastStepName() {
		return this.lastStepName;
	}
	
	public void setLastStepName(String lastStepName) {
		this.lastStepName = lastStepName;
	}
	
	public String getReferenceAlternateStep(String basicStepName) {
		for(String stepName : this.tracker.keySet()) {
			if(stepName.contains(basicStepName) && !stepName.equals(basicStepName)) {
				return stepName;
			}
		}
		return null;
	}

}