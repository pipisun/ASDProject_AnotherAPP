package util.framework;

import java.io.*;
import java.util.Date;

public class FileAppenderSecurityProxy implements AppenderStrategy {
	private FileAppender fileAppender = new FileAppender();

	@Override
	public void append(LogItem logitem) {
		synchronized (FileAppender.getFilename()) {
			fileAppender.append(logitem);
		}
	}
}
