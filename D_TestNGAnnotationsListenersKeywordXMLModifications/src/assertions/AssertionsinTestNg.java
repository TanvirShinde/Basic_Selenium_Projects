package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;



public class AssertionsinTestNg {

	@Test
	public void testcase1 () {
		
		Assert.fail();
		
	}
	
	@Test
	public void testcase2 () {
		
		Assert.assertEquals(true, true, "First module  test case got passed");
		
	}
	
	@Test
	public void testcase3 () {
		 System.out.println("Before the assert statement");
		Assert.assertEquals(true, false, "First module test case got passed");
		 System.out.println("after  the assert statement");
		
	}
}
