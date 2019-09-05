package Guru99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru99Day9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://live.guru99.com");
		driver.findElement(By.linkText("MOBILE")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/button")).click();
		WebElement coupon=driver.findElement(By.id("coupon_code"));
		coupon.sendKeys("GURU50");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[2]/form/div/div/div/div/button")).click();
		System.out.println(driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/ul/li/ul/li/span")).getText());

	}

}
