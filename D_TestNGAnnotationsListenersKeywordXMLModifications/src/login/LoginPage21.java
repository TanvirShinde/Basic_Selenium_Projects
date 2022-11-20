package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage21 {

	WebDriver driver ;
 	
	@FindBy(xpath = "//*[@name='username']")
	private WebElement username;
	
	
	@FindBy (xpath = "//*[@name='password']")
	private WebElement password;
	
	@FindBy (xpath = "//*[@type='submit']")
	private WebElement loginbutton;
	
	public LoginPage21 ( WebDriver driver) 
	{
		
		this.driver = driver ;
		
		PageFactory.initElements(driver, this);
	}
	
	public void login45 () {
		
		username.sendKeys("Admin");
		
		password.sendKeys("admin123");
		
		loginbutton.click();
	}
}
