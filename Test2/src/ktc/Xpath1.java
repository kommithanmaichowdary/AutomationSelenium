package ktc;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		WebElement a = d.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/table"));
		List<WebElement> b = a.findElements(By.tagName("td"));
		System.out.println(b.size());
		for (int i=0;i<b.size();i++) {
			System.out.println(b.get(i).getText());
		}
		
	}

}
