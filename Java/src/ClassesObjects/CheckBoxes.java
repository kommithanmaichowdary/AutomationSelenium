package ClassesObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://demoqa.com/checkbox");
		d.manage().window().maximize();
//		d.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button")).click();
//		d.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button")).click();
//		d.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]")).click();
//
//		WebElement a1 = d.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol"));
//		List<WebElement> b1 = a1.findElements(By.tagName("li"));
//		System.out.println(b1.size());
//		for(int i=0;i<b1.size();i++) {
//			System.out.println(b1.get(i).getText());
//		}
		d.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]")).click();
		
	}

}
