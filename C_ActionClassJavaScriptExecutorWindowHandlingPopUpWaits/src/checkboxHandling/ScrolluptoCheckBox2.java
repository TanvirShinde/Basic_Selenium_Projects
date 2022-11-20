package checkboxHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolluptoCheckBox2 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		
		driver.manage().window().maximize();
		
	 WebElement checkbox =   driver.findElement(By.xpath("//*[@id=\"isAgeSelected\"]"));
		
	    JavascriptExecutor jk    =  (  JavascriptExecutor    ) driver;
	    
	    jk.executeScript("arguments[0].click();", checkbox);
	    
	   // jk.executeScript("arguments[0].scrollIntoView(true);", checkbox); 
	    
	     // checkbox.click();
	    	
	}
	
}
