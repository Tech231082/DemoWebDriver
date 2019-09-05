package newProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/V4/");

        //Call take screenshot function

        takeSnapShot(driver, "c://test.png") ;
        public static  takeSnapShot(WebDriver driver,String fileWithPath) throws Exception{

            //Convert web driver object to TakeScreenshot

            TakesScreenshot scrShot =((TakesScreenshot)webdriver);

            //Call getScreenshotAs method to create image file

                    File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

                //Move image file to new destination

                    File DestFile=new File(fileWithPath);

                    //Copy file at destination

                    FileUtils.copyFile(SrcFile, DestFile);

        }

	}

}
