package excelTestDataRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader27 {

	
public static void main(String[] args) throws IOException {
		
		System.setProperty("log4j.configurationFile","./path_to_the_log4j2_config_file/log4j2.xml");

	
		
		// path of excel workbook which is at desktop
		String path =  "C:\\Users\\HP\\OneDrive\\Desktop\\TanvirShindeData.xlsx";
		
		// to get the path of variable 
		File source = new File (path);
		
		// load the file
		FileInputStream excelfile = new FileInputStream (source);
		
		// to load the excel file
		XSSFWorkbook workbook = new XSSFWorkbook (excelfile);
		
		// to get the sheet from the workbook
		
		XSSFSheet sh1 = workbook.getSheetAt(0);
		
		 String value = sh1.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println("The test data from excel sheet is :" + value);
		
	}
}
