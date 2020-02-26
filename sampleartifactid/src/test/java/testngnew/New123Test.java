package testngnew;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class New123Test {
	WebDriver driver;
  @Test(priority = 0)
  public void f() {
	  Actions a=new Actions(driver);
	  a.moveToElement(driver.findElement(By.xpath("//i[@class='fa fa-chevron-down']"))).build().perform();
	  
	 
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.get("www.taxi1099.com");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
