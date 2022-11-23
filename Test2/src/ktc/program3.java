package ktc;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/index.php");
		d.getTitle();
		d.getCurrentUrl();
		d.findElement(By.linkText("REGISTER")).click();
		d.manage().window().maximize();
		//d.findElement(By.xpath("//input[@name='firstName'])")).sendKeys("Kommi");
		d.close();
		
	}

}
