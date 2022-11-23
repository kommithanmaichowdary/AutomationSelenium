package internalFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewToursExcel2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f1 = new FileInputStream("D:\\Book3.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f1);
		XSSFSheet ws = wb.getSheet("Sheet1");
		Row r = null;
		Cell c = null;
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		WebElement table = d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
		List<WebElement> links = table.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++) {
			links.get(i).click();
			String s = d.getTitle();
			String s1 = d.getCurrentUrl();
			d.navigate().back();
			
			table = d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
			links = table.findElements(By.tagName("a"));
			
			r = ws.createRow(i);
			r.createCell(0).setCellValue(links.get(i).getText());
			r.createCell(1).setCellValue(s);
			r.createCell(2).setCellValue(s1);
			
		}
		FileOutputStream fo = new FileOutputStream("D:\\Book3.xlsx");
		wb.write(fo);
		fo.close();
	}

}
