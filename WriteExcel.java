package Testng_programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel {
   @Test
   public void writeData() throws FileNotFoundException {
	   FileInputStream fis=new FileInputStream("C:/Users/Administrator/Documents/AutomationData.xlsx");
	   try {
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			
			XSSFSheet sheet=workbook.getSheet("Selenium");
			XSSFRow row=sheet.getRow(9);
			XSSFCell cell=row.createCell(1);
			cell.setCellValue("Dell1234");
			
			FileOutputStream fos=new FileOutputStream("C:/Users/Administrator/Documents/AutomationData.xlsx");
			workbook.write(fos);
			fos.close();
	   }catch(IOException e) {
		   e.printStackTrace();
	   }
	}   
}
