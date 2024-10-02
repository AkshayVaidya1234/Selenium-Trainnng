package pages;

import java.io.IOException;
import java.util.Hashtable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Basetest;
import com.utlity.commonmethods;

public class Enteraccinfopage  extends Basetest{
	
	public Enteraccinfopage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//b[text()='Enter Account Information']")
	private WebElement accinfo;
	
	@FindBy(xpath = "//*[@id='id_gender1']")
	private WebElement gender_male;
	
	@FindBy(xpath = "//*[@id='id_gender2']")
	private WebElement gender_female;
	
	@FindBy(xpath = "//*[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id='days']")
	private WebElement dropdown_dys;
	
	@FindBy(xpath = "//*[@id='months']")
	private WebElement dropdown_months;
	
	@FindBy(xpath ="//*[@id='years']")
	private WebElement dropdown_years;
	
	
	
	public Enteraccinfopage Enteraccinfo(Hashtable<String, String>ht) throws IOException {
	
			
			commonmethods.verfiynewuser(accinfo, ht.get("Acc_Info"));

			commonmethods.clickonelement(gender_male, "male radio btn");

			commonmethods.enterinput(password, pr.getProperty("password"), "user enter the password");

			commonmethods.selectByVisibleText(dropdown_dys,ht.get("DOB_Days")) ;

			commonmethods.selectByIndex(dropdown_months, ht.get("DOB_Months") );

			commonmethods.value(dropdown_years,ht.get("DOB_Years") );
			
			return this;
	}
	
	public Homepage enterAdress(Hashtable<String, String>ht) throws IOException {
		
		
		return new Homepage();
	}
	
	
	
	
	
	
}
