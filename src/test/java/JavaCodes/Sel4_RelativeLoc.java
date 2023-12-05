package JavaCodes;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;


import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.*;



public class Sel4_RelativeLoc {


public static void main(String[] args) {


// TODO Auto-generated method stub


//System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");


WebDriver driver=new ChromeDriver();


driver.get("https://rahulshettyacademy.com/angularpractice/");
driver.manage().window().maximize();


WebElement nameEditBox =driver.findElement(By.cssSelector("[name='name']"));


//tagname
//above
System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());


WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));


//tagname
//below

driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();



//tagname
//toleftof
WebElement iceCreamLabel =driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));

driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();



//tagname
//torightof
WebElement rdb = driver.findElement(By.id("inlineRadio1"));

System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());



driver.quit();




}

}


