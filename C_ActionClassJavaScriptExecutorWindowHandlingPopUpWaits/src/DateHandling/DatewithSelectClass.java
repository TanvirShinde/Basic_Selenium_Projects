package DateHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatewithSelectClass {

	public static void main(String[] args) throws InterruptedException {
		
     System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		Thread.sleep(2000);
		
		   // Click on datapicker 
		
	 driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).click();
		
	 
	 
	 
	 
	 
	WebElement month = driver.findElement(By.xpath("//select[@title='Change the month']"));
		
	          Select selMonth = new Select (month);
	          
		          selMonth.selectByVisibleText("July");
		          
		WebElement day = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/table/tbody/tr[5]/td[3]/a"));
     
		  Select selDay = new Select (day);
          
          selMonth.selectByVisibleText("27");
          
          
      
        
		
	}
	
}
