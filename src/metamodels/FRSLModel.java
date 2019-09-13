package metamodels;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FRSLModel {

	protected Map<String, UsecaseInterface> usecases;

	protected Map<String, ActorInterface> actors;

	protected Map<String, AssociationInterface> associations;

	protected Map<String, String> pendingAssociations;

	public FRSLModel() {
		usecases = new TreeMap<String, UsecaseInterface>();
		actors = new TreeMap<String, ActorInterface>();
		associations = new TreeMap<String, AssociationInterface>();
		pendingAssociations = new HashMap<String, String>();
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

	public AssociationInterface createAssociation(String name, BasicElementInterface firstEnd, int type, String secondEndName) {
		AssociationInterface association = new Association(name, firstEnd, type);
		associations.put(name, association);
		BasicElementInterface secondEnd = getElement(secondEndName);
		if (secondEnd == null) {
			pendingAssociations.put(name, secondEndName);
		} else {
			association.setSecondEnd(secondEnd);
		}
		return association;
	}

	public void applySecondEnd(BasicElementInterface secondEnd) {
		String secondEndName = secondEnd.getName();
		pendingAssociations.forEach((k, v) -> {
			if (v == secondEndName) {
				getAssociation(k).setSecondEnd(secondEnd);
				pendingAssociations.remove(k);
			}
		});
	}

	public BasicElementInterface getElement(String name) {
		BasicElementInterface result = usecases.get(name);
		if (result == null) {
			result = actors.get(name);
			if (result == null) {
				result = associations.get(name);
			}
		}
		return result;
	}

	public UsecaseInterface getUsecase(String name) {
		return usecases.get(name);
	}

	public ActorInterface getActor(String name) {
		return actors.get(name);
	}

	public AssociationInterface getAssociation(String name) {
		return associations.get(name);
	}

}
