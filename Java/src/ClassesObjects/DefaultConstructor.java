package ClassesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefaultConstructor {
	WebDriver d ;
	DefaultConstructor() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		d = new ChromeDriver();
		
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();
		Thread.sleep(3000);
		WebElement a = d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		a.sendKeys("Admin");
		WebElement b = d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		b.sendKeys("admin123");
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();	
		d.close();
	}
	public static void  main(String[] args) throws InterruptedException {
		DefaultConstructor obj = new DefaultConstructor();
		
	}
}
