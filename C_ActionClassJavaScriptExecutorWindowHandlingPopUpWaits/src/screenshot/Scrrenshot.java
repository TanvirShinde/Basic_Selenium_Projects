package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrrenshot {

	
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver ();                                                                                
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://reqres.in/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot snapshot =   (TakesScreenshot  ) driver;
		
		  File source = snapshot.getScreenshotAs(OutputType.FILE);
		  
		 String path = "E:\\SeleniumSnapshot\\reqres.png";
		 
		 File destination = new File(path);
		 
		 FileHandler.copy(source, destination);
		 
		 
	}
}
