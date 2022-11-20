package popUpHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddendivisionPopuup {

	
	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
				
			    WebDriver driver = new ChromeDriver () ;
			    
			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			    
			     driver.manage().deleteAllCookies();
			     
			     driver.get("https://chercher.tech/practice/hidden-division-popup");
			     
			     driver.manage().window().maximize();
			     
			     Thread.sleep(2000);
			     
			   WebElement viewpopupButton = driver.findElement(By.xpath("//*[@class='cd-popup-trigger']"));
			   
			   viewpopupButton.click();
			   
			 Alert textEnter = driver.switchTo().alert();
			 
			 textEnter.sendKeys("TanvirShinde");
			 
		String textonAlert = driver.switchTo().alert().getText();
		
		System.out.println(textonAlert);
		
	    
	     Thread.sleep(2000);
		
		textEnter.accept();
			     
	}		     
}
