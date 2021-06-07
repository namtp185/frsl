package frsl.metamodel;

import java.util.List;

import frsl.grammar.HasDescriptionInfo;

public interface UseCase extends HasDescriptionInfo {

	String toString();

	List<Variable> getVariables();

	void setVariables(List<Variable> variables);

	List<FlowEdge> getFlowEdges();

	void setFlowEdges(List<FlowEdge> flowEdges);

	List<USLNode> getUslNodes();

	void setUslNodes(List<USLNode> uslNodes);

	void track(FlowStep step);

	NavigableStep getFlowStep(String stepName);

	NavigableStep getFlowStep(Integer index);

	Integer getFlowStepIntIndex(String stepName);

	String getFlowStepStringIndex(Integer index);

	String getLastStepName();

	void setLastStepName(String lastStepName);

	String getReferenceAlternateStep(String basicStepName);

}