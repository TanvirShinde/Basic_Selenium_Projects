package cookies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		     WebDriver driver = new ChromeDriver ();
		     
		     // for deleting saved files in the browser
		          driver.manage().deleteAllCookies();
		          
		          driver.get("https://meet.google.com/");
		          
		          driver.manage().window().maximize();
		     
		     
		
	}
}
