package testngnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class sbisampleTest {
	WebDriver driver = new ChromeDriver();
  @Test(priority = 1)
  public void sbi() {
	  driver.navigate().to("https://www.onlinesbi.com/");
	  driver.manage().window().maximize();
	  //driver.quit();
  }
	  @Test(priority = 2)
	  public void actions () {
	  Actions a = new Actions(driver);
	  a.moveToElement(driver.findElement(By.linkText("Services"))).build().perform();

	     //driver.findElement(By.xpath("//span[@class='classicTxt']")).click();
  }
}