package amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazonnav {
	WebDriver d;
	WebElement links;
	List<WebElement> clicklinks;
	String title,url,xpath1="//*[@id=\"nav-xshop\"]/a[",xpath2 = "]",linktext;
	
	
	
	@Given("user opens browser and navigate to amazon page")
	public void user_opens_browser_and_navigate_to_amazon_page() {
	    System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	    d = new ChromeDriver();
	    d.get("https://www.amazon.com/");
	    d.manage().window().maximize();
	}

	@When("capture all the links and use navigate back method")
	public void capture_all_the_links_and_use_navigate_back_method() throws InterruptedException {
		links = d.findElement(By.id("nav-xshop"));
		clicklinks=links.findElements(By.tagName("a"));
		System.out.println(clicklinks.size());
		
		for(int i=0;i<clicklinks.size()-1;i++) {
//	    	linktext = clicklinks.get(i).getText();
	    	clicklinks.get(i).click();
	    	Thread.sleep(2000);
	    	title = d.getTitle();
	    	url = d.getCurrentUrl();
	    	System.out.println("title");
	    	System.out.println("url");
	    	System.out.println("linkText");
	    
	    }
		
	}

	@Then("get title and url of the clicked links")
	public void get_title_and_url_of_the_clicked_links() throws InterruptedException {
//	    for(int i=0;i<clicklinks.size()-1;i++) {
////	    	linktext = clicklinks.get(i).getText();
//	    	clicklinks.get(i).click();
//	    	Thread.sleep(2000);
//	    	title = d.getTitle();
//	    	url = d.getCurrentUrl();
//	    	System.out.println("title");
//	    	System.out.println("url");
//	    	System.out.println("linkText");
//	    
//	    }
	}

	@And("store them in excel sheet")
	public void store_them_in_excel_sheet() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
}
