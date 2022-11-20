package explicitWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextChangesaftr10Seconds {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		
		WebDriverWait wait = new WebDriverWait(driver ,Duration.ofSeconds(60));
		
		driver.findElement(By.xpath("//*[@id='populate-text']")).click();
		
		//1st way 
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(" //*[@id='h2']"), "Selenium Webdriver"));
		
	
		
	    Thread.sleep(2000);
	    
		driver.findElement(By.xpath("//*[@id='populate-text']")).click();
}

}