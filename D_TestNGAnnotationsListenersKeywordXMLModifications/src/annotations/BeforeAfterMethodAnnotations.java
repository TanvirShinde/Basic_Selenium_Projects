package annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodAnnotations {

	@BeforeMethod
	public void beforeMethod () {
		
		Reporter.log("beforeMethod" , true);
	}
	
	
	
	@Test
	public void case1 () {
		
		Reporter.log("Test Case 1" , true);
	}
	@Test
	public void case2 () {
		
		Reporter.log("Test Case 2" , true);
	}
	

	@AfterMethod
	public void afterMethod () {
		
		Reporter.log("AfterMethod" , true);
	}
}
