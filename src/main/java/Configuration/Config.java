package Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import LogHandler.Log;

public class Config {
	public Properties prop;
	private String configFilePath = "\\src\\main\\resources\\Configuarations\\config.properties";

	public Config() throws IOException {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(configFilePath);
			prop.load(fis);
		}
		catch(Exception fileLoadError){
			Log.error("");
			fileLoadError.toString();
		}
	}

}
