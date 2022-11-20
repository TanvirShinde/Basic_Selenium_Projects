package a.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert27 {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
				
			    WebDriver driver = new ChromeDriver () ;
			    
			     driver.manage().deleteAllCookies();
			     
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			     
			     driver.manage().window().maximize();
			     
      WebElement prompt = driver.findElement(By.xpath("//*[@name='prompt']"));
      
       prompt.click();
       
       
           Alert galert = driver.switchTo().alert();
           
           Thread.sleep(2000);
           
           // prompt.sendKeys("Tanvir");
           
           galert.sendKeys("12345");
            
            Thread.sleep(2000);
            
            
            galert.accept();
			     
			     
			     
}

	
}