package TestRunner;
//import 'RunWith'(org.junit.runner)
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = "src\\test\\resources\\Feature\\login3.feature",
   
   //path of step definition file
   glue = {"StepDefine3"},
   monochrome = true,
   plugin = {"pretty","html:target/htmlreports/report.html",
		   "json:target/jsonreports/report.json",
		   "junit:target/junitreports/report.xml"
   
   }
   )

public class Testrunner2 {
	
	

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	

}
