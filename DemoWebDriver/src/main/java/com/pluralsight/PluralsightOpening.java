package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PluralsightOpening {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.navigate().to("https://www.google.com/");
		   WebElement searchField= driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
		   searchField.sendKeys("pluralsight");
		   searchField.submit();
		   driver.findElement(By.linkText("Images")).click();
		   driver.findElement(By.xpath("//*[@id=\"gsr\"]")).click();
		   //driver.findElement(By.id(""));
		   //driver.close();
	}

}
