package metamodels;

import java.util.Collection;

public interface UsecaseInterface extends BasicElementInterface {
	
	public TextualElementInterface getDescription();
	
	public TextualElementInterface getPrecondition();

	public ActorInterface getActor(String name);
	
	public ActorInterface getPrimaryActor();
	
	public Collection<ActorInterface> getSecondaryActors();
	
	public void addActor(ActorInterface actor, boolean isPrimary);
	
	public ActorInterface removeActor(String name);
	
}
