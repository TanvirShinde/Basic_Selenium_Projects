package site;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTest {

	public static WebDriver driver;
	 
	 @Test
	 public void TestCase(){
		 
	  driver = new ChromeDriver();
	  
	  driver.navigate().to("https://learnaboutsoftwaretesting.blogspot.in/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	 driver.findElement(By.xpath("invalidXpath")).click();   //using invalid xpath so that test will fail & we can invoke ITestListener.
	 }
}
