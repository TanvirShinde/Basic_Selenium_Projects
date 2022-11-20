package depndsOnMethod;

import org.checkerframework.common.util.report.qual.ReportCall;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class DependsOnMethod3 {

	@Test (priority = 1 )
	public void testCase4 () {
		
		Reporter.log("Test Case 4 has executed" , true);
	}
}
