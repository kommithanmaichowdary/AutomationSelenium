package Day_1_Methods;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class program3 {
	@BeforeClass
	public void login() {
		System.out.println("First");
	
	}
  @Test
  public void opear() {
	  System.out.println("operation");
  }
  @AfterClass
	public void login1() {
		System.out.println("last");
	
	}
}
