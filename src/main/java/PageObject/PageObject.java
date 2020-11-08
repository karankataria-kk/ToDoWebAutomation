package PageObject;

import org.openqa.selenium.By;

import Configuration.Config;
import Locators.UILocators;
import LogHandler.Log;
import Synchronisation.Synchronise;
import WebDrivers.Drivers;

public class PageObject extends Drivers{
	static String logFilePath = "src\\main\\java\\LogHandler\\log4j.xml";
	static String pageLoadingTime = Config.getProperty("page.load.time");
	static String homePageURL = Config.getProperty("homepage.url");
	static String username = Config.getProperty("signin.username");
	static String password = Config.getProperty("signin.password");
	protected static int pageLoadTime = Integer.parseInt(pageLoadingTime);
	public static void init() {
		Log.initializeLog(Log.class, logFilePath);
		Drivers.initialiseWebDriver();
		navigateToHomePage(homePageURL);
	}
	protected static void navigateToHomePage(String homePageURL) {
		if(lookForAlert()) {
			homePageURL = allowAuthentication(homePageURL, username, password);
		}
		homePageURL = verifyURL(homePageURL);
		driver.get(homePageURL);
		Log.info("Navigating to Home page --> " + homePageURL);
		Synchronise.delay(pageLoadTime);
	}
	private static String verifyURL(String homePageURL) {
		if(!homePageURL.contains("http://"))
			homePageURL = "http://" + homePageURL;
		// TODO Auto-generated method stub
		return homePageURL;
	}
	protected static boolean lookForAlert(){
		Synchronise.delay(pageLoadTime);
		try 
		{ 
			driver.findElement(By.xpath(UILocators.HomePage.sourceFuseImageLogo_xpath));
			Log.info("Authentication already done");
			return false;
		}
		catch (Exception NoAlertPresent) 
		{ 
			Log.info("Alert Encountered");
			return true; 
		}
	}
	protected static String allowAuthentication(String homePageURL, String username, String password) {
		Log.info("Changing home page URL to authenticate home page with credentials");
		homePageURL = username + ":" + password + "@" + homePageURL;
		Config.setProperty("homepage.url", homePageURL);
		return homePageURL;
	}
	public static void closeBrowser() {
		driver.quit();
	}
}
