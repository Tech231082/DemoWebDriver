package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String baseUrl = "http://www.facebook.com";
        String tagName = "";
        String tagName1="";
        
        driver.get(baseUrl);
        tagName=driver.findElement(By.id("email")).getTagName();
        tagName1=driver.findElement(By.id("pass")).getTagName();
        System.out.println(tagName);
        System.out.println(tagName1);

	}

}
