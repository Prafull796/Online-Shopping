package com.amazon.qa.TestPages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.TestBase.TestBase;

public class LoginPage extends TestBase
{

	//Object Repository or Page Factory
	@FindBy(name = "email")
	WebElement userNameTextBox;
	
	@FindBy(id = "continue")
	WebElement continueButton;
	
	@FindBy(name = "password")
	WebElement passwordTextBox;
	
	@FindBy(id = "signInSubmit")
	WebElement signInButton;
	
	@FindBy(xpath = "//*[@id=\"a-page\"]/div[1]/div[1]/div/a/i[1]")
	WebElement amzLogo;
	
	//Constructor for Initialize PageFactory 
	public LoginPage() throws IOException
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	//Actions
    public String validateLoginPageTitle()
    {
    	return driver.getTitle();
    }
    
    public boolean validateLogo() 
    {
       return amzLogo.isDisplayed();	
    }

    public void logIn(String uName, String psd) throws InterruptedException, IOException
    {
    	userNameTextBox.sendKeys(uName);
    	continueButton.click();
    	Thread.sleep(1000);
    	passwordTextBox.sendKeys(psd);
    	signInButton.click();
    	Thread.sleep(2000);
    	
    	//return new HomePage();
    }

}


