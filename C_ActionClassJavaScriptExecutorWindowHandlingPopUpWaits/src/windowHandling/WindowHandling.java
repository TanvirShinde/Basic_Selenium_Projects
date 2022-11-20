package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
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
	             
	         System.out.println("The count of all windows :" + count);
	             
	         // int [] jk =new int [3];
	         
	         String [] id = new String [4];
	     
	         int i=0;
	         
	         for (String s :allwindowsid )   {
	        	 
	        	 id[i]=s;      
	        	 
	        	 i++;
	        	 
	        	 System.out.println(s);
	         }
	         
                 driver.switchTo().window(id[3]);
                 
                 Thread.sleep(2000);
       	      
                 driver.findElement(By.xpath("(//*[@name='btnI'])[2]")).click();
                 

                 Thread.sleep(2000);
                 
                 driver.switchTo().window(id[1]);
                 
                 driver.findElement(By.xpath("//*[@name='p']")).sendKeys("Narendra_Modi");
                 
}

}