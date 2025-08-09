package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutor {

public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	
		//scroll page: scrollby
		
	    //scroll table: ScrollTop the table down

        WebDriver driver=new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice");
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        
        Thread.sleep(3000);
        
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        
        List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        
        int Sum =0;
        for(int i=0;i<values.size();i++) 
        {
        	Integer.parseInt(values.get(i).getText());
        	Sum= Sum + Integer.parseInt(values.get(i).getText());
        	System.out.println(Sum);
        	
        	
        }
        driver.quit();
        }


}

/*
 In Selenium, the JavascriptExecutor interface is used to execute JavaScript code 
 from your WebDriver script. 
 This can be helpful when you need to perform operations 
 that are not directly supported by the WebDriver API or when you 
 want to interact with elements using JavaScript.
 
 
jsExecutor.executeScript("alert('Hello, JavaScript!');");
executes a simple JavaScript alert function that displays a pop-up with the message "Hello, JavaScript!".

jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
scrolls the page to the bottom using JavaScript.

jsExecutor.executeScript("return document.title;");
retrieves the title of the page using JavaScript and returns it as a result.

*/