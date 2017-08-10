package framework.command;

public interface Invoker {

	public void setCommand(Command command);
	
	public void invokeCommand();
}
