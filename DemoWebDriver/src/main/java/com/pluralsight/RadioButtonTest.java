package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.calculator.net");
	      driver.findElement(By.linkText("Mortgage Payoff Calculator")).click();
	      driver.findElement(By.id("cpayoff1")).click();
	      System.out.println("The Output of the IsSelected " +
	         driver.findElement(By.id("cpayoff1")).isSelected());
	      System.out.println("The Output of the IsEnabled " +
	         driver.findElement(By.id("cpayoff1")).isEnabled());
	      System.out.println("The Output of the IsDisplayed " +
	         driver.findElement(By.id("cpayoff1")).isDisplayed());
	      

	}

}
