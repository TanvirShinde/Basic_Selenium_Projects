package browserOpenLoginWebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class LaunchBrowserWithURL1 {

	static WebDriver driver ;
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.edge.driver","E:\\EdgeDriver\\msedgedriver.exe");
		
		driver = new EdgeDriver () ;
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}
}
