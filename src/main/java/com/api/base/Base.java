package com.api.base;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.api.objectrespo.AppObjectRespo;
import com.api.utilities.ReadProperties;
import com.api.utilities.ReportGeneration;

public class Base extends AppObjectRespo{

	@BeforeSuite(alwaysRun = true)
	public static void setUp() throws IOException {
		
		// Read properties file
		ReadProperties rp = new ReadProperties();
		rp.readProperties();

		// Generate reports
		ReportGeneration.reportGeneration();

	}

	@AfterSuite
	public static void tearDown() {
		extent.flush();
	}
}
