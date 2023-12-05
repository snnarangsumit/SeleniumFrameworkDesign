package JavaCodes;
import java.util.HashMap;

import java.util.Map;


import org.openqa.selenium.Proxy;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.edge.EdgeOptions;

import org.openqa.selenium.firefox.FirefoxOptions;


public class SSLCheck {


public static void main(String[] args) {

// TODO Auto-generated method stub

//chromeoptions class helps to set behavior of browser
	
ChromeOptions options = new ChromeOptions();

// certain websites needs proxy when you see advaced link in browser
// security team will provide the details related to proxy 
// that needs to be updated in browser.

Proxy proxy = new Proxy();

proxy.setHttpProxy("ipaddress:4444");

options.setCapability("proxy", proxy);


Map<String, Object> prefs = new HashMap<String, Object>();

prefs.put("download.default_directory", "/directory/path");


options.setExperimentalOption("prefs", prefs);

// FirefoxOptions options1 = new FirefoxOptions();

// When you see invalid certificate and advanced option on browser page
// options1.setAcceptInsecureCerts(true);

// EdgeOptions options2 = new EdgeOptions();

options.setAcceptInsecureCerts(true);


//System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");


WebDriver driver = new ChromeDriver(options);

driver.get("https://expired.badssl.com/");

System.out.println(driver.getTitle());

driver.quit(); 


}


}