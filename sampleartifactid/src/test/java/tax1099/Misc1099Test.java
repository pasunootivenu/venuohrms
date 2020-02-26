package tax1099;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Misc1099Test {
	  WebDriver driver = new FirefoxDriver();
	  String url="https://www.tax1099.com/Forms/MISC?2019";
  @Test
  public void f1() throws InterruptedException {
	 Thread.sleep(3000);
 JavascriptExecutor js=(JavascriptExecutor)driver;
 WebElement button =driver.findElement(By.id("btnAddPayer"));
 js.executeScript("arguments[0].click();", button);

		  
		  
	  }
  @BeforeTest
  public void f() {
	  driver.navigate().to(url);
	  driver.findElement(By.xpath("//input[@id='txtLoginEmail']")).sendKeys("venup223@gmail.com");
	  driver.findElement(By.xpath("//input[@id='txtLoginPassword']")).sendKeys("Venu@468");
	  driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
  }
 
}
