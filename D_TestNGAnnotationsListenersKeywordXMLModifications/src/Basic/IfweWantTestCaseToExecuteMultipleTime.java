package Basic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IfweWantTestCaseToExecuteMultipleTime {

	
	@Test ( priority = 1)
	public void testcase1 ()  {
		
		System.out.println("First test case got executed");
	}
	
	@Test ( invocationCount = 5)
	public void testcase2 ()  {
		
		Reporter.log("Test case2 executes 5 time" , true);
		
		System.out.println("2nd test case got executed");
		
	
	}
	
	@Test (invocationCount = 5 , priority = -3)
	public void testcase3 ()  {
		
		System.out.println("First test case got executed");
	}
	
}
