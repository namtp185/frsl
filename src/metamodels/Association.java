package metamodels;

public class Association extends BasicElement implements AssociationInterface {

	public static int ASSOCIATION_TYPE_INCLUDE = 1;
	
	public static int ASSOCIATION_TYPE_EXTEND = 2;

	public static int ASSOCIATION_TYPE_GENERALIZATION = 3;

	protected BasicElementInterface firstEnd;

	protected BasicElementInterface secondEnd;

	protected int associationType;

	public Association(String name, BasicElementInterface source, int type) {
		super(name);
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
