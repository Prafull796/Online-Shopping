/*package com.amazon.qa.ExtentReport;

import java.util.Properties;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport 
{
	public static Capabilities cap;
	public WebDriver driver;
	public Properties prop;
	ExtentHtmlReporter htmlReporter;
	ExtentReport extent;
	ExtentTest test;
	
	@BeforeTest
	public void startReport()
	{
	  //initialize the HTML report
	  htmlReporter =  new ExtentHtmlReporter(System.getProperty("user.dir")+"//OnlineShopping/ScreenShots/Amz.html");
	  
	  //initialize the Extent Report and attach the HTML reporter
	  extent = new ExtentReport();
	  extent.attachReporter(extent);
	  
	  //Configure the item to change the Look and Feel
	  htmlReporter.config().setDocumentTitle("Simple Automation Report");
      htmlReporter.config().setReportName("Test Report");      
      htmlReporter.config().setTheme(Theme.STANDARD);
      htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");	  
		
	}
	 
	private void attachReporter(ExtentReport extent2) {
		// TODO Auto-generated method stub
		
	}

	@Test
	    public void test_1() {
	        test = extent.createTest("Test Case 1", "The test case 1 has passed");
	        Assert.assertTrue(true);
	    }
	 
	@Test
	    public void test_2() {
	        test = extent.createTest("Test Case 2", "The test case 2 has failed");
	        Assert.assertTrue(false);
	    }
	 
	    @Test
	    public void test_3() {
	        test = extent.createTest("Test Case 3", "The test case 3 has been skipped");
	        throw new SkipException("The test has been skipped");
	    }
	 
	    @AfterMethod
	    public void getResult(ITestResult result) {
	        if(result.getStatus() == ITestResult.FAILURE) {
	            test.log(Status.FAIL,result.getThrowable());
	        }
	        else if(result.getStatus() == ITestResult.SUCCESS) {
	            test.log(Status.PASS, result.getTestName());
	        }
	        else {
	            test.log(Status.SKIP, result.getTestName());
	        }
	    }

	    @AfterTest
	    public void tearDown() 
	    {
	        //to write or update test information to reporter
	        extent.flush();
	    }
	    
	    @AfterSuite
		public void extentReportCloser()
		{
			cap = ((RemoteWebDriver)driver).getCapabilities();
			extent.setSystemInfo("Browser Name", cap.getBrowserName());
			extent.setSystemInfo("Browser Version", cap.getVersion());
			extent.setSystemInfo("Web URL", prop.getProperty("URL"));
			extent.flush();
			
		}
	
}*/
