package newProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://demo.guru99.com/test/link.html");
		//driver.findElement(By.linkText("click here")).click();
		
		//driver.findElement(By.partialLinkText("here")).click();
		//System.out.println("Title of the page is"+driver.getTitle());
		//driver.quit();
		driver.get("http://demo.guru99.com/test/newtours/");					
        String theLinkText = driver.findElement(By					
                .partialLinkText("egis"))			
                .getText();		
        System.out.println(theLinkText);					
        theLinkText = driver.findElement(By		
                .partialLinkText("EGIS"))			
              .getText();		
        System.out.println(theLinkText);					

        //driver.quit();	

	}

}
