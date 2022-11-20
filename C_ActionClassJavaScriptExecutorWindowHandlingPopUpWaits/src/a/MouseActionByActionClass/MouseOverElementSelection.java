package a.MouseActionByActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverElementSelection {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		            //Locate Automation Tool Tab
		
    WebElement automationTooltab = driver.findElement(By.xpath("//*[@class='dropbtn']")); 
    
             Actions jk = new Actions (driver);
             
             jk.moveToElement(automationTooltab).perform();
             
             Thread.sleep(2000);
             
             //Perform Click on TestNG
             
        WebElement testNG = driver.findElement(By.xpath("//*[@class='dropdown']//a[2]"));
       
         testNG.click();
                
                
     		
     		
}

}