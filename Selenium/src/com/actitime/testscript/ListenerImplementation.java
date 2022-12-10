package com.actitime.testscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

import com.actitime.generic.BaseClass;

public class ListenerImplementation extends BaseClass implements ITestListener{

	public static void main(String[] args) {	
	@Listeners(com.actitime.testscript.class);
	}

	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		String res=result.getName();
		TakesScreenshot t=(TakesScreenshot)driver;
		File soure=t.getScreenshotAs(OutputType.FILE);
		File destination=new File("./Screenshot/"+res+".png");
		
		try {
			FileUtils.copyFile(soure, destination);
		}
		catch(IOException o)
		{
			
		}
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
	}

}
