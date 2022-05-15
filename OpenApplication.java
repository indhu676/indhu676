package demoselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenApplication {
	
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Indhu\\Desktop\\bby\\simplejavamaven\\src\\test\\resources\\Drivers\\chromedriver.exe"	);
	driver=new ChromeDriver();	//Launch the Chrome Browser
	
	System.setProperty("webdriver.ie.driver","C:\\Users\\Indhu\\Desktop\\bby\\simplejavamaven\\src\\test\\resources\\Drivers\\IEDriverServer.exe"	);
	driver=new InternetExplorerDriver(); //Launch the Chrome Browser
	
	System.setProperty("webdriver.gecko.driver"," C:\\Users\\Indhu\\Desktop\\bby\\simplejavamaven\\src\\test\\resources\\Drivers\\geckodriver.exe"	);
	driver=new FirefoxDriver(); // Launch the Chrome Browser
	
	
	Thread.sleep(3000);
	driver.manage().window().maximize(); //Maximize the Browser
	Thread.sleep(3000);
	driver.get("http://google.com" ); //Open the Google Application
	Thread.sleep(3000);
    driver.close();
	}

}
