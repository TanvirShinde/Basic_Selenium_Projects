package parallelExecutioninTestNG123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecutionOfClasses3 {

	
	@Test
	public void testCase3 () {
		
		Reporter.log("TC3" , true);
		
		System.out.println("TC3 got executed");
	}
}
