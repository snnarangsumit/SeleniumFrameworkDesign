package Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//cucumber->  TestNG, junit

@CucumberOptions(features="src/test/java/Cucumber",glue="Cucumber",
monochrome=true, tags = "@Regression", plugin= {"html:target/cucumber.html"})

public class TestNGTestRunner extends AbstractTestNGCucumberTests
{

}

// monochrome: which will give results in readable format 
// as testng doesnot come inbuild in cucumber so extend testng wrapper class


/*
 * 
 * In Cucumber, a test runner class is responsible for executing the Cucumber feature files and coordinating the steps defined in the corresponding step definition classes. The test runner typically contains configuration settings, such as the location of feature files and step definitions, and it orchestrates the execution of the scenarios.

Here's a basic example of a Cucumber test runner class:

java
Copy code
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Location of your feature files
        glue = "stepdefinitions", // Package where your step definitions are located
        plugin = {"pretty", "html:target/cucumber-reports"} // Report configuration
)
public class TestRunner {
}

Let's break down the key components:

@RunWith(Cucumber.class): This annotation tells JUnit to use Cucumber as the test runner.

@CucumberOptions: This annotation provides configuration options for Cucumber. Some important attributes include:

features: Specifies the location of your feature files.

glue: Specifies the package where your step definitions are located.

plugin: Configures the output format for the Cucumber report. In this example, it generates a pretty console output and an HTML report in the "target/cucumber-reports" directory.

To use this test runner, you need to create feature files (.feature files) with Gherkin syntax and corresponding step definition classes in the specified package. The step definitions contain the actual Java code that maps to the steps in the feature files.

Here's a simple example of a feature file (src/test/resources/features/example.feature):

gherkin

Feature: Example Feature

  Scenario: Run a simple scenario
    Given I have a cucumber step
    When I run the step
    Then I should see the result
And a corresponding step definition class (src/test/java/stepdefinitions/ExampleStepDefinitions.java):

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class ExampleStepDefinitions {

    @Given("I have a cucumber step")
    public void givenStep() {
        // Implementation for the Given step
    }

    @When("I run the step")
    public void whenStep() {
        // Implementation for the When step
    }

    @Then("I should see the result")
    public void thenStep() {
        // Implementation for the Then step
    }
}
To run your Cucumber tests, execute the TestRunner class as a JUnit test. The test runner will discover the feature files, execute the scenarios, and generate reports based on the specified configuration.
 * 
 * 
 * 
 * 

*/




 