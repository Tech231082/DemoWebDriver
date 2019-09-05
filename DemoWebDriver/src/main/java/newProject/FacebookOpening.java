package newProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookOpening {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.facebook.com");
        String tagName = "";
        String tagName1="";
        String alertMessage = "";
        
        
        tagName = driver.findElement(By.id("email")).getTagName();
        WebElement searchField=driver.findElement(By.id("email"));
        searchField.sendKeys("sush.rinwa@gmail.com");
        
        WebElement searchField1=driver.findElement(By.id("pass"));
        searchField1.sendKeys("sushila231082");
       // WebElement login=driver.findElement(By.id("u_0_2"));
       //login.submit();
        driver.findElement(By.cssSelector("#u_0_2")).submit();
       String title=driver.getTitle();
       //alertMessage = driver.switchTo().alert().getText();
       //driver.switchTo().alert().accept();
       //System.out.println(alertMessage);

       System.out.println(title);
        System.out.println(tagName);
        tagName1 = driver.findElement(By.id("pass")).getTagName();
        System.out.println(tagName1);
        //driver.findElement(By.xpath("usernavigationLabel")).click();
        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"userNavigationLabel\"]")));
	      dropdown.selectByVisibleText("Activity Log");
        

	}

}
