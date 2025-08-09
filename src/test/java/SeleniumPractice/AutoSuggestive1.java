package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AutoSuggestive1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		/*
		 Handling auto-suggestive dropdowns in Selenium involves 
		 interacting with elements that dynamically change as the
		 user types into an input field. 
		 These dropdowns typically provide suggestions or search results based on the entered text.
		 */
		
		//System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//System.setProperty("webdrive.edge.driver", "/SeleniumProject1/msedgedriver.exe");
		//Edge launch
		//WebDriver driver= new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.makemytrip.com/"); //URL in the browser

		//WebElement source=driver.findElement(By.id("hp-widget__sfrom"));
		WebElement source=driver.findElement(By.id("fromCity"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(source));
		// Now you can interact with the element
		source.click();
		
		WebElement source1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
		source1.clear();
		source1.sendKeys("MUM");
		Thread.sleep(2000);
		//move 1 arrow down then click enter
		source1.sendKeys(Keys.ARROW_DOWN);
		source1.sendKeys(Keys.ENTER);
		
	
        WebElement destination=driver.findElement(By.id("toCity"));
        wait.until(ExpectedConditions.elementToBeClickable(destination));
		// Now you can interact with the element
		destination.click();
		
		
		WebElement destination1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));
		destination1.clear();
		destination1.sendKeys("DEL");
		Thread.sleep(2000);
		//move 1 arrow down then click enter
		destination1.sendKeys(Keys.ARROW_DOWN);
		destination1.sendKeys(Keys.ENTER);
			
		//driver.quit();
	}

}
