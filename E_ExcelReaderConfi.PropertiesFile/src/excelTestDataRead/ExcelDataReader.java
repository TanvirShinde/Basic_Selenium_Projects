package excelTestDataRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {

	public static void main(String[] args) throws IOException {
		
		
		File source = new File (System.getProperty("user.dir") + "//RenukaMadane.xlsx");
		
		FileInputStream excelfile = new FileInputStream (source);
		
		
		XSSFWorkbook workbook = new XSSFWorkbook (excelfile);
		
		XSSFSheet sh1 = workbook.getSheetAt(0);
		
		 String value = sh1.getRow(0).getCell(0).getStringCellValue();
		 String value1 = sh1.getRow(0).getCell(1).getStringCellValue();
			
		
		System.out.println("The test data from excel sheet is :" + value);
		System.out.println("The test data from excel sheet is :" + value1);
	}
}
