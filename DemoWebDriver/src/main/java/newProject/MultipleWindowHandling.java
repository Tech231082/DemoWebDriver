package newProject;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/popup.php");			
        driver.manage().window().maximize();		
                		
driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
String MainWindow=driver.getWindowHandle();		

// To handle all new opened window.				
    Set<String> s1=driver.getWindowHandles();		
Iterator<String> i1=s1.iterator();		
		
while(i1.hasNext())			
{		
    String ChildWindow=i1.next();		
    		
    if(!MainWindow.equalsIgnoreCase(ChildWindow))			
    {    		
         
            // Switching to Child window
            driver.switchTo().window(ChildWindow);	                                                                                                           
            driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input"))
            .sendKeys("gaurav.3n@gmail.com");                			
            
            driver.findElement(By.name("btnLogin")).click();			
                         
	// Closing the Child Window.
                driver.close();		
    }		
}		
// Switching to Parent window i.e Main Window.
    driver.switchTo().window(MainWindow);				
	}

}
