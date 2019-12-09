package com.capgemini.seleniumjava.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
static {
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//enter URL
	driver.get("https://www.gmail.com");
	//enter the valid username
	driver.findElement(By.id("identifierId")).sendKeys("mulewa.anjali.15ee1166@gmail.com");
	//click on next
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	//enter the valid password
	driver.findElement(By.name("password")).sendKeys("goalvit@123");
	//click on next
	//driver.findElement(By.xpath("//span[text()='Next']")).click();
	driver.findElement(By.id("passwordNext")).click();
		
}
}
