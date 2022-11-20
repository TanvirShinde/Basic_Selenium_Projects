package parametrizationORfetchandWriteDataInExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import excelTestDataRead.GetData27;

public class LoginintoIapplicationByusingTheCustomizeCode {

public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		 
		 Thread.sleep(2000);
		 
      driver.manage().window().maximize();
		 
	 driver.findElement(By.xpath("//*[@name='email']")).sendKeys(CustomizeCodeinTermsfStaticMethodforFetch.readData(0, 0));
		 
       driver.findElement(By.xpath("//*[@name='pass']")).sendKeys(CustomizeCodeinTermsfStaticMethodforFetch.readData(0, 1));
		 
		 driver.findElement(By.xpath("//*[@name='login']")).click();
}
}