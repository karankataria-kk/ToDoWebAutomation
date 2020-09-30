package Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import LogHandler.Log;

public class Config {
	public static Properties prop;
	private String configFilePath = "\\src\\main\\resources\\Configuarations\\config.properties";

	public Config(){
		try {
			if(prop == null) {
				prop = new Properties();
				FileInputStream fis = new FileInputStream(configFilePath);
				prop.load(fis);
			}
		}
		catch(Exception fileLoadError){
			Log.error("File Not Found / Unable to access the file.");
			fileLoadError.toString();
		}
	}
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}
	public static void setProperty(String key, String value) {
		prop.setProperty(key, value);
		Log.info("Setting property key and value -> " + key + " - " + value);
	}
}
