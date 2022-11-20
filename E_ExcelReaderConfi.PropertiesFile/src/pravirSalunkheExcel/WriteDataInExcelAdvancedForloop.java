package pravirSalunkheExcel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcelAdvancedForloop {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sh1 = workbook.createSheet("Sheet1");
		
		Object EMPData [] [] = { 
				
				{"EMP_ID","EMP_NAME","EMP_DESIGNATION"},
				  
                {001,"Renuka Madane","MANAGER"} , 
                
               {002,"Atul Mishra","DEVELOPER"} ,
               
               {003,"Tanvir Shinde","QA"} ,
               
               {004,"Ambika More","HRA"} };
		
		int rowCount= 0 ;
		
		for (  Object emp [] : EMPData) {
			
			XSSFRow row = sh1.createRow(rowCount++);
			
			int cellCount = 0 ;
			
			for (  Object value : emp   ) {
				
				XSSFCell cell = row.createCell( cellCount++);
				
				if (value instanceof String ) {
					
					cell.setCellValue((String) value);
				}
				
               if (value instanceof Integer ) {
					
					cell.setCellValue((Integer ) value);
				}
               
           	
               if (value instanceof Boolean ) {
					
					cell.setCellValue((Boolean ) value);
				}
			}
		}
		
		String path = "C:\\Users\\HP\\Desktop\\ExcelFileForProgramLogic\\AdvancedForLoopExcelDataWrite.xlsx";
		
		FileOutputStream  outstream=new FileOutputStream ( path);
		
		workbook.write(outstream);
		
		outstream.close();
		
		workbook.close();
		
		System.out.println("file written successful");

	}
}
