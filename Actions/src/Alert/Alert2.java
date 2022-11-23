package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {
	WebDriver d;
	Alert alt;
	public void open_site() {
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
	} 
	public String get_title() {
		String s1 = d.getTitle();
		return s1;
	}
	public String get_url() {
		String s =d.getCurrentUrl();
		return s;
	}
	public void click_button(){
		WebElement click1= d.findElement(By.id("confirmButton"));
		click1.click();
	}
	public void switch_to_frame() {
		 alt = d.switchTo().alert();
	}
	public void get_text() throws InterruptedException {
		String a = alt.getText();
		System.out.println(a);
		Thread.sleep(2000);
		alt.accept();
	}
	public void close() {d.close();}
	public static void main(String[] args) throws InterruptedException {
		Alert2 obj = new Alert2();
		obj.open_site();
//		String q = obj.get_title();
		System.out.println(obj.get_title());
//		String w = obj.get_url();
		System.out.println(obj.get_url());
		obj.click_button();
		obj.switch_to_frame();
		obj.get_text();
		obj.close();
	}
}
