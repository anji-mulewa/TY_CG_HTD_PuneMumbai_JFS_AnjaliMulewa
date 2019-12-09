package com.capgemini.seleniumjava.test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActiTIMELogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}
	@Test
	public void testOne() throws InterruptedException{	
	WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//enter URL
		driver.get("http://demo.actitime.com/");
	//enter valid username
		driver.findElement(By.name("username")).sendKeys("admin");
		//enter valid password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//click on login
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);
		
		String expected = "actiTIME - Enter Time-Track";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
		
		driver.close();
		
	}
	
}
