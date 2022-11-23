package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert3 {
	ChromeDriver d;
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
		d.findElement(By.xpath("//button[@id='promtButton']")).click();
	}
	public void switch_to_frame() {
		 d.switchTo().alert();
	}
	public void get_text() throws InterruptedException {
		alt.sendKeys("Kommi");
//		Thread.sleep(2000);
//		alt.accept();
	}
	public void close() {d.close();}
	public static void main(String[] args) throws InterruptedException {
		Alert3 obj1 = new Alert3();
		obj1.open_site();
//		String q = obj.get_title();
		System.out.println(obj1.get_title());
//		String w = obj.get_url();
		System.out.println(obj1.get_url());
		obj1.click_button();
//		obj1.switch_to_frame();
//		obj1.get_text();
//		obj1.close();
	}
}
