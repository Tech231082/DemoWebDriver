package newProject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessingAllLinksTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/newtours/";	
		String underConsTitle = "Under Construction: Mercury Tours";	
		driver.get(baseUrl);					
        List linkElements = driver.findElements(By.tagName("a"));
        System.out.println(linkElements.size());
        
			//extract the link texts of each link element		
			for (int i=0;i<linkElements.size();i++) {							
			WebElement link=(WebElement) linkElements.get(i);		
			String url=link.getAttribute("href");
			//System.out.println(url);
			URL links=new URL(url);
			HttpURLConnection conn=(HttpURLConnection) links.openConnection();
			Thread.sleep(2000);
			conn.connect();
			int respCode=conn.getResponseCode();
			if(respCode>400) {
				System.out.println("The link is broken   "+links);
			}
			else {
				System.out.println("The link is not broken   "+links);
			}
						
        }		

						
    }		

	

}
