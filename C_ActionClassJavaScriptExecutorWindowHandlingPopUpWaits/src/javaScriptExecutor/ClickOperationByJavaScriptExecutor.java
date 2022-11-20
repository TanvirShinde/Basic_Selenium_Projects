package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOperationByJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(40 , TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		  // 1st method to locate the webelements by using the relative x path
	     
	WebElement username = driver.findElement(By.xpath("//*[@name='username']"));
	    
	            username.sendKeys("Admin");
	             
	              JavascriptExecutor js =   (JavascriptExecutor )driver;
	              
	       // js.executeScript("document.getElementByxpth( //*[@name='username'] ).value='Admin'") ;    
	              
	        //  js.executeScript("arguments[0].value='Admin';", username);  
	               
	               // 2nd method to locate the code
	             
	      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	      
	   WebElement login = driver.findElement(By.xpath("//*[@type='submit']"));
	   
	    js.executeScript("arguments[0].click();", login);    //work 
	    
	       
	    
	      
	      
	}
	
}
