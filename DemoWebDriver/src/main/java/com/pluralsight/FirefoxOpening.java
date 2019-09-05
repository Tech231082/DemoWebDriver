package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxOpening {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://support.mozilla.org/en-US/");
		WebElement searchField= driver.findElement(By.xpath("//*[@id=\"search-q\"]"));
		//searchField.sendKeys("selenium");
		

	}

}
