package util.framework;

import java.util.Date;

public class ConsoleAppender implements AppenderStrategy {

	@Override
	public void append(LogItem logitem) {
		System.out.println("Log Level:"+logitem.getLoggerlevel());
//		System.out.println("Class Name:"+logitem.getClassName());
//		System.out.println("Event Name:"+logitem.getEventName());
//		System.out.println("Method Name:"+logitem.getMethodName());
		System.out.println("Message:"+logitem.getMessage());
		System.out.println("Date:"+new Date());
	}

}
