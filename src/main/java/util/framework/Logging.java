package util.framework;

public interface Logging {
	
//	public void debug(String msg);

	public void info(String msg);

	public void warn(String msg);

//	public void fatal(String msg);

	public void error(String msg);
	
	public void setLoggerLevel(int i);
	
	public void setLoggerAppender(AppenderStrategy appenderStrategy);
}