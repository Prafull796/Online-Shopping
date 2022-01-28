package com.amazon.qa.Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListeners implements ITestListener 
{
   
	public void onTestFailure(ITestResult result) {					
        System.out.println("*****Test case is Failed*****: "+result.getStatus());				
        System.out.println("*****Test case is Failed*****: "+result.getName());		
    }		

   		
    public void onTestSkipped(ITestResult result) {					
        System.out.println("*****Test case is Skipped*****: "+result.getStatus());				
        		
    }		

   	
    public void onTestStart(ITestResult result) {					
    	System.out.println("*****Test case is Started*****: "+result.getName());			
        		
    }		

  		
    public void onTestSuccess(ITestResult result) {					
    	System.out.println("*****Test case is Successeed*****: "+result.getStatus());
	
	
    }
	
    
}
