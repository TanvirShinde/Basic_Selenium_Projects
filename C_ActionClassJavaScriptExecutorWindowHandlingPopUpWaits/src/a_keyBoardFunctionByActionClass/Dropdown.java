package a_keyBoardFunctionByActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",  "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.naukri.com/");
		
	         driver.manage().window().maximize();
	
	         Thread.sleep(2000);
	         
	      WebElement tabExp = driver.findElement(By.xpath("//*[@class='dropArrowDD']"));
	      
	    //  tabExp.click();
	      
	      Actions act = new Actions (driver);
	      
	      act.moveToElement(tabExp).click().build().perform();
	      
act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();


	      
	      
	      
	      
	      
	         
	         
	
	
}

}