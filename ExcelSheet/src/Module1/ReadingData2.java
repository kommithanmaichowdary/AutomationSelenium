package Module1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingData2 {
	Row r;
	Cell c;
	XSSFWorkbook wb;XSSFSheet ws;
	ReadingData2() throws IOException{
		FileInputStream f1 = new FileInputStream("D://a1.xlsx");
		wb = new XSSFWorkbook(f1);
		ws = wb.getSheet("Read");
		r = null;
		c = null;
	}
	
	public void init() {
		Iterator<Row> row = ws.iterator();
		while(row.hasNext()) {
			r = row.next();
			Iterator<Cell> cell = r.iterator();
			while(cell.hasNext()) {
				c=cell.next();
				if(c.getCellType() == c.CELL_TYPE_NUMERIC) {
					System.out.print(c.getNumericCellValue() + "\t\t");
				}
				else if(c.getCellType() == c.CELL_TYPE_STRING) {
					System.out.print(c.getStringCellValue() + "\t\t");
				}
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws IOException {
		ReadingData2 obj = new ReadingData2();
		obj.init();
	}
}
