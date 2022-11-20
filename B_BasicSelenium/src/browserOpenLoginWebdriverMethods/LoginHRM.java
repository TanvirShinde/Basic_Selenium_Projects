package browserOpenLoginWebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginHRM {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		  // 1st method to locate the webelements by using the relative x path
	     
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	    
	            // username.sendKeys("Admin");
	             
	              JavascriptExecutor js = (  JavascriptExecutor ) driver;
	     
	     js.executeScript("arguments[0].value='Admin';", username);
	               
	               // 2nd method to locate the code
	             
	      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	      
	      
	    
	      
	      
	         
	}
	        
	      
	        
	       
	
}
