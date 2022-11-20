package browserOpenLoginWebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome  {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();    //To refresh particular site
		
		//To get tab title and URL of site
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		//Maximize window
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		
		driver.get("https://www.facebook.com/home.php");
		
		driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.quit();	
	}
}
