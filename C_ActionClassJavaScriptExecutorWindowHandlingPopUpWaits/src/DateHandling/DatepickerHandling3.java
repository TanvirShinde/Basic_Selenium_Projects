package DateHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatepickerHandling3 {
	
	static WebDriver driver;

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		 driver = new ChromeDriver () ;
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.manage().window().maximize();
		
		//Click on this 
	 driver.findElement(By.xpath("//*[@id='datepicker']")).click();
	 
	    new WebDriverWait (driver ,Duration.ofSeconds(20))
	    .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar"))) ; 
	    
	        selectDate("27", "May", "2021");
	    
	}

   public static String[]  getMonthYear (String monthyearVal ) {
	
	      return monthyearVal.split(" ") ;
                               
                       }


    public static void selectDate (String exDay ,String exMonth, String exYear) {
    	
    	  String monthyearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
    	  
           System.out.println(monthyearVal);
    	  
    	  while ( ! (getMonthYear(monthyearVal) [0].equals(exMonth)  
    			  && getMonthYear(monthyearVal)[1].equals(exYear)))
    	  {
    			
    			 driver.findElement(By.xpath("//a[@title='Next']")).click();
    			 
    			 monthyearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
    	
    			
    		 } 
    	  
    		driver.findElement(By.xpath("//a[text()='"+exDay+"']")).click();
    	  
    }
}