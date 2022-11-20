package javaScriptExecutor;

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
		
		 JavascriptExecutor js = ( JavascriptExecutor ) driver;
		
	  WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	    
	  js.executeScript("arguments[0].value='Admin'", username);  
	  
	  WebElement passwordfield = driver.findElement(By.xpath("//input[@name='password']"));
	        
	  js.executeScript("arguments[0].value='admin123'", passwordfield); 
	  
  
	     WebElement loginbutton = driver.findElement(By.xpath("//*[@type='submit']"));  
	     
	        js.executeScript("arguments[0].click();" , loginbutton); 
	      
	      
	    
	         
	      
	                
	        
	           
	         
	}
	        
	      
	        
	       
	
}
