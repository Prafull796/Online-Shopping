package com.amazon.qa.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.TestBase.TestBase;
import com.amazon.qa.TestPages.HomePage;
import com.amazon.qa.TestPages.LoginPage;

public class HomePageTest extends TestBase
{

	//Global variables
	LoginPage loginPage;
	HomePage homePage;
	
	public HomePageTest() throws IOException 
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
	  initialization();
	  loginPage = new LoginPage();
	  homePage = new HomePage();
	}
	
	@Test(priority= 0)	
	public void getLoginDetails() throws InterruptedException, IOException
	{
		loginPage.logIn(prop.getProperty("username"), prop.getProperty("password"));
  	}
			
	
    @Test(priority= 1)
  	public void amzLogoTest()
  	{
  		boolean flag =  homePage.validateLogo();
  		Assert.assertTrue(flag);
  	}
    
    @AfterMethod
  	public void tearDown()
  	{
  		driver.quit();
  	}
    
  }
