package LogHandler;

import org.apache.log4j.Logger;
import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
public class Log {
	final Logger logger = Logger.getLogger(Log.class);
	public void info(String message){
		logger.info(message);			
	}
	public void warn(String message) {
		logger.warn(message);
	}
	public void error(String message) {
		logger.error(message);
	}
	public void fatal(String message) {
		logger.fatal(message);
	}
	public void debug(String message) {
		logger.debug(message);
	}
}