package com.api.utilities;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportGeneration extends com.api.base.AppObjectRespo {

	@Test
	public static void reportGeneration() {
		htmlReporter = new ExtentHtmlReporter(com.api.base.AppObjectRespo.htmlReportPath);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

}
