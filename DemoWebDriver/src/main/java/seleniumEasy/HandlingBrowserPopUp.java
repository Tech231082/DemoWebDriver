package seleniumEasy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingBrowserPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://popuptest.com/");
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[3]/b/a"));
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> iterator=handler.iterator();
		String window=iterator.next();
		System.out.println("Parent window id"+window);
		String cWindow=iterator.next();
		System.out.println("Child window id"+cWindow);
		driver.switchTo().window(cWindow);
		System.out.println("Child window title"+driver.getTitle());
		

	}

}
