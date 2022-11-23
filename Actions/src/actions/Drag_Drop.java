package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://jqueryui.com/droppable/");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		WebElement a = d.findElement(By.id("draggable"));
		WebElement b = d.findElement(By.id("droppable"));
		Actions act = new Actions(d);
		act.dragAndDrop(a,b).build().perform();
		Thread.sleep(4000);
		d.close();
		//act.dragAndDrop(src,dest).build().perform(); for images dragging and dropping
		
	}

}
