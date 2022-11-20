package explicitWaits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CheckBoxClickableafter10Seconds {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	
	    driver.manage().window().maximize();
	    
	   WebElement checkboxButton = driver.findElement(By.xpath("//*[@id='checkbox']"));
	   
	          checkboxButton.click();
	  
         WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(40));
	  
      	wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//*[@type='checkbox']")));
	
	               checkboxButton.click();
	               
	          
		
	}
}
