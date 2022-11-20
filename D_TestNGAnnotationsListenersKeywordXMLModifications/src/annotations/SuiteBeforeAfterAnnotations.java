package annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteBeforeAfterAnnotations {
	@BeforeSuite
	public void beforeSuite () {
		
		Reporter.log("Before suit" , true);
	}
	
	@BeforeClass
	public void beforeClassMethod () {
		
		System.out.println("Before Class Method is executing");
	}
	

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
	
	@AfterClass
	public void afterClassMethod () {
		
		System.out.println("after Class Method is executing");
	}
	@AfterSuite
	public void afterSuite () {
		
		Reporter.log("after suite" , true);
	}
}
