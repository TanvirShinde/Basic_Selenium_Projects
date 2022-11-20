package a.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop12 {


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver () ;
	    
	     driver.manage().deleteAllCookies();
	     
	     driver.get("https://jqueryui.com/droppable/");
	     
	     driver.manage().window().maximize();
	     
	     Thread.sleep(2000);
	     
	       WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
	       
	       driver.switchTo().frame(iframe);
	        
	       Thread.sleep(1000);
	     
	   WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
	   
	    WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
	    
	    Actions act = new Actions (driver);
	    
	    act.dragAndDrop(drag, drop).build().perform();
	    
	    
	    
	  
	    
	    
	    
	    
	    
}

	
}