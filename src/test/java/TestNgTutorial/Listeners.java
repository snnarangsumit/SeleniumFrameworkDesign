package TestNgTutorial;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements Testng listeners
public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	//	System.out.println("I successfully executed Listeners Pass code");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//screenshot code 
		//response if API is failed
		
		System.out.println("I failed executed Listeners Pass code" +result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}



/*
 * 
 * 
 * 
 * In Selenium, listeners are used to intercept events during the execution of test scripts.
 *  TestNG, a popular testing framework for Java, provides a set of listeners that allow
 *   you to perform actions at various stages of the test lifecycle.
 *    Listeners can be used to customize and extend the behavior of your test scripts.
 * 
 * 
 * ITestListener: This interface provides methods that will be invoked before and after
 *  a test case is run. ie @ before and after each @test methods
java
 * onTestStart
 * onTestSuccess
 * onTestFailure
 * 
 * ISuiteListener: This interface provides methods that will be invoked before and after a suite of tests is run
 * onStart
 * onFinish
 * 
 * IInvokedMethodListener: This interface provides methods that will be invoked 
 * before and after a test method is run.
 * beforeInvocation
 *afterInvocation
 *
 *
 *IReporter:This interface provides methods that will be invoked to generate a report after all tests are run.
 *generateReport
 *
 *
 *@Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
    System.out.println("Generating Report...");
 */
