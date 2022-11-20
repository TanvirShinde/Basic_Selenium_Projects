package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GrowwChildBrowserPopupWindow {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		   System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
				
			    WebDriver driver = new ChromeDriver () ;
			    
			     driver.manage().deleteAllCookies();
			     
			     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			     
			     driver.get("https://groww.in/");
			     
			     driver.manage().window().maximize();
			     
			 
      WebElement loginButton = driver.findElement(By.xpath("(//*[@class='absolute-center'])[1]"));
      
              loginButton.click();
     	 
  
              
              WebElement loginemailfield = driver.findElement(By.xpath("//input[@id='login_email1']"));
              
              loginemailfield.sendKeys("shindetanvir@gmail.com");

              
    WebElement continuebutton = driver.findElement(By.xpath("(//*[@class='absolute-center btn51ParentDimension'])[1]"));
    
                continuebutton.click();
  
                
         WebElement password = driver.findElement(By.xpath("//*[@id='login_password1']"));
           
          password.sendKeys("tanu$4321");
           
           WebElement submit = driver.findElement(By.xpath("(//*[@class='absolute-center btn51ParentDimension'])[1]"));
           
                submit.click();
                
                Thread.sleep(6000);
                
                
                TakesScreenshot snapshot = ( TakesScreenshot ) driver;
                  
                  File source = snapshot.getScreenshotAs(OutputType.FILE);
                  
                  String path = "E:\\SeleniumSnapshot\\Groww.png";
                  
                  File Destination = new File (path);
                  
                  FileHandler.copy(source, Destination);
                
       
                
}

}

