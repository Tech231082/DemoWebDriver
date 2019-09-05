package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru99LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://demo.guru99.com/V4/");
		WebElement UserID=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
		UserID.sendKeys("mngr174064");
		WebElement Password=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		Password.sendKeys("juhypet");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).submit();
		
		
	}

}
