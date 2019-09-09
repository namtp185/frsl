package metamodels;

public class TextualElement implements TextualElementInterface {

	protected String etext;
	
	public TextualElement() {
		setText("");
	}
	
	public TextualElement(String text) {
		setText(text);
	}
	
	public String getText() {
		return etext;
	}

	public void setText(String text) {
		etext = text;
	}

}
