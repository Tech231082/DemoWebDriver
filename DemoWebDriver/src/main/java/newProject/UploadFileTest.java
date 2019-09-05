package newProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFileTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://demo.guru99.com/test/upload/";
		driver.navigate().to(baseUrl);
		WebElement upload=driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("C:\\newhtml.html");

		WebElement accept=driver.findElement(By.id("terms"));
		accept.click();
		driver.findElement(By.id("submitbutton")).click();

	}

}
