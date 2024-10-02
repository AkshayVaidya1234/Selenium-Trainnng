package com.orange.hrm;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.utlity.screenshot;

public class Orangehrm extends Basetest{
	public Properties or;
	
	@Test
	
	public void performaction() throws IOException {
		
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Or.properties");
		or= new Properties();
		or.load(fis);
		
		driver.findElement(By.id(or.getProperty("idusername"))).sendKeys("standard_user");
		driver.findElement(By.id(or.getProperty("idpassword"))).sendKeys("secret_sauce");
		driver.findElement(By.id(or.getProperty("idclickbtn"))).click();
		
		String exceptestitle="Swag Labs";
		String actualtitle= driver.getTitle();
		
		Assert.assertEquals(exceptestitle,actualtitle );
		
		System.out.println("Passed Login Action");
		
		screenshot.takesceernshort(driver);
		
		
	}
	
	
	
	

}
