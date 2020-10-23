package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = {"org.stepdefinition"},monochrome=true,
                  plugin= {"pretty"},snippets=SnippetType.CAMELCASE,dryRun=false, strict=false) 
public class TestRunnerClass {
	
	

}
