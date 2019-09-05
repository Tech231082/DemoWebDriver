package Guru99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru99Day5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://live.guru99.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("MY ACCOUNT")).click();
		driver.findElement(By.linkText("CREATE AN ACCOUNT")).click();
		WebElement firstname=driver.findElement(By.id("firstname"));
		firstname.sendKeys("Parmod");
		WebElement lastname=driver.findElement(By.id("lastname"));
		lastname.sendKeys("Goyat");
		WebElement email=driver.findElement(By.id("email_address"));
		email.sendKeys("goyat.jivin@gmail.com");
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("goyat@1234");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/div[2]/button")).click();
		WebElement confirmation=driver.findElement(By.id("confirmation"));
		confirmation.sendKeys("goyat@1234");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/div[2]/button")).click();
		WebElement welcome=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/ul/li/ul/li/span"));
		System.out.println(welcome.getText());
		driver.findElement(By.linkText("TV")).click();
		driver.findElement(By.linkText("Add to Wishlist")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/form[1]/div/div/button[1]")).click();
		WebElement share=driver.findElement(By.xpath("//*[@id=\"email_address\"]"));
		share.sendKeys("sush.rinwa@gmail.com");
		WebElement message=driver.findElement(By.id("message"));
		message.sendKeys("Hello");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div[2]/button")).click();
		WebElement verify=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li/span"));
		System.out.println(verify.getText());



	}

}
