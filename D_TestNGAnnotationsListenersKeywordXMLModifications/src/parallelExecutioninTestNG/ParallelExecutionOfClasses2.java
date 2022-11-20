package parallelExecutioninTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecutionOfClasses2 {

	
	@Test
	public void testCase2 () {
		
		Reporter.log("TC1" , true);
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("https://meet.google.com/kqb-wabh-ove?pli=1");
		
		System.out.println("TC2 got executed");
	}
}
