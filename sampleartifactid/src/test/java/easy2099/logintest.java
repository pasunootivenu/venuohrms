package easy2099;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class logintest {
     
      public void browsersetup() {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.easy2290.com/");
	  driver.findElement(By.name("email")).sendKeys("venup223@gmail.com");
	  driver.findElement(By.name("pwd")).sendKeys("venu@468");
	  driver.findElement(By.xpath("//input[@name='Login']")).click();
      }
	/*
	 * public static void main (String[]args) { logintest lt= new logintest();
	 * lt.browsersetup();
	 * 
	 * }
	 */
}
