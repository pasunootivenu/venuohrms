package testngnew;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class NewTest {
	  WebDriver driver;
	public void screenshot(String str ) throws IOException {
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("C:\\Users\\DELL\\eclipse-workspace\\sampleartifactid\\screenshots\\"+str+".png"));
		
	
	
	
	}
  @Test
  public void login() throws IOException{
	
	  driver= new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	 
	  driver.manage().window().maximize();
	  screenshot("loginscreenshot");
	  
	 
  }
}
