package depndsOnMethod;

import org.checkerframework.common.util.report.qual.ReportCall;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class DependsOnMethod2 {

	@Test(enabled = false)
	public void testcase () {
		
		Reporter.log("Login failed");
	}
	
	@Test (priority = 2 , dependsOnMethods = "testcase")
	public void testCase1 () {
		
		Reporter.log("Login Failed");
		
		}
	
	@Test (dependsOnMethods = {"testcase"} , priority = 3)
	public void testCase2 () {
		
		System.out.println("Dashboard");
		
		
	
	}
}
