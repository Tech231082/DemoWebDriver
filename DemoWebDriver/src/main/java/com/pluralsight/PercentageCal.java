package com.pluralsight;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PercentageCal {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
	      //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      
	      driver.navigate().to("http://www.calculator.net");
	      driver.findElement(By.linkText("Percentage Calculator")).click();
	      
	     
	      //driver.manage().window().maximize();
	      
	     
	      driver.findElement(By.id("cpar1")).sendKeys("10");	      
	      driver.findElement(By.id("cpar2")).sendKeys("50");
	      driver.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr[2]/td/input[2]")).click();
	      
	     
	    
	      //driver.close();

	}

}
