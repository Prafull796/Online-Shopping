/*package com.amazon.qa.ExtentReport;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.amazon.qa.Utils.ReadExcelData;
import com.amazon.qa.Utils.TakeScreenShot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager 
{
	public static ExtentReports reports;
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentTest test;
	public static Capabilities cap;
	public Properties prop;
	public static Logger log;
	public WebDriver driver;
	public static String excelPath = "D:\\Selenium\\Selenium Projects\\Workspace\\OnlineShopping\\src\\main\\java\\com\\amazon\\qa\\testData\\Amz_SignUp_TestData.xlsx";
	
	@BeforeSuite
	public static ExtentReports createReports(String docTitle, String reportName)
	{
	  if(reports == null)
	  {
		  //htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/Amz.html");
		  htmlreporter = new ExtentHtmlReporter("D:\\Selenium\\Selenium Projects\\Workspace\\OnlineShopping\\test-output\\ExtentReport\\Amz.html");
		  reports = new ExtentReports();
		  reports.attachReporter(htmlreporter);
		  reports.setSystemInfo("Host Name", "Software Testing");
		  reports.setSystemInfo("Environment", "Production");
		  reports.setSystemInfo("UserName", "PR");
		  test = reports.createTest(reportName);
		  
		       htmlreporter.config().setDocumentTitle(docTitle);
		       htmlreporter.config().setReportName(reportName);		       
		       htmlreporter.config().setTheme(Theme.DARK);
		       
	  }
	
	  return reports;
	}
	
	
	public void setReportResult(ITestResult result, String testDesc, Logger log) throws IOException, InterruptedException
	{
	  	if(result.getStatus() == ITestResult.FAILURE)
	  	{
	  		
	  		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "- Test Case Failed..", ExtentColor.RED));
	  		test.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " -Test Case Failed.. ", ExtentColor.RED));
	  		ReadExcelData.writeDataIntoExcel(excelPath, 3, testDesc, "FAIL");
	  		log.info("=================TEST CASE IS FAILED===========");
	  		TakeScreenShot.captureScreenShtot();
	  		Thread.sleep(1000);
	  	}
	  	else if(result.getStatus() == ITestResult.SUCCESS)
	  	{
	  		ReadExcelData.writeDataIntoExcel(excelPath, 3, testDesc, "PASS");
	  		test.log(Status.PASS, MarkupHelper.createLabel(" PASSED ", ExtentColor.GREEN));
	  		log.info("=================TEST CASE IS PASSED===========");
	  		Thread.sleep(1000);
	  	}
	  	else
	  	{
	  		ReadExcelData.writeDataIntoExcel(excelPath, 3, testDesc, "SKIP");
	  		test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "- Test Case Skippted..", ExtentColor.BROWN));
	  		log.info("=================TEST CASE IS SKIPPED===========");
	  		Thread.sleep(1000);
	  	}
	}
	
	@AfterSuite
	public void extentReportCloser()
	{
		cap = ((RemoteWebDriver)driver).getCapabilities();
		reports.setSystemInfo("Browser Name", cap.getBrowserName());
		reports.setSystemInfo("Browser Version", cap.getVersion());
		reports.setSystemInfo("Web URL", prop.getProperty("URL"));
		reports.flush();
		
	}
		
}*/
