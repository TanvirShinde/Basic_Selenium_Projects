package dimension_and_Point_Class;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeDimension2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Dimension jk = new Dimension(600, 350);
		
	    Dimension windowsize = driver.manage().window().getSize();
	    
	     System.out.println("The window size as: "+ windowsize);
	     
	     driver.manage().window().setSize(jk);
	     
	     Thread.sleep(2000);
	     
	   Point p = new Point(300, 350);
	     
	  Point windowPosition = driver.manage().window().getPosition();
	  
	    System.out.println("The window position is :" +windowPosition );  
	    
	    driver.manage().window().setPosition(p);
	         
	         
		
	}
}
