package com.amazon.qa.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.amazon.qa.Utils.TestUtils;

public class TestBase 
{

	//Global variables
	public static WebDriver driver;
	public static Properties prop;
	
	
	//Constructor of class
	public TestBase() throws IOException 
	{
	//Read properties from config.properties file
	prop = new Properties();
	FileInputStream fis = null;
	
	try
	{
		fis = new FileInputStream("D:\\Selenium\\Selenium Projects\\Workspace\\OnlineShopping\\src\\main\\java\\com\\amazon\\qa\\Properties\\config.properties");
	}
	catch (FileNotFoundException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	    prop.load(fis);
			
	}

	//
	public static void initialization()
	{
	  	String browserName = prop.getProperty("browser");
	  	if(browserName.equalsIgnoreCase("CHROME"))
	  	{
	  		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	  		driver = new ChromeDriver();
	  		
	  	}
	  	else if(browserName.equalsIgnoreCase("FIREFOX"))
	  	{
	  		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	  		driver = new FirefoxDriver();
	  		
	  	}
	  	if(browserName.equalsIgnoreCase("IE"))
	  	{
	  		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	  		driver = new InternetExplorerDriver();  		
	  	}
	  	
	  	driver.manage().window().maximize();
	  	driver.manage().deleteAllCookies();
	  	driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	  	driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITE_WAIT, TimeUnit.SECONDS);
	  	
	  	driver.get(prop.getProperty("url"));
	  	
	}
	
	
	
	
	
	
	
	
}
