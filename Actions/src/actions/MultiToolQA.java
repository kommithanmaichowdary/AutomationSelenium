package actions;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiToolQA {
	WebDriver d;
	Alert alt;
	public void open_browser() {
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		d = new ChromeDriver();
		d.navigate().to("https://www.toolsqa.com/");
		d.manage().window().maximize();
	}
	public void gettitle() {
		System.out.println(d.getTitle());
	}
	public void geturl() {System.out.println(d.getCurrentUrl());}
	
	
	public void navigate() {
		d.findElement(By.xpath("/html/body/header/nav/div/div/div[3]/div/div[1]/ul/li[3]/a")).click();
	}

	public void parent_tab_id() throws InterruptedException {
		String parent_id = d.getWindowHandle();
		Set<String> child_ids = d.getWindowHandles();
		for(String handle : child_ids) {
			if(!handle.equalsIgnoreCase(parent_id)) {
				d.switchTo().window(handle);
				d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/a")).click();
				Thread.sleep(5000);
				d.close();
			}
				String parent_id1 = d.getWindowHandle();
				child_ids = d.getWindowHandles();
				for(String i : child_ids) {
					if(i.equalsIgnoreCase(parent_id1)) {
						d.switchTo().window(i);
						d.findElement(By.xpath("/html/body/header/nav/div/div/div[3]/div/div[1]/ul/li[1]/a")).click();
						Thread.sleep(5000);
						d.close();
					}
				}
				
			}
			d.switchTo().window(handle);
			d.close();
		}
		d.close();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MultiToolQA obj = new MultiToolQA();
		obj.open_browser();
		obj.gettitle();
		obj.geturl();obj.navigate();obj.parent_tab_id();
	}

}
