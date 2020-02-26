package testngnew;

import java.io.IOException;

import org.omg.SendingContext.RunTime;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class pdftodocTest {
	WebDriver driver= new FirefoxDriver();
	@Test
  public void f() {
		String Url="https://pdf2doc.com/";
		driver.navigate().to(Url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	@Test
  public void f1() throws IOException {
 WebElement button=driver.findElement(By.xpath("//span[contains(text(),'Upload Files')]"));
 JavascriptExecutor js =(JavascriptExecutor)driver;
 js.executeScript("arguments[0].click();",button);
 Runtime.getRuntime().exec("C:\\Users\\DELL\\eclipse-workspace\\sampleartifactid\\ajrtestresume.exe");
	
		
			
			
			
			
			
	  
		}
  }

