package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {

	public static ExtentReports extent;
	
	public static ExtentReports getReports() {
		
		String report="C:\\Users\\Dell\\Desktop\\Visionfolder\\Framework_Batch16\\Reports\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(report);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("Batch 16 Test Report -Automation");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project", "Automation Project _HealthCare");
		extent.setSystemInfo("Tool", "Selenium WebDriver");
		extent.setSystemInfo("Browser Name", "Chrome");
		extent.setSystemInfo("O.S. Name", "Window 10");
		extent.setSystemInfo("QA Name ", "ABC ");
		return extent;
		

	}
	
	
}
