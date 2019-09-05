package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String baseUrl = "http://demo.guru99.com/test/link.html";
		driver.get(baseUrl);
		driver.findElement(By.linkText("click here")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();

	}

}
