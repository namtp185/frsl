package metamodels;

import java.util.Map;
import java.util.TreeMap;

public class FRSLModel {
	
	protected Map<String, UsecaseInterface> usecases;
	
	protected Map<String, ActorInterface> actors;
	
	public FRSLModel() {
		usecases = new TreeMap<String, UsecaseInterface>();
		actors = new TreeMap<String, ActorInterface>();
	}
	
	public UsecaseInterface createUsecase(String name) {
		UsecaseInterface usecase = new Usecase(name);
		usecases.put(name, usecase);
		return usecase;
	}
	
	public ActorInterface createActor(String name) {
		ActorInterface actor = new Actor(name);
		actors.put(name, actor);
		return actor;
	}

}
