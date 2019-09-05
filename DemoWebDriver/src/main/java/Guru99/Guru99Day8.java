package Guru99;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Guru99Day8 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//driver.manage().window().maximize();
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
		driver.findElement(By.linkText("REORDER")).click();
		driver.findElement(By.linkText("Edit")).click();
		////*[@id=\"qty\"]
		WebElement qty=driver.findElement(By.cssSelector("input[id='qty']"));
		qty.clear();
		qty.sendKeys("2");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/form/div[4]/div/div/div[2]/button")).click();
		System.out.println(driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[3]/div/table/tfoot/tr/td[1]/strong")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[3]/div/table/tfoot/tr/td[2]/strong/span")).getText());
		
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
		
		System.out.println(driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/p[1]/a")).getText());
		Thread.sleep(2000);
		Robot robot=new Robot();
		
		driver.findElement(By.xpath("//a[contains(text(),'here to print')]")).click();
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> iterator=handler.iterator();
		String pwindow=iterator.next();
		System.out.println("Parent window id"+pwindow);
		String cWindow=iterator.next();
		System.out.println("Child window id"+cWindow);
		driver.switchTo().window(cWindow);
		System.out.println("Child window title"+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(pwindow);
		System.out.println(driver.getTitle());
		driver.close();
		/*robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);*/
		//driver.close();
		//Alert alert=driver.switchTo().alert();
		//System.out.println(alert.getText());
		//alert.accept();
		


		
		
		
		

	}

}
