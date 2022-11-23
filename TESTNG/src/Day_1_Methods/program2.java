package Day_1_Methods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class program2 {
	WebDriver d1;
  @BeforeMethod
//	@BeforeClass
  public void opening_browser() {
	  System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
	  d1 = new ChromeDriver();
	  d1.get("https://www.amazon.in/");
	  d1.manage().window().maximize();
  }

  @Test(priority = 3)
  public void get_Title() {
	  System.out.println(d1.getTitle());
  }
  @Test
  public void get_current_url() {
	  System.out.println(d1.getCurrentUrl());
  }
  @Test(priority = 4)
  public void screenshot() throws IOException {
	  File image = ((TakesScreenshot)d1).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(image,new File("D://amazon.png"));
  }
  @AfterMethod
//  @AfterClass
  public void close() {d1.close();}
}
