package includeAndExcludeMethod;

import org.checkerframework.common.util.report.qual.ReportCall;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class IncludeSpeficMethod {

	@Test(priority =1)
	public void testcase () {
		
		Reporter.log("Login failed");
	}
	
	@Test (priority = 2 )
	public void testCase1 () {
		
		Reporter.log("Login Failed");
		
		}
	
}
