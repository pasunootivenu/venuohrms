package tax1099;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.apache.commons.exec.Executor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class tax1099Test {
	WebDriver driver ;
	@Test
  public void f() {
	  driver.findElement(By.linkText("Log in")).click();
	  driver.findElement(By.xpath("//input[@id='txtLoginEmail']")).sendKeys("venup223@gmail.com");
	  driver.findElement(By.xpath("//input[@id='txtLoginPassword']")).sendKeys("Venu@468");
	  driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
  }
	
	/*
	 * @Test(priority = 2) public void f1() throws InterruptedException {
	 * Thread.sleep(3000);
	 * driver.findElement(By.xpath("//p[contains(text(),'Forms')]")).click();
	 * Thread.sleep(3000); driver.findElement(By.linkText("New Form")).click();
	 * Thread.sleep(3000);
	 * driver.findElement(By.xpath("//div[@id='MISC']//h2[contains(text(),'1099')]")
	 * ).click(); Thread.sleep(3000); driver.findElement(By.
	 * xpath("//span[contains(text(),'-- Existing Payers --')]")).click();
	 * Thread.sleep(3000); new Select(driver.findElement(By.
	 * xpath("//input[@class='chosen-search-input valid']"))).selectByVisibleText(
	 * "venuraju");
	 * driver.findElement(By.xpath("//input[@class='chosen-search-input valid']")).
	 * sendKeys("venuraju");
	 */
		/*
		 * JavascriptExecutor js=(JavascriptExecutor)driver; WebElement button
		 * =driver.findElement(By.id("btnAddPayer"));
		 * js.executeScript("arguments[0].click();", button); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//input[@id='rblPayerType']")).click();
		 * Thread.sleep(9000);
		 * driver.findElement(By.xpath("//input[@id='PayerFedaralID']")).sendKeys(
		 * "98-7654320"); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//input[@id='PayerLastName']")).sendKeys(
		 * "venuraju"); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//input[@id='PayerAddress']")).sendKeys(
		 * "unitedstates"); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//input[@id='PayerAddress2']")).sendKeys("us22")
		 * ; Thread.sleep(3000);
		 * driver.findElement(By.xpath("//input[@id='PayerCity']")).sendKeys("usihihi");
		 * Thread.sleep(3000); new
		 * Select(driver.findElement(By.xpath("//select[@id='PayerState']"))).
		 * selectByVisibleText("Alabama"); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//input[@id='PayerZIP']")).sendKeys("35006");
		 * Thread.sleep(3000); new
		 * Select(driver.findElement(By.xpath("//select[@id='PayerCountry']"))).
		 * selectByVisibleText("United States of America"); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//input[@id='PayerPhNo']")).sendKeys(
		 * "0987456321"); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//input[@id='PayerEmail']")).sendKeys(
		 * "acsdkdkdkdk@gmail.com"); Thread.sleep(3000); //
		 * driver.findElement(By.xpath("//input[@id='Stateid']")).sendKeys("1222554");
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//input[@id='PayerClientId']")).sendKeys(
		 * "323222333"); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//div[14]//div[3]//button[1]")).click(); //new
		 * Select(driver.findElement(By.name("PayerState"))).selectByVisibleText(
		 * "Alabama"); //
		 * driver.findElement(By.xpath("//input[@id='PayerZIP']")).sendKeys("35006");
		 * //new Select(driver.findElement(By.name("PayerCountry"))).
		 * selectByVisibleText("United States Of America");
		 */
	
	
 
	//driver.findElement(By.xpath("//input[@id='btnAddPayee']")).click();//working code
  
  
  @BeforeTest
  public void beforeTest() {
	  driver= new FirefoxDriver();
	  driver.get("https://www.tax1099.com/");
	  driver.manage().window().maximize(); 
	  driver.manage().deleteAllCookies();	
	  
  }

 
  

}
