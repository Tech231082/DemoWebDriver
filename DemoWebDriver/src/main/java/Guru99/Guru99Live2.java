package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Guru99Live2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://live.guru99.com");
		driver.findElement(By.linkText("MOBILE")).click();
		//driver.findElement(By.id("product-price-1")).click();
		 WebElement e = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[1]/span/span"));

        String i=e.getText();
		    System.out.println("The listed price  is " +i);
		
		driver.findElement(By.linkText("SONY XPERIA")).click();
		//driver.findElement(By.id("product-price-1")).click();
		WebElement e1=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/form/div[3]/div[2]/div/span/span"));
		String i1=e1.getText();
		
		System.out.println("The price in description is"+i1);
		if((i).contentEquals(i1)){
			System.out.println("Both are same");
			
		}else {
			System.out.println("They are different");
		}

	}

}
