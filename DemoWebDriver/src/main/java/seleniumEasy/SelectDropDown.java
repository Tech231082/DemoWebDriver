package seleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

public class SelectDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Select select=new Select(driver.findElement(By.id("select-demo")));
		select.selectByIndex(2);
		Select mselect=new Select(driver.findElement(By.id("multi-select")));
		mselect.deselectByIndex(4);
		//driver.findElement(By.id("printAll")).click();
		WebElement element=driver.findElement(By.id("multi-select"));
		Select se=new Select(element);
		se.selectByVisibleText("California");
		se.selectByVisibleText("Florida");
		//To get all the options that are selected in the dropdown.
		List<WebElement> allSelectedOptions = se.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions)
		{
		System.out.println("You have selected ::"+ webElement.getText());
		}
		

	}

}
