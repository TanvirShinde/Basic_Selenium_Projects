package browserOpenLoginWebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSwagLabs {
	
public static void main(String[] args) throws InterruptedException {
		
	//To set key and Path
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		 String URL	= driver.getCurrentUrl();
		 
	     System.out.println("The URL of current page is :"+ URL);
	     
	     String title = driver.getTitle(); 
	     
	     System.out.println("The title of current page is :"+ title);
	     
	      Thread.sleep(2000);
	      
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
	      
	      driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(3000);
		
	//	driver.quit();
	}
}
