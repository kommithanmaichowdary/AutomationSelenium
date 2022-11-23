package ktc;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
		String a = d.getTitle();
		System.out.println(a);
		System.out.println(d.getCurrentUrl());
		d.findElement(By.id("searchDropdownBox")).getText();
		d.findElement(By.id("searchDropdownBox")).sendKeys("Deals");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
//		d.findElement(By.id("nav-search-submit-button")).click();
		boolean selected = d.findElement(By.id("nav-search-submit-button")).isDisplayed();
		System.out.println(selected);
		Thread.sleep(5000);
		d.close();
		
		
				
	}

}
