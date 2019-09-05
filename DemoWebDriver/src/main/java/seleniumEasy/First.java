package seleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		WebElement message=driver.findElement(By.id("user-message"));
		message.sendKeys("Hello Selenium");
		driver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
		WebElement a=driver.findElement(By.id("sum1"));
		a.sendKeys("12");
		WebElement b=driver.findElement(By.id("sum2"));
		b.sendKeys("23");
		driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();
		

	}

}
