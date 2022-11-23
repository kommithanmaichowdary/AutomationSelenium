package ktc;

import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Right click operations
		
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.get("https://jqueryui.com/menu/");
		cdriver.manage().window().maximize();
		cdriver.switchTo().frame(0);
		
	}

}
