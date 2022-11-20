package a.ClickActionsByActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver () ;
	    
	     driver.manage().deleteAllCookies();
	     
	     driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	     
	     driver.manage().window().maximize();
	     
	     Thread.sleep(2000);
	     
	     Actions act =  new Actions (driver);
	     
	   WebElement doubleclickElement = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	   
                   act.doubleClick(doubleclickElement).perform();
	     
	}

	
}
