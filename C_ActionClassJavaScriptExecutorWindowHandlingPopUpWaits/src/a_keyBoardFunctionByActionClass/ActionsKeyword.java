package a_keyBoardFunctionByActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsKeyword {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tanvir");
		 
		 Actions act = new Actions (driver);
		 
		
		act.sendKeys(Keys.TAB).sendKeys("Shinde").build().perform();
		
		act.sendKeys(Keys.TAB).sendKeys("8208159093").build().perform();
		
        WebElement gender = driver.findElement(By.xpath("//*[@value='2' and @id='sex']"));
          
        act.sendKeys(gender, Keys.TAB).sendKeys(Keys.ENTER).build().perform();
        
        
        
        
        

		
	
		
		 
	}
	
}
	
