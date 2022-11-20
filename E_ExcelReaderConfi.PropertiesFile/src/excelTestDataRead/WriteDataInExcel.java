package excelTestDataRead;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteDataInExcel {

	public static void main(String[] args) throws IOException {
		
		 String path = "C:\\Users\\HP\\Desktop\\TanvirShinde.xlsx";
		
  
		
	FileInputStream excelbook = new FileInputStream(path);
	
	XSSFWorkbook workbook = new XSSFWorkbook( excelbook );
	
	XSSFSheet sh1 = workbook.getSheetAt(0);
	
	
	
	 String path1 = "C:\\Users\\HP\\Desktop\\AmbikaMore.xlsx";
		
	
	FileOutputStream excelbook1 = new FileOutputStream(path1);
	
	
	// for row which are exist in excel sheet
     sh1.getRow(5).getCell(0).setCellValue("Tanvir");
	
	 sh1.getRow(5).getCell(1).setCellValue("Shinde");
	
	 workbook.write( excelbook1);
	
   
        
        
	
	}
}


