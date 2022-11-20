package fluentWaitandPageLoadTimeOut;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitCheckboxCheckedafter10Seconds2 {

public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver () ;
	
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	
	driver.manage().window().maximize();
	
	FluentWait<WebDriver> wait = new FluentWait<WebDriver> (driver)
			.withTimeout(Duration.ofSeconds(60))
			.pollingEvery(Duration.ofSeconds(10));
			
	
	 driver.findElement(By.xpath("//*[@id='checkbox']")).click();
	
   wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//*[@id='ch']")));
	 
	driver.findElement(By.xpath("//*[@id='checkbox']")).click();
	
}
	
}


