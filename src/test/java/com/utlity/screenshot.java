package com.utlity;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.base.Basetest;
import com.google.common.io.Files;

public class screenshot  extends Basetest {
	
	public  static void takesceernshort(WebDriver driver ) throws IOException {
		TakesScreenshot shot=(TakesScreenshot) driver;
				
				File source= shot.getScreenshotAs(OutputType.FILE);
				File dest= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots\\Akshay.png");
				Files.copy(source, dest);
			}
       

}
