package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefine2 {
	WebDriver d;
	
	
	@Given("user is in google page")
	public void user_is_in_google_page() {
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		d= new ChromeDriver();d.get("https://www.google.com/");
		d.manage().window().maximize();
	}

	@When("user searches some text")
	public void user_searches_some_text() {
		d.findElement(By.name("q")).sendKeys("Software");
	}

	@Then("user click on button")
	public void user_click_on_button() throws InterruptedException {
		 Thread.sleep(3000);
	  d.findElement(By.name("btnK")).click();
	 
	}

	@And("user is navigated to page")
	public void user_is_navigated_to_page(){
		 System.out.println("navigated");
		  d.close();
	}
}
