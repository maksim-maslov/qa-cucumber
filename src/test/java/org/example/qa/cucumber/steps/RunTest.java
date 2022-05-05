package org.example.qa.cucumber.steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/org/example/qa/cucumber/features"}, glue = {"org/example/qa/cucumber/steps"}, plugin = {"pretty"})
public class RunTest {

}
