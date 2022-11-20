package annotations;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Groow {

	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		ChromeOptions options = new ChromeOptions () ;
		
		options.addArguments("--disable-notifications");
		
		
		driver.get("https://groww.in/login");
		 
		 driver.manage().window().maximize();
		 
	
		
	}
}
