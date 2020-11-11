package TestCases;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import Locators.UILocators;
import LogHandler.Log;
import PageObject.PageObject;

public class Case2 extends PageObject{
	/**
	 * Test Case 2: Verify all input fields using Soft assertions.
	 */
	protected static SoftAssert softAssertion = new SoftAssert();
	protected static boolean inputStatus = false;
	protected static void inputFirstLastName(String fName, String lName){
		try{
			driver.findElement(By.xpath(UILocators.HomePage.firstName_xpath)).sendKeys(fName);
			Log.info("Entering First name - " + fName);
			driver.findElement(By.xpath(UILocators.HomePage.lastName_xpath)).sendKeys(lName);
			Log.info("Entering Last name - " + lName);
			inputStatus = true;
		}catch(Exception inputFieldsNotFound) {
			inputStatus = false;
		}
		softAssertion.assertTrue(inputStatus,"Unable to enter the first and last name");
	}
	protected static void inputCurrentCompany(String currentCompanyName) {
		try{
			driver.findElement(By.xpath(UILocators.HomePage.currentCompany_xpath)).sendKeys(currentCompanyName);
			Log.info("Entering current company details - " + currentCompanyName);
			inputStatus = true;
		}catch(Exception inputFieldsNotFound) {
			inputStatus = false;
		}
		softAssertion.assertTrue(inputStatus, "Unable to enter current company details");
	}
	protected static void inputEmailId(String emailId) {
		try{
			driver.findElement(By.xpath(UILocators.HomePage.email_xpath)).sendKeys(emailId);
			Log.info("Entering Email id - " + emailId);
			inputStatus = true;
		}catch(Exception inputFieldsNotFound) {
			inputStatus = false;
		}
		softAssertion.assertTrue(inputStatus, "Unable to enter email id");
	}
	protected static void mobileNumberInput(String mobileNumber) {
		try{
			driver.findElement(By.xpath(UILocators.HomePage.mobileNumber_xpath)).sendKeys(mobileNumber);
			Log.info("Entering Mobile Number - " + mobileNumber);
			inputStatus = true;
		}catch(Exception inputFieldsNotFound) {
			inputStatus = false;
		}
		softAssertion.assertTrue(inputStatus,"Unable to enter mobile number");
	}
	protected static void dateOfBirthInput(String dob) {
		try{
			driver.findElement(By.xpath(UILocators.HomePage.dateOfBirth_xpath)).sendKeys(dob);
			Log.info("Entering Date of birth - " + dob);
			inputStatus = true;
		}catch(Exception inputFieldsNotFound) {
			inputStatus = false;
		}
		softAssertion.assertTrue(inputStatus, "Unabe to enter date of birth");
	}
	protected static void inputPosition(String position) {
		try{
			driver.findElement(By.xpath(UILocators.HomePage.position_xpath)).sendKeys(position);
			Log.info("Entering position - " + position);
			inputStatus = true;
		}catch(Exception inputFieldsNotFound) {
			inputStatus = false;
		}
		softAssertion.assertTrue(inputStatus, "Unable to enter position");
	}
	protected static void inputPortfolioWebsite(String portfolio) {
		try{
			if(portfolio.contains("http"))
				driver.findElement(By.xpath(UILocators.HomePage.portfolio_xpath)).clear();
			driver.findElement(By.xpath(UILocators.HomePage.portfolio_xpath)).sendKeys(portfolio);
			Log.info("Entering Portfolio website details - " + portfolio);
			inputStatus = true;
		}catch(Exception inputFieldsNotFound) {
			inputStatus = false;
		}
		softAssertion.assertTrue(inputStatus, "Unable to add portfolio website");
	}
	protected static void inputSalaryRequirements(String salary) {
		try{
			driver.findElement(By.xpath(UILocators.HomePage.salary_xpath)).sendKeys(salary);
			Log.info("Entering Salary requirements - " + salary);
			inputStatus = true;
		}catch(Exception inputFieldsNotFound) {
			inputStatus = false;
		}
		softAssertion.assertTrue(inputStatus, "Unable to enter Salry requirements");
	}
	protected static void inputStartDate(String startDate) {
		try{
			driver.findElement(By.xpath(UILocators.HomePage.startInfo_xpath)).sendKeys(startDate);
			inputStatus = true;
			Log.info("Entering Start date - " + startDate);
		}catch(Exception inputFieldsNotFound) {
			inputStatus = false;
		}
		softAssertion.assertTrue(inputStatus, "Unable to input start date");
	}
	protected static void inputAddress(String address) {
		try{
			driver.findElement(By.xpath(UILocators.HomePage.address_xpath)).sendKeys(address);
			Log.info("Entering Address - " + address);
			inputStatus = true;
		}catch(Exception inputFieldsNotFound) {
			inputStatus = false;
		}
		softAssertion.assertTrue(inputStatus);
	}
	protected static void inputResumeFilePath(String filePath) {
		try{
			driver.findElement(By.xpath(UILocators.HomePage.uploadResumePath_xpath)).sendKeys(filePath);
			Log.info("Entering resume file path - " + filePath);
			inputStatus = true;
		}catch(Exception inputFieldsNotFound) {
			inputStatus = false;
		}
		softAssertion.assertTrue(inputStatus, "Unable to add resume file");
	}
	protected static void inputRelocateStatus(String relocteStatus) {
		try{
			if(relocteStatus.equalsIgnoreCase("yes"))
				driver.findElement(By.xpath(UILocators.HomePage.yesRadioButton_xpath)).click();
			else if(relocteStatus.equalsIgnoreCase("no"))
				driver.findElement(By.xpath(UILocators.HomePage.noRadioButton_xpath)).click();
			else
				driver.findElement(By.xpath(UILocators.HomePage.notSureRadioButton_xpath)).click();
			Log.info("Setting relocation status to - " + relocteStatus);
			inputStatus = true;
		}catch(Exception inputFieldsNotFound) {
			inputStatus = false;
		}
		softAssertion.assertTrue(inputStatus, "Unable to add relocation status");
	}
}