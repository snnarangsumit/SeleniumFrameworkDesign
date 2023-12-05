package JavaCodes;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.apache.commons.*;
import org.apache.commons.io.FileUtils;

public class Miscelleanous_Screenshot {

    	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//  System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    //	System.setProperty("webdrive.edge.driver", "/SeleniumProject1/msedgedriver.exe");
		//  Edge launch
	    //	WebDriver driver= new EdgeDriver();
		
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		
		//	driver.manage().deleteCookieNamed("sessionKey");
		
		//click on any link
		
		//login page- verify login url
			
			
			driver.get("http://google.com");
			
			File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Users\\snnar\\screenshot.png"));
		
		 //don't place in c drive
		// place files in d drive
		// if no c drive then place the file in users directory
			
			
			// driver.quit();
	}

}

