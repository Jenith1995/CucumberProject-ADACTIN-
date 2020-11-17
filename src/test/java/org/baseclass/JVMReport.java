package org.baseclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJVMReport(String jsonFile) {
		
		//loc of the report
		
		File reportLoc = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports");
		
		Configuration config = new Configuration(reportLoc, "Adaction Project");
		
		config.addClassifications("Project", "Adactin Hotel");
		config.addClassifications("Client", "Australia");
		config.addClassifications("Tool", "Cucumber");
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("OS", "Windows 10");
		config.addClassifications("Sprint", "47");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, config);
		
		reportBuilder.generateReports();
		
	}

}
