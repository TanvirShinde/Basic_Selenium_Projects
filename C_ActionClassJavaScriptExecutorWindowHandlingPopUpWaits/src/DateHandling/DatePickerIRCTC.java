package DateHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerIRCTC {

	
	public static void main(String[] args) throws InterruptedException {
		
     System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver () ;
	    
	     driver.manage().deleteAllCookies();
	     
	     driver.get("https://www.irctc.co.in/nget/train-search");
	     
	     driver.manage().window().maximize();
	     
	     Thread.sleep(2000);
	     
	       driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	       
	       Thread.sleep(2000);
	     
	     int i=0;
	     while ( i == 0) {
	    	 
	 WebElement myear = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	    
	    String mvalue = myear.getText();
	    
	     if ( !(mvalue.equalsIgnoreCase("August 2022"))) {
	    	 
	   
	    	 driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/a[2]/span")).click();
	    	 
	    	 
	     }
	     else {
	    	 break;
	     }
	     
	     }
	    	 
	    	driver.findElement(By.xpath("(//*[@class='ng-tns-c58-10']//td)[3]")).click();
	    	 
	    
	     
	     
	     
	}
}
