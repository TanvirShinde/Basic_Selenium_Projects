package assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginErrorMessageVerfication3 {
   @Test
public  void login () throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver. manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	     String	title = driver.getTitle();
	     
	     System.out.println("The title of current page is :"+ title);
	   
	 WebElement username = driver.findElement(By.xpath("//*[@name='username']"));
	    
	             username.sendKeys("Admin12");
	               
	     driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
	      
	      driver.findElement(By.xpath("//*[@type='submit']")).click();
	         
	        String url = driver.getCurrentUrl();
	        
	        System.out.println("The URL of current page is :" + url);
	          
	        
String errormsg = driver.findElement(By.xpath("//*[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();

          //applying the check point as in terms  Soft assert
	        // we have to make object of softassert class   
              SoftAssert jk = new     SoftAssert () ;
              
       jk.assertEquals(errormsg, "Invalid credentials1245", "Text not matched hence login not proceed");
       
       System.out.println("Assertion got executed");
       
       driver.navigate().refresh();
       
       driver.get("https://onlymyenglish.com/tenses/");
       
       //to decide final status of test case
       
         jk.assertAll();
	         
	}
    
//    @Test
//    public void testcase2 ()  {
//    	
//    	System.out.println("this is test case2");
//    }
}




