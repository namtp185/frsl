package metamodels;

public class BasicElement implements BasicElementInterface {

	protected String ename;
	
	public BasicElement(String name) {
		setName(name);
	}
	
	public String getName() {
		return ename;
	}

	public void setName(String name) {
		ename = name;
	}

}
