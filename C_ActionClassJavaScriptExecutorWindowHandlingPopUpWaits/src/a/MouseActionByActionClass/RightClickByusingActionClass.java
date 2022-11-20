package a.MouseActionByActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickByusingActionClass {

	
	public static void main(String[] args) {
		
			
			System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
					
					WebDriver driver = new ChromeDriver () ;
					
					 driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
					 
					 driver.manage().window().maximize();
					 
					WebElement submit = driver.findElement(By.xpath("//*[@name='submit']"));
					
					Actions act = new Actions (driver);
					
					act.contextClick(submit).perform();
					
	}
}
