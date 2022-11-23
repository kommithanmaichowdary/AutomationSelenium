package internalFiles;

import java.io.FileInputStream;
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

public class AmazonExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.navigate().to("https://www.amazon.in/");
		d.manage().window().maximize();
		
		
		
FileInputStream f1 = new FileInputStream("D:\\Book1.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(f1);
		XSSFSheet ws = wb.getSheet("Sheet1");
		Row r = null;
		Cell c = null;
		
		FileOutputStream fo = new FileOutputStream("D:\\Book1.xlsx");
		
		
		WebElement dropdown = d.findElement(By.id("searchDropdownBox"));
		List<WebElement> dropdownList = dropdown.findElements(By.tagName("option"));
		System.out.println(dropdownList.size());
		
		
		for(int i=0;i<dropdownList.size();i++) {
			
			System.out.println(dropdownList.get(i).getText());
			r= ws.createRow(i);
			r.createCell(0).setCellValue(dropdownList.get(i).getText());
			dropdownList.get(i).click();
			if(dropdownList.get(i).isSelected()) {
				r.createCell(1).setCellValue("pass");
			}
			else {r.createCell(1).setCellValue("fail");}
		}
		wb.write(fo);
		fo.close();
		
	}

}
