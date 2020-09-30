package LogHandler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.log4j.Logger;
public class Log {
	final static Logger logger = Logger.getLogger(Log.class); 
	public static String currentDateAndTime() {    
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		return dtf.format(now);  
	}    
	public static void info(String message){
		logger.info(currentDateAndTime() + " - INFO - " + message);			
	}
	public static void warn(String message) {
		logger.warn(currentDateAndTime() + " - WARNING - " + message);
	}
	public static void error(String message) {
		logger.error(currentDateAndTime() + " - ERROR - " + message);
	}
	public static void fatal(String message) {
		logger.fatal(currentDateAndTime() + " - FATAL - " + message);
	}
	public void debug(String message) {
		logger.debug(currentDateAndTime() + " - DEBUG - " + message);
	}
}