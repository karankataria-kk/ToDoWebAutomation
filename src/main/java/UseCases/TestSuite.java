package UseCases;

import PageObject.PageObject;

/*
 * This is a test use case file, to run and check what we get after the execution of the
 * test scripts in the framework
 */
public class TestSuite extends PageObject{
	public static void main(String args[]) {
		PageObject.init();
		TestCase1.Test1();
	}
}
