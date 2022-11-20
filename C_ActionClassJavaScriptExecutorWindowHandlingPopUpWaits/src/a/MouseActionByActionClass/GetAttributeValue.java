package a.MouseActionByActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {

	public static void main(String[] args) throws InterruptedException {
		
 System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver () ;
	    
	     driver.manage().deleteAllCookies();
	     
	     driver.get("https://mbasic.facebook.com/");
	     
	     driver.manage().window().maximize();
	     
	     Thread.sleep(2000);
	     
	   WebElement username = driver.findElement(By.xpath("//*[@name='email']"));
	   
	        username.sendKeys("TANVIR");
	                
	       String attributevalue = username.getAttribute("name");
	          
	       System.out.println("Attribute value of given xpth is : "+ attributevalue);
	     
		
		
	}
	
	
}
