package listenerinTestNG123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (TestNGListeners.class)
public class TestCasewithScrrenShot   {
	 
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

	@Test (priority = 1)
	public void testCase1 () throws InterruptedException {
		
		Reporter.log("TC1", true);
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		    
	     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin112323");
	     
	     driver.findElement(By.xpath("//*[@type='submit']")).click();
	     
	     Assert.assertEquals(true, true);
			      
	}
	
	
	
}
