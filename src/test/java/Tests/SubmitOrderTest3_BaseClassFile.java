package Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestComponents.BaseTest;

import org.testng.AssertJUnit;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.CartPage;
import pageobjects.CheckoutPage;
import pageobjects.ConfirmationPage;
import pageobjects.LandingPage;
import pageobjects.OrderPage;
import pageobjects.ProductCatalogue;

public class SubmitOrderTest3_BaseClassFile extends BaseTest{
	
	String productName = "ZARA COAT 3";

	// 1. BaseTest is parent class for reusable methods.; login, browser, data provider etc.
	// 2. Run Before so it will scan the parent class as well and any @before method will be executed.
	// 3. dataprovider: getdata   : Jackson Dependency: json to string then string to hashmap
	// 4. Listener : Itestlistener , use listner to update reports.
	// 5. Extent Report : extent report and extend spark report
	
	@Test(dataProvider="getData",groups= {"Purchase"})
	public void submitOrder(HashMap<String,String> input) throws IOException, InterruptedException
	{
		ProductCatalogue productCatalogue = landingPage.loginApplication(input.get("email"), input.get("password"));
		List<WebElement> products = productCatalogue.getProductList();
		productCatalogue.addProductToCart(input.get("product"));
		CartPage cartPage = productCatalogue.goToCartPage();

		Boolean match = cartPage.VerifyProductDisplay(input.get("product"));
		Assert.assertTrue(match);
		CheckoutPage checkoutPage = cartPage.goToCheckout();
		checkoutPage.selectCountry("india");
		ConfirmationPage confirmationPage = checkoutPage.submitOrder();
		String confirmMessage = confirmationPage.getConfirmationMessage();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		

	}
	
	@Test(dependsOnMethods= {"submitOrder"})
	public void OrderHistoryTest()
	{
		//"ZARA COAT 3";
		ProductCatalogue productCatalogue = landingPage.loginApplication("snnarangsumit61@gmail.com", "Test@1234");
		OrderPage ordersPage = productCatalogue.goToOrdersPage();
		Assert.assertTrue(ordersPage.VerifyOrderDisplay(productName));	
    }
	
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		
		List<HashMap<String,String>> data = getJsonDataToMap(System.getProperty("user.dir")+"//src//test//java//data//PurchaseOrder.json");
		return new Object[][]  {{data.get(0)}, {data.get(1) } };
		
	}

	
//	 @DataProvider
//	  public Object[][] getData()
//	  {
//	    return new Object[][]  {{"anshika@gmail.com","Iamking@000","ZARA COAT 3"}, {"shetty@gmail.com","Iamking@000","ADIDAS ORIGINAL" } };
//	    
//	  }
//	HashMap<String,String> map = new HashMap<String,String>();
//	map.put("email", "anshika@gmail.com");
//	map.put("password", "Iamking@000");
//	map.put("product", "ZARA COAT 3");
//	
//	HashMap<String,String> map1 = new HashMap<String,String>();
//	map1.put("email", "shetty@gmail.com");
//	map1.put("password", "Iamking@000");
//	map1.put("product", "ADIDAS ORIGINAL");


}






/*
 * 
 * To use a data provider in TestNG that reads data from a JSON file and provides it as a list of hash maps, you can follow these steps. First, you'll need to include a JSON parsing library in your project. For example, you can use the Jackson library for this purpose. Here's a simple example using Jackson:

Add Jackson Dependency:
Add the Jackson dependency to your project. If you are using Maven, include the following dependency in your pom.xml:

xml
Copy code
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.12.5</version> <!-- Use the latest version available -->
</dependency>
If you are using a different build tool, make sure to include the Jackson library accordingly.

Create a JSON File:
Create a JSON file with your test data. For example, testdata.json:

json
Copy code
[
  {"username": "user1", "password": "pass1"},
  {"username": "user2", "password": "pass2"},
  {"username": "user3", "password": "pass3"}
]
Create a Data Provider Method:
Create a data provider method that reads data from the JSON file and returns it as a list of hash maps.

java
Copy code
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class TestData {

    @DataProvider(name = "userData")
    public static Object[][] userData() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Map<String, String>> testData = objectMapper.readValue(
                new File("path/to/testdata.json"),  // Replace with the actual path
                new TypeReference<List<Map<String, String>>>() {}
        );

        Object[][] data = new Object[testData.size()][1];
        for (int i = 0; i < testData.size(); i++) {
            data[i][0] = testData.get(i);
        }
        return data;
    }
}
Make sure to replace "path/to/testdata.json" with the actual path to your JSON file.

Use the Data Provider in Test Class:
Use the data provider in your TestNG test class:

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

public class YourTestClass {

    @Test(dataProvider = "userData", dataProviderClass = TestData.class)
    public void testUser(Map<String, String> userData) {
        // Your test logic using the user data
        System.out.println("Username: " + userData.get("username"));
        System.out.println("Password: " + userData.get("password"));
    }
}
Now, when you run your TestNG test, it will use the data provided by the userData data provider method, and each test method invocation will receive a map containing the user data from the JSON file. Adjust the code as needed based on your specific requirements and project structure
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
