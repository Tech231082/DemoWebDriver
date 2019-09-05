package seleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByVisibleText {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https:\\wwww.facebook.com");
		Select dropdown=new Select(driver.findElement(By.id("month")));
		dropdown.selectByVisibleText("Oct");
		Select dropdown1=new Select(driver.findElement(By.id("day")));
		dropdown1.selectByVisibleText("23");
		Select dropdown2=new Select(driver.findElement(By.id("year")));
		dropdown2.selectByVisibleText("1982");
		

	}

}
