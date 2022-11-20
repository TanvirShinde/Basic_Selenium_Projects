package facebook;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver () ;
		
	  //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.manage().timeouts().implicitlyWait(40 , TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		
	   username.sendKeys("Shindetanvir@gmail.com");
		        
	 WebElement password = driver.findElement(By.xpath("//*[@name='pass']"));
	 
	 password.sendKeys("tanu&&&2728");
	 
	        WebElement submit = driver.findElement(By.xpath("//*[@name='login']"));
	        
	          submit.click();
	 
	 
	 
	          
		
		
	}
	
}
