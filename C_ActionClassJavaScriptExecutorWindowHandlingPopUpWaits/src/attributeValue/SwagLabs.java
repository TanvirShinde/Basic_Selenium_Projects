package attributeValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		  WebDriver driver = new ChromeDriver () ;
		  
		  driver.manage().deleteAllCookies();
		  
		  driver.get("https://www.saucedemo.com/");
		  
		  driver.manage().window().maximize();
		  
		  Thread.sleep(2000);
		  
		  // username field
		  
    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		  
		// password field
    
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
    
       //login Button to know attribute value
    
    WebElement loginbutton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
    
        String attributevalue = loginbutton.getDomAttribute("class");
         
           boolean confirmAtrribute = attributevalue.equalsIgnoreCase("submit-button btn_action");
            
           
        System.out.println("The attribute value for login button is :"+ attributevalue);
        
         loginbutton.click();
         
         
		 
		  
		  
		
	}

	
}
