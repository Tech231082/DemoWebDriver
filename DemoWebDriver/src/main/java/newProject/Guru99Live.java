package newProject;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99Live {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://live.guru99.com");
		String title;
		title =driver.getTitle();
		System.out.println(title);
		String ExpectedTitle="Home page";
		if (title.contentEquals(ExpectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
		String actualTitle1;
		driver.findElement(By.linkText("MOBILE")).click();
		actualTitle1=driver.getTitle();
		String expectedTitle="Mobile";
		System.out.println(actualTitle1);
		assertEquals(expectedTitle,actualTitle1);
		
		Select dropdown=new Select(driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")));
		dropdown.selectByVisibleText("Name");
		//dropdown.getFirstSelectedOption();
		//System.out.println();

	}

}
