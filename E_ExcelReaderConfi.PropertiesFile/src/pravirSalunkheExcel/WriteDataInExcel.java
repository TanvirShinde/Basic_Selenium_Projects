package pravirSalunkheExcel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcel {

  public static void main(String[] args) throws IOException {
	
	  XSSFWorkbook workbook = new XSSFWorkbook();
	  
	  XSSFSheet sh1 = workbook.createSheet("Sheet1");
	  
	  Object EmpData [] [] = {{"EMP_ID","EMP_NAME","EMP_DESIGNATION"},
			  
	                          {001,"Renuka Madane","MANAGER"} , 
	                          
	                         {002,"Atul Mishra","DEVELOPER"} ,
	                         
	                         {003,"Tanvir Shinde","QA"} ,
	                         
	                         {004,"Ambika More","HRA"}  };
	  
	                int rows = EmpData.length ;
	                int column = EmpData [0].length ;
	                
	         System.out.println("no of rows :" + rows);
	         
	         System.out.println("no of column :" + column);
	         
	         for (int r =0 ; r < rows ; r++ ) {
	        	 
	        	 XSSFRow row = sh1.createRow(r);
	        	 
	        	 for (int c= 0 ; c<column ; c++ ) {
	        		 
	        		 XSSFCell cell = row.createCell(c);
	        		 
	        		 Object value = EmpData [r] [c];
	        		 
	        		 if (value instanceof String) {
	        			 
	        			 cell.setCellValue((String)value);
	        		 }
	        		 
	        		 if (value instanceof Integer) {
	        			 
	        			 cell.setCellValue((Integer) value);
	        		 }
	        		 
	        		 if (value instanceof Boolean)  {
	        			 
	        			 cell.setCellValue((Boolean) value);
	        		 }
	        	 } 
	        	 
	         } 
	                
	      String path = "C:\\Users\\HP\\Desktop\\ExcelFileForProgramLogic\\pravirSalunkheExcelProgramData.xlsx" ;  
	      
	      FileOutputStream fout = new FileOutputStream(path);
	      
	      workbook.write(fout) ;
	      
	      fout.close();
	      
	      workbook.close();
	      
	      System.out.println("Data is written in workbook");
	      
	      


}
	
	
}
