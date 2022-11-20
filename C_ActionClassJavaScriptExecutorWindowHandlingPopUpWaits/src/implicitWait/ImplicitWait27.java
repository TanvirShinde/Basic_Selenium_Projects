package implicitWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait27 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		
		WebDriverWait wait = new WebDriverWait(driver ,Duration.ofSeconds(60));
		
		 driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
	    WebElement sub = driver.findElement(By.xpath("//*[@id='disable']"));
        
        wait.until(ExpectedConditions.elementToBeClickable(sub));
        
        driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
	}
	
}
