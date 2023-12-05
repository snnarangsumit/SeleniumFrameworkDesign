package JavaCodes;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AlertsAssignment {

	public static void main(String[] args) {

		/*
		The driver.switchTo().alert() method is used to switch the focus to the alert.
		
		You can get the text of the alert using alert.getText().
		
		You can accept (click OK) the alert using alert.accept().
		
		you can dismiss (click Cancel) the alert using alert.dismiss().
		*/
		
		String text="Rahul";

		//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		WebDriver driver = new ChromeDriver();
        //   System.setProperty("webdrive.edge.driver", "/SeleniumProject1/msedgedriver.exe");
		//   Edge launch
		//   WebDriver driver= new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		
		driver.findElement(By.id("name")).sendKeys(text);

		
		
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();

		
		
		
		driver.findElement(By.id("confirmbtn")).click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();
		
		//driver.quit();

	}
		
}
