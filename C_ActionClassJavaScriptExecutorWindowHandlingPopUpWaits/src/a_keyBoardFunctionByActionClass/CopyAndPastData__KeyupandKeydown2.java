package a_keyBoardFunctionByActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPastData__KeyupandKeydown2 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		 driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		 
		 
		 
		 driver.manage().window().maximize();
		 
		WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		Actions act = new Actions (driver);
		
		 act.sendKeys(name, "tanvir").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		 
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		 
		WebElement lastname = driver.findElement(By.xpath("//*[@name=\"lastname\"]"));
		
		lastname.click();
		
	    act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	     
		
		
		
		
		 
	}
	
}
