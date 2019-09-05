package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AcessDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String baseURL = "http://demo.guru99.com/test/newtours/register.php";
		driver.get(baseURL);
		Select select=new Select(driver.findElement(By.name("country")));
		select.selectByVisibleText("INDIA");

	}

}
