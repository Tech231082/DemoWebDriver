package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenngSeleniumHQ {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.navigate().to("https://www.google.com/");
		   WebElement searchField= driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
		   Dimension dimension=searchField.getSize();
		   Point point=searchField.getLocation();
		   String tagName=searchField.getTagName();
		   String cssValue=searchField.getCssValue("input");
		   System.out.println(cssValue);
		   System.out.println(tagName);
		   System.out.println(point);
		   System.out.println(dimension);
		   boolean status=searchField.isDisplayed();
		   boolean enabled=searchField.isEnabled();
		   System.out.println(status);
		   System.out.println(enabled);
		   searchField.sendKeys("selenium");
		   searchField.clear();
		   searchField.sendKeys("selenium");
		   searchField.submit();
		   driver.findElement(By.linkText("Images")).click();
		   
		   driver.findElement(By.xpath("//*[@id=\"gsr\"]")).click();
		   

	}

}
