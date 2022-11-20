package implicitWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PaytmImplicitWait {


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://paytm.com/recharge");
		driver.manage().window().maximize();
		
		WebElement sc = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div[1]/div/div/div[2]/div[1]/div[2]/label"));
		sc.click();
		 

}
	
	
}
