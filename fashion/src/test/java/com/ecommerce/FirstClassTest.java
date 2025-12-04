package com.ecommerce;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class FirstClassTest {
	 public void testMethod1() {
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(@class,'nav-line-2') and contains(.,'Account & Lists')]")).click();
		driver.findElement(By.id("ap_email_login")).sendKeys("monachary8922@gmail.com");
		//driver.findElement(By.xpath("//span[@id='continue']//input[@type='submit']")).click();
	}
	 public void testMethod2() {
			
		 WebDriver driver = new FirefoxDriver();
	        driver.get("https://www.google.com");
	        System.out.println(driver.getTitle());
	        driver.quit();
	}

}
