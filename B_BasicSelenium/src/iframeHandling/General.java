package iframeHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class General {

	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver () ;
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		 WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		 
		 driver.switchTo().frame(iframe);
		 
		 Thread.sleep(2000);
		
		 WebElement check = driver.findElement(By.xpath("//*[@id='datepicker']"));
		
		    check.sendKeys("09/14/2022");
		    
		    check.sendKeys(Keys.ENTER);
	
		
		
//		int i=0;
//		
//		while (i==0) {
//			
//			WebElement button = driver.findElement(By.xpath("//*[@class='ui-datepicker-next ui-corner-all']"));
//			
//			if (!(button.getText().equalsIgnoreCase("May 2022"))) {
//				
//				button.click();
//			}
//			
//			else {
//				
//				break;
//			}
//		}
//		
//List<WebElement> daylist = driver.findElements(By.xpath(" //*[@class='ui-datepicker-calendar']//td"));
//		
//		     for (  WebElement day  : daylist )  {
//		    	 
//		    	 if (day.getText().equals("27")) {
//		    		 
//		    		 day.click();
//		    	 }
//		     }
//		
//	}
		
		
}

}

