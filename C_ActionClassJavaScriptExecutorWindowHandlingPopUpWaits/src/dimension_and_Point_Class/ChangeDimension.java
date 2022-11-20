package dimension_and_Point_Class;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeDimension {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Dimension d = new Dimension(250, 500);
		
	     driver.manage().window().setSize(d);
	     
	     Thread.sleep(2000);
	     
	     Point p = new Point(300, 150);
	     
	     driver.manage().window().setPosition(p);
		         
		
		
	
	}
	
}
