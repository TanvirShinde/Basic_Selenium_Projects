package a.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderfunctionalitybyActionClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
			
		    WebDriver driver = new ChromeDriver () ;
		    
		     driver.manage().deleteAllCookies();
		     
		     driver.get("https://jqueryui.com/slider/");
		     
		     driver.manage().window().maximize();
		     
		     Thread.sleep(2000);
		     
		   WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		   
		   driver.switchTo().frame(iframe);
		   
	     WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));
	     
	     Actions act = new Actions (driver);
	     
	     act.dragAndDropBy(slider, 600, 0).build().perform();
	     
	     driver.switchTo().parentFrame();
	     
	  WebElement autocompleteTab = driver.findElement(By.xpath("//a[text()='Autocomplete']"));
	  
	          autocompleteTab.click();
	     
	     
	
	
		     
	}
	     
}
