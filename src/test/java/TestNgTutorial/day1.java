package TestNgTutorial;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {


	/*
	 
     The order of execution is as follows:
     
     @BeforeMethod method runs before each test method.
     @AfterMethod method runs after each test method.
     
     @BeforeClass method (if present) runs once before any test method in the test class, respectively.
     @AfterClass method (if present) runs once after all test methods in the test class, respectively.

     For each <test> tag in the suite:
     @BeforeTest method (if present) runs once before any test methods within that <test> tag.
     @AfterTest method(if present) run once after all test methods within that <test> tag.
    
     @BeforeSuite method runs once before the entire suite
     @AfterSuite Methods runs once after the entire suite.
    
   
	 */
	
		// TODO Auto-generated method stub
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
		
	}
	@Test
	public void Demo()
	{
		System.out.println("hello");//automation
		Assert.assertTrue(false);
	}
	@AfterSuite
	
	public void afSyite()
	{
		System.out.println("I am the no 1 from last ");
	}
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
	}
}
