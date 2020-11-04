package UseCases;

import Configuration.Config;
import TestCases.Case1;

public class TestCase1 extends Case1{
	static String homePageURL = Config.getProperty("homepage.url");
	public static void Test1() {
		Case1.getRequiredFieldLabels();
	}
}