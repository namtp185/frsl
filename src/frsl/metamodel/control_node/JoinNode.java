package frsl.metamodel.control_node;

import com.google.gson.Gson;

import frsl.metamodel.ControlNode;

public class JoinNode extends ControlNode {
	
	public String toString() {
		return new Gson().toJson(this);
	}
	
}