package internalFiles;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		FileInputStream f1 = new FileInputStream("C:\\Users\\KOMMI\\eclipse-workspace\\ExcelSheet\\src\\internalFiles\\readdata.properties");
		Properties p1 = new Properties();
		p1.load(f1);
		
		d.navigate().to(p1.getProperty("url"));
		d.manage().window().maximize();
		d.findElement(By.name("userName")).sendKeys(p1.getProperty("username"));
		System.out.println(p1.getProperty("username"));
		System.out.println(p1.getProperty("password"));
		d.findElement(By.name("password")).sendKeys(p1.getProperty("password"));
		d.findElement(By.name("submit")).click();
	}
}
