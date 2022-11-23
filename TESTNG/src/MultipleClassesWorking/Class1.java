package MultipleClassesWorking;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class1 {
  @Test(priority = 2)
  public void login() {
	  System.out.println("Welcome to Newtours");
  }
  @Test(priority = 1)
  public void customerdetails() {
	  System.out.println("customerdetails successfully updated");
  }
  @AfterTest
  public void productdetails() {
	  System.out.println("productdetails successfully updated");
  }

}
