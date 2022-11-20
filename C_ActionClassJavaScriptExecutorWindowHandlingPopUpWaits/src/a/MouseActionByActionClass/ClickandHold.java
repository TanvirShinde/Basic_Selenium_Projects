package a.MouseActionByActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandHold {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver () ;
	    
	     driver.manage().deleteAllCookies();
	     
	     driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
	     
	     driver.manage().window().maximize();
	     
	     Thread.sleep(2000);
	     
	   WebElement letterA = driver.findElement(By.xpath("//li[@name='A']"));
	   
	   WebElement letterD  = driver.findElement(By.xpath("//li[@name='D']"));
	   
	   Actions act = new Actions (driver);
	   
	   act.clickAndHold(letterA).moveToElement(letterD).click().perform();
	   
	   

}


}