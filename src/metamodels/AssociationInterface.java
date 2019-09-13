package metamodels;

public interface AssociationInterface extends BasicElementInterface {
	
	public BasicElementInterface getFirstEnd();
	
	public BasicElementInterface getSecondEnd();
	
	public void setSecondEnd(BasicElementInterface destination);
	
	public int getAssociationType();

}
