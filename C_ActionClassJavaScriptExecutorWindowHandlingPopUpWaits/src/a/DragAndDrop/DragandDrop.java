package a.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver () ;
	    
	     driver.manage().deleteAllCookies();
	     
	     driver.get("https://jqueryui.com/droppable/");
	     
	     driver.manage().window().maximize();
	     
	     Thread.sleep(2000);
	     
	   WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
	   
	   driver.switchTo().frame(iframe);
	   
	 WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
	 
	  WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
	     
	     Actions act =  new Actions (driver);
	     
	             // 1st way
	     
	   //  act.dragAndDrop(drag, drop).perform();
	     
	     //2nd Way
	     
	  // act.clickAndHold(drag).moveToElement(drop).release().build().perform();
	     
	     //3rd way
	     
	   act.dragAndDropBy(drag, 150, 0).release().build().perform();
	     
	     
	     
	     
	     
	     
	}
}
