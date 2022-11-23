package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables1 {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://demoqa.com/webtables");
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.manage().window().maximize();
		
		
		
		String xpath1 = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[";
		String xpath2 = "]/div/div[";
		String xpath3 = "]";
		String s1 = "";
		
		for(int i=1;i<=10;i++) {
			for(int j =1,k=1 ;j<=3;j+=2) {
				s1 = d.findElement(By.xpath(xpath1 + i + xpath2 + j + xpath3)).getText();
				System.out.print(s1 + " ");
			}
			System.out.println();
		}
		
	}
}
