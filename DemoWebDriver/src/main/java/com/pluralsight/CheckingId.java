package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.navigate().to("https://www.google.com/");
		   WebElement searchField= driver.findElement(By.id("lst-ib"));
		   searchField.sendKeys("pluralsight");
		   searchField.submit();

	}

}
