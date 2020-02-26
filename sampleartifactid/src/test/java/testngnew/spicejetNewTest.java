package testngnew;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class spicejetNewTest {
	  WebDriver driver;
	  public void screenshot(String str ) throws IOException {
		  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(f,new File("C:\\Users\\DELL\\eclipse-workspace\\sampleartifactid\\screenshots\\"+str+".png"));	  
	  }
	 
@Test(priority = 0)
  public void spicejet()  {
	
	  driver = new ChromeDriver();
	  driver.get("https://www.spicejet.com/");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	
  }
       @Test(priority = 1)
	  public void newactions() throws InterruptedException, IOException {
			
		   Actions a = new Actions(driver);
		  
	a.moveToElement(driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"))).build().perform();
	a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'SpiceClub Members')]"))).build().perform();
	driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
	  Thread.sleep(3000);
	screenshot("spicejetsignuppage");
  }
}
