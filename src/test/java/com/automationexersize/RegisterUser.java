package com.automationexersize;

import java.io.IOException;

import org.testng.annotations.Test;

import com.base.Basetest;
import com.utlity.commonmethods;

public class RegisterUser extends  Basetest{
	
	@Test
	
	public void signuppage() throws IOException {
		commonmethods.verfiypagetitle("Automation Exercise - Signup / Login");
		
		commonmethods.clickonelement("Signupbtn", "Signup Loginbtn");
		
		commonmethods.verfiytext("Visibletext", "New User Signup!");
		
		commonmethods.enterinput("inputname", "akshay374", "user entred msg");

		commonmethods.enterinput("emailaddress", "akshayvaidya99@gmail.com");
	
		commonmethods.entersighnupbtn("sighnupbtn");
		
		commonmethods.verfiynewuser("verfiynewusertext", "ENTER ACCOUNT INFORMATION");
		
		commonmethods.clickonelement("gender_male", "male radio btn");
		
		commonmethods.enterinput("pssword", "Bhmpyaa@77", "user enter the password");
		
		commonmethods.selectByVisibleText("dropdown_dys", "15");
		
	//	commonmethods.selectByIndex("dropdown_months", 6);
		
		commonmethods.value("dropdown_years", "2015");
		
		commonmethods.selectcheckbox("Select_checkbox", "Sign up for our newsletter!");
		
		commonmethods.selectcheckbox("Select_checkbox2", "Receive special offers from our partners!");
		
		commonmethods.enterinput("First_name", "Akshay", "User enter First name");
		
		commonmethods.enterinput("Last_name", "Vaidya", "User enter last name");
		
		commonmethods.enterinput("Company_name", "Infosys");
		 
		commonmethods.enterinput("Address", "Pune");
		
		commonmethods.enterinput("Address2", "hinjwadhi phase1");
		
		commonmethods.selectByVisibleText("Country_dropdown", "United States");
		
		commonmethods.enterinput("State_name", "Maharashtra");
		
		commonmethods.enterinput("Cityname", "Rahuri");
		
		commonmethods.enterno("zipcode", "413705");
		
		commonmethods.enterno("mobileno", "9850363719");
		
		commonmethods.clickonelement("createaccount", "Create Account");
		
		commonmethods.verfiytext("accountverfiy", "ACCOUNT CREATED!");
		
		commonmethods.clickonelement("continue_btn", "Continue");
		
		
		
		
		
		
	}

}
