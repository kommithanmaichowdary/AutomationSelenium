package home;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ModalPopUp {
	WebDriver d;
	Alert alt;
  @Test(priority=1)
  public void open_site() {
	  System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("https://demoqa.com/modal-dialogs");
	  d.manage().window().maximize();
  }
  @Test(priority=2)
  public void buttoncapture() {
	  d.findElement(By.xpath("//button[@id='showSmallModal']")).click();
  }
  @Test(priority=3)
  public void tabnames() {
	  WebElement a = d.findElement(By.xpath("/html/body/div[4]/div/div/div[2]"));
	  System.out.println(a.getText());
	  d.findElement(By.id("closeSmallModal")).click();
	  d.close();
  }
}
