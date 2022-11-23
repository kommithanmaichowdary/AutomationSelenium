package Testrunner1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

public class Tr {
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\KOMMI\\eclipse-workspace\\project12\\src\\test\\resources\\Feature\\login3.feature",
			glue = "C:\\Users\\KOMMI\\eclipse-workspace\\project12\\src\\test\\java\\StepDefination\\StepDefine3.java",
			monochrome = true,
			plugin = {
					"pretty","html:target//htmlreports//report.html",
					"json:target//jsonreports//report.json",
					"junit:target//junitreports//report.junit.xml"
			}
		)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
