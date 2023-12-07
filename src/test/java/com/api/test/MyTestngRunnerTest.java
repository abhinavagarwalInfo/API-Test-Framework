package com.api.test;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//@RunWith(Cucumber.class)
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
        //,snippets = CucumberOptions.SnippetType.CAMELCASE
        ,tags = "@bookerAPI"
        //,publish = true
)

public class MyTestngRunnerTest extends AbstractTestNGCucumberTests {

//    @Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }
}