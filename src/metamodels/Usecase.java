package metamodels;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Usecase extends BasicElement implements UsecaseInterface {

	protected TextualElementInterface description;
	
	protected TextualElementInterface precondition;
	
	protected Map<String, ActorInterface> actors;
	
	protected ActorInterface primaryActor;
	
	public Usecase(String name) {
		super(name);
		actors = new TreeMap<String, ActorInterface>();
		description = new TextualElement();
		precondition = new TextualElement();
	}
	
	public TextualElementInterface getDescription() {
		return description;
	}
	
	public TextualElementInterface getPrecondition() {
		return precondition;
	}

	public ActorInterface getActor(String name) {
		return actors.get(name);
	}

	public ActorInterface getPrimaryActor() {
		return primaryActor;
	}

	public Collection<ActorInterface> getSecondaryActors() {
		Collection<ActorInterface> result = new ArrayList<ActorInterface>();
		Iterator<ActorInterface> it = actors.values().iterator();

		while (it.hasNext()) {
			ActorInterface actor = it.next();
			if (actor != primaryActor) {
				result.add(actor);
			}
		}
		
		return result;
	}

	public void addActor(ActorInterface actor, boolean isPrimary) {
		actors.put(actor.getName(), actor);
		if (isPrimary) {
			primaryActor = actor;
		}
	}

	public ActorInterface removeActor(String name) {
		if (primaryActor.getName().equals(name)) {
			primaryActor = null;
		}
		return actors.remove(name);
	}

}
