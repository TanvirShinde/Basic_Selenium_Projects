package parametrizationORfetchandWriteDataInExcelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CustomizeCodeinTermsfStaticMethodforFetch {

public static String readData (int row , int column) throws IOException  {
		
		String path = "C:\\Users\\HP\\Desktop\\ExcelFileForProgramLogic\\AmbikaMore.xlsx";
		
		File source = new File (path);
		
		FileInputStream excelfile = new FileInputStream(source);
		
		//to load the workbook 
		
		XSSFWorkbook workbook = new XSSFWorkbook(excelfile);
		
		// to get the Sheet from the workbook
		
		XSSFSheet sh1 = workbook.getSheetAt(0);
		
		String value = sh1.getRow(row).getCell(column).getStringCellValue();
		
		System.out.println("The values are : " + value);
		
		return value;
		  
}

}