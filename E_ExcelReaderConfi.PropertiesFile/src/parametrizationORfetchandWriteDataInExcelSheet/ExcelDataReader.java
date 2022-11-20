package parametrizationORfetchandWriteDataInExcelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {

	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\HP\\Desktop\\ExcelFileForProgramLogic\\AmbikaMore.xlsx";
		
		
		File source = new File (path) ;
		
		FileInputStream  fis = new FileInputStream(source);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet  sh1 = workbook.getSheetAt(0);
		
		String value1 = sh1.getRow(0).getCell(0).getStringCellValue();
		
		String value2 = sh1.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(value1);
		
		System.out.println(value2);
	}
}
