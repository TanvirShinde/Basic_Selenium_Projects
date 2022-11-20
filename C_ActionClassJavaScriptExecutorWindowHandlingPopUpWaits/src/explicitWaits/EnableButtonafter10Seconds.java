package explicitWaits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EnableButtonafter10Seconds {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	
	    driver.manage().window().maximize();
	    
	  WebElement Ebutton = driver.findElement(By.xpath("//*[@id='enable-button']"));
	  
	              Ebutton.click();
	  
	//  WebDriverWait wait = new  WebDriverWait (40, TimeUnit.SECONDS);
	
	  WebDriverWait wait = new  WebDriverWait (driver , Duration.ofSeconds(40));
	  
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disable']")));
	  
	           Ebutton.click();
	  
	
	
		
	}
}
