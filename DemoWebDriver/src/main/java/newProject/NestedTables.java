package newProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NestedTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		String baseUrl = "http://demo.guru99.com/test/accessing-nested-table.html";
		WebDriver driver = new FirefoxDriver();

		driver.get(baseUrl);
		String innerText1 = driver.findElement(
				By.xpath("/html/body/center/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[1]")).getText(); 		
		        System.out.println(innerText1); 
		String innerText = driver.findElement(
			By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]")).getText(); 		
	        System.out.println(innerText); 
		//driver.quit();

	}

}
