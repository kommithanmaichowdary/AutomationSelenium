package AmazonPage;

import org.testng.annotations.AfterTest;

public class ClosePage extends AmazonDropDown {
  @AfterTest
  public void close() {
	  d.close();
  }
}
