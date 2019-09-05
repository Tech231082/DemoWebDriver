package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.calculator.net");
	      driver.findElement(By.linkText("Interest Calculator")).click();
	      driver.findElement(By.id("cadditionat2")).click();
	      //driver.findElement(By.id("ccompound")).click();
	      Select dropdown = new Select(driver.findElement(By.id("ccompound")));
	      dropdown.selectByVisibleText("continuously");
	      System.out.println("The Output of the IsSelected " +
	    	         driver.findElement(By.id("ccompound")).isSelected());
	    	      System.out.println("The Output of the IsEnabled " +
	    	         driver.findElement(By.id("ccompound")).isEnabled());
	    	      System.out.println("The Output of the IsDisplayed " +
	    	         driver.findElement(By.id("ccompound")).isDisplayed());
	      //driver.close();

	}

}
