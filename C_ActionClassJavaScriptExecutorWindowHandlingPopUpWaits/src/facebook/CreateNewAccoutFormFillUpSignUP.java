package facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccoutFormFillUpSignUP {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		
		
		   // WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		    
		   
		    
		// for select date
	  WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	  
	          Select sel = new Select (day);
	          
	          //select by index;
	          
	        // sel.selectByIndex(28);
	       
	          // select by value
	          
	          sel.selectByValue("27");
	          
	          //select by visible text
	          
	         //sel.selectByVisibleText("29");
	         
	       WebElement month = driver.findElement(By.xpath("  //*[@id='month']   "));
	       
	       Select sel1 = new Select (month);
	            sel1.selectByValue("7");
	       
	            
	            //for year
	            
	       WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
	       
	         Select sel2 = new Select (year);
	            sel2.selectByValue("1993");   
	           
	     // for setting new password
	            
	       WebElement newpassword = driver.findElement(By.xpath("//input[@id='password_step_input']")) ;
	       
	                 newpassword.sendKeys("123456789");
	                 
	       // for signup
	                 
	        WebElement signup = driver.findElement(By.xpath("//input[@id='signup_button']")) ;  
	        
	               signup.click();
	}
	
}
