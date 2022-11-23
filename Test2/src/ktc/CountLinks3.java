package ktc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.navigate().to("https://demo.guru99.com/test/newtours/");
		
		
		//working on dropdownlist
		
		d.findElement(By.linkText("REGISTER")).click();
		WebElement a = d.findElement(By.xpath("//select[@name='country']"));
		List<WebElement> b = a.findElements(By.tagName("option"));
		System.out.println(b.size());
		d.close();
	}

}
