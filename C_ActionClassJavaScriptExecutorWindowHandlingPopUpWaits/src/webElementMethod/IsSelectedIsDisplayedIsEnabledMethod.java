package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedIsDisplayedIsEnabledMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.manage().deleteAllCookies();
		
	     driver.get("https://jqueryui.com/checkboxradio/");
	     
	     Thread.sleep(2000);
	     
	     driver.manage().window().maximize();
	     
	    WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
	    
	    driver.switchTo().frame(iframe);
   
	     
	 WebElement checkbox = driver.findElement(By.xpath("//*[@for='radio-1']"));
	 
	  boolean display = checkbox.isDisplayed();
      
      System.out.println("checkbox is display on webpage  : " + display);
      
      boolean enable = checkbox.isEnabled();
      
      System.out.println("checkbox is in clikable state  on webpage  : " + enable);
      
              checkbox.click();
      
    	 boolean isselected = checkbox.isSelected();
    
 	 System.out.println("checkbox is in  selected state  on webpage   : " + isselected);
	 
 	 
	       
	        
	    
	     
	     
	       
	       
	  
	    
	       
	       
	    
	       
	       
	       
}

	
}