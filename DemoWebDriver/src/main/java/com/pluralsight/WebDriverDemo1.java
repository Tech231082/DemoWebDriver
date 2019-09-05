package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class WebDriverDemo1 {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		
			WebDriver driver = new FirefoxDriver();
			
			driver.navigate().to("https://calculator-1.com/");
			
			driver.findElement(By.linkText("Scientific Calculator")).click();
			

	}

}
