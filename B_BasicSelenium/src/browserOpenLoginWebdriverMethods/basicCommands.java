package browserOpenLoginWebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicCommands {

	 public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		 
		 
		  WebDriver driver = new ChromeDriver () ;
		  
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
		  driver.manage().window().maximize();
		  
		  Thread.sleep(2000);
		  
		  driver.navigate().to("https://www.facebook.com/");
		  
		  driver.navigate().back();
		  
		  
		  driver.navigate().forward();
		  
		  
		  Thread.sleep(1500);
		  
		  driver.quit();
		  
		  
		  
		 
	}
	
}
