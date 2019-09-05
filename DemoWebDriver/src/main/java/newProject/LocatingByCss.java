package newProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingByCss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement email=driver.findElement(By.cssSelector("#email"));
		WebElement pass=driver.findElement(By.cssSelector("#pass"));
		email.sendKeys("sush.rinwa@gmail.com");
		pass.sendKeys("sushila231082");
		driver.findElement(By.cssSelector("#u_0_3")).submit();
		Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();		
		
        // Displaying alert message		
        System.out.println(alertMessage);	
        //Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();		
		driver.findElement(By.linkText("Home")).submit();

	}

}
