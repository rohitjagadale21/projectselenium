package excelsheet;

import java.io.FileInputStream;


import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Excelsheet01 {
	
	public static void main(String[] args) throws Exception  {
		FileInputStream rohit = new FileInputStream("Testdata.xls");
		
		Workbook wb = Workbook.getWorkbook(rohit);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		int row = sh.getRows();
		int col = sh.getColumns();
		
		for(int i=0;i<row; i++) {
			for(int j=0;j<col;j++) {
				
				Cell ch = sh.getCell(j,i);
				String data = ch.getContents();
				System.out.print(data +" >> ");
			}
			System.out.println();
		}
		
		
	}
}