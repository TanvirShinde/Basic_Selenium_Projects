package orangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Condition2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		    String title = driver.getTitle();
		    
		    System.out.println("The title of current page is :"+ title);
		    
		    if (title.equalsIgnoreCase("OrangeHRM")) {
		    	
		    	System.out.println("Test Case is passed");
		    	
		    }
		    
		    else {
		    	
		    	System.out.println("Test Case is failed");
		    }
		
		      String  url = driver.getCurrentUrl();
		      
		      System.out.println("The URL of current page is :" + url);
		      
		
	}
	
}
