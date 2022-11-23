package MultipleClassesWorking;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Class2 extends Class1{
  @BeforeTest
  public void paymentdetails() {
	  System.out.println("payment successfully updated");
  }
  @Test (priority=5)
  public void deliveryprocess() {
	  System.out.println("deliveryprocess successfully updated");
  }
}
