package Module1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f = new FileInputStream("D:\\a2.xlsx");
		XSSFWorkbook wb1 = new XSSFWorkbook(f);
		XSSFSheet ws = wb1.getSheet("Sheet1");
		Row  r1 = null;
		
		
		r1 = ws.createRow(3);
		r1.createCell(2).setCellValue("ML");
		
		r1= ws.createRow(4);
		r1.createCell(3).setCellValue("ST");
		
		r1= ws.createRow(5);
		r1.createCell(4).setCellValue("IOT");
		
		FileOutputStream f1 = new FileOutputStream("D:\\a2.xlsx");
		wb1.write(f1);
		f1.close();
		
		
		/*
		 * createrow(position)
		 * createCell(position)
		 * setCellValue(value)*/
	}

}
