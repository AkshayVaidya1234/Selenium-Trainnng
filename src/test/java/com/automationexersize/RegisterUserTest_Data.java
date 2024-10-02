package com.automationexersize;

import java.io.IOException;

import org.testng.annotations.Test;

import com.base.Basetest;
import com.utlity.commonmethods;

public class RegisterUserTest_Data extends  Basetest{

	@Test

	public void signuppage() throws IOException {
		// get data from excel sheet


		//commonmethods.verfiypagetitle("Automation Exercise - Signup / Login");
		commonmethods.verfiypagetitle(excel.getCellData("Test_Data", "Page_Title", 2));


		commonmethods.clickonelement("Signupbtn", "Signup Loginbtn");

		commonmethods.verfiytext("Visibletext", excel.getCellData("Test_Data", "Page_Text", 2));

		commonmethods.enterinput("inputname", excel.getCellData("Test_Data", "First_Name", 2), "user entred msg");

		commonmethods.enterinput("emailaddress", excel.getCellData("Test_Data", "Email_adress", 2), "user entred msg");

		commonmethods.entersighnupbtn("sighnupbtn");

		commonmethods.verfiynewuser("verfiynewusertext", excel.getCellData("Test_Data","Acc_Info", 2));

		commonmethods.clickonelement("gender_femle", "male radio btn");

		commonmethods.enterinput("pssword", "Bhmpyaa@77", "user enter the password");

		commonmethods.selectByVisibleText("dropdown_dys",excel.getCellData("Test_Data", "DOB_Days", 2) );

		commonmethods.selectByIndex("dropdown_months", excel.getCellData("Test_Data", "DOB_Months", 2) );

		commonmethods.value("dropdown_years", excel.getCellData("Test_Data", "DOB_Years", 2) );

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
