package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrowwLogin {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		driver = new ChromeDriver () ;
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40 , TimeUnit.SECONDS);
		
		driver.get("https://groww.in/login");
		
WebElement title = driver.findElement(By.xpath("//*[@class='btn51Btnbtn51RipplePrimarybtn51Primary']//span[text()='Login/Register']"));
		
				title.click();
driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys(" velocity.ctc@gmail.com");
driver.findElement(By.xpath("(//*[@class='absolute-centerbtn51ParentDimension']//*[@class='absolute-center'])[2]")).click();
WebElement pwd =driver.findElement(By.xpath("//*[@id='login_password1']"));
pwd.sendKeys("gou781990");
driver.findElement(By.xpath("//*[@class='absolute- center btn51ParentDimension']//span[text()='Submit']")).click();

				
		
		
	}
}
