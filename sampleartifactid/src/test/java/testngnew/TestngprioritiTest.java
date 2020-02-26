package testngnew;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterTest;

public class TestngprioritiTest {
  @Test(description = "first",priority = 1)
  public void f() {
	  System.out.println("checking");
  }
  @Test(description = "second",priority = 0,enabled = true)
  public void newtest() {
	  System.out.println("login");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("bowserlunch");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("browserclose");
  }

}
