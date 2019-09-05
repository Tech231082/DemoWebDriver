package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDropTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.keenthemes.com/preview/metronic/templates/admin/ui_tree.html");
		WebElement from=driver.findElement(By.xpath("//*[@id=\"j2_7_anchor\"]"));
		WebElement to=driver.findElement(By.xpath("//*[@id=\"j2_2_anchor\"]"));
		
		Actions builder=new Actions(driver);
		Action dragAndDrop = builder.clickAndHold(from).moveToElement(to).release(to).build();
		dragAndDrop.perform();

	}

}
