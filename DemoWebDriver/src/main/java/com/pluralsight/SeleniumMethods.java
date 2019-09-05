package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.navigate().to("https://www.google.com/");
		   WebElement searchField= driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div > div.RNNXgb > div > div.a4bIc > input"));

		   searchField.sendKeys("Selenium Interview Questions");
		   searchField.submit();
		   WebElement sel=driver.findElement(By.xpath("//*[@id=\"gsr\"]"));
		   sel.click();
	}

}
