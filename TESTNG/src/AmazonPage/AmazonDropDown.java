package AmazonPage;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AmazonDropDown extends Login {
  @Test(priority = 2)
  public void dropdownList() {
//	  d.findElement(By.id("searchDropdownBox")).click();
	  WebElement dropdown = d.findElement(By.id("searchDropdownBox"));
	  List<WebElement> droplist = dropdown.findElements(By.tagName("option"));
	  System.out.println(droplist.size());
	  for(int i=0;i<droplist.size();i++) {
		  System.out.println(droplist.get(i).getText());
		  droplist.get(i).click();
	  }
  }
  @Test(priority =3)
  public void screenshot() throws IOException {
	  File image = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(image,new File("D://amazon1.png"));
  }
}
