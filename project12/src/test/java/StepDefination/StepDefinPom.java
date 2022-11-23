package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.PomRepos;

public class StepDefinPom {
	
	public static void main(String[] args) throws InterruptedException {
//
//		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
//		WebDriver d = new ChromeDriver();
//		d.get("https://demo.guru99.com/test/newtours/");
		PomRepos obj = new PomRepos();
		obj.user_is_in_newtours_page();
		obj.user_prints_title_url();
		obj.user_send_data();
		obj.user_closes_window();
	}
}
