package UseCases;

import Configuration.Config;
import LogHandler.Log;
import TestCases.Case2;

public class TestCase2 extends Case2{
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
					
	public static void Test2() {
		Log.info("************ Test Case 2 ************");
		Case2.inputFirstLastName(fName, lName);
		Case2.inputEmailId(emailId);
		Case2.inputCurrentCompany(currentCompanyName);
		Case2.mobileNumberInput(mobileNumber);
		Case2.dateOfBirthInput(dob);
		Case2.inputPosition(position);
		Case2.inputPortfolioWebsite(portfolio);
		Case2.inputSalaryRequirements(salary);
		Case2.inputStartDate(startDate);
		Case2.inputAddress(address);
		Case2.inputResumeFilePath(filePath);
		Case2.inputRelocateStatus(relocateStatus);
	}
}
