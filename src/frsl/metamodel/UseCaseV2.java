package frsl.metamodel;

import java.util.List;

import frsl.grammar.AlternateFlow;
import frsl.grammar.HasDescriptionInfo;

public interface UseCaseV2 extends HasDescriptionInfo {
	public void addBasicFlow(FlowStep firstStep);
	public void addAlternateFlow(AlternateFlow alternateFlow);
	public NavigableStep getFirstStep();
	
	// get step by name
	public NavigableStep getStep(String name);
	
	// for iterating alternate flow
	public List<AlternateFlow> getAlternateFlowsList();
	public AlternateFlow getAlternateFlow(String flowName);
}
