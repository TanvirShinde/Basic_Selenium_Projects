package javaScriptExecutor;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownByJavaScriptExecutor {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		       String parent = driver.getWindowHandle();
		       
		       System.out.println("The Id of parent window is : " + parent );
		 
		 driver.manage().window().maximize();
		 
	   WebElement button1 = driver.findElement(By.xpath("//*[@id='newWindowBtn']"));
	   
	     JavascriptExecutor js = ( JavascriptExecutor) driver;
	            
	      js.executeScript("scrollBy (0 ,500)");
	   
	      button1.click();
	      
	 	 driver.manage().window().maximize();
	 	 
	 	  Set<String> windows = driver.getWindowHandles();
	 	  
	 	  System.out.println("The open windows id are as :" + windows);
	 	  
	 	  for   ( String single:windows)   {
	 		  
	 		     if (!(single.equals(parent)) ){
	 		    	 
	 		    	 driver.switchTo().window(single);
	 		    	 
	 		    	 driver.manage().window().maximize();
	 		    	 
	 		    	  JavascriptExecutor jk = ( JavascriptExecutor) driver;
	 		            
	 			      jk.executeScript("scrollBy (0 ,700)");
	 			      
	 			      driver.findElement(By.xpath("//*[@id='navigateHome']")).click();
	 			      
	 			     driver.manage().window().maximize();
	 			   
	 		    	 
	 		    	 
	 		    	 
	 		     }
	 		  
	 	  }
		 
	
}
           
}