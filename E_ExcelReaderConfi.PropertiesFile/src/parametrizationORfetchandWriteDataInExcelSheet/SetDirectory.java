package parametrizationORfetchandWriteDataInExcelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetDirectory {

	
public static String readData (int row , int column) throws IOException  {
		

	         
		// to set the path of file
		File source = new File (System.getProperty("user.dir")+ "//TanvirShindeData.xlsx") ;
		
		// to load the file
		
		FileInputStream fis = new FileInputStream(source);
		
		//to load the workbook 
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		// to get the Sheet from the workbook
		
		XSSFSheet sh1 = workbook.getSheetAt(0);
		
		String value = sh1.getRow(row).getCell(column).getStringCellValue();
		
		System.out.println("The values are : " + value);
		
		return value;
		  
		
		
		
	}
}


