package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {
	WebDriver d;
  @Test(priority=1)
  public void open_browser() {
	  System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	  d = new ChromeDriver();
	  d.navigate().to("https://demoqa.com/radio-button");
	  d.manage().window().maximize();
  }
  @Test(priority=3)
  public void click_radio() throws InterruptedException {
	  d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label")).click();
	  Thread.sleep(3000);
  }
  @Test(priority=4)
  public void text() {
	  String text = d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p")).getText();
	  System.out.println(text);
  }
  @Test(priority=5)
  public void capture_status_all_radio() {
	  String s1 = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[";
	  String s2 = "]";
	  for(int i=2;i<=4;i++) {
		  WebElement a1 = d.findElement(By.xpath(s1 + i + s2));
		  String a= d.findElement(By.xpath(s1 + i + s2)).getText();
//		  String s3 = a.getAttribute("value")+ " " + a.getAttribute("Checked");
		  System.out.print(a + " ");

		  System.out.println(a1.getAttribute("Checked"));
	  } 
  }
}
