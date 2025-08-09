package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LinksOnpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        //1. Give me the count of links on the page.
		//2. Count of footer section-
		
	    //  System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
    	//	System.setProperty("webdrive.edge.driver", "/SeleniumProject1/msedgedriver.exe");
		//  Edge launch
	    //	WebDriver driver= new EdgeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		//1-
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		
		//2- Limiting webdriver scope
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		
		
		//3-
		WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		
		
		
		//4- click on each link in the column and check if the pages are opening-
		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
		{
		
		//control key will open link in another tab	
		String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
		coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
		
		Thread.sleep(5000L);
			
		}
		
		
		// opens all the tabs
		Set<String> abc=driver.getWindowHandles();//4
		
		Iterator<String> it=abc.iterator();
		
		while(it.hasNext())
		{
			
		   driver.switchTo().window(it.next());
		   
		   System.out.println(driver.getTitle());
		
		}
		
		
		// driver.quit();
	}

}