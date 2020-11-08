package UseCases;

import LogHandler.Log;
import TestCases.Case4;

public class TestCase4 extends Case4{
	public static void Test4() {
		Log.info("************ Test Case 4 ************");
		Case4.submitForm();
	}
}
