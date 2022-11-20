package instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement un= driver.findElement(By.name("username"));
		
	//WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	
	          un.sendKeys("Shindetanvir@gmail.com");
	          
	 WebElement password = driver.findElement(By.xpath("//input[@name='password']")); 
	 
	          password.sendKeys("tanu@2771993");
	          
	          //Thread.sleep(2000);
	          

	          
	          //  system xpath
	          
	          
	 //WebElement button  = driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div[1]/div[2]/form/div/div[3]")) ;   
	          
	
		
		
		

WebElement login = driver.findElement(By.xpath("//div[contains(@class, 'qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm    bkEs3                          ')][1]"));
		
          login.click();
          
  
	}
	
	
	

}
