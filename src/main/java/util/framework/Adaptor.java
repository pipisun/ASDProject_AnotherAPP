package util.framework;

public class Adaptor implements Target {

	private Provider provider = new LoggerFactory();
	private Logging logger = provider.produce();
	private AppenderStrategy appenderStrategy = new FileAppender();// default text file

	private int logLevel = 1;// default is info

	@Override
	public void configLog(int loglevel, int appenderTo) {
		logger.setLoggerLevel(loglevel);
		if (appenderTo == 1) {
			logger.setLoggerAppender(appenderStrategy);
		} else if (appenderTo == 2) {
			appenderStrategy = new ConsoleAppender();
			logger.setLoggerAppender(appenderStrategy);
		}
		this.logLevel = loglevel;
	}

	@Override
	public void setLog(String message) {
		// INFO = 1,WARN = 2,ERROR = 3
		if (logLevel == 1) {
			logger.info(message);
		}
		if (logLevel == 2) {
			logger.warn(message);
		}
		if (logLevel == 3) {
			logger.error(message);
		}
	}

}
