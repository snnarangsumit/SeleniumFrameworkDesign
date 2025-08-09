package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;

public class CalendarHandlingDemo {

	public static void main(String[] args) {
		// Set the path of the ChromeDriver executable

		// System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

		// Create a new instance of the ChromeDriver

		WebDriver driver = new ChromeDriver();

		// Implicit wait to handle dynamic elements
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Navigate to the webpage with the calendar
		driver.get("https://example.com");

		// Locate the input field for the date (you may need to inspect the HTML to get
		// the correct selector)
		WebElement dateInput = driver.findElement(By.id("datepicker"));

		// Click on the input field to open the calendar
		dateInput.click();

		// Get the current date and the target date (you can customize this based on
		// your requirements)
		String currentDate = "01/01/2023";
		String targetDate = "12/31/2023";

		// Call a method to select the desired date
		selectDate(driver, currentDate, targetDate);

		// Close the browser
		driver.quit();
	}

	public static void selectDate(WebDriver driver, String currentDate, String targetDate) {
		// Locate the datepicker container
		WebElement datepickerContainer = driver.findElement(By.className("ui-datepicker"));

		// Find the "Next" button in the datepicker
		WebElement nextButton = datepickerContainer.findElement(By.className("ui-datepicker-next"));

		// Find the "Prev" button in the datepicker
		WebElement prevButton = datepickerContainer.findElement(By.className("ui-datepicker-prev"));

		// Create a JavaScript Executor to interact with the calendar using JavaScript
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Loop until the current date is equal to the target date
		while (!datepickerContainer.findElement(By.className("ui-datepicker-title")).getText()
				.contains(targetDate.split("/")[2])) {
			// Click the "Next" button to navigate to the next month
			nextButton.click();
		}

		// Find the day element for the target date and click it
		WebElement targetDay = datepickerContainer
				.findElement(By.xpath("//td[text()='" + targetDate.split("/")[1] + "']/.."));
		targetDay.click();
	}
}