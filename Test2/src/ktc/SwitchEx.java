package ktc;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchEx {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String browser = sc.next();
		switch(browser){
			case "Chrome" : System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
			ChromeDriver cdriver = new ChromeDriver();
			cdriver.navigate().to("https://www.amazon.in/");
			cdriver.manage().window().maximize();
			WebElement dropdown = cdriver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
			List<WebElement> dropdownList = dropdown.findElements(By.tagName("option"));
			System.out.println(dropdownList.size());
			
			for(int i=0;i<dropdownList.size();i++) {
				System.out.println(dropdownList.get(i).getText());
				dropdownList.get(i).click(); //obj.getlocation(value).gettext();
//				cdriver.navigate().back();
				dropdown = cdriver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
				dropdownList = dropdown.findElements(By.tagName("option"));
				
			}
			File screenshot_amazon = ((TakesScreenshot)cdriver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot_amazon, new File("D://amazon1.png"));
			cdriver.close();
			
			break;
			
			case "Firefox" : FirefoxDriver fdriver = new FirefoxDriver();
			fdriver.navigate().to("https://www.amazon.in/");
			fdriver.manage().window().maximize();
			fdriver.findElement(By.xpath("//select[@id='searchDropdownBox']")).sendKeys("Amazon Devices");
			fdriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Robots");
			fdriver.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(6000);
			fdriver.close();
			break;
			default: System.out.println("Invalid");
			break;
			
			
			
		}
	}

}
