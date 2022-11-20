package checkboxHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver () ;
	     
	     driver.manage().deleteAllCookies();
	     
	     driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
	     
	     Thread.sleep(2000);
	     
	     driver.manage().window().maximize();
	     
	   WebElement checkbox = driver.findElement(By.xpath("(//*[@class='cb1-element'])[3]"));
	   
	   checkbox.click();
		
	}
}
