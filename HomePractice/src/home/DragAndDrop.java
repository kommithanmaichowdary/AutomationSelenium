package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragAndDrop {
	WebDriver d;
	Actions act;
	WebElement drag,drop;
  @BeforeClass
  public void open_site() {
	  System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
	  d = new ChromeDriver();
  }
  @Test(priority=1)
  public void navigate() {
	  
	  d.navigate().to("https://demoqa.com/droppable");
	  d.manage().window().maximize();
  }
  @Test(priority=3)
  public void title() {System.out.println(d.getTitle());}
  @Test(priority=2)
  public void url() {System.out.println(d.getCurrentUrl());}
  @Test(priority=4)
  public void identifydragAndDrop() {
	  drag = d.findElement(By.xpath("//div[@id='draggable']"));
	  drop = d.findElement(By.xpath("//div[@id='droppable']"));
  }
  @Test(priority=5)
  public void draganddrop() {
	  act = new Actions(d);
	  act.dragAndDrop(drag,drop).build().perform();
  }
  @AfterClass
  public void close() {d.close();}
  
}
