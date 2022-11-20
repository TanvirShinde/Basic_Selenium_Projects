package browserOpenLoginWebdriverMethods;


import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserWithURL {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver () ;
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		       
		
		
	}
}
