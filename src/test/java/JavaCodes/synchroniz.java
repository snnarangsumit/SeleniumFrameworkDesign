package JavaCodes;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import java.time.Duration;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchroniz {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//System.setProperty("webdrive.edge.driver", "/SeleniumProject1/msedgedriver.exe");
		
		//Edge launch
		//WebDriver driver= new EdgeDriver();
		
	    //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.findElement(By.id("H-destination")).sendKeys("nyc");
		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);
		
		// Define a WebDriverWait instance with a timeout of, for example, 10 seconds
		WebDriverWait d = new WebDriverWait(driver, durationofseconds(10));
		
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='resultsContainer']/section/article[1]")));
		//Thread.sleep(5000L);
	
	   driver.findElement(By.xpath("//div[@id='resultsContainer']/section/article[1]")).click();
	  // driver.quit(); 
	}

	private static Duration durationofseconds(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}


