package listenerinTestNG.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestNGPratice {

	static WebDriver driver ;
	
	@BeforeSuite
	public void initbrowser () {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		driver = new ChromeDriver () ;
		
	}
	
	@AfterSuite
	public void quitbrowser () {
		
		driver.quit();
	}
}
