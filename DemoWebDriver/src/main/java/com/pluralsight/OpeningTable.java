package com.pluralsight;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpeningTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		//WebDriver driver1=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.toolsqa.com/automation-practice-table/");
		String cellValue=driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(cellValue);
		driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[6]/a")).click();
		System.out.println("Link has been clicked");
		java.util.List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=1;i<=10;i++) {
		System.out.println(links.get(i).getText());
		}
		int frame=driver.findElements(By.tagName("iframe")).size();
		System.out.println(frame);
		
		driver.switchTo().frame(5);
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.close();
	}

}
