package frsl.metamodel;

public interface NavigableStep {

	public String getName();

	public String getDescription();

	public String getActionDescription();

	public boolean isActorStep();

	public boolean isSystemStep();

	public boolean hasAlternateFlow();

	public NavigableStep nextStep();
	
	public boolean isBasicStep();
	
	public boolean isAlternateStep();
	
	public void setNextStep(NavigableStep step);

}