package ktc;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDropDown {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		//open amazon
		d.get("https://www.amazon.in/");
		//find dropdown element
		WebElement drop = d.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		List<WebElement> drop1 = drop.findElements(By.tagName("option"));
		
		System.out.println(drop1.size());
		
		for(int i =0;i<drop1.size();i++) {
			System.out.println(drop1.get(i).getText());
			
		}
		File a = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(a, new File("D://amazon.png"));
		
		
	}

}
