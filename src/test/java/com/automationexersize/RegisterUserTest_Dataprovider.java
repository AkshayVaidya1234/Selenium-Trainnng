package com.automationexersize;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.utlity.DataCollection;
import com.utlity.commonmethods;

import pages.Homepage;
import pages.SighinupPage;

public class RegisterUserTest_Dataprovider extends  Basetest{

	@Test(dataProvider = "data_collection")

	public void signuppage(Hashtable<String, String>ht) throws IOException  {
		// get data from excel sheet


	//commonmethods.verfiypagetitle("Automation Exercise - Signup / Login");
		commonmethods.verfiypagetitle(ht.get("Page_Title"));

		Homepage hp = new Homepage();
		
		hp.verfiytitle(ht);
		hp.navigtetosighinupge();
		
		SighinupPage sp= new SighinupPage();
		sp.newuser(ht);

	//	new Homepage().verfiytitle(ht).navigtetosighinupge().newuser(ht);
		
		
		commonmethods.clickonelement("Signupbtn", "Signup Loginbtn");

		commonmethods.verfiytext("Visibletext", ht.get("Page_Text"));

		commonmethods.enterinput("inputname", ht.get("First_Name"), "user entred msg");

		commonmethods.enterinput("emailaddress", ht.get("Email_adress"), "user entred msg");
        commonmethods.entersighnupbtn("sighnupbtn");
		
		
		
		commonmethods.verfiynewuser("verfiynewusertext", ht.get("Acc_Info"));

		commonmethods.clickonelement("gender_femle", "male radio btn");

		commonmethods.enterinput("pssword", "Bhmpyaa@77", "user enter the password");

		commonmethods.selectByVisibleText("dropdown_dys",ht.get("DOB_Days")) ;

		commonmethods.selectByIndex("dropdown_months", ht.get("DOB_Months") );

		commonmethods.value("dropdown_years",ht.get("DOB_Years") );

	/*	commonmethods.selectcheckbox("Select_checkbox", "Sign up for our newsletter!");
		
		commonmethods.selectcheckbox("Select_checkbox2", "Receive special offers from our partners!");

		commonmethods.enterinput("First_name", "Akshay", "User enter First name");

		commonmethods.enterinput("Last_name", "Vaidya", "User enter last name");

		commonmethods.enterinput("Company_name", "Infosys");

		commonmethods.enterinput("Address", "Pune");

	*/	commonmethods.enterinput("Address2", "hinjwadhi phase1");

	//	commonmethods.selectByVisibleText("Country_dropdown", "United States");

	//	commonmethods.enterinput("State_name", "Maharashtra");

	//	commonmethods.enterinput("Cityname", "Rahuri");

	//	commonmethods.enterno("zipcode", "413705");

	//	commonmethods.enterno("mobileno", "9850363719");

	//	commonmethods.clickonelement("createaccount", "Create Account");

	//	commonmethods.verfiytext("accountverfiy", "ACCOUNT CREATED!");

	//	commonmethods.clickonelement("continue_btn", "Continue");


}
	
	@DataProvider
	public Object[][]data_collection(){
		DataCollection dc= new DataCollection(excel,"Test_Data","RegisterUserTest_DataProvider");
		return dc.dataArray();
	}

}
