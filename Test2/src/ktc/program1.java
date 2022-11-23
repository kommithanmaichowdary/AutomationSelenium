package ktc;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program1 {

	public static void main(String[] args) throws InterruptedException
 {
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver a = new ChromeDriver();
	FirefoxDriver d = new FirefoxDriver();
	d.get("https://www.amazon.com/");
	a.get("https://www.google.com/");
	a.findElement(By.linkText("Gmail")).click();
	Thread.sleep(4000);
	a.navigate().back();
	a.navigate().forward();
	System.out.println(d.getTitle());
	d.close();
	a.close();
		
	}

}
