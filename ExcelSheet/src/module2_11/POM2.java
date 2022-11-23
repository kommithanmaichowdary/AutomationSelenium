package module2_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM2 {
	WebDriver d ;
	By firstname = By.name("firstName");
	By lastname = By.name("lastName");
	By phone = By.name("phone");
	By email = By.name("userName");
	By address = By.name("address1");
	By city = By.name("city");
	By state = By.name("state");
	By pincode = By.name("postalCode");
	By country = By.name("country");
	
	POM2(WebDriver d){
		this.d = d;
	}
	public void firstName() {
		d.findElement(firstname).sendKeys("Kommi");
	}
	public void lastName() {
		d.findElement(lastname).sendKeys("Thanmai Chowdary");
	}
	public void phone() {
		d.findElement(phone).sendKeys("9573569819");
	}
	public void email() {
		d.findElement(email).sendKeys("vits.19731a0525@gmail.com");
	}
	public void address() {
		d.findElement(address).sendKeys("IndirammaColony");
	}
	public void city() {
		d.findElement(city).sendKeys("Kavali");
	}
	public void state() {
		d.findElement(state).sendKeys("AndhraPradesh");
	}
	public void pincode() {
		d.findElement(pincode).sendKeys("524201");
	}
	public void country() {
		d.findElement(country).sendKeys("INDIA");
	}
}
