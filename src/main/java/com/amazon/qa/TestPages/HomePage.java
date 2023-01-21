package com.amazon.qa.TestPages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.TestBase.TestBase;

public class HomePage extends TestBase
{
	
	//Object Repository or Page Factory
	//@FindBy(id = "glow-ingress-line1")
	//WebElement loggedInUserName;
	
	@FindBy(xpath = "//*[@id=\"a-page\"]/div[1]/div[1]/div/a/i[1]")
	WebElement amzLogo;		
				
	@FindBy(id = "nav-cart-count")
	WebElement loggedInUserName;
	
	//Constructor for Initialize PageFactory 
	public HomePage() throws IOException
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	//Actions : 
	public boolean validateLogo() 
    {
		System.out.println("Logo found..");		
       return amzLogo.isDisplayed();	
    }
	
	
	
	
 
}
