package module2_11;

import org.openqa.selenium.chrome.ChromeDriver;

public class CallingPOM2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/register.php");
		d.manage().window().maximize();
		POM2 a2 = new POM2(d);
		a2.firstName();
		a2.lastName();
		a2.phone();
		a2.email();
		a2.address();
		a2.city();
		a2.state();
		a2.pincode();
		a2.country();
	}

}
