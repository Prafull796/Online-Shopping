package com.amazon.qa.Utils;

import java.io.IOException;

import com.amazon.qa.TestBase.TestBase;

public class TestUtils extends TestBase
  {
   
	public static long PAGE_LOAD_TIMEOUT = 20;
    public static long IMPLICITE_WAIT = 10;
    
        
	public TestUtils() throws IOException 
	{
	  super();
		
	}
	  
	  
	public void switchToFrame()
	{
		driver.switchTo().frame("frame");
	}
      
  }
