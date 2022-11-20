package a.MouseActionByActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	
	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
				
			    WebDriver driver = new ChromeDriver () ;
			    
			     driver.manage().deleteAllCookies();
			     
			     driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			     
			     driver.manage().window().maximize();
			     
			     Thread.sleep(2000);
			     
	     WebElement suboverbutton = driver.findElement(By.xpath("//*[@id='sub-menu']"));
			   
			   Actions act = new Actions (driver);
			   
			act.click(suboverbutton).perform();
			
			   Thread.sleep(1000);
	
		WebElement content = driver.findElement(By.xpath("//*[@class='dropdown']//a[2]"));
		
		act.click(content).perform();
		
		
			   
  
			   
}

}