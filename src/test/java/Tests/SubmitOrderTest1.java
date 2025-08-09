package Tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SubmitOrderTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String productName = "ZARA COAT 3";
		
		// Web driver manager
		//import io.github.bonigarcia.wdm.WebDriverManager;
		//The WebDriverManager.chromedriver().setup(); line downloads the appropriate 
		//version of ChromeDriver based on your system and sets up the required system property.
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
	    //WebDriverManager.edgedriver().setup();
		//System.setProperty("webdrive.edge.driver", "/SeleniumProject2/msedgedriver.exe");
		//WebDriver driver= new EdgeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/client");
		
		//1-login to application
		//LandingPage landingPage = new LandingPage(driver);
		driver.findElement(By.id("userEmail")).sendKeys("snnarangsumit61@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Test@1234");
		driver.findElement(By.id("login")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		//wait for page to load
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
			
		//2-get all the products
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		
		//3-filter the products based on product name provided	
	    WebElement prod =	products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
		
	    //4-add to card
	    prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		
		//wait for page load and success message
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		//ng-animating
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		
		//5-click on Cart link/icon
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		
		//6-get all the elements on cart page
		List <WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));		
	    
		//7-check the product match with product name.
		Boolean match = 	cartProducts.stream().anyMatch(cartProduct-> cartProduct.getText().equalsIgnoreCase(productName));
	    Assert.assertTrue(match);
	   
	    
	    //8-click on Checkout
	   // driver.findElement(By.xpath("//button[contains(@class, 'btn-primary')]")).click();
	    //driver.findElement(By.xpath("//button[text()='Checkout']")).click();
	    
	    //Javascript Click:
	     WebElement checkout_button = driver.findElement(By.xpath("//button[text()='Checkout']"));
	     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkout_button);
	     checkout_button.click();
	    
	    
	    //9-select Country on checkout page
	    Actions a = new Actions(driver);
	    a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
	    //india present as 2nd item
	    driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
	   
	    
	    //10-Click on place order
	    //elementToBeClickable:
	    //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".action__submit")));
	    // driver.findElement(By.cssSelector(".action__submit")).click();
	
	    //Javascript Click:
	    WebElement place_order = driver.findElement(By.cssSelector(".action__submit"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", place_order);
	    place_order.click();
		
	// 10-Validat the Success message
	    String confirmMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
	    Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	//    driver.quit();	
		
	}

}



/*
 * 
 * 
 * stream() : Java Streams are a powerful addition to the Java programming language, introduced in Java 8.
 * They provide a concise and functional approach to processing collections of data
 * 
 * filter(Predicate<T> predicate): Returns a stream consisting of elements that match the given predicate.
 *
 * map(Function<T, R> mapper): Returns a stream consisting of the results of applying the given function to the elements of the stream.
 * 
 * sorted(): Returns a stream sorted according to the natural order of the elements.
 * 
 * distinct(): Returns a stream consisting of the distinct elements of the stream.
 * 
 * stream().filter
 * he filter operation is an intermediate operation that is used to filter elements based on a given predicate. It returns a new stream consisting of the elements that satisfy the specified condition.
 * 
 * stream().anyMatch
 * In Java Streams, the anyMatch operation is a terminal operation that checks whether any elements of the stream match a given predicate. It returns a boolean indicating whether at least one element of the stream satisfies the provided condition.
 * 
 * anyMatch, allMatch, and findFirst.
 * 
 * parallel()
 * 
 * parallel(), map(Function<T, R> mapper)
 * 
 * sorted()
 * 
 * distinct()
 * */
