package Tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pageobjects.CartPage;
import pageobjects.CheckoutPage;
import pageobjects.LandingPage;
import pageobjects.ProductCatalogue;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmitOrderTest2_PageObject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String productName = "ZARA COAT 3";
	
		
		// Web driver manager
	    //import io.github.bonigarcia.wdm.WebDriverManager;
		//The WebDriverManager.chromedriver().setup(); line downloads the appropriate 
		//version of ChromeDriver based on your system and sets up the required system property.
				
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver =new ChromeDriver();
				
		//WebDriverManager.edgedriver().setup();
		//System.setProperty("webdrive.edge.driver", "/SeleniumProject2/msedgedriver.exe");
		//WebDriver driver= new EdgeDriver();
				
		WebDriver driver = new FirefoxDriver();
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
					
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		
		//Landing Page: To login
		LandingPage landingPage = new LandingPage(driver);
		landingPage.goTo();
		landingPage.loginApplication("snnarangsumit61@gmail.com", "Test@1234");
		
		//Product Page: To add product
		ProductCatalogue ProductCatalogue=new ProductCatalogue(driver);
		List<WebElement>products =ProductCatalogue.getProductList();
		ProductCatalogue.addProductToCart(productName);
		ProductCatalogue.goToCartPage(); 
		//due to inheritence child class object has access to parent class method
		
		//Char Page: To check the product and move to checkout
		CartPage cartPage = new CartPage(driver);
		Boolean match = cartPage.VerifyProductDisplay(productName);
		Assert.assertTrue(match);
		cartPage.goToCheckout();
		
		//Checkout Page: To Add details on Checkout page
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.selectCountry("india");
		checkoutPage.submitOrder();
				
	   // driver.quit();	
		
	}

}



/*

Page Object Model (POM) is a design pattern used in Selenium WebDriver for creating an
object-oriented structure of the pages of a web application. 
It helps in organizing and maintaining code by separating the concerns of a web page, 
its elements, and the actions that can be performed on those elements.

Here are the key concepts and components of the Page Object Model:

Page Class:

Each web page in the application has its own corresponding Page class.
The Page class encapsulates the functionality and elements of the page.
It contains methods that represent actions that can be performed on the page.

public class LoginPage {
    private WebDriver driver;

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with elements
    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}

Page Factory:

Page Factory is a class in Selenium that is used to initialize elements in the Page class.
It helps in lazy initialization, meaning elements are initialized only when they are accessed.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    // ... (same as above)

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

Test Class:

In test classes, you create an instance of the Page class and use its methods to interact with the page.
The test class focuses on test logic rather than the implementation details of the page.
java
Copy code
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("your_username", "your_password");

        // Other test logic...

        driver.quit();
    }
}

By following the Page Object Model design pattern, you achieve several benefits:

Code Reusability: Reusable page components can be used across multiple tests.
Maintainability: Changes to the UI can be localized to the corresponding Page class.
Readability: Test classes become more readable and focus on high-level test logic.




different methods for actions submit, checkout, filter, match, place order, move to next page.

*/