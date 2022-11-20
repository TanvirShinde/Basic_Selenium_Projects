package d__BootStrapDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDatePicker {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		
		int i=0;
		
		while (i==0) {
			
			WebElement title = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']"));
		    
	        String monthYearvalue = title.getText();
                    
	         if (!(monthYearvalue.equals("September 2022"))) {
	        	 
	        driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w' ]")).click();
	        	 
	        	 
	         }
	         else {
	        	 
	        	 break;
	         }
	       
	 	}
		  
        driver.findElement(By.xpath("//table//tr//td//a[text()='27']")).click();
        
        System.out.println("Rupesh bhai Birthday ");
        
	}
	
	
}
