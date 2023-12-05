package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {

	
	public static ExtentReports getReportObject()
	{
		
		//Path of extent report
		//extent spark to add configurations details
		//use listerner to create test of extent and flush it.
		String path =System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		ExtentReports extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Sumit Narang");
		return extent;
		
		
		
	}
}



/*
 * 
 * Extent spark : used for configuration
   Extend: user for main reporting

 *Extent Reports is a popular reporting library for Selenium WebDriver that 
 *provides interactive and detailed HTML reports for test executions.
 *
 * The Extent Spark Reporter is an extension of Extent Reports that adds a Spark-style dashboard
 *  to the reports, making them more visually appealing and interactive.

Here's how you can use Extent Reports with the Extent Spark Reporter:

Add Dependencies:
Include the Extent Reports and Extent Spark Reporter dependencies in your project.
 If you are using Maven, include the following dependencies in your pom.xml:

<dependency>
    <groupId>com.aventstack</groupId>
    <artifactId>extentreports</artifactId>
    <version>5.0.8</version> <!-- Use the latest version available -->
</dependency>
<dependency>
    <groupId>com.aventstack</groupId>
    <artifactId>extentreports-spark</artifactId>
    <version>2.4.2</version> <!-- Use the latest version available -->
</dependency>
Make sure to use the latest versions of the dependencies.

Configure Extent Reports with Extent Spark Reporter:
Configure Extent Reports and initialize the ExtentSparkReporter:

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            extent = createInstance("report.html");
        }
        return extent;
    }

    private static ExtentReports createInstance(String fileName) {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(fileName);
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        return extent;
    }
}
Create Tests Using Extent Reports:
In your test classes, create tests using Extent Reports:

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExampleTest {
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeMethod
    public void setup() {
        extent = ExtentManager.getInstance();
        test = extent.createTest("MyTest", "Test Description");
    }

    @Test
    public void test1() {
        test.log(Status.INFO, "Starting test1");
        // Your test logic
        Assert.assertTrue(true);
        test.log(Status.PASS, "Test1 Passed");
    }

    @AfterMethod
    public void tearDown() {
        extent.flush();
    }
}
Make sure to import the necessary classes from Extent Reports.

View Reports:
After running your tests, open the HTML report generated by Extent Reports. You will see the Spark-style dashboard, which provides a visual representation of your test results.

The Spark-style dashboard includes features like a test status distribution pie chart, historical test results, and more.

Using Extent Reports with the Extent Spark Reporter enhances the reporting capabilities and provides an interactive and visually appealing dashboard for your test executions. Adjust the code based on your specific project structure and requirements.

*
**
**
*
*
*
*
*
*
*
 * 
*/