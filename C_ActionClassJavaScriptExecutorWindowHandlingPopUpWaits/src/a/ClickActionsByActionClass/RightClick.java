package a.ClickActionsByActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	
	public static void main(String[] args) throws InterruptedException {
		
		
			System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
			
		    WebDriver driver = new ChromeDriver () ;
		    
		     driver.manage().deleteAllCookies();
		     
		     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		     
		     driver.manage().window().maximize();
		     
		     Thread.sleep(2000);
		     
		     Actions act = new Actions (driver);
		     
		     WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		     
		  // WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		   
		     act.contextClick(loginButton).perform();
		    
		    
		    
		     
		    
		     
		     
		     
		     
	}
}
