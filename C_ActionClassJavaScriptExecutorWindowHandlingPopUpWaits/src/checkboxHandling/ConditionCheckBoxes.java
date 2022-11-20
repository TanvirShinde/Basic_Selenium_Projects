package checkboxHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

  public class ConditionCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		     WebDriver driver = new ChromeDriver () ;
		     
		     driver.manage().deleteAllCookies();
		     
	 driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
	 
	                Thread.sleep(2000);
	                
	     driver.manage().window().maximize();           
	                
	     JavascriptExecutor  jk  =  (  JavascriptExecutor ) driver ;
	               
	         jk.executeScript("window.scrollBy(0, 500)");
	         
	 
	         
	   WebElement checkbox = driver.findElement(By.xpath("(//*[@class='cb1-element'])[1]"));
	   
	         boolean displayed = checkbox.isDisplayed();
	         
	    System.out.println("The checkbox is present of the webpage :"+ displayed);
	    
	         boolean enabled = checkbox.isEnabled();
	           
	       System.out.println("Checkbox is in clickable state :" + enabled);
	       
	          boolean selected = checkbox.isSelected();
	          
	          System.out.println("Checkboxes is selected :"+ selected);
	          
	           checkbox.click();
	           
	       jk.executeScript("window.scrollBy(0 ,-400)");
	       
	       
	       Thread.sleep(3000);
	       
	       driver.quit();
	       
	            
	    
	                     
	         
	         
	
}

  }