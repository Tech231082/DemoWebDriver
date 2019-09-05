package newProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement radio1=driver.findElement(By.id("vfb-7-1"));
		WebElement radio2=driver.findElement(By.id("vfb-7-2"));
		WebElement radio3=driver.findElement(By.id("vfb-7-3"));
		radio1.click();			
        System.out.println("Radio Button Option 1 Selected");		
        radio2.click();			
        System.out.println("Radio Button Option 2 Selected");		
        radio3.click();			
        System.out.println("Radio Button Option 3 Selected");					
        		
        		
        		
		

	}

}
