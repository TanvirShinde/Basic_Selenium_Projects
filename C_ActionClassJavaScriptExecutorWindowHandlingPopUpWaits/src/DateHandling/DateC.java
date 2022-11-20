package DateHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateC {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='datepicker1']")).click();
		
		int i=0;
		
		while (i==0) {
		
		
	//	WebElement title = driver.findElement(By.xpath("//*[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all']"));
			
			List<WebElement> title = driver.findElements(By.xpath("//*[@class='ui-datepicker-title']//span"));
			
			for (WebElement s:title)  {
				
				
				if(! (s.getText().equalsIgnoreCase("May 2023"))) {
			    	 
			    	// driver.findElement(By.xpath("//*[@data-handler='next']")).click();
			    	 
			    	 driver.findElement(By.xpath("//*[@data-handler='prev']")).click();
			     }
			     
			     else {
			    	 
			    	 break;
			     }
				
				
			}


		    
		}
}


}