package Guru99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru99Day10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://live.guru99.com/index.php/backendlogin");
		WebElement id=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		id.sendKeys("user01");
		WebElement  pass=driver.findElement(By.xpath("//*[@id=\"dummy\"]"));
		pass.sendKeys("guru99com");
		WebElement login=driver.findElement(By.xpath("//*[@id=\"login\"]"));
		login.sendKeys("guru99com");
		driver.findElement(By.xpath("/html/body/div/div/form/div/div[5]/input")).click();
		WebElement user=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		user.sendKeys("user01");
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"login\"]"));
		password.sendKeys("guru99com");
		driver.findElement(By.xpath("/html/body/div/div/form/div/div[5]/input")).click();

	}

}
