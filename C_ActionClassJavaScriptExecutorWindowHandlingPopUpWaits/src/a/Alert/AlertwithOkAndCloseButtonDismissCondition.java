package a.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertwithOkAndCloseButtonDismissCondition {

	public static void main(String[] args) throws InterruptedException {
		
   System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver () ;
	    
	     driver.manage().deleteAllCookies();
	     
	     driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	     
	     driver.manage().window().maximize();
	     
	     Thread.sleep(2000);
	     
	  WebElement confirmtab = driver.findElement(By.xpath("//*[@name='confirmation']"));
	   
	   Actions act = new Actions (driver);
	   
	   //Single click on confirm tab
	   
	   act.click(confirmtab).perform();
	   
	    Thread.sleep(2000);
	     
	   String textonalert = driver.switchTo().alert().getText();
	   
	   System.out.println("The alert text as :" +  textonalert);
	   
	   driver.switchTo().alert().accept();
	   
	   
	   
	   
	   
	   
		
	}
}
