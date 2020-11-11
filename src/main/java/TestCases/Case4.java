package TestCases;

import org.openqa.selenium.By;

import Locators.UILocators;
import LogHandler.Log;
import PageObject.PageObject;

public class Case4 extends PageObject{
	protected static void submitForm() {
		try {
			driver.findElement(By.xpath(UILocators.HomePage.submitButton_xpath)).click();
			Log.info("Click on Submit Button");
		}catch (Exception submitButtonNotAvailable) {
			Log.error("Unable to submit the form");
		}
	}
}