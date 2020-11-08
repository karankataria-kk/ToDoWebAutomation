package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

import Locators.UILocators;
import LogHandler.Log;
import PageObject.PageObject;

public class Case1 extends PageObject{
	/*Case - 1
	 * Try to submit without filling required fields and "Labels" of all the required field
	 * printed on Console. 
	 */
	protected static void getRequiredFieldLabels() {
		List<WebElement> list = driver.findElements(By.xpath(UILocators.HomePage.formInputs_xpath));
		String labelName;
		Log.info("Fetching all the labels and finding fields and labels in the form which are required");
		Log.info("Below metioned are all the names of the fields/labels which are rquired");
		for(int i = 0; i < list.size();i++) {
			labelName = list.get(i).getText();
			if(labelName.contains("*")) {
				Log.info(labelName.replace(" *", ""));
			}
		}
	}
}