package Locators;

public class UILocators {
	public static final class HomePage{
		public static final String sourceFuseImageLogo_xpath = "//img[@alt='SourceFuse']";
		public static final String formInputs_xpath = "//div[@class='container']//form//div//div//label";
		public static final String firstName_xpath = "//div[@id='fnameInput']//input[@type='text']";
		public static final String lastName_xpath = "//div[@id='lnameInput']//input[@type='text']";
		public static final String email_xpath = "//input[@type='email']";
		public static final String currentCompany_xpath = "//div[@id='curCompanyInput']//input[@type='text']";
		public static final String mobileNumber_xpath = "//input[@type='tel']";
		public static final String dateOfBirth_xpath = "//div[@class='input-group date']//input[@type='text']";
		public static final String position_xpath = "//div[@id='positionInput']//input[@type='text']";
		public static final String portfolio_xpath = "//input[@value='http://']";
		public static final String salary_xpath = "//div[@id='salaryInput']//input[@type='text']";
		public static final String startInfo_xpath = "//div[@id='whenStartInput']//input[@type='text']";
		public static final String address_xpath = "//textarea[@id='address']";
		public static final String uploadResumePath_xpath = "/html/body/div/form/div[7]/div[1]/div/div/input";
		public static final String yesRadioButton_xpath = "//input[@id='yes']";
		public static final String noRadioButton_xpath = "//input[@id='no']";
		public static final String notSureRadioButton_xpath = "//input[@id='notSure']";
		public static final String submitButton_xpath = "//div[@id='resumeInput']";
		public static final String resetButton_xpath = "//button[normalize-space()='Reset Form']";
	}
}

