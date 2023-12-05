package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent{

	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		super(driver); 
		// from SubmitOrderTest2 class catch drive in landing page
		// Now using super send driver to abstract component class
		
		//initialization
		//this: catch the driver from SubmitOrderTest2 class and assign to driver
		this.driver=driver;
		
		//PageFactory.initElements
		//It is used to initialize the WebElements in a Page Object.
		
		PageFactory.initElements(driver, this);
		
	}
		
	//WebElement userEmails = driver.findElement(By.id("userEmail"));
	
	//PageFactory
	//In Selenium, the @FindBy annotation is used to locate and initialize WebElements in a page class. 
	//It is usually combined with other annotations such as @FindBy(id = "elementId"), 
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement passwordEle;
	
	@FindBy(id="login")
	WebElement submit;
	
	@FindBy(css="[class*='flyInOut']")
	WebElement errorMessage;

	
	public ProductCatalogue loginApplication(String email,String password)
	{
		userEmail.sendKeys(email);
		passwordEle.sendKeys(password);
		submit.click();
		ProductCatalogue productCatalogue = new ProductCatalogue(driver);
		return productCatalogue;
		
		
	}
	
	public String getErrorMessage()
	{
		waitForWebElementToAppear(errorMessage);
		return errorMessage.getText();
	}
	
	public void goTo()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	
	
	
	
	
	
}
