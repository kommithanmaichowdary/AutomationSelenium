package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		String xPath1 = "/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String xPath2 = "]/td[";
		String xPath3 =	"]";
		for(int i=1;i<=36;i++) {
			for(int j=1;j<=8;j++) {
			String a = d.findElement(By.xpath(xPath1+i+xPath2+j+xPath3)).getText();
			System.out.print(a);
			}
			System.out.println();
		}
		d.close();
	}

}
