package a.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertwithOkbuttonwithValue {

	public static void main(String[] args) throws InterruptedException {
		
   System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver () ;
	    
	     driver.manage().deleteAllCookies();
	     
	     driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	     
	     driver.manage().window().maximize();
	     
	     Thread.sleep(2000);
	     
	WebElement prompt = driver.findElement(By.xpath("//*[@name='prompt']"));
	
//	        prompt.click();
//	        
//	        Thread.sleep(2000);
//	   
//	 Alert alaram = driver.switchTo().alert();
//	 
//	      alaram.sendKeys("12345");
//	      
//	      Thread.sleep(3000);
//	      
//	      
//	      driver.switchTo().alert().accept();
//	      
//	      
//	     
	           Actions act = new Actions (driver);
	           
	            act.click(prompt).perform();
	            
	         Alert alaram = driver.switchTo().alert();
	         
	         act.sendKeys(prompt, "12345");
	         
	         Thread.sleep(2000);
	         
	          alaram.accept();
	          
	   	   
	    
	
	   
	   
	   
		
	}
}
