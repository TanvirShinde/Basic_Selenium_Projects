package beforeSuiteAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationInTestNG {

	@BeforeSuite
	public void beforeSuite () {
		
		Reporter.log("Before suite" , true);
	}
	
	@BeforeTest
	public void beforeTest () {
		
		System.out.println("Before test annotation from testing class");
	}
	
	@AfterTest
	public void afterTest () {
		
		System.out.println("After test annotation from testing class");
		
	}
	
	@AfterSuite
	public void afterSuite () {
		
		Reporter.log("After suite" , true);
	}
	
	@BeforeMethod
	public void beforeMethod () {
		
		Reporter.log("Before method" , true);
	}
	
	@Test
	public void testcase1 () {
		
		Reporter.log("test case 1" , true);
	}
	
	@Test
	public void testcase2 () {
		
		Reporter.log("test case 2" , true);
	}
	
	@AfterMethod
	public void afterMethod () {
		
		Reporter.log("After method" , true);
	}
	
	
	@AfterClass
	public void afterClassMethod () {
		
		System.out.println("After class is executing");
	}
	
	@BeforeClass
   public void beforeClassMethod () {
		
		System.out.println("Before class is executing");
	}
	
	
	
}
