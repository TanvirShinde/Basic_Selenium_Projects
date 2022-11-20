package a_keyBoardFunctionByActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autosuggestion {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
	WebElement textfield = driver.findElement(By.xpath("//*[@name='q']"));
	
	           textfield.sendKeys("Apple");
	           
	           Thread.sleep(2000);
	           
	           Actions act = new Actions (driver);
	           
	act.sendKeys(textfield, Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
		
		
}
}
