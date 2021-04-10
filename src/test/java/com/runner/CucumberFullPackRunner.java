package com.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/features", glue = { "com.stepDefinitions" },
		//tags= {"@Smoke"}, //To run particular scenario
		plugin = { "html:target/cucumber-html-report", "json:target/cucumber.json" })
public class CucumberFullPackRunner {

}
