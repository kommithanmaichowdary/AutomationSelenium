package pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.common.io.Files;

public class PomNewtours  {
	ChromeDriver d;
	FileInputStream f2;
	By register = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a");
	By drop = By.name("country");
	By tags = By.tagName("option");
	
	String uname,pwd;
	
	
	
	FileInputStream f1;
	Properties p;
	
	
	
	
	@Given("user opens and navigate to new tours site")
	public void user_opens_and_navigate_to_new_tours_site(){
	    System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();  
	}
	

	@When("user gets the username and password from property list and clicks on link register")
	public void user_gets_the_username_and_password_from_property_list_and_clicks_on_link_register() throws IOException {
		d.findElement(register).click();
		p = new Properties();
		f1 = new FileInputStream("C:\\Users\\KOMMI\\eclipse-workspace\\project12\\src\\test\\java\\Properties\\Newtoursproperties.properties");
		p.load(f1);
		uname = p.getProperty("username");
		pwd = p.getProperty("password");
		System.out.println("Username is " + uname);
		System.out.println("password is " + pwd);
	}

	
	@Then("get the screenshot")
	public void get_the_screenshot() throws IOException {
		File img = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		Files.copy(img,new File("D://new.png"));
		System.out.println(uname + " ");
	}

	@And("get the country names from dropdown and add to excel sheet")
	public void get_the_country_names_from_dropdown_and_add_to_excel_sheet() throws IOException {
	    WebElement list1 = d.findElement(drop);
	    List<WebElement> droplinks = list1.findElements(tags);
	    System.out.println("The size is " + droplinks.size());
	    
	    f2 = new FileInputStream("D:\\NewTours.xlsx");
	    XSSFWorkbook wb = new XSSFWorkbook(f2);
	    XSSFSheet ws = wb.getSheet("Sheet1");
	    Row r = null;
	    Cell c= null;
	    for(int i=0;i<droplinks.size();i++) {
	    	r = ws.createRow(i);
	    	r.createCell(0).setCellValue(droplinks.get(i).getText());
	    	System.out.println(droplinks.get(i).getText());
	    	droplinks.get(i).click();
	    	if(droplinks.get(i).isSelected()) {
	    		r.createCell(1).setCellValue("Pass");
	    	}
	    	else {
	    		r.createCell(1).setCellValue("Fail");
	    	}
	   }
	   FileOutputStream fo = new FileOutputStream("D:\\NewTours.xlsx");
	   wb.write(fo);
	   d.close();
	}
	
	
	
}
