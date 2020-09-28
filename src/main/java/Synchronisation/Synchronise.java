package Synchronisation;

import org.openqa.selenium.WebElement;

public class Synchronise {
	public static boolean isDisplayed(WebElement element) {
		boolean isPresent =false;
		if(element.isDisplayed()) 
			isPresent = true;
		return isPresent;
	}
	public static boolean isClicakble(WebElement element) {
		boolean isClickable = false;
		if(isDisplayed(element)) 
			if(element.isEnabled())
				isClickable = true;
		return isClickable;
	}
}