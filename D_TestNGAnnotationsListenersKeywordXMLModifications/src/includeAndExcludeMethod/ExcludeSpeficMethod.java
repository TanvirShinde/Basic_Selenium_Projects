package includeAndExcludeMethod;

import org.checkerframework.common.util.report.qual.ReportCall;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class ExcludeSpeficMethod {

	@Test(priority =1)
	public void testcase () {
		
		Reporter.log("Login failed");
	}
	
	@Test (priority = 2 )
	public void testCase1 () {
		
		Reporter.log("Login Failed");
		
		}
	
	@Test (priority = 3)
	public void testCase2 () {
		
		System.out.println("Dashboard");
		
		Assert.assertEquals(true, true);
		
	
	
	}
}
