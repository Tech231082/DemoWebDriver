package Guru99;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru99Day7 {

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
		driver.findElement(By.linkText("MY ORDERS")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[6]/span/a[1]")).click();
		WebElement view=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/h1"));
		try {
	        assertEquals("RECENT ORDERS", driver.findElement(By.cssSelector("h2")).getText());
	      } catch (Error e) {
	    	  System.out.println("*** Recent Orders failed to get displayed ***");
	    	  e.printStackTrace();	
	      }
		System.out.println("Status of order is"+view.getText());
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/a[2]")).click();
		
		String MainWindow=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);
                    Alert alert=driver.switchTo().alert();
                    //System.out.println(alert.getText());
            }
        }
		}
		 
	}
	

