package demoselenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class GeneralOpenBrowser {
	static WebDriver driver;
	
	
	  @BeforeTest
	  public void launchChromeBrowser() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Indhu\\Desktop\\bby\\simplejavapro\\Drivers\\chromedriver.exe");
		  driver=DriverUtility.getDriver("chrome");
		  driver.manage().window().maximize();
	  }
	  @Test
	  public void openApplication() throws InterruptedException {
		  Thread.sleep(3000);
		  driver.get("http:\\google.com");
		  Thread.sleep(3000);
		  
		 
	  }
	  @AfterTest
	  public void closeApplication() {
		  driver.close();
		  
	  }
	
	  
}