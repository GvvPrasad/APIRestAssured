package com.api.listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCases implements IRetryAnalyzer {

	private int retryCnt = 0;
	private int maxRetryCnt = 2;

	
	// This method will be called everytime a test fails. It will return TRUE if a
	// test fails and need to be retried, else it returns FALSE
	public boolean retry(ITestResult result) {
		if (retryCnt < maxRetryCnt) {
			retryCnt++;
			return true;
		}
		return false;
	}

}