package UseCases;

import Configuration.Config;
import LogHandler.Log;
import TestCases.Case3;

public class TestCase3 extends Case3{
	static String fName = Config.getProperty("first.name");
	static String lName = Config.getProperty("last.name");
	static String emailId = Config.getProperty("email.id");
	static String currentCompanyName = Config.getProperty("current.company");
	static String mobileNumber = Config.getProperty("mobile.number");
	static String dob = Config.getProperty("date.birth");
	static String position = Config.getProperty("applying.position");
	static String portfolio = Config.getProperty("portfolio.website");
	static String salary = Config.getProperty("expected.salary");
	static String startDate = Config.getProperty("start.date");
	static String address = Config.getProperty("address.details");
	static String filePath = Config.getProperty("file.path");
	static String relocateStatus = Config.getProperty("relocation.status");
					
	public static void Test3() {
		Log.info("************ Test Case 3 ************");
		Case3.inputFirstLastName(fName, lName);
		Case3.inputEmailId(emailId);
		Case3.inputCurrentCompany(currentCompanyName);
		Case3.mobileNumberInput(mobileNumber);
		Case3.dateOfBirthInput(dob);
		Case3.inputPosition(position);
		Case3.inputPortfolioWebsite(portfolio);
		Case3.inputSalaryRequirements(salary);
		Case3.inputStartDate(startDate);
		Case3.inputAddress(address);
		Case3.inputResumeFilePath(filePath);
		Case3.inputRelocateStatus(relocateStatus);
	}
}