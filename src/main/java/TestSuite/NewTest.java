package TestSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.PageObject;
import UseCases.TestCase1;
import UseCases.TestCase2;
import UseCases.TestCase3;
import UseCases.TestCase4;

public class NewTest{
	@BeforeTest
	static void initialiseFrameworkSetup() {
		PageObject.init();
	}
	@Test(priority = 1)
	static void Test1() {
		TestCase1.Test1();
	}
	@Test(priority = 2)
	static void Test2() {
		TestCase2.Test2();
	}
	@Test(priority = 3)
	static void Test3() {
		TestCase3.Test3();
	}
	@Test(priority = 4)
	static void Test4() {
		TestCase4.Test4();
	}
	@AfterTest()
	static void quit() {
		PageObject.closeBrowser();
	}
}