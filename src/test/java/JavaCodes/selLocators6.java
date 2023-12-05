package JavaCodes;
import java.time.Duration;
import org.testng.annotations.Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;


public class selLocators6 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
        // Traverse Parent and sibling
	
		//System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

		WebDriver driver = new ChromeDriver();
 
		
		//System.setProperty("webdrive.edge.driver", "/SeleniumProject1/msedgedriver.exe");
		//Edge launch
		//WebDriver driver= new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();

		driver.get("http://google.com");

		driver.navigate().to("https://rahulshettyacademy.com");

		driver.navigate().back();

		driver.navigate().forward();
		 driver.quit(); 
		}


		}


