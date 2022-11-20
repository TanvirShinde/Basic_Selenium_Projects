package DateHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatepickerHandling4 {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.manage().window().maximize();
		
		//Click on this 
	 driver.findElement(By.xpath("//*[@id='datepicker']")).click();
	 
	    new WebDriverWait (driver ,Duration.ofSeconds(20))
	    .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar"))) ;  
	    
	  String monthyearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
	  
	  System.out.println(monthyearVal);   //September 2022
	 
	 String month = monthyearVal.split(" ")[0].trim();
	 String year = monthyearVal.split(" ")[1].trim();
	 
	 while(! (month.equals("June") && year.equals("2024"))) {
		 
		 driver.findElement(By.xpath("//a[@title='Next']")).click();
		 
		 monthyearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
		 
		 System.out.println(monthyearVal);
		 
		  month = monthyearVal.split(" ")[0].trim();
		     year = monthyearVal.split(" ")[1].trim();
		 
	 } 
	
	driver.findElement(By.xpath("//a[text()='23']")).click();
}

}