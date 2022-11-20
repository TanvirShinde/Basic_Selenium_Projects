package checkboxHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
	
			System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
			
			     WebDriver driver = new ChromeDriver () ;
			     
			     driver.manage().deleteAllCookies();
			     
		 driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		 
		                Thread.sleep(2000);
		                
		      JavascriptExecutor jk  = (JavascriptExecutor)driver;    
		      
		       jk.executeScript("window.scrollBy(0,500)");
		       
		    List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@class='cb1-element']"));
		    
		    for (WebElement check:checkboxes) {
		    	
		    	check.click();
		    }
	}
}
