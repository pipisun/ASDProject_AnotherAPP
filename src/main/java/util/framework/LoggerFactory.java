package util.framework;

public class LoggerFactory implements Provider {

	@Override
	public Logging produce() {
		return LoggingImpl.getInstance();
	}

}
