package iframeHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe {
	
	public static void main(String[] args) throws InterruptedException {
		
     System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver () ;
	    
	     driver.manage().deleteAllCookies();
	     
	     driver.get("https://jqueryui.com/droppable/");
	     
	     driver.manage().window().maximize();
	     
	     Thread.sleep(2000);
	     
	     WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	     
	     driver.switchTo().frame(iframe);
	     
	   
	    Actions act = new Actions (driver) ;
	    
       WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
	    
	   WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
	    
	    act.dragAndDrop(drag, drop).build().perform();
	    
	    driver.switchTo().parentFrame();
	    
	    WebElement resizeButton = driver.findElement(By.xpath("//div//aside//ul//a[text()='Resizable']"));
	    
         resizeButton.click();
	    
	  
	    
	    
	    
		
	}

}
