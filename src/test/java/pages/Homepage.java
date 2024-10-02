package pages;

import java.util.Hashtable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Basetest;
import com.utlity.commonmethods;

public class Homepage  extends Basetest{

	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
    
	
	@FindBy(xpath="//*[text()=' Signup / Login']")
	private static  WebElement sighupbtn;
	
	public Homepage verfiytitle(Hashtable<String, String>ht) {
		commonmethods.verfiypagetitle(ht.get("Page_Title"));
		return this;
	}
	
	public SighinupPage navigtetosighinupge() {
		sighupbtn.click();
		
		return new SighinupPage();
	}
	
	public void navigatetocontacuspage(){
		
	}
	
	
	
	
}