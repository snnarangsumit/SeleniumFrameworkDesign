package SeleniumPractice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selLocators2 {

	public static void main(String[] args) {
		
		    WebDriver driver= new ChromeDriver();
		   
		    //  For Locators use selector hub or chropath
        	//	System.setProperty("webdrive.edge.driver", "/SeleniumProject1/msedgedriver.exe");
		    //  Edge launch
	        //	WebDriver driver= new EdgeDriver();
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.get("https://rahulshettyacademy.com/locatorspractice/");
		    driver.getTitle();
		    System.out.println( driver.getTitle());
		    System.out.println( driver.getCurrentUrl());
		    
		    
		    //enter incorrect password and validate text of error message
		    driver.findElement(By.id("inputUsername")).sendKeys("Sumit");
		    driver.findElement(By.name("inputPassword")).sendKeys("hello");
		    driver.findElement(By.className("submit")).submit();
		    
		    //Timeout issue so test fail as it did not see the text

		    //CssSelector

		    driver.findElement(By.cssSelector("p.error")).getText();
		    System.out.println(driver.findElement(By.cssSelector("p.error")).getText()) ;
		    
		    //for compound class with space in between use any 1 class.
		    //driver.findElement(By.className("submit signInBtn")).submit();
		    
		   //driver.close();
		    driver.quit();
		    
		
	}

}
