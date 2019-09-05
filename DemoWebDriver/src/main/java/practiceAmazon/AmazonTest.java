package practiceAmazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		
		//launching chrome browser
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		Actions action=new Actions(driver);
		
		driver.findElement(By.cssSelector("span.nav-line-1")).click();
		//action.moveToElement(el).build().perform();
		
	
	}

}
