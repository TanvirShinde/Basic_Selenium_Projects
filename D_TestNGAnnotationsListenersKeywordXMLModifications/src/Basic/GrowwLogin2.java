package Basic;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrowwLogin2 {
	
	public static void main(String[] args) throws InterruptedException {
		
    System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
    
	WebDriver driver = new ChromeDriver () ;
	
	driver.manage().deleteAllCookies();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(40 , TimeUnit.SECONDS);
	
	driver.get("https://groww.in/login");
	
	   String window = driver.getWindowHandle();
	
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	WebElement continuewithgooglebutton = driver.findElement(By.xpath("//*[@id='gmail_signin_button']"));
	
	    continuewithgooglebutton.click();
	    
	   Set<String> allwindows = driver.getWindowHandles();
	   
	  int a = allwindows.size();
	  
	  String [] id = new String [a];
	  
	  int i=0;
	  
	  for (   String single: allwindows) {
		  
		  id[i]=single;
		  i++;
	  }
	
	       driver.switchTo().window(id[1]);
	       
	       driver.manage().window().maximize();
	       
	    WebElement emailidfield = driver.findElement(By.xpath("(//*[@class='whsOnd zHQkBf'])[1]"));
	    
	    emailidfield.sendKeys("shindetanvir@gmail.com");
	    
	 WebElement nextbutton = driver.findElement(By.xpath("(//*[@class='VfPpkd-vQzf8d'])[2]"));
	 
	 nextbutton.click();
		
	}
}
