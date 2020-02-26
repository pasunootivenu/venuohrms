package testngnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class actcorpNewTest {
  @Test
  public void f() {
	 System.setProperty("webdriver.chrome,driver", "\\D:\\Java\\chromedriver.exe\\");
	 WebDriver driver= new ChromeDriver();
	  driver.navigate().to("https://www.actcorp.in/");
	  driver.findElement(By.xpath("//div[@class='modal-header']//img")).click();
	  

  }
}
;