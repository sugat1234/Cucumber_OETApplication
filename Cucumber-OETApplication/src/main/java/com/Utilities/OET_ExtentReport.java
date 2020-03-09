package com.Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class OET_ExtentReport 
{
	
	public ExtentHtmlReporter reportType;
	public ExtentReports report;
	public ExtentTest test;
	
	public OET_ExtentReport(String reportName)
	{
		reportType=new ExtentHtmlReporter("C:\\Users\\sugat\\eclipse-workspace\\Cucumber-OETApplication\\target\\"+reportName+".html");
		report=new ExtentReports();
		report.attachReporter(reportType);
		
		reportType.config().setDocumentTitle("OET Registration");
		
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("Browser", "Chrome");
		
	}
	
	public void createTest(String testName)
	{
		test=report.createTest(testName);
	}
	
	public void infoLog(String infoStr)
	{
		test.log(Status.INFO, infoStr);
	}
	
	public void passLog(String passStr)
	{
		test.log(Status.PASS, passStr);
	}
	
	public void failLog(String failStr)
	{
		test.log(Status.FAIL, failStr);
	}
	
	public void errorLog(String errorStr)
	{
		test.log(Status.ERROR, errorStr);
	}
	
	public void debugLog(String debugStr)
	{
		test.log(Status.DEBUG, debugStr);		
	}
	
	public void fatalLog(String fatalStr)
	{
		test.log(Status.FATAL, fatalStr);		
	}

	public void skipLog(String skipStr)
	{
		test.log(Status.SKIP, skipStr);
	}
	
	public void publishReport()
	{
		report.flush();
	}


}
