package org.stepdefinition;

import org.baseclass.BaseClass;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void beforeScenario() {
		System.out.println("Started the scenario......");
	}

	@After
	public void afterScenarion(Scenario sc) {

		Result run = JUnitCore.runClasses(LoginPageSteps.class);
		System.out.println(run.getRunTime());
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] png = ts.getScreenshotAs(OutputType.BYTES);
		sc.embed(png, "screenshot for a page");
		driver.quit();
		System.out.println("Ended");

	}

}
