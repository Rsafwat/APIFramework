package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * The TestRunner class is responsible for executing Cucumber tests. It
 * specifies the location of feature files, the location of step definitions,
 * and the output format for reports.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", plugin = "json:target/jsonReports/cucumber-report.json", glue = {
    "StepDefinitions" })
public class TestRunner {

}
