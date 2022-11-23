package ktc;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver b = new ChromeDriver();
//		FirefoxDriver d = new FirefoxDriver();
//		d.get("https://www.amazon.com/");
		b.get("https://www.amazon.com/");
//		d.manage().window().maximize();
		b.manage().window().maximize();
		
//		d.close();
		b.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		b.findElement(By.id("twotabsearchtextbox")).sendKeys("HarryPotter");
		b.findElement(By.id("nav-search-submit-button")).click();
		b.close();
		
	}

}
