package MultipleClassesWorking;

import org.testng.annotations.Test;

public class Class3 extends Class2{
  @Test(priority=3)
  public void feedbackprocess() {
	  System.out.println("feedbackprocess successfully updated");
  }
  @Test(priority = 4)
  public void close() {
	  System.out.println("closed successfully");
  }
}
