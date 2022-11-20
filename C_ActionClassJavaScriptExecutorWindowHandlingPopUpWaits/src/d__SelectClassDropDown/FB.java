package d__SelectClassDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("TANVIR");
		
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("SHINDE");
		
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("12345@$123");
		
	  WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
	  
	     Select Sel1 = new Select (day);
	  
	  
		
		
		
	}
	
}
