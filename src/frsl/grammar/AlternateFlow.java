package frsl.grammar;

import frsl.metamodel.FlowStep;
import frsl.metamodel.NavigableStep;

public class AlternateFlow {
	private String name;
	private NavigableStep alternateSteps;
	private String start;
	private String end;
	private NavigableStep startStep;
	private NavigableStep endStep;
	private String description;
	
	public AlternateFlow(String name, String description, NavigableStep alternateSteps,
				String start, String end,
				NavigableStep startStep, NavigableStep endStep
			) {
		this.name = name;
		this.alternateSteps = alternateSteps;
		this.start = start;
		this.end = end;
		this.startStep = startStep;
		this.endStep = endStep;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	
	public NavigableStep getFirstStep() {
		return alternateSteps;
	}
	
	public String getStart() {
		return start;
	}
	
	public String getEnd() {
		return end;
	}
	
	public String getDescription() {
		return this.description;
	}
}
