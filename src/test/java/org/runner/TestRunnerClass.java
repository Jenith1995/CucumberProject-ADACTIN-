package org.runner;

import org.baseclass.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = {"org.stepdefinition"},monochrome=true,
                  plugin= {"json:src\\test\\resources\\Reports\\report.json"},snippets=SnippetType.CAMELCASE,
                  dryRun=false, strict=false,tags = {"@ChildrenRoom"}) 
public class TestRunnerClass {
	@AfterClass
	public static void afterClass() {
		
		JVMReport.generateJVMReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\report.json");
	
	}

}
