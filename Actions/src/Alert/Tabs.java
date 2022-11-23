package Alert;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://demoqa.com/browser-windows");
		d.manage().window().maximize();
		String parent_id = d.getWindowHandle();
		System.out.println(parent_id);
		d.findElement(By.id("tabButton")).click();
		Set<String> child_id = d.getWindowHandles();
		System.out.println(child_id);
		for(String handle : child_id) {
			if(!handle.equalsIgnoreCase(parent_id)) {
				d.switchTo().window(handle);
				System.out.println(d.findElement(By.id("sampleHeading")).getText());
			}
		}
	}

}
