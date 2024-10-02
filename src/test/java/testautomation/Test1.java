package testautomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	
@Test
	
	
	public void setup() {
		
		ChromeDriver driver= new ChromeDriver();
		
		
	
		driver.get("https://www.facebook.com/login/");
		
		
	}

}


