package Basic;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Simple4 {

	@Test ( priority =3 , invocationCount = 5 )
	public void testcase1 ()  {
		
		Reporter.log("TC1" , true);

	}
	
	@Test ( priority = 1 , enabled = false)
	public void testcase2 ()  {
		
		Reporter.log("TestCase2 is passed" , true);
		System.out.println("2nd test case got executed");
	}
	
	@Test  ( priority = 2 , timeOut = 60000)
	public void testcase3 ()  {
		Reporter.log("TestCase3 is passed" , true);
		System.out.println("3rd test case got executed");
		
		Assert.fail();
	}
	
	@Test ( priority =4)
	public void testcase4 ()  {
		Reporter.log("TestCase4 is passed" , true);
		System.out.println("fourth test case got executed");
	}
}
