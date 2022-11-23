package ktc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		WebElement a = d.findElement(By.xpath("//div[@id = 'navbar-brand-centered']"));
		List<WebElement> b = a.findElements(By.tagName("li"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++) {
			System.out.println(b.get(i).getText());
		}
	}

}
