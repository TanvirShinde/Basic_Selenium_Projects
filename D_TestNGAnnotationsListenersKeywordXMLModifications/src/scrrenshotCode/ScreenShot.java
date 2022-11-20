package scrrenshotCode;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void capturescreenshot (WebDriver driver , String filename) throws IOException  {
		
		String path = "E:\\SeleniumSnapshot";
		
		
		 TakesScreenshot snapshot = ( TakesScreenshot ) driver ;
		 
		 File source = snapshot.getScreenshotAs(OutputType.FILE);
		 
		 File destination = new File ( "E:\\SeleniumSnapshot" + filename + ".png") ;
		 
		 FileHandler.copy(source, destination);
		 
		 
		 
		 
	}
}
