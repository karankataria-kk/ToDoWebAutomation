package LogHandler;

import org.apache.log4j.Logger;
public class Log {
	final static Logger logger = Logger.getLogger(Log.class);
	public static void info(String message){
		logger.info(message);			
	}
	public static void warn(String message) {
		logger.warn(message);
	}
	public static void error(String message) {
		logger.error(message);
	}
	public static void fatal(String message) {
		logger.fatal(message);
	}
	public void debug(String message) {
		logger.debug(message);
	}
}