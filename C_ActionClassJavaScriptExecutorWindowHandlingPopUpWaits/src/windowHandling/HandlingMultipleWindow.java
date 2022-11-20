package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.manage().deleteAllCookies(); 
		
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		
		driver.manage().window().maximize();
		
		// To get for parent window ID
		
		String parent = driver.getWindowHandle();
		
		System.out.println("To know Parent ID:"+ parent);
		
		driver.findElement(By.xpath("//*[@id=\"post-body-6170641642826198246\"]/a[2]")).click();
		
		  Set<String> jk = driver.getWindowHandles();
		  
		  System.out.println("To know windows :"+ jk);
		  
		          int count = jk.size();
		          
		  System.out.println("To know count of opened windows :"+ count);
		  
		  
		  for (String child :jk)  {
			  
			  if (!parent.equalsIgnoreCase(child)) {
				  
				  driver.switchTo().window(child);
				  
				  System.out.println("To title of child window is :"+ driver.getTitle());
				  
				  driver.findElement(By.xpath("//*[@id='email']")).sendKeys("shindetanvir@gmail.com");
				  
				  driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("tanvir$2771993");
				  
				  driver.findElement(By.xpath("//*[@name='login']")).click();
				  
				  Thread.sleep(2000);
				  
				  driver.manage().window().maximize();
				  
				  driver.close();
				  
				  Thread.sleep(3000);
				  
				  driver.quit();
			  }
			  
		  }
			
	}
}
