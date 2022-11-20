package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleOpenWindows3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
	    String parent = driver.getWindowHandle();
	    
	    System.out.println("The id of main window is + "+parent);
	      
	      Thread.sleep(2000);
	      
	      driver.findElement(By.xpath("(//a[@name='link1' ])[1]")).click();
	      
	      Thread.sleep(2000);
	      
	     driver.findElement(By.xpath("(//a[@name='link1' ])[2]")).click();
	     
	      Thread.sleep(2000);
	      
	   driver.findElement(By.xpath("(//a[@name='link1' ])[3]")).click();
	      
	      
	  Set<String> allwindowsid = driver.getWindowHandles();
	    
	    System.out.println("The id are open windows :" + allwindowsid);
	    
	      int count = allwindowsid.size();
	      
	      String [] id = new String [count];
	      
	      int i=0;
	      
	      for (String s :allwindowsid) {
	    	  
	    	  id[i]=s;
	    	  i++;
	    	  
	    	  System.out.println("The id are as :" + s);
	    	  
	      }
	       
	      //facebook webpage
	      driver.switchTo().window(id[2]);
	      
	      Thread.sleep(2000);
	      
	      driver.findElement(By.linkText("Forgotten password?")).click();
	      
	      Thread.sleep(2000);
	      //yahoo webpage
	      driver.switchTo().window(id[1]);
	      
	      driver.findElement(By.linkText("COVID-19 Updates")).click();
	      
	      
	      Thread.sleep(3000);
	      
	      driver.quit();
	      
	      
	      
	     
	      
	      
	      
	      
	}
	
}




