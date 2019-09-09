package metamodels;

public class Association implements AssociationInterface {
	
	public static int ASSOCIATION_TYPE_DEPENDENCY = 1;
	
	public static int ASSOCIATION_TYPE_GENERALIZATION = 2;
	
	protected BasicElementInterface firstEnd;
	
	protected BasicElementInterface secondEnd;
	
	protected int associationType;
	
	public Association(BasicElementInterface source, int type) {
		firstEnd = source;
		associationType = type;
	}

	public BasicElementInterface getFirstEnd() {
		return firstEnd;
	}

	public BasicElementInterface getSecondEnd() {
		return secondEnd;
	}

	public void setSecondEnd(BasicElementInterface destination) {
		secondEnd = destination;
	}

	public int getAssociationType() {
		return associationType;
	}

}
