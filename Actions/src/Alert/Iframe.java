package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.dezlearn.com/nested-iframes-example/");
		d.manage().window().maximize();
		d.switchTo().frame("parent_iframe");
		d.findElement(By.id("u_5_5")).click();
		String text = d.findElement(By.xpath("//*[@id=\"processing\"]")).getText();
		System.out.println(text);
		d.switchTo().frame("iframe1");
		d.findElement(By.id("u_5_6")).click();
		System.out.println(d.findElement(By.id("processing")).getText());
		//*[@id="iframe1"]//*[@id="iframe1"]
	}

}
