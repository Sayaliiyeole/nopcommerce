package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "C:\\Users\\isaya\\eclipse-workspace\\FrameWork\\Features\\Login.feature",
		"C:\\Users\\isaya\\eclipse-workspace\\FrameWork\\Features\\Customer.feature" }, 
         glue = {"stepDefinitions" }, 
         plugin = { "pretty", "html:target/cucumber/report.html" }, 
         dryRun = false)

public class TestRun {

}