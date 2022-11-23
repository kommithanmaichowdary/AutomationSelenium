package ktc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownNextPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		
		WebElement a = d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul"));
		List<WebElement> b = a.findElements(By.tagName("a"));
		
		System.out.println(b.size());
		for(int i=0;i<b.size();i++) {
			b.get(i).click();
			Thread.sleep(3000);
			d.navigate().back();
			d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			a = d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul"));
			b = a.findElements(By.tagName("li"));
			
		}
		d.close();
		
	}

}
