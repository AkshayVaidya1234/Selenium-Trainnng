package pages;

import java.io.IOException;
import java.util.Hashtable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Basetest;
import com.utlity.commonmethods;

public class SighinupPage  extends Basetest{

	
	public SighinupPage() {
		PageFactory.initElements(driver, this);
	}
    
	@FindBy(xpath="//h2[text()='New User Signup!']")
	private static WebElement visible_text;
	
	@FindBy(xpath="//*[@name='name']")
	private static WebElement name;
	
	@FindBy(xpath="//input[@data-qa='signup-email']")
	private static WebElement email;
	
	@FindBy(xpath="//button[text()='Signup']")
	private static WebElement btn;
	
	public void verfiytitle() {
		commonmethods.verfiypagetitle("");
	}
	
	public Enteraccinfopage newuser(Hashtable<String, String>ht) throws IOException {
		commonmethods.verfiytext(visible_text, ht.get("Page_Text"));

		commonmethods.enterinput(name, ht.get("First_Name"), "user entred msg");

		commonmethods.enterinput(email, ht.get("Email_adress"), "user entred msg");

		commonmethods.entersighnupbtn(btn);
		
		return  new Enteraccinfopage();
	}
	
	
		
		
		
	}
	
	
	
	
