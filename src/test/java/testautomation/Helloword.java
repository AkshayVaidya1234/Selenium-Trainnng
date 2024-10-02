package testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Helloword {
	
	
	@Test
	
	public void setup() {
		WebDriver driver= new EdgeDriver();
		driver.get("https://mvnrepository.com/artifact/org.testng/testng/6.14.3"
				);
		driver.manage().window().maximize();
	}

}
