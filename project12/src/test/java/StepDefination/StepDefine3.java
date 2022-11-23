package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefine3 {
	WebDriver d;
	@Given("user opens newtours")
	public void user_opens_newtours() {
	    System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
	    d = new ChromeDriver();
	    d.get("https://demo.guru99.com/test/newtours/");
	    d.manage().window().maximize();
	}

	@When("user clicks on register window")
	public void user_clicks_on_register_window() throws InterruptedException {
		Thread.sleep(3000);
	  d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	}

	@Then("user selects India from drop down")
	public void user_selects_india_from_drop_down() {
		 d.findElement(By.name("country")).sendKeys("INDIA");
		 
	}

	@And("close the window")
	public void close_the_window() throws InterruptedException {
		Thread.sleep(3000);
	  d.close();
	}
}
