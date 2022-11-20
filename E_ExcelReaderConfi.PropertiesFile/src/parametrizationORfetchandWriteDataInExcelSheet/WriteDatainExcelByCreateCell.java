package parametrizationORfetchandWriteDataInExcelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDatainExcelByCreateCell {
public static void main(String[] args) throws IOException {
	

	String path = "C:\\Users\\HP\\Desktop\\ExcelFileForProgramLogic\\AmbikaMore.xlsx";
	
	
	File source = new File (path) ;
	
	FileInputStream  fis = new FileInputStream(source);
	
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	
	XSSFSheet  sh1 = workbook.getSheetAt(0);
	
	String path1 = "C:\\Users\\HP\\Desktop\\ExcelFileForProgramLogic\\AmbikaMore.xlsx";
	
	
	File source1 = new File (path1);
	
	FileOutputStream fout = new FileOutputStream(source1);
	
	sh1.createRow(14).createCell(1).setCellValue("AtulMishra");
	
	sh1.createRow(11).createCell(1).setCellValue("TanvirShinde");
	
	System.out.println("Row and cell is created and data is written in it");
	
	workbook.write(fout);
}

}