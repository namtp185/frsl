package frsl.metamodel.flow_step;

import com.google.gson.Gson;

import frsl.metamodel.FlowStep;

public class SystemStep extends FlowStep implements Initiator {
	
	public String toString() {
		return new Gson().toJson(this);
	}
	
	public boolean isActorStep() {
		return false;
	}
	
	public boolean isSystemStep() {
		return true;
	}
	
}
