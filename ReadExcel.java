package Testng_programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	@Test
	public void readData() throws FileNotFoundException{
		//Read data from excel-specify the path
		FileInputStream fis=new FileInputStream("C:/Users/Administrator/Documents/AutomationData.xlsx");
		
		//Identify the workbook in excel
		try {
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			//workbook.getSheetAt(0);
			XSSFSheet sheet=workbook.getSheet("Selenium");
			int rows=sheet.getPhysicalNumberOfRows();
			System.out.println(rows);
			int columns=sheet.getRow(1).getPhysicalNumberOfCells();
			System.out.println(columns);
			
			//printcells
			for(int i=0;i<rows;i++) {
				for(int j=0;j<columns;j++) {
					String cellData=sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(cellData+" ");
				}
				System.out.println();
			}
			workbook.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
