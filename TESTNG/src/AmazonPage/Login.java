package AmazonPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	WebDriver d ;
  @BeforeTest
  public void open_browser() {
	  System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
	  d = new ChromeDriver();
	  d.navigate().to("https://www.amazon.in/");
	  d.manage().window().maximize();
  }
  @Test(priority = 1)
	  public void gettitle() {
		  System.out.println(d.getTitle());
	  }
  
}
