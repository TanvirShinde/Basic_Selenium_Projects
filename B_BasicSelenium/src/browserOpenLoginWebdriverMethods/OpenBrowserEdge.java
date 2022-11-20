package browserOpenLoginWebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBrowserEdge {

	public static void main(String[] args) {
		
		//Set Property Key And Path
		System.setProperty("webdriver.edge.driver","E:\\EdgeDriver\\msedgedriver.exe" );
		
		// Object Creation
		WebDriver driver = new EdgeDriver () ;
		//Get Method
		
		driver.get("https://www.facebook.com/");
		
		
	}
}
