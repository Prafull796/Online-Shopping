package com.amazon.qa.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.TestBase.TestBase;
import com.amazon.qa.TestPages.LoginPage;

public class LoginPageTest extends TestBase
{

	
	//Global variables
	LoginPage loginPage;
	
	public LoginPageTest() throws IOException 
	{

		super();	
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
	  initialization();
	  loginPage = new LoginPage();	 
	}
	
	@Test(priority= 0)	
	public void getLoginDetails() throws InterruptedException, IOException
	{
		loginPage.logIn(prop.getProperty("username"), prop.getProperty("password"));
  	}
	
	@Test(priority= 1)	
	public void getLoginPageTitle() 
	{
		loginPage.validateLoginPageTitle();
  	}
	
	@Test(priority= 2)
  	public void amzLogoTest()
  	{
    	loginPage.validateLogo();  	
    
  	}
	
	@AfterMethod
  	public void tearDown()
  	{
  		driver.quit();
  	}
	
	
}

