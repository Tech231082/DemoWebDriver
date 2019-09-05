package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingDynamicPath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.toolsqa.com/automation-practice-table/");
		String row="1";
		String col="2";
		String cellValue=driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr["+row+"]/td["+col+"]")).getText();
		System.out.println(cellValue);
		String rowValue="Clock Tower Hotel";
		for(int i=1;i<=5;i++) {
			String value="null";
			value=driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr["+i+"]/th")).getText();
			if(value.equalsIgnoreCase(rowValue)) {
				for(int j=1;j<=5;j++) {
					
				}
			}
			
		}

	}

}
