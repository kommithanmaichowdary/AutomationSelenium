package StepDefination;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.common.io.Files;

public class StepDefineDezL {
	WebDriver d;
	FileInputStream f1;
	Properties p1 = new Properties();
	@Given("user is in dezlearn page")
	public void user_is_in_dezlearn_page() throws IOException {
	    f1 = new FileInputStream("C:\\Users\\KOMMI\\eclipse-workspace\\project12\\src\\test\\java\\Properties\\a1.properties");
	    p1.load(f1);
	    System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
	    d = new ChromeDriver();
	    d.get(p1.getProperty("url"));
	    d.manage().window().maximize();
	}
	
	@When("user prints title and url")
	public void user_prints_title_and_url() {
	 System.out.println(p1.getProperty("title"));
	 System.out.println(p1.getProperty("link"));
	}
	
	@Then("user takes screen shot")
	public void user_takes_screen_shot() throws IOException {
	  File img = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	  Files.copy(img,new File("D://q1.png"));
	}
	
	@And("user closes the window")
	public void user_closes_the_window() {
		d.close();
	}
	

}
