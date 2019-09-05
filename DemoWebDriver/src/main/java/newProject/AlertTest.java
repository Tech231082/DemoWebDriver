package newProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 driver.get("http://demo.guru99.com/test/delete_customer.php");			
 		
	      	
	        driver.findElement(By.name("cusid")).sendKeys("53920");					
	        driver.findElement(By.name("submit")).submit();			
	        Alert alert = driver.switchTo().alert();
	        String alertMessage= driver.switchTo().alert().getText();		
    		
	        // Displaying alert message		
	        System.out.println(alertMessage);	
	        //Thread.sleep(5000);
	        		
	        // Accepting alert		
	        alert.accept();		

	}

}
