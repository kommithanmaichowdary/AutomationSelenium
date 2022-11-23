package Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataExcel {
	WebDriver d;
	@Given("user opens new tour site")
	public void user_opens_new_tour_site() {
	    System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	    d = new ChromeDriver();
	    d.get("https://demo.guru99.com/test/newtours/");
	    d.manage().window().maximize();
	}

	@When("user clicks on register link")
	public void user_clicks_on_register_link() throws InterruptedException {
		Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	    
	}

	@Then("user needs to get country names from drop down")
	public void user_needs_to_get_country_names_from_drop_down() throws IOException {
	    WebElement links = d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select"));
	    List<WebElement> droplist = links.findElements(By.tagName("option"));
	    System.out.println(droplist.size());
	    FileInputStream f1 = new FileInputStream("D:\\Book7.xlsx");
	    XSSFWorkbook wb = new XSSFWorkbook(f1);
	    XSSFSheet ws = wb.getSheet("Sheet1");
	    Row r = null; Cell c = null;
	    for(int i=0 ;i<droplist.size();i++) {
	    	r = ws.createRow(i);
	    	r.createCell(0).setCellValue(droplist.get(i).getText());
	    	System.out.println(droplist.get(i).getText());
	    	droplist.get(i).click();
	    	if(droplist.get(i).isSelected()) {
	    		r.createCell(1).setCellValue("Pass");
	    	}
	    	else if(!droplist.get(i).isSelected()) {
	    		r.createCell(1).setCellValue("Fail");
	    	}
	    }
	    
	    FileOutputStream fo = new FileOutputStream("D:\\Book7.xlsx");
	    wb.write(fo);
	}

	@And("user navigate back to home page")
	public void user_navigate_back_to_home_page() {
	    d.navigate().back();
	}

	@And("user closes the page")
	public void user_closes_the_page() throws InterruptedException {
	  Thread.sleep(2000);
	  d.close();
	}

}
