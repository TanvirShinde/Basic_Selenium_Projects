package explicitWaits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AlertOpenafter5secondsWhenClick {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	
	    driver.manage().window().maximize();
	    
	      WebElement alertButton = driver.findElement(By.xpath("//*[@id='alert']"));
	      
	                   alertButton.click();
	    
	 WebDriverWait wait = new  WebDriverWait (driver , Duration.ofSeconds(40));
	  
	       wait.until(ExpectedConditions.alertIsPresent());
	       
	       Thread.sleep(3000);
	       
	       driver.switchTo().alert().accept();
	       
	       Thread.sleep(2000);
	       
	       alertButton.click();
	       
	       
		
	}
}
