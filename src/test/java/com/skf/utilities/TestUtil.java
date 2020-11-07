package com.skf.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.skf.base.Page;

public class TestUtil extends Page 
{

	public static String screenshotPath;
	public static String screenshotName;
	
	public static void captureScreenshot() throws IOException
	{
		Date date=new Date();
		screenshotName=date.toString().replace(":", "_").replace(" ", "_");
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\"+screenshotName));
		
	}
}
