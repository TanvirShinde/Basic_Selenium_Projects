package implicitWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTimeoutofFBpage {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver () ;
		
	driver.manage().timeouts().pageLoadTimeout(40 ,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
	Duration time = driver.manage().timeouts().getPageLoadTimeout();
	
	System.out.println("To know the actual time : " + time);

		
	
	 
	 
	 
	          
		
		
	}
	
}
