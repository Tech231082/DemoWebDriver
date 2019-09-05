package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String alertMessage = "";
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		WebElement pass=driver.findElement(By.id("pass"));
		email.sendKeys("sush.rinwa@gmail.com");
		pass.sendKeys("sushila231082");
		WebElement login=driver.findElement(By.id("u_0_3"));
		//login.submit();
		System.out.println("login successful");
		email.clear();
		pass.clear();
		System.out.println("Text Field Cleared");
		

	}

}
