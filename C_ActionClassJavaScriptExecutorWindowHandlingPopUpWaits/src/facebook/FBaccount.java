package facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBaccount {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("https://mbasic.facebook.com/");
		
		driver.manage().window().maximize();
		
		// driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		
	WebElement createAccount = driver.findElement(By.xpath("//input[@value='Create New Account']"));
		
	     createAccount.click(); 
	     
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tanvir");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("shinde");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("8208159093");
		
		driver.findElement(By.xpath("(//input[@value='2'])[2]")).click();
		
	    List<WebElement> daylist = driver.findElements(By.xpath("//*[@id='day']//option"));
	    
	    
	    for( WebElement day:daylist)  {
	    	
	    	if (day.getText().equals("27"))
	    	//if (day.equals("27"))
	    		day.click();
	    	//System.out.println(day.getText());
	    }
		
	}
	
}
