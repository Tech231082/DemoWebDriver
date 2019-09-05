package Guru99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru99LiveVerify {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://live.guru99.com");
		driver.findElement(By.linkText("MOBILE")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement qty=driver.findElement(By.id("qty"));
		qty.sendKeys("1000");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/form/div[4]/div/div/div[2]/button")).click();
		String actualError="";
		String expectedError="The maximum quantity allowed for purchase is 500.";
		WebElement error=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/ul/li/ul/li/span"));
		actualError=error.getText();
		if(actualError.contentEquals(expectedError)) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		driver.findElement(By.id("empty_cart_button")).click();
		System.out.println(driver.getTitle());
		String actualMessage="SHOPPING CART IS EMPTY";
		
		WebElement web=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]/h1"));
		System.out.println(web.getText());
		
		if(actualMessage.contentEquals(web.getText())) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		

	}

}
