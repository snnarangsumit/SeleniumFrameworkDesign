package Tests;

import org.testng.annotations.Test;

import TestComponents.BaseTest;
import TestComponents.Retry;

import pageobjects.CartPage;
import pageobjects.CheckoutPage;
import pageobjects.ConfirmationPage;
import pageobjects.ProductCatalogue;

import org.testng.AssertJUnit;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubmitOrderTest4_retryAnalyzer extends BaseTest {

	@Test(groups = { "ErrorHandling" }, retryAnalyzer = Retry.class)
	public void LoginErrorValidation() throws IOException, InterruptedException {

		// provide incorrect password
		landingPage.loginApplication("snnarangsumit61@gmail.com", "Test@123");
		Assert.assertEquals("Incorrect email or password.", landingPage.getErrorMessage());

	}

	@Test
	public void ProductErrorValidation() throws IOException, InterruptedException {

		String productName = "ZARA COAT 3";
		ProductCatalogue productCatalogue = landingPage.loginApplication("snnarangsumit61@gmail.com", "Test@1234");
		List<WebElement> products = productCatalogue.getProductList();
		productCatalogue.addProductToCart(productName);
		CartPage cartPage = productCatalogue.goToCartPage();

		// Provide incorrect product name
		Boolean match = cartPage.VerifyProductDisplay("ZARA COAT 33");
		Assert.assertFalse(match);
	}
}

/*
 * 
 * In TestNG, the RetryAnalyzer interface is used to implement custom logic for
 * retrying failed tests. When a test method fails, TestNG can re-run it based
 * on the configuration provided through the retryAnalyzer attribute in
 * the @Test annotation.
 * 
 * Here's an example of how you can implement a custom RetryAnalyzer:
 * 
 * import org.testng.IRetryAnalyzer; import org.testng.ITestResult;
 * 
 * public class CustomRetryAnalyzer implements IRetryAnalyzer { private int
 * retryCount = 0; private static final int maxRetryCount = 3; // Maximum number
 * of retries
 * 
 * @Override public boolean retry(ITestResult result) { if (retryCount <
 * maxRetryCount) { System.out.println("Retrying test " + result.getName() +
 * " with status " + getResultStatusName(result.getStatus()) + " for the " +
 * (retryCount + 1) + " time(s)."); retryCount++; return true; } return false; }
 * 
 * private String getResultStatusName(int status) { switch (status) { case
 * ITestResult.SUCCESS: return "SUCCESS"; case ITestResult.FAILURE: return
 * "FAILURE"; case ITestResult.SKIP: return "SKIP"; default: return "UNKNOWN"; }
 * } } In this example:
 * 
 * CustomRetryAnalyzer implements the IRetryAnalyzer interface. The retry method
 * is invoked when a test method fails. It checks if the maximum retry count has
 * been reached (maxRetryCount), and if not, it prints a message indicating the
 * retry attempt and returns true.
 * 
 * If the maximum retry count is reached, it returns false, and TestNG will not
 * retry the test again. The getResultStatusName method converts the numeric
 * status code to a string for better readability in the log messages.
 *  
 */
