package testngnew;

import org.testng.annotations.Test;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;


public class fileuploadNewTest {
	WebDriver driver ;
  //@Test
  public void f() {
  }
  @Test
  public void beforeTest() throws InterruptedException, IOException {
      driver= new FirefoxDriver();
	  driver.navigate().to("https://the-internet.herokuapp.com/");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.findElement(By.linkText("File Upload")).click();
	  Thread.sleep(3000);	
	
	  WebElement button = driver.findElement(By.id("file-upload"));
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  Thread.sleep(3000);
	  js.executeScript("arguments[0].click();", button);
	  Thread.sleep(3000);
	  Runtime.getRuntime().exec("C:\\Users\\DELL\\eclipse-workspace\\sampleartifactid\\ajrtestresume.exe");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
		/*
		 * driver.findElement(By.linkText("File Upload")).click(); WebElement
		 * element=driver.findElement(By.
		 * xpath("//input[@id='file-upload' and@type='file']")); element.click(); //
		 * JavascriptExecutor executor =(JavascriptExecutor)driver;
		 * //executor.executeScript("arguments[0].click();", element); // WebElement
		 * button = driver.findElement(By.xpath("//input[@id='file-upload']")); //
		 * JavascriptExecutor js =(JavascriptExecutor)driver;
		 * 
		 * 
		 * //Thread.sleep(2000);
		 * //driver.findElement(By.xpath("//input[@id='file-upload' and @type='file']"))
		 * .sendKeys(keysToSend);
		 * 
		 * 
		 * // Runtime.getRuntime().exec(
		 * "C:\\Users\\DELL\\eclipse-workspace\\sampleartifactid\\Upload1.exe"); //
		 * driver.findElement(By.xpath("//input[@id='file-submit']")).click();
		 */
		}
	
  }


