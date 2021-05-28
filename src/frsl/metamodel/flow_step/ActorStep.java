package frsl.metamodel.flow_step;

import com.google.gson.Gson;

import frsl.metamodel.FlowStep;

public class ActorStep extends FlowStep implements Initiator {

	private String actorName;

	public String toString() {
		return new Gson().toJson(this);
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public boolean isActorStep() {
		return true;
	}
	
	public boolean isSystemStep() {
		return false;
	}
	
}
