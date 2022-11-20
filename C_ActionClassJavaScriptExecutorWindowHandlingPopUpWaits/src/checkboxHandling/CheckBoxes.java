package checkboxHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		     WebDriver driver = new ChromeDriver () ;
		     
		     driver.manage().deleteAllCookies();
		     
	 driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
	 
	                Thread.sleep(2000);
	                
	      JavascriptExecutor  jk   =  ( JavascriptExecutor )driver;
	      
	      driver.manage().window().maximize();
	      
	      jk.executeScript("window.scrollBy(0,500)");
	      
	          Thread.sleep(2000);
	          
	driver.findElement(By.xpath("(//*[@type='checkbox' and @class='cb1-element'])[1]")).click();
	                
	            Thread.sleep(2000);
	            
	        jk.executeScript("window.scrollBy(0,-500)");
    
		
		
	}
}
