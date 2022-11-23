package keywordframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyword1 {
	WebDriver d;

	
	public void Opening_Browser() {
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
	}
	public void Navite() {
		d.manage().window().maximize();
		
	}
	public void User_Name () {
		d.findElement(By.name("userName")).sendKeys("mercury");
	}
	public void Password() {
		d.findElement(By.name("password")).sendKeys("mercury");
	}
	public void Click() {
		d.findElement(By.name("submit")).click();
	}
	public void Close() {
		d.close();
	}
}
