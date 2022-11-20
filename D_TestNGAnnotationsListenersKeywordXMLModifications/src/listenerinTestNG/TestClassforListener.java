package listenerinTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class  TestClassforListener{

	@Test (priority = 1)
	public void testCase1 () {
		
		Reporter.log("TC1", true);
	}
	
	@Test (priority = 2)
	public void testCase2 () {
		
		Reporter.log("TC2", true);
	}
	
	@Test (priority = 3)
	public void testCase3 () {
		
		Reporter.log("TC3", true);
	}
	
	@Test (priority = 4)
	public void testCase4 () {
		
		Reporter.log("TC4", true);
		
		Assert.fail();
	}
	
	@Test (priority = 5 , dependsOnMethods = "testCase4" )
	
	public void testCase5 () {
		
		Reporter.log("TC5", true);
	}
}
