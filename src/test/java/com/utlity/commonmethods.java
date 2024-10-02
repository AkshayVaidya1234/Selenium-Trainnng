package com.utlity;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.base.Basetest;
import com.google.common.io.Files;

public class commonmethods extends Basetest {

	public  static void takesceernshort(WebDriver driver ) throws IOException {
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		TakesScreenshot shot=(TakesScreenshot) driver;

		File source= shot.getScreenshotAs(OutputType.FILE);
		
		File dest= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots\\Akshay_"+timeStamp+ ".png");
		
		
		
		Files.copy(source, dest);
		
		test.pass( MediaEntityBuilder.createScreenCaptureFromPath(dest.toString()).build());
	}

	public static void clickonelement(String xpath,String elementname) {
		driver.findElement(By.xpath(or.getProperty(xpath))).click();
		System.out.println("User clicked on"+elementname);
		test.info("User clicked on"+elementname);
	}
	
	public static void clickonelement(WebElement e,String elementname) {
		e.click();
		System.out.println("User clicked on"+elementname);
		test.info("User clicked on"+elementname);
	}
	
	

    public static void verfiypagetitle(String exceptedtitle) {
    	String actualtitle =driver.getTitle();
    	Assert.assertEquals(actualtitle , exceptedtitle);
    	System.out.println("Page title verfied" +actualtitle);
    	test.pass("Page title verfied" +actualtitle);
    }
    
    public static void verfiytext(String xpath,String exceptedtext) throws IOException {
    	String actualtext=driver.findElement(By.xpath(or.getProperty(xpath))).getText();
    	Assert.assertEquals(actualtext, exceptedtext);
    	System.out.println("Page text is verfied"+exceptedtext);
    	test.pass("Page text is verfied"+exceptedtext);
    	takesceernshort(driver);
    }
    	 public static void verfiytext(WebElement e,String exceptedtext) throws IOException {
    	    	String actualtext= e.getText();
    	    	Assert.assertEquals(actualtext, exceptedtext);
    	    	System.out.println("Page text is verfied"+exceptedtext);
    	    	test.pass("Page text is verfied"+exceptedtext);
    	    	takesceernshort(driver);
    	
    }
    public static void enterinput(String xpath,String data,String Message) {
    	driver.findElement(By.xpath(or.getProperty(xpath))).sendKeys(data);
    	System.out.println("User enter message"+Message);
    	test.info("User enter message"+Message);
    }
    
    public static void enterinput(WebElement e,String data,String Message) {
    	e.sendKeys(data);
    	System.out.println("User enter message"+Message);
    	test.info("User enter message"+Message);
    }
    
    public static void enterinput(String xpath,String data) {
    	driver.findElement(By.xpath(or.getProperty(xpath))).sendKeys(data);
       System.out.println("user entred data"+ data);
       test.info("User enter message"+ data);

    }
    public static void enterinput(WebElement ele,String data) {
    	ele.sendKeys(data);
       System.out.println("user entred data"+ data);
       test.info("User enter message"+ data);
    }
    
    public static void entersighnupbtn(String xpath) {
    	driver.findElement(By.xpath(or.getProperty(xpath))).click();
    	System.out.println("User click on sighnup btn");
    	test.info("User click on sighnup btn");
    }
    
    
    public static void entersighnupbtn(WebElement e) {
    	e.click();
    	System.out.println("User click on sighnup btn");
    	test.info("User click on sighnup btn");
    }
    
    
    
    public static void verfiynewuser(String xpath,String exceptedtext) throws IOException {
    	String actualtext=driver.findElement(By.xpath(or.getProperty(xpath))).getText();
    	Assert.assertEquals( actualtext, exceptedtext);
    	System.out.println("New user verfied"+ exceptedtext);
    	test.pass("New user verfied"+ exceptedtext);
    	takesceernshort(driver);
    	
    }
    
    public static void verfiynewuser(WebElement e,String exceptedtext) throws IOException {
    	String actualtext=e.getText();
    	Assert.assertEquals( actualtext, exceptedtext);
    	System.out.println("New user verfied"+ exceptedtext);
    	test.pass("New user verfied"+ exceptedtext);
    	takesceernshort(driver);
    
    }
    
    public static void selectByVisibleText(String xpath, String visible_Text) {
		Select sel = new Select(driver.findElement(By.xpath(or.getProperty(xpath))));
		System.out.println(visible_Text);
		sel.selectByVisibleText(visible_Text);
		System.out.println(visible_Text +" value is selected from the dropdown box");
		test.pass(visible_Text +" value is selected from the dropdown box");
    }
    
    public static void selectByVisibleText(WebElement e, String visible_Text) {
		Select sel = new Select(e);
		System.out.println(visible_Text);
		sel.selectByVisibleText(visible_Text);
		System.out.println(visible_Text +" value is selected from the dropdown box");
		test.pass(visible_Text +" value is selected from the dropdown box");
    }
    
    
    
    public static void selectByIndex(String xpath, String visible_Text) {
		Select sel = new Select(driver.findElement(By.xpath(or.getProperty(xpath))));
		sel.selectByVisibleText(visible_Text);
		System.out.println(visible_Text +" value is selected from the dropdown box");	
		test.pass(visible_Text +" value is selected from the dropdown box");
    }
    
    public static void selectByIndex(WebElement e, String visible_Text) {
		Select sel = new Select(e);
		sel.selectByVisibleText(visible_Text);
		System.out.println(visible_Text +" value is selected from the dropdown box");	
		test.pass(visible_Text +" value is selected from the dropdown box");
    }
    
    
    
    public static void value(String xpath,String value) {
    	Select se= new Select(driver.findElement(By.xpath(or.getProperty(xpath))));
    	se.selectByValue(value);
    	System.out.println(value + "User select value");
    	test.pass(value + "User select value");
}
    
    
    public static void value(WebElement e,String value) {
    	Select se= new Select(e);
    	se.selectByValue(value);
    	System.out.println(value + "User select value");
    	test.pass(value + "User select value");
    }
    public static void selectcheckbox(String xpath,String checkboxname) {
    	driver.findElement(By.xpath(or.getProperty(xpath))).click();
    	System.out.println("User select chrckbox" + checkboxname);
    	test.info("User select chrckbox" + checkboxname);
    }
    
    public static void enterno(String xpath,String number) {
    	driver.findElement(By.xpath(or.getProperty(xpath))).sendKeys(number);
    	System.out.println("User enter the number"+number);
    	test.info("User enter the number"+number);
    }
    
}    
    
