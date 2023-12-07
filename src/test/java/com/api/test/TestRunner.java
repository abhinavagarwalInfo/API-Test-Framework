package com.api.test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.testng.annotations.DataProvider;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty:target/cucumber/cucumber.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"html:target/cucumber/report.html",
				"json:target/cucumber/cucumber.json",
				"com.api.utils.MyTestListener"
		}
		,features= {"src/test/resources/features"}
		,glue = {"com.api.stepdefinition"}
		//,dryRun = true
		,monochrome = true
		,snippets = SnippetType.CAMELCASE
		,tags = "@bookerAPI"
		//,publish = true
		)
class TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}