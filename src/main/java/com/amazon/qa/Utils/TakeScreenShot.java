package com.amazon.qa.Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.amazon.qa.TestBase.TestBase;

public class TakeScreenShot extends TestBase
{
	public TakeScreenShot() throws IOException {
		super();
	}
	
		
	public static void captureScreenShtot() throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcePath = ts.getScreenshotAs(OutputType.FILE);
		File destPath =  new File(System.getProperty("user.dir") + "/ScreenShots/" + System.currentTimeMillis() + ".png");
		FileUtils.copyFile(sourcePath, destPath);
		System.out.println("Screenshot taken..");
	}
	
}
