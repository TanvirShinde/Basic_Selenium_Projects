package a.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertwithOkAndCloseButtonPrompttCondition2 {

	public static void main(String[] args) throws InterruptedException {
		
   System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver () ;
	    
	     driver.manage().deleteAllCookies();
	     
	     driver.get("https://demoqa.com/alerts");
	     
	     driver.manage().window().maximize();
	     
	     Thread.sleep(2000);
	     
	  
	   
	       
	        
	        WebElement prompttab = driver.findElement(By.xpath("//*[@id='promtButton']"));
	        
	            prompttab.click();
	        
	        Alert promptalert = driver.switchTo().alert();
	         
	        promptalert.sendKeys("TanvirShinde");
	         
	Thread.sleep(2000);
	         
	         promptalert.sendKeys("TanvirShinde");
	         
	               
	     
	   String textonalert = driver.switchTo().alert().getText();
	   
	   System.out.println("The alert text as :" +  textonalert);
	   
	   promptalert.accept();
	   
	   
	   
	   
	   
	   
	   
	   
		
	}
}
