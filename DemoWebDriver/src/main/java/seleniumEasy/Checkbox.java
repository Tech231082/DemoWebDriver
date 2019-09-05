package seleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https:\\wwww.facebook.com");
		WebElement radio=driver.findElement(By.id("u_0_9"));
		radio.click();
		Boolean result=radio.isSelected();
		System.out.println(result);
		radio.click();
		Boolean now=radio.isSelected();
		System.out.println(now);
		

	}

}
