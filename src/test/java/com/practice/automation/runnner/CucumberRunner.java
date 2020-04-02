package com.practice.automation.runnner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", glue="src/test/java", tags="@Test", strict = true)
public class CucumberRunner {
	public CucumberRunner() {
		// TODO Auto-generated constructor stub
	}

}
