package com.pluralsight;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.calculator.net");
	      driver.findElement(By.linkText("Mortgage Calculator")).click();
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[1]/tbody/tr/td[1]/table/tbody/tr[6]/td/label/span")).click();
	      //driver.findElement(By.xpath("//*[@id=\"calinputtable\"]/tbody/tr[6]/td/input[2]")).click();
	      
	      System.out.println("The Output of the Selected is" +
	    	         driver.findElement(By.id("caddoptional")).isSelected());      
	    	      System.out.println("The Output of the Enabled is" +
	    	         driver.findElement(By.id("caddoptional")).isEnabled());
	    	      System.out.println("The Output of the Displayed is" +
	    	         driver.findElement(By.id("caddoptional")).isDisplayed());
	    	      
	    	      driver.close();

	}

}
