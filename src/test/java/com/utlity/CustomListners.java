package com.utlity;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
//import com.aventstack.extentreports.observer.entity.MediaEntity.MediaEntityBuilder;
import com.base.Basetest;
import com.google.common.io.Files;

public class CustomListners extends Basetest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.pass(result.getName() +"is passed" );
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable().getMessage());
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		
		File dest = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots\\Akshay_"+timeStamp+ ".png");
// File dest= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots\\Akshay_"+timeStamp+ ".png");
				
		
		
		
		
		TakesScreenshot shot=(TakesScreenshot) driver;
		
		File source= shot.getScreenshotAs(OutputType.FILE);
		
		try {
			Files.copy(source,dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		test.fail(result.getMethod().getMethodName() +" is failed", MediaEntityBuilder.createScreenCaptureFromPath(dest.toString()).build());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	
	

}
