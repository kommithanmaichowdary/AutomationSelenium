package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	WebDriver d;
	public void open_site() {
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
	}
	public void get_title() {
		System.out.println(d.getTitle());
	}
	public void get_url() {
		System.out.println(d.getCurrentUrl());
	}

	public void click_alert_button() {
		d.findElement(By.id("alertButton")).click();
	}
	public void switch_to_alert() throws InterruptedException{
		Alert alt = d.switchTo().alert();
		String text = alt.getText();
		System.out.println(text);
		Thread.sleep(2000);
		alt.accept();
		
	}
	public void close() {
		d.close();
	}
public static void main(String[] args) throws InterruptedException {
	Alert1 obj = new Alert1();
	obj.open_site();
	obj.get_title();
	obj.get_url();
	obj.click_alert_button();
	obj.switch_to_alert();
	obj.close();
}
}
