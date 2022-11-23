package Day_1_Methods;

import org.testng.annotations.Test;

public class Program1 {
  @Test(priority =2)
  public void open_browser() {
	  System.out.println("Application Successfully opened");
  }
  @Test(priority = 1)
  public void customer_details() {
	  System.out.println("Updated cust details");
  }
  @Test(enabled = false) //to skip the method
  public void productDetails() {
	  System.out.println("Aoduct is successfully updates");
	  
  }
  @Test(priority = 4)
  public void payment() {System.out.println("Payment done");}
  @Test
  public void feedback() {System.out.println("feedback");}
}
