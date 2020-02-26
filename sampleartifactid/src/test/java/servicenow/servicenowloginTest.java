package servicenow;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class servicenowloginTest {
             static WebDriver driver ;
	public  static void screenshot(String filename) throws IOException   { 
		  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(f, new File("C:\\Users\\DELL\\eclipse-workspace\\sampleartifactid\\screenshots\\"+filename+".png"));
	  }
 
	
  @Test(priority = 1)
  public void login() throws InterruptedException, IOException {
		  driver= new FirefoxDriver();
		  driver.get("https://dev95494.service-now.com/navpage.do");
		  driver.manage().window().maximize(); 
		  driver.manage().deleteAllCookies();	 
  }
	     
	  @Test(priority = 2)
	  public void loginsnow() throws IOException, InterruptedException {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.switchTo().frame("gsft_main");
		  driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("Admin");
          driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Test@468");
          driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
          Thread.sleep(3000);
          screenshot("dashbajjord");
	  }
	  }
	  

