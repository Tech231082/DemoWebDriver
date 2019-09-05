package seleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectbyIndex {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https:\\wwww.facebook.com");
		Select dropdown=new Select(driver.findElement(By.id("month")));
		dropdown.selectByIndex(2);
		Select dropdown1=new Select(driver.findElement(By.id("day")));
		dropdown1.selectByIndex(4);
		Select dropdown2=new Select(driver.findElement(By.id("year")));
		dropdown2.selectByIndex(5);
		



	}

}
