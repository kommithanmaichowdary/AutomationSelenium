package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefine {
	WebDriver d;
	@Given("user is in new tours application")
	public void user_is_in_new_tours_application() {
		 System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		    d = new ChromeDriver();
		    d.get("https://demo.guru99.com/test/newtours/");
		    d.manage().window().maximize();
	}

	@When("^user needs to enter (.*) and (.*)$")
	public void user_needs_to_enter_uname_and_password(String uname ,String Password) {
	   d.findElement(By.name("userName")).sendKeys(uname);
	   d.findElement(By.name("password")).sendKeys(Password);
	}

	@Then("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	   d.findElement(By.name("submit")).click();
	}

	@And("user navigated to homepage")
	public void user_navigated_to_homepage() throws InterruptedException {
		Thread.sleep(3000);
	    d.close();
	}
	
}
