package com.capgemini.seleniumjava.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\ketan\\Desktop\\listbox.html");
	
		WebElement listBox = driver.findElement(By.id("slv"));
		Select select = new Select(listBox);
		Thread.sleep(1000);
		select.deselectAll();
		Thread.sleep(1000);
		select.selectByIndex(0);
		Thread.sleep(1000);
		select.selectByValue("v");
		Thread.sleep(1000);
		select.selectByVisibleText("Dosa");
		Thread.sleep(1000);
		select.deselectByIndex(0);
		Thread.sleep(1000);
		select.deselectByValue("v");
		Thread.sleep(1000);
		select.deselectByVisibleText("Dosa");
	}
}
