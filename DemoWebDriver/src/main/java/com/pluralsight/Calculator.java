package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		   driver.navigate().to("https://www.calculator.net/");
		   driver.findElement(By.linkText("Math Calculators")).click();
		   driver.findElement(By.linkText("Root Calculator")).click();
		   WebElement searchField= driver.findElement(By.xpath("/html/body"));
		   searchField.sendKeys("36");
		   driver.close();

	}

}
