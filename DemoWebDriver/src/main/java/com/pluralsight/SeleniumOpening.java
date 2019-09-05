package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOpening {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.seleniumhq.org/");
		 driver.findElement(By.linkText("About")).click();
		   driver.findElement(By.linkText("Who made Selenium")).click();
		   WebElement searchField=driver.findElement(By.id("q"));
		   searchField.sendKeys("Tarun");
		   driver.close();
		   //searchField.submit();
	}

}
