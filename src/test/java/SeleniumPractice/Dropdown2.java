package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.time.Duration;

public class Dropdown2 
{
	public static void main(String[] args) throws InterruptedException {

	//  TODO Auto-generated method stub

	    //System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		//System.setProperty("webdrive.edge.driver", "/SeleniumProject1/msedgedriver.exe");
		//Edge launch
	    //WebDriver driver= new EdgeDriver();
		
	
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("http://spicejet.com"); //URL in the browser

		//  //a[@value='MAA']  - Xpath for chennai

		//  //a[@value='BLR']

		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]/div[2]/input")).click();
		
		driver.findElement(By.xpath("//*[@class='css-76zvg2 r-1xedbs3 r-ubezar' and text()='BLR']")).click();

		Thread.sleep(2000);

	   // driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[1]/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@class='css-76zvg2 r-1xedbs3 r-ubezar' and text()='MAA']")).click();

		//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

		
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
	    
	   // Thread.sleep(2000);

		//Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));

		//dropdown.selectByIndex(4);
		
		
		
//		driver.quit(); 
		
	}
	
}
