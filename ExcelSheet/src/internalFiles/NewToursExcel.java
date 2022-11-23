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

public class NewToursExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		
		WebElement table = d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
		List<WebElement> tablelinks = table.findElements(By.tagName("a"));
		System.out.println(tablelinks.size());
		
		FileInputStream f1 = new FileInputStream("D:\\Book2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f1);
		XSSFSheet ws = wb.getSheet("Sheet1");
		Row r = null;
		Cell c = null;
		for(int i=0;i<tablelinks.size();i++) {
			System.out.println(tablelinks.get(i).getText());
			tablelinks.get(i).click();
			d.navigate().back();
			
			table = d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
			tablelinks = table.findElements(By.tagName("a"));
			
			r = ws.createRow(i);
			r.createCell(0).setCellValue(tablelinks.get(i).getText());
					
			
		
			//d.navigate().back();
			
			if(!tablelinks.get(i).isSelected()) {
				r.createCell(1).setCellValue("Pass");
			}else {
				r.createCell(1).setCellValue("fail");
			}
			
			
			
		}
		FileOutputStream fo = new FileOutputStream("D:\\Book2.xlsx");
		wb.write(fo);
		fo.close();
	}

}
