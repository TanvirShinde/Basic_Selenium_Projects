package listenerinTestNG.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCasewithScrrenShot  extends TestNGPratice{

	@Test (priority = 1)
	public void testCase1 () throws InterruptedException {
		
		Reporter.log("TC1", true);
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		    
	     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin112323");
	     
	     driver.findElement(By.xpath("//*[@type='submit']")).click();
	     
	     Assert.assertEquals(true, false);
			      
	}
	
	@Test (priority = 2)
	public void testCase2 () {
		
		Reporter.log("TC2", true);
	}
	
	@Test (priority = 3)
	public void testCase3 () {
		
		Reporter.log("TC3", true);
		
		Assert.fail();
	}
	
	@Test (priority = 4 ,dependsOnMethods =" testCase3 " )
	public void testCase4 () {
		
		Reporter.log("TC4", true);
		
	}
}
