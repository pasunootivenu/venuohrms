package testngnew;

import org.testng.annotations.Test;

public class GroupingiTest {
  @Test(groups = "odd")
  public void f1() {
	  System.out.println(1);
  }

@Test(groups = "even")
public void f2() {
	  System.out.println(2);
	
}
@Test(groups = "odd")
public void f3() {
	  System.out.println(1);
}
@Test(groups = "even")
public void f4() {
	  System.out.println(2);
}
@Test(groups = "odd")
public void f5() {
	  System.out.println(1);
}
}