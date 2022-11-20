package iframeHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver () ;
	    
	     driver.manage().deleteAllCookies();
	     
	     driver.get("https://jqueryui.com/selectable/");
	     
	     driver.manage().window().maximize();
	     
	     Thread.sleep(2000);
	     
	       WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
	       
	       driver.switchTo().frame(iframe);
	        
	       Thread.sleep(1000);
	       
	     List<WebElement> selects = driver.findElements(By.xpath("//body//ol[@id='selectable']//li"));
	     
	       int count = selects.size();
	       
	       int i=1;
	       
	       for (WebElement check:selects)  {
	    	   
	    	if(i%2==1)    {
	    		
	    		check.click();
	    	}
	    	
	    	
	    	
	       }
	       
	
	
}


}










////body//ol[@id='selectable']//li