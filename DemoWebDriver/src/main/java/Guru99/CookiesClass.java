package Guru99;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.facebook.com/");
	    driver.findElement(By.id("email")).sendKeys("sush.rinwa@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("sushila231082");
	    driver.findElement(By.id("u_0_3")).submit();
	    Set <Cookie> cookies=driver.manage().getCookies();
	    System.out.println(cookies.size());
	    /*for(Cookie cookie:cookies) {
	    	System.out.println("Cookie name:"+cookie.getName()+"Cookie Value:"+cookie.getValue());
	    }*/
	    
	    Cookie cookieN=new Cookie("newCookie","1111");
	    driver.manage().addCookie(cookieN);
	    cookies=driver.manage().getCookies();
	    
	    
	    System.out.println(cookies.size());
	    driver.manage().deleteCookieNamed("newCookie");
	    cookies=driver.manage().getCookies();
	    System.out.println(cookies.size());

	}

}
