package DateHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBoxbyFindElements {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);	
		
		
		 List<WebElement> daylist = driver.findElements(By.xpath("(//*[@id='day'])//option")); 
		 
		                int count = daylist.size();
		                
		                             
		  
         for (WebElement day : daylist) {
        	 
        	System.out.println("The Daylist as :"+ " "+  day.getText() + " " );
        	 
        	 if (day.getText().equals("27")) {
        		 
        		 day.click();
        		 
        		 
        		 
        		 	 
        	 }
         }
	

 		List<WebElement> monthlist = driver.findElements(By.xpath("(//*[@id='month'])//option"));
 		
 		for  (WebElement month: monthlist)  {
 			
 			System.out.println("The monthlist as :"+ " "+  month.getText() + " " );
       	 
 			
 			if (month.getText().equals("Jul")) {
 				
 				month.click();
 			}
 		}
		
	List<WebElement> yearlist = driver.findElements(By.xpath("(//*[@id='year'])//option"));
	
	
		for (WebElement year: yearlist)  {
			
			System.out.println("The yearlist as :"+ " "+  year.getText() + " " );
			
			if(year.getText().equals("1993")) {
				
				year.click();
			}
		}
		
	
	 
	}
	
	
	
}


