package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utlity.Excel;

public class Basetest {
public  static WebDriver driver;
public Properties pr;
public static Properties or;
public static ExtentReports reports;
public static ExtentSparkReporter sprk;
public static ExtentTest test;
public static Excel excel;



@BeforeSuite

public void loadfile() throws IOException {
	
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		FileInputStream fis1= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Or.properties");
		
		
		pr= new Properties();
		pr.load(fis);
		
		or= new Properties();
		or.load(fis1);
		
		String timesstmp= new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		reports= new ExtentReports();
		sprk= new ExtentSparkReporter(System.getProperty("user.dir")+"\\src\\test\\resources\\reports//report_"+timesstmp+".html");
		
		reports.attachReporter(sprk);
		
		 excel= new Excel(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\Test.xlsx");
}



	@BeforeClass
	
	public void setup() {	
		test=reports.createTest("RegisterUser");
		
		driver= new EdgeDriver();
		test.info("edge driver lunched");
		driver.manage().window().maximize();
		driver.get(pr.getProperty("url1"));
		test.info("lauch url");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@AfterClass
	public void teardown() {
	driver.close();
	}
	
	@AfterSuite
	public void reportgeneration() {
		reports.flush();
	}
	
	
	
}
