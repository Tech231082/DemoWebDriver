package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverDemo {

	public static void main(String[] args) {

		//System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
   //WebDriver driver=new FirefoxDriver();
   //WebDriver driver1=new FirefoxDriver();
	WebDriver driver=new ChromeDriver();
   //driver.navigate().to("https://calculator-1.com/");
   driver.navigate().to("https://google.com");
   String currentUrl=driver.getCurrentUrl();
   System.out.println("Current URL is"+currentUrl);
   String pageSource=driver.getPageSource();
   int pageSourceLength=pageSource.length();
   System.out.println("Length of page source is  "+pageSourceLength);
   String title=driver.getTitle();
   System.out.println("Title of the page is   "+title);
   int titleLength=driver.getTitle().length();
   System.out.println("Length of title is  "+titleLength);
   //driver.quit();
   //System.out.println("Current PageSource is"+pageSource);
  // driver.findElement(By.linkText("Simple Calculator")).click();
   //driver.findElement(By.id("gsr"));
   
      //WebElement searchField= driver.findElement(By.className("SDkEP"));
   //searchField.sendKeys("selenium");

	}

}
