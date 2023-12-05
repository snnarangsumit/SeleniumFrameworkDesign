package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import AbstractComponents.AbstractComponent;

public class ProductCatalogue extends AbstractComponent {

	WebDriver driver;

	public ProductCatalogue(WebDriver driver) {
		// initialization
		
		// Super: from standalone2 class catch drive in landing page
		// Now using super send driver to abstract component class
		
		super(driver);
		
		//this: catch the driver from standalone2  class and assign to driver
		this.driver = driver;
		
		//PageFactory.initElements
		//It is used to initialize the WebElements in a Page Object.s
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = ".mb-3")
	List<WebElement> products;
	
	@FindBy(css = ".ng-animating")
	WebElement spinner;

	By productsBy = By.cssSelector(".mb-3");
	By addToCart = By.cssSelector(".card-body button:last-of-type");
	By toastMessage = By.cssSelector("#toast-container");

	//page factory is exclusively for driver.findelement
	//in below case you have to use by element
	
	//get product list
	public List<WebElement> getProductList() {
		waitForElementToAppear(productsBy);
		return products;
	}
	
	//get product by name with the help of above list
	public WebElement getProductByName(String productName)
	{
		WebElement prod =	getProductList().stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
		return prod;
	}
	
	
	//add product to cart
	public void addProductToCart(String productName) throws InterruptedException
	{
		WebElement prod = getProductByName(productName);
		prod.findElement(addToCart).click();
		waitForElementToAppear(toastMessage);
		waitForElementToDisappear(spinner);
	}
	


}
