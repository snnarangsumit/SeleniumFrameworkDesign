package JavaCodes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args)
	{
        
		    /*
		     
		    assertTrue:

			assertTrue is an assertion method that verifies that the given condition is true.
			If the condition is true, the test continues execution without any issues.
			If the condition is false, the assertion fails, and the test stops executing further.
			and error msg provided is printed
			
			assertFalse:
			
			assertFalse is an assertion method that verifies that the given condition is false.
			If the condition is false, the test continues execution without any issues.
			If the condition is true, the assertion fails, and the test stops executing further.
			and error msg provided is printed

		
		*/
		
		
		
	    //System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		//WebDriver driver = new ChromeDriver();
         //  System.setProperty("webdrive.edge.driver", "/SeleniumProject1/msedgedriver.exe");
		//Edge launch
		//   WebDriver driver= new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser

		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());

		
		
		//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();

		System.out.println(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());

		//driver.quit();
	}
	
	
}
