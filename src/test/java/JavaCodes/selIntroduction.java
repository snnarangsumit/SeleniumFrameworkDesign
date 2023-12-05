package JavaCodes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Invoke Browser  > every browser has its driver class created by selenium which has methods
		// Chrome-ChromeDrive ->Methods
		// Firefox--firefox driver _Methods
		
		// Create object of Chrome browser class to access methods
		// all methods name will be same in all classes but different implementation
		// just call the methods.
		
		// Webdriver interface sits top over these classes interface is group of methods with empty body
		// its class responsibility to implement the interface. when class agrees to implement
		// interface they must agree to provide implementation/bodies to all the defined 
		// methods in interface..
		// web driver is interface, chromedriver, gekodriver, edgegriver
		// class may have webdriver methods + personal class methods
		
		// Webdriver driver: use same driver object to access chrome, firefox or edge browser methods
		
		// selenium guys approched chrome guys that we want to automate on your browser but because of 
		// our architecture design we can not invoke your browser so they have provided exe driver file
		// to launch chrome browser.
		// 1.way:  chromedriver.exe.
		// 2. way:  Selenium Manager: this will connect to we and automatically download file exe and place
		//  at path in this case no need to provide any line or exe.
		
	    //	ChromeDriver driver= new ChromeDriver();
		  //System.setProperty("webdrive.chrome.driver", "/SeleniumProject1/chromedriver.exe");
		  //System.setProperty("webdrive.gecko.driver", "/SeleniumProject1/geckodriver.exe");
		// System.setProperty("webdrive.edge.driver", "/SeleniumProject1/msedgedriver.exe");
		
		//  Chrome launch	
		  WebDriver driver= new ChromeDriver();
		    
		//Firefox launch
		// WebDriver driver= new FirefoxDriver();
		    
		//Edge launch
		//   WebDriver driver= new EdgeDriver();
		    
		    driver.get("https://rahulshettyacademy.com/");
		    driver.getTitle();
		    System.out.println( driver.getTitle());
		    System.out.println( driver.getCurrentUrl());
		  //  driver.close();
		    driver.quit();
		    
		    // close : close browser
		    // quit: close the driver multiple windows.
		    
	}

}
