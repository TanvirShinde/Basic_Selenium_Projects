package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import login.LoginPage21;



public class BaseTest {

	
static WebDriver driver ;
	
   public LoginPage21  jk;
	  

	  @BeforeSuite
		public void initBrowser () {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		driver = new ChromeDriver () ;
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40 , TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
			}
	
	@AfterSuite
	public void teardown () {
		
		driver.quit();
	}
	
	@BeforeClass
	public void objectCreation () {
		
	 jk = new LoginPage21 (driver);
	
	 
	}
}
