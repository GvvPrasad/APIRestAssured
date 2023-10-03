package com.api.utilities;

import org.testng.annotations.Test;

import com.api.base.Base;
import com.api.objectrespo.AppObjectRespo;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportGeneration extends Base {

	@Test
	public static void reportGeneration() {
		htmlReporter = new ExtentHtmlReporter(AppObjectRespo.htmlReportPath);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

}
