package keywordframe;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class KeywordMain {
	static WebDriver d;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		d = new ChromeDriver();
		keyword1 obj = new keyword1();
		FileInputStream f1 = new FileInputStream("C:\\Users\\KOMMI\\Downloads\\keys.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f1);
		XSSFSheet ws = wb.getSheet("Sheet1");
		Row r = null;
		Cell c = null;
		Iterator<Row> row = ws.iterator();
		while(row.hasNext()) {
			r = row.next();
			c = r.getCell(2);
			String s1 = c.getStringCellValue();
			if(s1.equals("Opening_Browser")) {
				obj.Opening_Browser();
			}
			else if(s1.equals("Navite")) {obj.Navite();}
			else if(s1.equals("User_Name")) {obj.User_Name();}
			else if(s1.equals("Password")) {obj.Password();}
			else if(s1.equals("Click")) {obj.Click();}
			else {
				obj.Close();
			}
			
			
		}

	}

}
