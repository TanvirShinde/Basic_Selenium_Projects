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

public class AnnotationInTestNG2 {

	
	
	@BeforeTest
	public void beforeTest1 () {
		
		System.out.println("Before test annotation from testing class");
	}
	
	@AfterTest
	public void afterTest1 () {
		
		System.out.println("After test annotation from testing class");
		
	}
	
	
	
	@BeforeMethod
	public void beforeMethod1 () {
		
		Reporter.log("Before method" , true);
	}
	
	@Test
	public void testcase3 () {
		
		Reporter.log("test case 3" , true);
	}
	
	@Test
	public void testcase4() {
		
		Reporter.log("test case 4" , true);
	}
	
	@AfterMethod
	public void afterMethod1 () {
		
		Reporter.log("After method" , true);
	}
	
	
	@AfterClass
	public void afterClassMethod1 () {
		
		System.out.println("After class is executing");
	}
	
	@BeforeClass
   public void beforeClassMethod1 () {
		
		System.out.println("Before class is executing");
	}
	
	
	
}
