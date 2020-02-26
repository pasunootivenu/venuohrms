package testngnew;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class headlessTest {
	  WebDriver driver;
	  public void screenshot(String str ) throws IOException {
		  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(f,new File("C:\\Users\\DELL\\eclipse-workspace\\sampleartifactid\\screenshots\\"+str+".png"));	  
	  }
  @Test
  public void headless() throws IOException {
	  ChromeOptions options=new ChromeOptions(); 
	  options.addArguments("headless"); 
	  options.addArguments("1024,768"); 
	  driver=new ChromeDriver(options);
      driver.get("https://www.eenadu.net/");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  screenshot("eenadunew");
	 System.out.println(driver.getCurrentUrl());
  }
 
}