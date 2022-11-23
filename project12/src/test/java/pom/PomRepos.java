package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PomRepos {
	ChromeDriver d ;

	
	By uname = By.name("userName");
	By password = By.name("password");
	By button = By.name("submit");
	
	String url = "https://demo.guru99.com/test/newtours/";
	
	
	
//	public PomRepos(WebDriver d) {
//		this.d = (ChromeDriver) d;
//	}
	
		public PomRepos() {
		this.d = (ChromeDriver)d;
	}



	@Given("user is in newtours page")
	public void user_is_in_newtours_page() {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		d = new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
	}

	@When("user prints title & url")
	public void user_prints_title_url() {
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
	}

	@Then("user sendData")
	public void user_send_data() {
		d.findElement(uname).sendKeys("mercury");
		d.findElement(password).sendKeys("mercury");
	}

	@And("user closes window")
	public void user_closes_window() throws InterruptedException {
		Thread.sleep(3000);
		d.findElement(button).click();

	}
}
