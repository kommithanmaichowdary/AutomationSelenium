package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick1 {
	WebDriver d;
	Actions act;
  @Test
  public void open_site() {
	  System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	  d = new ChromeDriver();
	  d.navigate().to("https://demoqa.com/buttons");
	  d.manage().window().maximize();
  }
  @Test(priority=1)
  public void rightclick() {
	  WebElement rightclick =d.findElement(By.id("rightClickBtn"));
	  act = new Actions(d);
	  act.contextClick(rightclick);
  }
  @Test(priority=2)
  public void get_text() {
	  System.out.println(d.findElement(By.xpath("//p[@id='rightClickMessage']")).getText());
	
  }
  @Test(priority=3)
  public void close_site() {
	  d.close();
  }
}
