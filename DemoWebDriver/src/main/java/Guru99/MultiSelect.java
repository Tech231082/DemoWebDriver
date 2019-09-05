package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jsbin.com/osebed/2");
		Select select=new Select(driver.findElement(By.id("fruits")));
		select.selectByIndex(0);
		select.selectByIndex(2);
		select.selectByIndex(3);
		System.out.println(select.isMultiple());
		select.deselectAll();

	}

}
