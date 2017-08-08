package util.framework;

public class AppenderLogs {

	private AppenderStrategy appenderStrategy;

	public AppenderLogs(AppenderStrategy appenderStrategy) {
		this.appenderStrategy = appenderStrategy;
	}

	public void appender(LogItem logitem) {
		if (logitem != null) {
			appenderStrategy.append(logitem);
		} else {
			System.out.println("Logitem is null");
		}
	}

	public AppenderStrategy getAppenderStrategy() {
		return appenderStrategy;
	}

	public void setAppenderStrategy(AppenderStrategy appenderStrategy) {
		this.appenderStrategy = appenderStrategy;
	}

}
