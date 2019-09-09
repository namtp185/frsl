package metamodels;

public interface AssociationInterface {
	
	public BasicElementInterface getFirstEnd();
	
	public BasicElementInterface getSecondEnd();
	
	public void setSecondEnd(BasicElementInterface destination);
	
	public int getAssociationType();

}
