package Guru99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99Day6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://live.guru99.com");
		driver.findElement(By.linkText("MY ACCOUNT")).click();
		WebElement email=driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("sush.rinwa@gmail.com");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.clear();
		pass.sendKeys("sushila@1234");
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.linkText("MY WISHLIST")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/form[1]/div/table/tbody/tr[1]/td[5]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[2]/div/div/form/div/button")).click();
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[3]/div/ul/li[1]/button")).click();
		Select select=new Select(driver.findElement(By.id("billing-address-select")));
		select.selectByValue("4095");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[1]/div[2]/form/div/div/button")).click();
		
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[3]/div[2]/form/div[3]/button"));
		
		ele.click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[4]/div[2]/form/div/dl/dt[2]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[4]/div[2]/div[2]/button")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[5]/div[2]/div/div[2]/div/button")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]/h1")).getText());
		WebElement order=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/p[1]/a"));
		System.out.println("Your Order has been Placed and your order number is"+order.getText());
		order.click();
		Thread.sleep(2000);
		//System.out.println("Your Order has been Placed and your order number is"+order.getText());
		
		
		

	}

}
