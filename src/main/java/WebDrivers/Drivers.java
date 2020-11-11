package WebDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.Config;
import LogHandler.Log;

/*
 * This file contains the Web Driver Initialization and contains reference to all the kind of
 * web browser's drivers which are compatible with the framework.
 */
public class Drivers {
	protected static WebDriver driver;
	protected String browser;
	protected String URL = Config.getProperty("URL");
	public boolean launch() {
		if(initialiseWebDriver())
			if(lauchBrowser(URL))
				return true;
		return false;
	}
	private boolean closeBrowser() {
		driver.quit();
		return true;
	}
	private boolean lauchBrowser(String URL) {
		driver.get(URL);
		return true;
	}
	public static boolean initialiseWebDriver() {
		try {
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			Log.info("Setting Chrome driver");
			return true;
		}catch (Exception unableToIntialise) {
			Log.error("Unable to initialise Web Driver");
		}
		return false;
	}
}