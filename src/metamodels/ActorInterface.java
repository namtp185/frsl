package metamodels;

import java.util.Collection;

public interface ActorInterface extends BasicElementInterface {

	public UsecaseInterface getUsecase(String name);
	
	public Collection<UsecaseInterface> getUsecases();
	
	public void addUsecase(UsecaseInterface usecase);
	
	public UsecaseInterface removeUsecase(String name);
	
}
