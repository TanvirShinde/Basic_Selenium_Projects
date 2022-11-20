package browserOpenLoginWebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		    driver.get("https://www.instagram.com/");
		    
		      driver.manage().window().maximize();
		    
		     Thread.sleep(1500);
		     
		     driver.navigate().to("https://www.facebook.com/");
		     
        driver.findElement(By.name("email")).sendKeys("Shindetanvir");
        
     	 driver.findElement(By.name("pass")).sendKeys("123456");	
     	 
		     driver.findElement(By.name("login")).click();
		  
		     
		     

		   
		     
		     
		    
	
		     
		     
		
	}

	
		
	
	
	
}
