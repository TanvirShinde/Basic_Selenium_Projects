package Basic;

import org.testng.annotations.Test;

public class IfweDontConsiderTestCaseToExecute {

	@Test ( priority = 2)
	public void testcase1 ()  {
		
		System.out.println("First test case got executed");
	}
	
	@Test ( priority = 4)
	public void testcase2 ()  {
		
		System.out.println("2nd test case got executed");
	}
	
	@Test  ( priority = -1 )
	public void testcase3 ()  {
		
		System.out.println("3rd test case got executed");
	}
	
	@Test ( enabled = false)
	public void testcase4 ()  {
		
		System.out.println("fourth test case got executed");
	}
}
