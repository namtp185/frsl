package metamodels;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Actor extends BasicElement implements ActorInterface {

	protected Map<String, UsecaseInterface> usecases;

	public Actor(String name) {
		super(name);
		usecases = new TreeMap<String, UsecaseInterface>();
	}
	
	public String getNameString() {
		return ename;
	}
	
	public UsecaseInterface getUsecase(String name) {
		return usecases.get(name);
	}

	public Collection<UsecaseInterface> getUsecases() {
		return usecases.values();
	}

	public void addUsecase(UsecaseInterface usecase) {
		usecases.put(usecase.getName(), usecase);
	}

	public UsecaseInterface removeUsecase(String name) {
		return usecases.remove(name);
	}

}
