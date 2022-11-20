package excelTestDataRead;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginthroughExcelData {

	 static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
	 driver = new ChromeDriver () ;
		
		driver.manage().deleteAllCookies();
		
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 
	driver.findElement(By.xpath("//*[@name='username']")).sendKeys(GetData27.readData(1, 0));
		 
 driver.findElement(By.xpath("//*[@name='password']")).sendKeys(GetData27.readData(2, 0));
      
      driver.findElement(By.xpath("//*[@type='submit']")).click();
	 
	 
	
	

	}
}


