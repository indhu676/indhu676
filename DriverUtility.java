package demoselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtility {
	static public WebDriver getDriver(String browser) 
	{
		if(browser.equals("chrome")) 
		{
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Indhu\\Desktop\\bby\\simplejavapro\\Drivers\\chromedriver.exe");
			  return new ChromeDriver();
		}
         if (browser.equals("ie")) 
         {
        	 System.setProperty("webdriver.ie.driver","C:\\Users\\Indhu\\Desktop\\bby\\simplejavapro\\Drivers\\IEDriverServer.exe");
         	 return new InternetExplorerDriver();
		}
         if (browser.equals("Firefox")) 
         {
        	 System.setProperty("webdriver.gecko.driver","C:\\Users\\Indhu\\Desktop\\bby\\simplejavapro\\Drivers\\geckodriver.exe");
       	      return new FirefoxDriver();
 		}
         else
         return null;
        
	}
	
}

