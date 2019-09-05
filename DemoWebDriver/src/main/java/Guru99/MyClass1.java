package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";	
		driver.get(baseUrl);
		driver.findElement(By.cssSelector(".fb_logo")).click();
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Facebook - Log In or Sign Up")) {
			System.out.println("We are back at facebook home page");
		}else {
			System.out.println("We are not back at haome page");
		}
		

	}

}
