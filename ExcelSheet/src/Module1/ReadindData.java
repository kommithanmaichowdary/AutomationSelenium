package Module1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadindData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f1 = new FileInputStream("D:\\a1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f1);
		XSSFSheet ws = wb.getSheet("Read");
		Row r=null;
		Cell c = null;
		
		Iterator<Row> row = ws.iterator();
		System.out.println(row);
		
		while(row.hasNext()) {
			r = row.next();
			Iterator<Cell> cell = r.iterator();
			while(cell.hasNext()) {
				c = cell.next();
				if(c.getCellType() == c.CELL_TYPE_NUMERIC) {
					System.out.println(c.getNumericCellValue());
				}
				else if(c.getCellType() == c.CELL_TYPE_STRING){
					System.out.println(c.getStringCellValue());
				}
			}
		}
	}

}
