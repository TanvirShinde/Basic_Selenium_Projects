package DateHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxBySelect {

 public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("https://mbasic.facebook.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		WebElement createAccount = driver.findElement(By.xpath("//input[@value='Create New Account']"));

		 createAccount.click();
		 
			Thread.sleep(2000);
			
			//First name
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tanvir");
	
	        //Last Name
    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("shinde");
    
           //Mobile No
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("82123459093");
	
           //Radio Button
	driver.findElement(By.xpath("(//input[@value='2'])[2]")).click();
	   
	// To select dropdown ..for select day
	WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
	
	    
	
	  Select sel1 = new Select (day);
	  
	  sel1.selectByValue("27");
	  
	// To select dropdown ..for select Month
	  
	WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
	
	 Select sel2 = new Select (month);
	  
	  sel2.selectByValue("7");
	  
   // To select dropdown ..for select year
	     
	 WebElement year = driver.findElement(By.xpath("//*[@id='year' and @title='Year']"));
	 
	 Select sel3 = new Select (year);
	  
	  sel3.selectByVisibleText("1993");
	  
		// for passord field to enter password
	driver.findElement(By.xpath("//input[@id='password_step_input' ]")).sendKeys("123456789");
		
		//Click on signup Button
	
	driver.findElement(By.xpath("//input[@id='signup_button']")).click();
	
	
	
		
		
	}
}



 
 


