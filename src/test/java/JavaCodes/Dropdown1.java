package JavaCodes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.time.Duration;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdrive.edge.driver", "/SeleniumProject1/msedgedriver.exe");
		//Edge launch
		//WebDriver driver= new EdgeDriver();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		//driver.get("http://google.com");

		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L); //wait for 2 seconds
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for(int i=1;i<5;i++)

		{

		driver.findElement(By.id("hrefIncAdt")).click();

		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		
		Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));

		dropdown.selectByIndex(4);

		//dropdown.selectByVisibleText("9 Adults");

		//dropdown.selectByValue("8");
		
		 driver.quit(); 
	}

}
