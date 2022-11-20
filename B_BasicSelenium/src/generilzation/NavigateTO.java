package generilzation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTO  implements CommanProperty {

	static  WebDriver driver;


	public void chrome() {
		
		System.setProperty(chromeKey, chromePath);
		
		// WebDriver driver = new ChromeDriver() ;
		
		driver = new ChromeDriver() ;
		
		driver.get("https://www.google.com");
		
		driver.manage().window().fullscreen();
		
		driver.manage().window().minimize() ;
		
		driver.navigate().to("https://www.smartprix.com");
		
		driver.quit();
		
		
	}


	
	
	
	
}
