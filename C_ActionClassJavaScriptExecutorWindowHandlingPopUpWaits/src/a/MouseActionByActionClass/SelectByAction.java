package a.MouseActionByActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectByAction {

	public static void main(String[] args) throws InterruptedException {


   System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.manage().deleteAllCookies();
		
        driver.get("https://www.softwaretestinghelp.com/practical-software-testing-new-free-ebook-download/");
        
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        
       WebElement qatest = driver.findElement(By.linkText("QA Testing"));
       
       qatest.click();
		
       Thread.sleep(2000);
       
       Actions act = new Actions (driver);
       
     WebElement jiratab = driver.findElement(By.linkText("JIRA"));
     
     act.moveToElement(jiratab).perform();
     
     //Right Click on a webelement
    Thread.sleep(2000);

   act.contextClick(jiratab).perform();
   
     
	}

}


