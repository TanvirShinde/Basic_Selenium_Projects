package Basic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Simple2 {

	@Test ( priority =3)
	public void testcase1 ()  {
		
		Reporter.log("TestCase1 is passed" , true);

	}
	
	@Test ( priority =1 )
	public void testcase2 ()  {
		
		Reporter.log("TestCase2 is passed" , false);
		System.out.println("2nd test case got executed");
	}
	
	@Test  ( priority = 2 )
	public void testcase3 ()  {
		Reporter.log("TestCase3 is passed" , true);
		System.out.println("3rd test case got executed");
	}
	
	@Test ( priority =4)
	public void testcase4 ()  {
		Reporter.log("TestCase4 is passed" , false);
		System.out.println("fourth test case got executed");
	}
}
