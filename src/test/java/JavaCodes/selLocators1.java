package JavaCodes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selLocators1 {

	public static void main(String[] args) {
		
		      WebDriver driver= new ChromeDriver();
		   
		
	    	// For Locators use selector hub or chropath
		   
	//	System.setProperty("webdrive.edge.driver", "/SeleniumProject1/msedgedriver.exe");
		//Edge launch
	//	WebDriver driver= new EdgeDriver();
		    //enter username and password and login
		  
		    driver.get("https://rahulshettyacademy.com/locatorspractice/");
		    driver.getTitle();
		    System.out.println( driver.getTitle());
		    System.out.println( driver.getCurrentUrl());
		    
		    driver.findElement(By.id("inputUsername")).sendKeys("Sumit");
		    driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		    driver.findElement(By.className("submit")).submit();
		    //for compound class with space in between use any 1 class.
		    // driver.findElement(By.className("submit signInBtn")).submit();
		    
		     // driver.close();
		        driver.quit();
		    
		
	}

}
