package com.amazon.qa.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.TestBase.TestBase;
import com.amazon.qa.TestPages.HomePage;
import com.amazon.qa.TestPages.LoginPage;

public class LoginPageTest extends TestBase
{
	//Global variables
	LoginPage loginPage;
	HomePage homePage;

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
	 
  	@Test(priority=1)
  	public void loginPageTitleTest()
  	{
  		String pageTitle = loginPage.validateLoginPageTitle();
  		Assert.assertEquals(pageTitle, "Amazon Sign In");
  	}
  	
  	@Test(priority=2)
  	public void amzLogoTest()
  	{
  		boolean flag =  loginPage.validateLogo();
  		Assert.assertTrue(flag);
  	}
  	
  	@Test(priority=3)
  	public void logInTest() throws InterruptedException, IOException
  	{
  		homePage = loginPage.logIn(prop.getProperty("username"), prop.getProperty("password"));
  		
  	}
  	
  	@AfterMethod
  	public void tearDown()
  	{
  		driver.quit();
  	}

   	
}
