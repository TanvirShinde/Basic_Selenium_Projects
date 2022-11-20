package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesOrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		String parent = driver.getWindowHandle();
		
		System.out.println("The Id of parent window is : "+parent);
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Thread.sleep(2000);
		
	Set<String> openWindows = driver.getWindowHandles();
	
	System.out.println("The open windows are :"+ openWindows);
	
	for (String id : openWindows)  {
		
		if (!(id.equals(parent))) {
			
			driver.switchTo().window(id);
			
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("Book a Free Demo")).click();
			
			Thread.sleep(3000);
			
			driver.close();
			
		}
	}
	
	
	}
	
}
