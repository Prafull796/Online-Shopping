package com.amazon.qa.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames 
{
	
	@Test
	public void frames()
	{
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("file:///C:/Users/Prafull/Desktop/myframes.html");
		driver.manage().window().maximize();
		int totaliFrames = driver.findElements(By.tagName("iFrame")).size();
		System.out.println("Total frames are : "+ totaliFrames);
		
		driver.switchTo().frame("w3c");
		driver.findElement(By.className("mobile-ui-header-menu-toggle"));
		
		JavascriptExecutor exe = ((JavascriptExecutor)driver);
		exe.executeScript("scroll(20,400)");
		driver.switchTo().defaultContent();
		//driver.quit();
	}

}
