package module2_11;

import org.openqa.selenium.chrome.ChromeDriver;

public class CallingPOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		String url = "https://demo.guru99.com/test/newtours/";
		d.get(url);
		d.manage().window().maximize();
		POM1 a1 = new POM1(d);
		a1.uname();
		a1.pass();
		a1.sign();
	}

}
