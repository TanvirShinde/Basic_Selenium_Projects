package parametrizationORfetchandWriteDataInExcelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigureFileUse {

	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver () ;
			
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			
		
			Properties prop = new Properties();
			
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\tanvir.properties");
			
			   prop.load(fis);
			   
		 driver.get(  prop.getProperty("testsiteurl"));
		 
		 driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys(prop.getProperty("username"));
		 
         driver.findElement(By.xpath("//*[@id='password']")).sendKeys(prop.getProperty("password"));
		 
		 driver.findElement(By.xpath("//*[@type='submit']")).click();
			  
			  
			  
			
	}
}
