package testngEx;

import java.io.FileInputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelReading {
	
	public static void main(String[] args) throws Exception{
		
		FileInputStream fis = new FileInputStream("TestData.xls");
		Workbook wb =  Workbook.getWorkbook(fis);
		Sheet sh = wb.getSheet("Sheet1");
		
		int row = sh.getRows();
		int col = sh.getColumns();
		
		System.out.println(" Number of row >> "+row+" Number of coloum >> "+col);
		
		for (int i=0;i<row;i++) {
			for (int j=0;j<col; j++) {
				
				Cell ch = sh.getCell(j,i);
				String data = ch.getContents();
				System.out.print(data + "   ");
				
			}
			System.out.println();
		}
		
		
	}
}

