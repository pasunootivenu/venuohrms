package testngnew;

import java.io.IOException;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class orangehrm {

	@Test
	public void f() throws InterruptedException {

		

		
		WebDriver driver= new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com");
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		  Thread.sleep(4000);
		 driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		 

	}
}
